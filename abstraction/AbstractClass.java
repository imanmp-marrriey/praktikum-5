package abstraction;

abstract class Kendaraan {
    // method abstract (tidak ada isi)
    public abstract void bergerak();

    // method konkrit (ada isi)
    public void info() {
        System.out.println("Ini adalah kendaraan");
    }
}

class Mobil extends Kendaraan {
    @Override
    public void bergerak() {
        System.out.println("Mobil berjalan di jalan raya");
    }
}

class Pesawat extends Kendaraan {
    @Override
    public void bergerak() {
        System.out.println("Pesawat terbang di udara");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        Kendaraan pesawat = new Pesawat();

        mobil.info();
        mobil.bergerak();

        pesawat.info();
        pesawat.bergerak();
    }
}
