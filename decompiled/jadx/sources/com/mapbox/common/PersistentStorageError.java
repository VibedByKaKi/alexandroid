package com.mapbox.common;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public class PersistentStorageError implements Serializable {

    @NonNull
    private final PersistentStorageErrorCode code;

    @NonNull
    private final String message;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public PersistentStorageError(@NonNull PersistentStorageErrorCode persistentStorageErrorCode, @NonNull String str) {
        this.code = persistentStorageErrorCode;
        this.message = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PersistentStorageError persistentStorageError = (PersistentStorageError) obj;
        return Objects.equals(this.code, persistentStorageError.code) && Objects.equals(this.message, persistentStorageError.message);
    }

    @NonNull
    public PersistentStorageErrorCode getCode() {
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
