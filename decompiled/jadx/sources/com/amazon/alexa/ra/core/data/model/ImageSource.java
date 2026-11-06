package com.amazon.alexa.ra.core.data.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.data.utils.JSONConvertible;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010¨\u0006 "}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/ImageSource;", "Lcom/amazon/alexa/ra/core/data/utils/JSONConvertible;", "url", "", "icon", "size", "widthPixels", "", "heightPixels", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getUrl", "()Ljava/lang/String;", "getIcon", "getSize", "getWidthPixels", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeightPixels", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/amazon/alexa/ra/core/data/model/ImageSource;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class ImageSource implements JSONConvertible {
    public static final int $stable = 0;

    @SerializedName("heightPixels")
    @Nullable
    private final Integer heightPixels;

    @SerializedName("icon")
    @Nullable
    private final String icon;

    @SerializedName("size")
    @Nullable
    private final String size;

    @SerializedName("url")
    @Nullable
    private final String url;

    @SerializedName("widthPixels")
    @Nullable
    private final Integer widthPixels;

    public ImageSource(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Integer num2) {
        this.url = str;
        this.icon = str2;
        this.size = str3;
        this.widthPixels = num;
        this.heightPixels = num2;
    }

    public static /* synthetic */ ImageSource copy$default(ImageSource imageSource, String str, String str2, String str3, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = imageSource.url;
        }
        if ((i & 2) != 0) {
            str2 = imageSource.icon;
        }
        if ((i & 4) != 0) {
            str3 = imageSource.size;
        }
        if ((i & 8) != 0) {
            num = imageSource.widthPixels;
        }
        if ((i & 16) != 0) {
            num2 = imageSource.heightPixels;
        }
        Integer num3 = num2;
        String str4 = str3;
        return imageSource.copy(str, str2, str4, num, num3);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getWidthPixels() {
        return this.widthPixels;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getHeightPixels() {
        return this.heightPixels;
    }

    @NotNull
    public final ImageSource copy(@Nullable String url, @Nullable String icon, @Nullable String size, @Nullable Integer widthPixels, @Nullable Integer heightPixels) {
        return new ImageSource(url, icon, size, widthPixels, heightPixels);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageSource)) {
            return false;
        }
        ImageSource imageSource = (ImageSource) other;
        return Intrinsics.areEqual(this.url, imageSource.url) && Intrinsics.areEqual(this.icon, imageSource.icon) && Intrinsics.areEqual(this.size, imageSource.size) && Intrinsics.areEqual(this.widthPixels, imageSource.widthPixels) && Intrinsics.areEqual(this.heightPixels, imageSource.heightPixels);
    }

    @Nullable
    public final Integer getHeightPixels() {
        return this.heightPixels;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getSize() {
        return this.size;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final Integer getWidthPixels() {
        return this.widthPixels;
    }

    public int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.icon;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.size;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.widthPixels;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.heightPixels;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.url;
        String str2 = this.icon;
        String str3 = this.size;
        Integer num = this.widthPixels;
        Integer num2 = this.heightPixels;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("ImageSource(url=", str, ", icon=", str2, ", size=");
        m.append(str3);
        m.append(", widthPixels=");
        m.append(num);
        m.append(", heightPixels=");
        return Automotive$$ExternalSyntheticOutline0.m(m, num2, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
