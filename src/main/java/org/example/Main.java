package org.example;

import java.util.Scanner;

/**
 * This is the Main class.
 */
public class Main {
    public static void main(String[] args) {
        //initiate OrderProcessor and scanner
        OrderProcessor order = new OrderProcessor();
        Scanner scanner = new Scanner(System.in);
        //asking for type
        System.out.println("plz type in your optional for vending: Coffee/Tea");
        String input = scanner.nextLine();
        System.out.println("You have selected: " + input);
        //process
        order.OrderProcess(input);
    }
    }
