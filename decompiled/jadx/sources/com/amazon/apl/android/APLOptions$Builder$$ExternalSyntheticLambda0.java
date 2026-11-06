package com.amazon.apl.android;

import com.amazon.alexaext.ILiveDataUpdateCallback;
import com.amazon.apl.android.ILegacyLocalExtension;
import com.amazon.apl.android.dependencies.ISendEventCallback;
import com.amazon.apl.android.dependencies.ISendEventCallbackV2;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class APLOptions$Builder$$ExternalSyntheticLambda0 implements ILegacyLocalExtension.ISendExtensionEventCallback, ILiveDataUpdateCallback, ISendEventCallbackV2 {
    public final /* synthetic */ Object f$0;

    public /* synthetic */ APLOptions$Builder$$ExternalSyntheticLambda0(Object obj) {
        this.f$0 = obj;
    }

    @Override // com.amazon.alexaext.ILiveDataUpdateCallback
    public boolean invokeLiveDataUpdate(String str, String str2) {
        boolean lambda$initialize$0;
        lambda$initialize$0 = ((LegacyLocalExtensionProxy) this.f$0).lambda$initialize$0(str, str2);
        return lambda$initialize$0;
    }

    @Override // com.amazon.apl.android.dependencies.ISendEventCallbackV2
    public void onSendEvent(Object[] objArr, Map map, Map map2, Map map3) {
        ((ISendEventCallback) this.f$0).onSendEvent(objArr, map, map2);
    }

    @Override // com.amazon.apl.android.ILegacyLocalExtension.ISendExtensionEventCallback
    public boolean sendExtensionEvent(String str, Map map) {
        return ((LegacyLocalExtensionProxy) this.f$0).sendExtensionEvent(str, map);
    }
}
