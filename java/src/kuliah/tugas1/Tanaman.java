package kuliah.tugas1;

public class Tanaman {
    String namaTanaman;
    String jenisTanaman;

    public  Tanaman(String nama, String jenis) {
        namaTanaman = nama;
        jenisTanaman = jenis;
    }

    public void cetakNama () {
        System.out.println(namaTanaman);
    }

    public void cetakJenis () {
        System.out.println(jenisTanaman);
    }

    public void cetakLengkap () {
        System.out.println(namaTanaman + " adalah " + jenisTanaman);
    }
}