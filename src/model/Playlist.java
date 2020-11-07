package model;

public class Playlist {
	
	private String namep;
	private int duration;
	String [] genders;
	
	/**
	 * @param namep
	 * @param duration
	 * @param genders
	 */
	public Playlist(String namep, int duration, String[] genders) {
		super();
		this.namep = namep;
		this.duration = duration;
		this.genders = genders;
	}

	/**
	 * @return the name
	 */
	public String getNamep() {
		return namep;
	}

	/**
	 * @param namep the name to set
	 */
	public void setNamep(String namep) {
		this.namep = namep;
	}

	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}


	/**
	 * @param duration the duration to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}

	/**
	 * @return the genders
	 */
	public String[] getGenders() {
		return genders;
	}

	/**
	 * @param genders the genders to set
	 */
	public void setGenders(String[] genders) {
		this.genders = genders;
	}

	/**
	*show the Play list
	*@param
	*@return a String, .
	*/
	public String showPlaylist() {
		
		
		String contents = "";
		contents +="************* Playlist  **************\n";
		contents +="**  Title: "+getNamep()+" ***\n";
		contents +="**  Duration: "+getDuration()+" ***\n";
		contents +="**  Genre: "+getGenders()+" ***\n";
		contents +="***********************************\n";
		
		return contents;
	}
}
