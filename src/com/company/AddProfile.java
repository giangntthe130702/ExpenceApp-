package com.company;

import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class AddProfile {

    public String getDateFormat(){
        Scanner sc = new Scanner(System.in);

        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        df.setLenient(false);
        Date input;

        while (true){
            try{
                System.out.println("Enter date: ");
                input = df.parse(sc.next());
                break;
            }
            catch (Exception e) {
                System.out.println("Invalid Date input !!!");
            }
        }
        return df.format(input);
    }

    public String getContent(){
        String content;
        Scanner sc = new Scanner(System.in);

        while (true){
            try{
                System.out.println("Enter content: ");
                content = sc.nextLine();

                if (content.trim().equals("")){
                    System.out.println("Content can not be empty!!!");
                }
                else {
                    break;
                }

            }
            catch (Exception e){
                System.out.println("Invalid content !!!");
            }
        }
        return content;
    }

    public double getAmount(){
        Scanner sc = new Scanner(System.in);
        double amount;
        while(true){
            try{
                System.out.println("Enter amount: ");
                amount = Double.parseDouble(sc.next());
                break;
            }
            catch (NumberFormatException e){
                System.out.println("Invalid input !!!");
            }
        }
        return amount;
    }



    public void addProfile(List<Entity> list){
        String date = getDateFormat();
        double amount = getAmount();
        String content = getContent();

        int id;
        int length = list.size();

        if (length == 0){
            id = 1;
        }
        else {
            id = list.get(length-1).getId() + 1;
        }

        Entity e = new Entity(id, content, date, amount);
        list.add(e);
    }
}
