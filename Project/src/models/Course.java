package models;

import java.util.ArrayList;

public class Course {

    private String title;
    private String stream;
    private String type;
    private String start_date;
    private String end_date;
    private ArrayList<Assignment> assignments;

    public Course(String title, String stream, String type, String start_date, String end_date){ //, ArrayList<Assignment> assignments
        this.title=title;
        this.stream=stream;
        this.type=type;
        this.start_date=start_date;
        this.end_date=end_date;
        //this.assignments=assignments;
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

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(ArrayList<Assignment> assignments) {
        this.assignments = assignments;
    }

    @Override
    public String toString() {
        return "The course's title is: " + title + " of stream: " + stream +" and type " +type+ ". It starts at: "+start_date + " and ends at " + end_date;
    }
}

