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
public interface MediaDao {
    @Query("UPDATE Media SET snapshotPath = NULL, snapshotCreatedAt = NULL, isEnhanced = 0 WHERE mediaId = :mediaId AND accessoryId = :accessoryId")
    void clearSnapshot(long j, String str);

    @Delete
    void delete(Media media);

    @Query("DELETE FROM Media WHERE mediaId = :mediaId AND accessoryId = :accessoryId")
    void deleteMediaById(long j, String str);

    @Query("DELETE FROM Media WHERE mediaId in (:mediaIds) AND accessoryId = :accessoryId")
    void deleteMediaByIds(List<Long> list, String str);

    @Query("SELECT * FROM Media")
    List<Media> getAllMedia();

    @Query("SELECT * FROM Media WHERE mediaId = :mediaId AND accessoryId = :accessoryId")
    Media getMedia(long j, String str);

    @Query("SELECT * FROM Media WHERE displayName = :displayName")
    Media getMediaByDisplayName(String str);

    @Query("SELECT * FROM Media WHERE mediaId = :mediaId LIMIT 1")
    Media getMediaById(long j);

    @Query("SELECT * FROM Media WHERE accessoryId = :accessoryId AND deviceReceiptState = :receiptState ORDER BY importedAt ASC")
    List<Media> getMediaByReceiptState(String str, String str2);

    @Query("SELECT * FROM Media WHERE accessoryId = :accessoryId AND sourceAssetId = :sourceAssetId LIMIT 1")
    Media getMediaBySourceAssetId(String str, String str2);

    @Query("SELECT * FROM Media WHERE fileWriteStatus = :fileWriteStatus")
    List<Media> getMediaByWriteStatus(String str);

    @Query("SELECT * FROM Media WHERE snapshotPath IS NOT NULL ORDER BY snapshotCreatedAt ASC")
    List<Media> getMediaWithSnapshotsOldestFirst();

    @Insert
    void insert(Media media);

    @Query("UPDATE Media SET isShowingEnhanced = :isShowingEnhanced WHERE mediaId = :mediaId AND accessoryId = :accessoryId")
    void setShowingEnhanced(long j, String str, boolean z);

    @Update
    void update(Media media);

    @Query("UPDATE Media SET amazonPhotosNodeId = :amazonPhotosNodeId, amazonPhotosUploadStatus = :amazonPhotosUploadStatus WHERE mediaId = :mediaId AND accessoryId = :accessoryId")
    void updateAmazonPhotosStatus(long j, String str, String str2, String str3);

    @Query("UPDATE Media SET displayName= :displayName WHERE mediaId = :mediaId AND accessoryId = :accessoryId")
    void updateAssetDisplayName(long j, String str, String str2);

    @Query("UPDATE Media SET fileLocation= :fileLocation, fileWriteStatus = :fileWriteStatus, deviceReceiptState = :receiptState, pendingMediaStoreUri = NULL WHERE mediaId = :mediaId AND accessoryId = :accessoryId")
    void updateCompletedImport(long j, String str, String str2, String str3, String str4);

    @Query("UPDATE Media SET fileLocation= :fileLocation, fileWriteStatus = :fileWriteStatus, pendingMediaStoreUri = NULL WHERE mediaId = :mediaId AND accessoryId = :accessoryId")
    void updateFileLocation(long j, String str, String str2, String str3);

    @Query("UPDATE Media SET unenhancedMediaId = :unenhancedMediaId, isEnhanced = :isEnhanced WHERE mediaId = :mediaId AND accessoryId = :accessoryId")
    void updateImageEnhancementStatus(long j, String str, Long l, boolean z);

    @Query("UPDATE Media SET pendingMediaStoreUri = :pendingMediaStoreUri WHERE mediaId = :mediaId AND accessoryId = :accessoryId")
    void updatePendingMediaStoreUri(long j, String str, String str2);

    @Query("UPDATE Media SET deviceReceiptState = :receiptState WHERE mediaId = :mediaId AND accessoryId = :accessoryId")
    void updateReceiptState(long j, String str, String str2);

    @Query("UPDATE Media SET snapshotPath = :snapshotPath, snapshotCreatedAt = :snapshotCreatedAt, isShowingEnhanced = 1, isEnhanced = :isEnhanced WHERE mediaId = :mediaId AND accessoryId = :accessoryId")
    void updateSnapshotInfo(long j, String str, String str2, Long l, boolean z);
}
