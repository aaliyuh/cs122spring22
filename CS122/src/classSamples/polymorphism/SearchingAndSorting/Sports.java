package classSamples.polymorphism.SearchingAndSorting;

public class Sports implements Comparable<Sports> {
	private final String name;
	private final int players;

	//create a constructor initializing name and players
	public Sports(String name, int players) {
		this.name = name;
		this.players = players;
	}
	
	//create getter methods for name and players
	public String getName() {
		return name;
	}


	public int getPlayers() {
		return players;
	}


	//create toString()
	public String toString() {
		return "name: \n " + getName() + "players \n" + getPlayers();
	}

	//overrride equals method
	public boolean equals(Object o) {
		return (name.equals(((Sports) o).getName()) && players == (((Sports) o).getPlayers()));
		
	}
	

	//finish overriding compareTo method
	@Override
	public int compareTo(Sports o) {
		
		return name.compareTo(o.getName());

		
	}


}
