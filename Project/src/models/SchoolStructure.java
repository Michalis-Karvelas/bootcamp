package models;

import java.util.Scanner;
import java.util.ArrayList;

public class SchoolStructure {
    Scanner sc=new Scanner(System.in);

    public  SchoolStructure(){
        System.out.println("                                Welcome to the School's Structure Program");
        System.out.println("===============================================================================================================");
        System.out.println("This is a program that displays a School's structure. You can create your own data or you can see the defaults");
        System.out.println("Beneath are some instructions on how to use this program ");
        System.out.println("After any input you have to press enter");
        System.out.println("If you want to enter the necessary data manually press 1. If you want them to be filled automatically press 2");
        System.out.println("===============================================================================================================");
        String z="";
        String title,stream,type,firstName,lastName,name,lastName2,tuitionFees,title2,description,oralMark,totalMark;
        String start_date,end_date,subDateTime,dateOfBirth;
        int k=0;
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<String> studentsPerCourse=new ArrayList<>();
        ArrayList<String> studentsCheck=new ArrayList<>();
        ArrayList<Trainer> trainers = new ArrayList<>();
        ArrayList<String> trainersPerCourse=new ArrayList<>();
        ArrayList<String> trainersCheck=new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();
        ArrayList<Assignment> assignments= new ArrayList<>();
        ArrayList<String> assignmentsPerCourse=new ArrayList<>();
        z= sc.nextLine();
        while ((!(z.equals("1"))&&(!(z.equals("2"))))){
            System.out.println("You didn't input a valid number. Please enter 1 for manual or 2 for automatically");
            z=sc.nextLine();
        }
        if (z.equals("1")) {
            System.out.println("===============================================================================================================");
            System.out.println("You have chosen to input the data manually. This may take a while!");
            System.out.println("You need to provide the information needed for a course.");
            System.out.println("What is the course's title?");
            title=sc.nextLine();
            do {
                if (k!=0) {
                    System.out.println("You need to provide the title for the next course. if you want to stop providing courses insert 0");
                    title=sc.nextLine();
                    if (title.equals("0")) {
                        System.out.println("You decided to stop inserting new courses and data");
                        break;
                    }
                }
                while((title.length()>25||title.length()<3)){
                    System.out.println("The title should be between 3-25 characters. Please insert a valid title");
                    title=sc.nextLine();
                }
                System.out.println("What is the stream of the course "+title);
                stream=sc.nextLine();
                while(stream.length()>15||stream.length()<3){
                    System.out.println("The stream should be between 3-15 characters. Please insert a valid stream");
                    stream=sc.nextLine();
                }
                System.out.println("What is it's type?");
                type=sc.nextLine();
                while(type.length()>12||type.length()<3){
                    System.out.println("The type should be between 3-15 characters. Please insert a valid stream");
                    type=sc.nextLine();
                }
                System.out.println("When is it's starting date?");
                start_date=sc.nextLine();
                System.out.println("When is it's ending date?");
                end_date=sc.nextLine();
                System.out.println("Which assignments are in this course?"); //edw thelw arraylist apo assignments giati einai polla!!!
                String k1="";
                do{
                    System.out.println("Provide the title of the assignment.");
                    title2=sc.nextLine();
                    while(title2.length()>12||title2.length()<3){
                        System.out.println("Your input should be between 3-15 characters. Please insert a valid input");
                        title2=sc.nextLine();
                    }
                    System.out.println("What is it about?");
                    description=sc.nextLine();
                    while(description.length()>25||description.length()<3){
                        System.out.println("The description should be between 3-25 characters. Please insert a valid description");
                        description=sc.nextLine();
                    }
                    System.out.println("When do the students have to submit it?");
                    subDateTime=sc.nextLine();
                    System.out.println( "If you want to continue inserting assignments press 1. If you want to stop press 0");
                    k1=sc.nextLine();
                    while(!k1.equals("1")&&!k1.equals("0")){
                        System.out.println("Wrong input. Press 1 or 0");
                        k1=sc.nextLine();
                    }
                    Assignment assignment=new Assignment(title2,description,subDateTime);
                    assignments.add(assignment);
                    Assignment assignmentPerCourse=new Assignment(title2,description,subDateTime,title,stream,type);
                    //assignmentsPerCourse.add(assignmentPerCourse);
                    assignmentsPerCourse.add(assignmentPerCourse.toStringAssignmentsPerCourse());
                }while(!k1.equals("0"));
                System.out.println("Next you have to input the data of the trainers that teach this course?"); //mporoun na einai poloi trainers
                k1="";
                do{
                    System.out.println("Please insert the name of the trainer");
                    firstName=sc.nextLine();
                    while(firstName.length()>12||firstName.length()<3){
                        System.out.println("Your input should be between 3-15 characters. Please insert a valid input");
                        firstName=sc.nextLine();
                    }
                    System.out.println("What is " +firstName+"'s lastname?" );
                    lastName=sc.nextLine();
                    while(lastName.length()>12||lastName.length()<3){
                        System.out.println("Your input should be between 3-15 characters. Please insert a valid input");
                        lastName=sc.nextLine();
                    }
                    Trainer trainer=new Trainer(firstName,lastName,stream);
                    trainers.add(trainer);
                    Trainer trainerPerCourse=new Trainer(firstName,lastName,title,stream,type);
                    trainersPerCourse.add(trainerPerCourse.toStringTrainersPerCourse());
                    //trainersCheck.add(trainer.toString2());
                    System.out.println( "If you want to continue inserting trainers press 1. If you want to stop press 0");
                    k1=sc.nextLine();
                    while(!k1.equals("1")&&!k1.equals("0")){
                        System.out.println("Wrong input. Press 1 or 0");
                        k1=sc.nextLine();
                    }
                }while(!k1.equals("0"));

                System.out.println("Next you have to input the data-information of the students that are enrolled in "+title+" "+stream+" "+type);
                k1="";
                do{
                    System.out.println("Please provide the student's name");
                    name=sc.nextLine();
                    System.out.println("What is "+name +"'s lastname?");
                    lastName2=sc.nextLine();
                    System.out.println("When did this student was born?");
                    dateOfBirth=sc.nextLine();
                    System.out.println("How many euros are his tuition Fees?");
                    tuitionFees=sc.nextLine();
                    System.out.println( "If you want to continue inserting students press 1. If you want to stop press 0");
                    k1=sc.nextLine();
                    while(!k1.equals("1")&&!k1.equals("0")){
                        System.out.println("Wrong input. Press 1 or 0");
                        k1=sc.nextLine();
                    }
                    Student student=new Student(name, lastName2, tuitionFees,dateOfBirth);
                    Student studentPerCourse=new Student(name,lastName2,dateOfBirth,tuitionFees,title,stream,type);
                    students.add(student);
                    studentsPerCourse.add(studentPerCourse.toStringStudentsPerCourse());
                }while(!k1.equals("0"));

                Course course=new Course(title,stream,type,start_date,end_date);// DEN EXW VALEI TA ASSIGNMENTS MESA
                courses.add(course);
                k++;
            }while (!(title.equals("0")));
            AskPrint ask=new AskPrint();
            AskPrint.askPrint(students,trainers,courses,assignments);//,assignmentsPerCourse,trainersPerCourse,studentsPerCourse);
        }
        else if (z.equals("2")){
            System.out.println("===============================================================================================================");
            System.out.println("You have chosen to see the default data of the School. Please follow the instructions beneath");
            HardCode hdList=new HardCode();
        }

    }
    /*public String lengthCheck(String x,int length1, int length2) {
        while (x.length() > length1 || x.length() < length2) {
            System.out.println("Your input should be between "+length1+"-"+length2 +" characters. Please insert a valid input");
            this.stream =sc.nextLine();
        }
        return x;
    }*/
}
