import java.util.Scanner;

public class RockPaperScissors {
  public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

      System.out.println("Let's play Rock Paper Scissors.");
      System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
      System.out.println("Are you ready? Write 'yes' if you are.");

      String choice = scan.next();

      if (choice.equals("yes")){
        System.out.println("Great!");
        System.out.println("rock - paper - scissors, shoot!");
        String yourChoice = scan.next();
        String computerChoice = computerChoice();
        System.out.println("\nYou chose: " + yourChoice);
        System.out.println("\nThe computer chose: " + computerChoice);
        String result = result(yourChoice, computerChoice);
        printResult(result);
      } else {
        System.out.println("Darn, some other time...!");
        System.exit(0);
      }
      scan.close();
  }

  public static String computerChoice() {
    int randomNumber = (int)(Math.random() * 3);
    switch(randomNumber){
      case 0: return "rock";
      case 1: return "paper";
      case 2: return "scissors";
      default: return "";
    }
  }

  public static String result(String yourChoice, String computerChoice){
    String result = "";

    if (yourChoice.equals("rock") && computerChoice.equals("scissors")){
      result = "You won!";
    } else if (yourChoice.equals("paper") && computerChoice.equals("rock")){
      result = "You won!";
    } else if (yourChoice == "scissors" && computerChoice == " paper"){
      result = "You won!";
    } else if (yourChoice.equals(computerChoice)){
      result = "It's a tie!";
    } else {
      result = "You lost...";
    }
    return result;
  }

  public static void printResult(String result){
    System.out.println(result);
  }

}
