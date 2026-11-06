package com.amazon.deecomms.calling.datachannel;

import androidx.annotation.NonNull;
import com.google.common.base.Enums;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum CallingEventName {
    PIPACTION("PIPAction"),
    CALL_SETUP("call_setup");

    private String value;

    CallingEventName(String str) {
        this.value = str;
    }

    public static CallingEventName lookupByEventName(String str) {
        return (CallingEventName) Enums.getIfPresent(CallingEventName.class, str).orNull();
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.value;
    }
}
