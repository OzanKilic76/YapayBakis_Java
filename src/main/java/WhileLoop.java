public class WhileLoop {

    public static void main(String[] args) {
         /*
         *
         *  boolean := <condition>;
         *  while (<condition>) {
         *     do it;
         *     do it;
         *     do it;
         *     if () continue;
         *  }
         */

        int i = 0;
        while (i < 10) {
            System.out.println("sayi - " + i);
            i++; // inkrement
        }
        //-- buradan devam ediyor

        i = 0;
        while (true) {
            System.out.println("sayi - "  + i);
            i++; // inkrement
            if (i == 10)  break;
        }

        //-- i++, ++i
        i = 0;
        while (++i < 10) {
            System.out.println("sayi - " +  i);
        }


    }
}
