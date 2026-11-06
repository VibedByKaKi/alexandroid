package com.amazon.alexa.api.compat.model.assistant;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public enum AccountApiMessageType {
    SET_USER_PROFILE,
    LOGOUT,
    SET_REGION,
    UPDATE_B_M_C_L_ENTITLEMENT_STATUS,
    SEND_SYNCHRONIZE_STATE_EVENT,
    SET_USER_PROFILE_V2;

    public static AccountApiMessageType fromOrdinal(int i) {
        AccountApiMessageType[] values = values();
        if (i < 0 || i >= values.length) {
            return null;
        }
        return values[i];
    }
}
