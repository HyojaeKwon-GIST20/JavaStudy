package GameExample;

public class mainBoard {

	public static void main(String[] args) {
		player p1 = new player();
		p1.play(1);
		
		advancedLevel aLevel = new advancedLevel();
		p1.upgradeLevel(aLevel);
		p1.play(2);
		
		superLevel sLevel  = new superLevel();
		p1.upgradeLevel(sLevel);
		p1.play(3);
		
	}

}
