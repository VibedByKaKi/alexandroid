package com.amazon.alexa.accessory.nearmiss;

import com.amazon.alexa.accessory.internal.util.JsonObjectSerializable;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import defpackage.a$$ExternalSyntheticOutline0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class Format implements JsonObjectSerializable {
    public static final String ALEXA_WWNM_METADATA = "ALEXA_WWNM_METADATA";
    private final String name;
    private final int version;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        public String name;
        public int version;

        public Format build() {
            Preconditions.notNull(this.name, "name");
            return new Format(this);
        }

        public Builder name(String str) {
            this.name = str;
            return this;
        }

        public Builder version(int i) {
            this.version = i;
            return this;
        }
    }

    public Format(Builder builder) {
        Preconditions.notNull(builder, "builder");
        this.version = builder.version;
        this.name = builder.name;
    }

    public String getName() {
        return this.name;
    }

    public int getVersion() {
        return this.version;
    }

    @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable
    public JSONObject toJsonObject() throws JSONException {
        return new JSONObject().put("version", 1).put("name", ALEXA_WWNM_METADATA);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Format{version=");
        sb.append(this.version);
        sb.append(", name='");
        return a$$ExternalSyntheticOutline0.m(sb, this.name, "'}");
    }
}
