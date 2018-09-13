package Class16;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class GroceryList_Internal {

    ArrayList<String> list = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void welcomeApp() {
        System.out.println("**** Welcome to Grocery App ****\n********************************\n");

    }

    private void appInstructions() {
        System.out.println("\nGrocery App instructions are as follows : \nPress:\n" +
                "   0 : prints the app instruction \n" +
                "   1 : prints grocery list \n" +
                "   2 : add new item to the list\n" +
                "   3 : Modify item from list\n" +
                "   4 : Remove item from list \n" +
                "   5 : Search for an item in list \n" +
                "   6 : Quits from app\n");
    }

    private int askUserForChoiceAndCheck() {
        System.out.print("Please enter your choice : ");
        try {
            int userInput = input.nextInt();
            if (userInput > 6) {
                System.out.println("Please enter a number between 1-6. Try again!\n");
                askUserForChoiceAndCheck();
            }
            return userInput;
        }
        catch (InputMismatchException e) {
            System.out.println("\nInvalid input. Expected input is a number between 1 to 6\n" +
                    "Kindly re-login into the app\n");
            return 6;
        }
    }


    private void showList() {
        int itemNo = 0;
        if (list.size() != 0) {
            Iterator<String> item = list.iterator();
            while (((Iterator) item).hasNext()) {
                itemNo++;
                System.out.println(itemNo + ".  " + ((Iterator) item).next());
            }
            System.out.println("Total items in list : " + list.size() + "\n");
        } else {
            System.out.println("List is empty.\n");
        }

    }


    private void addList() {
        System.out.println("\nYou can add one/multiple item(s) to list. When done, enter 'done'");
        String newItem;
        do {
            System.out.print("\nEnter item to add to list : ");
            newItem = input.next();
            if (!newItem.equalsIgnoreCase("done")) {
                if (!list.contains(newItem)) {
                    list.add(newItem);
                    System.out.println("'" + newItem + "' added to list.\n" );
                } else {
                    System.out.println("'" + newItem + "' is already present in the list.\n");
                    addList();
                }
            }
        } while (!newItem.equalsIgnoreCase("done"));
    }

    private void modifyItem() {
        System.out.print("\nEnter the item to modify : ");
        String item = input.next();
        if (list.contains(item)) {
            System.out.print("\nEnter the new item : ");
            String newItem = input.next();
            list.set(list.indexOf(item) , newItem);
            System.out.println("\n" + item + " modified to " + newItem);
        } else {
            System.out.println("\n" + item + " is not present in the list.");
        }
    }

    private void removeItem() {
        System.out.print("\nEnter item to be removed from list : ");
        String item = input.next();
        if (list.contains(item)) {
            list.remove(item);
            System.out.println("\n'" + item + "' removed from list." );
        } else {
            System.out.println("\n'" + item + "' is not present in the list.");
        }
    }


    private void searchItem() {
        System.out.print("\nEnter item to be searched in list : ");
        String item = input.next();
        if (list.contains(item)) {
            int index = list.indexOf(item);
            System.out.println("\n'" + item + "' is present at " + (index+1) + " position in list");
        } else {
            System.out.println("\n'" + item + " is not present in the list.");
        }
    }


    public void menu() {
        int userChoice;
        do {
            appInstructions();
            userChoice = askUserForChoiceAndCheck();
            switch (userChoice) {
                case 0: {
                    break;
                }

                case 1: {
                    showList();
                    break;
                }

                case 2: {
                    addList();
                    break;
                }
                case 3: {
                    modifyItem();
                    break;
                }

                case 4: {
                    removeItem();
                    break;
                }

                case 5: {
                    searchItem();
                    break;
                }
            }
        } while (userChoice < 6);
    }















}
