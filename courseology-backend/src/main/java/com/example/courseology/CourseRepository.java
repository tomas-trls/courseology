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

    Course course5 = new Course("https://images.unsplash.com/photo-1661956600684-97d3a4320e45?ixlib=rb-4.0.3&ixid=MnwxMjA3fDF8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1770&q=80", "Digital Marketing Masterclass", "Marketing", "Learn the latest digital marketing tools and techniques to grow your online business or career. Covers social media, SEO, email marketing, and more!", 20, "Jane Smith", 4.8, 12000, 129, new String[]{
            "In-depth coverage of digital marketing strategies and tactics", "Suitable for beginners and experienced marketers", "Practical examples and real-world case studies", "Learn how to create effective digital marketing campaigns", "Taught by an experienced digital marketer"}, new String[]{"Introduction to digital marketing", "Search engine optimization (SEO)", "Social media marketing", "Content marketing", "Email marketing", "Pay-per-click (PPC) advertising", "Web analytics and tracking", "Marketing automation"}, "This course is a comprehensive guide to digital marketing that will help you grow your online business or career.", 1000);

    Course course6 = new Course("https://images.unsplash.com/photo-1516035069371-29a1b244cc32?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=928&q=80", "Photography Masterclass", "Photography", "Learn photography from scratch, including techniques for portrait, product, landscape, wildlife, and more. Suitable for beginners and hobbyists alike.", 20, "Jane Smith", 4.8, 8000, 49, new String[]{
            "Learn how to use your camera and its settings", "Master the art of composition and lighting", "Create stunning images for personal and professional use", "Get tips and tricks from a seasoned professional photographer", "Join a community of like-minded photography enthusiasts"}, new String[]{
            "Introduction to photography", "Camera settings and controls", "Composition techniques", "Lighting fundamentals", "Portrait photography", "Product photography", "Landscape photography", "Wildlife photography"}, "This course covers everything you need to know to become a skilled photographer and create stunning images.", 5000);

    Course course7 = new Course("https://images.unsplash.com/photo-1598488035139-bdbb2231ce04?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1770&q=80", "Music Production Masterclass", "Music", "Learn music production techniques to create professional-sounding tracks, including recording, mixing, mastering, and more. Suitable for aspiring producers and musicians of all genres.", 40, "Mike Brown", 4.2, 5000, 79, new String[]{
            "Understand the basics of music production", "Learn how to record and edit audio", "Master various software and tools for music production", "Mix and master your tracks to sound professional", "Get feedback and advice from experienced producers"}, new String[]{
            "Introduction to music production", "Recording and editing audio", "Digital audio workstations (DAWs)", "Virtual instruments and plugins", "MIDI and audio effects", "Mixing techniques", "Mastering techniques", "Publishing and distribution"}, "This course covers all aspects of music production and empowers you to create and release your own music.", 3000);

    Course course8 = new Course("https://images.unsplash.com/photo-1525201548942-d8732f6617a0?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1770&q=80",
            "Learn Guitar for Beginners", "Music", "Master the basics of playing guitar with this beginner course", 10,
            "Jane Smith", 4.7, 2500, 49, new String[]{
            "Learn the fundamentals of playing guitar",
            "No prior experience required",
            "Hands-on exercises to reinforce your learning",
            "Includes chords, strumming, and fingerpicking techniques"
    }, new String[]{
            "Introduction to guitar basics",
            "How to read guitar tabs and chord diagrams",
            "Strumming patterns and fingerpicking techniques",
            "Playing common chords and progressions",
            "Playing popular songs"
    }, "This course is designed to help beginners learn how to play guitar and develop a solid foundation for further learning.", 200);


    {
        coursesArr.addAll(List.of(course1,course2,course3, course4, course5, course6, course7, course8));
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
