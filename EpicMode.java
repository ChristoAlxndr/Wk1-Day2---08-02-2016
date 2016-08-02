package com.assignment;

public class EpicMode {

	public static void main(String[] args) {
	
		String[][] aryString = new String [11][11];

				
		aryString[0][0] = "Favorite Movies";
		aryString[0][1] = "The Godfather";
		aryString[0][2] = "Rocky IV";
		aryString[0][3] = "Rocky V";
		aryString[0][4] = "Leaving Las Vegas";
		aryString[0][5] = "As Good As it Gets";
		aryString[0][6] = "Robin Hood";
		aryString[0][7] = "Saving Private Ryan";
		aryString[0][8] = "Se7en";
		aryString[0][9] = "The Twilight Zone";
		aryString[0][10] = "Braveheart";
		
		
		aryString[1][0] = "Favorite Foods";
		aryString[1][1] = "Pizza";
		aryString[1][2] = "Tacos";
		aryString[1][3] = "Spaghetti";
		aryString[1][4] = "Meatloaf";
		aryString[1][5] = "Bacon";
		aryString[1][6] = "Pesto Pasta";
		aryString[1][7] = "Steak";
		aryString[1][8] = "Mac and Cheese";
		aryString[1][9] = "Baked Ziti";
		aryString[1][10] = "Burgers";
		
		
//		aryString[2][0] = "Favorite Musical Artists";
//		aryString[1][2] = "Ozzy Osbourne";
//		aryString[2][2] = "Gather Vocal Band";
//		aryString[3][2] = "Merle Haggard";
//		aryString[4][2] = "Conway Twitty";
//		aryString[5][2] = "Metallica";
//		aryString[6][2] = "Van Halen";
//		aryString[7][2] = "Van Hagar";
//		aryString[8][2] = "Nirvana";
//		aryString[9][2] = "Bach";
//		aryString[10][2] = "Twisted Sister";
//		
		
		
		int rows = 2;
		int columns = 11;
		int i, j;
		
		for (i = 0; i < rows; i++) {
			for (j = 0; j < columns; j++) {
				System.out.println(aryString[i][j] + " ");
			}
			System.out.println();
		}
	}

}
