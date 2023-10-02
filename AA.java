//Group Name - 'A' star
//Team Leader - Aakanksha Jarugu
//team Mate- Akhila Mediboyina 
import java.util.Scanner;
public class LetterGrade {

	public static void main(String[] args) 
	{
		char LetterGrade;
		System.out.println("Please enter you grade : ");
		Scanner scan = new Scanner(System.in);
		int grade = scan.nextInt();
		
		//if grade >=90, set the instructions to A
		if (grade >= 90) 
		{
		      LetterGrade = 'A';
		}
		
		//if grade >=80, set the instructions to B
		else if (grade >= 80) 
		{
		      LetterGrade = 'B'; 
		}
		//if grade >=70, set the instructions to C
		else if (grade >= 70)
		{
		      LetterGrade = 'C';
		} 
		
		//if grade >=60, set the instructions to D
		else if (grade >= 60)
		{
		      LetterGrade = 'D';
		} 
		
		//else set the letterGrade to F  
		else 
		{
		      LetterGrade = 'F';
		}

		System.out.println("Your letter grade is: " + LetterGrade);
	}

}