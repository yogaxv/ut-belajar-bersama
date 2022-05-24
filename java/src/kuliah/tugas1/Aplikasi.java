package kuliah.tugas1;

public class Aplikasi {
    public static void main(String[] args)
    {
        Tanaman[] kebunSayur = new Tanaman[4];
        kebunSayur[0] = new Tanaman("Kol", "sayur");
        kebunSayur[1] = new Tanaman("Terong", "sayur");
        kebunSayur[2] = new Tanaman("Sawi", "sayur");
        kebunSayur[3] = new Tanaman("Cabe", "sayur");

        Tanaman[] kebunBuah = new Tanaman[3];
        kebunBuah[0] = new Tanaman("Lengkeng", "buah");
        kebunBuah[1] = new Tanaman("Mangga", "buah");
        kebunBuah[2] = new Tanaman("rambutan", "buah");

        System.out.println("Kebun sayur berisi :");
        for (int i = 0; i < kebunSayur.length; i++) {
            kebunSayur[i].cetakNama();
        }

        System.out.println("kebun buah berisi :");
        for (int i = 0; i < kebunBuah.length; i++) {
            kebunBuah[i].cetakNama();
        }

    }
}


