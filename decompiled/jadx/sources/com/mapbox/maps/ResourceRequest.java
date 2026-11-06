package com.mapbox.maps;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class ResourceRequest implements Serializable {
    private final boolean cancelled;

    @NonNull
    private final RequestInfo request;

    @Nullable
    private final ResponseInfo response;

    @NonNull
    private final RequestDataSourceType source;

    @NonNull
    private final EventTimeInterval timeInterval;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public ResourceRequest(@NonNull RequestDataSourceType requestDataSourceType, @NonNull RequestInfo requestInfo, @Nullable ResponseInfo responseInfo, boolean z, @NonNull EventTimeInterval eventTimeInterval) {
        this.source = requestDataSourceType;
        this.request = requestInfo;
        this.response = responseInfo;
        this.cancelled = z;
        this.timeInterval = eventTimeInterval;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ResourceRequest.class != obj.getClass()) {
            return false;
        }
        ResourceRequest resourceRequest = (ResourceRequest) obj;
        return Objects.equals(this.source, resourceRequest.source) && Objects.equals(this.request, resourceRequest.request) && Objects.equals(this.response, resourceRequest.response) && this.cancelled == resourceRequest.cancelled && Objects.equals(this.timeInterval, resourceRequest.timeInterval);
    }

    public boolean getCancelled() {
        return this.cancelled;
    }

    @NonNull
    public RequestInfo getRequest() {
        return this.request;
    }

    @Nullable
    public ResponseInfo getResponse() {
        return this.response;
    }

    @NonNull
    public RequestDataSourceType getSource() {
        return this.source;
    }

    @NonNull
    public EventTimeInterval getTimeInterval() {
        return this.timeInterval;
    }

    public int hashCode() {
        return Objects.hash(this.source, this.request, this.response, Boolean.valueOf(this.cancelled), this.timeInterval);
    }

    public String toString() {
        return "[source: " + RecordUtils.fieldToString(this.source) + ", request: " + RecordUtils.fieldToString(this.request) + ", response: " + RecordUtils.fieldToString(this.response) + ", cancelled: " + RecordUtils.fieldToString(Boolean.valueOf(this.cancelled)) + ", timeInterval: " + RecordUtils.fieldToString(this.timeInterval) + MarkdownConstants.RIGHT_BRACKET;
    }
}
