import java.io.*;
import java.util.ArrayList;
public class Yahtzee {
  public int rollsLeft = 3;
  public int lives = 2;
  private int Dice1 = 0; 
  private int Dice2 = 0;
  private int Dice3 = 0; 
  private int Dice4 = 0;
  private int Dice5 = 0; 
  private boolean rollDice1 = true;
  private boolean rollDice2 = true;
  private boolean rollDice3 = true;
  private boolean rollDice4 = true;
  private boolean rollDice5 = true;

  ArrayList<Integer> diceRolls = new ArrayList<>();
    
//roll method 
    public void roll(){
      if(diceRolls.size() == 5){
        diceRolls.remove(4);
        diceRolls.remove(3);
        diceRolls.remove(2);
        diceRolls.remove(1);
        diceRolls.remove(0);
      }
      if(getrollDice1()){
        Dice1 = (int)(Math.random()*6) + 1; 
      }
      if(getrollDice2()==true){
        Dice2 = (int)(Math.random()*6) + 1;
      }
      if(getrollDice3()==true){
        Dice3 = (int)(Math.random()*6)+1;
      }
      if(rollDice4){
        Dice4 = (int)(Math.random()*6)+1;
      }
      if(rollDice5){
        Dice5 = (int)(Math.random() * 6 )+ 1;
      }
        diceRolls.add(Dice1);
        diceRolls.add(Dice2);
        diceRolls.add(Dice3);
        diceRolls.add(Dice4);
        diceRolls.add(Dice5);
  }


  public void printRolls(){
    for(int i = 0; i < diceRolls.size(); i++){
      System.out.println(diceRolls.get(i));
    }
  }



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
    //  if (diceRolls[0] == diceRolls[1] || diceRolls[0] == diceRolls[2] || diceRolls[0] == diceRolls[3] || diceRolls[0] == diceRolls[4])
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