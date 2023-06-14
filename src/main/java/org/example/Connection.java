package org.example;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.example.model.Activity;
import org.example.repository.ActivityRepository;
import org.example.repository.ActivityRepositoryImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Connection {
    private static final Logger logger = LoggerFactory.getLogger(Connection.class);

    public static void main(String[] args) {
        String connectionString = "mongodb+srv://app-de-test:app-de-test@cluster0.2yi90z5.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            logger.info("Database connection successful");
            MongoDatabase database = mongoClient.getDatabase("myBibliotheque");
            MongoCollection<Document> activityCollection = database.getCollection("activity");
            ActivityRepository activityRepository = new ActivityRepositoryImpl(activityCollection);

            // Ajouter une activité dans la BDD
            /*insertOneActivity.insertActivity(activityCollection, activityRepository);
            logger.info("Activité enregistrée");*/

            //Récupérer toutes les activités :
            List<Activity> activities = activityRepository.getAllActivities();

            for (Activity activity : activities) {
                System.out.println(activity.toString());
                System.out.println();
            }

        } catch (Exception e) {
            logger.error("An error occurred during connection ==> {}", e);
        }

    }
}
