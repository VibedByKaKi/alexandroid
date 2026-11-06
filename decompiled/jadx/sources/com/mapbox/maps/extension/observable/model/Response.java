package com.mapbox.maps.extension.observable.model;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import io.ktor.client.utils.CacheControl;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated(level = DeprecationLevel.WARNING, message = "This data class is deprecated, and will be removed in next major release.", replaceWith = @ReplaceWith(expression = "ResponseInfo", imports = {}))
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jk\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\rHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006-"}, d2 = {"Lcom/mapbox/maps/extension/observable/model/Response;", "", "eTag", "", "mustRevalidate", "", "noContent", "modified", "source", "Lcom/mapbox/maps/extension/observable/model/ResponseSourceType;", "notModified", "expires", "size", "", "error", "Lcom/mapbox/maps/extension/observable/model/Error;", "(Ljava/lang/String;ZZLjava/lang/String;Lcom/mapbox/maps/extension/observable/model/ResponseSourceType;ZLjava/lang/String;ILcom/mapbox/maps/extension/observable/model/Error;)V", "getETag", "()Ljava/lang/String;", "getError", "()Lcom/mapbox/maps/extension/observable/model/Error;", "getExpires", "getModified", "getMustRevalidate", "()Z", "getNoContent", "getNotModified", "getSize", "()I", "getSource", "()Lcom/mapbox/maps/extension/observable/model/ResponseSourceType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class Response {

    @SerializedName("etag")
    @Nullable
    private final String eTag;

    @SerializedName("error")
    @Nullable
    private final Error error;

    @SerializedName("expires")
    @Nullable
    private final String expires;

    @SerializedName("modified")
    @Nullable
    private final String modified;

    @SerializedName(CacheControl.MUST_REVALIDATE)
    private final boolean mustRevalidate;

    @SerializedName("no-content")
    private final boolean noContent;

    @SerializedName("not-modified")
    private final boolean notModified;

    @SerializedName("size")
    private final int size;

    @SerializedName("source")
    @NotNull
    private final ResponseSourceType source;

    public Response(@Nullable String str, boolean z, boolean z2, @Nullable String str2, @NotNull ResponseSourceType responseSourceType, boolean z3, @Nullable String str3, int i, @Nullable Error error) {
        responseSourceType.getClass();
        this.eTag = str;
        this.mustRevalidate = z;
        this.noContent = z2;
        this.modified = str2;
        this.source = responseSourceType;
        this.notModified = z3;
        this.expires = str3;
        this.size = i;
        this.error = error;
    }

    public static /* synthetic */ Response copy$default(Response response, String str, boolean z, boolean z2, String str2, ResponseSourceType responseSourceType, boolean z3, String str3, int i, Error error, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = response.eTag;
        }
        if ((i2 & 2) != 0) {
            z = response.mustRevalidate;
        }
        if ((i2 & 4) != 0) {
            z2 = response.noContent;
        }
        if ((i2 & 8) != 0) {
            str2 = response.modified;
        }
        if ((i2 & 16) != 0) {
            responseSourceType = response.source;
        }
        if ((i2 & 32) != 0) {
            z3 = response.notModified;
        }
        if ((i2 & 64) != 0) {
            str3 = response.expires;
        }
        if ((i2 & 128) != 0) {
            i = response.size;
        }
        if ((i2 & 256) != 0) {
            error = response.error;
        }
        int i3 = i;
        Error error2 = error;
        boolean z4 = z3;
        String str4 = str3;
        ResponseSourceType responseSourceType2 = responseSourceType;
        boolean z5 = z2;
        return response.copy(str, z, z5, str2, responseSourceType2, z4, str4, i3, error2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getETag() {
        return this.eTag;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getMustRevalidate() {
        return this.mustRevalidate;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getNoContent() {
        return this.noContent;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getModified() {
        return this.modified;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ResponseSourceType getSource() {
        return this.source;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getNotModified() {
        return this.notModified;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getExpires() {
        return this.expires;
    }

    /* renamed from: component8, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Error getError() {
        return this.error;
    }

    @NotNull
    public final Response copy(@Nullable String eTag, boolean mustRevalidate, boolean noContent, @Nullable String modified, @NotNull ResponseSourceType source, boolean notModified, @Nullable String expires, int size, @Nullable Error error) {
        source.getClass();
        return new Response(eTag, mustRevalidate, noContent, modified, source, notModified, expires, size, error);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Response)) {
            return false;
        }
        Response response = (Response) other;
        return Intrinsics.areEqual(this.eTag, response.eTag) && this.mustRevalidate == response.mustRevalidate && this.noContent == response.noContent && Intrinsics.areEqual(this.modified, response.modified) && this.source == response.source && this.notModified == response.notModified && Intrinsics.areEqual(this.expires, response.expires) && this.size == response.size && Intrinsics.areEqual(this.error, response.error);
    }

    @Nullable
    public final String getETag() {
        return this.eTag;
    }

    @Nullable
    public final Error getError() {
        return this.error;
    }

    @Nullable
    public final String getExpires() {
        return this.expires;
    }

    @Nullable
    public final String getModified() {
        return this.modified;
    }

    public final boolean getMustRevalidate() {
        return this.mustRevalidate;
    }

    public final boolean getNoContent() {
        return this.noContent;
    }

    public final boolean getNotModified() {
        return this.notModified;
    }

    public final int getSize() {
        return this.size;
    }

    @NotNull
    public final ResponseSourceType getSource() {
        return this.source;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.eTag;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.mustRevalidate;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.noContent;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        String str2 = this.modified;
        int hashCode2 = (this.source.hashCode() + ((i4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        boolean z3 = this.notModified;
        int i5 = (hashCode2 + (z3 ? 1 : z3 ? 1 : 0)) * 31;
        String str3 = this.expires;
        int m = ArcMode$$ExternalSyntheticOutline0.m(this.size, (i5 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        Error error = this.error;
        return m + (error != null ? error.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Response(eTag=" + this.eTag + ", mustRevalidate=" + this.mustRevalidate + ", noContent=" + this.noContent + ", modified=" + this.modified + ", source=" + this.source + ", notModified=" + this.notModified + ", expires=" + this.expires + ", size=" + this.size + ", error=" + this.error + ')';
    }
}
