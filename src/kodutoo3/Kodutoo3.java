package kodutoo3;

import java.util.Scanner;

public class Kodutoo3 {
    public static void main(String[] args) {
        Dog dog1 = new Dog(); // defineerin Dog klassi tyypi objekti nimega dog1

        Scanner sisend = new Scanner(System.in); // lõin scanner klassi tyypi scanneri nimega sisend, mis loeb kasutajate poolt antud sisendeid

        System.out.println("Sisestage koera nimi: "); // kysin kasutajalt sisendit
        dog1.setName(sisend.nextLine()); // pyyan sisendi kinni ja annan dog1-le nimeks kasutaja sisendi

        System.out.println("Sisestage koera vanus: ");
        dog1.setAge(sisend.nextLine());

        System.out.println("Sisestae koera tõug: ");
        dog1.setBreed(sisend.nextLine());

        System.out.println("Sisestage koera saba pikkus: ");
        dog1.setTailLength(sisend.nextLine());

        //System.out.println(dog1.getName() + dog1.getAge() + dog1.getBreed() + dog1.getTailLength());

        System.out.println("Kas soovite näha koera andmeid [jah/ei]: ");
        if (sisend.nextLine().toUpperCase().startsWith("JAH")) {
            System.out.println("Koera nimi on: " + dog1.getName());
            System.out.println("Koera vanus on: " + dog1.getAge());
            System.out.println("Koera tõug on: " + dog1.getBreed());
            System.out.println("Koera saba pikkus on: " + dog1.getTailLength());
        } else {
            System.out.println("Sulgen registri!");
        }
    }
}
/*
Sisestage koera nimi:
Juku
Sisestage koera vanus:
100
Sisestae koera tõug:
hundikoer
Sisestage koera saba pikkus:
8
Kas soovite näha koera andmeid [jah/ei]:
jah
Koera nimi on: Juku
Koera vanus on: 100
Koera tõug on: hundikoer
Koera saba pikkus on: 8

Process finished with exit code 0

Sisestage koera nimi:
Pauka
Sisestage koera vanus:
17
Sisestae koera tõug:
hundikoer
Sisestage koera saba pikkus:
4
Kas soovite näha koera andmeid [jah/ei]:
ei
Sulgen registri!

Process finished with exit code 0
 */
