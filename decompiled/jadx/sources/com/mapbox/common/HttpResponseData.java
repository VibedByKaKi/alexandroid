package com.mapbox.common;

import androidx.annotation.NonNull;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class HttpResponseData implements Serializable {
    private final int code;

    @NonNull
    private final byte[] data;

    @NonNull
    private final HashMap<String, String> headers;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public HttpResponseData(@NonNull HashMap<String, String> hashMap, int i, @NonNull byte[] bArr) {
        this.headers = hashMap;
        this.code = i;
        this.data = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpResponseData httpResponseData = (HttpResponseData) obj;
        return Objects.equals(this.headers, httpResponseData.headers) && this.code == httpResponseData.code && Arrays.equals(this.data, httpResponseData.data);
    }

    public int getCode() {
        return this.code;
    }

    @NonNull
    public byte[] getData() {
        return this.data;
    }

    @NonNull
    public HashMap<String, String> getHeaders() {
        return this.headers;
    }

    public int hashCode() {
        return Objects.hash(this.headers, Integer.valueOf(this.code), Integer.valueOf(Arrays.hashCode(this.data)));
    }

    public String toString() {
        return "[headers: " + RecordUtils.fieldToString(this.headers) + ", code: " + RecordUtils.fieldToString(Integer.valueOf(this.code)) + ", data: " + RecordUtils.fieldToString(this.data) + MarkdownConstants.RIGHT_BRACKET;
    }
}
