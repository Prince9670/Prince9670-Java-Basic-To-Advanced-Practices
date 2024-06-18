package challenge94;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return student.getGrade() - t1.getGrade();
            }
        });
        queue.offer(new Student("Prince", 'B'));

    }


    private static class Student {
        private final String name;

        private final char grade;


        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }
    }
}

