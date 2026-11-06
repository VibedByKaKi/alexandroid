package com.amazon.apl.android;

import com.amazon.alexaext.ILiveDataUpdateCallback;
import com.amazon.apl.android.dependencies.IExtensionEventCallback;
import com.amazon.apl.android.providers.IExtension;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public interface ILegacyLocalExtension extends IExtension, IExtensionEventCallback {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ISendExtensionEventCallback {
        boolean sendExtensionEvent(String str, Map<String, Object> map);
    }

    default List<LiveDataAdapter> getLiveData() {
        return new ArrayList();
    }

    default boolean initialize(ISendExtensionEventCallback iSendExtensionEventCallback, ILiveDataUpdateCallback iLiveDataUpdateCallback) {
        return true;
    }

    default void applySettings(Map<String, Object> map) {
    }

    default void onRegistered(String str, String str2) {
    }

    default void onUnregistered(String str, String str2) {
    }
}
