package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import student.Student;

public class StudentReaderIO {

    public static ArrayList<Student> readStudentRoll(String fileName) {
       Scanner reader;
       ArrayList<Student> students = new ArrayList<>();
    
            try {
                reader = new Scanner(new File(fileName));
            } catch (FileNotFoundException e) {
                throw new IllegalArgumentException("Invalid File.");
            }


        try {
        while(reader.hasNextLine()) {

            try {
            Student student = readStudent(reader.nextLine());
            students.add(student);
            } catch (Exception e) {
                throw new IllegalArgumentException("Invalid Student");
            }

            
        }
        
     
   
   
   
       reader.close();
       return students;
    } catch(Exception e) {
        return null;
    }
   
    

        
    }

    private static Student readStudent(String line) {
    try {
       Scanner studentReader = new Scanner(line);
       studentReader.useDelimiter(",");

       String firstName = studentReader.next();
       String lastName = studentReader.next();
       int id = studentReader.nextInt();
       studentReader.close();

       return new Student(firstName, lastName, id);

    } catch (Exception e) {
        throw new IllegalArgumentException("Invalid Student");
    }    

    }

}
