//Author : Akhila Mediboyina
import java.util.Scanner;
public class LetterGrade 
{
	public static void main(String[] args) 
	{
		String LetterGrade;
        System.out.println(" Please enter your grade: ");
        Scanner scan =  new Scanner(System.in);
        int grade = scan.nextInt();
        
        if (grade >= 95 )
            LetterGrade = "A+";

        else if(grade >= 90)
            LetterGrade = "A";

        else if(grade >= 85)
            LetterGrade = "B+";

        else if(grade >= 80)
            LetterGrade = "B";
            
        else if(grade >= 75)
            LetterGrade = "C+";
            
        else if(grade >= 70)
            LetterGrade = "C";
            
        else if(grade >= 65)
            LetterGrade = "D+";
            
        else if(grade >= 60)
            LetterGrade = "D";

        else
            LetterGrade = "F";

        System.out.println("The letterGrade for " + grade + " is " + LetterGrade);
        scan.close();
	}
}
