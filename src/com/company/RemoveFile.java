package com.company;

import java.util.List;
import java.util.Scanner;

public class RemoveFile {

    public int removeById() {
        Scanner sc = new Scanner(System.in);
        int id;

        while (true) {
            try {
                System.out.println("Enter id: ");
                id = Integer.parseInt(sc.next());
                if (id < 0) {
                    System.out.println("Id must > 0");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input !!!");
            }
        }
        return id;
    }

    public void removeProfile(List<Entity> list) {
        int id = removeById();
        boolean check = false;

            for (int i = 0; i < list.size(); i++) {
                if (id == list.get(i).getId()) {
                    list.remove(i);
                    check = true;
                    break;
                }
            }

            if (check == true) {
                System.out.println("Remove successfully ");
            }

            else {
                System.out.println("Id not exist !!!");
            }


    }
}
