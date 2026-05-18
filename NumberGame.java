import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {
      Scanner in= new Scanner(System.in);
      int secret= (int)(Math.random() * 100) + 1;
      int  t=0;
      boolean ans=false;
      while(t<8){
        System.out.println("Do you want to have a try:");
        String choice=in.next();
        if(choice.equals("Yes")||choice.equals("yes")){
            int  n= in.nextInt();
            if(n==secret){
                System.out.println("Guessed correctly in "+(t+1)+" attempts");
                System.out.println("Your score is "+(100-(t*10)));
                ans=true;
                break;
       }
           else{
            System.out.println("Guess is incorrect");
             if(n<secret){
                System.out.println("Your guess is low");
            }
            else{
                System.out.println("Your guess is high");
          }
         
       }
       t++;
       
        
   
    }
      
    else{
        System.out.println("Thanks for attempting");
        break;
    }

    if(!ans && t==8){
        System.out.println("You have lost the game!! and the secret number is "+secret+ " Nice try!! GoodLuck");

    }
    }
}
}
