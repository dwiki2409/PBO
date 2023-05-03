public abstract class Kendaraan {
    protected String nama;
    protected int kecepatan;
    protected int kapasitas;
    protected String bahanBakar;

    public Kendaraan(String nama, int kecepatan, int kapasitas, String bahanBakar) {
        this.nama = nama;
        this.kecepatan = kecepatan;
        this.kapasitas = kapasitas;
        this.bahanBakar = bahanBakar;
    }

    public abstract void maju();
    
    public void mundur() {
        System.out.println(this.nama + " mundur.");
    }

    public void isiBahanBakar(int liter) {
        System.out.println("Isi bahan bakar " + this.nama + " sebanyak " + liter + " liter " + this.bahanBakar + ".");
    }
}
