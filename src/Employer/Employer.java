package Employer;

import Offer.Offer;

public class Employer {
    private Offer offerInMaking;
    private String name;
    private String companyName;

    public Employer(String name, String companyName){
        this.name = name;
        this.companyName = companyName;
    }

    public Offer newOffer(int salary, String description, int minEducation) {
        offerInMaking = new Offer(salary, companyName, description, name, minEducation);
        return offerInMaking;
    }
}
