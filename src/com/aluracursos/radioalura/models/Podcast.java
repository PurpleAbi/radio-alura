package com.aluracursos.radioalura.models;

public class Podcast extends Audio{
    private String topic;
    private String hosts;
    private boolean partOfSeries;
    private int totalEpisodes;

    public boolean isPartOfSeries() {
        return partOfSeries;
    }

    public void setPartOfSeries(boolean partOfSeries) {
        this.partOfSeries = partOfSeries;
    }

    public int getTotalEpisodes() {
        return totalEpisodes;
    }

    public void setTotalEpisodes(int totalEpisodes) {
        this.totalEpisodes = totalEpisodes;
    }

    public String getHosts() {
        return hosts;
    }

    public void setHosts(String hosts) {
        this.hosts = hosts;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
