package AnimalRescuer;

public class Dog {

   private String color ;
    private double weigth ;
    private int ageInMonths;
    private String ownerName ;
    private String race ;
    private String name;
    private boolean isMale ;
    private int health;
    private int hungry;
    private int spirit;

    public void setSpirit(int spirit) {
        this.spirit = spirit;
    }

    public int getSpirit() {
        return spirit;
    }

    public void setHungry(int hungry) {
        this.hungry = hungry;
    }

    public int getHungry() {
        return hungry;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setRace(String race){
        this.race=race;
    }
    public String getRace(){
        return this.race;
    }
    public void setOwnerName(String ownerName){
        this.ownerName=ownerName;
    }
    public String getOwnerName(){
        return this.ownerName;
    }
    public void setAgeInMonths(int ageInMonths){
        this.ageInMonths=ageInMonths;
    }
    public int getAgeInMonths(){
        return this.ageInMonths;
    }
    public boolean getIsMale(){
         return this.isMale;
    }
    public void setIsMale(boolean isMale){
        this.isMale=isMale;
    }

    public void setColor(String color){
         this.color=color;
    }
    public String getColor(){
         return this.color;
    }
    public void setWeigth(double weight){
        this.weigth=weight;
    }
    public double getWeigth(){
        return this.weigth;
    }

    public void eat(){
        System.out.println("Eating FOOdog");
    }

    public void sleep(){
        System.out.println("zzzzZZZ");
    }

    public void run(){
        System.out.println("Running ");
    }


    public void play(){
        System.out.println("playing fetch");
    }
}