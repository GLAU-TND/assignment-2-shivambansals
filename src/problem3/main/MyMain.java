package problem3.main;

import problem3.myqueue.MyPriorityQueue;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue mpq = new MyPriorityQueue();
        mpq.push("shiv", 1);
        mpq.push("shivam", 2);
        mpq.push("shivansh", 3);
        mpq.display();
    }
}