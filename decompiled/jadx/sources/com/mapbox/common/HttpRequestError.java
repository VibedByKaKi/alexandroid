package com.mapbox.common;

import androidx.annotation.NonNull;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class HttpRequestError implements Serializable {

    @NonNull
    private final String message;

    @NonNull
    private final HttpRequestErrorType type;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public HttpRequestError(@NonNull HttpRequestErrorType httpRequestErrorType, @NonNull String str) {
        this.type = httpRequestErrorType;
        this.message = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpRequestError httpRequestError = (HttpRequestError) obj;
        return Objects.equals(this.type, httpRequestError.type) && Objects.equals(this.message, httpRequestError.message);
    }

    @NonNull
    public String getMessage() {
        return this.message;
    }

    @NonNull
    public HttpRequestErrorType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.type, this.message);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[type: ");
        sb.append(RecordUtils.fieldToString(this.type));
        sb.append(", message: ");
        return RegionDefaults$$ExternalSyntheticOutline0.m(this.message, MarkdownConstants.RIGHT_BRACKET, sb);
    }
}
