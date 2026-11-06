package com.amazon.alexa.accessory.frames.media.pipeline;

import android.net.Uri;
import com.amazon.alexa.accessory.frames.media.dto.AssetInfo;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u0012\u001a\u00020\u000bHÆ\u0003JA\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/pipeline/DownloadedAsset;", "", "assetInfo", "Lcom/amazon/alexa/accessory/frames/media/dto/AssetInfo;", "tempFile", "Ljava/io/File;", "mimeType", "", "mediaUri", "Landroid/net/Uri;", "skipProcessing", "", "<init>", "(Lcom/amazon/alexa/accessory/frames/media/dto/AssetInfo;Ljava/io/File;Ljava/lang/String;Landroid/net/Uri;Z)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DownloadedAsset {

    @JvmField
    @NotNull
    public final AssetInfo assetInfo;

    @JvmField
    @Nullable
    public final Uri mediaUri;

    @JvmField
    @Nullable
    public final String mimeType;

    @JvmField
    public final boolean skipProcessing;

    @JvmField
    @Nullable
    public final File tempFile;

    public /* synthetic */ DownloadedAsset(AssetInfo assetInfo, File file, String str, Uri uri, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(assetInfo, file, str, (i & 8) != 0 ? null : uri, (i & 16) != 0 ? false : z);
    }

    public static /* synthetic */ DownloadedAsset copy$default(DownloadedAsset downloadedAsset, AssetInfo assetInfo, File file, String str, Uri uri, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            assetInfo = downloadedAsset.assetInfo;
        }
        if ((i & 2) != 0) {
            file = downloadedAsset.tempFile;
        }
        if ((i & 4) != 0) {
            str = downloadedAsset.mimeType;
        }
        if ((i & 8) != 0) {
            uri = downloadedAsset.mediaUri;
        }
        if ((i & 16) != 0) {
            z = downloadedAsset.skipProcessing;
        }
        boolean z2 = z;
        String str2 = str;
        return downloadedAsset.copy(assetInfo, file, str2, uri, z2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AssetInfo getAssetInfo() {
        return this.assetInfo;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final File getTempFile() {
        return this.tempFile;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Uri getMediaUri() {
        return this.mediaUri;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getSkipProcessing() {
        return this.skipProcessing;
    }

    @NotNull
    public final DownloadedAsset copy(@NotNull AssetInfo assetInfo, @Nullable File tempFile, @Nullable String mimeType, @Nullable Uri mediaUri, boolean skipProcessing) {
        assetInfo.getClass();
        return new DownloadedAsset(assetInfo, tempFile, mimeType, mediaUri, skipProcessing);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownloadedAsset)) {
            return false;
        }
        DownloadedAsset downloadedAsset = (DownloadedAsset) other;
        return Intrinsics.areEqual(this.assetInfo, downloadedAsset.assetInfo) && Intrinsics.areEqual(this.tempFile, downloadedAsset.tempFile) && Intrinsics.areEqual(this.mimeType, downloadedAsset.mimeType) && Intrinsics.areEqual(this.mediaUri, downloadedAsset.mediaUri) && this.skipProcessing == downloadedAsset.skipProcessing;
    }

    public int hashCode() {
        int hashCode = this.assetInfo.hashCode() * 31;
        File file = this.tempFile;
        int hashCode2 = (hashCode + (file == null ? 0 : file.hashCode())) * 31;
        String str = this.mimeType;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri = this.mediaUri;
        return Boolean.hashCode(this.skipProcessing) + ((hashCode3 + (uri != null ? uri.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        AssetInfo assetInfo = this.assetInfo;
        File file = this.tempFile;
        String str = this.mimeType;
        Uri uri = this.mediaUri;
        boolean z = this.skipProcessing;
        StringBuilder sb = new StringBuilder("DownloadedAsset(assetInfo=");
        sb.append(assetInfo);
        sb.append(", tempFile=");
        sb.append(file);
        sb.append(", mimeType=");
        sb.append(str);
        sb.append(", mediaUri=");
        sb.append(uri);
        sb.append(", skipProcessing=");
        return a$$ExternalSyntheticOutline0.m(sb, z, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public DownloadedAsset(@NotNull AssetInfo assetInfo, @Nullable File file, @Nullable String str, @Nullable Uri uri, boolean z) {
        assetInfo.getClass();
        this.assetInfo = assetInfo;
        this.tempFile = file;
        this.mimeType = str;
        this.mediaUri = uri;
        this.skipProcessing = z;
    }
}
