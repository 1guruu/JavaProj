package calculator;

public class LogicalOperations {
    // public static int minMax(int a, int b, int c){
    //nu stiu ce formula sa aplic aici
    // }
    public void countBackwords(int biggest, int smallest){
        for (int i=biggest;i>=smallest;i++){
            System.out.println(i);
        }
    }
    public void printSumAndAverage(int from, int to){
        int sum=0;
        for (int i=from;i<=to;i++){
            sum=i+sum;
        }
        System.out.println(sum);
        System.out.println(sum/(to-from+1f));
    }
    public double getAverageFromNumbers(int from,int to){
        int x=from;
        int sum=0;
        double counter=0;
        while(x<=to){
            if (x%7==0){
                sum=x+sum;
            }
            x++;
            counter++;
        }
        System.out.println(counter);
        return sum/counter;
    }
    public void pare(int big,int small){
        for (int i=small;i<=big;i++) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
        }
    }
    public void impar(int big,int small){
        for (int i=small;i<=big;i++){
            if (!(i%2==0)){
                System.out.println(i);
            }
        }

    }
    public void numaratoareMica1(int big,int small){
        for (int i=small;i<=big;i++){
            System.out.println(i);
        }
    }
    public void numaratoareMica(int big, int small){
        for (int i=big;i>=small;i--){
            System.out.println(i);
        }
    }
    public void numaratoareXY(int x, int y){
       aa:
        for (int i=x;i<=y;i++){
            System.out.println(i);
        }
        bb:
        for(int j=x;j>=y;j--){
            System.out.println(j);
        }

    }
    public void mareMic(int x,int y){
        if (x > y) {
           for (int i=y;i<=x;i++) {
                 System.out.println(i);
               }
           }else if (y>x){
            for(int j=y;j>=x;j--){
                System.out.println(j);
            }

        }
    }
    public int sumaNR(int from,int to) {
        int x = from;
        int sum = 0;
        while (x <= to) {
            sum = x + sum;
            x++;

        }
        return sum;
    }

    public void asterix(){
        int h= 7;

        for (int row = 1; row <= h; row ++) {
            for (int colomn=h; colomn >= row; colomn--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    public double sumaNrMedia(int from,int to){
        int x=from;
        int sum=0;
        double counter=0;
        while(x<=to){
            sum=x+sum;
            x++;
            counter++;
        }
        System.out.println(counter);
        System.out.println(sum);
        return sum/counter;


    }
    public double sumaMedia(int from,int to){
            int x=from;
            int sum=0;
            double counter=0;
            while(x<=to){
                if (x%7==0){
                    sum=x+sum;
                }
                x++;
                counter++;
            }
            System.out.println(counter);
            return sum/counter;
        }




    public String vote(int x){
        if (x<=17){
            return "Nu poti vota dom'le\n" +
                    "Are drept de vot?FALS";
        }else{
            return "Dute la vot\n" +
                    "Are drept de vot?ADEVARAT";

        }
    }
    public double mediaLa7(int from,int to){
        int x=from;
        int sum=0;
        double counter=0;
        while(x<=to){
            if (x%7==0){
                sum=x+sum;
            }
            x++;
            counter++;
        }
        System.out.println(counter);
        return sum/counter;
    }
    public void Fibonacci(){
        int x=0;
        int y=1;
        int z;
        for (int i=0;i<=20;i++){
            z=x+y;
            System.out.println(z);
            x=y;
            y=z;
        }
        System.out.println();
    }

    public  void tablaInmultirii() {
        int factor1 = 1;
        while (factor1 <= 7) {
            int factor2 = 1;
            while (factor2 <= 11) {
                System.out.print("\t" + factor1 * factor2);
                factor2++;
            }
            System.out.println();
            factor1++;
        }
    }

    public void CozaLozaWoza(int from,int to) {
        for (int i = from; i <= to; i++) {

               System.out.println("\t" + i * 1);


        }
    }
        public void tastaNr(int nr){
        switch (nr){
            case 0:
                System.out.println("Numarul tastat este 0");break;
            case 1:
                System.out.println("Numarul tastat este 1");break;
            case 2:
                System.out.println("Numarul tastat este 2");break;
            case 3:
                System.out.println("Numarul tastat este 3");break;
            case 4:
                System.out.println("Numarul tastat este 4");break;
            case 5:
                System.out.println("Numarul tastat este 5"); break;
            case 6:
                System.out.println("Numarul tastat este 6");break;
            case 7:
                System.out.println("Numarul tastat este 7");break;
            case 8:
                System.out.println("Numarul tastat este 8");break;
            case 9:
                System.out.println("Numarul tastat este 9");break;
            default:
                System.out.println("""
                 +”””””+\s
                [| o o |]
                 |  ^  |\s
                 | '_' |\s
                 +_____+""");

        }
    }
    public void printNumber (int number) {

        switch (number) {

            case 0:
                System.out.println("The number is 0");    break;

            case 1:
                System.out.println("The number is 1");    break;

            case 2:
                System.out.println("The number is 2");   break;

            case 3:
                System.out.println("The number is 3");    break;

            case 4:
                System.out.println("The number is 4");   break;

            case 5:
                System.out.println("The number is 5"); break;

            case 6:
                System.out.println("The number is 6");  break;

            case 7:
                System.out.println("The number is 7");  break;

            case 8:
                System.out.println("The number is 8");   break;

            case 9:
                System.out.println("The number is 9");    break;

            default:
                System.out.println("Not allowed");

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
