public class SwitchStatement {

    public static void main(String[] args) {
        /*
        *  switch (<Variable>) {
        *      case ?:
        *        do it;
        *      case ?:
        *        do it 2;
        *      case ?:
        *        do it 3;
        *      default:
        *        do something else...
        *  }
        *  byte , short , char , and int
        **/

        int x = 0;
        switch (x) {
            case 0:
                System.out.println("Hello 0");
            case 1:
                System.out.println("Hello 1");
            case 2:
                System.out.println("Hello 2");
                System.out.println("Hello 2");
                System.out.println("Hello 2");
                break;
            case 3:
                System.out.println("Hello 3");
            default:
                System.out.println("Hello 4");
        }

        char y = '2';
        switch (y) {
            case '0':
                System.out.println("Hello 0");
            case '1':
                System.out.println("Hello 1");
            case '2':
                System.out.println("Hello 2");
                System.out.println("Hello 2");
                System.out.println("Hello 2");
                break;
            case '3':
                System.out.println("Hello 3");
            default:
                System.out.println("Hello 4");
        }

    }
}
