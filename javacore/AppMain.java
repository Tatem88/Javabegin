package Lesson9;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppMain {
    static class Student {
        enum Course {
            Math, It, Management;
        }

        private String name;
        private int courseCount;
        private String  course;


        public Student(String name, int courseCount,   String course) {
            this.name = name;
            this.courseCount = courseCount;
            this.course = course;

        }

        public String getName() {
            return name;
        }
    }

    private static void streamSimpleTask() {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Bob1", 25, "Math"),
                new Student("Bob2", 18, "It"),
                new Student("Bob3", 19, "It"),
                new Student("Bob4", 20, "Math"),
                new Student("Bob5", 21, "Management"),
                new Student("Bob6", 22, "It"),
                new Student("Bob7", 23, "Math"),
                new Student("Bob8", 24, "It")
        ));

        List<String> studentCourses = students.stream()
                .map((Function<Student, String>) student -> student.course)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(studentCourses);


        List<String> topStudents = students.stream()
                .map((Function<Student, String>) student -> String.valueOf(student.courseCount))
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(topStudents);
    }

    public static void main(String[] args) {
        streamSimpleTask();
    }
}