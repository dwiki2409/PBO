public class DemoKendaraan {
    public static void main(String[] args) {
        Mobil avanza = new Mobil("Avanza", 80, 7, "bensin", "RON 95");
        Motor honda = new Motor("Honda Vario", 60, 2, "bensin", "RON 92");
        Kapal titanic = new Kapal("Titanic", 25, 3000, "solar");

        avanza.maju();
        avanza.isiBahanBakar(50);
        avanza.parkir();
        System.out.println("=======================================");
        honda.maju();
        honda.isiBahanBakar(10);
        honda.parkir();
        System.out.println("=======================================");
        titanic.maju();
        titanic.isiBahanBakar(100000);
        titanic.berlabuh();
    }
}
