package Employee;

import Offer.Offer;

import java.util.List;

public class Employee {
    private String name;
    private int education;
    private List<Offer> allOffers;

public Employee(String name, int education, List<Offer> allOffers){
        this.name = name;
        this.education = education;
        this.allOffers = allOffers;
    }

    public void viewAllOffers() {
        for (Offer allOffer : allOffers) {
            if (education >= allOffer.getMinEducation()) {
                System.out.println(allOffer.viewOffer());
            }
        }
    }
}
