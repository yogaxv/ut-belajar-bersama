package kuliah.diskusi3;

import java.util.ArrayList;
import java.util.List;

public class Application
{
    public static void main(String[] args)
    {
        // ApplicationSatu = camelcase
        // aplication_satu = snakecase
        // void = tidak mengembalikan nilai apapun
        // mainsatudua = name method
        // String[] = tipe data
        // args = argumen atau parameter

        cetak();

        byte nomorByte = 127;
        short nomorShort = 1000;
        int nomorInt = 1000000000;
        long nomorLong = 1000000000;

        char hurufChar = 'o';
        String kataString = "saya sedang belajar java";

        boolean bool = true;

        double megumiDouble = 4.43;
        float typeFload = 4.43f;

        byte contoh;
        contoh = 4;

        // array
        // []
        byte[] arrayByte = new byte[5];

        // [ 1, 2 , 3, 4, 5 }
        arrayByte[0] = 1;
        arrayByte[1] = 2;
        arrayByte[2] = 3;
        arrayByte[3] = 4;
        arrayByte[4] = 5;

        byte[] arrayByte2 = {1 ,2, 3, 4, 5 };

        // ArrayList
        List<Integer> arraySatu = new ArrayList<Integer>();
        arraySatu.add(1);
        arraySatu.add(3);
        arraySatu.add(3);
        arraySatu.add(3);
        arraySatu.add(3);
        arraySatu.add(3);

        int a = 1;
        int b = 2;

//        int c  = tambah(1, 2);

        boolean c = cekKebenaran(5, 6);
        System.out.println(c);

    }

    private static int tambah(int kiri, int kanan) {
        // -
        // *
        //  /
        // ++ ( bilangan tersebut ditambahkan dengan 1)
        // -- ( bilangan tersebut dikurangin dengan 1 )
        return kiri++;
    }

    private static boolean cekKebenaran(int kiri, int kanan)
    {
        // ==
        // !=
        // >
        // >=
        // <
        // <=
        return (kiri != kanan);
    }


    public static void cetak() {
        System.out.println("Cetak saja");
    }
}

