package kuliah.diskusi3;

public class Array {
    public static void main(String[] args)
    {
        char[] abjad1 = new char[5];
        abjad1[0] = 'a';
        abjad1[1] = 'e';
        abjad1[2] = 'o';
        abjad1[3] = 'u';
        abjad1[4] = 'i';

        char[] abjad2 = { 'a', 'i', 'u', 'e', 'o' };
// foreach
//        for (char huruf: abjad1 ) {
//            System.out.print(huruf);
//        }
//

//        for (int i = 0; i < abjad2.length; i++) {
//            System.out.println(abjad2[i]);
//        }

        for (int i = 0; i < 10; i+=2) {
            System.out.println(i);
        }

        // i++ ( bilangan di tambah dengan 1)  i selanjut = 2;
        // i = i+1 ( bilangan di tambah dengan 1)  i selanjut = 1;
        // i += 1

        int i = 5;
        while (i < 10){
            System.out.println(i);
            i++;
        }
    }
}
