package calculator;

public class Main3 {

    public static void main(String[] args) {


   //    System.out.println(vremea(9));

        LogicalOperations op = new LogicalOperations();
        System.out.println(op.verifyText("abd","edc"));
        System.out.println(op.trioMax(13,45,1));
        System.out.println(op.vote(18));
        /*Exercitiu din prezentare curs
        int nr=0;
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

        }*/




    }






    public static String numar(int numar){
        if (numar >= 2 && numar<= 8){
            return "int " + numar;
        } else{
        return """
                   J    a   V     V  a  \s
                   J   a a   V   V  a a \s
                J  J  aaaaa   V V  aaaaa
                 JJ  a     a   V  a     a""";
    }
    }
    public static String vremea(int nr) {
        if (nr>8 || nr==6){
            return "The amount of snow this winter was(cm)" + nr;
        }else{
            return "The forecast snow is(cm)" + nr;
        }
    }





}