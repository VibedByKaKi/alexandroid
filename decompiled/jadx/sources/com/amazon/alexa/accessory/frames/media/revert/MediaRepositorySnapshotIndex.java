package com.amazon.alexa.accessory.frames.media.revert;

import com.amazon.alexa.accessory.frames.media.models.Media;
import com.amazon.alexa.accessory.frames.media.repository.MediaRepository;
import com.amazon.alexa.voice.nowplaying.bridge.VoiceBridgePayloadUtil;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/revert/MediaRepositorySnapshotIndex;", "Lcom/amazon/alexa/accessory/frames/media/revert/SnapshotIndex;", "mediaRepository", "Lcom/amazon/alexa/accessory/frames/media/repository/MediaRepository;", "<init>", "(Lcom/amazon/alexa/accessory/frames/media/repository/MediaRepository;)V", "mediaWithSnapshotsOldestFirst", "", "Lcom/amazon/alexa/accessory/frames/media/models/Media;", "clearSnapshot", "", VoiceBridgePayloadUtil.PayloadKey.PLAYER_INFO_ID, "", "accessoryId", "", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MediaRepositorySnapshotIndex implements SnapshotIndex {

    @NotNull
    private final MediaRepository mediaRepository;

    public MediaRepositorySnapshotIndex(@NotNull MediaRepository mediaRepository) {
        mediaRepository.getClass();
        this.mediaRepository = mediaRepository;
    }

    @Override // com.amazon.alexa.accessory.frames.media.revert.SnapshotIndex
    public void clearSnapshot(long mediaId, @NotNull String accessoryId) {
        accessoryId.getClass();
        this.mediaRepository.clearSnapshot(mediaId, accessoryId);
    }

    @Override // com.amazon.alexa.accessory.frames.media.revert.SnapshotIndex
    @NotNull
    public List<Media> mediaWithSnapshotsOldestFirst() {
        List<Media> mediaWithSnapshotsOldestFirst = this.mediaRepository.getMediaWithSnapshotsOldestFirst();
        mediaWithSnapshotsOldestFirst.getClass();
        return mediaWithSnapshotsOldestFirst;
    }
}
