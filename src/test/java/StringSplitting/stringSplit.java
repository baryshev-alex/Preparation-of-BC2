package StringSplitting;

public class stringSplit {

    public static void main (String args[]){
        String strMain = "Hello World!";
        String[] arrSplit = strMain.split("");
        stringSplitting(arrSplit);
    }

    static String[] stringSplitting(String[] arrSplit){
        for (int i = 0; i < arrSplit.length; i++) {
            System.out.println(arrSplit[i]);
        }
        return arrSplit;
    }
}