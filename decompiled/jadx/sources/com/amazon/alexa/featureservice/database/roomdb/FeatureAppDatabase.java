package com.amazon.alexa.featureservice.database.roomdb;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import com.amazon.alexa.featureservice.database.dao.FeatureFlagDao;
import com.amazon.alexa.featureservice.database.dao.TriggerDao;
import com.amazon.alexa.featureservice.database.entity.ExperimentTrigger;
import com.amazon.alexa.featureservice.database.entity.Feature;
import com.amazon.alexa.featureservice.util.Converters;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@TypeConverters({Converters.class})
@Database(entities = {Feature.class, ExperimentTrigger.class}, version = 3)
/* loaded from: classes17.dex */
public abstract class FeatureAppDatabase extends RoomDatabase {
    private static final String APP_DATABASE_FILE_NAME = "com.amazon.alexa.featureservice.FeatureServiceV2.db";
    private static volatile FeatureAppDatabase instance;

    public static FeatureAppDatabase getInstance(Context context) {
        if (instance == null) {
            synchronized (FeatureAppDatabase.class) {
                try {
                    if (instance == null) {
                        instance = (FeatureAppDatabase) Room.databaseBuilder(context.getApplicationContext(), FeatureAppDatabase.class, APP_DATABASE_FILE_NAME).addMigrations(Migrations.MIGRATION_1_2, Migrations.MIGRATION_2_3).build();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    public abstract FeatureFlagDao featureDao();

    public abstract TriggerDao triggerDao();
}
