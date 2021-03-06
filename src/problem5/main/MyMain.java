package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

//executable class
public class MyMain {
    public static void main(String[] args) {
        MyCircularQueue mcq = new MyCircularQueue();
        Student stu1 = new Student("shiv", 0, 1);
        Student stu2 = new Student("shivam", 2, 4);
        Student stu3 = new Student("shivansh", 2, 1);
        Student stu4 = new Student("nikhlesh", 0, 1);
        mcq.insert(stu1);
        mcq.insert(stu2);
        mcq.insert(stu3);
        mcq.insert(stu4);
        Student remove = mcq.remove();
        if (remove != null) {
            System.out.println("removed student-" + remove.getName());
        }
        remove = mcq.remove();

        if (remove != null) {
            System.out.println("removed student-" + remove.getName());
        }
        remove = mcq.remove();

        if (remove != null) {
            System.out.println("removed student-" + remove.getName());
        }
        remove = mcq.remove();

        if (remove != null) {
            System.out.println("removed student-" + remove.getName());
        }
        mcq.display();



    }
}