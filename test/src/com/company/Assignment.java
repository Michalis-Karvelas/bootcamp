package com.company;

public class Assignment {
    private String title2;
    private String description;
    private String subDateTime;
    private String oralMark;
    private String totalMark;
    public Assignment (String title2, String description, String subDateTime, String oralMark, String totalMark){
        this.title2=title2;
        this.description=description;
        this.subDateTime=subDateTime;
        this.oralMark=oralMark;
        this.totalMark=totalMark;
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

    public String getOralMark() {
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
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "title2='" + title2 + '\'' +
                ", description='" + description + '\'' +
                ", subDateTime='" + subDateTime + '\'' +
                ", oralMark='" + oralMark + '\'' +
                ", totalMark='" + totalMark + '\'' +
                '}';
    }
}
