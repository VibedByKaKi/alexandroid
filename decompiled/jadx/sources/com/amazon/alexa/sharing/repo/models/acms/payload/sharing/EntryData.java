package com.amazon.alexa.sharing.repo.models.acms.payload.sharing;

import com.amazon.alexa.sharing.repo.models.acms.payload.sharing.enums.EntryDataType;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class EntryData {
    private EntryDataType type;
    private URLHolder url;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            EntryData entryData = (EntryData) obj;
            if (this.type == entryData.type && Objects.equals(this.url, entryData.url)) {
                return true;
            }
        }
        return false;
    }

    public EntryDataType getType() {
        return this.type;
    }

    public URLHolder getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Objects.hash(this.type, this.url);
    }

    public void setType(EntryDataType entryDataType) {
        this.type = entryDataType;
    }

    public void setUrl(URLHolder uRLHolder) {
        this.url = uRLHolder;
    }

    public String toString() {
        return "EntryData{type=" + this.type + ", url=" + this.url + AbstractJsonLexerKt.END_OBJ;
    }
}
