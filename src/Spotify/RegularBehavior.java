package Spotify;

public class RegularBehavior implements UserBehavior {

    public int playingLimit = 5;

    public RegularBehavior() {

    }

    @Override
    public void createPlaylist(String Title, User Owner) {
        throw new InvalidOperationException("A regular user can't make playlists!");
    }

    @Override
    public void playMusic(Music music) {
        if (playingLimit <= 0)
            throw new InvalidOperationException("Your playing limit is reached!");
        music.play();
        playingLimit--;
    }

    @Override
    public void buyPremium(User owner, int month) {
        owner.behavior = new PremiumBehavior(month);
    }
}
