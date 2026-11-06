package com.amazon.alexa.accessory.kota;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.internal.util.JsonObjectSerializable;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class Inventory implements JsonObjectSerializable {
    private String softwareComponentId;
    private int softwareComponentVersionCode;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        String softwareComponentId;
        int softwareComponentVersionCode;

        public Inventory build() {
            Preconditions.notNull(this.softwareComponentId, "softwareComponentId");
            return new Inventory(this);
        }

        public Builder softwareComponentId(String str) {
            this.softwareComponentId = str;
            return this;
        }

        public Builder softwareComponentVersionCode(int i) {
            this.softwareComponentVersionCode = i;
            return this;
        }
    }

    public Inventory(Builder builder) {
        this.softwareComponentId = builder.softwareComponentId;
        this.softwareComponentVersionCode = builder.softwareComponentVersionCode;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Inventory.class != obj.getClass()) {
            return false;
        }
        Inventory inventory = (Inventory) obj;
        if (this.softwareComponentVersionCode != inventory.softwareComponentVersionCode) {
            return false;
        }
        return this.softwareComponentId.equals(inventory.softwareComponentId);
    }

    public String getSoftwareComponentId() {
        return this.softwareComponentId;
    }

    public int getSoftwareComponentVersionCode() {
        return this.softwareComponentVersionCode;
    }

    public int hashCode() {
        return (this.softwareComponentId.hashCode() * 31) + this.softwareComponentVersionCode;
    }

    @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable
    public JSONObject toJsonObject() throws JSONException {
        return new JSONObject().put("softwareComponentId", this.softwareComponentId).put("softwareComponentVersionCode", this.softwareComponentVersionCode);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Inventory{softwareComponentId='");
        sb.append(this.softwareComponentId);
        sb.append("', softwareComponentVersionCode=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.softwareComponentVersionCode, AbstractJsonLexerKt.END_OBJ);
    }
}
