package com.amazon.alexa.accessory.kota;

import com.amazon.alexa.accessory.internal.util.JsonObjectSerializable;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.kota.InventoryUpdate;
import com.amazon.alexa.accessory.kota.UpdateRequest;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class InventoryUpdateBundle implements JsonObjectSerializable {
    private static final String JSON_INVENTORY_UPDATE = "inventory_update";
    private static final String JSON_UPDATE_REQUEST = "update_request";
    private final InventoryUpdate inventoryUpdate;
    private final UpdateRequest updateRequest;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        InventoryUpdate inventoryUpdate;
        UpdateRequest updateRequest;

        public InventoryUpdateBundle build() {
            Preconditions.notNull(this.inventoryUpdate, KotaJobSchedulerService.INVENTORY_UPDATE_KEY);
            Preconditions.notNull(this.updateRequest, KotaJobSchedulerService.UPDATE_REQUEST_KEY);
            return new InventoryUpdateBundle(this);
        }

        public Builder inventoryUpdate(InventoryUpdate inventoryUpdate) {
            this.inventoryUpdate = inventoryUpdate;
            return this;
        }

        public Builder updateRequest(UpdateRequest updateRequest) {
            this.updateRequest = updateRequest;
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class JsonFactory implements JsonObjectSerializable.Factory<InventoryUpdateBundle> {
        private final InventoryUpdate.JsonFactory inventoryUpdateFactory = new InventoryUpdate.JsonFactory();
        private final UpdateRequest.JsonBuilder updateRequestFactory = new UpdateRequest.JsonBuilder();

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable.Factory
        public InventoryUpdateBundle create(JSONObject jSONObject) throws JSONException {
            return new Builder().inventoryUpdate(this.inventoryUpdateFactory.create(jSONObject.getJSONObject(InventoryUpdateBundle.JSON_INVENTORY_UPDATE))).updateRequest(this.updateRequestFactory.create(jSONObject.getJSONObject(InventoryUpdateBundle.JSON_UPDATE_REQUEST))).build();
        }
    }

    public InventoryUpdateBundle(Builder builder) {
        this.inventoryUpdate = builder.inventoryUpdate;
        this.updateRequest = builder.updateRequest;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InventoryUpdateBundle.class != obj.getClass()) {
            return false;
        }
        InventoryUpdateBundle inventoryUpdateBundle = (InventoryUpdateBundle) obj;
        if (this.inventoryUpdate.equals(inventoryUpdateBundle.inventoryUpdate)) {
            return this.updateRequest.equals(inventoryUpdateBundle.updateRequest);
        }
        return false;
    }

    public InventoryUpdate getInventoryUpdate() {
        return this.inventoryUpdate;
    }

    public UpdateRequest getUpdateRequest() {
        return this.updateRequest;
    }

    public int hashCode() {
        return this.updateRequest.hashCode() + (this.inventoryUpdate.hashCode() * 31);
    }

    @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable
    public JSONObject toJsonObject() throws JSONException {
        return new JSONObject().put(JSON_INVENTORY_UPDATE, this.inventoryUpdate.toJsonObject()).put(JSON_UPDATE_REQUEST, this.updateRequest.toJsonObject());
    }

    public String toString() {
        return "InventoryUpdateBundle{inventoryUpdate='" + this.inventoryUpdate + "', updateRequest='" + this.updateRequest + "'}";
    }
}
