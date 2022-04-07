package calculator;

public class Calculator {

    public  double sum(int firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public int substract(int firstNumber, int secondNumber){
        int result = firstNumber - secondNumber;
        return result;
    }

    public  double divide(double firstNumber, int secondNumber){
        double result = firstNumber / secondNumber;
        return result;
    }
    public double multiply(double firstNumber, int secondNumber){

        return firstNumber * secondNumber;
    }
    public double modulo(double numar1, double numar2){

        return numar1 % numar2;
    }
    public double mediaNr(int nr1,double nr2,double nr3){
        return (nr1+nr2+nr3)/3;
    }
    public int patratulNr(int x){
        return x*x;
    }
}
