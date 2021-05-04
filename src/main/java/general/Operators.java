package general;

public class Operators {

    public static void main(String[] args) {
        //-- Arithmetic Operators
        //-- +,-, /, *, %,
        int myOp1;

        myOp1 = 5 + 4;
        System.out.println("myOp1 = 5 + 4; --> " + myOp1);

        myOp1 = 5 - 4;
        System.out.println("myOp1 = 5 - 4; --> " + myOp1);

        myOp1 = 5 * 4;
        System.out.println("myOp1 = 5 * 4; --> " + myOp1);

        myOp1 = 12 / 5;
        System.out.println("myOp1 = 12 / 4; --> " + myOp1);

        myOp1 = 12 % 5;
        System.out.println("myOp1 = 12 % 4; --> " + myOp1);

        myOp1++; // myOp1 = myOp1 + 1;
        System.out.println("myOp1++; --> " + myOp1);
        myOp1--; // myOp1 = myOp1 - 1;
        System.out.println("myOp1--; --> " + myOp1);

        //-- Assignment
        myOp1 = 3;

        //-- Assignment Operators
        myOp1 += 3; //myOp1 = myOp1 + 3;
        System.out.println("myOp1 += 3; --> " + myOp1);

        myOp1 -= 3; //myOp1 = myOp1 - 3;
        System.out.println("myOp1 -= 3; --> " + myOp1);

        myOp1 *= 3; //myOp1 = myOp1 * 3;
        System.out.println("myOp1 *= 3; --> " + myOp1);

        myOp1 /= 3; //myOp1 = myOp1 / 3;
        System.out.println("myOp1 /= 3; --> " + myOp1);

        myOp1 %= 3; //myOp1 = myOp1 % 3;
        System.out.println("myOp1 %= 3; --> " + myOp1);

        /* BITWISE AND
        *  101  --> 5
        *  011  --> 3
        * ------------
        *  001  --> 1
        * */
        myOp1 = 5;
        myOp1 &= 3; // myOp1 = myOp1 & 3;
        System.out.println("myOp1 &= 3; --> " + myOp1);

        /* BITWISE OR
         *  101  --> 5
         *  011  --> 3
         * ------------
         *  111  --> 7
         * */
        myOp1 = 5;
        myOp1 |= 3; // myOp1 = myOp1 | 3;
        System.out.println("myOp1 |= 3; --> " + myOp1);

        /* BITWISE XOR
         *  101  --> 5
         *  011  --> 3
         * ------------
         *  110  --> 6
         * */
        myOp1 = 5;
        myOp1 ^= 3; // myOp1 = myOp1 ^ 3;
        System.out.println("myOp1 ^= 3; --> " + myOp1);

        //-- Logical Operators
        // &&, ||, !
        boolean bolResult;
        bolResult = (myOp1 < 5) && (myOp1 % 2 == 0);
        System.out.println("(myOp1 < 5) && (myOp1 % 2 == 0) --> " + bolResult);

        bolResult = (myOp1 < 5) || (myOp1 % 2 == 0);
        System.out.println("(myOp1 < 5) && (myOp1 % 2 == 0) --> " + bolResult);

        bolResult = !bolResult;
        System.out.println("!bolResult --> " + bolResult);

        //-- Boolean: TRUE/FALSE, 1/0, YES/NO....
        boolean isJavaDifficult = true;
        isJavaDifficult = !isJavaDifficult;
        System.out.println(isJavaDifficult);

        //-- Comparison Operations
        bolResult = false;

        //-- '=='
        int x = 3;
        int y = 4;
        bolResult = (x == y);
        System.out.println("(x == y) -> " + bolResult);

        //-- '!='
        bolResult = (x != y);
        System.out.println("(x != y) -> " + bolResult);

        //-- '<' or <=
        bolResult = (x < y);
        System.out.println("(x < y) -> " + bolResult);
        bolResult = (x <= y);
        System.out.println("(x <= y) -> " + bolResult);

        //-- '>' or >=
        bolResult = (x > y);
        System.out.println("(x > y) -> " + bolResult);
        bolResult = (x >= y);
        System.out.println("(x >= y) -> " + bolResult);

    }
}
