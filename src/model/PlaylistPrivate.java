package model;

public class PlaylistPrivate extends Playlist{
	public String users;

	public PlaylistPrivate(String namep, int duration, String[] genders, String users) {
		super(namep, duration, genders);
		this.users = users;
	}
	

	public String getUsers() {
		return users;
	}


	public void setUsers(String users) {
		this.users = users;
	}
	
	/**
	*show the Play list Private
	*@param
	*@Override 
	*@return a String, .
	*/

	@Override
	public String showPlaylist() {
		String contents = "";
		contents +="************* Playlist  **************\n";
		contents +="**  Title: "+getNamep()+" ***\n";
		contents +="**  Duration: "+getDuration()+" ***\n";
		contents +="**  Genre: "+getGenders()+" ***\n";
		contents +="**  Name User: "+getUsers()+" ***\n";
		contents +="***********************************\n";
		return contents;
	}
}
