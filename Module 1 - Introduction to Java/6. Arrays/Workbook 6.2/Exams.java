public class Exams {
    public static void main(String[] args) {
        String[] students = {"Malfoy", "Crabbe", "Goyle", "Pansy", "Dean"};

        // Instructions for this workbook are on Learn the Part (Workbook 6.2).
        System.out.println("It's time to take your 5th years exams. Please, take your seats.\n");

        for (int i = 0; i < students.length; i++){
          System.out.println(students[i] + ", you will take seat " + i);
        }

        // Compare your result to what's on Learn the Part.

    }
}
