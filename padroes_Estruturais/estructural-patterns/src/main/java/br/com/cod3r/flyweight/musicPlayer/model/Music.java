package br.com.cod3r.flyweight.musicPlayer.model;

import br.com.cod3r.flyweight.musicPlayer.musicFlyweigth.MusicFlyweight;

public class Music {

	private Integer playerQty;

  private MusicFlyweight musicFlyweight;

  public Music(MusicFlyweight musicFlyweight) {
    this.musicFlyweight = musicFlyweight;
    this.playerQty = 0;
  }

  public void listenning() {
		playerQty++;
	}

  public MusicFlyweight getMusicFlyweight() {
    return musicFlyweight;
  }

  public void setMusicFlyweight(MusicFlyweight musicFlyweight) {
    this.musicFlyweight = musicFlyweight;
  }

  public Integer getPlayerQty() {
    return playerQty;
  }

  public void setPlayerQty(Integer playerQty) {
    this.playerQty = playerQty;
  }

  @Override
  public String toString() {
    return "Music [musicFlyweight=" + musicFlyweight + ", playerQty=" + playerQty + "]";
  }
}
