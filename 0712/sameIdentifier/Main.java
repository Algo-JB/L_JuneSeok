package src.sameIdentifier;

import java.util.Scanner;

public class Main {

    public static String same(String identifier) {
        return "??!";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String identifier = sc.next();


        System.out.print(identifier+same(identifier));
    }
}
