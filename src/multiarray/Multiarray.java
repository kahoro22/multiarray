package multiarray;

import java.util.Scanner;

public class Multiarray {

	public static void main(String[] args) {
		
		//input config
		Scanner inp = new Scanner(System.in);
		
		//variable initialization
		int[] studentnum = new int [4];
		int[] rollnum = new int [4];
		String[] names = new String[4];
		int[][] marks = new int[4][3];
		int [] totals = new int[4];
		String[] results = new String [4];
		float[] averages = new float [4];
		char[] grades = new char [4];
		
		//calculations
		for(int i=0;i<4;i++) {
			System.out.print("Enter Student Roll Number: ");
			rollnum[i] = inp.nextInt();
			if(rollnum[i]<101|| rollnum[i]>104) {
				System.out.println("Invalid roll number. Please enter a number between 101 and 104");
				i--;
				continue;
			}
			System.out.print("Enter Student Name: ");
			inp.nextLine();
			names[i] = inp.nextLine();
			System.out.print("Enter three marks and separate by spaces for " + names[i]+": ");
			for(int j=0;j<3;j++) {
				marks[i][j] = inp.nextInt();
			}
		}
		
		for(int i=0;i<4;i++) {
			totals[i] = marks[i][0] + marks[i][1] + marks[i][2];
			averages[i] = totals[i]/3;
			results[i] = (averages[i]>=50) ? "P" : "F";
			
			if(averages[i]>=70 && averages[i]<=100) {
				grades[i]='A';
			}else if(averages[i]>=50 && averages[i]<70) {
				grades[i]='B';
			}else if (averages[i]>=0 && averages[i]<50) {
				grades[i] = 'C';
			}
		}
		System.out.print("\n\n");
		//output
		System.out.println("****************************************************************");
		System.out.println("                         STUDENT MARKLIST");
		System.out.println("****************************************************************");
		System.out.println("ROLL\tNAME\tMARK1\tMARK2\tMARK3\tTOTAL\tRESULT\tAVERAGE\tGRADE");
		 for (int i = 0; i < 4; i++) {
		 System.out.println(rollnum[i] + "\t" + names[i] + "\t" + marks[i][0]
		+ "\t" + marks[i][1] + "\t" +
		 marks[i][2] + "\t" + totals[i] + "\t" + results[i] + "\t" +
		averages[i] + "\t" + grades[i]);
		 }

	}
}
