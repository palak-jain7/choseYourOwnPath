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
       if (input1 == "a")
       {
           // asks user the next question
           System.out.println("Do you want to eat a snack or play a game? \n a for snack, b for play game");
           String input2 = input.nextLine();
      
           //second if statement to check which answer the user chose for the second question
           if(input2 == "a")
           {
               // asks user the next question
               System.out.println("Do you want to eat fruits or chips? \n a or fruits, b for chips");
               String input3 = input.nextLine();
               //third if statement to check which answer the user chose for the question
               if (input3 == "a")
               {
                   //prints the final story to the user based on their choices
                   if(input1 == "a" && input2 == "a" && input3 == "a")
                   {
                       System.out.println("You chose to stay inside and eat fruits for your snack!");
                   }
               }
               //else if statement to check other choice
               else if (input3 == "b")
               {
                   //prints the final story to the user based on their choices
                   if(input1 == "a" && input2 == "a" && input3 == "b")
                   {
                       System.out.println("You chose to stay inside and eat chips for your snack!");
                   }
               }
           }
           //else if statement to run for the 2nd choice in the second question
           else if (input2 == "b")
           {
               // asks user the next question
               System.out.println("Do you want to play cards or video games? \n a or cards, b for video games");
               String input4 = input.nextLine();
               //if statement to run if the user chose the first option for the question
               if (input4 == "a")
               {
                   //prints the final story to the user based on their choices
                   if(input1 == "a" && input2 == "b" && input4 == "a")
                   {
                       System.out.println("You chose to stay inside and play cards for your game!");
                   }              
               }
               //else if statement to run if the user chose the first option for the question
               else if (input4 == "b")
               {
                   //prints the final story to the user based on their choices
                   if(input1 == "a" && input2 == "b" && input4 == "b")
                   {
                       System.out.println("You chose to stay inside and play videogames for your game!");
                   } 
               }
           }
          
       }
       //else if statement to run for the 2nd choice in the first question
       else if (input1 == "b")
       {
           // asks user the next question
           System.out.println("a for Jumprope, b for basketball or c for draw");
           String input5 = input.nextLine();
           //if statement to run if the user chose the first option for the question
           if (input5 == "a")
           {
               // asks user the next question
               System.out.println("Do you want to jumprope by yourself or with a friend? \n a alone or b with friend");
               String input6 = input.nextLine();
               //if statement to run if the user chose the first option for the question
               if (input6 == "a")
               {
                   //prints the final story to the user based on their choices
                   if(input1 == "b" && input5 == "a" && input6 == "a")
                   {
                       System.out.println("You chose to go outside and jumprope by yourself!");
                   }
               }
               //else if statement to run if the user chose the second  option for the question
               else if (input6 == "b")
               {
                   //prints the final story to the user based on their choices
                   if(input1 == "b" && input5 == "a" && input6 == "b")
                   {
                       System.out.println("You chose to go ouside and jumprope with a friend!");
                   }
               }
           }
           //else if statement to run if the user chose the second option for the question
           else if (input5 == "b")
           {
               // asks user the next question
               System.out.println("Do you want to play 1v1 (a) or on a team (b)?");
               String input7 = input.nextLine();
               //if statement to run if the user chose the first option for the question
               if (input7 == "a")
               {
                   //prints the final story to the user based on their choices
                   if(input1 == "b" && input5 == "b" && input7 == "a")
                   {
                       System.out.println("You chose to go outside and play 1v1 basketball!");
                   }
               }
               //else if statement to run if the user chose the second option for the question
               else if (input7 == "b")
               {
                   //prints the final story to the user based on their choices
                   if(input1 == "b" && input5 == "b" && input7 == "b")
                   {
                       System.out.println("You chose to go outside and play basketball with a team!");
                   }
               }
           }
           //else if statement to run if the user chose the third option for the question
           else if (input5 == "c")
           {
               // asks user the next question
               System.out.println("Do you want to draw with crayons (a) or colored pencils (b)?");
               String input8 = input.nextLine();
               //if statement to run if the user chose the first option for the question
               if (input8 == "a")
               {
                   //prints the final story to the user based on their choices
                   if(input1 == "b" && input5 == "c" && input8 == "a")
                   {
                       System.out.println("You chose to go outside and draw with crayons!");
                   }
               }
               //else if statement to run if the user chose the second option for the question
               else if (input8 == "b")
               {
                   //prints the final story to the user based on their choices
                   if(input1 == "b" && input5 == "c" && input8 == "b")
                   {
                       System.out.println("You chose to go outside and draw with colored pencils!");
                   }
               }
           }
       }
       input.close();
   }
}
 

