package com.aluracursos.radioalura.main;

import com.aluracursos.radioalura.models.Favorites;
import com.aluracursos.radioalura.models.Podcast;
import com.aluracursos.radioalura.models.Song;

public class Main {
    public static void main(String[] args) {
        Song mySong = new Song();
        mySong.setFileName("Anita No!");
        mySong.setArtistName("The Do");
        mySong.setFileType("mp3");
        mySong.setAlbumName("Shake Shook Shaken");
        mySong.setMusicGender("Indie");

        Podcast myPodcast = new Podcast();
        myPodcast.setFileName("Episodio 16: María Laura Palacios");
        myPodcast.setHosts("Entre programadoras");
        myPodcast.setFileType("mv4");
        myPodcast.setTopic("Cami charló junto a María Laura Palacios, Co-fundadora del Club de Chicas Programadoras y CEO de G&L Group. Cuenta con una amplia experiencia laboral y un historial de emprendimientos que salieron adelante como CODESA S.A y AGRO PUMA.");
        myPodcast.setPartOfSeries(true);

        for (int i = 0; i < 5000 ; i++) {
            mySong.play();
        }

        for (int i = 0; i < 50 ; i++) {
            mySong.like();
        }

        for (int i = 0; i < 1000 ; i++) {
            myPodcast.play();
        }

        for (int i = 0; i < 100 ; i++) {
            myPodcast.like();
        }

        System.out.println("Your song '" + mySong.getFileName() + "' has been played a total of " + mySong.getTotalPlays() + " times.");
        System.out.println("And has a total of " + mySong.getTotalLikes() + " likes.");

        System.out.println("Your podcast '" + myPodcast.getFileName() + "' has been played a total of " + myPodcast.getTotalPlays() + " times.");
        System.out.println("And has a total of " + myPodcast.getTotalLikes() + " likes.");

        Favorites myFavorites = new Favorites();
        myFavorites.add(myPodcast);
        myFavorites.add(mySong);
    }

}
