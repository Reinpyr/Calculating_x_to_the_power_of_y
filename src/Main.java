public class Main {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        int result = 1;

        while (y > 0)
        {
            if (y % 2 == 0)
            {
                y = y / 2;
                x = x * x;
            }
            else
            {
                y = y - 1;
                result = result * x;
            }
        }
        System.out.println(result);
    }
}