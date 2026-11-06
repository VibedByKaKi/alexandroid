package com.mapbox.common.experimental.wss_backend;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import com.mapbox.common.NetworkRestriction;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public class Request implements Serializable {
    private final int flags;

    @NonNull
    private HashMap<String, String> headers;

    @NonNull
    private final NetworkRestriction networkRestriction;
    private final long timeout;

    @NonNull
    private final String url;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {

        @NonNull
        private HashMap<String, String> headers;

        @NonNull
        private String url;
        private long timeout = 0;

        @NonNull
        private NetworkRestriction networkRestriction = NetworkRestriction.NONE;
        private int flags = 0;

        public Request build() {
            if (this.url == null) {
                Single$$ExternalSyntheticBUOutline0.m$1("url shouldn't be null");
                return null;
            }
            if (this.headers == null) {
                Single$$ExternalSyntheticBUOutline0.m$1("headers shouldn't be null");
                return null;
            }
            if (this.networkRestriction != null) {
                return new Request(this.url, this.headers, this.timeout, this.networkRestriction, this.flags);
            }
            Single$$ExternalSyntheticBUOutline0.m$1("networkRestriction shouldn't be null");
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

        public Builder networkRestriction(@NonNull NetworkRestriction networkRestriction) {
            this.networkRestriction = networkRestriction;
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

    private Request(@NonNull String str, @NonNull HashMap<String, String> hashMap) {
        this.url = str;
        this.headers = hashMap;
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
        return Objects.equals(this.url, request.url) && Objects.equals(this.headers, request.headers) && this.timeout == request.timeout && Objects.equals(this.networkRestriction, request.networkRestriction) && this.flags == request.flags;
    }

    public int getFlags() {
        return this.flags;
    }

    @NonNull
    public HashMap<String, String> getHeaders() {
        return this.headers;
    }

    @NonNull
    public NetworkRestriction getNetworkRestriction() {
        return this.networkRestriction;
    }

    public long getTimeout() {
        return this.timeout;
    }

    @NonNull
    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Objects.hash(this.url, this.headers, Long.valueOf(this.timeout), this.networkRestriction, Integer.valueOf(this.flags));
    }

    public void setHeaders(@NonNull HashMap<String, String> hashMap) {
        this.headers = hashMap;
    }

    public Builder toBuilder() {
        return new Builder().url(this.url).headers(this.headers).timeout(this.timeout).networkRestriction(this.networkRestriction).flags(this.flags);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[url: ");
        RegionDefaults$$ExternalSyntheticOutline0.m23764m(this.url, ", headers: ", sb);
        sb.append(RecordUtils.fieldToString(this.headers));
        sb.append(", timeout: ");
        RegionDefaults$$ExternalSyntheticOutline0.m(this.timeout, ", networkRestriction: ", sb);
        sb.append(RecordUtils.fieldToString(this.networkRestriction));
        sb.append(", flags: ");
        sb.append(RecordUtils.fieldToString(Integer.valueOf(this.flags)));
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }

    private Request(@NonNull String str, @NonNull HashMap<String, String> hashMap, long j, @NonNull NetworkRestriction networkRestriction, int i) {
        this.url = str;
        this.headers = hashMap;
        this.timeout = j;
        this.networkRestriction = networkRestriction;
        this.flags = i;
    }
}
