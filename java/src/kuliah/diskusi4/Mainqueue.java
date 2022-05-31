package kuliah.diskusi4;

public class Mainqueue {
    // []  --> 9
    // []  --> 8
    // []  --> 7
    // []  --> 6
    // []  --> 5
    // [inda]  --> 4
    // [nindi]  --> 3
    // [akhi]  --> 2
    // [megumi]  --> 1
    // [johny]  --> 0
    public static void main(String[] args) {
        Queue antrian = new Queue(10);

        System.out.println("apakah antrian kosong " +antrian.isEmpty());

        System.out.println("tambahkan antrian :");

        antrian.enqueue("johny");
        antrian.cetakAntrian();

        antrian.enqueue("megumi");
        antrian.cetakAntrian();

        antrian.enqueue("akhi");
        antrian.cetakAntrian();

        antrian.enqueue("nindi");
        antrian.cetakAntrian();

        antrian.enqueue("inda");
        antrian.cetakAntrian();

        System.out.println("apakah antrian kosong " +antrian.isEmpty());

        System.out.println(antrian.dequeue());
        System.out.println(antrian.dequeue());
        System.out.println(antrian.dequeue());
        System.out.println(antrian.dequeue());

        antrian.cekJumlahAntrian();
    }
}
