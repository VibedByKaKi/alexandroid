package com.amazon.apl.android;

import androidx.annotation.Nullable;
import com.amazon.alexaext.ILiveDataUpdateCallback;
import com.amazon.apl.android.ILegacyLocalExtension;
import com.amazon.apl.android.dependencies.IExtensionEventCallback;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public abstract class LegacyLocalExtension implements ILegacyLocalExtension {
    private ILegacyLocalExtension.ISendExtensionEventCallback mEventCallback;

    @Override // com.amazon.apl.android.ILegacyLocalExtension
    public boolean initialize(ILegacyLocalExtension.ISendExtensionEventCallback iSendExtensionEventCallback, ILiveDataUpdateCallback iLiveDataUpdateCallback) {
        this.mEventCallback = iSendExtensionEventCallback;
        return true;
    }

    public boolean sendExtensionEvent(String str, Map<String, Object> map) {
        return this.mEventCallback.sendExtensionEvent(str, map);
    }

    @Override // com.amazon.apl.android.providers.IExtension
    @Nullable
    public IExtensionEventCallback getCallback() {
        return this;
    }
}
