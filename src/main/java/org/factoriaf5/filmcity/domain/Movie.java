package org.factoriaf5.filmcity.domain;

import javax.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String title;
    private String coverImage;
    private String director;
    private int year;
    @Lob
    private String synopsis;
    private String renter = null;
    private boolean booked = false;
    private int rating = 0;
    private Double score;

    public Movie() { }

    public Movie(String title,
                 String coverImage,
                 String director,
                 int year,
                 String synopsis,
                 String renter,
                 Boolean booked,
                 int rating,
                 Double score

    ) {
        this.title = title;
        this.coverImage = coverImage;
        this.director = director;
        this.year = year;
        this.synopsis = synopsis;
        this.renter = renter;
        this.booked = booked;
        this.rating = rating;
        this.score = score;


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setRented(String renter) { this.renter = renter; }

    public String getRenter() {
        return renter;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) { this.booked = booked; }

    public int getRatting() {
        return rating;
    }
    public void setRatting(int rating) { this.rating = rating; }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) { this.score = score; }
}