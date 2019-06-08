
public class board {
	static squareType[] game = new squareType[40];
	public static void initializeBoard() {
		game[0] = new squareType("GO", 0, 0, 1, true);
		game[1] = new squareType("KENT", 60, 0, 2, false);
		game[2] = new squareType("CHEST", 0, 0, 3, true);
		game[3] = new squareType("WHITECHAP", 60, 0, 4, false);
		game[4] = new squareType("TAX", 0, 0, 5, true);
		game[5] = new squareType("STATION", 200, 0, 6, true);
		game[6] = new squareType("ISLINGTON", 100, 0, 7, false);
		game[7] = new squareType("CHANCE", 0, 0, 8, true);
		game[8] = new squareType("EUSTON", 100, 0, 9, false);
		game[9] = new squareType("PENTION", 120, 0, 10, false);
		game[10] = new squareType("JAIL", 0, 0, 11, true);
		game[11] = new squareType("PALL",140, 0, 12, false);
		game[12] = new squareType("ELECTRIC", 150, 0, 13, true);
		game[13] = new squareType("WHITEHALL", 140, 0, 14, false);
		game[14] = new squareType("NORTHUMRL", 160, 0, 15, false);
		game[15] = new squareType("STATION", 200, 0, 16, true);
		game[16] = new squareType("BOW STREET", 180, 0, 17, false);
		game[17] = new squareType("CHEST", 0, 0, 18, true);
		game[18] = new squareType("MARLBOR", 180, 0, 19, false);
		game[19] = new squareType("VINE", 200, 0, 20, false);
		game[20] = new squareType("PARKING", 0, 0, 21, true);
		game[21] = new squareType("STRAND", 220, 0, 22, false);
		game[22] = new squareType("CHANCE", 0, 0, 23, true);
		game[23] = new squareType("FLEET", 220, 0, 24, false);
		game[24] = new squareType("TRAFAL", 240, 0, 25, false);
		game[25] = new squareType("STATION", 200, 0, 26, true);
		game[26] = new squareType("LEICEST", 260, 0, 27, false);
		game[27] = new squareType("COVENTI", 260, 0, 28, false);
		game[28] = new squareType("WATER", 150, 0, 29, true);
		game[29] = new squareType("PICCAD", 280, 0, 30, false);
		game[30] = new squareType("JAIL", 0, 0, 31, true);
		game[31] = new squareType("REGENT", 300, 0, 32, false);
		game[32] = new squareType("OXFORD", 300, 0, 33, false);
		game[33] = new squareType("CHEST", 0, 0, 34, true);
		game[34] = new squareType("BOND", 320, 0, 35, false);
		game[35] = new squareType("STATION", 200, 0, 36, true);
		game[36] = new squareType("CHANCE", 0, 0, 37, true);
		game[37] = new squareType("PARK", 350, 0, 38, false);
		game[38] = new squareType("TAX", 0, 0, 39, true);
		game[39] = new squareType("MAYFAIR", 400, 0, 40, false);
		
	}
	public static void setOccupy(int id, int p) {
		game[id].setOccupy(p);
	}
	public static void displayBoard() {
		for (int z = 0; z < 5; z++) {
			int n =20;
			Boolean input = false;
		for (int i = 0; i < 110; i++) {
			if (i%10 == 0) {
				System.out.print("|");
				input = false;
			}
			if (z==0 || z==4) {
			System.out.print("-");
			}
			else if (z==1 && !input){
				System.out.print(game[n].getName());
				i = i + game[n].getName().length()-1;
				n++;
				input = true;
			}
			else if (z==2 && !input){
				System.out.print(game[n].toString());
				i = i + game[n].toString().length()-1;
				n++;
				input = true;
			}
			else if (z==3 && !input){
				System.out.print("$" + game[n].getCost());
				i = i + ("$" + game[n].getCost()).length()-1;
				n++;
				input = true;
			}
			else{
				System.out.print(" ");
			}
		 }
		System.out.print("|");
		System.out.println();
		}
		for (int a = 0; a < 9; a++) {
			int n = 19-a;
			for (int z = 0; z < 5; z++) {
				int x = n;
				int box = -1;
				
				Boolean input = false;
			for (int i = 0; i < 110; i++) {
				if (i%10 == 0) {
					box++;
					if ((box ==10 || box==0 || box==1)) {
					System.out.print("|");
					}
					else {
						System.out.print(" ");
					}
					input = false;
				}
				if ((z==0 || z==4)&& (box==10 || box==0)) {
				System.out.print("-");}
				else if (z==1 && !input && (box==10 || box==0)){
					System.out.print(game[x].getName());
					i = i + game[x].getName().length()-1;
					x += 12+2*a;
					input = true;
				}
				else if (z==2 && !input && (box==10 || box==0)){
					System.out.print(game[x].toString());
					i = i + game[x].toString().length()-1;
					x += 12+2*a;
					input = true;
				}
				else if (z==3 && !input && (box==10 || box==0)){
					System.out.print("$" + game[x].getCost());
					i = i + ("$" + game[x].getCost()).length()-1;
					x += 12+2*a;
					input = true;
				}
				else{
					System.out.print(" ");
				}
			 }
			System.out.print("|");
			System.out.println();
			}
		}
		
		for (int z = 0; z < 5; z++) {
			int n =10;
			Boolean input = false;
		for (int i = 0; i < 110; i++) {
			if (i%10 == 0) {
				System.out.print("|");
				input = false;
			}
			if (z==0 || z==4) {
			System.out.print("-");}
			else if (z==1 && !input){
				System.out.print(game[n].getName());
				i = i + game[n].getName().length()-1;
				n--;
				input = true;
			}
			else if (z==2 && !input){
				System.out.print(game[n].toString());
				i = i + game[n].toString().length()-1;
				n--;
				input = true;
			}
			else if (z==3 && !input){
				System.out.print("$" + game[n].getCost());
				i = i + ("$" + game[n].getCost()).length()-1;
				n--;
				input = true;
			}
			else{
				System.out.print(" ");
			}
		 }
		System.out.print("|");
		System.out.println();
		}
	}
}
