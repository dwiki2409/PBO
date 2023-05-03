public class Kapal extends Kendaraan {

    public Kapal(String nama, int kecepatan, int kapasitas, String bahanBakar) {
        super(nama, kecepatan, kapasitas, bahanBakar);
    
    }

    public void maju() {
        System.out.println(this.nama + " berlayar dengan kecepatan " + this.kecepatan + " knot.");
    }

    public void berlabuh() {
        System.out.println(this.nama + " berlabuh di pelabuhan.");
    }
}