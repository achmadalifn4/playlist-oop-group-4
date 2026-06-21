// Class Member mewarisi class User
public class Member extends User {

    // Constructor Member memanggil constructor dari parent class User
    public Member(String nama) {
        super(nama);
    }

    // Polymorphism: method tampilkanAkses() dibuat berbeda khusus Member
    @Override
    public void tampilkanAkses() {
        System.out.println("Member dapat melihat daftar lagu dan mencari lagu berdasarkan judul.");
    }

    // Method untuk melihat daftar lagu
    public void lihatDaftarLagu(Lagu[] listLagu, int jumlahLagu) {
        if (jumlahLagu == 0) {
        System.out.println("Belum ada lagu dalam playlist.");
        return;
        }

        System.out.println("Daftar Lagu:");
        for (int i = 0; i < jumlahLagu; i++) {
        System.out.println("\nLagu ke-" + (i + 1));
        listLagu[i].tampilkanInfo();
        }
    }

    // Method untuk mencari lagu berdasarkan judul
    public void cariLagu(Lagu[] listLagu, int jumlahLagu, String judulCari) {
        boolean ditemukan = false;

        for (int i = 0; i < jumlahLagu; i++) {
        if (listLagu[i].getJudul().equalsIgnoreCase(judulCari)) {
            System.out.println("Lagu ditemukan:");
            listLagu[i].tampilkanInfo();
            ditemukan = true;
            break;
        }
        }

        if (!ditemukan) {
        System.out.println("Lagu dengan judul \"" + judulCari + "\" tidak ditemukan.");
        }
    }
}