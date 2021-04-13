package PlayList;

import java.util.ArrayList;

public class Album {
    public final String albumName;
    public final int releaseYear;
    public final Artist artist;
    public final ArrayList<Song> songList = new ArrayList<>();

    public Album(String name, int year, Artist artist){
        albumName = name;
        releaseYear = year;
        this.artist = artist;
    }

    public void addTrack(Song song){
        songList.add(song);
    }

    public Song getTrack(int trackNumber){
        return songList.get(trackNumber - 1);
    }
}