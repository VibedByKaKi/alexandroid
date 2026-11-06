package com.amazon.alexa.api.compat.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.hho.metrics.HHOMetricsConstants;
import com.amazon.clouddrive.cdasdk.prompto.collections.GroupCollectionKind;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/api/compat/model/MediaMetadataBundleKeys;", "", "<init>", "()V", "ID", "", "SONG", "ARTIST", GroupCollectionKind.ALBUM, "ALBUM_ART", "SECONDARY_ART", HHOMetricsConstants.Subcomponent.PROVIDER, "DURATION", "POSITION", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class MediaMetadataBundleKeys {
    public static final int $stable = 0;

    @NotNull
    public static final String ALBUM = "albumName";

    @NotNull
    public static final String ALBUM_ART = "albumArtUri";

    @NotNull
    public static final String ARTIST = "artistName";

    @NotNull
    public static final String DURATION = "duration";

    @NotNull
    public static final String ID = "mediaItemId";

    @NotNull
    public static final MediaMetadataBundleKeys INSTANCE = new MediaMetadataBundleKeys();

    @NotNull
    public static final String POSITION = "currentPosition";

    @NotNull
    public static final String PROVIDER = "mediaServiceProvider";

    @NotNull
    public static final String SECONDARY_ART = "secondaryArtUri";

    @NotNull
    public static final String SONG = "songName";

    private MediaMetadataBundleKeys() {
    }
}
