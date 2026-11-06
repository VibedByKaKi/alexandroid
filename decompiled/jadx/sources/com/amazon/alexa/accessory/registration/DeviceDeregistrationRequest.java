package com.amazon.alexa.accessory.registration;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.internal.util.JsonObjectSerializable;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class DeviceDeregistrationRequest implements JsonObjectSerializable {
    private final String associatedDeviceRelationship;
    private final String associatedDeviceRole;
    private final DeviceRegistrationRequestIdentifier deviceRegistrationRequestIdentifier;

    public DeviceDeregistrationRequest(DeviceRegistrationRequestIdentifier deviceRegistrationRequestIdentifier, String str, String str2) {
        Preconditions.notNull(deviceRegistrationRequestIdentifier, "deviceRegistrationRequestIdentifier");
        Preconditions.notNull(str, "associatedDeviceRelationship");
        Preconditions.notNull(str2, "associatedDeviceRole");
        this.deviceRegistrationRequestIdentifier = deviceRegistrationRequestIdentifier;
        this.associatedDeviceRelationship = str;
        this.associatedDeviceRole = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DeviceDeregistrationRequest.class != obj.getClass()) {
            return false;
        }
        DeviceDeregistrationRequest deviceDeregistrationRequest = (DeviceDeregistrationRequest) obj;
        if (this.deviceRegistrationRequestIdentifier.equals(deviceDeregistrationRequest.deviceRegistrationRequestIdentifier) && this.associatedDeviceRelationship.equals(deviceDeregistrationRequest.associatedDeviceRelationship)) {
            return this.associatedDeviceRole.equals(deviceDeregistrationRequest.associatedDeviceRole);
        }
        return false;
    }

    public DeviceRegistrationRequestIdentifier getDeviceRegistrationRequestIdentifier() {
        return this.deviceRegistrationRequestIdentifier;
    }

    public int hashCode() {
        return this.associatedDeviceRole.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(this.deviceRegistrationRequestIdentifier.hashCode() * 31, 31, this.associatedDeviceRelationship);
    }

    @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable
    public JSONObject toJsonObject() throws JSONException {
        return this.deviceRegistrationRequestIdentifier.toJsonObject().put("associatedDeviceRelationship", this.associatedDeviceRelationship).put("associatedDeviceRole", this.associatedDeviceRole);
    }
}
