package com.ifanjszalukhu.databindinggdk19;

//TODO 5: Add favorite variable
public class Movie {
    private String title;
    private String overview;
    private String poster;

    public Movie(String title, String overview, String poster) {
        this.title = title;
        this.overview = overview;
        this.poster = poster;
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
