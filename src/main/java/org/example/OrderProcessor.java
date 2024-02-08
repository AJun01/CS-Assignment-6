package org.example;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/**
 * This is the Order Process Class.
 * This class is responsible for calculating order price and handling conversation.
 */
public class OrderProcessor {

    double totalPrice;
    Scanner scanner = new Scanner(System.in);
    //I created 7 slots: first one for the drink, last 6 for sugar and milk(3 each)
    String[] orderlist = {"empty","empty","empty","empty","empty","empty","empty"};
    Beverages bev = new Beverages();
    AddOnOptions addon = new AddOnOptions();

    /**
     * This is the Process method processing user input with more questions followed
     * @param input user input as string
     */
    public void OrderProcess(String input) {

        //two cases options
        switch (input.toLowerCase()) {
            case "coffee":
                //if user put coffee, calls the handler method of coffee
                handleCoffeeOrder();
                break;
                //if user put tea, calls the handler method of tea
            case "tea":
                handleTeaOrder();
                break;
        }
        System.out.println("Your total is: $" + totalPrice + "\nYou ordered Items: " + Arrays.toString(orderlist));

    }

    /**
     * This is the coffee handler method, handle coffee options
     */
    private void handleCoffeeOrder(){
        System.out.println("What do you want: 1." +
                bev.getEspresso().name +
                "/ 2." + bev.getAmericano().name +
                "/ 3." + bev.getMacchiato().name);
        String input2 = scanner.nextLine();
        System.out.println("You have selected: " + input2);

        ////three cases when user wants coffee, and we add the chosen option item name to the list
        switch (input2) {
            case "1":
                orderlist[0] = bev.getEspresso().name;
                totalPrice = 2;
                addon();
                break;
            case "2":
                orderlist[0] = bev.getAmericano().name;
                totalPrice = 2;
                addon();
                break;
            case "3":
                orderlist[0] = bev.getMacchiato().name;
                totalPrice = 2;
                addon();
                break;
        }

    }

    /**
     * This is the tea handler method, handle tea options
     */
    private void handleTeaOrder(){
        System.out.println("What do you want: 1." +
                bev.getBTea().name +
                " / 2." + bev.getGTea().name +
                " / 3." + bev.getYTea().name);
        String input2 = scanner.nextLine();
        System.out.println("You have selected: " + input2);

        //three cases when user wants tea, and we add the chosen option item name to the list
        switch (input2) {
            case "1":
                orderlist[0] = bev.getBTea().name;
                totalPrice = 1.5;
                addon();
                break;
            case "2":
                orderlist[0] = bev.getGTea().name;
                totalPrice = 1.5;
                addon();
                break;
            case "3":
                orderlist[0] = bev.getYTea().name;
                totalPrice = 1.5;
                addon();
                break;
        }
    }

    /**
     * This is the condiment handler method, handle two addon options
     */
    private void addon(){
        //8 times of input allowed
        int j = 8;
        //sugar and milk counts
        int m = 0;
        int s = 0;
        System.out.println("Do you want to add: Sugar($0.50)/Milk($0.50)/No(I am good)");
        System.out.println("only 3 for each Please!");
        for (int i =1; i < orderlist.length && j > 0; i++, j--){
            System.out.println("You have " + Integer.toString(j)+ " choices left");
            String input2 = scanner.nextLine();
            //two cases either milk or sugar
            if (!Objects.equals(input2, "no")){
                switch (input2) {
                    case "milk":
                        if (m < 3) {
                            orderlist[i] = "milk";
                            totalPrice += 0.5;
                            m++;
                        } else {
                            System.out.println("Maximum milk added. Choose another option or 'No'.");
                            i--;
                        }
                        break;
                    case "sugar":
                        if (s < 3) {
                            orderlist[i] = "sugar";
                            totalPrice += 0.5;
                            s++;
                        } else {
                            System.out.println("Maximum sugar added. Choose another option or 'No'.");
                            i--;
                        }
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose again.");
                        i--;
                        break;
                }
            }else{
                break;
            }
        }
    }
    }



