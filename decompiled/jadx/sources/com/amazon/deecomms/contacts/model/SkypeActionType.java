package com.amazon.deecomms.contacts.model;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum SkypeActionType {
    Call("call"),
    Chat("chat");

    private final String value;

    SkypeActionType(String str) {
        this.value = str;
    }

    public static boolean isValidAction(@NonNull String str) {
        for (SkypeActionType skypeActionType : values()) {
            if (skypeActionType.getValue().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public String getValue() {
        return this.value;
    }
}
