/*
1.3 Choose your own path
Authors: Palak J, Jake G, Harper H
Date: 10/11/22
Course: APCSA 1
Description: Gets user input to let them make their decisions and choose the path they want to go on
*/
import java.util.Scanner;
public class choseYourOwnAdventure {
   public static void main(String[] args)
   {
       //create a new scanner
       Scanner input = new Scanner(System.in);
       // asks user the first question
       System.out.println("Do you want to go outside or stay inside for recess? \n a for inside, b for outside");
       String input1 = input.nextLine();
      
       //first if statement to check which answer the user chose for the first question
       if (input1.equals("a"))
       {
           // asks user the next question
           System.out.println("Do you want to eat a snack or play a game? \n a for snack, b for play game");
           String input2 = input.nextLine();
      
           //second if statement to check which answer the user chose for the second question
           if(input2.equals("a"))
           {
               // asks user the next question
               System.out.println("Do you want to eat fruits or chips? \n a or fruits, b for chips");
               String input3 = input.nextLine();
               //third if statement to check which answer the user chose for the question
               if (input3.equals("a"))
               {
                   //prints the final story to the user based on their choices
                   if(input1.equals("a") && input2.equals("a") && input3.equals("a"))
                   {
                       System.out.println("You chose to stay inside and eat fruits for your snack!");
                   }
               }
               //else if statement to check other choice
               else if (input3.equals("b"))
               {
                   //prints the final story to the user based on their choices
                   if(input1.equals("a") && input2.equals("a") && input3.equals("b"))
                   {
                       System.out.println("You chose to stay inside and eat chips for your snack!");
                   }
               }
           }
           //else if statement to run for the 2nd choice in the second question
           else if (input2.equals("b"))
           {
               // asks user the next question
               System.out.println("Do you want to play cards or video games? \n a or cards, b for video games");
               String input4 = input.nextLine();
               //if statement to run if the user chose the first option for the question
               if (input4.equals("a"))
               {
                   //prints the final story to the user based on their choices
                   if(input1.equals("a") && input2.equals("b") && input4.equals("a"))
                   {
                       System.out.println("You chose to stay inside and play cards for your game!");
                   }              
               }
               //else if statement to run if the user chose the first option for the question
               else if (input4.equals("b"))
               {
                   //prints the final story to the user based on their choices
                   if(input1.equals("a") && input2.equals("b") && input4.equals("b"))
                   {
                       System.out.println("You chose to stay inside and play videogames for your game!");
                   } 
               }
           }
          
       }
       //else if statement to run for the 2nd choice in the first question
       else if (input1.equals("b"))
       {
           // asks user the next question
           System.out.println("a for Jumprope, b for basketball or c for draw");
           String input5 = input.nextLine();
           //if statement to run if the user chose the first option for the question
           if (input5.equals("a"))
           {
               // asks user the next question
               System.out.println("Do you want to jumprope by yourself or with a friend? \n a alone or b with friend");
               String input6 = input.nextLine();
               //if statement to run if the user chose the first option for the question
               if (input6.equals("a"))
               {
                   //prints the final story to the user based on their choices
                   if(input1.equals("b") && input5.equals("a") && input6.equals("a"))
                   {
                       System.out.println("You chose to go outside and jumprope by yourself!");
                   }
               }
               //else if statement to run if the user chose the second  option for the question
               else if (input6.equals("b"))
               {
                   //prints the final story to the user based on their choices
                   if(input1.equals("b") && input5.equals("a") && input6.equals("b"))
                   {
                       System.out.println("You chose to go ouside and jumprope with a friend!");
                   }
               }
           }
           //else if statement to run if the user chose the second option for the question
           else if (input5.equals("b"))
           {
               // asks user the next question
               System.out.println("Do you want to play 1v1 (a) or on a team (b)?");
               String input7 = input.nextLine();
               //if statement to run if the user chose the first option for the question
               if (input7.equals("a"))
               {
                   //prints the final story to the user based on their choices
                   if(input1.equals("b") && input5.equals("b") && input7.equals("a"))
                   {
                       System.out.println("You chose to go outside and play 1v1 basketball!");
                   }
               }
               //else if statement to run if the user chose the second option for the question
               else if (input7.equals("b"))
               {
                   //prints the final story to the user based on their choices
                   if(input1.equals("b") && input5.equals("b") && input7.equals("b"))
                   {
                       System.out.println("You chose to go outside and play basketball with a team!");
                   }
               }
           }
           //else if statement to run if the user chose the third option for the question
           else if (input5.equals("c"))
           {
               // asks user the next question
               System.out.println("Do you want to draw with crayons (a) or colored pencils (b)?");
               String input8 = input.nextLine();
               //if statement to run if the user chose the first option for the question
               if (input8.equals("a"))
               {
                   //prints the final story to the user based on their choices
                   if(input1.equals("b") && input5.equals("c") && input8.equals("a"))
                   {
                       System.out.println("You chose to go outside and draw with crayons!");
                   }
               }
               //else if statement to run if the user chose the second option for the question
               else if (input8.equals("b"))
               {
                   //prints the final story to the user based on their choices
                   if(input1.equals("b") && input5.equals("c") && input8.equals("b"))
                   {
                       System.out.println("You chose to go outside and draw with colored pencils!");
                   }
               }
           }
       }
       input.close();
   }
}
 

