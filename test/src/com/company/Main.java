package com.company;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("This is a program that displays a School's structure. You can create your own or you can see the default one");
        System.out.println("Beneath are some instructions on how to use this program ");
        String name="";
        String lastName="";
        String tuitionFees="";
        String dateOfBirth="";
        ArrayList<Student> students = new ArrayList<>();
        int k=0;
        System.out.println("Please provide the information needed for a student. After every input you need " +
                "to press enter");
        System.out.println("To continue your inputs. First you need to provide the name, then the lastname" +
                " then the tuition fees");
        System.out.println("and lastly the date of birth of the student. If you want to stop providing" +
                " information of a new student you have to insert 0");
        do {
            name= sc.nextLine();
            if (name.equals("0")){
                System.out.println("You decided to stop inserting new students. The program will now continue with the trainers!");
                break;
            }
            lastName= sc.nextLine();
            tuitionFees= sc.nextLine();
            dateOfBirth=sc.nextLine();
            Student student = new Student(name, lastName, tuitionFees,dateOfBirth);
            //System.out.println(student); test:printarei to object
            students.add(k,student);
            //System.out.println(students.get(k)); test: printarei to arxeio pou evale sthn lista
            k++;
        }while (!(name.equals("0")));
        //Collections.sort(students);
        for(int i=0; i< students.size();i++){
            System.out.println(students.get(i));
        }
    }
}
