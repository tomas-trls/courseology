package com.example.courseology;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepository {

    private ArrayList<Course> coursesArr = new ArrayList();

    Course course1 = new Course("https://img-c.udemycdn.com/course/240x135/394676_ce3d_5.jpg", "Python Course", "Data Science", "Learn python and how to use it to analyze,visualize and present data. Includes tons of sample code and hours of video!", 29, "John Doe", 4.3, 50000, 99, new String[]{
            "This course covers the fundamentals of Java programming", "Suitable for beginners and those with some programming experience", "Learn about variables, data types, control structures, and more", "Hands-on exercises to reinforce your learning", "Taught by an experienced Java developer"}, new String[]{"Introduction to Java and its environment", "Variables and data types", "Control structures and loops", "Arrays and collections", "Object-oriented programming concepts", "Exception handling", "File I/O", "Introduction to GUI programming with Swing"}, "This course provides a solid foundation in Python programming and is suitable for beginners.", 500);
    Course course2 = new Course("https://images.unsplash.com/photo-1633356122544-f134324a6cee?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1740&q=80", "Web Development with React", "Web Development", "Learn how to develop web applications using React", 25, "Jane Doe", 4.2, 30, 29, new String[]{"Build web applications using React", "Understand how to use React components", "Learn how to manage state in React applications"}, new String[]{"Introduction to React", "React Components", "React State Management", "React and APIs"}, "This course provides hands-on experience in building web applications using React.", 1200);
    Course course3 = new Course("https://images.unsplash.com/photo-1510511459019-5dda7724fd87?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1740&q=80", "Data Science with Python", "Data Science", "Learn how to analyze and visualize data using Python", 40, "Mark Johnson", 4.8, 80, 49, new String[]{"Introduction to Data Science with Python", "Data Analysis with Pandas", "Data Visualization with Matplotlib", "Machine Learning with Scikit-learn"}, new String[]{"Introduction to Data Science with Python", "Data Wrangling with Pandas", "Data Visualization with Matplotlib", "Supervised Learning with Scikit-learn"}, "This course provides a comprehensive introduction to data science using Python.", 1000);
    Course course4 = new Course("https://images.unsplash.com/photo-1588239034647-25783cbfcfc1?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=928&q=80", "Java Programming for Beginners", "Computer Science", "Learn the fundamentals of Java programming language", 15, "David Brown", 3.9, 20, 14, new String[]{"Introduction to Java Programming", "Variables and Data Types", "Conditional Statements", "Loops"}, new String[]{"Introduction to Java Programming", "Data Types and Variables", "Control Structures", "Arrays and Strings"}, "This course is designed for beginners who want to learn Java programming language.", 800);

    {
        coursesArr.addAll(List.of(course1,course2,course3,course4));
    }


    //CREATE
    public void addCourse(Course course) {
        coursesArr.add(course);
    }


    //READ
    public ArrayList<Course> getAllCourses() {
        return coursesArr;
    }

    public Course getCourseById(int id) {
        if (id > 0 && id <= coursesArr.size()) {
            for (Course course : coursesArr) {
                if (course.getId() == id) {
                    return course;
                }
            }
        }
        return null;
    }


    //UPDATE

    //DELETE
}
