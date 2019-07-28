package com.ifanjszalukhu.databindinggdk19;

public class Movie {
    private String title;
    private String overview;
    private String poster;
    private Boolean isFavorite;

    public Movie(String title, String overview, String poster, Boolean isFavorite) {
        this.title = title;
        this.overview = overview;
        this.poster = poster;
        this.isFavorite = isFavorite;
    }

    public Boolean getIsFavorite() {
        return isFavorite;
    }

    public void setIsFavorite(Boolean isFavorite) {
        isFavorite = isFavorite;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
}
