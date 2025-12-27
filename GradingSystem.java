import java.util.Scanner;

interface GradeCalculation {
    char calculateGrade();
}

class Grade implements GradeCalculation {
    protected double score;

    public Grade(double score) {
        this.score = score;
    }

    // Common method to get grade based on score
    public char getGrade() {
        if (score >= 85) {
            return 'A';
        } else if (score >= 70) {
            return 'B';
        } else if (score >= 60) {
            return 'C';
        } else if (score >= 45) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public char calculateGrade() {
        return getGrade();
    }
}

class Homework extends Grade {
    public Homework(double score) {
        super(score);
    }
}

class Quiz extends Grade {
    public Quiz(double score) {
        super(score);
    }
}

class Exam extends Grade {
    public Exam(double score) {
        super(score);
    }
}

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the score for Homework: ");
        double homeworkScore = sc.nextDouble();

        System.out.println("Enter the score for Quiz: ");
        double quizScore = sc.nextDouble();

        System.out.println("Enter the score for Exam: ");
        double examScore = sc.nextDouble();

        GradeCalculation homework = new Homework(homeworkScore);
        GradeCalculation quiz = new Quiz(quizScore);
        GradeCalculation exam = new Exam(examScore);

        System.out.println("Homework Grade: " + homework.calculateGrade());
        System.out.println("Quiz Grade: " + quiz.calculateGrade());
        System.out.println("Exam Grade: " + exam.calculateGrade());

        sc.close();
    }
}
