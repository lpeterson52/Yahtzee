import java.io.*;
public class Yahtzee {
  public int rollsLeft = 3;
  public int lives = 2;
  private boolean rollDice1 = true;
  private boolean rollDice2 = true;
  private boolean rollDice3 = true;
  private boolean rollDice4 = true;
  private boolean rollDice5 = true;
  


  public void runGame(){
   


    
  }
  public void keepDice(){
  Console console = System.console();

  String inputString = console.readLine("Enter the dice you want to keep (0 to keep 1 to roll): ");

  System.out.println("The dice you want to keep: " + inputString);
  rollDice1 = inputString.substring(0,1).equals("1");
  rollDice2 = inputString.substring(1,2).equals("1");
  rollDice3 = inputString.substring(2,3).equals("1");
  rollDice4 = inputString.substring(3,4).equals("1");
  rollDice5 = inputString.substring(4,5).equals("1");
  System.out.println(rollDice1);
  }
  public boolean Threeofakind(){
    int x = 0;
    //  if (diceRolls[0] = diceRolls[1] || diceRolls[0] = diceRolls[2] || diceRolls[0] = diceRolls[3] || diceRolls[0] = diceRolls[4])
        return false;
  } 
  
  public boolean getrollDice1(){
    return rollDice1;
  }

  public boolean getrollDice2(){
    return rollDice2;
  }

  public boolean getrollDice3(){
    return rollDice3;
  }

  public boolean getrollDice4(){
    return rollDice4;
  }

  public boolean getrollDice5(){
    return rollDice5;
  }
}