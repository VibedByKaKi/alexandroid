package com.amazon.alexa.accessory.frames.media.revert;

import com.amazon.alexa.accessory.frames.media.models.Media;
import com.amazon.alexa.voice.nowplaying.bridge.VoiceBridgePayloadUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H&J \u0010\u000e\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/revert/RevertMediaIndex;", "", "getMedia", "Lcom/amazon/alexa/accessory/frames/media/models/Media;", VoiceBridgePayloadUtil.PayloadKey.PLAYER_INFO_ID, "", "accessoryId", "", "getMediaById", "deleteMediaWithCascade", "", "updateSnapshotInfo", "snapshotPath", "snapshotCreatedAt", "setShowingEnhanced", "isShowingEnhanced", "", "clearSnapshot", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface RevertMediaIndex {
    void clearSnapshot(long mediaId, @NotNull String accessoryId);

    void deleteMediaWithCascade(long mediaId, @NotNull String accessoryId);

    @Nullable
    Media getMedia(long mediaId, @NotNull String accessoryId);

    @Nullable
    Media getMediaById(long mediaId);

    void setShowingEnhanced(long mediaId, @NotNull String accessoryId, boolean isShowingEnhanced);

    void updateSnapshotInfo(long mediaId, @NotNull String accessoryId, @NotNull String snapshotPath, long snapshotCreatedAt);
}
