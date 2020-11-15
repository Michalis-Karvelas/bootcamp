package models;

public class Assignment {

    private String title2;
    private String description;
    private String subDateTime;
    //private String oralMark;
    //private String totalMark;
    private String title;
    private String stream;
    private String type;

    public Assignment (String title2, String description, String subDateTime) { //String oralMark, String totalMark)
        this.title2=title2;
        this.description=description;
        this.subDateTime=subDateTime;
        //this.oralMark=oralMark;
        //this.totalMark=totalMark;
    }

    public Assignment (String title2, String description, String subDateTime,String title,String stream,String type) { //String oralMark, String totalMark)
        this.title2=title2;
        this.description=description;
        this.subDateTime=subDateTime;
        this.title=title;
        this.stream=stream;
        this.type=type;
        //this.oralMark=oralMark;
        //this.totalMark=totalMark;
    }
    public String getTitle2() {
        return title2;
    }

    public void setTitle2(String title2) {
        this.title2 = title2;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubDateTime() {
        return subDateTime;
    }

    public void setSubDateTime(String subDateTime) {
        this.subDateTime = subDateTime;
    }

    /*public String getOralMark() {
        return oralMark;
    }

    public void setOralMark(String oralMark) {
        this.oralMark = oralMark;
    }

    public String getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(String totalMark) {
        this.totalMark = totalMark;
    }*/

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
        return "The assignment's title is: "+title2+". It's description is: "+description+" and it has to be submitted at "+subDateTime;
    }
    public String toStringAssignmentsPerCourse() {
        return "The assignment's title for course: " +title+ " "+stream +" "+type+"is: "+title2+". It's description is: "+description+" and it has to be submitted at "+subDateTime;
    }
}
