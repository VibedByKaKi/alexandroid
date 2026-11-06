package org.chromium.net.apihelpers;

import androidx.annotation.Nullable;
import java.util.Objects;
import org.chromium.net.UrlResponseInfo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class CronetResponse<T> {

    @Nullable
    private final T mResponseBody;
    private final UrlResponseInfo mUrlResponseInfo;

    public CronetResponse(UrlResponseInfo urlResponseInfo, @Nullable T t) {
        this.mUrlResponseInfo = urlResponseInfo;
        this.mResponseBody = t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CronetResponse)) {
            return false;
        }
        CronetResponse cronetResponse = (CronetResponse) obj;
        return Objects.equals(this.mUrlResponseInfo, cronetResponse.mUrlResponseInfo) && Objects.equals(this.mResponseBody, cronetResponse.mResponseBody);
    }

    @Nullable
    public T getResponseBody() {
        return this.mResponseBody;
    }

    public UrlResponseInfo getUrlResponseInfo() {
        return this.mUrlResponseInfo;
    }

    public int hashCode() {
        return Objects.hash(this.mUrlResponseInfo, this.mResponseBody);
    }
}
