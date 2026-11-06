package com.amazon.alexa.ra.core.data.model;

import android.net.Uri;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.voice.ui.onedesign.util.image.ImageType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0001:B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020#J\u0006\u0010%\u001a\u00020#J\u000e\u0010&\u001a\u00020'2\u0006\u0010\u000b\u001a\u00020\fJ\u001d\u0010(\u001a\u00020#*\b\u0012\u0004\u0012\u00020\u00050)2\u0006\u0010*\u001a\u00020\u0005¢\u0006\u0002\u0010+J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\t\u00101\u001a\u00020\fHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00103\u001a\u00020\u000fHÆ\u0003J]\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u00105\u001a\u00020#2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006;"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/LocalMediaInfo;", "", "uri", "Landroid/net/Uri;", "name", "", "size", "", "fileExtension", "mediaType", "Lcom/amazon/alexa/ra/core/data/model/MediaType;", "mediaStatus", "Lcom/amazon/alexa/ra/core/data/model/MediaStatus;", "sourceUrl", "origin", "Lcom/amazon/alexa/ra/core/data/model/AttachmentOrigin;", "<init>", "(Landroid/net/Uri;Ljava/lang/String;JLjava/lang/String;Lcom/amazon/alexa/ra/core/data/model/MediaType;Lcom/amazon/alexa/ra/core/data/model/MediaStatus;Ljava/lang/String;Lcom/amazon/alexa/ra/core/data/model/AttachmentOrigin;)V", "getUri", "()Landroid/net/Uri;", "getName", "()Ljava/lang/String;", "getSize", "()J", "getFileExtension", "getMediaType", "()Lcom/amazon/alexa/ra/core/data/model/MediaType;", "getMediaStatus", "()Lcom/amazon/alexa/ra/core/data/model/MediaStatus;", "setMediaStatus", "(Lcom/amazon/alexa/ra/core/data/model/MediaStatus;)V", "getSourceUrl", "getOrigin", "()Lcom/amazon/alexa/ra/core/data/model/AttachmentOrigin;", "hasValidImage", "", "hasValidDocument", "isEligibleForUpload", "updateMediaStatus", "", "containsIgnoreCase", "", "value", "([Ljava/lang/String;Ljava/lang/String;)Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Companion", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLocalMediaInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalMediaInfo.kt\ncom/amazon/alexa/ra/core/data/model/LocalMediaInfo\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,129:1\n12574#2,2:130\n*S KotlinDebug\n*F\n+ 1 LocalMediaInfo.kt\ncom/amazon/alexa/ra/core/data/model/LocalMediaInfo\n*L\n86#1:130,2\n*E\n"})
/* loaded from: classes18.dex */
public final /* data */ class LocalMediaInfo {

    @NotNull
    private final String fileExtension;

    @NotNull
    private MediaStatus mediaStatus;

    @NotNull
    private final MediaType mediaType;

    @NotNull
    private final String name;

    @NotNull
    private final AttachmentOrigin origin;
    private final long size;

    @Nullable
    private final String sourceUrl;

    @Nullable
    private final Uri uri;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final String[] ALLOWED_IMAGE_EXTENSIONS = {ImageType.PNG, "jpeg", ImageType.JPG};

    @NotNull
    private static final String[] ALLOWED_DOCUMENT_EXTENSIONS = {"doc", "docx", "pdf", "txt"};

    @NotNull
    private static final String[] ALLOWED_DOCUMENT_MIME_TYPES = {"application/msword", "application/ms-doc", "application/doc", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/pdf", "text/plain"};

    public LocalMediaInfo(@Nullable Uri uri, @NotNull String str, long j, @NotNull String str2, @NotNull MediaType mediaType, @NotNull MediaStatus mediaStatus, @Nullable String str3, @NotNull AttachmentOrigin attachmentOrigin) {
        str.getClass();
        str2.getClass();
        mediaType.getClass();
        mediaStatus.getClass();
        attachmentOrigin.getClass();
        this.uri = uri;
        this.name = str;
        this.size = j;
        this.fileExtension = str2;
        this.mediaType = mediaType;
        this.mediaStatus = mediaStatus;
        this.sourceUrl = str3;
        this.origin = attachmentOrigin;
        this.mediaStatus = (uri == null || str == null || str.length() == 0 || str2 == null || str2.length() == 0) ? MediaStatus.ERROR_UNKNOWN_FILE : j == 0 ? MediaStatus.ERROR_EMPTY_FILE : j > 26214400 ? MediaStatus.ERROR_FILE_SIZE_EXCEED : str2.length() > 0 ? containsIgnoreCase(ALLOWED_IMAGE_EXTENSIONS, str2) ? MediaStatus.VALID_FILE : containsIgnoreCase(ALLOWED_DOCUMENT_EXTENSIONS, str2) ? MediaStatus.VALID_FILE : MediaStatus.ERROR_INVALID_FORMAT : MediaStatus.ERROR_UNKNOWN_FILE;
    }

    public static /* synthetic */ LocalMediaInfo copy$default(LocalMediaInfo localMediaInfo, Uri uri, String str, long j, String str2, MediaType mediaType, MediaStatus mediaStatus, String str3, AttachmentOrigin attachmentOrigin, int i, Object obj) {
        if ((i & 1) != 0) {
            uri = localMediaInfo.uri;
        }
        if ((i & 2) != 0) {
            str = localMediaInfo.name;
        }
        if ((i & 4) != 0) {
            j = localMediaInfo.size;
        }
        if ((i & 8) != 0) {
            str2 = localMediaInfo.fileExtension;
        }
        if ((i & 16) != 0) {
            mediaType = localMediaInfo.mediaType;
        }
        if ((i & 32) != 0) {
            mediaStatus = localMediaInfo.mediaStatus;
        }
        if ((i & 64) != 0) {
            str3 = localMediaInfo.sourceUrl;
        }
        if ((i & 128) != 0) {
            attachmentOrigin = localMediaInfo.origin;
        }
        AttachmentOrigin attachmentOrigin2 = attachmentOrigin;
        MediaStatus mediaStatus2 = mediaStatus;
        String str4 = str2;
        long j2 = j;
        return localMediaInfo.copy(uri, str, j2, str4, mediaType, mediaStatus2, str3, attachmentOrigin2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getFileExtension() {
        return this.fileExtension;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final MediaType getMediaType() {
        return this.mediaType;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final MediaStatus getMediaStatus() {
        return this.mediaStatus;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getSourceUrl() {
        return this.sourceUrl;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final AttachmentOrigin getOrigin() {
        return this.origin;
    }

    public final boolean containsIgnoreCase(@NotNull String[] strArr, @NotNull String str) {
        strArr.getClass();
        str.getClass();
        for (String str2 : strArr) {
            if (StringsKt.equals(str2, str, true)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final LocalMediaInfo copy(@Nullable Uri uri, @NotNull String name, long size, @NotNull String fileExtension, @NotNull MediaType mediaType, @NotNull MediaStatus mediaStatus, @Nullable String sourceUrl, @NotNull AttachmentOrigin origin) {
        name.getClass();
        fileExtension.getClass();
        mediaType.getClass();
        mediaStatus.getClass();
        origin.getClass();
        return new LocalMediaInfo(uri, name, size, fileExtension, mediaType, mediaStatus, sourceUrl, origin);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalMediaInfo)) {
            return false;
        }
        LocalMediaInfo localMediaInfo = (LocalMediaInfo) other;
        return Intrinsics.areEqual(this.uri, localMediaInfo.uri) && Intrinsics.areEqual(this.name, localMediaInfo.name) && this.size == localMediaInfo.size && Intrinsics.areEqual(this.fileExtension, localMediaInfo.fileExtension) && this.mediaType == localMediaInfo.mediaType && this.mediaStatus == localMediaInfo.mediaStatus && Intrinsics.areEqual(this.sourceUrl, localMediaInfo.sourceUrl) && this.origin == localMediaInfo.origin;
    }

    @NotNull
    public final String getFileExtension() {
        return this.fileExtension;
    }

    @NotNull
    public final MediaStatus getMediaStatus() {
        return this.mediaStatus;
    }

    @NotNull
    public final MediaType getMediaType() {
        return this.mediaType;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final AttachmentOrigin getOrigin() {
        return this.origin;
    }

    public final long getSize() {
        return this.size;
    }

    @Nullable
    public final String getSourceUrl() {
        return this.sourceUrl;
    }

    @Nullable
    public final Uri getUri() {
        return this.uri;
    }

    public final boolean hasValidDocument() {
        return this.mediaStatus == MediaStatus.VALID_FILE && this.mediaType == MediaType.FILE;
    }

    public final boolean hasValidImage() {
        return this.mediaStatus == MediaStatus.VALID_FILE && this.mediaType == MediaType.IMAGE;
    }

    public int hashCode() {
        Uri uri = this.uri;
        int hashCode = (this.mediaStatus.hashCode() + ((this.mediaType.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(BitVector$$ExternalSyntheticOutline0.m(this.size, ArcMode$$ExternalSyntheticOutline0.m((uri == null ? 0 : uri.hashCode()) * 31, 31, this.name), 31), 31, this.fileExtension)) * 31)) * 31;
        String str = this.sourceUrl;
        return this.origin.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final boolean isEligibleForUpload() {
        return hasValidImage() || hasValidDocument();
    }

    public final void setMediaStatus(@NotNull MediaStatus mediaStatus) {
        mediaStatus.getClass();
        this.mediaStatus = mediaStatus;
    }

    @NotNull
    public String toString() {
        Uri uri = this.uri;
        String str = this.name;
        long j = this.size;
        String str2 = this.fileExtension;
        MediaType mediaType = this.mediaType;
        MediaStatus mediaStatus = this.mediaStatus;
        String str3 = this.sourceUrl;
        AttachmentOrigin attachmentOrigin = this.origin;
        StringBuilder sb = new StringBuilder("LocalMediaInfo(uri=");
        sb.append(uri);
        sb.append(", name=");
        sb.append(str);
        sb.append(", size=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(j, ", fileExtension=", str2, sb);
        sb.append(", mediaType=");
        sb.append(mediaType);
        sb.append(", mediaStatus=");
        sb.append(mediaStatus);
        sb.append(", sourceUrl=");
        sb.append(str3);
        sb.append(", origin=");
        sb.append(attachmentOrigin);
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }

    public final void updateMediaStatus(@NotNull MediaStatus mediaStatus) {
        mediaStatus.getClass();
        this.mediaStatus = mediaStatus;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\bR\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\r\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/LocalMediaInfo$Companion;", "", "<init>", "()V", "ALLOWED_IMAGE_EXTENSIONS", "", "", "getALLOWED_IMAGE_EXTENSIONS", "()[Ljava/lang/String;", "[Ljava/lang/String;", "ALLOWED_DOCUMENT_EXTENSIONS", "getALLOWED_DOCUMENT_EXTENSIONS", "ALLOWED_DOCUMENT_MIME_TYPES", "getALLOWED_DOCUMENT_MIME_TYPES", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String[] getALLOWED_DOCUMENT_EXTENSIONS() {
            return LocalMediaInfo.ALLOWED_DOCUMENT_EXTENSIONS;
        }

        @NotNull
        public final String[] getALLOWED_DOCUMENT_MIME_TYPES() {
            return LocalMediaInfo.ALLOWED_DOCUMENT_MIME_TYPES;
        }

        @NotNull
        public final String[] getALLOWED_IMAGE_EXTENSIONS() {
            return LocalMediaInfo.ALLOWED_IMAGE_EXTENSIONS;
        }

        private Companion() {
        }
    }

    public LocalMediaInfo() {
        this(null, null, 0L, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ LocalMediaInfo(Uri uri, String str, long j, String str2, MediaType mediaType, MediaStatus mediaStatus, String str3, AttachmentOrigin attachmentOrigin, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uri, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? MediaType.NONE : mediaType, (i & 32) != 0 ? MediaStatus.ERROR_UNKNOWN_FILE : mediaStatus, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? AttachmentOrigin.USER_PICKER : attachmentOrigin);
    }
}
