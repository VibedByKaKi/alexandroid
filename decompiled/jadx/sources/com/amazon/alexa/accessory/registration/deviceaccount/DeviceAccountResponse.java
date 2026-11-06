package com.amazon.alexa.accessory.registration.deviceaccount;

import com.amazon.alexa.accessory.internal.util.JsonObjectSerializable;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class DeviceAccountResponse implements JsonObjectSerializable {
    private static final String DEVICE_ACCOUNT_ID_KEY = "deviceAccountId";
    public static final Factory FACTORY = new Factory();
    private final String deviceAccountId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Factory implements JsonObjectSerializable.Factory<DeviceAccountResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable.Factory
        public DeviceAccountResponse create(JSONObject jSONObject) throws JSONException {
            return new DeviceAccountResponse(jSONObject.getString("deviceAccountId"));
        }
    }

    public DeviceAccountResponse(String str) {
        Preconditions.notNull(str, "deviceAccountId");
        this.deviceAccountId = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.deviceAccountId, ((DeviceAccountResponse) obj).getDeviceAccountId());
    }

    public String getDeviceAccountId() {
        return this.deviceAccountId;
    }

    public int hashCode() {
        return Objects.hash(this.deviceAccountId);
    }

    @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable
    public JSONObject toJsonObject() throws JSONException {
        return new JSONObject().put("deviceAccountId", this.deviceAccountId);
    }
}
