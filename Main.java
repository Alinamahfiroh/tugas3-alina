package tugas3;

public class Main {
    public static void main(String[] args) {
        Biodata Ucup = new Biodata("ucup", 100.0, "pedang", 15.0, "baju besi", 10.0);
        Biodata Otong = new Biodata("otong", 50.0, "ketapel", 1.0, "kaos", 0.0);

        Ucup.setNama();
        Otong.setNama();
    }
}
