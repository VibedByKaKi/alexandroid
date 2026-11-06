package com.amazon.alexa.accessory.notificationpublisher.artifactdownloader.persistence;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Dao
/* loaded from: classes15.dex */
public interface ArtifactDao {
    @Delete
    int delete(Artifact artifact);

    @Query("SELECT * FROM artifact_detail WHERE artifact_id = :artifactIdentifier")
    Artifact get(int i);

    @Query("SELECT * FROM artifact_detail")
    List<Artifact> getAll();

    @Query("SELECT * FROM artifact_detail WHERE update_check_required")
    List<Artifact> getArtifactsForUpdateCheck();

    @Insert(onConflict = 1)
    void insert(Artifact... artifactArr);

    @Update
    void update(Artifact artifact);
}
