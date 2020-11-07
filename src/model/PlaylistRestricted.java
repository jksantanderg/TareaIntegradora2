package model;

public class PlaylistRestricted extends Playlist{
	String [] usersp;
	
	/**
	 * @param namep
	 * @param duration
	 * @param genders
	 * @param usersp
	 */
	public PlaylistRestricted(String namep, int duration, String[] genders, String[] usersp) {
		super(namep, duration, genders);
		this.usersp = usersp;
	}

	/**
	 * @return the users
	 */
	public String[] getUsersp() {
		return usersp;
	}

	/**
	 * @param usersp the users to set
	 */
	public void setUsersp(String[] usersp) {
		this.usersp = usersp;
	}


	/**
	*show the Play list Restricted
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
		contents +="**  Average: "+getUsersp()+" ***\n";
		contents +="***********************************\n";
		return contents;
	}	

}
