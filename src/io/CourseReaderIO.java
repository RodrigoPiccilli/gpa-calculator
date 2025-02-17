package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import course.Course;
import student.Student;

public class CourseReaderIO {

    public static void readCourses(String fileName, ArrayList<Student> students) {
        Scanner reader;

        try {
            reader = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
           throw new IllegalArgumentException("Invalid File.");
        }

        reader.useDelimiter("#");
        while(reader.hasNext()) {
            processCourses(reader.next(), students);
        }





        

    }

    private static void processCourses(String line, ArrayList<Student> students) {
        Scanner courseReader = new Scanner(line);

        courseReader.useDelimiter(",");

        String name = courseReader.next();
        String title = courseReader.next();
        int section = courseReader.nextInt();
        String instructor = courseReader.next();
      //  courseReader.nextLine();
        
        Course course = new Course(name, title, section, instructor, 0);
        courseReader.useDelimiter("-");

        while(courseReader.hasNext()) {
            processStudent(courseReader.next(), students, course);
        }
        





    }

    private static void processStudent(String line, ArrayList<Student> students, Course course) {

        Scanner reader = new Scanner(line);
        reader.useDelimiter(",");

        while(reader.hasNext()) {

            String value = reader.next().toLowerCase().trim();

            
            for (int i = 0; i < students.size(); i++) {
                
                String studentName = (students.get(i).getFirstName() + "" + students.get(i).getLastName()).toLowerCase();
                if(value == studentName) {

                    students.get(i).getCourses().add(course);
                    students.get(i).getCourses().get(students.get(i).getCourses().size() - 1).setGrade(reader.nextInt());
                    reader.nextLine();
                }
                
            }



        }


        return;



    }

   

}
