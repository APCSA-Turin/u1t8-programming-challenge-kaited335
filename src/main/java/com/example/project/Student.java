package com.example.project;

public class Student {
    // INSTANCE VARIABLES (private)
    private String firstName; // first name (String)
    private String lastName; // last name (String)
    private int gradYear; // graduation year (int)
    private double sumOfTestScores; // sum of test scores (double).. should initialize at 0.0
    private int testScoreCount; // test score count (int) ..should initialize at 0
    private double highestTestScore; // highest test score (double).. should initialize at 0.0
 
    // constructor
    public Student(String firstName, String lastName, int gradYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
        sumOfTestScores = 0.0;
        testScoreCount = 0;
        highestTestScore = 0.0;

    }
 
    // returns firstName
    public String getFirstName() {
        return firstName;
    }
 
    // returns lastName
    public String getLastName() {
        return lastName;
    }
 
    public double getHighestTestScore() {
        return highestTestScore;
    }

    public int getTestScoreCount(){
        return testScoreCount;
    }

    public int getGradYear(){
        return gradYear;
    }
 
    // sets gradYear to newGradYear
    public void setGradYear(int newGradYear) {
        gradYear = newGradYear;
    }
 
    // adds newTestScore to accumulatedTestScores
    // and increments testScoreCount by 1
    // set new highest test score 
    public void addTestScore(double newTestScore) {
        sumOfTestScores = sumOfTestScores + newTestScore;
        testScoreCount ++;
        if (newTestScore > highestTestScore) {
            highestTestScore = newTestScore;
        }
    }
 
    // returns true if the student's average test score is greater
    // than or equal to 65; returns false otherwise (see Note 2 below)
    public boolean isPassing() {
        if (averageTestScore() >= 65) {
            return true;
        } else {
        return false;
        }
    }
 
    // returns the Student's average test score as the
    // quotient of accumulatedTestScores and testScoreCount
    public double averageTestScore() {
        double average = (double) sumOfTestScores/testScoreCount;
        return average;
    }
 
    // this method prints all info of a Student object to the console 
    // I AM NOT TESTING YOU ON THIS METHOD. IT'S FOR YOUR TESTING PURPOSES ONLY.. you don't have to use it
    public void printStudentInfo() {
        System.out.println("Student Full Name: " );
        System.out.println("Graduation Year: ");
        System.out.println("Number of tests: ");
        System.out.println("Average Test Score: ");
        System.out.println("Highest Test Score: ");
        System.out.println("Is passing: ");
    }
 }
 