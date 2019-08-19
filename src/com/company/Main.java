package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int choice;
        List<Entity> list = new ArrayList<>();
        AddProfile add = new AddProfile();
        DisplayProfile d = new DisplayProfile();
        RemoveFile remove = new RemoveFile();

        while (true){
            System.out.println("\n1. Add profile");
            System.out.println("2. Display all profile");
            System.out.println("3. Remove profile");
            System.out.println("4. Exit");

            while(true){
                try{
                    System.out.println("Choose option: ");
                    choice = Integer.parseInt(sc.next());

                    if (choice < 1 || choice > 4){
                        System.out.println("Option between 1-4");
                    }
                    else {
                        break;
                    }
                }
                catch( NumberFormatException e){
                    System.out.println("Invalid input !!!");
                }
            }

            if (choice == 1){
                add.addProfile(list);
            }

            if (choice == 2){
                d.displayAllProfile(list);
            }

            if (choice == 3){
                remove.removeProfile(list);
            }

            if (choice == 4){
                System.exit(0);
            }
        }

    }
}
