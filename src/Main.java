import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

//description
        System.out.println("\nIn mathematics, a geometric progression is a sequence of non-zero numbers\nwhere each term after the first is found by multiplying the previous one by a fixed, non-zero number called the common ratio. \nThe program shows nth term of a geometric sequence");

// create a new class
        GP firstGP = new GP();

// use methods for the new class
        firstGP.create();
        firstGP.getSize();
        firstGP.findTerm();
        firstGP.add();
        firstGP.getSize();
        firstGP.deleteValue();
        firstGP.getSize();
        firstGP.changeValue();

        System.out.println("\nThank you for using the program!");

    }
}