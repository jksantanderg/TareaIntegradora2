package model;

public class PlaylistRestricted extends Playlist{
	String [] usersp;

	public PlaylistRestricted(String namep, int duration, String[] genders, String[] usersp) {
		super(namep, duration, genders);
		this.usersp = usersp;
	}
	//metodo de añadir y listar canciones que contiene la playlist

}
