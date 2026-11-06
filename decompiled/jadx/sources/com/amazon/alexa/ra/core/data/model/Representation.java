package com.amazon.alexa.ra.core.data.model;

import androidx.annotation.Keep;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/Representation;", "", "mimeType", "", "url", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMimeType", "()Ljava/lang/String;", "getUrl", "getData", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class Representation {
    public static final int $stable = 0;

    @SerializedName("data")
    @Nullable
    private final String data;

    @SerializedName("mimeType")
    @NotNull
    private final String mimeType;

    @SerializedName("url")
    @Nullable
    private final String url;

    public Representation(@NotNull String str, @Nullable String str2, @Nullable String str3) {
        str.getClass();
        this.mimeType = str;
        this.url = str2;
        this.data = str3;
    }

    public static /* synthetic */ Representation copy$default(Representation representation, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = representation.mimeType;
        }
        if ((i & 2) != 0) {
            str2 = representation.url;
        }
        if ((i & 4) != 0) {
            str3 = representation.data;
        }
        return representation.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getMimeType() {
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

    @NotNull
    public final Representation copy(@NotNull String mimeType, @Nullable String url, @Nullable String data) {
        mimeType.getClass();
        return new Representation(mimeType, url, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Representation)) {
            return false;
        }
        Representation representation = (Representation) other;
        return Intrinsics.areEqual(this.mimeType, representation.mimeType) && Intrinsics.areEqual(this.url, representation.url) && Intrinsics.areEqual(this.data, representation.data);
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final String getMimeType() {
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
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.mimeType;
        String str2 = this.url;
        return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("Representation(mimeType=", str, ", url=", str2, ", data="), this.data, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
