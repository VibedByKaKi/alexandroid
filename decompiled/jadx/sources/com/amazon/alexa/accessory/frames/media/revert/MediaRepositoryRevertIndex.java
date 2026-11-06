package com.amazon.alexa.accessory.frames.media.revert;

import com.amazon.alexa.accessory.frames.media.models.Media;
import com.amazon.alexa.accessory.frames.media.repository.MediaRepository;
import com.amazon.alexa.voice.nowplaying.bridge.VoiceBridgePayloadUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\tH\u0016J \u0010\u0012\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/revert/MediaRepositoryRevertIndex;", "Lcom/amazon/alexa/accessory/frames/media/revert/RevertMediaIndex;", "mediaRepository", "Lcom/amazon/alexa/accessory/frames/media/repository/MediaRepository;", "<init>", "(Lcom/amazon/alexa/accessory/frames/media/repository/MediaRepository;)V", "getMedia", "Lcom/amazon/alexa/accessory/frames/media/models/Media;", VoiceBridgePayloadUtil.PayloadKey.PLAYER_INFO_ID, "", "accessoryId", "", "getMediaById", "deleteMediaWithCascade", "", "updateSnapshotInfo", "snapshotPath", "snapshotCreatedAt", "setShowingEnhanced", "isShowingEnhanced", "", "clearSnapshot", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MediaRepositoryRevertIndex implements RevertMediaIndex {

    @NotNull
    private final MediaRepository mediaRepository;

    public MediaRepositoryRevertIndex(@NotNull MediaRepository mediaRepository) {
        mediaRepository.getClass();
        this.mediaRepository = mediaRepository;
    }

    @Override // com.amazon.alexa.accessory.frames.media.revert.RevertMediaIndex
    public void clearSnapshot(long mediaId, @NotNull String accessoryId) {
        accessoryId.getClass();
        this.mediaRepository.clearSnapshot(mediaId, accessoryId);
    }

    @Override // com.amazon.alexa.accessory.frames.media.revert.RevertMediaIndex
    public void deleteMediaWithCascade(long mediaId, @NotNull String accessoryId) {
        accessoryId.getClass();
        this.mediaRepository.deleteMediaWithCascade(mediaId, accessoryId);
    }

    @Override // com.amazon.alexa.accessory.frames.media.revert.RevertMediaIndex
    @Nullable
    public Media getMedia(long mediaId, @NotNull String accessoryId) {
        accessoryId.getClass();
        return this.mediaRepository.getMedia(mediaId, accessoryId);
    }

    @Override // com.amazon.alexa.accessory.frames.media.revert.RevertMediaIndex
    @Nullable
    public Media getMediaById(long mediaId) {
        return this.mediaRepository.getMediaById(mediaId);
    }

    @Override // com.amazon.alexa.accessory.frames.media.revert.RevertMediaIndex
    public void setShowingEnhanced(long mediaId, @NotNull String accessoryId, boolean isShowingEnhanced) {
        accessoryId.getClass();
        this.mediaRepository.setShowingEnhanced(mediaId, accessoryId, isShowingEnhanced);
    }

    @Override // com.amazon.alexa.accessory.frames.media.revert.RevertMediaIndex
    public void updateSnapshotInfo(long mediaId, @NotNull String accessoryId, @NotNull String snapshotPath, long snapshotCreatedAt) {
        accessoryId.getClass();
        snapshotPath.getClass();
        this.mediaRepository.updateSnapshotInfo(mediaId, accessoryId, snapshotPath, snapshotCreatedAt);
    }
}
