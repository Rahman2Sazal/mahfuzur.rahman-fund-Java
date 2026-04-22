package mahfuzur.main.datamodel;

public class Insurance {

    private static final Object STR = "name";
    private Integer insurance_Id;
    private String insurance_Name;

    public Insurance(String s) {
    }

    public Integer getInsurance_Id() {
        return insurance_Id;
    }

    public void setInsurance_Id(Integer insurance_Id) {
        this.insurance_Id = insurance_Id;
    }

    public String getInsurance_Name() {
        return insurance_Name;
    }

    public void setInsurance_Name(String insurance_Name) {
        this.insurance_Name = insurance_Name;
    }



}