package com.mapbox.maps.extension.observable.eventdata;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.assistant.transport.MissingTokenPull;
import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import com.mapbox.maps.extension.observable.model.DataSourceType;
import com.mapbox.maps.extension.observable.model.Request;
import com.mapbox.maps.extension.observable.model.Response;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated(level = DeprecationLevel.WARNING, message = "This data class is deprecated, and will be removed in next major release.", replaceWith = @ReplaceWith(expression = "ResourceRequest", imports = {}))
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JN\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lcom/mapbox/maps/extension/observable/eventdata/ResourceEventData;", "", "begin", "", "end", "dataSource", "Lcom/mapbox/maps/extension/observable/model/DataSourceType;", MissingTokenPull.TRIGGER_REQUEST, "Lcom/mapbox/maps/extension/observable/model/Request;", "response", "Lcom/mapbox/maps/extension/observable/model/Response;", AuthorizationDelegateAdapter.FAILURE_CANCELLED, "", "(JLjava/lang/Long;Lcom/mapbox/maps/extension/observable/model/DataSourceType;Lcom/mapbox/maps/extension/observable/model/Request;Lcom/mapbox/maps/extension/observable/model/Response;Z)V", "getBegin", "()J", "getCancelled", "()Z", "getDataSource", "()Lcom/mapbox/maps/extension/observable/model/DataSourceType;", "getEnd", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRequest", "()Lcom/mapbox/maps/extension/observable/model/Request;", "getResponse", "()Lcom/mapbox/maps/extension/observable/model/Response;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(JLjava/lang/Long;Lcom/mapbox/maps/extension/observable/model/DataSourceType;Lcom/mapbox/maps/extension/observable/model/Request;Lcom/mapbox/maps/extension/observable/model/Response;Z)Lcom/mapbox/maps/extension/observable/eventdata/ResourceEventData;", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ResourceEventData {

    @SerializedName("begin")
    private final long begin;

    @SerializedName(AuthorizationDelegateAdapter.FAILURE_CANCELLED)
    private final boolean cancelled;

    @SerializedName("data-source")
    @NotNull
    private final DataSourceType dataSource;

    @SerializedName("end")
    @Nullable
    private final Long end;

    @SerializedName(MissingTokenPull.TRIGGER_REQUEST)
    @NotNull
    private final Request request;

    @SerializedName("response")
    @Nullable
    private final Response response;

    public ResourceEventData(long j, @Nullable Long l, @NotNull DataSourceType dataSourceType, @NotNull Request request, @Nullable Response response, boolean z) {
        dataSourceType.getClass();
        request.getClass();
        this.begin = j;
        this.end = l;
        this.dataSource = dataSourceType;
        this.request = request;
        this.response = response;
        this.cancelled = z;
    }

    public static /* synthetic */ ResourceEventData copy$default(ResourceEventData resourceEventData, long j, Long l, DataSourceType dataSourceType, Request request, Response response, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = resourceEventData.begin;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            l = resourceEventData.end;
        }
        Long l2 = l;
        if ((i & 4) != 0) {
            dataSourceType = resourceEventData.dataSource;
        }
        DataSourceType dataSourceType2 = dataSourceType;
        if ((i & 8) != 0) {
            request = resourceEventData.request;
        }
        Request request2 = request;
        if ((i & 16) != 0) {
            response = resourceEventData.response;
        }
        Response response2 = response;
        if ((i & 32) != 0) {
            z = resourceEventData.cancelled;
        }
        return resourceEventData.copy(j2, l2, dataSourceType2, request2, response2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final long getBegin() {
        return this.begin;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Long getEnd() {
        return this.end;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final DataSourceType getDataSource() {
        return this.dataSource;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Request getRequest() {
        return this.request;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Response getResponse() {
        return this.response;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getCancelled() {
        return this.cancelled;
    }

    @NotNull
    public final ResourceEventData copy(long begin, @Nullable Long end, @NotNull DataSourceType dataSource, @NotNull Request request, @Nullable Response response, boolean cancelled) {
        dataSource.getClass();
        request.getClass();
        return new ResourceEventData(begin, end, dataSource, request, response, cancelled);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResourceEventData)) {
            return false;
        }
        ResourceEventData resourceEventData = (ResourceEventData) other;
        return this.begin == resourceEventData.begin && Intrinsics.areEqual(this.end, resourceEventData.end) && this.dataSource == resourceEventData.dataSource && Intrinsics.areEqual(this.request, resourceEventData.request) && Intrinsics.areEqual(this.response, resourceEventData.response) && this.cancelled == resourceEventData.cancelled;
    }

    public final long getBegin() {
        return this.begin;
    }

    public final boolean getCancelled() {
        return this.cancelled;
    }

    @NotNull
    public final DataSourceType getDataSource() {
        return this.dataSource;
    }

    @Nullable
    public final Long getEnd() {
        return this.end;
    }

    @NotNull
    public final Request getRequest() {
        return this.request;
    }

    @Nullable
    public final Response getResponse() {
        return this.response;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Long.hashCode(this.begin) * 31;
        Long l = this.end;
        int hashCode2 = (this.request.hashCode() + ((this.dataSource.hashCode() + ((hashCode + (l == null ? 0 : l.hashCode())) * 31)) * 31)) * 31;
        Response response = this.response;
        int hashCode3 = (hashCode2 + (response != null ? response.hashCode() : 0)) * 31;
        boolean z = this.cancelled;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode3 + i;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ResourceEventData(begin=");
        sb.append(this.begin);
        sb.append(", end=");
        sb.append(this.end);
        sb.append(", dataSource=");
        sb.append(this.dataSource);
        sb.append(", request=");
        sb.append(this.request);
        sb.append(", response=");
        sb.append(this.response);
        sb.append(", cancelled=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.cancelled, ')');
    }
}
