package AnimalRescuer;

public class Veterinary {
    private String skinColor;
    private int ageInMonths ;
    private String name ;
    private String specialization ;
    private String nationality ;

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public String getSkinColor() {
        return this.skinColor;
    }

    public void setAgeInMonths(int ageInMonths) {
        this.ageInMonths = ageInMonths;
    }

    public int getAgeInMonths() {
        return this.ageInMonths;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return this.specialization;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return this.nationality;
    }

}
