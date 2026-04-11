class Student
{
    int rollno;
    String name;
    int marks;
}

public class hello {
    
    public static void main(String agrs[]){
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "John";
        s1.marks = 89;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Rom";
        s2.marks = 95;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Smith";
        s3.marks = 80;

        System.out.println(s1.name + ":" + s1.marks);

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for(int i=0 ; i<students.length ; i++){
        //     System.out.println(students[i].name + ":" + students[i].marks);
        // }

        //enhanced for loop

        for(Student stud : students){
            System.out.println(stud.name + ":" + stud.marks);
        }
    }
}
