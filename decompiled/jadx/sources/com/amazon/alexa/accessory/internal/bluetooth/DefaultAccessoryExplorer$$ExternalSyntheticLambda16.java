package com.amazon.alexa.accessory.internal.bluetooth;

import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.AccessoryExplorer;
import com.amazon.alexa.accessory.internal.util.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DefaultAccessoryExplorer$$ExternalSyntheticLambda16 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Accessory f$0;

    public /* synthetic */ DefaultAccessoryExplorer$$ExternalSyntheticLambda16(Accessory accessory, int i) {
        this.$r8$classId = i;
        this.f$0 = accessory;
    }

    @Override // com.amazon.alexa.accessory.internal.util.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Accessory accessory = this.f$0;
        AccessoryExplorer.Observer observer = (AccessoryExplorer.Observer) obj;
        switch (i) {
            case 0:
                observer.onUnknownAccessoryLost(accessory, null);
                break;
            case 1:
                observer.onKnownAccessoryFound(accessory);
                break;
            case 2:
                observer.onKnownAccessoryLost(accessory);
                break;
            case 3:
                observer.onUnknownAccessoryLost(accessory, null);
                break;
            case 4:
                observer.onUnknownAccessoryFound(accessory, null);
                break;
            case 5:
                observer.onKnownAccessoryFound(accessory);
                break;
            case 6:
                observer.onUnknownAccessoryFound(accessory, null);
                break;
            case 7:
                observer.onUnknownAccessoryConnected(accessory, null);
                break;
            case 8:
                observer.onKnownAccessoryLost(accessory);
                break;
            default:
                observer.onUnknownAccessoryLost(accessory, null);
                break;
        }
    }
}
