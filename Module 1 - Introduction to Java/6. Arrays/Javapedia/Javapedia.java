import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        //Task 1 – Ask the user: how many historical figures will you register?
        //       – Store the value.
        int number = scan.nextInt();
        scan.nextLine();
        //Task 2 – Create a 2D array with a variable number of rows, and 3 values per row.
        String[][] database = new String[number][3];
        //Watch out for the nextLine() pitfall.
        //Task 3
        for (int i = 0; i < database.length; i++ ) {
            System.out.println("\n\tFigure " + (i+1));
            System.out.print("\t - Name: ");
            database[i][0] = scan.nextLine();
            System.out.print("\t - Date of birth: ");
            database[i][1] = scan.nextLine();
            System.out.print("\t - Occupation: ");
            database[i][2] = scan.nextLine();
            System.out.print("\n");
        }


        System.out.println("These are the values you stored:");
        //Task 4: call print2DArray.
        print2DArray(database);

        System.out.print("\nWho do you want information on? ");
        String name = scan.nextLine();
        for (int i = 0; i < database.length; i++){
          if (name.equals(database[i][0])){
            System.out.println("\tName: " + database[i][0]);
            System.out.println("\tDate of Birth: " + database[i][1]);
            System.out.print("\tOccupation:" + database[i][2]);
          }
        }
        scan.close();
    }


    public static void print2DArray(String[][] array){
      for (int i = 0; i < array.length; i++){
        System.out.print("\t ");
        for (int j = 0; j < array[0].length; j++){
          System.out.print(array[i][j]);
          System.out.print(" ");
        }
        System.out.print("\n");
      }
    }
  }
