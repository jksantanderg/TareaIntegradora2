package model;

public class PlaylistPublic extends Playlist{
	private int qualification;

	/**
	 * @param namep
	 * @param duration
	 * @param genders
	 * @param qualification
	 */
	public PlaylistPublic(String namep, int duration, String[] genders, int qualification) {
		super(namep, duration, genders);
		this.qualification = qualification;
	}

	/**
	 * @return the qualification
	 */
	public int getQualification() {
		return qualification;
	}

	/**
	 * @param qualification the qualification to set
	 */
	public void setQualification(int qualification) {
		this.qualification = qualification;
	}



	/**
	*show the Play list Public
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
		contents +="**  Average: "+getQualification()+" ***\n";
		contents +="***********************************\n";
		return contents;
	}	
}
	
