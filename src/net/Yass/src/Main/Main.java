package net.Yass.src.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static Scanner inputsNum = new Scanner(System.in);
    public static boolean dare(String YorN) {
        return YorN.contains("y") || YorN.contains("+");
    }
    private static final ArrayList<String> taskTitle = new ArrayList<>(5);
    private static final ArrayList<String> taskDescription = new ArrayList<>(5);
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {

            System.out.println("Do you want to write To-do's ?");
            boolean addTask = dare(inputs.nextLine());
            if (addTask) {
                System.out.println("Enter what to add on the To-do List: ");
                taskTitle.add(inputs.nextLine());
                System.out.println("You add on the to do list: " + taskTitle.get(i));
                System.out.println("Enter description: ");
                taskDescription.add(inputs.nextLine());
                printList();
            } else {
                printList();
                System.out.println("Enter a task number to delete: ");
                taskTitle.remove(inputsNum.nextInt() -1);
                System.out.println("Deleted it successfully");
                printList();
                break;
            }
        }
    }
    public static void printList(){
        System.out.println("Your current list is: ");
        for (int j = 0; j < taskTitle.size(); j++) {
            System.out.println(j + 1 + ". " + taskTitle.get(j).toUpperCase()+"\n\t"+taskDescription.get(j).toLowerCase());
        }
    }

}
