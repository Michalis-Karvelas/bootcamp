package models;

import java.util.ArrayList;

public class HardCode {
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Trainer> trainers = new ArrayList<>();
    ArrayList<Course> courses = new ArrayList<>();
    ArrayList<Assignment> assignments= new ArrayList<>();

    public HardCode(){
        students.add(new Student("Mixalis", "Karvelas", "0", "12/04/1992"));
        students.add(new Student("Lefteris", "Papadogiannis", "0", "19/09/1991"));
        students.add(new Student("Giorgos", "Ntaskaris", "1000", "14/06/1994"));
        students.add(new Student("Kuriaki", "Maniki", "450", "16/07/1992"));
        students.add(new Student("Sofia", "Kosti", "0", "05/01/2000"));
        students.add(new Student("Vasilis", "Papoutsis", "640", "17/08/1992"));
        students.add(new Student("Panos", "Karagiannelos", "0", "21/10/1992"));
        students.add(new Student("Dimitris", "Tragidis", "1500", "26/11/1991"));
        students.add(new Student("Nikolas", "Karavasilis", "200", "25/09/1995"));
        students.add(new Student("Aggelos", "Papanastasiou", "0", "05/10/1999"));
        students.add(new Student("Xristos", "Vlachos", "1700", "26/04/2001"));
        students.add(new Student("Anastasia", "Kollia", "450", "14/06/1994"));
        students.add(new Student("Tasos", "Pagonis", "700", "30/12/1991"));
        students.add(new Student("Dimitris", "Dimitriadis", "2000", "06/04/2003"));

        trainers.add(new Trainer("Vladimiros","Fotiadis" , "Java"));
        trainers.add(new Trainer("George","Pasparakis" , ""));
        trainers.add(new Trainer("Dimitris","Nikolidakis" , "ta pada ola, einai o mpampas sas"));
        trainers.add(new Trainer("Rania","Bousiou" , ""));

        courses.add(new Course("CB7","Java","Part Time","16/12/2019","05/06/2020"));
        courses.add(new Course("CB7","Python","Part Time","16/12/2019","05/06/2020"));//,assignments
        courses.add(new Course("CB7","Python","Full Time","12/03/2020","29/06/2020"));
        courses.add(new Course("CB7","Java","Full Time","12/03/2020","29/06/2020"));
        courses.add(new Course("CB12","Java","Part Time","15/07/2020","26/01/2021"));
        courses.add(new Course("CB12","Java","Full Time","19/10/2020","16/02/2021"));
        courses.add(new Course("CB12","C#","Part Time","15/07/2020","26/01/2021"));
        courses.add(new Course("CB12","C#","Full Time","19/10/2020","16/02/2021"));

        assignments.add(new Assignment("Exercise 1","" ,"" )); //,"A" ,"B" ));
        assignments.add(new Assignment("Exercise 2","" ,"" ));  //,"C" ,"B" ));
        assignments.add(new Assignment("Project","" ,"" ));  //,"B" ,"B" ));
        assignments.add(new Assignment("Exercise 1","" ,"" )); //,"B" ,"A" ));
        assignments.add(new Assignment("Exercise 2","" ,""));// ,"C" ,"B" ));
        assignments.add(new Assignment("Project","" ,"" ));//,"B" ,"B" ));
        assignments.add(new Assignment("Exercise 1","" ,"" ));//,"F" ,"C" ));
        assignments.add(new Assignment("Exercise 2","" ,"" ));//,"B" ,"C" ));
        assignments.add(new Assignment("Project","" ,"" ));//,"A" ,"A" ));
        assignments.add(new Assignment("Exercise 1","" ,"" ));//,"F" ,"D" ));
        assignments.add(new Assignment("Exercise 2","" ,"" ));//,"A" ,"A" ));
        assignments.add(new Assignment("Project","" ,""));//  ,"A" ,"B" ));
        assignments.add(new Assignment("Exercise 1","" ,""));// ,"B" ,"C" ));
        assignments.add(new Assignment("Exercise 2","" ,""));// ,"B" ,"A" ));
        assignments.add(new Assignment("Project","" ,"" ));//,"B" ,"B" ));

        AskPrint ask=new AskPrint();
        AskPrint.askPrint(students,trainers,courses,assignments);

    }
}
