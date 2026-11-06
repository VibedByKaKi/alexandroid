package com.amazon.apl.android.dependencies;

import com.amazon.apl.android.Event;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface IExtensionEventCallback {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface IExtensionEventCallbackResult {
        void onResult(boolean z);
    }

    default void onExtensionEvent(String str, String str2, Event event, Map<String, Object> map, Map<String, Object> map2, IExtensionEventCallbackResult iExtensionEventCallbackResult) {
        onExtensionEvent(str, str2, map, map2, iExtensionEventCallbackResult);
    }

    @Deprecated
    void onExtensionEvent(String str, String str2, Map<String, Object> map, Map<String, Object> map2, IExtensionEventCallbackResult iExtensionEventCallbackResult);
}
