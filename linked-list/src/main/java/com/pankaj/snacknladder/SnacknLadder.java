package com.pankaj.snacknladder;

import java.util.ArrayList;
import java.util.List;

public class SnacknLadder {

	static int[] players = new int[4];
	static int dice;
	static int curentPlayer;
	static List<Integer[]> points = new ArrayList<>();

	public SnacknLadder() {
		points.add(new Integer[] { 4, 14 });
		points.add(new Integer[] { 9, 31 });
		points.add(new Integer[] { 20, 38 });
		points.add(new Integer[] { 28, 84 });
		points.add(new Integer[] { 40, 59 });
		points.add(new Integer[] { 51, 67 });
		points.add(new Integer[] { 63, 81 });
		points.add(new Integer[] { 71, 91 });
		points.add(new Integer[] { 17, 7 });
		points.add(new Integer[] { 62, 19 });
		points.add(new Integer[] { 87, 24 });
		points.add(new Integer[] { 54, 34 });
		points.add(new Integer[] { 64, 60 });
		points.add(new Integer[] { 93, 73 });
		points.add(new Integer[] { 95, 75 });
		points.add(new Integer[] { 99, 78 });
	}

	public static void main(String[] args) {
		try {

			int numberOfplayers = 2;
			if (numberOfplayers > 4) {
				throw new Exception("Only four players can play !!");
			}
			boolean gamePlay = true;
			new SnacknLadder();
			while (gamePlay) {
				for (int i = 0; i < numberOfplayers; i++) {
					System.out.println("Turn of player:-" + i);
					// TODO get confirmation from player
					dice = (int) (Math.random() * 6 + 1);
					System.out.println("Your dice Number is:- " + dice);
					if (players[i] == 0 && dice != 6)
						continue;
					if (players[i] + dice > 100)
						continue;
					players[i] += dice;
					for (Integer[] a : points) {
						if (players[i] == a[0]) {
							if (a[0] > a[1]) {
								System.out.println("Snake bite !! :: - " + a[0] + "-->>" + a[1]);
							} else {
								System.out.println("Ladder Climb !! :: - " + a[0] + "-->>" + a[1]);
							}
							players[i] = a[1];
						}
					}
					System.out.println("Your Current Position:- " + players[i]);

					if (players[i] == 100) {
						System.out.println(i + " : WON !!");
						gamePlay = false;
						break;
					}
					// Thread.sleep(500);
				}
				System.out.println();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
