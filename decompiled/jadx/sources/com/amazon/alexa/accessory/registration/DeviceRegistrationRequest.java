package com.amazon.alexa.accessory.registration;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.internal.util.JsonObjectSerializable;
import com.amazon.alexa.accessory.internal.util.JsonUtils;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class DeviceRegistrationRequest implements JsonObjectSerializable {
    private static final String ALLOW_MULTIPLE_ACCOUNTS_KEY = "allowMultipleAccounts";
    static final String ASSOCIATED_DEVICE_RELATIONSHIP_KEY = "associatedDeviceRelationship";
    static final String ASSOCIATED_DEVICE_ROLE_KEY = "associatedDeviceRole";
    private static final String DEREGISTER_EXISTING_ACCOUNTS_KEY = "deregisterExistingAccounts";
    private static final String DEVICE_NAME_KEY = "deviceName";
    public static final Factory FACTORY = new Factory(DeviceRegistrationRequestIdentifier.FACTORY);
    private static final String SOFTWARE_VERSION_KEY = "softwareVersion";
    private final String allowMultipleAccounts;
    private final String associatedDeviceRelationship;
    private final String associatedDeviceRole;
    private final String deregisterExitingAccounts;
    private final String deviceName;
    private final DeviceRegistrationRequestIdentifier deviceRegistrationRequestIdentifier;
    private final String softwareVersion;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Factory implements JsonObjectSerializable.Factory<DeviceRegistrationRequest> {
        private final JsonObjectSerializable.Factory<DeviceRegistrationRequestIdentifier> deviceRegistrationRequestIdentifierFactory;

        public Factory(JsonObjectSerializable.Factory<DeviceRegistrationRequestIdentifier> factory) {
            this.deviceRegistrationRequestIdentifierFactory = factory;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable.Factory
        public DeviceRegistrationRequest create(JSONObject jSONObject) throws JSONException {
            return new DeviceRegistrationRequest(this.deviceRegistrationRequestIdentifierFactory.create(jSONObject), JsonUtils.getStringOrNull(jSONObject, "deviceName"), JsonUtils.getStringOrNull(jSONObject, "softwareVersion"), jSONObject.getString(DeviceRegistrationRequest.DEREGISTER_EXISTING_ACCOUNTS_KEY), jSONObject.getString(DeviceRegistrationRequest.ALLOW_MULTIPLE_ACCOUNTS_KEY), jSONObject.getString(DeviceRegistrationRequest.ASSOCIATED_DEVICE_RELATIONSHIP_KEY), jSONObject.getString(DeviceRegistrationRequest.ASSOCIATED_DEVICE_ROLE_KEY));
        }
    }

    public DeviceRegistrationRequest(DeviceRegistrationRequestIdentifier deviceRegistrationRequestIdentifier, String str, String str2, String str3, String str4, String str5, String str6) {
        Preconditions.notNull(deviceRegistrationRequestIdentifier, "deviceRegistrationRequestIdentifier");
        Preconditions.notNull(str3, DEREGISTER_EXISTING_ACCOUNTS_KEY);
        Preconditions.notNull(str4, ALLOW_MULTIPLE_ACCOUNTS_KEY);
        Preconditions.notNull(str5, ASSOCIATED_DEVICE_RELATIONSHIP_KEY);
        Preconditions.notNull(str6, ASSOCIATED_DEVICE_ROLE_KEY);
        Preconditions.notNull(str4, ALLOW_MULTIPLE_ACCOUNTS_KEY);
        this.deviceRegistrationRequestIdentifier = deviceRegistrationRequestIdentifier;
        this.deviceName = str;
        this.softwareVersion = str2;
        this.deregisterExitingAccounts = str3;
        this.allowMultipleAccounts = str4;
        this.associatedDeviceRelationship = str5;
        this.associatedDeviceRole = str6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DeviceRegistrationRequest.class != obj.getClass()) {
            return false;
        }
        DeviceRegistrationRequest deviceRegistrationRequest = (DeviceRegistrationRequest) obj;
        if (!this.deviceRegistrationRequestIdentifier.equals(deviceRegistrationRequest.deviceRegistrationRequestIdentifier)) {
            return false;
        }
        String str = this.deviceName;
        String str2 = deviceRegistrationRequest.deviceName;
        if (str == null ? str2 != null : !str.equals(str2)) {
            return false;
        }
        String str3 = this.softwareVersion;
        String str4 = deviceRegistrationRequest.softwareVersion;
        if (str3 == null ? str4 != null : !str3.equals(str4)) {
            return false;
        }
        if (this.deregisterExitingAccounts.equals(deviceRegistrationRequest.deregisterExitingAccounts) && this.allowMultipleAccounts.equals(deviceRegistrationRequest.allowMultipleAccounts) && this.associatedDeviceRelationship.equals(deviceRegistrationRequest.associatedDeviceRelationship)) {
            return this.associatedDeviceRole.equals(deviceRegistrationRequest.associatedDeviceRole);
        }
        return false;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public DeviceRegistrationRequestIdentifier getDeviceRegistrationRequestIdentifier() {
        return this.deviceRegistrationRequestIdentifier;
    }

    public String getSoftwareVersion() {
        return this.softwareVersion;
    }

    public int hashCode() {
        int hashCode = this.deviceRegistrationRequestIdentifier.hashCode() * 31;
        String str = this.deviceName;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.softwareVersion;
        return this.associatedDeviceRole.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.deregisterExitingAccounts), 31, this.allowMultipleAccounts), 31, this.associatedDeviceRelationship);
    }

    @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable
    public JSONObject toJsonObject() throws JSONException {
        return this.deviceRegistrationRequestIdentifier.toJsonObject().put("deviceName", this.deviceName).put("softwareVersion", this.softwareVersion).put(DEREGISTER_EXISTING_ACCOUNTS_KEY, this.deregisterExitingAccounts).put(ALLOW_MULTIPLE_ACCOUNTS_KEY, this.allowMultipleAccounts).put(ASSOCIATED_DEVICE_RELATIONSHIP_KEY, this.associatedDeviceRelationship).put(ASSOCIATED_DEVICE_ROLE_KEY, this.associatedDeviceRole);
    }
}
