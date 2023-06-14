package org.example.mapper;

import org.bson.Document;
import org.example.model.Activity;

import java.util.Date;

public class ActivityMapper {

    public static Document activityToDocument(Activity activity) {

        return new Document()
                .append("name", activity.getName())
                .append("duration", activity.getDuration())
                .append("date", activity.getDate())
                .append("rpe", activity.getRpe())
                .append("charge", activity.getCharge());
    }

    public static Activity documentToActivity(Document document) {
        String name = document.getString("name");
        double durationDouble = document.getDouble("duration");
        float duration = (float) durationDouble;
        Date date = document.getDate("date");
        int rpe = document.getInteger("rpe");

        return new Activity(name, duration, date, rpe);
    }
}
