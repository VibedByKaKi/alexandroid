package com.amazon.apl.android.dependencies;

import android.graphics.Rect;
import android.view.Surface;
import com.amazon.apl.android.Component;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface IExtensionComponentCallback {
    void onExtensionComponentCreated(Component component, String str, Surface surface, Rect rect);

    void onExtensionComponentDeleted(Component component, String str, Surface surface);

    void onExtensionComponentUpdated(Component component, String str, Surface surface);
}
