package PlayList;

public class Song {
    public final String songName;
    public final Artist artist;
    public final Album album;

    public Song(String name, Artist artist, Album album){
        songName = name;
        this.artist = artist;
        this.album = album;
    }

    @Override
    public String toString(){
        return songName + " - " + artist.artistName + "\n" + album.albumName + "(" + album.releaseYear + ")";
    }
}