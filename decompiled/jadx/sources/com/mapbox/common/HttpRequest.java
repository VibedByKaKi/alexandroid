package com.mapbox.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class HttpRequest implements Serializable {

    @Nullable
    private final byte[] body;
    private final int flags;

    @NonNull
    private HashMap<String, String> headers;

    @NonNull
    private HttpMethod method;

    @NonNull
    private final NetworkRestriction networkRestriction;

    @NonNull
    private final SdkInformation sdkInformation;
    private final long timeout;

    @NonNull
    private final String url;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {

        @Nullable
        private byte[] body;

        @NonNull
        private HashMap<String, String> headers;

        @NonNull
        private SdkInformation sdkInformation;

        @NonNull
        private String url;

        @NonNull
        private HttpMethod method = HttpMethod.GET;
        private long timeout = 0;

        @NonNull
        private NetworkRestriction networkRestriction = NetworkRestriction.NONE;
        private int flags = 0;

        public Builder body(@Nullable byte[] bArr) {
            this.body = bArr;
            return this;
        }

        public HttpRequest build() {
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
            if (this.networkRestriction == null) {
                Single$$ExternalSyntheticBUOutline0.m$1("networkRestriction shouldn't be null");
                return null;
            }
            if (this.sdkInformation != null) {
                return new HttpRequest(this.method, this.url, this.headers, this.timeout, this.networkRestriction, this.sdkInformation, this.body, this.flags);
            }
            Single$$ExternalSyntheticBUOutline0.m$1("sdkInformation shouldn't be null");
            return null;
        }

        public Builder flags(int i) {
            this.flags = i;
            return this;
        }

        public Builder headers(@NonNull HashMap<String, String> hashMap) {
            this.headers = hashMap;
            return this;
        }

        public Builder method(@NonNull HttpMethod httpMethod) {
            this.method = httpMethod;
            return this;
        }

        public Builder networkRestriction(@NonNull NetworkRestriction networkRestriction) {
            this.networkRestriction = networkRestriction;
            return this;
        }

        public Builder sdkInformation(@NonNull SdkInformation sdkInformation) {
            this.sdkInformation = sdkInformation;
            return this;
        }

        public Builder timeout(long j) {
            this.timeout = j;
            return this;
        }

        public Builder url(@NonNull String str) {
            this.url = str;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    private HttpRequest(@NonNull String str, @NonNull HashMap<String, String> hashMap, @NonNull SdkInformation sdkInformation, @Nullable byte[] bArr) {
        this.url = str;
        this.headers = hashMap;
        this.sdkInformation = sdkInformation;
        this.body = bArr;
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
        HttpRequest httpRequest = (HttpRequest) obj;
        return Objects.equals(this.method, httpRequest.method) && Objects.equals(this.url, httpRequest.url) && Objects.equals(this.headers, httpRequest.headers) && this.timeout == httpRequest.timeout && Objects.equals(this.networkRestriction, httpRequest.networkRestriction) && Objects.equals(this.sdkInformation, httpRequest.sdkInformation) && Objects.equals(this.body, httpRequest.body) && this.flags == httpRequest.flags;
    }

    @Nullable
    public byte[] getBody() {
        return this.body;
    }

    public int getFlags() {
        return this.flags;
    }

    @NonNull
    public HashMap<String, String> getHeaders() {
        return this.headers;
    }

    @NonNull
    public HttpMethod getMethod() {
        return this.method;
    }

    @NonNull
    public NetworkRestriction getNetworkRestriction() {
        return this.networkRestriction;
    }

    @NonNull
    public SdkInformation getSdkInformation() {
        return this.sdkInformation;
    }

    public long getTimeout() {
        return this.timeout;
    }

    @NonNull
    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Objects.hash(this.method, this.url, this.headers, Long.valueOf(this.timeout), this.networkRestriction, this.sdkInformation, this.body, Integer.valueOf(this.flags));
    }

    public void setHeaders(@NonNull HashMap<String, String> hashMap) {
        this.headers = hashMap;
    }

    public void setMethod(@NonNull HttpMethod httpMethod) {
        this.method = httpMethod;
    }

    public Builder toBuilder() {
        return new Builder().method(this.method).url(this.url).headers(this.headers).timeout(this.timeout).networkRestriction(this.networkRestriction).sdkInformation(this.sdkInformation).body(this.body).flags(this.flags);
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
        sb.append(", sdkInformation: ");
        sb.append(RecordUtils.fieldToString(this.sdkInformation));
        sb.append(", body: ");
        sb.append(RecordUtils.fieldToString(this.body));
        sb.append(", flags: ");
        sb.append(RecordUtils.fieldToString(Integer.valueOf(this.flags)));
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }

    private HttpRequest(@NonNull HttpMethod httpMethod, @NonNull String str, @NonNull HashMap<String, String> hashMap, long j, @NonNull NetworkRestriction networkRestriction, @NonNull SdkInformation sdkInformation, @Nullable byte[] bArr, int i) {
        this.method = httpMethod;
        this.url = str;
        this.headers = hashMap;
        this.timeout = j;
        this.networkRestriction = networkRestriction;
        this.sdkInformation = sdkInformation;
        this.body = bArr;
        this.flags = i;
    }
}
