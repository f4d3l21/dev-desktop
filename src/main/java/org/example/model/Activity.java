package org.example.model;

import java.util.Date;

public class Activity {

    public Activity(String name, float duration, Date date, int rpe) {
        this.name = name;
        this.duration = duration;
        this.date = date;
        this.rpe = rpe;
        this.charge = duration * rpe;
    }

    private String name;
    private float duration;
    private Date date;
    private int rpe;
    private float charge;

    public String getName() {return name;}
    public void setName(java.lang.String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getCharge() {
        return charge;
    }

    public void setCharge(float charge) {
        this.charge = charge;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public int getRpe() {
        return rpe;
    }

    public void setRpe(int rpe) {
        this.rpe = rpe;
    }

    @Override
    public String toString() {
        return "Activité : {" + "\n" +
                "name : '" + name + '\'' + "," + "\n" +
                "duration : " + duration + "," + "\n" +
                "date : " + date + "," + "\n" +
                "rpe : " + rpe + "," + "\n" +
                "charge : " + charge + "," +  "\n" +
                '}';
    }
}