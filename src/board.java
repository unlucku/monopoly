
public class board {
	property[] game = new property[40];
	public void initializeBoard() {
		game[1] = new property("GO", 0, 0, 1, true);
		game[2] = new property("OLD KENT", 60, 0, 2, true);
		game[3] = new property("COMMUNITY CHEST", 0, 0, 3, true);
		game[4] = new property("WHITECHAPEL", 60, 0, 4, true);
		game[5] = new property("TAX", 0, 0, 5, true);
		game[6] = new property("STATION", 200, 0, 6, true);
		game[7] = new property("ISLINGTON", 100, 0, 7, true);
		game[8] = new property("CHANCE", 0, 0, 8, true);
		game[9] = new property("EUSTON", 100, 0, 9, true);
		game[10] = new property("PENTIONVILLE", 120, 0, 10, true);
		game[11] = new property("JAIL", 0, 0, 11, true);
		game[12] = new property("PALL",140, 0, 12, true);
		game[13] = new property("ELECTRIC", 150, 0, 13, true);
		game[14] = new property("WHITEHALL", 140, 0, 14, true);
		game[15] = new property("NORTHUMRLD", 160, 0, 15, true);
		game[16] = new property("STATION", 200, 0, 16, true);
		game[17] = new property("BOW STREET", 180, 0, 17, true);
		game[18] = new property("COMMUNITY CHEST", 0, 0, 18, true);
		game[19] = new property("MARLBOROUGH", 180, 0, 19, true);
		game[20] = new property("VINE", 200, 0, 20, true);
		game[21] = new property("PARKING", 0, 0, 21, true);
		game[22] = new property("STRAND", 220, 0, 22, true);
		game[23] = new property("CHANCE", 0, 0, 23, true);
		game[24] = new property("FLEET", 220, 0, 24, true);
		game[25] = new property("TRAFALGAR", 240, 0, 25, true);
		game[26] = new property("STATION", 200, 0, 26, true);
		game[27] = new property("LEICESTER", 260, 0, 27, true);
		game[28] = new property("COVENTIRY", 260, 0, 28, true);
		game[29] = new property("WATER WORKS", 150, 0, 29, true);
		game[30] = new property("PICCADILLY", 280, 0, 30, true);
		game[31] = new property("JAIL", 0, 0, 31, true);
		game[32] = new property("REGENT", 300, 0, 32, true);
		game[33] = new property("OXFORD", 300, 0, 33, true);
		game[34] = new property("COMMUNITY CHEST", 0, 0, 34, true);
		game[35] = new property("BOND", 320, 0, 35, true);
		game[36] = new property("STATION", 200, 0, 36, true);
		game[37] = new property("CHANCE", 0, 0, 37, true);
		game[38] = new property("PARK", 350, 0, 38, true);
		game[39] = new property("TAX", 0, 0, 39, true);
		game[0] = new property("MAYFAIR", 400, 0, 40, true);
		
	}
	public void displayBoard() {
		
		for (int i = 0; i < 100; i++) {
			if (i%10 == 0) {
				System.out.print("|");
			}
			System.out.print("-");
		}
		
	}
}
