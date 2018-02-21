/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.pkg3;

/**
 *
 * @author Taavi Meinberg
 */
public class Main {
    public static void main(String[] arg){
        Tickets ticket1 = new Tickets(25, Types.TRAIN, 1, "Tallinn-Tartu-1");
        Tickets ticket2 = new Tickets(450, Types.AIRPLANE, 2, "Tallinn-Berlin-1");
        Tickets ticket3 = new Tickets(25, Types.TRAIN, 3, "Tallinn-Tartu-1");
        
        Rides ride1 = new Rides("Tallinn-Tartu-1", Types.TRAIN, "Tallinn", "Tartu", "26.02.2018 14:15");
        Rides ride2 = new Rides("Tallinn-Berlin-1", Types.AIRPLANE, "Tallinn", "Berlin", "28.03.2018 07:45");
        
        System.out.println(ticket1.toString()); 
        // Tickets{price=25, type=TRAIN, ticketID=1, rideID=Tartu1}
        
        System.out.println(ticket2.toString());
        // Tickets{price=450, type=AIRPLANE, ticketID=2, rideID=Dublin1}
        
        System.out.println(ticket3.toString());
        // Tickets{price=25, type=TRAIN, ticketID=2, rideID=Tartu1}
        
        System.out.println(ride1.toString());
        // Rides{rideID=Tallinn-Tartu-1, type=TRAIN, from=Tallinn, to=Tartu, date=26.02.2018 14:15}
        
        System.out.println(ride2.toString());
        // Rides{rideID=Tallinn-Berlin-1, type=AIRPLANE, from=Tallinn, to=Berlin, date=28.03.2018 07:45}
        
        //Kontrollime pileti rideID'd (pileti tüübi kontroll on failsafe, juhul kui ID on sama).
        System.out.println(ride1.doesTicketMatch(ticket1));
        // Pilet on õige
        
        System.out.println(ride1.doesTicketMatch(ticket2));
        // Pilet ei sobi!
        
        System.out.println(ride2.doesTicketMatch(ticket2));
        // Pilet on õige
    }
    
}
