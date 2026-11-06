package com.amazon.whisperjoin.common.sharedtypes.provisioning.events;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum DeviceEvent {
    NETWORK_STATE_UPDATED(DeviceEventConstants.NETWORK_STATE_UPDATED_STRING),
    NETWORK_SCAN_COMPLETE(DeviceEventConstants.NETWORK_SCAN_COMPLETE_STRING),
    REGISTRATION_STATE_UPDATED(DeviceEventConstants.REGISTRATION_STATE_UPDATED_STRING),
    PROVISIONING_DONE_SUCCESS(DeviceEventConstants.PROVISIONING_DONE_SUCCESS),
    PROVISIONING_DONE_FAILURE(DeviceEventConstants.PROVISIONING_DONE_FAILURE),
    DISCONNECTED("DISCONNECTED"),
    CUSTOM_APPLICATION_UPDATE(DeviceEventConstants.CUSTOM_APPLICATION_UPDATE_STRING),
    DEVICE_PROVISIONING_ERROR(DeviceEventConstants.DEVICE_PROVISIONING_ERROR_STRING),
    MESSAGE_PROCESSING_EXCEPTION(DeviceEventConstants.MESSAGE_PROCESSING_EXCEPTION_STRING);

    private final String mEventString;

    DeviceEvent(String str) {
        this.mEventString = str;
    }

    public String getString() {
        return this.mEventString;
    }
}
