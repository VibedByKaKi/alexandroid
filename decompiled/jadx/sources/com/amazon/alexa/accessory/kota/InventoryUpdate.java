package com.amazon.alexa.accessory.kota;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.internal.util.JsonObjectSerializable;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.kota.BinaryMetadata;
import com.amazon.alexa.accessory.kota.SoftwareComponent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class InventoryUpdate implements JsonObjectSerializable {
    private static final String JSON_BINARY_METADATA = "binaryMetadata";
    private static final String JSON_DESCRIPTION = "description";
    private static final String JSON_FORCE = "force";
    private static final String JSON_MIME_TYPE = "mimeType";
    private static final String JSON_SOFTWARE_COMPONENT = "softwareComponent";
    private static final String JSON_TARGET_SOFTWARE_COMPONENT_VERSION_CODE = "targetSoftwareComponentVersionCode";
    private static final String JSON_URL = "url";
    public static final InventoryUpdate NONE = new Builder().mimeType("").description("").binaryMetadata(new BinaryMetadata.Builder().binaryType("").md5Sum("").build()).softwareComponent(new SoftwareComponent.Builder().softwareComponentId("").softwareComponentType("").build()).url("").build();
    private final BinaryMetadata binaryMetadata;
    private final String description;
    private final boolean force;
    private final String mimeType;
    private final SoftwareComponent softwareComponent;
    private final int targetSoftwareComponentVersionCode;
    private final String url;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        BinaryMetadata binaryMetadata;
        String description;
        boolean force;
        String mimeType;
        SoftwareComponent softwareComponent;
        int targetSoftwareComponentVersionCode;
        String url;

        public Builder binaryMetadata(BinaryMetadata binaryMetadata) {
            this.binaryMetadata = binaryMetadata;
            return this;
        }

        public InventoryUpdate build() {
            Preconditions.notNull(this.description, "description");
            Preconditions.notNull(this.softwareComponent, InventoryUpdate.JSON_SOFTWARE_COMPONENT);
            Preconditions.notNull(this.binaryMetadata, InventoryUpdate.JSON_BINARY_METADATA);
            Preconditions.notNull(this.mimeType, "mimeType");
            return new InventoryUpdate(this);
        }

        public Builder description(String str) {
            this.description = str;
            return this;
        }

        public Builder force(boolean z) {
            this.force = z;
            return this;
        }

        public Builder mimeType(String str) {
            this.mimeType = str;
            return this;
        }

        public Builder softwareComponent(SoftwareComponent softwareComponent) {
            this.softwareComponent = softwareComponent;
            return this;
        }

        public Builder targetSoftwareComponentVersionCode(int i) {
            this.targetSoftwareComponentVersionCode = i;
            return this;
        }

        public Builder url(String str) {
            this.url = str;
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class JsonFactory implements JsonObjectSerializable.Factory<InventoryUpdate> {
        private final SoftwareComponent.JsonFactory softwareComponentFactory = new SoftwareComponent.JsonFactory();
        private final BinaryMetadata.JsonFactory binaryMetadataFactory = new BinaryMetadata.JsonFactory();

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable.Factory
        public InventoryUpdate create(JSONObject jSONObject) throws JSONException {
            return new Builder().binaryMetadata(this.binaryMetadataFactory.create(jSONObject.getJSONObject(InventoryUpdate.JSON_BINARY_METADATA))).description(jSONObject.getString("description")).force(jSONObject.getBoolean("force")).mimeType(jSONObject.getString("mimeType")).softwareComponent(this.softwareComponentFactory.create(jSONObject.getJSONObject(InventoryUpdate.JSON_SOFTWARE_COMPONENT))).targetSoftwareComponentVersionCode(jSONObject.getInt(InventoryUpdate.JSON_TARGET_SOFTWARE_COMPONENT_VERSION_CODE)).url(jSONObject.getString("url")).build();
        }
    }

    public InventoryUpdate(Builder builder) {
        this.description = builder.description;
        this.force = builder.force;
        this.mimeType = builder.mimeType;
        this.softwareComponent = builder.softwareComponent;
        this.binaryMetadata = builder.binaryMetadata;
        this.targetSoftwareComponentVersionCode = builder.targetSoftwareComponentVersionCode;
        this.url = builder.url;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InventoryUpdate.class != obj.getClass()) {
            return false;
        }
        InventoryUpdate inventoryUpdate = (InventoryUpdate) obj;
        if (this.force == inventoryUpdate.force && this.targetSoftwareComponentVersionCode == inventoryUpdate.targetSoftwareComponentVersionCode && this.description.equals(inventoryUpdate.description) && this.mimeType.equals(inventoryUpdate.mimeType) && this.softwareComponent.equals(inventoryUpdate.softwareComponent) && this.binaryMetadata.equals(inventoryUpdate.binaryMetadata)) {
            return this.url.equals(inventoryUpdate.url);
        }
        return false;
    }

    public BinaryMetadata getBinaryMetadata() {
        return this.binaryMetadata;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean getForce() {
        return this.force;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public SoftwareComponent getSoftwareComponent() {
        return this.softwareComponent;
    }

    public int getTargetSoftwareComponentVersionCode() {
        return this.targetSoftwareComponentVersionCode;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode() + ((((this.binaryMetadata.hashCode() + ((this.softwareComponent.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(((this.description.hashCode() * 31) + (this.force ? 1 : 0)) * 31, 31, this.mimeType)) * 31)) * 31) + this.targetSoftwareComponentVersionCode) * 31);
    }

    @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable
    public JSONObject toJsonObject() throws JSONException {
        return new JSONObject().put("description", this.description).put("force", this.force).put("mimeType", this.mimeType).put(JSON_SOFTWARE_COMPONENT, this.softwareComponent.toJsonObject()).put(JSON_BINARY_METADATA, this.binaryMetadata.toJsonObject()).put(JSON_TARGET_SOFTWARE_COMPONENT_VERSION_CODE, this.targetSoftwareComponentVersionCode).put("url", this.url);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InventoryUpdate{description='");
        sb.append(this.description);
        sb.append("', force=");
        sb.append(this.force);
        sb.append(", mimeType='");
        sb.append(this.mimeType);
        sb.append("', softwareComponent=");
        sb.append(this.softwareComponent);
        sb.append(", binaryMetadata=");
        sb.append(this.binaryMetadata);
        sb.append(", targetSoftwareComponentVersionCode=");
        sb.append(this.targetSoftwareComponentVersionCode);
        sb.append(", url='");
        return a$$ExternalSyntheticOutline0.m(sb, this.url, "'}");
    }
}
