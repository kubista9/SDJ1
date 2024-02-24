import java.util.ArrayList;

public class FootballClub {
	private String name;
	private ArrayList<FootballPlayer> team;

	public FootballClub(String name){
		this.name = name;
		this.team = new ArrayList<>();
	}

	public void signPlayer(FootballPlayer player, String fieldPosition, int number) {
		this.team.add(player);
		player.setFieldPosition(fieldPosition);
		player.assignNumber(number);
	}

	public void trainGoalkeepers(){
		for (int i = 0; i < team.size(); i++) {
			if (team.get(i).getFieldPosition().equals("Goalkeeper")) {
				team.get(i).train();
			}
		}
	}

	public void trainOutFieldPlayer(){
		for (int i = 0; i < team.size(); i++) {
			if (team.get(i).getFieldPosition().equals("Defender") ||
					team.get(i).getFieldPosition().equals("Midfielder") ||
					team.get(i).getFieldPosition().equals("Forward"))
				team.get(i).train();
		}
	}

	public FootballPlayer getCaptain() {
		for (int i = 0; i < team.size(); i++) {
			if (team.get(i).getIsCaptain())
				return team.get(i);
		}
		return null;
	}

	public void setNewCaptain(int number){
		getCaptain().setIsCaptain(false);
		for (int i = 0; i < team.size(); i++) {
			if (team.get(i).getNumber() == number) {
				team.get(i).setIsCaptain(true);
			}
		}
	}

	public ArrayList<FootballPlayer> getPlayersInPosition(String fieldPosition){
		ArrayList<FootballPlayer> playersInPosition = new ArrayList<>();
		for (int i = 0; i < team.size(); i++) {
			if (team.get(i).getFieldPosition().equals(fieldPosition))
				playersInPosition.add(team.get(i));
		}
		return playersInPosition;
	}

	@Override
	public String toString()
	{
		String s = name + "\nPlayers: ";
		for (int i = 0;i < team.size();i++)
			s += team.get(i) + "\n";
		return s;
	}


}
