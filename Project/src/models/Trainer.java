package models;

public class Trainer {

    private String firstName;
    private String lastName2;
    public String subject; //public ArrayList<String> subjects();
    private String title;
    private String stream;
    private String type;

    public Trainer(String firstName, String lastName2, String subject){
        this.firstName=firstName;
        this.lastName2=lastName2;
        this.subject=subject;
    }
    public Trainer(String firstName, String lastName2,String title,String stream,String type){
        this.firstName=firstName;
        this.lastName2=lastName2;
        this.subject=subject;
        this.title=title;
        this.stream=stream;
        this.type=type;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return  "The trainer's name is: "+firstName +" "+ lastName2 + " and teaches " + subject;
    }
    public String toString2(){
        return firstName+ " " +lastName2;
    }
    public String toStringTrainersPerCourse(){
        return "In course: " +title+ " " +stream+ " "+type+ "the teachers that teach are: \n"+firstName+ " "+lastName2 ;
    }
    public String toStringTrainersPerCourse2(){
        return firstName+ " "+lastName2 ;
    }
}
