package abstraction;

// Definisi interface
interface Hewan {
    void bergerak();   // method abstrak
    void bersuara();   // method abstrak
}

// Kelas Kucing mengimplementasikan interface Hewan
class Kucing implements Hewan {
    @Override
    public void bergerak() {
        System.out.println("Kucing berjalan dengan empat kaki");
    }

    @Override
    public void bersuara() {
        System.out.println("Kucing mengeong: Meong!");
    }
}

// Kelas Burung mengimplementasikan interface Hewan
class Burung implements Hewan {
    @Override
    public void bergerak() {
        System.out.println("Burung terbang dengan sayap");
    }

    @Override
    public void bersuara() {
        System.out.println("Burung berkicau: Cuit-cuit!");
    }
}

// Main class
public class InterfaceDemo {
    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        Hewan burung = new Burung();

        kucing.bergerak();
        kucing.bersuara();

        burung.bergerak();
        burung.bersuara();
    }
}
