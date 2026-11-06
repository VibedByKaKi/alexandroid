package com.dee.app.contacts.interfaces.models.data.device;

import com.dee.app.contacts.interfaces.models.data.enums.ActiveState;
import com.dee.app.contacts.interfaces.models.data.enums.AnnouncementAvailability;
import com.dee.app.contacts.interfaces.models.data.enums.DeviceDisplayStatus;
import com.dee.app.contacts.interfaces.models.data.enums.DropInAvailability;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class Device {
    private AnnouncementAvailability announcementAvailability;
    private boolean canDropIn;
    private boolean canReceiveCall;
    private List<String> childCommsIds;
    private String deviceGruu;
    private String deviceName;
    private String deviceSerialNumber;
    private ActiveState deviceStatus;
    private String deviceType;
    private DeviceDisplayStatus displayStatus;
    private DropInAvailability dropInAvailability;
    private boolean isOnLine;
    private boolean isVideoCapable;

    public AnnouncementAvailability getAnnouncementAvailability() {
        return this.announcementAvailability;
    }

    public List<String> getChildCommsIds() {
        return this.childCommsIds;
    }

    public String getDeviceGruu() {
        return this.deviceGruu;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public String getDeviceSerialNumber() {
        return this.deviceSerialNumber;
    }

    public ActiveState getDeviceStatus() {
        return this.deviceStatus;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    public DeviceDisplayStatus getDisplayStatus() {
        return this.displayStatus;
    }

    public DropInAvailability getDropInAvailability() {
        return this.dropInAvailability;
    }

    public boolean isCanDropIn() {
        return this.canDropIn;
    }

    public boolean isCanReceiveCall() {
        return this.canReceiveCall;
    }

    public boolean isOnLine() {
        return this.isOnLine;
    }

    public boolean isVideoCapable() {
        return this.isVideoCapable;
    }

    public void setAnnouncementAvailability(AnnouncementAvailability announcementAvailability) {
        this.announcementAvailability = announcementAvailability;
    }

    public void setCanDropIn(boolean z) {
        this.canDropIn = z;
    }

    public void setCanReceiveCall(boolean z) {
        this.canReceiveCall = z;
    }

    public void setChildCommsIds(List<String> list) {
        this.childCommsIds = list;
    }

    public void setDeviceGruu(String str) {
        this.deviceGruu = str;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    public void setDeviceSerialNumber(String str) {
        this.deviceSerialNumber = str;
    }

    public void setDeviceStatus(ActiveState activeState) {
        this.deviceStatus = activeState;
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }

    public void setDisplayStatus(DeviceDisplayStatus deviceDisplayStatus) {
        this.displayStatus = deviceDisplayStatus;
    }

    public void setDropInAvailability(DropInAvailability dropInAvailability) {
        this.dropInAvailability = dropInAvailability;
    }

    public void setOnLine(boolean z) {
        this.isOnLine = z;
    }

    public void setVideoCapable(boolean z) {
        this.isVideoCapable = z;
    }
}
