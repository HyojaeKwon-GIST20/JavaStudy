package GameExample;

public class player {
	private playerLevel level;

	public playerLevel getLevel() {
		return level;
	}
	public player() {
		level = new beginnerLevel();
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
