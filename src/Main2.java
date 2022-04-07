import calculator.Calculator;

public class Main2 {

    public static void main(String[] args) {

 //       java();
  //      java2();
 //       System.out.println("C="+temp(155));
        Calculator calc = new Calculator();
        double a=calc.sum(-5,8)*6;
        double b=calc.sum(55,9)%9;
        double c=20+calc.divide(calc.multiply(-3,5),8);
        double d=calc.sum(5,calc.multiply(calc.divide(15,3),2)-calc.modulo(8,3));
        System.out.println("Rezultatul operatiunilor este:\n" +
                "a."+a+"\n" +
                "b."+b+"\n" +
                "c."+c+"\n" +
                "d."+d);


    }

    public static void java(){
        System.out.println("""
                   J    a   V     V  a  \s
                   J   a a   V   V  a a \s
                J  J  aaaaa   V V  aaaaa
                 JJ  a     a   V  a     a""");
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
        long rez= 5L/9*(f-32);
        return rez;
    }




}
