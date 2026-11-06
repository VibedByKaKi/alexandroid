package com.mapbox.maps;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes8.dex */
public final class OfflineRegionError implements Serializable {
    private final boolean isFatal;

    @NonNull
    private final String message;

    @Nullable
    private final Date retryAfter;

    @NonNull
    private final OfflineRegionErrorType type;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public OfflineRegionError(@NonNull OfflineRegionErrorType offlineRegionErrorType, @NonNull String str, boolean z, @Nullable Date date) {
        this.type = offlineRegionErrorType;
        this.message = str;
        this.isFatal = z;
        this.retryAfter = date;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OfflineRegionError.class != obj.getClass()) {
            return false;
        }
        OfflineRegionError offlineRegionError = (OfflineRegionError) obj;
        return Objects.equals(this.type, offlineRegionError.type) && Objects.equals(this.message, offlineRegionError.message) && this.isFatal == offlineRegionError.isFatal && Objects.equals(this.retryAfter, offlineRegionError.retryAfter);
    }

    public boolean getIsFatal() {
        return this.isFatal;
    }

    @NonNull
    public String getMessage() {
        return this.message;
    }

    @Nullable
    public Date getRetryAfter() {
        return this.retryAfter;
    }

    @NonNull
    public OfflineRegionErrorType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.type, this.message, Boolean.valueOf(this.isFatal), this.retryAfter);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[type: ");
        sb.append(RecordUtils.fieldToString(this.type));
        sb.append(", message: ");
        RegionDefaults$$ExternalSyntheticOutline0.m23764m(this.message, ", isFatal: ", sb);
        sb.append(RecordUtils.fieldToString(Boolean.valueOf(this.isFatal)));
        sb.append(", retryAfter: ");
        sb.append(RecordUtils.fieldToString(this.retryAfter));
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }
}
