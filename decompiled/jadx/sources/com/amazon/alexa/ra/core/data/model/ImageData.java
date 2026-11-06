package com.amazon.alexa.ra.core.data.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.utils.JSONConvertible;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.konan.library.NativeLibraryConstantsKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/ImageData;", "Lcom/amazon/alexa/ra/core/data/utils/JSONConvertible;", "type", "", "altText", NativeLibraryConstantsKt.KONAN_DISTRIBUTION_SOURCES_DIR, "", "Lcom/amazon/alexa/ra/core/data/model/ImageSource;", "tags", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getType", "()Ljava/lang/String;", "getAltText", "getSources", "()Ljava/util/List;", "getTags", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class ImageData implements JSONConvertible {
    public static final int $stable = 8;

    @SerializedName("altText")
    @Nullable
    private final String altText;

    @SerializedName(NativeLibraryConstantsKt.KONAN_DISTRIBUTION_SOURCES_DIR)
    @Nullable
    private final List<ImageSource> sources;

    @SerializedName("tags")
    @Nullable
    private final List<String> tags;

    @SerializedName("type")
    @Nullable
    private final String type;

    public ImageData(@Nullable String str, @Nullable String str2, @Nullable List<ImageSource> list, @Nullable List<String> list2) {
        this.type = str;
        this.altText = str2;
        this.sources = list;
        this.tags = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImageData copy$default(ImageData imageData, String str, String str2, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = imageData.type;
        }
        if ((i & 2) != 0) {
            str2 = imageData.altText;
        }
        if ((i & 4) != 0) {
            list = imageData.sources;
        }
        if ((i & 8) != 0) {
            list2 = imageData.tags;
        }
        return imageData.copy(str, str2, list, list2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getAltText() {
        return this.altText;
    }

    @Nullable
    public final List<ImageSource> component3() {
        return this.sources;
    }

    @Nullable
    public final List<String> component4() {
        return this.tags;
    }

    @NotNull
    public final ImageData copy(@Nullable String type, @Nullable String altText, @Nullable List<ImageSource> sources, @Nullable List<String> tags) {
        return new ImageData(type, altText, sources, tags);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageData)) {
            return false;
        }
        ImageData imageData = (ImageData) other;
        return Intrinsics.areEqual(this.type, imageData.type) && Intrinsics.areEqual(this.altText, imageData.altText) && Intrinsics.areEqual(this.sources, imageData.sources) && Intrinsics.areEqual(this.tags, imageData.tags);
    }

    @Nullable
    public final String getAltText() {
        return this.altText;
    }

    @Nullable
    public final List<ImageSource> getSources() {
        return this.sources;
    }

    @Nullable
    public final List<String> getTags() {
        return this.tags;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.altText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<ImageSource> list = this.sources;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.tags;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.type;
        String str2 = this.altText;
        List<ImageSource> list = this.sources;
        List<String> list2 = this.tags;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("ImageData(type=", str, ", altText=", str2, ", sources=");
        m.append(list);
        m.append(", tags=");
        m.append(list2);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }
}
