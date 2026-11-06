package com.brentvatne.common.api;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.brentvatne.common.toolbox.DebugLog;
import com.brentvatne.common.toolbox.ReactBridgeUtils;
import com.dee.app.contacts.common.constants.Constants;
import com.facebook.common.util.UriUtil;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 [2\u00020\u0001:\u0002Z[B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010U\u001a\u00020\u0014H\u0016J\u0013\u0010V\u001a\u00020\r2\b\u0010W\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u000e\u0010X\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R\u001c\u0010\"\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0016\"\u0004\b/\u0010\u0018R\u001d\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000501¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u001c\u00104\u001a\u0004\u0018\u000105X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u000e\"\u0004\b<\u0010\u0010R\u001c\u0010=\u001a\u0004\u0018\u00010>X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001c\u0010C\u001a\u0004\u0018\u00010DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001a\u0010I\u001a\u00020JX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001c\u0010O\u001a\u0004\u0018\u00010PX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010T¨\u0006\\"}, d2 = {"Lcom/brentvatne/common/api/Source;", "", "<init>", "()V", "uriString", "", "uri", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", Source.PROP_SRC_IS_LOCAL_ASSET_FILE, "", "()Z", "setLocalAssetFile", "(Z)V", Source.PROP_SRC_IS_ASSET, "setAsset", "startPositionMs", "", "getStartPositionMs", "()I", "setStartPositionMs", "(I)V", "cropStartMs", "getCropStartMs", "setCropStartMs", "cropEndMs", "getCropEndMs", "setCropEndMs", Source.PROP_SRC_CONTENT_START_TIME, "getContentStartTime", "setContentStartTime", "extension", "getExtension", "()Ljava/lang/String;", "setExtension", "(Ljava/lang/String;)V", "metadata", "Lcom/brentvatne/common/api/Source$Metadata;", "getMetadata", "()Lcom/brentvatne/common/api/Source$Metadata;", "setMetadata", "(Lcom/brentvatne/common/api/Source$Metadata;)V", Source.PROP_SRC_MIN_LOAD_RETRY_COUNT, "getMinLoadRetryCount", "setMinLoadRetryCount", "headers", "", "getHeaders", "()Ljava/util/Map;", "drmProps", "Lcom/brentvatne/common/api/DRMProps;", "getDrmProps", "()Lcom/brentvatne/common/api/DRMProps;", "setDrmProps", "(Lcom/brentvatne/common/api/DRMProps;)V", Source.PROP_SRC_TEXT_TRACKS_ALLOW_CHUNKLESS_PREPARATION, "getTextTracksAllowChunklessPreparation", "setTextTracksAllowChunklessPreparation", "cmcdProps", "Lcom/brentvatne/common/api/CMCDProps;", "getCmcdProps", "()Lcom/brentvatne/common/api/CMCDProps;", "setCmcdProps", "(Lcom/brentvatne/common/api/CMCDProps;)V", "adsProps", "Lcom/brentvatne/common/api/AdsProps;", "getAdsProps", "()Lcom/brentvatne/common/api/AdsProps;", "setAdsProps", "(Lcom/brentvatne/common/api/AdsProps;)V", Source.PROP_SRC_BUFFER_CONFIG, "Lcom/brentvatne/common/api/BufferConfig;", "getBufferConfig", "()Lcom/brentvatne/common/api/BufferConfig;", "setBufferConfig", "(Lcom/brentvatne/common/api/BufferConfig;)V", "sideLoadedTextTracks", "Lcom/brentvatne/common/api/SideLoadedTextTrackList;", "getSideLoadedTextTracks", "()Lcom/brentvatne/common/api/SideLoadedTextTrackList;", "setSideLoadedTextTracks", "(Lcom/brentvatne/common/api/SideLoadedTextTrackList;)V", "hashCode", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "isEquals", "source", "Metadata", "Companion", "react-native-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Source {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String PROP_SRC_ADS = "ad";

    @NotNull
    private static final String PROP_SRC_BUFFER_CONFIG = "bufferConfig";

    @NotNull
    private static final String PROP_SRC_CMCD = "cmcd";

    @NotNull
    private static final String PROP_SRC_CONTENT_START_TIME = "contentStartTime";

    @NotNull
    private static final String PROP_SRC_CROP_END = "cropEnd";

    @NotNull
    private static final String PROP_SRC_CROP_START = "cropStart";

    @NotNull
    private static final String PROP_SRC_DRM = "drm";

    @NotNull
    private static final String PROP_SRC_HEADERS = "requestHeaders";

    @NotNull
    private static final String PROP_SRC_IS_ASSET = "isAsset";

    @NotNull
    private static final String PROP_SRC_IS_LOCAL_ASSET_FILE = "isLocalAssetFile";

    @NotNull
    private static final String PROP_SRC_METADATA = "metadata";

    @NotNull
    private static final String PROP_SRC_MIN_LOAD_RETRY_COUNT = "minLoadRetryCount";

    @NotNull
    private static final String PROP_SRC_START_POSITION = "startPosition";

    @NotNull
    private static final String PROP_SRC_TEXT_TRACKS = "textTracks";

    @NotNull
    private static final String PROP_SRC_TEXT_TRACKS_ALLOW_CHUNKLESS_PREPARATION = "textTracksAllowChunklessPreparation";

    @NotNull
    private static final String PROP_SRC_TYPE = "type";

    @NotNull
    private static final String PROP_SRC_URI = "uri";

    @NotNull
    private static final String TAG = "Source";

    @Nullable
    private AdsProps adsProps;

    @Nullable
    private CMCDProps cmcdProps;

    @Nullable
    private DRMProps drmProps;

    @Nullable
    private String extension;
    private boolean isAsset;
    private boolean isLocalAssetFile;

    @Nullable
    private Metadata metadata;

    @Nullable
    private SideLoadedTextTrackList sideLoadedTextTracks;
    private boolean textTracksAllowChunklessPreparation;

    @Nullable
    private Uri uri;

    @Nullable
    private String uriString;
    private int startPositionMs = -1;
    private int cropStartMs = -1;
    private int cropEndMs = -1;
    private int contentStartTime = -1;
    private int minLoadRetryCount = 3;

    @NotNull
    private final Map<String, String> headers = new HashMap();

    @NotNull
    private BufferConfig bufferConfig = new BufferConfig();

    @JvmStatic
    @NotNull
    public static final Source parse(@Nullable ReadableMap readableMap, @NotNull Context context) {
        return INSTANCE.parse(readableMap, context);
    }

    public boolean equals(@Nullable Object other) {
        if (other != null && (other instanceof Source)) {
            Source source = (Source) other;
            if (Intrinsics.areEqual(this.uri, source.uri) && this.cropStartMs == source.cropStartMs && this.cropEndMs == source.cropEndMs && this.startPositionMs == source.startPositionMs && Intrinsics.areEqual(this.extension, source.extension) && Intrinsics.areEqual(this.drmProps, source.drmProps) && this.contentStartTime == source.contentStartTime && Intrinsics.areEqual(this.cmcdProps, source.cmcdProps) && Intrinsics.areEqual(this.sideLoadedTextTracks, source.sideLoadedTextTracks) && Intrinsics.areEqual(this.adsProps, source.adsProps) && this.minLoadRetryCount == source.minLoadRetryCount && this.isLocalAssetFile == source.isLocalAssetFile && this.isAsset == source.isAsset && Intrinsics.areEqual(this.bufferConfig, source.bufferConfig)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final AdsProps getAdsProps() {
        return this.adsProps;
    }

    @NotNull
    public final BufferConfig getBufferConfig() {
        return this.bufferConfig;
    }

    @Nullable
    public final CMCDProps getCmcdProps() {
        return this.cmcdProps;
    }

    public final int getContentStartTime() {
        return this.contentStartTime;
    }

    public final int getCropEndMs() {
        return this.cropEndMs;
    }

    public final int getCropStartMs() {
        return this.cropStartMs;
    }

    @Nullable
    public final DRMProps getDrmProps() {
        return this.drmProps;
    }

    @Nullable
    public final String getExtension() {
        return this.extension;
    }

    @NotNull
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @Nullable
    public final Metadata getMetadata() {
        return this.metadata;
    }

    public final int getMinLoadRetryCount() {
        return this.minLoadRetryCount;
    }

    @Nullable
    public final SideLoadedTextTrackList getSideLoadedTextTracks() {
        return this.sideLoadedTextTracks;
    }

    public final int getStartPositionMs() {
        return this.startPositionMs;
    }

    public final boolean getTextTracksAllowChunklessPreparation() {
        return this.textTracksAllowChunklessPreparation;
    }

    @Nullable
    public final Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        return Objects.hash(this.uriString, this.uri, Integer.valueOf(this.startPositionMs), Integer.valueOf(this.cropStartMs), Integer.valueOf(this.cropEndMs), this.extension, this.metadata, this.headers);
    }

    /* renamed from: isAsset, reason: from getter */
    public final boolean getIsAsset() {
        return this.isAsset;
    }

    public final boolean isEquals(@NotNull Source source) {
        source.getClass();
        return Intrinsics.areEqual(this, source);
    }

    /* renamed from: isLocalAssetFile, reason: from getter */
    public final boolean getIsLocalAssetFile() {
        return this.isLocalAssetFile;
    }

    public final void setAdsProps(@Nullable AdsProps adsProps) {
        this.adsProps = adsProps;
    }

    public final void setAsset(boolean z) {
        this.isAsset = z;
    }

    public final void setBufferConfig(@NotNull BufferConfig bufferConfig) {
        bufferConfig.getClass();
        this.bufferConfig = bufferConfig;
    }

    public final void setCmcdProps(@Nullable CMCDProps cMCDProps) {
        this.cmcdProps = cMCDProps;
    }

    public final void setContentStartTime(int i) {
        this.contentStartTime = i;
    }

    public final void setCropEndMs(int i) {
        this.cropEndMs = i;
    }

    public final void setCropStartMs(int i) {
        this.cropStartMs = i;
    }

    public final void setDrmProps(@Nullable DRMProps dRMProps) {
        this.drmProps = dRMProps;
    }

    public final void setExtension(@Nullable String str) {
        this.extension = str;
    }

    public final void setLocalAssetFile(boolean z) {
        this.isLocalAssetFile = z;
    }

    public final void setMetadata(@Nullable Metadata metadata) {
        this.metadata = metadata;
    }

    public final void setMinLoadRetryCount(int i) {
        this.minLoadRetryCount = i;
    }

    public final void setSideLoadedTextTracks(@Nullable SideLoadedTextTrackList sideLoadedTextTrackList) {
        this.sideLoadedTextTracks = sideLoadedTextTrackList;
    }

    public final void setStartPositionMs(int i) {
        this.startPositionMs = i;
    }

    public final void setTextTracksAllowChunklessPreparation(boolean z) {
        this.textTracksAllowChunklessPreparation = z;
    }

    public final void setUri(@Nullable Uri uri) {
        this.uri = uri;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/brentvatne/common/api/Source$Metadata;", "", "<init>", "()V", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "subtitle", "getSubtitle", "setSubtitle", "description", "getDescription", "setDescription", Metadata.PROP_SRC_METADATA_ARTIST, "getArtist", "setArtist", Metadata.PROP_SRC_METADATA_IMAGE_URI, "Landroid/net/Uri;", "getImageUri", "()Landroid/net/Uri;", "setImageUri", "(Landroid/net/Uri;)V", "Companion", "react-native-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Metadata {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final String PROP_SRC_METADATA_ARTIST = "artist";

        @NotNull
        private static final String PROP_SRC_METADATA_DESCRIPTION = "description";

        @NotNull
        private static final String PROP_SRC_METADATA_IMAGE_URI = "imageUri";

        @NotNull
        private static final String PROP_SRC_METADATA_SUBTITLE = "subtitle";

        @NotNull
        private static final String PROP_SRC_METADATA_TITLE = "title";

        @Nullable
        private String artist;

        @Nullable
        private String description;

        @Nullable
        private Uri imageUri;

        @Nullable
        private String subtitle;

        @Nullable
        private String title;

        @JvmStatic
        @Nullable
        public static final Metadata parse(@Nullable ReadableMap readableMap) {
            return INSTANCE.parse(readableMap);
        }

        @Nullable
        public final String getArtist() {
            return this.artist;
        }

        @Nullable
        public final String getDescription() {
            return this.description;
        }

        @Nullable
        public final Uri getImageUri() {
            return this.imageUri;
        }

        @Nullable
        public final String getSubtitle() {
            return this.subtitle;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public final void setArtist(@Nullable String str) {
            this.artist = str;
        }

        public final void setDescription(@Nullable String str) {
            this.description = str;
        }

        public final void setImageUri(@Nullable Uri uri) {
            this.imageUri = uri;
        }

        public final void setSubtitle(@Nullable String str) {
            this.subtitle = str;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/brentvatne/common/api/Source$Metadata$Companion;", "", "<init>", "()V", "PROP_SRC_METADATA_TITLE", "", "PROP_SRC_METADATA_SUBTITLE", "PROP_SRC_METADATA_DESCRIPTION", "PROP_SRC_METADATA_ARTIST", "PROP_SRC_METADATA_IMAGE_URI", "parse", "Lcom/brentvatne/common/api/Source$Metadata;", "src", "Lcom/facebook/react/bridge/ReadableMap;", "react-native-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @Nullable
            public final Metadata parse(@Nullable ReadableMap src) {
                if (src == null) {
                    return null;
                }
                Metadata metadata = new Metadata();
                metadata.setTitle(ReactBridgeUtils.safeGetString(src, "title"));
                metadata.setSubtitle(ReactBridgeUtils.safeGetString(src, "subtitle"));
                metadata.setDescription(ReactBridgeUtils.safeGetString(src, "description"));
                metadata.setArtist(ReactBridgeUtils.safeGetString(src, Metadata.PROP_SRC_METADATA_ARTIST));
                try {
                    metadata.setImageUri(Uri.parse(ReactBridgeUtils.safeGetString(src, Metadata.PROP_SRC_METADATA_IMAGE_URI)));
                    return metadata;
                } catch (Exception unused) {
                    DebugLog.e("Source", "Could not parse imageUri in metadata");
                    return metadata;
                }
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0005H\u0003J\u001a\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/brentvatne/common/api/Source$Companion;", "", "<init>", "()V", Constants.LOG_TAG, "", "PROP_SRC_URI", "PROP_SRC_IS_LOCAL_ASSET_FILE", "PROP_SRC_IS_ASSET", "PROP_SRC_START_POSITION", "PROP_SRC_CROP_START", "PROP_SRC_CROP_END", "PROP_SRC_CONTENT_START_TIME", "PROP_SRC_TYPE", "PROP_SRC_METADATA", "PROP_SRC_HEADERS", "PROP_SRC_DRM", "PROP_SRC_CMCD", "PROP_SRC_ADS", "PROP_SRC_TEXT_TRACKS_ALLOW_CHUNKLESS_PREPARATION", "PROP_SRC_TEXT_TRACKS", "PROP_SRC_MIN_LOAD_RETRY_COUNT", "PROP_SRC_BUFFER_CONFIG", "getUriFromAssetId", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "uriString", "parse", "Lcom/brentvatne/common/api/Source;", "src", "Lcom/facebook/react/bridge/ReadableMap;", "isValidScheme", "", "scheme", "react-native-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @SuppressLint({"DiscouragedApi"})
        private final Uri getUriFromAssetId(Context context, String uriString) {
            Resources resources = context.getResources();
            resources.getClass();
            String packageName = context.getPackageName();
            packageName.getClass();
            int identifier = resources.getIdentifier(uriString, "drawable", packageName);
            if (identifier == 0) {
                identifier = resources.getIdentifier(uriString, "raw", packageName);
            }
            if (identifier > 0) {
                return ErrorUtils$$ExternalSyntheticOutline0.m28m(UriUtil.QUALIFIED_RESOURCE_SCHEME).path(String.valueOf(identifier)).build();
            }
            DebugLog.d("Source", "cannot find identifier");
            return null;
        }

        private final boolean isValidScheme(String scheme) {
            if (scheme == null) {
                return false;
            }
            Locale locale = Locale.getDefault();
            locale.getClass();
            String lowerCase = scheme.toLowerCase(locale);
            lowerCase.getClass();
            return Intrinsics.areEqual(lowerCase, "http") || Intrinsics.areEqual(lowerCase, "https") || Intrinsics.areEqual(lowerCase, "content") || Intrinsics.areEqual(lowerCase, "file") || Intrinsics.areEqual(lowerCase, "rtsp") || Intrinsics.areEqual(lowerCase, UriUtil.LOCAL_ASSET_SCHEME);
        }

        @JvmStatic
        @NotNull
        public final Source parse(@Nullable ReadableMap src, @NotNull Context context) {
            context.getClass();
            Source source = new Source();
            if (src != null) {
                String safeGetString = ReactBridgeUtils.safeGetString(src, "uri", null);
                if (safeGetString != null && !TextUtils.isEmpty(safeGetString)) {
                    Uri parse = Uri.parse(safeGetString);
                    if (parse == null) {
                        DebugLog.d("Source", "Invalid uri:".concat(safeGetString));
                        return source;
                    }
                    if (!isValidScheme(parse.getScheme()) && (parse = getUriFromAssetId(context, safeGetString)) == null) {
                        DebugLog.d("Source", "cannot find identifier");
                        return source;
                    }
                    source.uriString = safeGetString;
                    source.setUri(parse);
                    source.setLocalAssetFile(ReactBridgeUtils.safeGetBool(src, Source.PROP_SRC_IS_LOCAL_ASSET_FILE, false));
                    source.setAsset(ReactBridgeUtils.safeGetBool(src, Source.PROP_SRC_IS_ASSET, false));
                    source.setStartPositionMs(ReactBridgeUtils.safeGetInt(src, Source.PROP_SRC_START_POSITION, -1));
                    source.setCropStartMs(ReactBridgeUtils.safeGetInt(src, Source.PROP_SRC_CROP_START, -1));
                    source.setCropEndMs(ReactBridgeUtils.safeGetInt(src, Source.PROP_SRC_CROP_END, -1));
                    source.setContentStartTime(ReactBridgeUtils.safeGetInt(src, Source.PROP_SRC_CONTENT_START_TIME, -1));
                    source.setExtension(ReactBridgeUtils.safeGetString(src, "type", null));
                    source.setDrmProps(DRMProps.INSTANCE.parse(ReactBridgeUtils.safeGetMap(src, Source.PROP_SRC_DRM)));
                    source.setCmcdProps(CMCDProps.INSTANCE.parse(ReactBridgeUtils.safeGetMap(src, Source.PROP_SRC_CMCD)));
                    source.setTextTracksAllowChunklessPreparation(ReactBridgeUtils.safeGetBool(src, Source.PROP_SRC_TEXT_TRACKS_ALLOW_CHUNKLESS_PREPARATION, true));
                    source.setSideLoadedTextTracks(SideLoadedTextTrackList.INSTANCE.parse(ReactBridgeUtils.safeGetArray(src, Source.PROP_SRC_TEXT_TRACKS)));
                    source.setMinLoadRetryCount(ReactBridgeUtils.safeGetInt(src, Source.PROP_SRC_MIN_LOAD_RETRY_COUNT, 3));
                    source.setBufferConfig(BufferConfig.INSTANCE.parse(ReactBridgeUtils.safeGetMap(src, Source.PROP_SRC_BUFFER_CONFIG)));
                    ReadableArray safeGetArray = ReactBridgeUtils.safeGetArray(src, Source.PROP_SRC_HEADERS);
                    if (safeGetArray != null && safeGetArray.size() > 0) {
                        int size = safeGetArray.size();
                        for (int i = 0; i < size; i++) {
                            ReadableMap map = safeGetArray.getMap(i);
                            String string = map != null ? map.getString("key") : null;
                            String string2 = map != null ? map.getString("value") : null;
                            if (string != null && string2 != null) {
                                source.getHeaders().put(string, string2);
                            }
                        }
                    }
                    source.setMetadata(Metadata.INSTANCE.parse(ReactBridgeUtils.safeGetMap(src, "metadata")));
                    return source;
                }
                DebugLog.d("Source", "isEmpty uri:" + safeGetString);
            }
            return source;
        }

        private Companion() {
        }
    }
}
