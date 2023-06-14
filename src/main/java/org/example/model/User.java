package org.example.model;

import java.util.Date;

public class User {

    public User(String name, String forename, Date birthday, String genre) {
        this.name = name;
        this.forename = forename;
        this.birthday = birthday;
        this.genre = genre;
    }

    private String name;
    private String forename;
    private Date birthday;
    private String genre;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
