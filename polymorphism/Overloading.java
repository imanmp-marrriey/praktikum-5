class Matematika {
    // method penjumlahan dengan 2 parameter
    public int tambah(int a, int b) {
        return a + b;
    }

    // method penjumlahan dengan 3 parameter
    public int tambah(int a, int b, int c) {
        return a + b + c;
    }

    // method penjumlahan dengan tipe data berbeda
    public double tambah(double a, double b) {
        return a + b;
    }
}

public class Overloading {
    public static void main(String[] args) {
        Matematika m = new Matematika();
        System.out.println("Tambah 2 angka: " + m.tambah(5, 10));
        System.out.println("Tambah 3 angka: " + m.tambah(5, 10, 15));
        System.out.println("Tambah desimal: " + m.tambah(5.5, 2.3));
    }
}
