package com.amazon.alexa.accessorykit.interprocess.mobilytics;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.amazon.alexa.accessory.internal.util.JsonObjectSerializable;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.mobilytics.identity.MobilyticsDevice;
import defpackage.a$$ExternalSyntheticOutline0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AccessoryMobilyticsDevice implements JsonObjectSerializable, MobilyticsDevice {
    private static final String MOBILYTICS_DEVICE_SERIAL_NUMBER_KEY = "mobilyticsDeviceSerialNumber";
    private static final String MOBILYTICS_DEVICE_TYPE_KEY = "mobilyticsDeviceType";
    final String mobilyticsDeviceSerialNumber;
    final String mobilyticsDeviceType;
    public static final AccessoryMobilyticsDevice UNKNOWN = new AccessoryMobilyticsDevice();
    public static final JsonObjectSerializable.Factory<AccessoryMobilyticsDevice> FACTORY = new Factory(0);

    public AccessoryMobilyticsDevice(@NonNull String str, @NonNull String str2) {
        Preconditions.precondition(!TextUtils.isEmpty(str), "mobilyticsDeviceType cannot be empty");
        Preconditions.precondition(!TextUtils.isEmpty(str2), "mobilyticsDeviceSerialNumber cannot be empty");
        this.mobilyticsDeviceType = str;
        this.mobilyticsDeviceSerialNumber = str2;
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsDevice
    public String deviceSerialNumber() {
        return this.mobilyticsDeviceSerialNumber;
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsDevice
    public String deviceType() {
        return this.mobilyticsDeviceType;
    }

    public boolean equals(Object obj) {
        return true;
    }

    public int hashCode() {
        return 0;
    }

    @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable
    public JSONObject toJsonObject() throws JSONException {
        return new JSONObject().put(MOBILYTICS_DEVICE_TYPE_KEY, this.mobilyticsDeviceType).put(MOBILYTICS_DEVICE_SERIAL_NUMBER_KEY, this.mobilyticsDeviceSerialNumber);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AccessoryMobilyticsDevice{mobilyticsDeviceType='");
        sb.append(this.mobilyticsDeviceType);
        sb.append("', mobilyticsDeviceSerialNumber='");
        return a$$ExternalSyntheticOutline0.m(sb, this.mobilyticsDeviceSerialNumber, "'}");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Factory implements JsonObjectSerializable.Factory<AccessoryMobilyticsDevice> {
        public /* synthetic */ Factory(int i) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable.Factory
        public AccessoryMobilyticsDevice create(JSONObject jSONObject) throws JSONException {
            return new AccessoryMobilyticsDevice(jSONObject.getString(AccessoryMobilyticsDevice.MOBILYTICS_DEVICE_TYPE_KEY), jSONObject.getString(AccessoryMobilyticsDevice.MOBILYTICS_DEVICE_SERIAL_NUMBER_KEY));
        }

        private Factory() {
        }
    }

    private AccessoryMobilyticsDevice() {
        this("Unknown", "Unknown");
    }
}
