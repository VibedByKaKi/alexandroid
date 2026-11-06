package com.amazon.alexa.accessory.registration;

import com.amazon.alexa.accessory.internal.util.JsonObjectSerializable;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import java.util.Collections;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class ThirdPartyDevice implements JsonObjectSerializable {
    private static final String DEVICE_SERIAL_NUMBER_KEY = "deviceSerialNumber";
    private static final String DEVICE_TYPE_KEY = "amazonDeviceTypeId";
    public static final Factory FACTORY = new Factory();
    private static final String PRODUCT_INSTANCE_ATTRIBUTES_KEY = "productInstanceAttributes";
    private final String deviceType;
    private final Map<String, String> productInstanceAttributes;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Factory implements JsonObjectSerializable.Factory<ThirdPartyDevice> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable.Factory
        public ThirdPartyDevice create(JSONObject jSONObject) throws JSONException {
            return new ThirdPartyDevice(jSONObject.getJSONObject(ThirdPartyDevice.PRODUCT_INSTANCE_ATTRIBUTES_KEY).getString("deviceSerialNumber"), jSONObject.getString(ThirdPartyDevice.DEVICE_TYPE_KEY));
        }
    }

    public ThirdPartyDevice(String str, String str2) {
        Preconditions.notNull(str, "deviceSerialNumber");
        Preconditions.notNull(str2, "deviceType");
        this.productInstanceAttributes = Collections.singletonMap("deviceSerialNumber", str);
        this.deviceType = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ThirdPartyDevice.class != obj.getClass()) {
            return false;
        }
        ThirdPartyDevice thirdPartyDevice = (ThirdPartyDevice) obj;
        if (this.deviceType.equals(thirdPartyDevice.deviceType)) {
            return this.productInstanceAttributes.equals(thirdPartyDevice.productInstanceAttributes);
        }
        return false;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    public int hashCode() {
        return this.productInstanceAttributes.hashCode() + (this.deviceType.hashCode() * 31);
    }

    @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable
    public JSONObject toJsonObject() throws JSONException {
        JSONObject put = new JSONObject().put(DEVICE_TYPE_KEY, this.deviceType);
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : this.productInstanceAttributes.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        put.put(PRODUCT_INSTANCE_ATTRIBUTES_KEY, jSONObject);
        return put;
    }
}
