package general;

public class IF_Statement {

    public static void main(String[] args) {
        /*
        *  boolean := <statement>
        *  if (<statement>) {
        *     do it!
        *     do it!
        *  } else if (<statement2>) {
        *     do it2 !
        *     do it2 !
        *  } else {
        *     do it3 !
        *     do it3 !
        *  }
        *
        * */

        int number = 24;
        boolean bolTest = false;
        int i = 0;
        if (number < 0) {
            System.out.println("if is true");
        } else if (number % 2 == 0 || i++ == -1) {
            System.out.println("else if is true");
        } else {
            System.out.println("else is true");
        }
        //-- i = ?

        String result;

        result = (number % 2 == 0) ? "CIft" : "Tek";

        if (number % 2 == 0) {
            result = "cift";
        } else {
            result = "tek";
        }

        //-- Variant 2
        int n1 = 2, n2 = 4, n3 = -4;
        int largest = (n1 >= n2) ? ((n1 >= n3) ? n1 : n3) : ((n2 >= n3) ? n2 : n3);

        if (n1 >= n2) {
            if  (n1 >= n3)  largest = n1;
            else largest = n3;
        } else {
            if  (n2 >= n3) {
                largest = n2;
            } else {
                largest = n3;
            }
        }
    }
}
