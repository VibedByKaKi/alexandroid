package com.mapbox.common.experimental.wss_backend;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import com.mapbox.common.ReadStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public class ResponseData implements Serializable {
    private final int code;

    @NonNull
    private final ReadStream dataStream;

    @NonNull
    private final HashMap<String, String> headers;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public ResponseData(@NonNull HashMap<String, String> hashMap, int i, @NonNull ReadStream readStream) {
        this.headers = hashMap;
        this.code = i;
        this.dataStream = readStream;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResponseData responseData = (ResponseData) obj;
        return Objects.equals(this.headers, responseData.headers) && this.code == responseData.code && Objects.equals(this.dataStream, responseData.dataStream);
    }

    public int getCode() {
        return this.code;
    }

    @NonNull
    public ReadStream getDataStream() {
        return this.dataStream;
    }

    @NonNull
    public HashMap<String, String> getHeaders() {
        return this.headers;
    }

    public int hashCode() {
        return Objects.hash(this.headers, Integer.valueOf(this.code), this.dataStream);
    }

    public String toString() {
        return "[headers: " + RecordUtils.fieldToString(this.headers) + ", code: " + RecordUtils.fieldToString(Integer.valueOf(this.code)) + ", dataStream: " + RecordUtils.fieldToString(this.dataStream) + MarkdownConstants.RIGHT_BRACKET;
    }
}
