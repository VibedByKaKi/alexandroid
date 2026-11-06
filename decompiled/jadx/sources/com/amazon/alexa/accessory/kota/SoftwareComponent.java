package com.amazon.alexa.accessory.kota;

import com.amazon.alexa.accessory.internal.util.JsonObjectSerializable;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class SoftwareComponent implements JsonObjectSerializable {
    private static final String JSON_SOFTWARE_COMPONENT_ID = "softwareComponentId";
    private static final String JSON_SOFTWARE_COMPONENT_TYPE = "softwareComponentType";
    private final String softwareComponentId;
    private final String softwareComponentType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        String softwareComponentId;
        String softwareComponentType;

        public SoftwareComponent build() {
            Preconditions.notNull(this.softwareComponentType, SoftwareComponent.JSON_SOFTWARE_COMPONENT_TYPE);
            Preconditions.notNull(this.softwareComponentId, SoftwareComponent.JSON_SOFTWARE_COMPONENT_ID);
            return new SoftwareComponent(this);
        }

        public Builder softwareComponentId(String str) {
            this.softwareComponentId = str;
            return this;
        }

        public Builder softwareComponentType(String str) {
            this.softwareComponentType = str;
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class JsonBuilder implements JsonObjectSerializable.Factory<SoftwareComponent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable.Factory
        public SoftwareComponent create(JSONObject jSONObject) throws JSONException {
            return new Builder().softwareComponentId(jSONObject.getString(SoftwareComponent.JSON_SOFTWARE_COMPONENT_ID)).softwareComponentType(jSONObject.getString(SoftwareComponent.JSON_SOFTWARE_COMPONENT_TYPE)).build();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class JsonFactory implements JsonObjectSerializable.Factory<SoftwareComponent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable.Factory
        public SoftwareComponent create(JSONObject jSONObject) throws JSONException {
            return new Builder().softwareComponentId(jSONObject.getString(SoftwareComponent.JSON_SOFTWARE_COMPONENT_ID)).softwareComponentType(jSONObject.getString(SoftwareComponent.JSON_SOFTWARE_COMPONENT_TYPE)).build();
        }
    }

    public SoftwareComponent(Builder builder) {
        this.softwareComponentId = builder.softwareComponentId;
        this.softwareComponentType = builder.softwareComponentType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SoftwareComponent.class == obj.getClass()) {
            SoftwareComponent softwareComponent = (SoftwareComponent) obj;
            if (Objects.equals(this.softwareComponentId, softwareComponent.softwareComponentId) && Objects.equals(this.softwareComponentType, softwareComponent.softwareComponentType)) {
                return true;
            }
        }
        return false;
    }

    public String getSoftwareComponentId() {
        return this.softwareComponentId;
    }

    public String getSoftwareComponentType() {
        return this.softwareComponentType;
    }

    public int hashCode() {
        return Objects.hash(this.softwareComponentId, this.softwareComponentType);
    }

    @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable
    public JSONObject toJsonObject() throws JSONException {
        return new JSONObject().put(JSON_SOFTWARE_COMPONENT_ID, this.softwareComponentId).put(JSON_SOFTWARE_COMPONENT_TYPE, this.softwareComponentType);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SoftwareComponent{softwareComponentId='");
        sb.append(this.softwareComponentId);
        sb.append("', softwareComponentType='");
        return a$$ExternalSyntheticOutline0.m(sb, this.softwareComponentType, "'}");
    }
}
