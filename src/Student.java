import java.util.Scanner;
import java.util.Arrays;

public class Student{

    Scanner reader=new Scanner(System.in);
    private String studentID;
    private String studentName;
    private String [] studentExtraactivities;

    public Student(String studentID,String studentName,int num){
        this.studentID=studentID;
        this.studentName=studentName;
        studentExtraactivities=new String[num];
    }

    public Student(){}

    public String getStudentID(){
        return studentID;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentID(String studentID){
        this.studentID=studentID;
    }

    public void setStudentName(String studentName){
        this.studentName=studentName;
    }

    public void setStudentExtraactivities(String [] studentExtraactivities){
        this.studentExtraactivities=studentExtraactivities;
    }

    public String[] getStudentExtraactivities() {
        return studentExtraactivities;
    }

    public void addextraActivities(int num){
        for(int i=0;i<num;i++){
            System.out.println("enter hobby"+(i+1));
            studentExtraactivities[i] =reader.nextLine();
        }

    }

    public String toString(){

    return "Student ID:" + studentID + " \n"+
    "Student Name: " + studentName+"\n" + 
    "Student Extraactivities=" + Arrays.toString(studentExtraactivities) +"\n";
    }

}