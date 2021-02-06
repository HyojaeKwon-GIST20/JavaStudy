package gameLevel;

public class player {
	private playerLevel level;
	
	public player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public void upgradeLevel(playerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	public void play(int count) {
		level.go(count);
	}
	
}
