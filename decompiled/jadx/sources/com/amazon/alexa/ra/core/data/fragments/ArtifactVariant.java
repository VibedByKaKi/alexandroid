package com.amazon.alexa.ra.core.data.fragments;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/ArtifactVariant;", "", "mimeType", "Lcom/amazon/alexa/ra/core/data/fragments/ArtifactMimeType;", "url", "", "data", "headers", "", "Lcom/amazon/alexa/ra/core/data/fragments/ArtifactHeader;", "<init>", "(Lcom/amazon/alexa/ra/core/data/fragments/ArtifactMimeType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getMimeType", "()Lcom/amazon/alexa/ra/core/data/fragments/ArtifactMimeType;", "getUrl", "()Ljava/lang/String;", "getData", "getHeaders", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "SpecificationKeys", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class ArtifactVariant {

    @NotNull
    public static final String DATA = "data";

    @NotNull
    public static final String HEADERS = "headers";

    @NotNull
    public static final String MIME_TYPE = "mimeType";

    @NotNull
    public static final String URL = "url";

    @Nullable
    private final String data;

    @Nullable
    private final List<ArtifactHeader> headers;

    @NotNull
    private final ArtifactMimeType mimeType;

    @Nullable
    private final String url;
    public static final int $stable = 8;

    public /* synthetic */ ArtifactVariant(ArtifactMimeType artifactMimeType, String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(artifactMimeType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArtifactVariant copy$default(ArtifactVariant artifactVariant, ArtifactMimeType artifactMimeType, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            artifactMimeType = artifactVariant.mimeType;
        }
        if ((i & 2) != 0) {
            str = artifactVariant.url;
        }
        if ((i & 4) != 0) {
            str2 = artifactVariant.data;
        }
        if ((i & 8) != 0) {
            list = artifactVariant.headers;
        }
        return artifactVariant.copy(artifactMimeType, str, str2, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ArtifactMimeType getMimeType() {
        return this.mimeType;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @Nullable
    public final List<ArtifactHeader> component4() {
        return this.headers;
    }

    @NotNull
    public final ArtifactVariant copy(@NotNull ArtifactMimeType mimeType, @Nullable String url, @Nullable String data, @Nullable List<ArtifactHeader> headers) {
        mimeType.getClass();
        return new ArtifactVariant(mimeType, url, data, headers);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArtifactVariant)) {
            return false;
        }
        ArtifactVariant artifactVariant = (ArtifactVariant) other;
        return this.mimeType == artifactVariant.mimeType && Intrinsics.areEqual(this.url, artifactVariant.url) && Intrinsics.areEqual(this.data, artifactVariant.data) && Intrinsics.areEqual(this.headers, artifactVariant.headers);
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    @Nullable
    public final List<ArtifactHeader> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final ArtifactMimeType getMimeType() {
        return this.mimeType;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = this.mimeType.hashCode() * 31;
        String str = this.url;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.data;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<ArtifactHeader> list = this.headers;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ArtifactVariant(mimeType=" + this.mimeType + ", url=" + this.url + ", data=" + this.data + ", headers=" + this.headers + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public ArtifactVariant(@NotNull ArtifactMimeType artifactMimeType, @Nullable String str, @Nullable String str2, @Nullable List<ArtifactHeader> list) {
        artifactMimeType.getClass();
        this.mimeType = artifactMimeType;
        this.url = str;
        this.data = str2;
        this.headers = list;
    }
}
