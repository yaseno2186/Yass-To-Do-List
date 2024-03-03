package net.Yass.src.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner inputs = new Scanner(System.in);
    public static Scanner dare = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>(5);
        System.out.println("Your current To-do list: " + tasks);
        for (int i = 0; i < 5; i++) {
            System.out.println("Do you want to write To-do's ?");
            boolean addTask = dare.nextBoolean();
            if (addTask) {
                System.out.println("Enter what to add on the To-do List: ");
                tasks.add(inputs.nextLine());
                System.out.println("You add on the to do list: " + tasks.get(i));
                if (i == 4) {
                    System.out.println("All tasks we have in the list: ");
                    for (String task : tasks) {
                        System.out.println(task);
                    }
                }
            } else{
                System.out.println("Your current list is: ");
                tasks.forEach(System.out::println);
            break;
            // we what is going on
            }
        }
    }
}