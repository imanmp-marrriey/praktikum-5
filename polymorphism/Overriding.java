class Hewan {
    public void suara() {
        System.out.println("Hewan mengeluarkan suara");
    }
}

class Kucing extends Hewan {
    @Override
    public void suara() {
        System.out.println("Kucing mengeong");
    }
}

class Anjing extends Hewan {
    @Override
    public void suara() {
        System.out.println("Anjing menggonggong");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Hewan h1 = new Kucing();
        Hewan h2 = new Anjing();

        h1.suara();
        h2.suara();
    }
}
