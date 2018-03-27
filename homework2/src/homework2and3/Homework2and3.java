//  THIS IS HOMEWORK 2 & 3

package homework2and3;
import java.util.Scanner;

public class Homework2and3 {

    //  creating new Objects
    public static void main (String[] args){
        companies c1 = new companies("Nortal", 26767000, 1998, 287);
        companies c2 = new companies("Helmes", 24690000, 1998, 157);
        companies c3 = new companies("OKIA", 433000, 2000, 9);
        companies c4 = new companies("Codeborne", 4111000, 2010, 31);
        companies c5 = new companies("Lavii", 122000, 2009, 2);

        
        clients cl1 = new clients("Republic of Oman", 1250000, 21, 10000000);
        clients cl2 = new clients("Ministry of Foreign Relations", 665000, 11, 1000000);
        clients cl3 = new clients("Tallinn University", 22500, 2, 200000);

              
        
       
        // scanner for user input
        Scanner name = new Scanner(System.in);
        System.out.println("Enter the name of a company: \nChoose from: Nortal - Helmes - OKIA - Codeborne - Lavii");
        String name1 = name.nextLine();
            //  System.out.println("Test: "+name1);

        //  comparing user input and my Objects (probably it would be better to do a cycle here instead of if x10)
        if(name1.equals(c1.company)){                   //https://stackoverflow.com/questions/513832/how-do-i-compare-strings-in-java
            System.out.println("---------------\n * Company is "+c1.company+". Revenue per employee is "+c1.revenuePerEmployee()+" EUR. Company has been active for "+c1.activeYears()+" years.");
            if (c1.revenue>=cl1.minRequiredRevenue || c1.revenue>= cl2.minRequiredRevenue || c1.revenue>= cl3.minRequiredRevenue){
                System.out.println(name1+" meets the requirements for those clients:");
                if(c1.revenue>cl1.minRequiredRevenue){
                    System.out.println("* "+cl1.customerName+" whos average budget per project is "+cl1.projectValue()+" EUR ("+cl1.projects+" projects in total).");
                }
                if(c1.revenue>cl2.minRequiredRevenue){
                    System.out.println("* "+cl2.customerName+" whos average budget per project is "+cl2.projectValue()+" EUR ("+cl2.projects+" projects in total).");
                }
                if(c1.revenue>cl3.minRequiredRevenue){
                    System.out.println("* "+cl3.customerName+" whos average budget per project is "+cl3.projectValue()+" EUR ("+cl3.projects+" projects in total).");
                }
            } else {
                System.out.println(name1+" doesn't meet any requirements for any client!");
            }
        } 
        else if(name1.equals(c2.company)){
            System.out.println("---------------\n * Company is "+c2.company+". Revenue per employee is "+c1.revenuePerEmployee()+" EUR. Company has been active for "+c1.activeYears()+" years.");
            if (c2.revenue>=cl1.minRequiredRevenue || c2.revenue>= cl2.minRequiredRevenue || c2.revenue>= cl3.minRequiredRevenue){
                System.out.println(name1+" meets the requirements for those clients:");
                if(c2.revenue>cl1.minRequiredRevenue){
                    System.out.println("* "+cl1.customerName+" whos average budget per project is "+cl1.projectValue()+" EUR ("+cl1.projects+" projects in total).");
                }
                if(c2.revenue>cl2.minRequiredRevenue){
                    System.out.println("* "+cl2.customerName+" whos average budget per project is "+cl2.projectValue()+" EUR ("+cl2.projects+" projects in total).");
                }
                if(c2.revenue>cl3.minRequiredRevenue){
                    System.out.println("* "+cl3.customerName+" whos average budget per project is "+cl3.projectValue()+" EUR ("+cl3.projects+" projects in total).");
                }
            } else {
                System.out.println(name1+" doesn't meet any requirements for any client!");
            }
        }      
        else if(name1.equals(c3.company)){
            System.out.println("---------------\n * Company is "+c3.company+". Revenue per employee is "+c1.revenuePerEmployee()+" EUR. Company has been active for "+c1.activeYears()+" years.");
            if (c3.revenue>=cl1.minRequiredRevenue || c3.revenue>= cl2.minRequiredRevenue || c3.revenue>= cl3.minRequiredRevenue){
                System.out.println(name1+" meets the requirements for those clients:");
                if(c3.revenue>cl1.minRequiredRevenue){
                    System.out.println("* "+cl1.customerName+" whos average budget per project is "+cl1.projectValue()+" EUR ("+cl1.projects+" projects in total).");
                }
                if(c3.revenue>cl2.minRequiredRevenue){
                    System.out.println("* "+cl2.customerName+" whos average budget per project is "+cl2.projectValue()+" EUR ("+cl2.projects+" projects in total).");
                }
                if(c3.revenue>cl3.minRequiredRevenue){
                    System.out.println("* "+cl3.customerName+" whos average budget per project is "+cl3.projectValue()+" EUR ("+cl3.projects+" projects in total).");
                }
            } else {
                System.out.println(name1+" doesn't meet any requirements for any client!");
            }
        }      
        else if(name1.equals(c4.company)){
            System.out.println("---------------\n * Company is "+c4.company+". Revenue per employee is "+c1.revenuePerEmployee()+" EUR. Company has been active for "+c1.activeYears()+" years.");
            if (c4.revenue>=cl1.minRequiredRevenue || c4.revenue>= cl2.minRequiredRevenue || c4.revenue>= cl3.minRequiredRevenue){
                System.out.println(name1+" meets the requirements for those clients:");
                if(c4.revenue>cl1.minRequiredRevenue){
                    System.out.println("* "+cl1.customerName+" whos average budget per project is "+cl1.projectValue()+" EUR ("+cl1.projects+" projects in total).");
                }
                if(c4.revenue>cl2.minRequiredRevenue){
                    System.out.println("* "+cl2.customerName+" whos average budget per project is "+cl2.projectValue()+" EUR ("+cl2.projects+" projects in total).");
                }
                if(c4.revenue>cl3.minRequiredRevenue){
                    System.out.println("* "+cl3.customerName+" whos average budget per project is "+cl3.projectValue()+" EUR ("+cl3.projects+" projects in total).");
                }
            } else {
                System.out.println(name1+" doesn't meet any requirements for any client!");
            }
        }
        else if(name1.equals(c5.company)){
            System.out.println("---------------\n * Company is "+c5.company+". Revenue per employee is "+c1.revenuePerEmployee()+" EUR. Company has been active for "+c1.activeYears()+" years.");
            if (c5.revenue>=cl1.minRequiredRevenue || c5.revenue>= cl2.minRequiredRevenue || c5.revenue>= cl3.minRequiredRevenue){
                System.out.println(name1+" meets the requirements for those clients:");
                if(c5.revenue>cl1.minRequiredRevenue){
                    System.out.println("* "+cl1.customerName+" whos average budget per project is "+cl1.projectValue()+" EUR ("+cl1.projects+" projects in total).");
                }
                if(c5.revenue>cl2.minRequiredRevenue){
                    System.out.println("* "+cl2.customerName+" whos average budget per project is "+cl2.projectValue()+" EUR ("+cl2.projects+" projects in total).");
                }
                if(c5.revenue>cl3.minRequiredRevenue){
                    System.out.println("* "+cl3.customerName+" whos average budget per project is "+cl3.projectValue()+" EUR ("+cl3.projects+" projects in total).");
                }
            } else {
                System.out.println(name1+" doesn't meet any requirements for any client!");
            }
        }
    
        else {
            System.out.println("Sorry, there is no such company ("+name1+") in our database!");
        }
    }
}

/*

run:
Enter the name of a company: 
Choose from: Nortal - Helmes - OKIA - Codeborne - Lavii
Codeborne
---------------
 * Company is Codeborne. Revenue per employee is 93264 EUR. Company has been active for 20 years.
Codeborne meets the requirements for those clients:
* Ministry of Foreign Relations whos average budget per project is 60454 EUR (11 projects in total).
* Tallinn University whos average budget per project is 11250 EUR (2 projects in total).
BUILD SUCCESSFUL (total time: 6 seconds)

*/