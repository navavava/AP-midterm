package Spotify;

import java.util.ArrayList;

public class Playlist {
    private String title;
    private ArrayList<Music> playlist = new ArrayList<>();
    public User owner;

    public Playlist(String title, User owner) {
        if (title.isEmpty() || title.equals("null"))
            throw new InvalidOperationException("Choose a valid title!");
        if (!(User.allUsers.contains(owner)))
            throw new InvalidOperationException("This user does not exist!");
        this.title = title;
        this.owner = owner;
    }

    public void editTitle(String password, String title) {
        if (!(owner.password.equals(password)))
            throw new InvalidOperationException("Wrong password!");
        if (title.isEmpty() || title.equals("null"))
            throw new InvalidOperationException("Choose a valid title!");
        this.title = title;
    }

    public void addMusic(String password, Music music) {
        if (!(owner.password.equals(password)))
            throw new InvalidOperationException("Wrong password!");
        if (playlist.contains(music))
            throw new InvalidOperationException("This track is already in your playlist!");
        if (!(Music.allMusics.contains(music)))
            throw new InvalidOperationException("This track does not exist!");
        playlist.add(music);
    }

    public void removeMusic(String password, Music music) {
        if (!(owner.password.equals(password)))
            throw new InvalidOperationException("Wrong password!");
        if (!(playlist.contains(music)))
            throw new InvalidOperationException("The track you're trying to remove is not in your playlist!");
        playlist.remove(music);
    }

    public void playPlaylist() {
        for (Music m : playlist) {
            m.play();
        }
    }

    public void shuffle() {

    }

}
