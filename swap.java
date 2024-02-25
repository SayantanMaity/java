public class swap {
    // main function

    public static void main(String[] args) {
        int x = 100, y = 200;
        // before swaping

        System.out.println("before swaping");
        System.out.println("x =" + x);
        System.out.println("y =" + y);

        // swap using three variables

        int temp = x;
        x = y;
        y = temp;

        System.out.println("after swaping");
        System.out.println("x =" + x);
        System.out.println("y =" + y);
    }

}