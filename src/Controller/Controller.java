package Controller;

import Employee.Employee;
import Employer.Employer;
import Offer.Offer;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public Controller() {

    }
    //haridused: 1-põhi 2-kesk 3-kõrg
    public void controllerSetup(){
        List<Offer> allOffers = new ArrayList<>();
        Employer tiina = new Employer("Tiina", "Telia");
        Offer offer1 = tiina.newOffer(600, "Koristaja",1);
        Offer offer2 = tiina.newOffer(2500, "Programmeerija",3);
        allOffers.add(offer1);
        allOffers.add(offer2);
        Employee madis = new Employee("Madis", 1, allOffers);
        Employee juku = new Employee("Juku", 3, allOffers);

        madis.viewAllOffers();
        System.out.println("-------------------------------");
        juku.viewAllOffers();
    }
}
