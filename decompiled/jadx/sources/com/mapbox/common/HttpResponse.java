package com.mapbox.common;

import androidx.annotation.NonNull;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class HttpResponse implements Serializable {

    @NonNull
    private final HttpRequest request;
    private final long requestId;

    @NonNull
    private final Expected<HttpRequestError, HttpResponseData> result;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public HttpResponse(long j, @NonNull HttpRequest httpRequest, @NonNull Expected<HttpRequestError, HttpResponseData> expected) {
        this.requestId = j;
        this.request = httpRequest;
        this.result = expected;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        return this.requestId == httpResponse.requestId && Objects.equals(this.request, httpResponse.request) && Objects.equals(this.result, httpResponse.result);
    }

    @NonNull
    public HttpRequest getRequest() {
        return this.request;
    }

    public long getRequestId() {
        return this.requestId;
    }

    @NonNull
    public Expected<HttpRequestError, HttpResponseData> getResult() {
        return this.result;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.requestId), this.request, this.result);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[requestId: ");
        RegionDefaults$$ExternalSyntheticOutline0.m(this.requestId, ", request: ", sb);
        sb.append(RecordUtils.fieldToString(this.request));
        sb.append(", result: ");
        sb.append(RecordUtils.fieldToString(this.result));
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }
}
