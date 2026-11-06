package com.amazon.deecomms.calling.enums;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum AssistCspId {
    RAPID_RESPONSE("a2ny6394v53528"),
    SHERLOCK("sh1b1v8yxvtoukw"),
    WATSON("WA23DL45CMGYECU"),
    MYCROFT("MY3CQGWSDN6AJ8O");

    public String cspId;

    AssistCspId(@NonNull String str) {
        this.cspId = str;
    }

    public static boolean isValidCsp(@NonNull String str) {
        for (AssistCspId assistCspId : values()) {
            if (assistCspId.getCspId().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public String getCspId() {
        return this.cspId;
    }
}
