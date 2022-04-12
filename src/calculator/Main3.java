package calculator;

public class Main3 {

    public static void main(String[] args) {

        LogicalOperations op = new LogicalOperations();
            op.CozaLozaWoza(1,110);
//          System.out.println(op.verifyText("abd","edc"));
//        System.out.println(op.trioMax(13,45,1));
//        System.out.println(op.vote(18));
//        op.numaratoareMica1(100,0);
//        op.numaratoareMica(0,-100);
//        op.numaratoareXY(15,98);
//        op.numaratoareXY(34,7);
//        op.mareMic(7,15);
//        op.mareMic(15,7);
//         op.pare(100,1);
//         op.impar(100,1);
//            op.asterix();
//        System.out.println(op.sumaNR(5,10));
//        System.out.println(op.sumaNrMedia(111,8899));
//        System.out.println(op.sumaNrMedia(5,10));
//        op.mediaLa7(5,15);
//            op.Fibonacci();






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