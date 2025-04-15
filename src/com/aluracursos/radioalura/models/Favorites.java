package com.aluracursos.radioalura.models;

public class Favorites {
    public void add(Audio audio) {
        if(audio.getRanking() >= 5 ){
            System.out.println(audio.getFileName() + " has been added to the favorites list.");
        }else{
            System.out.println(audio.getFileName() + " didn't reach the standard to be added to the favorites list.");
        }

    }
}
