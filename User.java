// Class User sebagai parent class untuk Admin dan Member
public class User {
  protected String nama;

  // Constructor untuk mengisi nama user
  public User(String nama) {
    this.nama = nama;
  }

  // Method ini akan dioverride oleh class Admin dan Member
  public void tampilkanAkses() {
    System.out.println("User memiliki akses umum pada playlist.");
  }

  // Getter untuk mengambil nama user
  public String getNama() {
    return nama;
  }

  // Setter untuk mengubah nama user
  public void setNama(String nama) {
    this.nama = nama;
  }
}