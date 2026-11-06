package com.mapbox.maps.extension.observable.model;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.deecomms.nativemodules.util.ReactBridgeSerializer;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated(level = DeprecationLevel.WARNING, message = "This data class is deprecated, and will be removed in next major release.", replaceWith = @ReplaceWith(expression = "RequestInfo", imports = {}))
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0004HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/mapbox/maps/extension/observable/model/Request;", "", "loadingMethod", "", "", "url", ReactBridgeSerializer.CONTACT_DISCRIMINATOR_PROPERTY_NAME, "Lcom/mapbox/maps/extension/observable/model/RequestType;", "priority", "Lcom/mapbox/maps/extension/observable/model/RequestPriority;", "(Ljava/util/List;Ljava/lang/String;Lcom/mapbox/maps/extension/observable/model/RequestType;Lcom/mapbox/maps/extension/observable/model/RequestPriority;)V", "getKind", "()Lcom/mapbox/maps/extension/observable/model/RequestType;", "getLoadingMethod", "()Ljava/util/List;", "getPriority", "()Lcom/mapbox/maps/extension/observable/model/RequestPriority;", "getUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class Request {

    @SerializedName(ReactBridgeSerializer.CONTACT_DISCRIMINATOR_PROPERTY_NAME)
    @NotNull
    private final RequestType kind;

    @SerializedName("loading-method")
    @NotNull
    private final List<String> loadingMethod;

    @SerializedName("priority")
    @NotNull
    private final RequestPriority priority;

    @SerializedName("url")
    @NotNull
    private final String url;

    public Request(@NotNull List<String> list, @NotNull String str, @NotNull RequestType requestType, @NotNull RequestPriority requestPriority) {
        list.getClass();
        str.getClass();
        requestType.getClass();
        requestPriority.getClass();
        this.loadingMethod = list;
        this.url = str;
        this.kind = requestType;
        this.priority = requestPriority;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Request copy$default(Request request, List list, String str, RequestType requestType, RequestPriority requestPriority, int i, Object obj) {
        if ((i & 1) != 0) {
            list = request.loadingMethod;
        }
        if ((i & 2) != 0) {
            str = request.url;
        }
        if ((i & 4) != 0) {
            requestType = request.kind;
        }
        if ((i & 8) != 0) {
            requestPriority = request.priority;
        }
        return request.copy(list, str, requestType, requestPriority);
    }

    @NotNull
    public final List<String> component1() {
        return this.loadingMethod;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final RequestType getKind() {
        return this.kind;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final RequestPriority getPriority() {
        return this.priority;
    }

    @NotNull
    public final Request copy(@NotNull List<String> loadingMethod, @NotNull String url, @NotNull RequestType kind, @NotNull RequestPriority priority) {
        loadingMethod.getClass();
        url.getClass();
        kind.getClass();
        priority.getClass();
        return new Request(loadingMethod, url, kind, priority);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Request)) {
            return false;
        }
        Request request = (Request) other;
        return Intrinsics.areEqual(this.loadingMethod, request.loadingMethod) && Intrinsics.areEqual(this.url, request.url) && this.kind == request.kind && this.priority == request.priority;
    }

    @NotNull
    public final RequestType getKind() {
        return this.kind;
    }

    @NotNull
    public final List<String> getLoadingMethod() {
        return this.loadingMethod;
    }

    @NotNull
    public final RequestPriority getPriority() {
        return this.priority;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.priority.hashCode() + ((this.kind.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(this.loadingMethod.hashCode() * 31, 31, this.url)) * 31);
    }

    @NotNull
    public String toString() {
        return "Request(loadingMethod=" + this.loadingMethod + ", url=" + this.url + ", kind=" + this.kind + ", priority=" + this.priority + ')';
    }
}
