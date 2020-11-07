package model;

public class Playlist {
	
	private String namep;
	private int duration;
	String [] genders;
	
	

	public Playlist(String namep, int duration, String[] genders) {
		super();
		this.namep = namep;
		this.duration = duration;
		this.genders = genders;
	}

	public String getNamep() {
		return namep;
	}

	public void setNamep(String namep) {
		this.namep = namep;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String[] getGenders() {
		return genders;
	}

	public void setGenders(String[] genders) {
		this.genders = genders;
	}

}
