package com.amazon.alexa.accessory.frames.media.models;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Dao
/* loaded from: classes15.dex */
public interface ThumbnailDao {
    @Query("SELECT COUNT(*) FROM Thumbnail")
    int countThumbnails();

    @Delete
    void delete(Thumbnail thumbnail);

    @Query("SELECT * FROM Thumbnail ORDER BY createdAt DESC")
    List<Thumbnail> getAllThumbnails();

    @Query("SELECT * FROM Thumbnail WHERE :accessoryId IS NULL OR accessoryId = :accessoryId ORDER BY createdAt DESC")
    List<Thumbnail> getAllThumbnailsForAccessory(String str);

    @Insert
    void insert(Thumbnail thumbnail);

    @Update
    void update(Thumbnail thumbnail);
}
