package AnimalRescuer;

public class Girl {
    private String name ;
    private int ageInMonths;
    private String skinColor ;
    private long savingMoney ;
    private String moneyValue ;
    private String savingFrom ;
    private String nationality ;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setAgeInMonths(int ageInMonths) {
        this.ageInMonths = ageInMonths;
    }

    public int getAgeInMonths() {
        return ageInMonths;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setMoneyValue(String moneyValue) {
        this.moneyValue = moneyValue;
    }

    public String getMoneyValue() {
        return moneyValue;
    }

    public void setSavingMoney(long savingMoney) {
        this.savingMoney = savingMoney;
    }

    public long getSavingMoney() {
        return savingMoney;
    }

    public void setSavingFrom(String savingFrom) {
        this.savingFrom = savingFrom;
    }

    public String getSavingFrom() {
        return savingFrom;
    }

    public void buy(){
        System.out.println("Mercedesa cumpara cainele.");
    }

}
