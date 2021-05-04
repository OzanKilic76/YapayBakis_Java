package general;

public class MathOperators {

    public static void main(String[] args) {

        int x;
        int y;
        int result;
        double z;

        //-- max
        x = 3; y= 4;
        result = Math.max(x, y);
        System.out.println("Math.max(x, y) = " + result);

        //-- min
        x = 3; y= 4;
        result = Math.min(x, y);
        System.out.println("Math.min(x, y) = " + result);

        //-- sqrt
        x = 3; y= 4;
        z = Math.sqrt(64);
        System.out.println("Math.sqrt(64) = " + z);

        //-- abs
        z = Math.abs(-4.7);
        System.out.println("Math.abs(-4.7) = " + z);

        // random
        z = Math.random();
        System.out.println("Math.random() = " + z);

        result = (int) (Math.random() * 101); //  0 - 100
        System.out.println("(int) (Math.random() * 101) = " + result);

    }
}
