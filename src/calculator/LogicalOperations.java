package calculator;

public class LogicalOperations {
    // public static int minMax(int a, int b, int c){
    //nu stiu ce formula sa aplic aici
    // }
    public String vote(int x){
        if (x<=17){
            return "Nu poti vota dom'le\n" +
                    "Are drept de vot?FALS";
        }else{
            return "Dute la vot\n" +
                    "Are drept de vot?ADEVARAT";

        }
    }
    public int trioMax(int x,int y, int z) {
        if (x > y && x > z) {
            return x;
        } else if (y > x && y > z) {
            return y;
        } else if (z > x && z > y) {
            return z;
        } else {
            return 0;
        }
    }
    public int getMax(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }
    public String crescator(int a,int b){
        if (a>b){
            return b+" si "+a;
        }else if (b>a){
            return a+" si "+b;
        }else{
            return """
                 +”””””+\s
                [| o o |]
                 |  ^  |\s
                 | '_' |\s
                 +_____+""" ;
        }
    }
    public int quadMax(int a, int b, int c, int d){
        if (a>b && a>c && a>d){
            return a;
        }else if (b>a && b>c && b>d){
            return b;
        }else if (c>a && c>b && c>d){
            return c;
        }else if (d>a&&d>b&&d>c){
            return d;
        }else{
            return -1;
        }
    }
    public String verifyText(String text,String text1) {
        if (text.equals(text1)){
            return "Sunt la fel";
        } else if ( !text.equals(text1)){
            return "Nu sunt la fel";
        }else{
            return "";
        }
    }
    public String verifyTextAndNumber(String text, int number) {
        if (text.equals("FastTrack") && number <= 3) {
            return text + number;
        } else if (!text.equals("FastTrack") && number >= 4) {
            return number + text;
        } else {
            return """
                 +”””””+\s
                [| o o |]
                 |  ^  |\s
                 | '_' |\s
                 +_____+""";
        }
    }
    public String greater(int nr){
        if (nr>3 && !(nr == 4))
        {
            return "The number is greater then 3 and not equal to 4";
        }else if (nr>3) {
            return "The number is lower then 3";
        }else if (nr == 4){
            return "The number is equal to 4";
        }else{
            return "nothing";
        }
    }
    public static String calificativ(int i){
        if (i >=100){
            return "Foarte bine ";
        }else if (i >=75){
            return "Bine";
        }else if (i>=50){
            return "Suficient";
        }else{
            return "Insuficient";
        }
    }
}
