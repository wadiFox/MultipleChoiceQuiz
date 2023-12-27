package principal;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Quiz q = new Quiz();
		q.logic();
	}
}	
	    class Quiz{
		
		int countCorrectAnswers=0;
		int countWrongAnswers=0;
		Scanner input = new Scanner(System.in);
		
		public void logic() {
			System.out.println("Welcome to the mini Quiz :");
			Questions q1= new Questions("Question: What is the capital of Alaska?", "\nA - Melbourne", "\nB - Anchorage", "\nC - Juneau", "\nD - Caracas");
			Questions q2= new Questions("Question: What is the result of 9+6/3", "\nA - 5", "\nB - 28", "\nC - 11", "\nD - 15/3");
			Questions q3= new Questions("Question: What is the capital of France?", "\nA - Paris", "\nB - Rabat", "\nC - London", "\nD - Berlin");
			Questions q4= new Questions("Question: Which planet is known as the \"Red Planet\"?", "\nA - Venus", "\nB - Nepton", "\nC - Jupiter", "\nD - Mars");
			Questions q5= new Questions("Question: Who wrote the play \"Romeo and Juliet\"?", "\nA - Charles Dickens", "\nB - William Shakespeare", "\nC - Jane Austen", "\nD - Mark Twain");
		    
			Map<Questions,Character> hmap = new LinkedHashMap<>();// We could also have used HashMap, I used LinkedHashMap to guarantee the order entry
            hmap.put(q1,'C');
            hmap.put(q2,'C');
            hmap.put(q3,'A');
            hmap.put(q4,'D');
            hmap.put(q5,'B');
            
            for(Map.Entry<Questions, Character> map:hmap.entrySet()) {
            	System.out.print(map.getKey().getQuestion());
            	System.out.print(map.getKey().getOption1());
            	System.out.print(map.getKey().getOption2());
            	System.out.print(map.getKey().getOption3());
            	System.out.println(map.getKey().getOption4());
            	System.out.print("\nPlease enter your answer : ");
            	Character ans = input.next().charAt(0);
            	int cans = Character.compare(ans, map.getValue());
            	if(cans==0) {
            		System.out.println("Correct ansewr!!\n");
            		countCorrectAnswers++;
            	}else {
            		System.out.println("Wrong ansewr!!\n");
            		countWrongAnswers++;
            	}
            }
            int totalAnswers = 5;
            double percentageCorrect = ((double) countCorrectAnswers / totalAnswers) * 100;
            System.out.println("Correct answers : "+countCorrectAnswers);
            System.out.println("Wrong answers : "+countWrongAnswers);
            System.out.println("Correct answers percentage : "+percentageCorrect+"%");

            if(countCorrectAnswers>countWrongAnswers) {
            	System.out.println("Well Done!!!");
            }else {
            	System.out.println("Good luck next time!!!");
            }
		}
	}


