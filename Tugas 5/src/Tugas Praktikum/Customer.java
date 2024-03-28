class Customer {
    private String nomorPelanggan;
    private String nama;
    private String jenisAkun;
    private double balance;
    private int masukanPin;
    private boolean terblokir;

    public Customer(String nomorPelanggan, String nama, String jenisAkun, double balance) {
        this.nomorPelanggan = nomorPelanggan;
        this.nama = nama;
        this.jenisAkun = jenisAkun;
        this.balance = balance;
        this.masukanPin = 0;
        this.terblokir = false;
    }

    public String getNama() {
        return nama;
    }

    public boolean autentikasi(String pin) {
        if (terblokir) {
            System.out.println("Akun Anda telah diblokir.");
            return false;
        }
        if (checkPin(pin)) {
            masukanPin = 0;
            return true;
        } else {
            masukanPin++;
            if (masukanPin >= 3) {
                blockAccount();
            }
            System.out.println("Autentikasi gagal. Silakan coba lagi.");
            return false;
        }
    }

    private boolean checkPin(String pin) {
        return pin.equals(nomorPelanggan.substring(nomorPelanggan.length() - 4));
    }

    private void blockAccount() {
        terblokir = true;
        System.out.println("Akun Anda telah diblokir karena 3x kesalahan autentikasi.");
    }

    public boolean makePurchase(double amount) {
        if (terblokir) {
            System.out.println("Akun Anda telah diblokir.");
            return false;
        }
        if (balance >= amount) {
            balance -= amount;
            applyCashback(amount);
            System.out.println("Transaksi berhasil. Saldo Anda saat ini: " + balance);
            return true;
        } else {
            System.out.println("Saldo tidak mencukupi untuk melakukan transaksi.");
            return false;
        }
    }

    public void topUp(double amount) {
        if (terblokir) {
            System.out.println("Akun Anda telah diblokir.");
        } else {
            balance += amount;
            System.out.println("Top up berhasil. Saldo Anda saat ini: " + balance);
        }
    }

    private void applyCashback(double amount) {
        double cashbackRate = 0.0;
        if (amount > 1000000) {
            if (jenisAkun.startsWith("38")) {
                cashbackRate = 0.05;
            } else if (jenisAkun.startsWith("56")) {
                cashbackRate = 0.07;
            } else if (jenisAkun.startsWith("74")) {
                cashbackRate = 0.10;
            }
        } else {
            if (jenisAkun.startsWith("56")) {
                cashbackRate = 0.02;
            } else if (jenisAkun.startsWith("74")) {
                cashbackRate = 0.05;
            }
        }
        double cashbackAmount = amount * cashbackRate;
        balance += cashbackAmount;
        System.out.println("Cashback diterapkan: " + cashbackAmount);
    }

    public double getBalance() {
        return balance;
    }

    public String getnomorPelanggan() {
        return nomorPelanggan;
    }
}
