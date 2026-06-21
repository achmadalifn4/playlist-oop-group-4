// Class Admin mewarisi class User
public class Admin extends User {

  // Constructor Admin memanggil constructor dari parent class User
  public Admin(String nama) {
    super(nama);
  }

  // Polymorphism: method tampilkanAkses() dibuat berbeda khusus Admin
  @Override
  public void tampilkanAkses() {
    System.out.println("Admin dapat menambahkan lagu baru dan melihat daftar lagu.");
  }

  // Method untuk menambahkan lagu baru ke dalam array playlist
  public int tambahLagu(Lagu[] listLagu, int jumlahLagu, String judul, String artis, double durasi) {
    if (jumlahLagu >= listLagu.length) {
      System.out.println("Playlist sudah penuh.");
      return jumlahLagu;
    }

    listLagu[jumlahLagu] = new Lagu(judul, artis, durasi);
    jumlahLagu++;

    System.out.println("Lagu berhasil ditambahkan oleh Admin.");
    return jumlahLagu;
  }

  // Method untuk melihat daftar lagu yang tersimpan
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
}