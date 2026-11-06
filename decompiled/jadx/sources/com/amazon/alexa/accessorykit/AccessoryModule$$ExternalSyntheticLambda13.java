package com.amazon.alexa.accessorykit;

import com.facebook.react.bridge.WritableMap;
import io.reactivex.rxjava3.functions.Consumer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoryModule$$ExternalSyntheticLambda13 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Serializable f$1;

    public /* synthetic */ AccessoryModule$$ExternalSyntheticLambda13(Object obj, Serializable serializable, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = serializable;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((AccessoryModule) this.f$0).lambda$queryAccessoryState$43((String) this.f$1, (WritableMap) obj);
                break;
            case 1:
                ((AbaSettingsBridgeDelegate) this.f$0).lambda$queryAccessoryState$43((String) this.f$1, (WritableMap) obj);
                break;
            default:
                ((AccessoryPresenceNotifier) this.f$0).lambda$updateConnectedDeviceTypes$8((ArrayList) this.f$1, (List) obj);
                break;
        }
    }
}
