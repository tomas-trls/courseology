package com.example.courseology;

import java.util.Random;

public class Course {
    private static long nextId = 1;
    private long id;
    private String image;
    private String name;
    private String category;
    private String information;
    private long completionTime;
    private String author;
    private double rating;
    private long numberOfRatings;
    private int price;
    private String[] summary;
    private String[] syllabus;
    private String description;
    private long numberOfStudents;

    public Course() {
    }

    public Course(String image, String name, String category, String information, long completionTime, String author, double rating, long numberOfRatings, int price, String[] summary, String[] syllabus, String description, long numberOfStudents) {
        this.id = nextId; ;
        nextId++;
        this.image = image;
        this.name = name;
        this.category = category;
        this.information = information;
        this.completionTime = completionTime;
        this.author = author;
        this.rating = rating;
        this.numberOfRatings = numberOfRatings;
        this.price = price;
        this.summary = summary;
        this.syllabus = syllabus;
        this.description = description;
        this.numberOfStudents = numberOfStudents;
    }

    public long generateId(){
        return id++;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public long getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(long completionTime) {
        this.completionTime = completionTime;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public long getNumberOfRatings() {
        return numberOfRatings;
    }

    public void setNumberOfRatings(long numberOfRatings) {
        this.numberOfRatings = numberOfRatings;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String[] getSummary() {
        return summary;
    }

    public void setSummary(String[] summary) {
        this.summary = summary;
    }

    public String[] getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(String[] syllabus) {
        this.syllabus = syllabus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(long numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
}
