package com.amazon.alexa.accessory.registration.deviceaccount;

import com.amazon.alexa.accessory.internal.util.JsonObjectSerializable;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class DeviceAccount implements JsonObjectSerializable {
    private static final String DEVICE_ACCOUNT_REQUEST_KEY = "deviceAccountRequest";
    private static final String DEVICE_ACCOUNT_RESPONSE_KEY = "deviceAccountResponse";
    public static final Factory FACTORY = new Factory(DeviceAccountRequest.FACTORY, DeviceAccountResponse.FACTORY);
    private final DeviceAccountRequest deviceAccountRequest;
    private final DeviceAccountResponse deviceAccountResponse;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Factory implements JsonObjectSerializable.Factory<DeviceAccount> {
        private final JsonObjectSerializable.Factory<DeviceAccountRequest> deviceAccountRequestFactory;
        private final JsonObjectSerializable.Factory<DeviceAccountResponse> deviceAccountResponseFactory;

        public Factory(JsonObjectSerializable.Factory<DeviceAccountRequest> factory, JsonObjectSerializable.Factory<DeviceAccountResponse> factory2) {
            this.deviceAccountRequestFactory = factory;
            this.deviceAccountResponseFactory = factory2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable.Factory
        public DeviceAccount create(JSONObject jSONObject) throws JSONException {
            return new DeviceAccount(this.deviceAccountRequestFactory.create(jSONObject.getJSONObject(DeviceAccount.DEVICE_ACCOUNT_REQUEST_KEY)), this.deviceAccountResponseFactory.create(jSONObject.getJSONObject(DeviceAccount.DEVICE_ACCOUNT_RESPONSE_KEY)));
        }
    }

    public DeviceAccount(DeviceAccountRequest deviceAccountRequest, DeviceAccountResponse deviceAccountResponse) {
        Preconditions.notNull(deviceAccountRequest, DEVICE_ACCOUNT_REQUEST_KEY);
        Preconditions.notNull(deviceAccountResponse, DEVICE_ACCOUNT_RESPONSE_KEY);
        this.deviceAccountRequest = deviceAccountRequest;
        this.deviceAccountResponse = deviceAccountResponse;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DeviceAccount deviceAccount = (DeviceAccount) obj;
            if (Objects.equals(this.deviceAccountRequest, deviceAccount.getDeviceAccountRequest()) && Objects.equals(this.deviceAccountResponse, deviceAccount.getDeviceAccountResponse())) {
                return true;
            }
        }
        return false;
    }

    public DeviceAccountRequest getDeviceAccountRequest() {
        return this.deviceAccountRequest;
    }

    public DeviceAccountResponse getDeviceAccountResponse() {
        return this.deviceAccountResponse;
    }

    public int hashCode() {
        return Objects.hash(this.deviceAccountRequest, this.deviceAccountResponse);
    }

    @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable
    public JSONObject toJsonObject() throws JSONException {
        return new JSONObject().put(DEVICE_ACCOUNT_REQUEST_KEY, this.deviceAccountRequest.toJsonObject()).put(DEVICE_ACCOUNT_RESPONSE_KEY, this.deviceAccountResponse.toJsonObject());
    }
}
