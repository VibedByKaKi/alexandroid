package com.amazon.alexa.permissions.api;

import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface PermissionsListener {
    void onBlocked(List<String> list, List<String> list2);

    void onDenied(List<String> list);

    void onGranted();
}
