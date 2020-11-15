package models;

public class Student {
    private String name;
    private String lastName;
    private String tuitionFees;
    private String dateOfBirth;
    private String title;
    private String stream;
    private String type;

    public Student(String name, String lastName, String tuitionFees, String dateOfBirth){
        this.name=name;
        this.lastName=lastName;
        this.tuitionFees=tuitionFees;
        this.dateOfBirth=dateOfBirth;

    }
    public Student(String name, String lastName, String tuitionFees, String dateOfBirth,String title, String stream,String type){
        this.name=name;
        this.lastName=lastName;
        this.tuitionFees=tuitionFees;
        this.dateOfBirth=dateOfBirth;
        this.title=title;
        this.stream=stream;
        this.type=type;

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(String tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    @Override
    public String toString() {
        return "The name of student is: " + name +" "+ lastName+ " born at: "+dateOfBirth+  " with tuition fees of " +tuitionFees+ " Euro";
    }
    public String toStringStudentsPerCourse(){
        return "Enrolled in course: " +title+ " "+stream +" "+type+"is: " + name+ " "+ lastName+ " born at: "+dateOfBirth+  " with tuition fees of " +tuitionFees+ " Euro";
    }
}
