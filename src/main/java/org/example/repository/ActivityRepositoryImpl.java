package org.example.repository;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.result.InsertOneResult;
import org.example.mapper.ActivityMapper;
import org.example.model.Activity;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

import static org.example.mapper.ActivityMapper.activityToDocument;

public class ActivityRepositoryImpl implements ActivityRepository{
    MongoCollection<Document> collection;
    public ActivityRepositoryImpl(MongoCollection<Document> collection) {
        this.collection = collection;
    }

    @Override
    public InsertOneResult save(Activity Activity){
        return this.collection.insertOne(activityToDocument(Activity));
    }

    @Override
    public List<Activity> getAllActivities() {
        List<Activity> activities = new ArrayList<>();

        // Récupérer tous les documents de la collection
        try (MongoCursor<Document> cursor = collection.find().iterator()) {
            while (cursor.hasNext()) {
                Document document = cursor.next();
                // Utiliser le mapper pour convertir chaque document en objet Activity
                Activity activity = ActivityMapper.documentToActivity(document);
                activities.add(activity);
            }
        }

        return activities;
    }

}
