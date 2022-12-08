import java.util.random.*;
import java.util.ArrayList;
public class DiceRoll{
    private int Dice1 = 0; 
    private int Dice2 = 0;
    private int Dice3 = 0; 
    private int Dice4 = 0;
    private int Dice5 = 0; 
    
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
      if(getrollDice1()==true){
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

//getter methods
  public int Dice1(){
    return Dice1;
  }
  public int Dice2(){
    return Dice2;
  }
  public int Dice3(){
    return Dice3;
  }
  public int Dice4(){
    return Dice4;
  }
  public int Dice5(){
    return Dice5;
  }


}