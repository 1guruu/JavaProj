public class Main2 {
    static int memberVariable = 3;


    public static void main(String[] args) {

        double result = sum(memberVariable, 3.2);
        System.out.println(result * 2);
        System.out.println("Rezultatul este: " + sum(3, 5));

        int result2 = substract(5,4);
        System.out.println(result2);

        System.out.println(result - result2);
        double result1 = divide(35.4,5);
        System.out.println(result1);

        int result0=multiply(14,9);
        System.out.println(result0);
        double rezultat=modulo(18,5);
        System.out.println(rezultat);
        java();
        System.out.println(trio(4,17,7));
        java2();
        System.out.println("C="+temp(155));
        System.out.println("Distanta in metri este:"+metric(459));




    }

    public static double sum(int firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int substract(int firstNumber, int secondNumber){
        int result = firstNumber - secondNumber;
        return result;
    }

    public static double divide(double firstNumber, int secondNumber){
        double result = firstNumber / secondNumber;
        return result;
    }
    public static int multiply(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }
    public static double modulo(double numar1, double numar2){
        return numar1 % numar2;
    }
    public static void java(){
        System.out.println("""
                   J    a   V     V  a  \s
                   J   a a   V   V  a a \s
                J  J  aaaaa   V V  aaaaa
                 JJ  a     a   V  a     a""");
    }
    public static double trio(int nr1,double nr2,double nr3){
        return (nr1+nr2+nr3)/3;
    }
    public static void java2(){
        System.out.println("""
                 +”””””+\s
                [| o o |]
                 |  ^  |\s
                 | '_' |\s
                 +_____+""");
    }
    public static double temp(int f){
        long rez=9/5* (f-32);
        return rez;
    }
    public static double metric(double in){
        return in / 39.370;
            }
   public static double tema1(double a,double b, double c, double d, double e,double f,double g,double h,double i){
        double w= -a+b*c;
        double x=(d+e)%e;
        double y=f+(-g)*a/b;
        double z=a+i/g*h-b%g;
        return
   }


}
