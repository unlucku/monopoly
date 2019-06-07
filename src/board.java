
public class board {
	property[] game = new property[40];
	public void initializeBoard() {
		game[0] = new property("GO", 0, 0, 1, true);
		game[1] = new property("KENT", 60, 0, 2, true);
		game[2] = new property("CHEST", 0, 0, 3, true);
		game[3] = new property("WHITECHAP", 60, 0, 4, true);
		game[4] = new property("TAX", 0, 0, 5, true);
		game[5] = new property("STATION", 200, 0, 6, true);
		game[6] = new property("ISLINGTON", 100, 0, 7, true);
		game[7] = new property("CHANCE", 0, 0, 8, true);
		game[8] = new property("EUSTON", 100, 0, 9, true);
		game[9] = new property("PENTION", 120, 0, 10, true);
		game[10] = new property("JAIL", 0, 0, 11, true);
		game[11] = new property("PALL",140, 0, 12, true);
		game[12] = new property("ELECTRIC", 150, 0, 13, true);
		game[13] = new property("WHITEHALL", 140, 0, 14, true);
		game[14] = new property("NORTHUMRL", 160, 0, 15, true);
		game[15] = new property("STATION", 200, 0, 16, true);
		game[16] = new property("BOW STREET", 180, 0, 17, true);
		game[17] = new property("CHEST", 0, 0, 18, true);
		game[18] = new property("MARLBOR", 180, 0, 19, true);
		game[19] = new property("VINE", 200, 0, 20, true);
		game[20] = new property("PARKING", 0, 0, 21, true);
		game[21] = new property("STRAND", 220, 0, 22, true);
		game[22] = new property("CHANCE", 0, 0, 23, true);
		game[23] = new property("FLEET", 220, 0, 24, true);
		game[24] = new property("TRAFAL", 240, 0, 25, true);
		game[25] = new property("STATION", 200, 0, 26, true);
		game[26] = new property("LEICEST", 260, 0, 27, true);
		game[27] = new property("COVENTI", 260, 0, 28, true);
		game[28] = new property("WATER", 150, 0, 29, true);
		game[29] = new property("PICCAD", 280, 0, 30, true);
		game[30] = new property("JAIL", 0, 0, 31, true);
		game[31] = new property("REGENT", 300, 0, 32, true);
		game[32] = new property("OXFORD", 300, 0, 33, true);
		game[33] = new property("CHEST", 0, 0, 34, true);
		game[34] = new property("BOND", 320, 0, 35, true);
		game[35] = new property("STATION", 200, 0, 36, true);
		game[36] = new property("CHANCE", 0, 0, 37, true);
		game[37] = new property("PARK", 350, 0, 38, true);
		game[38] = new property("TAX", 0, 0, 39, true);
		game[39] = new property("MAYFAIR", 400, 0, 40, true);
		
	}
	public void displayBoard() {
		for (int z = 0; z < 5; z++) {
			int n =20;
			Boolean input = false;
		for (int i = 0; i < 110; i++) {
			if (i%10 == 0) {
				System.out.print("|");
				input = false;
			}
			if (z==0 || z==4) {
			System.out.print("-");}
			else if (z==1 && !input){
				System.out.print(game[n].name);
				i = i + game[n].name.length()-1;
				n++;
				input = true;
			}
			else if (z==3 && !input){
				System.out.print("$" + game[n].cost);
				i = i + ("$" + game[n].cost).length()-1;
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
					System.out.print(game[x].name);
					i = i + game[x].name.length()-1;
					x += 12+2*a;
					input = true;
				}
				else if (z==3 && !input && (box==10 || box==0)){
					System.out.print("$" + game[x].cost);
					i = i + ("$" + game[x].cost).length()-1;
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
				System.out.print(game[n].name);
				i = i + game[n].name.length()-1;
				n--;
				input = true;
			}
			else if (z==3 && !input){
				System.out.print("$" + game[n].cost);
				i = i + ("$" + game[n].cost).length()-1;
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
