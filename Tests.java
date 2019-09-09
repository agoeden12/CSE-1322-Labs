import java.util.Arrays;

//Andrew Goeden
public class Tests {


    String firstName, lastName;
    double gradeAverage;
    double[] grades = new double[5];
    public Tests(String firstName, String lastName, String[] grades) {
        setFirstName(firstName);
        setLastName(lastName);
        setGrades(grades);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double[] getGrades() {
        return grades;
    }

    public double getGradeAverage() {
        return gradeAverage;
    }

    public String getLetterGrade() {

        if (gradeAverage >= 90) {
            return "A";
        } else if (gradeAverage >= 80) {
            return "B";
        } else if (gradeAverage >= 70) {
            return "C";
        } else if (gradeAverage >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public void changeTestScore(int testNumber, double newScore) {
        try {
            grades[testNumber - 1] = newScore;
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public void setGradeAverage() {
        double total = 0.0;
        for (double d : grades) {
            total += d;
        }
        gradeAverage = total / grades.length;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGrades(String[] grades) {
        for (int i = 0; i < grades.length; i++) {
            this.grades[i] = Double.parseDouble(grades[i]);
        }

        setGradeAverage();
    }

    public void setGrades(double[] grades) {
        this.grades = grades;

        setGradeAverage();
    }


    @Override
    public String toString() {
        return String.format("%s %s " + Arrays.toString(grades) + " %2d %s", firstName, lastName, gradeAverage, getLetterGrade());
    }

}
