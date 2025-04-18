package Spotify;

import java.util.ArrayList;

public class Playlist {
    private String title;
    private ArrayList<Music> playlist = new ArrayList<>();
    public User Owner;

    public void editTitle(String password, String title) {
        if(!(Owner.password.equals(password)))
            throw new InvalidOperationException("Wrong password!");
        this.title = title;
    }

    public void addMusic(String password, Music music) {
        if(!(Owner.password.equals(password)))
            throw new InvalidOperationException("Wrong password!");
        if(playlist.contains(music))
            throw new InvalidOperationException("This track is already in your playlist!");
        playlist.add(music);
    }

    public void removeMusic(String password, Music music) {
        if(!(Owner.password.equals(password)))
            throw new InvalidOperationException("Wrong password!");
        if(!(playlist.contains(music)))
            throw new InvalidOperationException("The track you're trying to remove is not in your playlist!");
        playlist.remove(music);
    }

    public void playPlaylist(){
        for (Music m : playlist) {
            m.play(m.title, m.singer);
        }
    }

    public void shuffle(){

    }

}
