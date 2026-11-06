package com.amazon.alexa.biloba.model;

import com.amazon.alexa.biloba.model.DeviceActivity;
import com.amazon.alexa.smarthomecameras.routing.CamerasRouteParameter;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DeviceAction {

    @SerializedName("actionType")
    private DeviceActivity.ActionType actionType = null;

    @SerializedName(CamerasRouteParameter.DISPLAY_NAME)
    private String displayName = null;

    @SerializedName("triggerString")
    private String triggerString = null;

    private String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    public DeviceAction actionType(DeviceActivity.ActionType actionType) {
        this.actionType = actionType;
        return this;
    }

    public DeviceAction displayName(String str) {
        this.displayName = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DeviceAction deviceAction = (DeviceAction) obj;
            if (Objects.equals(this.actionType, deviceAction.actionType) && Objects.equals(this.displayName, deviceAction.displayName) && Objects.equals(this.triggerString, deviceAction.triggerString)) {
                return true;
            }
        }
        return false;
    }

    public DeviceActivity.ActionType getActionType() {
        return this.actionType;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getTriggerString() {
        return this.triggerString;
    }

    public int hashCode() {
        return Objects.hash(this.actionType, this.displayName, this.triggerString);
    }

    public void setActionType(DeviceActivity.ActionType actionType) {
        this.actionType = actionType;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setTriggerString(String str) {
        this.triggerString = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("class Device {\n    actionType: ");
        sb.append(toIndentedString(this.actionType));
        sb.append("\n    displayName: ");
        sb.append(toIndentedString(this.displayName));
        sb.append("\n    triggerString: ");
        return a$$ExternalSyntheticOutline0.m(sb, toIndentedString(this.triggerString), "\n}");
    }

    public DeviceAction triggerString(String str) {
        this.triggerString = str;
        return this;
    }
}
