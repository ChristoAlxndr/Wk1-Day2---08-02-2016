package com.assignment;

public class AdventurerMode {

	public static void main(String[] args) {

		String[] movieNames = new String[10];
		String[] foodNames = new String[10];
		String[] musicNames = new String[10];

		movieNames[0] = "The Godfather";
		movieNames[1] = "As Good As it Gets";
		movieNames[2] = "Leaving Las Vegas";
		movieNames[3] = "From Hell";
		movieNames[4] = "Trailer Park of Terror";
		movieNames[5] = "Hancock";
		movieNames[6] = "Notting Hill";
		movieNames[7] = "Rocky IV";
		movieNames[8] = "North and South";
		movieNames[9] = "Cobra";

		System.out.println("Favorite Movies \n");

		for (int i = 0; i < 10; i++) {
			System.out.println(movieNames[i]);
		}

		System.out.println("\n\n");

		foodNames[0] = "Burgers";
		foodNames[1] = "Pizza";
		foodNames[2] = "Spaghetti";
		foodNames[3] = "Mashed Potatos";
		foodNames[4] = "Fried Chicken";
		foodNames[5] = "Mac and Cheese";
		foodNames[6] = "Sausage";
		foodNames[7] = "Steak";
		foodNames[8] = "Tacos";
		foodNames[9] = "Bacon";

		System.out.println("Favorite Foods \n");

		for (int i = 0; i < 10; i++) {
			System.out.println(foodNames[i]);
		}

		System.out.println("\n\n");

		musicNames[0] = "Ozzy Osbourne";
		musicNames[1] = "Metallica";
		musicNames[2] = "Van Halen";
		musicNames[3] = "Van Hagar";
		musicNames[4] = "Nirvana";
		musicNames[5] = "Conway Twitty";
		musicNames[6] = "Merle Haggard";
		musicNames[7] = "Bach";
		musicNames[8] = "The Gathers";
		musicNames[9] = "Andrew Lloyd Webber";

		System.out.println("Favorite Musical Artists \n");

		for (int i = 0; i < 10; i++) {
			System.out.println(musicNames[i]);
		}

		System.out.println("\n\n");

	}

}
