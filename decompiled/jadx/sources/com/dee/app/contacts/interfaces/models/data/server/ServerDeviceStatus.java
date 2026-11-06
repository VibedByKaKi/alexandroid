package com.dee.app.contacts.interfaces.models.data.server;

import com.dee.app.contacts.interfaces.models.data.enums.ActiveState;
import com.dee.app.contacts.interfaces.models.data.enums.AnnouncementAvailability;
import com.dee.app.contacts.interfaces.models.data.enums.CommsAvailability;
import com.dee.app.contacts.interfaces.models.data.enums.DropInAvailability;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ServerDeviceStatus {
    private ActiveState activeState;
    private AnnouncementAvailability announcementAvailability;
    private CommsAvailability deviceCommsAvailability;
    private DropInAvailability deviceDropInAvailability;
    private boolean dnd;
    private boolean inCall;
    private boolean isA2dpBluetoothConnected;
    private boolean isAuxConnected;
    private boolean online;
    private boolean registered;
    private boolean videoAvailability;

    public ActiveState getActiveState() {
        return this.activeState;
    }

    public AnnouncementAvailability getAnnouncementAvailability() {
        return this.announcementAvailability;
    }

    public CommsAvailability getDeviceCommsAvailability() {
        return this.deviceCommsAvailability;
    }

    public DropInAvailability getDeviceDropInAvailability() {
        return this.deviceDropInAvailability;
    }

    public boolean isA2dpBluetoothConnected() {
        return this.isA2dpBluetoothConnected;
    }

    public boolean isAuxConnected() {
        return this.isAuxConnected;
    }

    public boolean isDnd() {
        return this.dnd;
    }

    public boolean isInCall() {
        return this.inCall;
    }

    public boolean isOnline() {
        return this.online;
    }

    public boolean isRegistered() {
        return this.registered;
    }

    public boolean isVideoAvailability() {
        return this.videoAvailability;
    }

    public void setA2dpBluetoothConnected(boolean z) {
        this.isA2dpBluetoothConnected = z;
    }

    public void setActiveState(ActiveState activeState) {
        this.activeState = activeState;
    }

    public void setAnnouncementAvailability(AnnouncementAvailability announcementAvailability) {
        this.announcementAvailability = announcementAvailability;
    }

    public void setAuxConnected(boolean z) {
        this.isAuxConnected = z;
    }

    public void setDeviceCommsAvailability(CommsAvailability commsAvailability) {
        this.deviceCommsAvailability = commsAvailability;
    }

    public void setDeviceDropInAvailability(DropInAvailability dropInAvailability) {
        this.deviceDropInAvailability = dropInAvailability;
    }

    public void setDnd(boolean z) {
        this.dnd = z;
    }

    public void setInCall(boolean z) {
        this.inCall = z;
    }

    public void setOnline(boolean z) {
        this.online = z;
    }

    public void setRegistered(boolean z) {
        this.registered = z;
    }

    public void setVideoAvailability(boolean z) {
        this.videoAvailability = z;
    }
}
