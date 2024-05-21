public class reverse_int {

    public static void main(String[] args) {
        int n = 234;
        int reverse = 0, extract;
        while(n<0)
        {
            extract = n % 10;
            reverse = reverse * 10 + extract;
            n = n/10;
        }

        System.out.println(reverse);
    }
}
