package com.amazon.alexa.voice.ui.onedesign.minicards;

import com.amazon.alexa.ra.core.metrics.InteractionLabel;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum NativeMiniCardActionType {
    UNKNOWN("Unknown"),
    OPEN_URL(InteractionLabel.OPEN_URL),
    SEND_TEXT("SendText"),
    SHOW_NATIVE_CARD("ShowNativeCard");

    private final String actionType;

    NativeMiniCardActionType(String str) {
        this.actionType = str;
    }

    public static NativeMiniCardActionType from(String str) {
        for (NativeMiniCardActionType nativeMiniCardActionType : values()) {
            if (nativeMiniCardActionType.actionType.equals(str)) {
                return nativeMiniCardActionType;
            }
        }
        return UNKNOWN;
    }
}
