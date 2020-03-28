/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

import java.util.Scanner;

//executable class
public class MyMain {
    public static void main(String[] args) {
        MyCircularQueue<Student> myCircularQueue = new MyCircularQueue<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of Students you want to add in queue :");
        int n = scanner.nextInt();
        scanner.nextLine();
    }

}
