package general;

public class JavaVariables {

    public static void main(String[] args) {
        // Integer
        byte myByte = 10;       // –2^7 bis 2^7 – 1 (–128 … 127)
        short myShort = 20;     // –2^15 bis 2^15 – 1 (–32.768 … 32.767)
        int myInt = 30;         // –2^31 bis 2^31 – 1 (–2.147.483.648 … 2.147.483.647)
        int myLong = 40;        // –2^63 bis 2^63 – 1 (–9.223.372.036.854.775.808 … 9.223.372.036.854.775.807)

        float myFloat = 50.5f;     //  1,40239846E–45f … 3,40282347E+38f
        double myDouble = 500.5d;   //  4,94065645841246544E–324 … 1,79769131486231570E+308

        //
        boolean myBoolean = true; // 1 bit (0/1)
        char myChar = 'c';       //

        //-- Cast-1: byte -> short -> char -> int -> long -> float -> double
        // myInt = myByte;

        //-- Cast-2:  double -> float -> long -> int -> char -> short -> byte
        myInt = 130;

        //-- int to double
        myDouble = myInt;

        // float to int
        myInt = (int) myFloat;

        System.out.println("myByte=" + myByte);
        System.out.println("myShort=" + myShort);
        System.out.println("myInt=" + myInt);
        System.out.println("myLong=" + myLong);
        System.out.println("myFloat=" + myFloat);
        System.out.println("myDouble=" + myDouble);

        System.out.println("myBoolean=" + myBoolean);
        System.out.println("myChar=" + myChar);

    }
}
