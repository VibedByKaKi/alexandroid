package com.amazon.alexa.accessory.frames.media.dto;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.protocol.Assettransfer;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.smarthomecameras.routing.CamerasRouteParameter;
import com.amazon.alexa.voice.nowplaying.bridge.VoiceBridgePayloadUtil;
import com.facebook.common.util.UriUtil;
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
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b+\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 92\u00020\u0001:\u000289Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010'\u001a\u00020\nJ\u0006\u0010(\u001a\u00020\nJ\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003Jc\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u00103\u001a\u00020\n2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010\u0013R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0011\"\u0004\b&\u0010\u0013¨\u0006:"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/dto/AssetInfo;", "", "assetId", "", "creationTimestamp", "md5Hash", "size", "", VoiceBridgePayloadUtil.PayloadKey.PLAYER_INFO_ID, "isAutoCapture", "", "mimeType", "transformedMimeType", CamerasRouteParameter.DISPLAY_NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAssetId", "()Ljava/lang/String;", "setAssetId", "(Ljava/lang/String;)V", "getCreationTimestamp", "setCreationTimestamp", "getMd5Hash", "setMd5Hash", "getSize", "()J", "setSize", "(J)V", "getMediaId", "setMediaId", "()Z", "setAutoCapture", "(Z)V", "getMimeType", "setMimeType", "getTransformedMimeType", "setTransformedMimeType", "getDisplayName", "setDisplayName", "isImage", "isVideo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Builder", "Companion", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AssetInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private String assetId;

    @NotNull
    private String creationTimestamp;

    @NotNull
    private String displayName;
    private boolean isAutoCapture;

    @NotNull
    private String md5Hash;
    private long mediaId;

    @NotNull
    private String mimeType;
    private long size;

    @NotNull
    private String transformedMimeType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0005J\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/dto/AssetInfo$Builder;", "", "<init>", "()V", "assetId", "", "creationTimestamp", "md5Hash", "size", "", VoiceBridgePayloadUtil.PayloadKey.PLAYER_INFO_ID, "isAutoCapture", "", "mimeType", "transformedMimeType", CamerasRouteParameter.DISPLAY_NAME, "value", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/accessory/frames/media/dto/AssetInfo;", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAssetInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetInfo.kt\ncom/amazon/alexa/accessory/frames/media/dto/AssetInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,132:1\n1#2:133\n*E\n"})
    public static final class Builder {
        private boolean isAutoCapture;
        private long mediaId;
        private long size;

        @NotNull
        private String assetId = "";

        @NotNull
        private String creationTimestamp = "";

        @NotNull
        private String md5Hash = "";

        @NotNull
        private String mimeType = "";

        @NotNull
        private String transformedMimeType = "";

        @NotNull
        private String displayName = "";

        @NotNull
        public final Builder assetId(@NotNull String value) {
            value.getClass();
            this.assetId = value;
            return this;
        }

        @NotNull
        public final AssetInfo build() {
            return new AssetInfo(this.assetId, this.creationTimestamp, this.md5Hash, this.size, this.mediaId, this.isAutoCapture, this.mimeType, this.transformedMimeType, this.displayName);
        }

        @NotNull
        public final Builder creationTimestamp(@NotNull String value) {
            value.getClass();
            this.creationTimestamp = value;
            return this;
        }

        @NotNull
        public final Builder displayName(@NotNull String value) {
            value.getClass();
            this.displayName = value;
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
        public final Builder mediaId(long value) {
            this.mediaId = value;
            return this;
        }

        @NotNull
        public final Builder mimeType(@NotNull String value) {
            value.getClass();
            this.mimeType = value;
            return this;
        }

        @NotNull
        public final Builder size(long value) {
            this.size = value;
            return this;
        }

        @NotNull
        public final Builder transformedMimeType(@NotNull String value) {
            value.getClass();
            this.transformedMimeType = value;
            return this;
        }
    }

    public /* synthetic */ AssetInfo(String str, String str2, String str3, long j, long j2, boolean z, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? 0L : j, (i & 16) == 0 ? j2 : 0L, (i & 32) != 0 ? false : z, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? "" : str6);
    }

    @JvmStatic
    @NotNull
    public static final Builder builder() {
        return INSTANCE.builder();
    }

    public static /* synthetic */ AssetInfo copy$default(AssetInfo assetInfo, String str, String str2, String str3, long j, long j2, boolean z, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = assetInfo.assetId;
        }
        if ((i & 2) != 0) {
            str2 = assetInfo.creationTimestamp;
        }
        if ((i & 4) != 0) {
            str3 = assetInfo.md5Hash;
        }
        if ((i & 8) != 0) {
            j = assetInfo.size;
        }
        if ((i & 16) != 0) {
            j2 = assetInfo.mediaId;
        }
        if ((i & 32) != 0) {
            z = assetInfo.isAutoCapture;
        }
        if ((i & 64) != 0) {
            str4 = assetInfo.mimeType;
        }
        if ((i & 128) != 0) {
            str5 = assetInfo.transformedMimeType;
        }
        if ((i & 256) != 0) {
            str6 = assetInfo.displayName;
        }
        long j3 = j2;
        long j4 = j;
        String str7 = str3;
        return assetInfo.copy(str, str2, str7, j4, j3, z, str4, str5, str6);
    }

    @JvmStatic
    @NotNull
    public static final AssetInfo fromAsset(@NotNull Assettransfer.Asset asset) {
        return INSTANCE.fromAsset(asset);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAssetId() {
        return this.assetId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCreationTimestamp() {
        return this.creationTimestamp;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getMd5Hash() {
        return this.md5Hash;
    }

    /* renamed from: component4, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    /* renamed from: component5, reason: from getter */
    public final long getMediaId() {
        return this.mediaId;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsAutoCapture() {
        return this.isAutoCapture;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getTransformedMimeType() {
        return this.transformedMimeType;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final AssetInfo copy(@NotNull String assetId, @NotNull String creationTimestamp, @NotNull String md5Hash, long size, long mediaId, boolean isAutoCapture, @NotNull String mimeType, @NotNull String transformedMimeType, @NotNull String displayName) {
        Automotive$$ExternalSyntheticOutline0.m(assetId, creationTimestamp, md5Hash, mimeType, transformedMimeType);
        displayName.getClass();
        return new AssetInfo(assetId, creationTimestamp, md5Hash, size, mediaId, isAutoCapture, mimeType, transformedMimeType, displayName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetInfo)) {
            return false;
        }
        AssetInfo assetInfo = (AssetInfo) other;
        return Intrinsics.areEqual(this.assetId, assetInfo.assetId) && Intrinsics.areEqual(this.creationTimestamp, assetInfo.creationTimestamp) && Intrinsics.areEqual(this.md5Hash, assetInfo.md5Hash) && this.size == assetInfo.size && this.mediaId == assetInfo.mediaId && this.isAutoCapture == assetInfo.isAutoCapture && Intrinsics.areEqual(this.mimeType, assetInfo.mimeType) && Intrinsics.areEqual(this.transformedMimeType, assetInfo.transformedMimeType) && Intrinsics.areEqual(this.displayName, assetInfo.displayName);
    }

    @NotNull
    public final String getAssetId() {
        return this.assetId;
    }

    @NotNull
    public final String getCreationTimestamp() {
        return this.creationTimestamp;
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final String getMd5Hash() {
        return this.md5Hash;
    }

    public final long getMediaId() {
        return this.mediaId;
    }

    @NotNull
    public final String getMimeType() {
        return this.mimeType;
    }

    public final long getSize() {
        return this.size;
    }

    @NotNull
    public final String getTransformedMimeType() {
        return this.transformedMimeType;
    }

    public int hashCode() {
        return this.displayName.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(DoubleList$$ExternalSyntheticOutline0.m(this.isAutoCapture, BitVector$$ExternalSyntheticOutline0.m(this.mediaId, BitVector$$ExternalSyntheticOutline0.m(this.size, ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(this.assetId.hashCode() * 31, 31, this.creationTimestamp), 31, this.md5Hash), 31), 31), 31), 31, this.mimeType), 31, this.transformedMimeType);
    }

    public final boolean isAutoCapture() {
        return this.isAutoCapture;
    }

    public final boolean isImage() {
        boolean startsWith;
        startsWith = StringsKt__StringsJVMKt.startsWith(this.mimeType, "image/", true);
        return startsWith;
    }

    public final boolean isVideo() {
        boolean startsWith;
        startsWith = StringsKt__StringsJVMKt.startsWith(this.mimeType, "video/", true);
        return startsWith;
    }

    public final void setAssetId(@NotNull String str) {
        str.getClass();
        this.assetId = str;
    }

    public final void setAutoCapture(boolean z) {
        this.isAutoCapture = z;
    }

    public final void setCreationTimestamp(@NotNull String str) {
        str.getClass();
        this.creationTimestamp = str;
    }

    public final void setDisplayName(@NotNull String str) {
        str.getClass();
        this.displayName = str;
    }

    public final void setMd5Hash(@NotNull String str) {
        str.getClass();
        this.md5Hash = str;
    }

    public final void setMediaId(long j) {
        this.mediaId = j;
    }

    public final void setMimeType(@NotNull String str) {
        str.getClass();
        this.mimeType = str;
    }

    public final void setSize(long j) {
        this.size = j;
    }

    public final void setTransformedMimeType(@NotNull String str) {
        str.getClass();
        this.transformedMimeType = str;
    }

    @NotNull
    public String toString() {
        String str = this.assetId;
        String str2 = this.creationTimestamp;
        String str3 = this.md5Hash;
        long j = this.size;
        long j2 = this.mediaId;
        boolean z = this.isAutoCapture;
        String str4 = this.mimeType;
        String str5 = this.transformedMimeType;
        String str6 = this.displayName;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("AssetInfo(assetId=", str, ", creationTimestamp=", str2, ", md5Hash=");
        m.append(str3);
        m.append(", size=");
        m.append(j);
        ArcMode$$ExternalSyntheticOutline0.m(j2, ", mediaId=", ", isAutoCapture=", m);
        m.append(z);
        m.append(", mimeType=");
        m.append(str4);
        m.append(", transformedMimeType=");
        return DoubleList$$ExternalSyntheticOutline0.m(m, str5, ", displayName=", str6, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/dto/AssetInfo$Companion;", "", "<init>", "()V", "builder", "Lcom/amazon/alexa/accessory/frames/media/dto/AssetInfo$Builder;", "fromAsset", "Lcom/amazon/alexa/accessory/frames/media/dto/AssetInfo;", UriUtil.LOCAL_ASSET_SCHEME, "Lcom/amazon/alexa/accessory/protocol/Assettransfer$Asset;", "resolveAutoCapture", "", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean resolveAutoCapture(Assettransfer.Asset asset) {
            if (!asset.hasAssetMetadata()) {
                return false;
            }
            Assettransfer.AssetMetadata assetMetadata = asset.getAssetMetadata();
            if (assetMetadata.hasImageMetadata()) {
                return assetMetadata.getImageMetadata().getIsAutoCapture();
            }
            if (assetMetadata.hasVideoMetadata()) {
                return assetMetadata.getVideoMetadata().getIsAutoCapture();
            }
            return false;
        }

        @JvmStatic
        @NotNull
        public final Builder builder() {
            return new Builder();
        }

        @JvmStatic
        @NotNull
        public final AssetInfo fromAsset(@NotNull Assettransfer.Asset asset) {
            asset.getClass();
            String assetId = asset.getAssetId();
            assetId.getClass();
            String creationUnixTimestamp = asset.getCreationUnixTimestamp();
            creationUnixTimestamp.getClass();
            String assetHash = asset.getAssetHash();
            assetHash.getClass();
            return new AssetInfo(assetId, creationUnixTimestamp, assetHash, asset.getSize(), 0L, resolveAutoCapture(asset), null, null, null, 464, null);
        }

        private Companion() {
        }
    }

    public AssetInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, long j2, boolean z, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Automotive$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        str6.getClass();
        this.assetId = str;
        this.creationTimestamp = str2;
        this.md5Hash = str3;
        this.size = j;
        this.mediaId = j2;
        this.isAutoCapture = z;
        this.mimeType = str4;
        this.transformedMimeType = str5;
        this.displayName = str6;
    }

    public AssetInfo() {
        this(null, null, null, 0L, 0L, false, null, null, null, 511, null);
    }
}
