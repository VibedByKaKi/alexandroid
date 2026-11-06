package com.amazon.alexa.accessory.frames.media.repository;

import android.content.Context;
import androidx.annotation.WorkerThread;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.work.impl.Processor$$ExternalSyntheticLambda2;
import com.amazon.alexa.accessory.frames.eventbus.MediaImportEventBusManager;
import com.amazon.alexa.accessory.frames.media.models.Media;
import com.amazon.alexa.accessory.frames.media.models.MediaDao;
import com.amazon.alexa.accessory.frames.media.models.MediaDatabase;
import com.amazon.alexa.accessory.frames.media.models.Thumbnail;
import com.amazon.alexa.accessory.frames.media.models.ThumbnailDao;
import com.amazon.alexa.accessory.frames.media.repository.exceptions.MediaIndexException;
import com.amazon.alexa.accessory.frames.media.utils.MediaGalleryUtils;
import com.amazon.alexa.accessory.frames.metrics.media.MediaImportError;
import com.amazon.alexa.accessory.frames.utils.Log;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class MediaRepository {
    private static final String TAG = "MediaRepository";
    private static volatile MediaRepository mediaRepository;
    private final MediaDao mediaDao;
    private final MediaDatabase mediaDatabase;
    private final ThumbnailDao thumbnailDao;

    private MediaRepository(Context context) {
        MediaDatabase mediaDatabase = MediaGalleryUtils.getInstance(context).getMediaDatabase();
        this.mediaDatabase = mediaDatabase;
        this.mediaDao = mediaDatabase.mediaDao();
        this.thumbnailDao = mediaDatabase.thumbnailDao();
    }

    public static MediaRepository getInstance(Context context) {
        if (mediaRepository == null) {
            synchronized (MediaRepository.class) {
                try {
                    if (mediaRepository == null) {
                        mediaRepository = new MediaRepository(context);
                    }
                } finally {
                }
            }
        }
        return mediaRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateMediaAndThumbnail$0(Media media, Thumbnail thumbnail) {
        String str = media.deviceReceiptState;
        MediaDao mediaDao = this.mediaDao;
        if (str != null) {
            mediaDao.updateCompletedImport(media.mediaId, media.accessoryId, media.fileLocation, media.fileWriteStatus, str);
        } else {
            mediaDao.updateFileLocation(media.mediaId, media.accessoryId, media.fileLocation, media.fileWriteStatus);
        }
        String str2 = media.displayName;
        if (str2 != null) {
            this.mediaDao.updateAssetDisplayName(media.mediaId, media.accessoryId, str2);
        }
        this.thumbnailDao.insert(thumbnail);
    }

    public void bulkDeleteMediaWithCascade(List<Long> list, String str) throws MediaIndexException {
        Log.d(TAG, "bulkDeleteMediaWithCascade - mediaIds: %s, accessoryId: %s", list, str);
        Preconditions.notNull(str, "accessoryId is null");
        try {
            this.mediaDao.deleteMediaByIds(list, str);
        } catch (Exception e) {
            Log.e(TAG, "bulkDeleteMediaWithCascade - Error: " + e);
            throw new MediaIndexException(ErrorUtils$$ExternalSyntheticOutline0.m(e, new StringBuilder("Failed media index operation: ")), e);
        }
    }

    public void clearSnapshot(long j, String str) throws MediaIndexException {
        Log.d(TAG, "clearSnapshot");
        Preconditions.notNull(str, "accessoryId is null");
        try {
            this.mediaDao.clearSnapshot(j, str);
        } catch (Exception e) {
            Log.e(TAG, "clearSnapshot - Error: " + e);
            throw new MediaIndexException(ErrorUtils$$ExternalSyntheticOutline0.m(e, new StringBuilder("Failed media index operation: ")), e);
        }
    }

    public int countThumbnails() throws MediaIndexException {
        Log.d(TAG, "countThumbnails");
        try {
            return this.thumbnailDao.countThumbnails();
        } catch (Exception e) {
            Log.e(TAG, "countThumbnails - Error: " + e);
            throw new MediaIndexException(ErrorUtils$$ExternalSyntheticOutline0.m(e, new StringBuilder("Failed media index operation: ")), e);
        }
    }

    public void deleteMediaWithCascade(long j, String str) throws MediaIndexException {
        Log.d(TAG, "deleteMediaWithCascade - mediaId: %s, accessoryId: %s", Long.valueOf(j), str);
        Preconditions.notNull(str, "accessoryId is null");
        try {
            this.mediaDao.deleteMediaById(j, str);
        } catch (Exception e) {
            Log.e(TAG, "deleteMediaWithCascade - Error: " + e);
            throw new MediaIndexException(ErrorUtils$$ExternalSyntheticOutline0.m(e, new StringBuilder("Failed media index operation: ")), e);
        }
    }

    public List<Media> getAllMedia() throws MediaIndexException {
        Log.d(TAG, "getAllMedia");
        try {
            return this.mediaDao.getAllMedia();
        } catch (Exception e) {
            Log.e(TAG, "getAllMedia - Error: " + e);
            throw new MediaIndexException(ErrorUtils$$ExternalSyntheticOutline0.m(e, new StringBuilder("Failed media index operation: ")), e);
        }
    }

    public List<Thumbnail> getAllThumbnails() throws MediaIndexException {
        Log.d(TAG, "getAllThumbnails");
        try {
            return this.thumbnailDao.getAllThumbnails();
        } catch (Exception e) {
            Log.e(TAG, "getAllThumbnails - Error: " + e);
            throw new MediaIndexException(ErrorUtils$$ExternalSyntheticOutline0.m(e, new StringBuilder("Failed media index operation: ")), e);
        }
    }

    public List<Thumbnail> getAllThumbnailsForAccessory(String str) throws MediaIndexException {
        Log.d(TAG, "getAllThumbnailsForAccessory - accessoryId: %s", str);
        try {
            return this.thumbnailDao.getAllThumbnailsForAccessory(str);
        } catch (Exception e) {
            Log.e(TAG, "getAllThumbnailsForAccessory - Error: " + e);
            throw new MediaIndexException(ErrorUtils$$ExternalSyntheticOutline0.m(e, new StringBuilder("Failed media index operation: ")), e);
        }
    }

    public Media getMedia(long j, String str) throws MediaIndexException {
        Log.d(TAG, "getMedia - mediaId: %s, accessoryId: %s", Long.valueOf(j), str);
        Preconditions.notNull(str, "accessoryId is null");
        try {
            return this.mediaDao.getMedia(j, str);
        } catch (Exception e) {
            Log.e(TAG, "getMedia - Error: " + e);
            throw new MediaIndexException(ErrorUtils$$ExternalSyntheticOutline0.m(e, new StringBuilder("Failed media index operation: ")), e);
        }
    }

    @WorkerThread
    public Media getMediaByDisplayName(String str) throws MediaIndexException {
        Log.d(TAG, "getMediaByDisplayName - mediaDisplayName: %s", str);
        try {
            return this.mediaDao.getMediaByDisplayName(str);
        } catch (Exception e) {
            Log.e(TAG, "getMediaByDisplayName - Error: " + e);
            throw new MediaIndexException(ErrorUtils$$ExternalSyntheticOutline0.m(e, new StringBuilder("Failed media index operation: ")), e);
        }
    }

    public Media getMediaById(long j) throws MediaIndexException {
        Log.d(TAG, "getMediaById - mediaId: %s", Long.valueOf(j));
        try {
            return this.mediaDao.getMediaById(j);
        } catch (Exception e) {
            Log.e(TAG, "getMediaById - Error: " + e);
            throw new MediaIndexException(ErrorUtils$$ExternalSyntheticOutline0.m(e, new StringBuilder("Failed media index operation: ")), e);
        }
    }

    @WorkerThread
    public List<Media> getMediaByReceiptState(String str, String str2) throws MediaIndexException {
        try {
            return this.mediaDao.getMediaByReceiptState(str, str2);
        } catch (Exception e) {
            Log.e(TAG, "getMediaByReceiptState - Error: " + e);
            throw new MediaIndexException(ErrorUtils$$ExternalSyntheticOutline0.m(e, new StringBuilder("Failed media index operation: ")), e);
        }
    }

    @WorkerThread
    public Media getMediaBySourceAssetId(String str, String str2) throws MediaIndexException {
        try {
            return this.mediaDao.getMediaBySourceAssetId(str, str2);
        } catch (Exception e) {
            Log.e(TAG, "getMediaBySourceAssetId - Error: " + e);
            throw new MediaIndexException(ErrorUtils$$ExternalSyntheticOutline0.m(e, new StringBuilder("Failed media index operation: ")), e);
        }
    }

    @WorkerThread
    public List<Media> getMediaByWriteStatus(String str) throws MediaIndexException {
        Log.d(TAG, "getMediaByWriteStatus - status: %s", str);
        try {
            return this.mediaDao.getMediaByWriteStatus(str);
        } catch (Exception e) {
            Log.e(TAG, "getMediaByWriteStatus - Error: " + e);
            throw new MediaIndexException(ErrorUtils$$ExternalSyntheticOutline0.m(e, new StringBuilder("Failed media index operation: ")), e);
        }
    }

    public List<Media> getMediaWithSnapshotsOldestFirst() throws MediaIndexException {
        try {
            return this.mediaDao.getMediaWithSnapshotsOldestFirst();
        } catch (Exception e) {
            Log.e(TAG, "getMediaWithSnapshotsOldestFirst - Error: " + e);
            throw new MediaIndexException(ErrorUtils$$ExternalSyntheticOutline0.m(e, new StringBuilder("Failed media index operation: ")), e);
        }
    }

    public void insertMedia(Media media) throws MediaIndexException {
        Log.d(TAG, "insertMedia");
        Preconditions.notNull(media, "Cannot insert null media into database.");
        Preconditions.notNull(media.accessoryId, "AccessoryId cannot be null");
        try {
            this.mediaDao.insert(media);
        } catch (Exception e) {
            Log.e(TAG, "insertMedia - Error: " + e);
            throw new MediaIndexException(ErrorUtils$$ExternalSyntheticOutline0.m(e, new StringBuilder("Failed media index operation: ")), e);
        }
    }

    public void setShowingEnhanced(long j, String str, boolean z) throws MediaIndexException {
        Log.d(TAG, "setShowingEnhanced - mediaId=" + j + " showing=" + z);
        Preconditions.notNull(str, "accessoryId is null");
        try {
            this.mediaDao.setShowingEnhanced(j, str, z);
        } catch (Exception e) {
            Log.e(TAG, "setShowingEnhanced - Error: " + e);
            throw new MediaIndexException(ErrorUtils$$ExternalSyntheticOutline0.m(e, new StringBuilder("Failed media index operation: ")), e);
        }
    }

    public synchronized void tearDown() {
        mediaRepository = null;
    }

    public void updateAmazonPhotosStatus(long j, String str, String str2, String str3) throws MediaIndexException {
        Log.d(TAG, "updateAmazonPhotosStatus");
        Preconditions.notNull(str, "accessoryId is null");
        try {
            this.mediaDao.updateAmazonPhotosStatus(j, str, str2, str3);
        } catch (Exception e) {
            Log.e(TAG, "updateAmazonPhotosStatus - Error: " + e);
            throw new MediaIndexException(ErrorUtils$$ExternalSyntheticOutline0.m(e, new StringBuilder("Failed media index operation: ")), e);
        }
    }

    public void updateImageEnhancementStatus(long j, String str, Long l, boolean z) throws MediaIndexException {
        Log.d(TAG, "updateImageEnhancementStatus");
        Preconditions.notNull(str, "accessoryId is null");
        try {
            this.mediaDao.updateImageEnhancementStatus(j, str, l, z);
        } catch (Exception e) {
            Log.e(TAG, "updateImageEnhancementStatus - Error: " + e);
            throw new MediaIndexException(ErrorUtils$$ExternalSyntheticOutline0.m(e, new StringBuilder("Failed media index operation: ")), e);
        }
    }

    public void updateMediaAndThumbnail(Media media, Thumbnail thumbnail) throws MediaIndexException {
        Preconditions.notNull(media, "Cannot insert null media into database.");
        Preconditions.notNull(thumbnail, "Cannot insert null Thumbnail into database.");
        Preconditions.notNull(media.accessoryId, "AccessoryId cannot be null in Media");
        Preconditions.notNull(media.accessoryId, "AccessoryId cannot be null in Thumbnail");
        try {
            this.mediaDatabase.runInTransaction(new Processor$$ExternalSyntheticLambda2(this, 21, media, thumbnail));
        } catch (Exception e) {
            Log.e(TAG, "updateMediaAndThumbnail - Error: " + e);
            MediaImportEventBusManager.publishMediaImportError(MediaImportError.MEDIA_SAVE_INDEX_UPDATE_FAILED);
            throw new MediaIndexException(ErrorUtils$$ExternalSyntheticOutline0.m(e, new StringBuilder("Failed media index operation: ")), e);
        }
    }

    @WorkerThread
    public void updatePendingMediaStoreUri(long j, String str, String str2) throws MediaIndexException {
        try {
            this.mediaDao.updatePendingMediaStoreUri(j, str, str2);
        } catch (Exception e) {
            Log.e(TAG, "updatePendingMediaStoreUri - Error: " + e);
            throw new MediaIndexException(ErrorUtils$$ExternalSyntheticOutline0.m(e, new StringBuilder("Failed media index operation: ")), e);
        }
    }

    @WorkerThread
    public void updateReceiptState(long j, String str, String str2) throws MediaIndexException {
        try {
            this.mediaDao.updateReceiptState(j, str, str2);
        } catch (Exception e) {
            Log.e(TAG, "updateReceiptState - Error: " + e);
            throw new MediaIndexException(ErrorUtils$$ExternalSyntheticOutline0.m(e, new StringBuilder("Failed media index operation: ")), e);
        }
    }

    public void updateSnapshotInfo(long j, String str, String str2, long j2) throws MediaIndexException {
        Log.d(TAG, "updateSnapshotInfo");
        Preconditions.notNull(str, "accessoryId is null");
        Preconditions.notNull(str2, "snapshotPath is null");
        try {
            this.mediaDao.updateSnapshotInfo(j, str, str2, Long.valueOf(j2), true);
        } catch (Exception e) {
            Log.e(TAG, "updateSnapshotInfo - Error: " + e);
            throw new MediaIndexException(ErrorUtils$$ExternalSyntheticOutline0.m(e, new StringBuilder("Failed media index operation: ")), e);
        }
    }
}
