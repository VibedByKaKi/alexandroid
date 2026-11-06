package com.mapbox.common.location;

import androidx.annotation.NonNull;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class LocationError implements Serializable {

    @NonNull
    private final LocationErrorCode code;

    @NonNull
    private final String message;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public LocationError(@NonNull LocationErrorCode locationErrorCode, @NonNull String str) {
        this.code = locationErrorCode;
        this.message = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LocationError locationError = (LocationError) obj;
        return Objects.equals(this.code, locationError.code) && Objects.equals(this.message, locationError.message);
    }

    @NonNull
    public LocationErrorCode getCode() {
        return this.code;
    }

    @NonNull
    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return Objects.hash(this.code, this.message);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[code: ");
        sb.append(RecordUtils.fieldToString(this.code));
        sb.append(", message: ");
        return RegionDefaults$$ExternalSyntheticOutline0.m(this.message, MarkdownConstants.RIGHT_BRACKET, sb);
    }
}
