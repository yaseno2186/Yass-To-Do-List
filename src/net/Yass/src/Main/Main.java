package net.Yass.src.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner inputs = new Scanner(System.in);
    public static Scanner inputsNum = new Scanner(System.in);

    public static boolean dare(String YorN) {
        return YorN.contains("y") || YorN.contains("+");
    }
    private static final ArrayList<String> tasks = new ArrayList<>(5);
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Do you want to write To-do's ?");
            boolean addTask = dare(inputs.nextLine());
            if (addTask) {
                System.out.println("Enter what to add on the To-do List: ");
                tasks.add(inputs.nextLine());
                System.out.println("You add on the to do list: " + tasks.get(i));
                printList();
            } else {
                printList();
                System.out.println("Enter a task number to delete: ");
                tasks.remove(inputsNum.nextInt() -1);
                System.out.println("Deleted it successfully");
                printList();
                break;
            }
        }
    }
    public static void printList(){
        System.out.println("Your current list is: ");
        for (int j = 0; j < tasks.size(); j++) {
            System.out.println(j + 1 + ". " + tasks.get(j).toUpperCase());
        }
    }

}
