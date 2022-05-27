package kuliah.diskusi4;

public class Stack {

    private int urutanPalingAtas;
    private int ukuranArray;
    private final int[] temporariArray;
    public Stack (int ukuran) {
        ukuranArray = ukuran;
        temporariArray = new int[ukuranArray];
        urutanPalingAtas = -1;
    }

    public void push(int e)
    {
        temporariArray[++urutanPalingAtas] = e;
    }

    public int pop()
    {
        return temporariArray[urutanPalingAtas--];
    }

    public boolean isEmpty()
    {
        return (urutanPalingAtas == -1);
    }

}
