package data_structure_algorithm.likedlist;

import java.util.LinkedList;

public class StudentLinkedList {

    public static void main(String[] args) {

        LinkedList<Student> stList= new LinkedList<>();
        Student s1=new Student(111,"Sarker Rashid","Master Degree");
        Student s2= new Student(112,"Rajib Chawdhury","Master Degree");
        Student s3= new Student(113,"Sumon Miazee","Master Degree");
        Student s4= new Student(114,"Nabila Bhuiyan","Master Degree");

        stList.add(s1);
        stList.add(s2);
        stList.add(s3);
        stList.add(s4);
        for(Student s:stList){
            System.out.println(s.stId+"\t"+s.stName+"\t"+s.stClassName);
        }
    }
}
