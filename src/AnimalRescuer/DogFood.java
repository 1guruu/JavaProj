package AnimalRescuer;

public class DogFood {
    String name ="FOOdog";
    double price=560 ;
    String moneyValue = "$";
    int quantity =1;
    String quantityType = "Kilogram";
    long disponibility = 140000;
    String disponibilityType = "Tone";

    public void marketing(){
        System.out.println("""
                Super MEGA reducere la\s
                FOOdog doar astazi la
                pretul de 480$""");
    }
    public void sell(){
        System.out.println("Pret\\Kg");
    }

}
