package com.amazon.alexa.ra.core.data.model;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/ThumbnailData;", "", "thumbnailType", "Lcom/amazon/alexa/ra/core/data/model/ThumbnailType;", "bitmap", "Landroid/graphics/Bitmap;", "name", "", "uri", "Landroid/net/Uri;", "<init>", "(Lcom/amazon/alexa/ra/core/data/model/ThumbnailType;Landroid/graphics/Bitmap;Ljava/lang/String;Landroid/net/Uri;)V", "getThumbnailType", "()Lcom/amazon/alexa/ra/core/data/model/ThumbnailType;", "getBitmap", "()Landroid/graphics/Bitmap;", "getName", "()Ljava/lang/String;", "getUri", "()Landroid/net/Uri;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class ThumbnailData {
    public static final int $stable = 8;

    @Nullable
    private final Bitmap bitmap;

    @Nullable
    private final String name;

    @NotNull
    private final ThumbnailType thumbnailType;

    @Nullable
    private final Uri uri;

    public /* synthetic */ ThumbnailData(ThumbnailType thumbnailType, Bitmap bitmap, String str, Uri uri, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ThumbnailType.UNSUPPORTED : thumbnailType, (i & 2) != 0 ? null : bitmap, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : uri);
    }

    public static /* synthetic */ ThumbnailData copy$default(ThumbnailData thumbnailData, ThumbnailType thumbnailType, Bitmap bitmap, String str, Uri uri, int i, Object obj) {
        if ((i & 1) != 0) {
            thumbnailType = thumbnailData.thumbnailType;
        }
        if ((i & 2) != 0) {
            bitmap = thumbnailData.bitmap;
        }
        if ((i & 4) != 0) {
            str = thumbnailData.name;
        }
        if ((i & 8) != 0) {
            uri = thumbnailData.uri;
        }
        return thumbnailData.copy(thumbnailType, bitmap, str, uri);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ThumbnailType getThumbnailType() {
        return this.thumbnailType;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    @NotNull
    public final ThumbnailData copy(@NotNull ThumbnailType thumbnailType, @Nullable Bitmap bitmap, @Nullable String name, @Nullable Uri uri) {
        thumbnailType.getClass();
        return new ThumbnailData(thumbnailType, bitmap, name, uri);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThumbnailData)) {
            return false;
        }
        ThumbnailData thumbnailData = (ThumbnailData) other;
        return this.thumbnailType == thumbnailData.thumbnailType && Intrinsics.areEqual(this.bitmap, thumbnailData.bitmap) && Intrinsics.areEqual(this.name, thumbnailData.name) && Intrinsics.areEqual(this.uri, thumbnailData.uri);
    }

    @Nullable
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final ThumbnailType getThumbnailType() {
        return this.thumbnailType;
    }

    @Nullable
    public final Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        int hashCode = this.thumbnailType.hashCode() * 31;
        Bitmap bitmap = this.bitmap;
        int hashCode2 = (hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        String str = this.name;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri = this.uri;
        return hashCode3 + (uri != null ? uri.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ThumbnailData(thumbnailType=" + this.thumbnailType + ", bitmap=" + this.bitmap + ", name=" + this.name + ", uri=" + this.uri + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public ThumbnailData(@NotNull ThumbnailType thumbnailType, @Nullable Bitmap bitmap, @Nullable String str, @Nullable Uri uri) {
        thumbnailType.getClass();
        this.thumbnailType = thumbnailType;
        this.bitmap = bitmap;
        this.name = str;
        this.uri = uri;
    }

    public ThumbnailData() {
        this(null, null, null, null, 15, null);
    }
}
