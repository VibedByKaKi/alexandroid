package com.amazon.alexa.accessory.frames.media.models.progressiveLoad;

import android.net.Uri;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.voice.nowplaying.bridge.VoiceBridgePayloadUtil;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b:\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 L2\u00020\u0001:\u0002KLB\u0081\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014BY\b\u0017\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0015J\b\u00107\u001a\u00020\fH\u0007J\b\u00108\u001a\u00020\fH\u0007J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0006HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\fHÆ\u0003J\t\u0010@\u001a\u00020\u000eHÆ\u0003J\t\u0010A\u001a\u00020\fHÆ\u0003J\t\u0010B\u001a\u00020\fHÆ\u0003J\t\u0010C\u001a\u00020\fHÆ\u0003J\t\u0010D\u001a\u00020\fHÆ\u0003J\u0083\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\fHÆ\u0001J\u0013\u0010F\u001a\u00020\f2\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010H\u001a\u00020IHÖ\u0001J\t\u0010J\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0017\"\u0004\b'\u0010\u0019R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010(\"\u0004\b)\u0010*R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u0010\u000f\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010(\"\u0004\b0\u0010*R\u001e\u0010\u0010\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010(\"\u0004\b2\u0010*R\u001e\u0010\u0011\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010(\"\u0004\b4\u0010*R\u001e\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010(\"\u0004\b6\u0010*¨\u0006M"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/models/progressiveLoad/GalleryItem;", "", "parentMediaId", "", "accessoryId", "state", "Lcom/amazon/alexa/accessory/frames/media/models/progressiveLoad/MediaState;", "thumbnailUri", "Landroid/net/Uri;", "createdAt", "mediaType", "isAutoCapture", "", "durationInSeconds", "", "roundTopLeft", "roundTopRight", "roundBottomLeft", "roundBottomRight", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/accessory/frames/media/models/progressiveLoad/MediaState;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ZJZZZZ)V", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ZJ)V", "getParentMediaId", "()Ljava/lang/String;", "setParentMediaId", "(Ljava/lang/String;)V", "getAccessoryId", "setAccessoryId", "getState", "()Lcom/amazon/alexa/accessory/frames/media/models/progressiveLoad/MediaState;", "setState", "(Lcom/amazon/alexa/accessory/frames/media/models/progressiveLoad/MediaState;)V", "getThumbnailUri", "()Landroid/net/Uri;", "setThumbnailUri", "(Landroid/net/Uri;)V", "getCreatedAt", "setCreatedAt", "getMediaType", "setMediaType", "()Z", "setAutoCapture", "(Z)V", "getDurationInSeconds", "()J", "setDurationInSeconds", "(J)V", "getRoundTopLeft", "setRoundTopLeft", "getRoundTopRight", "setRoundTopRight", "getRoundBottomLeft", "setRoundBottomLeft", "getRoundBottomRight", "setRoundBottomRight", "isPhoto", "isVideo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Builder", "Companion", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class GalleryItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String IMAGE_MIME_TYPE_PREFIX = "image/";

    @NotNull
    private static final String VIDEO_MIME_TYPE_PREFIX = "video/";

    @JsonProperty("accessoryId")
    @NotNull
    private String accessoryId;

    @JsonProperty("createdAt")
    @NotNull
    private String createdAt;

    @JsonProperty("durationInSeconds")
    private long durationInSeconds;

    @JsonProperty("isAutoCaptured")
    private boolean isAutoCapture;

    @JsonProperty("mediaType")
    @NotNull
    private String mediaType;

    @JsonProperty(VoiceBridgePayloadUtil.PayloadKey.PLAYER_INFO_ID)
    @NotNull
    private String parentMediaId;

    @JsonIgnore
    private boolean roundBottomLeft;

    @JsonIgnore
    private boolean roundBottomRight;

    @JsonIgnore
    private boolean roundTopLeft;

    @JsonIgnore
    private boolean roundTopRight;

    @JsonIgnore
    @NotNull
    private MediaState state;

    @JsonProperty("contentUri")
    @JsonDeserialize(using = UriDeserializer.class)
    @Nullable
    private Uri thumbnailUri;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0005J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/models/progressiveLoad/GalleryItem$Builder;", "", "<init>", "()V", "parentMediaId", "", "accessoryId", "state", "Lcom/amazon/alexa/accessory/frames/media/models/progressiveLoad/MediaState;", "thumbnailUri", "Landroid/net/Uri;", "createdAt", "mediaType", "isAutoCapture", "", "durationInSeconds", "", "value", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/accessory/frames/media/models/progressiveLoad/GalleryItem;", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nGalleryItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryItem.kt\ncom/amazon/alexa/accessory/frames/media/models/progressiveLoad/GalleryItem$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
    public static final class Builder {
        private long durationInSeconds;
        private boolean isAutoCapture;

        @Nullable
        private Uri thumbnailUri;

        @NotNull
        private String parentMediaId = "";

        @NotNull
        private String accessoryId = "";

        @NotNull
        private MediaState state = MediaState.SKELETON;

        @NotNull
        private String createdAt = "";

        @NotNull
        private String mediaType = "";

        @NotNull
        public final Builder accessoryId(@NotNull String value) {
            value.getClass();
            this.accessoryId = value;
            return this;
        }

        @NotNull
        public final GalleryItem build() {
            return new GalleryItem(this.parentMediaId, this.accessoryId, this.state, this.thumbnailUri, this.createdAt, this.mediaType, this.isAutoCapture, this.durationInSeconds, false, false, false, false, 3840, null);
        }

        @NotNull
        public final Builder createdAt(@Nullable String value) {
            if (value == null) {
                value = "";
            }
            this.createdAt = value;
            return this;
        }

        @NotNull
        public final Builder durationInSeconds(long value) {
            this.durationInSeconds = value;
            return this;
        }

        @NotNull
        public final Builder isAutoCapture(boolean value) {
            this.isAutoCapture = value;
            return this;
        }

        @NotNull
        public final Builder mediaType(@NotNull String value) {
            value.getClass();
            this.mediaType = value;
            return this;
        }

        @NotNull
        public final Builder parentMediaId(@NotNull String value) {
            value.getClass();
            this.parentMediaId = value;
            return this;
        }

        @NotNull
        public final Builder state(@NotNull MediaState value) {
            value.getClass();
            this.state = value;
            return this;
        }

        @NotNull
        public final Builder thumbnailUri(@Nullable Uri value) {
            this.thumbnailUri = value;
            return this;
        }
    }

    public /* synthetic */ GalleryItem(String str, String str2, MediaState mediaState, Uri uri, String str3, String str4, boolean z, long j, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? MediaState.SKELETON : mediaState, (i & 8) != 0 ? null : uri, (i & 16) != 0 ? "" : str3, (i & 32) == 0 ? str4 : "", (i & 64) != 0 ? false : z, (i & 128) != 0 ? 0L : j, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? false : z3, (i & 1024) != 0 ? false : z4, (i & 2048) != 0 ? false : z5);
    }

    @JvmStatic
    @NotNull
    public static final Builder builder() {
        return INSTANCE.builder();
    }

    public static /* synthetic */ GalleryItem copy$default(GalleryItem galleryItem, String str, String str2, MediaState mediaState, Uri uri, String str3, String str4, boolean z, long j, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = galleryItem.parentMediaId;
        }
        return galleryItem.copy(str, (i & 2) != 0 ? galleryItem.accessoryId : str2, (i & 4) != 0 ? galleryItem.state : mediaState, (i & 8) != 0 ? galleryItem.thumbnailUri : uri, (i & 16) != 0 ? galleryItem.createdAt : str3, (i & 32) != 0 ? galleryItem.mediaType : str4, (i & 64) != 0 ? galleryItem.isAutoCapture : z, (i & 128) != 0 ? galleryItem.durationInSeconds : j, (i & 256) != 0 ? galleryItem.roundTopLeft : z2, (i & 512) != 0 ? galleryItem.roundTopRight : z3, (i & 1024) != 0 ? galleryItem.roundBottomLeft : z4, (i & 2048) != 0 ? galleryItem.roundBottomRight : z5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getParentMediaId() {
        return this.parentMediaId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getRoundTopRight() {
        return this.roundTopRight;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getRoundBottomLeft() {
        return this.roundBottomLeft;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getRoundBottomRight() {
        return this.roundBottomRight;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAccessoryId() {
        return this.accessoryId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final MediaState getState() {
        return this.state;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Uri getThumbnailUri() {
        return this.thumbnailUri;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getMediaType() {
        return this.mediaType;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsAutoCapture() {
        return this.isAutoCapture;
    }

    /* renamed from: component8, reason: from getter */
    public final long getDurationInSeconds() {
        return this.durationInSeconds;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getRoundTopLeft() {
        return this.roundTopLeft;
    }

    @NotNull
    public final GalleryItem copy(@NotNull String parentMediaId, @NotNull String accessoryId, @NotNull MediaState state, @Nullable Uri thumbnailUri, @NotNull String createdAt, @NotNull String mediaType, boolean isAutoCapture, long durationInSeconds, boolean roundTopLeft, boolean roundTopRight, boolean roundBottomLeft, boolean roundBottomRight) {
        parentMediaId.getClass();
        accessoryId.getClass();
        state.getClass();
        createdAt.getClass();
        mediaType.getClass();
        return new GalleryItem(parentMediaId, accessoryId, state, thumbnailUri, createdAt, mediaType, isAutoCapture, durationInSeconds, roundTopLeft, roundTopRight, roundBottomLeft, roundBottomRight);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GalleryItem)) {
            return false;
        }
        GalleryItem galleryItem = (GalleryItem) other;
        return Intrinsics.areEqual(this.parentMediaId, galleryItem.parentMediaId) && Intrinsics.areEqual(this.accessoryId, galleryItem.accessoryId) && this.state == galleryItem.state && Intrinsics.areEqual(this.thumbnailUri, galleryItem.thumbnailUri) && Intrinsics.areEqual(this.createdAt, galleryItem.createdAt) && Intrinsics.areEqual(this.mediaType, galleryItem.mediaType) && this.isAutoCapture == galleryItem.isAutoCapture && this.durationInSeconds == galleryItem.durationInSeconds && this.roundTopLeft == galleryItem.roundTopLeft && this.roundTopRight == galleryItem.roundTopRight && this.roundBottomLeft == galleryItem.roundBottomLeft && this.roundBottomRight == galleryItem.roundBottomRight;
    }

    @NotNull
    public final String getAccessoryId() {
        return this.accessoryId;
    }

    @NotNull
    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final long getDurationInSeconds() {
        return this.durationInSeconds;
    }

    @NotNull
    public final String getMediaType() {
        return this.mediaType;
    }

    @NotNull
    public final String getParentMediaId() {
        return this.parentMediaId;
    }

    public final boolean getRoundBottomLeft() {
        return this.roundBottomLeft;
    }

    public final boolean getRoundBottomRight() {
        return this.roundBottomRight;
    }

    public final boolean getRoundTopLeft() {
        return this.roundTopLeft;
    }

    public final boolean getRoundTopRight() {
        return this.roundTopRight;
    }

    @NotNull
    public final MediaState getState() {
        return this.state;
    }

    @Nullable
    public final Uri getThumbnailUri() {
        return this.thumbnailUri;
    }

    public int hashCode() {
        int hashCode = (this.state.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(this.parentMediaId.hashCode() * 31, 31, this.accessoryId)) * 31;
        Uri uri = this.thumbnailUri;
        return Boolean.hashCode(this.roundBottomRight) + DoubleList$$ExternalSyntheticOutline0.m(this.roundBottomLeft, DoubleList$$ExternalSyntheticOutline0.m(this.roundTopRight, DoubleList$$ExternalSyntheticOutline0.m(this.roundTopLeft, BitVector$$ExternalSyntheticOutline0.m(this.durationInSeconds, DoubleList$$ExternalSyntheticOutline0.m(this.isAutoCapture, ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m((hashCode + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.createdAt), 31, this.mediaType), 31), 31), 31), 31), 31);
    }

    public final boolean isAutoCapture() {
        return this.isAutoCapture;
    }

    @JsonIgnore
    public final boolean isPhoto() {
        boolean startsWith$default;
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(this.mediaType, IMAGE_MIME_TYPE_PREFIX, false, 2, null);
        return startsWith$default;
    }

    @JsonIgnore
    public final boolean isVideo() {
        boolean startsWith$default;
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(this.mediaType, "video/", false, 2, null);
        return startsWith$default;
    }

    public final void setAccessoryId(@NotNull String str) {
        str.getClass();
        this.accessoryId = str;
    }

    public final void setAutoCapture(boolean z) {
        this.isAutoCapture = z;
    }

    public final void setCreatedAt(@NotNull String str) {
        str.getClass();
        this.createdAt = str;
    }

    public final void setDurationInSeconds(long j) {
        this.durationInSeconds = j;
    }

    public final void setMediaType(@NotNull String str) {
        str.getClass();
        this.mediaType = str;
    }

    public final void setParentMediaId(@NotNull String str) {
        str.getClass();
        this.parentMediaId = str;
    }

    public final void setRoundBottomLeft(boolean z) {
        this.roundBottomLeft = z;
    }

    public final void setRoundBottomRight(boolean z) {
        this.roundBottomRight = z;
    }

    public final void setRoundTopLeft(boolean z) {
        this.roundTopLeft = z;
    }

    public final void setRoundTopRight(boolean z) {
        this.roundTopRight = z;
    }

    public final void setState(@NotNull MediaState mediaState) {
        mediaState.getClass();
        this.state = mediaState;
    }

    public final void setThumbnailUri(@Nullable Uri uri) {
        this.thumbnailUri = uri;
    }

    @NotNull
    public String toString() {
        String str = this.parentMediaId;
        String str2 = this.accessoryId;
        MediaState mediaState = this.state;
        Uri uri = this.thumbnailUri;
        String str3 = this.createdAt;
        String str4 = this.mediaType;
        boolean z = this.isAutoCapture;
        long j = this.durationInSeconds;
        boolean z2 = this.roundTopLeft;
        boolean z3 = this.roundTopRight;
        boolean z4 = this.roundBottomLeft;
        boolean z5 = this.roundBottomRight;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("GalleryItem(parentMediaId=", str, ", accessoryId=", str2, ", state=");
        m.append(mediaState);
        m.append(", thumbnailUri=");
        m.append(uri);
        m.append(", createdAt=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str3, ", mediaType=", str4, ", isAutoCapture=");
        m.append(z);
        m.append(", durationInSeconds=");
        m.append(j);
        m.append(", roundTopLeft=");
        m.append(z2);
        m.append(", roundTopRight=");
        m.append(z3);
        m.append(", roundBottomLeft=");
        m.append(z4);
        m.append(", roundBottomRight=");
        m.append(z5);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/models/progressiveLoad/GalleryItem$Companion;", "", "<init>", "()V", "IMAGE_MIME_TYPE_PREFIX", "", "VIDEO_MIME_TYPE_PREFIX", "builder", "Lcom/amazon/alexa/accessory/frames/media/models/progressiveLoad/GalleryItem$Builder;", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Builder builder() {
            return new Builder();
        }

        private Companion() {
        }
    }

    public GalleryItem(@NotNull String str, @NotNull String str2, @NotNull MediaState mediaState, @Nullable Uri uri, @NotNull String str3, @NotNull String str4, boolean z, long j, boolean z2, boolean z3, boolean z4, boolean z5) {
        str.getClass();
        str2.getClass();
        mediaState.getClass();
        str3.getClass();
        str4.getClass();
        this.parentMediaId = str;
        this.accessoryId = str2;
        this.state = mediaState;
        this.thumbnailUri = uri;
        this.createdAt = str3;
        this.mediaType = str4;
        this.isAutoCapture = z;
        this.durationInSeconds = j;
        this.roundTopLeft = z2;
        this.roundTopRight = z3;
        this.roundBottomLeft = z4;
        this.roundBottomRight = z5;
    }

    public GalleryItem() {
        this(null, null, null, null, null, null, false, 0L, false, false, false, false, 4095, null);
    }

    @JsonCreator
    public GalleryItem(@JsonProperty("mediaId") @Nullable String str, @JsonProperty("accessoryId") @Nullable String str2, @JsonProperty("contentUri") @JsonDeserialize(using = UriDeserializer.class) @Nullable Uri uri, @JsonProperty("createdAt") @Nullable String str3, @JsonProperty("mediaType") @Nullable String str4, @JsonProperty("isAutoCaptured") boolean z, @JsonProperty("durationInSeconds") long j) {
        this(str == null ? "" : str, str2 == null ? "" : str2, MediaState.TRUE_MEDIA, uri, str3 == null ? "" : str3, str4 == null ? "" : str4, z, j, false, false, false, false, 3840, null);
    }
}
