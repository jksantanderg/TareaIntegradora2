package model;

public class PlaylistPrivate extends Playlist{
	public String users;

	public PlaylistPrivate(String namep, int duration, String[] genders, String users) {
		super(namep, duration, genders);
		this.users = users;
	}

	
	//metodo de a�adir y listar canciones que contiene la playlist
}
