package com.amazon.deecomms.accessories;

import com.amazon.deecomms.accessories.CommsAccessorySessionListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class CommsAccessorySessionListener$$ExternalSyntheticLambda7 implements CommsAccessorySessionListener.UpdateAccessory {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CommsAccessorySessionListener f$0;

    public /* synthetic */ CommsAccessorySessionListener$$ExternalSyntheticLambda7(CommsAccessorySessionListener commsAccessorySessionListener, int i) {
        this.$r8$classId = i;
        this.f$0 = commsAccessorySessionListener;
    }

    @Override // com.amazon.deecomms.accessories.CommsAccessorySessionListener.UpdateAccessory
    public final void updateAccessoryInformation() {
        int i = this.$r8$classId;
        CommsAccessorySessionListener commsAccessorySessionListener = this.f$0;
        switch (i) {
            case 0:
                commsAccessorySessionListener.lambda$onAccessorySessionReleased$6();
                break;
            default:
                commsAccessorySessionListener.lambda$onAccessorySessionConnected$7();
                break;
        }
    }
}
