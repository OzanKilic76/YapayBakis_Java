package general;

public class ForEachLoop {

    public static void main(String[] args) {
        String[] listOfLanguage = {"Java", "Python", "C++", "C", "Ada"};

        for (int i=0; i < listOfLanguage.length; i++) {
            System.out.println(listOfLanguage[i]);
        }

        //-- for each
        for (String text: listOfLanguage) {
            System.out.println(text);
        }


    }
}
