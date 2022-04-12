package AnimalRescuer;

public class DogFood {
    private String name ;
    private double price;
    private String moneyValue ;
    private int quantity ;
    private String quantityType ;
    private long disponibility ;
    private String disponibilityType;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice() {
        return this.price;
    }
    public void setMoneyValue(String moneyValue){
        this.moneyValue=moneyValue;
    }
    public String getMoneyValue(){
        return this.moneyValue;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantityType(String quantityType) {
        this.quantityType = quantityType;
    }
    public String getQuantityType(){
        return this.quantityType;
    }

    public void setDisponibility(long disponibility) {
        this.disponibility = disponibility;
    }

    public long getDisponibility() {
        return this.disponibility;
    }

    public void setDisponibilityType(String disponibilityType) {
        this.disponibilityType = disponibilityType;
    }

    public String getDisponibilityType() {
        return this.disponibilityType;
    }

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
