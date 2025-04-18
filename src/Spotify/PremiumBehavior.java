package Spotify;

public class PremiumBehavior implements UserBehavior {

    private int month = 0;

    public PremiumBehavior(int month) {
        if (month < 0)
            throw new InvalidOperationException("Invalid premium duration!");
        this.month += month;
    }

    @Override
    public void createPlaylist(String title, User owner) {
        if (title.isEmpty() || title == null)
            throw new InvalidOperationException("Choose a valid title!");
        Playlist playlist = new Playlist(title, owner);
        owner.playlists.add(playlist);
    }

    @Override
    public void playMusic(Music music) {
        music.play();
    }

    @Override
    public void buyPremium(User owner, int month) {
        if (month < 0)
            throw new InvalidOperationException("Invalid premium duration!");
        this.month += month;

    }
}
