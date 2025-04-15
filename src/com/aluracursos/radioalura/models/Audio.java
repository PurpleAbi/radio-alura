package com.aluracursos.radioalura.models;

public class Audio {
    private String fileName;
    private String fileType;
    private int fileSizeGb;
    private double fileDurationSeconds;
    private int totalPlays;
    private int totalLikes;
    private int ranking;

    public int getTotalPlays() {
        return totalPlays;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public int getRanking() {
        return ranking;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public int getFileSizeGb() {
        return fileSizeGb;
    }

    public void setFileSizeGb(int fileSizeGb) {
        this.fileSizeGb = fileSizeGb;
    }

    public double getFileDurationSeconds() {
        return fileDurationSeconds;
    }

    public void setFileDurationSeconds(double fileDurationSeconds) {
        this.fileDurationSeconds = fileDurationSeconds;
    }

    public void play() {
        this.totalPlays++;
    }

    public String like(){
        String myLikes;
        this.totalLikes++;
        return myLikes = this.fileName;
    }

}
