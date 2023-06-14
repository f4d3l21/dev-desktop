package org.example.repository;

import com.mongodb.client.result.InsertOneResult;
import org.example.model.Activity;

import java.util.List;

public interface ActivityRepository {

    InsertOneResult save(Activity activity);

    List<Activity> getAllActivities();
}
