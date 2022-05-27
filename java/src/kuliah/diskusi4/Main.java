package kuliah.diskusi4;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int ukuran;
        int nilai;

        Scanner in = new Scanner(System.in);

        System.out.println("Berapa ukuran stack?");
        ukuran = in.nextInt();

        Stack variable_stack = new Stack(ukuran);

        for (int i = 0; i < ukuran; i++)
        {
            System.out.println("Masukkan nilai: ");
            nilai = in.nextInt();
            variable_stack.push(nilai);
        }

        while (!variable_stack.isEmpty())
        {
            int nilaiTerakhir = variable_stack.pop();
            System.out.println(nilaiTerakhir);
        }
    }
}

