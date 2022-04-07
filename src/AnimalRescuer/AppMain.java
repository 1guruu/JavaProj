package AnimalRescuer;

public class AppMain {

    public static void main(String[] args) {
        Dog constantin = new Dog();
        int x = 3;
        System.out.println(x);
        System.out.println("Varsta catelului este: "+ constantin.ageInMonths);

        constantin.name = "TRex";
        constantin.race = "";
        System.out.println(constantin.name);
        constantin.run();

        DogFood FOOdog= new DogFood();
        double y = 13;
        System.out.println(y);
        System.out.println("Noul pret este "+FOOdog.price+FOOdog.moneyValue);
  //      int i=FOOdog.quantity;
  //      double ii=FOOdog.price;
  //      double m=ii/i;
        System.out.println("Exact "+FOOdog.price+FOOdog.moneyValue+"\\"+FOOdog.quantity+" "+FOOdog.quantityType);



    }
}