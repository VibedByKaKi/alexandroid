package com.mapbox.common.http_backend;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.HttpMethod;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import com.mapbox.common.NetworkRestriction;
import com.mapbox.common.SizedReadStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public class Request implements Serializable {

    @Nullable
    private final SizedReadStream body;
    private final int flags;

    @NonNull
    private HashMap<String, String> headers;

    @NonNull
    private HttpMethod method;

    @NonNull
    private final NetworkRestriction networkRestriction;
    private final long timeout;

    @NonNull
    private final String url;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {

        @Nullable
        private SizedReadStream body;

        @NonNull
        private HashMap<String, String> headers;

        @NonNull
        private String url;

        @NonNull
        private HttpMethod method = HttpMethod.GET;
        private long timeout = 0;

        @NonNull
        private NetworkRestriction networkRestriction = NetworkRestriction.NONE;
        private int flags = 0;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Builder body(@Nullable SizedReadStream sizedReadStream) {
            this.body = sizedReadStream;
            return this;
        }

        public Request build() {
            if (this.method == null) {
                Single$$ExternalSyntheticBUOutline0.m$1("method shouldn't be null");
                return null;
            }
            if (this.url == null) {
                Single$$ExternalSyntheticBUOutline0.m$1("url shouldn't be null");
                return null;
            }
            if (this.headers == null) {
                Single$$ExternalSyntheticBUOutline0.m$1("headers shouldn't be null");
                return null;
            }
            if (this.networkRestriction != null) {
                return new Request(this.method, this.url, this.headers, this.timeout, this.networkRestriction, this.body, this.flags);
            }
            Single$$ExternalSyntheticBUOutline0.m$1("networkRestriction shouldn't be null");
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Builder flags(int i) {
            this.flags = i;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Builder headers(@NonNull HashMap<String, String> hashMap) {
            this.headers = hashMap;
            return this;
        }

        public Builder method(@NonNull HttpMethod httpMethod) {
            this.method = httpMethod;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Builder networkRestriction(@NonNull NetworkRestriction networkRestriction) {
            this.networkRestriction = networkRestriction;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Builder timeout(long j) {
            this.timeout = j;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Builder url(@NonNull String str) {
            this.url = str;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    private Request(@NonNull String str, @NonNull HashMap<String, String> hashMap, @Nullable SizedReadStream sizedReadStream) {
        this.url = str;
        this.headers = hashMap;
        this.body = sizedReadStream;
        this.method = HttpMethod.GET;
        this.timeout = 0L;
        this.networkRestriction = NetworkRestriction.NONE;
        this.flags = 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Request request = (Request) obj;
        return Objects.equals(this.method, request.method) && Objects.equals(this.url, request.url) && Objects.equals(this.headers, request.headers) && this.timeout == request.timeout && Objects.equals(this.networkRestriction, request.networkRestriction) && Objects.equals(this.body, request.body) && this.flags == request.flags;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public SizedReadStream getBody() {
        return this.body;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getFlags() {
        return this.flags;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public HashMap<String, String> getHeaders() {
        return this.headers;
    }

    @NonNull
    public HttpMethod getMethod() {
        return this.method;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public NetworkRestriction getNetworkRestriction() {
        return this.networkRestriction;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public long getTimeout() {
        return this.timeout;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Objects.hash(this.method, this.url, this.headers, Long.valueOf(this.timeout), this.networkRestriction, this.body, Integer.valueOf(this.flags));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setHeaders(@NonNull HashMap<String, String> hashMap) {
        this.headers = hashMap;
    }

    public void setMethod(@NonNull HttpMethod httpMethod) {
        this.method = httpMethod;
    }

    public Builder toBuilder() {
        return new Builder().method(this.method).url(this.url).headers(this.headers).timeout(this.timeout).networkRestriction(this.networkRestriction).body(this.body).flags(this.flags);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[method: ");
        sb.append(RecordUtils.fieldToString(this.method));
        sb.append(", url: ");
        RegionDefaults$$ExternalSyntheticOutline0.m23764m(this.url, ", headers: ", sb);
        sb.append(RecordUtils.fieldToString(this.headers));
        sb.append(", timeout: ");
        RegionDefaults$$ExternalSyntheticOutline0.m(this.timeout, ", networkRestriction: ", sb);
        sb.append(RecordUtils.fieldToString(this.networkRestriction));
        sb.append(", body: ");
        sb.append(RecordUtils.fieldToString(this.body));
        sb.append(", flags: ");
        sb.append(RecordUtils.fieldToString(Integer.valueOf(this.flags)));
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }

    private Request(@NonNull HttpMethod httpMethod, @NonNull String str, @NonNull HashMap<String, String> hashMap, long j, @NonNull NetworkRestriction networkRestriction, @Nullable SizedReadStream sizedReadStream, int i) {
        this.method = httpMethod;
        this.url = str;
        this.headers = hashMap;
        this.timeout = j;
        this.networkRestriction = networkRestriction;
        this.body = sizedReadStream;
        this.flags = i;
    }
}
