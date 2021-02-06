package gameLevel;

public class Mainboard {
	public static void main(String[] args) {
		player player1 = new player();
		player1.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player1.upgradeLevel(aLevel);
		player1.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player1.upgradeLevel(sLevel);
		player1.play(3);
	}
}
