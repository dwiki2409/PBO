public class Mobil extends Kendaraan {
    protected String jenisBahanBakar;

    public Mobil(String nama, int kecepatan, int kapasitas, String bahanBakar, String jenisBahanBakar) {
        super(nama, kecepatan, kapasitas, bahanBakar);
        this.jenisBahanBakar = jenisBahanBakar;
    }

    public void maju() {
        System.out.println(this.nama + " maju dengan kecepatan " + this.kecepatan + " km/h.");
    }

    public void parkir() {
        System.out.println(this.nama + " parkir.");
    }
}
