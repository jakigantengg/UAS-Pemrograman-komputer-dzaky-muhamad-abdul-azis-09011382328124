public class Library {
    class Buku {
        private String judul;
        private String penulis;
        private int tahunTerbit;
        private boolean dipinjam;
    
        public Buku(String judul, String penulis, int tahunTerbit) {
            this.judul = judul;
            this.penulis = penulis;
            this.tahunTerbit = tahunTerbit;
            this.dipinjam = false;
        }
    
        public void tampilkanInformasi() {
            System.out.println("Judul: " + judul);
            System.out.println("Penulis: " + penulis);
            System.out.println("Tahun Terbit: " + tahunTerbit);
            System.out.println("Status: " + (dipinjam ? "Dipinjam" : "Tersedia"));
        }
    
        public void pinjamBuku() {
            if (!dipinjam) {
                dipinjam = true;
                System.out.println("Buku berhasil dipinjam.");
            } else {
                System.out.println("Buku sedang dipinjam oleh orang lain.");
            }
        }
    }
    
    public class Library {
        public static void main(String[] args) {
            Buku buku1 = new Buku("Bumi", "Tere Liye", 2014);
    
            System.out.println("Informasi buku sebelum dipinjam:");
            buku1.tampilkanInformasi();
    
            buku1.pinjamBuku();
    
            System.out.println("\nInformasi buku setelah dipinjam:");
            buku1.tampilkanInformasi();
        }
    } 
}
