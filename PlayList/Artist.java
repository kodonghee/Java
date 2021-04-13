package PlayList;

import java.util.ArrayList;

public class Artist {
    public final String artistName;
    public final ArrayList<Album> albumList = new ArrayList<>();

    public Artist(String name){
        artistName = name;
    }

    public void addAlbum(Album album){
        albumList.add(album);
    }

    public ArrayList<Album> getAlbums(){
        return albumList;
    }
}
