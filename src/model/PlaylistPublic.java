package model;

public class PlaylistPublic extends Playlist{
	private int qualification;

	public PlaylistPublic(String namep, int duration, String[] genders, int qualification) {
		super(namep, duration, genders);
		this.qualification = qualification;
	}

	public int getQualification() {
		return qualification;
	}

	public void setQualification(int qualification) {
		this.qualification = qualification;
	}
	
	public int calulateQualification() {
		qualification = (qualification+qualification)/2;
		return qualification;
	}	
}
	
