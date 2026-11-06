package org.codehaus.jackson;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class JsonLocation implements Serializable {
    public static final JsonLocation NA = new JsonLocation("N/A", -1, -1, -1, -1);
    private static final long serialVersionUID = 1;
    final int _columnNr;
    final int _lineNr;
    final Object _sourceRef;
    final long _totalBytes;
    final long _totalChars;

    @JsonCreator
    public JsonLocation(@JsonProperty("sourceRef") Object obj, @JsonProperty("byteOffset") long j, @JsonProperty("charOffset") long j2, @JsonProperty("lineNr") int i, @JsonProperty("columnNr") int i2) {
        this._sourceRef = obj;
        this._totalBytes = j;
        this._totalChars = j2;
        this._lineNr = i;
        this._columnNr = i2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof JsonLocation)) {
            return false;
        }
        JsonLocation jsonLocation = (JsonLocation) obj;
        Object obj2 = this._sourceRef;
        Object obj3 = jsonLocation._sourceRef;
        if (obj2 == null) {
            if (obj3 != null) {
                return false;
            }
        } else if (!obj2.equals(obj3)) {
            return false;
        }
        return this._lineNr == jsonLocation._lineNr && this._columnNr == jsonLocation._columnNr && this._totalChars == jsonLocation._totalChars && getByteOffset() == jsonLocation.getByteOffset();
    }

    public long getByteOffset() {
        return this._totalBytes;
    }

    public long getCharOffset() {
        return this._totalChars;
    }

    public int getColumnNr() {
        return this._columnNr;
    }

    public int getLineNr() {
        return this._lineNr;
    }

    public Object getSourceRef() {
        return this._sourceRef;
    }

    public int hashCode() {
        Object obj = this._sourceRef;
        return ((((obj == null ? 1 : obj.hashCode()) ^ this._lineNr) + this._columnNr) ^ ((int) this._totalChars)) + ((int) this._totalBytes);
    }

    public String toString() {
        StringBuilder m = ParcelCompat$$ExternalSyntheticOutline0.m(80, "[Source: ");
        Object obj = this._sourceRef;
        if (obj == null) {
            m.append("UNKNOWN");
        } else {
            m.append(obj.toString());
        }
        m.append("; line: ");
        m.append(this._lineNr);
        m.append(", column: ");
        return ErrorUtils$$ExternalSyntheticOutline0.m(m, this._columnNr, AbstractJsonLexerKt.END_LIST);
    }

    public JsonLocation(Object obj, long j, int i, int i2) {
        this(obj, -1L, j, i, i2);
    }
}
