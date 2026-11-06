package com.amazon.alexa.accessory.registration;

import com.amazon.alexa.accessory.internal.util.JsonObjectSerializable;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.assistant.transport.MissingTokenPull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class DeregisterAssociatedDeviceV2Request implements JsonObjectSerializable {
    private final DeviceDeregistrationRequest request;

    public DeregisterAssociatedDeviceV2Request(DeviceDeregistrationRequest deviceDeregistrationRequest) {
        Preconditions.notNull(deviceDeregistrationRequest, MissingTokenPull.TRIGGER_REQUEST);
        this.request = deviceDeregistrationRequest;
    }

    @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable
    public JSONObject toJsonObject() throws JSONException {
        return new JSONObject().put("parameters", this.request.toJsonObject());
    }
}
