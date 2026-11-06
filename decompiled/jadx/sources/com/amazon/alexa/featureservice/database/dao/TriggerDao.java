package com.amazon.alexa.featureservice.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;
import com.amazon.alexa.featureservice.database.entity.ExperimentTrigger;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Dao
/* loaded from: classes17.dex */
public interface TriggerDao {
    @Delete
    int delete(ExperimentTrigger experimentTrigger);

    @Delete
    int delete(List<ExperimentTrigger> list);

    @Query("DELETE FROM ExperimentTrigger")
    int deleteAll();

    @Query("DELETE FROM ExperimentTrigger WHERE uploaded = 1")
    int deleteAllUploaded();

    @Query("DELETE FROM ExperimentTrigger WHERE feature_name = :featureName AND namespace = :namespace")
    int deleteByKey(String str, String str2);

    @Query("SELECT * FROM ExperimentTrigger")
    List<ExperimentTrigger> getAll();

    @Transaction
    default List<ExperimentTrigger> getAndMarkPendingExperimentTriggers() {
        List<ExperimentTrigger> pendingTriggers = getPendingTriggers();
        markAllPendingAsUploaded();
        return pendingTriggers;
    }

    @Query("SELECT * FROM ExperimentTrigger WHERE feature_name = :featureName AND namespace = :namespace")
    ExperimentTrigger getByKey(String str, String str2);

    @Query("SELECT COUNT(*) FROM ExperimentTrigger WHERE uploaded = 0")
    int getPendingTriggerCount();

    @Query("SELECT * FROM ExperimentTrigger WHERE uploaded = 0 ORDER BY time_used ASC")
    List<ExperimentTrigger> getPendingTriggers();

    @Query("SELECT * FROM ExperimentTrigger WHERE uploaded = 1")
    List<ExperimentTrigger> getUploadedTriggers();

    @Insert(onConflict = 1)
    long insert(ExperimentTrigger experimentTrigger);

    @Insert(onConflict = 1)
    long[] insert(List<ExperimentTrigger> list);

    @Query("UPDATE ExperimentTrigger SET uploaded = 1 WHERE uploaded = 0")
    int markAllPendingAsUploaded();

    @Query("UPDATE ExperimentTrigger SET uploaded = 0 WHERE uploaded = 1")
    int markAllUploadedAsPending();

    @Query("UPDATE ExperimentTrigger SET uploaded = 1 WHERE feature_name = :featureName AND namespace = :namespace")
    int markAsUploaded(String str, String str2);

    @Update
    int update(ExperimentTrigger experimentTrigger);

    @Update
    int update(List<ExperimentTrigger> list);
}
