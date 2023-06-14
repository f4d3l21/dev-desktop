package org.example.mockup;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.InsertOneResult;
import org.bson.Document;
import org.example.model.Activity;
import org.example.repository.ActivityRepository;

import java.util.Date;

public class insertOneActivity {
    public static void insertActivity(MongoCollection<Document> activityCollection, ActivityRepository activityRepository) {
        Activity activity = new Activity(
                "Course à pied",
                30,
                new Date(),
                7
        );
        InsertOneResult result = activityRepository.save(activity);
    }
}
