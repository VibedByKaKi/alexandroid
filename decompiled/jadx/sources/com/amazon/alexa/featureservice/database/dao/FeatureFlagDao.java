package com.amazon.alexa.featureservice.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.amazon.alexa.featureservice.database.entity.Feature;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Dao
/* loaded from: classes17.dex */
public interface FeatureFlagDao {
    @Delete
    int delete(Feature feature);

    @Query("DELETE FROM Feature")
    int deleteAll();

    @Query("SELECT * FROM FEATURE WHERE featureName = :feature")
    Feature get(String str);

    @Query("SELECT * FROM Feature WHERE deprecated = 0")
    List<Feature> getActiveFeatures();

    @Query("SELECT * FROM Feature")
    List<Feature> getAll();

    @Insert(onConflict = 1)
    long insert(Feature feature);

    @Insert(onConflict = 1)
    void insert(List<Feature> list);
}
