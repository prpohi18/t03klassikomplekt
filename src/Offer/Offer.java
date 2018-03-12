package Offer;

public class Offer {
    private String description;
    private String companyName;
    private int salary;
    private String submitterName;
    private int minEducation;

    public Offer(int salary, String companyName, String description, String submitterName, int minEducation) {
        this.salary = salary;
        this.companyName = companyName;
        this.description = description;
        this.submitterName = submitterName;
        this.minEducation = minEducation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSubmitterName() {
        return submitterName;
    }

    public void setSubmitterName(String submitterName) {
        this.submitterName = submitterName;
    }

    public int getMinEducation() {
        return minEducation;
    }

    public String viewOffer(){
        String educationLevel = "";
        String offer = "";

        if (minEducation == 1){
            educationLevel = "Põhiharidus";
        } else if (minEducation == 2){
            educationLevel = "Keskharidus";
        } else if (minEducation == 3){
            educationLevel = "Kõrgharidus";
        }
        if (!educationLevel.equals("")) {
            offer = "Company name: " + companyName + "\nContact person: " + submitterName + "\nDescription: " + description + "\nMinimum education: " + educationLevel + "\nSalary: " + salary + "\n";
        }

        return offer;
    }
}
