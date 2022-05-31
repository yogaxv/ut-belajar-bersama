package kuliah.diskusi4;

import java.util.Scanner;

public class Queue {

    private int indexDepan;

    private int indexBelakang;
    private final int ukuran;

    private final String[] antrian;
    private int jumlahAntrianAktif;

    public Queue(int size)
    {
        ukuran = size;
        antrian = new String[ukuran];
        indexDepan = 0;
        indexBelakang = -1;
        jumlahAntrianAktif = 0;
    }

    public boolean isEmpty()
    {
        return (jumlahAntrianAktif == 0);
    }

    public boolean isFull()
    {
        return (jumlahAntrianAktif == ukuran);
    }

    public void enqueue(String antrianbaru)
    {
        if(indexBelakang == ukuran - 1)
            indexBelakang = -1;

        antrian[++indexBelakang] = antrianbaru;

        jumlahAntrianAktif++;
    }

    public String dequeue()
    {
        String temporari = antrian[indexDepan++];

        if(indexDepan == ukuran)
            indexDepan = 0;

        jumlahAntrianAktif--;

        return temporari;
    }

    public void cetakAntrian()
    {
        System.out.println( antrian[jumlahAntrianAktif-1]+ " memasuki antrian dengan urutan : " + jumlahAntrianAktif);
    }

    public void cekJumlahAntrian()
    {
        System.out.println("jumlah antrian aktif : "+jumlahAntrianAktif);
    }
}

