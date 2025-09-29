public class FivePerLine {
    public static void main(String[] args) {
        int a = 1000;
        int b   = 2000;
        int count = 5;
        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
            if ((i + 1) % count == 0) System.out.println();
        }
    }
}
