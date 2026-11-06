package com.amazon.alexa.accessory.frames.media.dto;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.smarthomecameras.routing.CamerasRouteParameter;
import com.amazon.alexa.voice.nowplaying.bridge.VoiceBridgePayloadUtil;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 02\u00020\u0001:\u0002/0BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u001f\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010!\u001a\u00020\"H\u0016J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u000eHÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003Jm\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0005HÆ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015¨\u00061"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/dto/MediaObject;", "", VoiceBridgePayloadUtil.PayloadKey.PLAYER_INFO_ID, "", "accessoryId", "", CamerasRouteParameter.DISPLAY_NAME, "createdAt", "size", "media", "", "md5Hash", "mediaType", "isAutoCapture", "", "importType", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;J[BLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getMediaId", "()J", "getAccessoryId", "()Ljava/lang/String;", "getDisplayName", "getCreatedAt", "getSize", "getMedia", "()[B", "getMd5Hash", "getMediaType", "()Z", "getImportType", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "toString", "Builder", "Companion", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MediaObject {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String accessoryId;

    @NotNull
    private final String createdAt;

    @NotNull
    private final String displayName;

    @NotNull
    private final String importType;
    private final boolean isAutoCapture;

    @NotNull
    private final String md5Hash;

    @NotNull
    private final byte[] media;
    private final long mediaId;

    @NotNull
    private final String mediaType;
    private final long size;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0007J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0007J\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/dto/MediaObject$Builder;", "", "<init>", "()V", VoiceBridgePayloadUtil.PayloadKey.PLAYER_INFO_ID, "", "accessoryId", "", CamerasRouteParameter.DISPLAY_NAME, "createdAt", "size", "media", "", "md5Hash", "mediaType", "isAutoCapture", "", "importType", "value", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/accessory/frames/media/dto/MediaObject;", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nMediaObject.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaObject.kt\ncom/amazon/alexa/accessory/frames/media/dto/MediaObject$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
    public static final class Builder {
        private boolean isAutoCapture;
        private long mediaId;
        private long size;

        @NotNull
        private String accessoryId = "";

        @NotNull
        private String displayName = "";

        @NotNull
        private String createdAt = "";

        @NotNull
        private byte[] media = new byte[0];

        @NotNull
        private String md5Hash = "";

        @NotNull
        private String mediaType = "";

        @NotNull
        private String importType = "UNKNOWN";

        @NotNull
        public final Builder accessoryId(@NotNull String value) {
            value.getClass();
            this.accessoryId = value;
            return this;
        }

        @NotNull
        public final MediaObject build() {
            return new MediaObject(this.mediaId, this.accessoryId, this.displayName, this.createdAt, this.size, this.media, this.md5Hash, this.mediaType, this.isAutoCapture, this.importType);
        }

        @NotNull
        public final Builder createdAt(@NotNull String value) {
            value.getClass();
            this.createdAt = value;
            return this;
        }

        @NotNull
        public final Builder displayName(@NotNull String value) {
            value.getClass();
            this.displayName = value;
            return this;
        }

        @NotNull
        public final Builder importType(@NotNull String value) {
            value.getClass();
            this.importType = value;
            return this;
        }

        @NotNull
        public final Builder isAutoCapture(boolean value) {
            this.isAutoCapture = value;
            return this;
        }

        @NotNull
        public final Builder md5Hash(@NotNull String value) {
            value.getClass();
            this.md5Hash = value;
            return this;
        }

        @NotNull
        public final Builder media(@NotNull byte[] value) {
            value.getClass();
            this.media = value;
            return this;
        }

        @NotNull
        public final Builder mediaId(long value) {
            this.mediaId = value;
            return this;
        }

        @NotNull
        public final Builder mediaType(@NotNull String value) {
            value.getClass();
            this.mediaType = value;
            return this;
        }

        @NotNull
        public final Builder size(long value) {
            this.size = value;
            return this;
        }
    }

    public MediaObject(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, long j2, @NotNull byte[] bArr, @NotNull String str4, @NotNull String str5, boolean z, @NotNull String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        bArr.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        this.mediaId = j;
        this.accessoryId = str;
        this.displayName = str2;
        this.createdAt = str3;
        this.size = j2;
        this.media = bArr;
        this.md5Hash = str4;
        this.mediaType = str5;
        this.isAutoCapture = z;
        this.importType = str6;
    }

    @JvmStatic
    @NotNull
    public static final Builder builder() {
        return INSTANCE.builder();
    }

    public static /* synthetic */ MediaObject copy$default(MediaObject mediaObject, long j, String str, String str2, String str3, long j2, byte[] bArr, String str4, String str5, boolean z, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            j = mediaObject.mediaId;
        }
        return mediaObject.copy(j, (i & 2) != 0 ? mediaObject.accessoryId : str, (i & 4) != 0 ? mediaObject.displayName : str2, (i & 8) != 0 ? mediaObject.createdAt : str3, (i & 16) != 0 ? mediaObject.size : j2, (i & 32) != 0 ? mediaObject.media : bArr, (i & 64) != 0 ? mediaObject.md5Hash : str4, (i & 128) != 0 ? mediaObject.mediaType : str5, (i & 256) != 0 ? mediaObject.isAutoCapture : z, (i & 512) != 0 ? mediaObject.importType : str6);
    }

    /* renamed from: component1, reason: from getter */
    public final long getMediaId() {
        return this.mediaId;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getImportType() {
        return this.importType;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAccessoryId() {
        return this.accessoryId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component5, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final byte[] getMedia() {
        return this.media;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getMd5Hash() {
        return this.md5Hash;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getMediaType() {
        return this.mediaType;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsAutoCapture() {
        return this.isAutoCapture;
    }

    @NotNull
    public final MediaObject copy(long mediaId, @NotNull String accessoryId, @NotNull String displayName, @NotNull String createdAt, long size, @NotNull byte[] media, @NotNull String md5Hash, @NotNull String mediaType, boolean isAutoCapture, @NotNull String importType) {
        accessoryId.getClass();
        displayName.getClass();
        createdAt.getClass();
        media.getClass();
        md5Hash.getClass();
        mediaType.getClass();
        importType.getClass();
        return new MediaObject(mediaId, accessoryId, displayName, createdAt, size, media, md5Hash, mediaType, isAutoCapture, importType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(MediaObject.class, other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        MediaObject mediaObject = (MediaObject) other;
        return this.mediaId == mediaObject.mediaId && Intrinsics.areEqual(this.accessoryId, mediaObject.accessoryId) && Intrinsics.areEqual(this.displayName, mediaObject.displayName) && Intrinsics.areEqual(this.createdAt, mediaObject.createdAt) && this.size == mediaObject.size && Arrays.equals(this.media, mediaObject.media) && Intrinsics.areEqual(this.md5Hash, mediaObject.md5Hash) && Intrinsics.areEqual(this.mediaType, mediaObject.mediaType) && this.isAutoCapture == mediaObject.isAutoCapture && Intrinsics.areEqual(this.importType, mediaObject.importType);
    }

    @NotNull
    public final String getAccessoryId() {
        return this.accessoryId;
    }

    @NotNull
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final String getImportType() {
        return this.importType;
    }

    @NotNull
    public final String getMd5Hash() {
        return this.md5Hash;
    }

    @NotNull
    public final byte[] getMedia() {
        return this.media;
    }

    public final long getMediaId() {
        return this.mediaId;
    }

    @NotNull
    public final String getMediaType() {
        return this.mediaType;
    }

    public final long getSize() {
        return this.size;
    }

    public int hashCode() {
        return this.importType.hashCode() + DoubleList$$ExternalSyntheticOutline0.m(this.isAutoCapture, ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(ParcelCompat$$ExternalSyntheticOutline0.m(this.media, BitVector$$ExternalSyntheticOutline0.m(this.size, ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(Long.hashCode(this.mediaId) * 31, 31, this.accessoryId), 31, this.displayName), 31, this.createdAt), 31), 31), 31, this.md5Hash), 31, this.mediaType), 31);
    }

    public final boolean isAutoCapture() {
        return this.isAutoCapture;
    }

    @NotNull
    public String toString() {
        long j = this.mediaId;
        String str = this.accessoryId;
        String str2 = this.displayName;
        String str3 = this.createdAt;
        long j2 = this.size;
        String arrays = Arrays.toString(this.media);
        String str4 = this.md5Hash;
        String str5 = this.mediaType;
        boolean z = this.isAutoCapture;
        String str6 = this.importType;
        StringBuilder m = Automotive$$ExternalSyntheticOutline0.m("MediaObject(mediaId=", j, ", accessoryId=", str);
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, ", displayName=", str2, ", createdAt=", str3);
        ArcMode$$ExternalSyntheticOutline0.m(j2, ", size=", ", media=", m);
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, arrays, ", md5Hash=", str4, ", mediaType=");
        Automotive$$ExternalSyntheticOutline0.m(m, str5, ", isAutoCapture=", z, ", importType=");
        return a$$ExternalSyntheticOutline0.m(m, str6, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/dto/MediaObject$Companion;", "", "<init>", "()V", "builder", "Lcom/amazon/alexa/accessory/frames/media/dto/MediaObject$Builder;", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public /* synthetic */ MediaObject(long j, String str, String str2, String str3, long j2, byte[] bArr, String str4, String str5, boolean z, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, str3, j2, bArr, str4, str5, z, (i & 512) != 0 ? "UNKNOWN" : str6);
    }
}
