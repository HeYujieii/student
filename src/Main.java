import java.util.Scanner;

public class Main { 
    public static void main(String[] args){

        Scanner reader=new Scanner(System.in);

        System.out.println("How many Student details you want to add?");
        int count=reader.nextInt();
        reader.nextLine();

        Student [] studentArr=new Student[count];

        for(int i=0;i<count;i++){
            System.out.println("Enter the student ID:");
            String id=reader.nextLine();

            System.out.println("Enter the student name:");
            String name=reader.nextLine();

            System.out.println("Enter the number of Extraactivities this student has:");
            int num=reader.nextInt();
            reader.nextLine();
            studentArr[i]=new Student(id,name,num);
        }

        System.out.println("Enter the number of Extraactivities this student has:");
        int num=reader.nextInt();
        reader.nextLine();

        Student student=new Student("001", "John",num);

        student.addextraActivities(num);

        System.out.println(student);

        reader.close();
    }
}