package general;

public class ForLoop {

    public static void main(String[] args) {
        /*
        *
        *  for (statement1; <condition>; statement2) {
        *    do it;
        *    do it;
        *    do it;
        *  }
        *
        **/

        for (int i = 0; i < 10; i++) {
            System.out.println("Sayi - " + i);
        }

        int i = 0;
        while (i < 10) {
            System.out.println("Sayi - " + i);
            i++;
        }

    }
}
