package com.mapbox.common;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public class PersistentStorageData implements Serializable {

    @NonNull
    private final String key;

    @NonNull
    private final Date timestamp;

    @NonNull
    private final DataRef value;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public PersistentStorageData(@NonNull String str, @NonNull Date date, @NonNull DataRef dataRef) {
        this.key = str;
        this.timestamp = date;
        this.value = dataRef;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PersistentStorageData persistentStorageData = (PersistentStorageData) obj;
        return Objects.equals(this.key, persistentStorageData.key) && Objects.equals(this.timestamp, persistentStorageData.timestamp) && Objects.equals(this.value, persistentStorageData.value);
    }

    @NonNull
    public String getKey() {
        return this.key;
    }

    @NonNull
    public Date getTimestamp() {
        return this.timestamp;
    }

    @NonNull
    public DataRef getValue() {
        return this.value;
    }

    public int hashCode() {
        return Objects.hash(this.key, this.timestamp, this.value);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[key: ");
        RegionDefaults$$ExternalSyntheticOutline0.m23764m(this.key, ", timestamp: ", sb);
        sb.append(RecordUtils.fieldToString(this.timestamp));
        sb.append(", value: ");
        sb.append(RecordUtils.fieldToString(this.value));
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }
}
