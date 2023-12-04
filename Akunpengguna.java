class AkunPengguna {
    private String username;
    private String password;
    private boolean aktif;

    public AkunPengguna(String username, String password) {
        this.username = username;
        this.password = password;
        this.aktif = true;
    }

    public void tampilkanInformasi() {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Status: " + (aktif ? "Aktif" : "Nonaktif"));
    }

    public void aktifkanAkun() {
        aktif = true;
        System.out.println("Akun berhasil diaktifkan.");
    }

    public void nonaktifkanAkun() {
        aktif = false;
        System.out.println("Akun berhasil dinonaktifkan.");
    }
}

public class UserAccountManager {
    public static void main(String[] args) {
        AkunPengguna akun1 = new AkunPengguna("dzakymuhamad", "ganas09");

        System.out.println("Informasi akun sebelum dinonaktifkan:");
        akun1.tampilkanInformasi();

        akun1.nonaktifkanAkun();

        System.out.println("\nInformasi akun setelah dinonaktifkan:");
        akun1.tampilkanInformasi();

        akun1.aktifkanAkun();

        System.out.println("\nInformasi akun setelah diaktifkan:");
        akun1.tampilkanInformasi();
    }
}
