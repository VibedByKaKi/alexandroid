package com.amazon.leaderselection;

import android.content.ComponentName;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
class ComponentNameFactory {
    private static final String UNKNOWN = "unknown";
    static final ComponentName UNKNOWN_COMPONENT_NAME = new ComponentName("unknown", "unknown");

    public static ComponentName create(String str, String str2) {
        return (str == null || str2 == null) ? UNKNOWN_COMPONENT_NAME : new ComponentName(str, str2);
    }
}
