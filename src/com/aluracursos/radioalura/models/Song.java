package com.aluracursos.radioalura.models;

public class Song extends Audio{
    private String albumName;
    private String artistName;
    private String musicGender;

    public String getMusicGender() {
        return musicGender;
    }

    public void setMusicGender(String musicGender) {
        this.musicGender = musicGender;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    @Override
    public int getRanking(){
        int totalRank = getTotalPlays()/getTotalLikes();
        if (totalRank < 100){
            return 5;
        } else {
            return 2;
        }
    }
}
