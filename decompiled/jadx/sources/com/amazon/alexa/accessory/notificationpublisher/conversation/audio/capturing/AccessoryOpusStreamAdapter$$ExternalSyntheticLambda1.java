package com.amazon.alexa.accessory.notificationpublisher.conversation.audio.capturing;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class AccessoryOpusStreamAdapter$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccessoryOpusStreamAdapter f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ AccessoryOpusStreamAdapter$$ExternalSyntheticLambda1(AccessoryOpusStreamAdapter accessoryOpusStreamAdapter, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = accessoryOpusStreamAdapter;
        this.f$1 = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit endCapture$lambda$6;
        Unit beginCapture$lambda$2;
        switch (this.$r8$classId) {
            case 0:
                endCapture$lambda$6 = AccessoryOpusStreamAdapter.endCapture$lambda$6(this.f$0, this.f$1, (Throwable) obj);
                return endCapture$lambda$6;
            default:
                beginCapture$lambda$2 = AccessoryOpusStreamAdapter.beginCapture$lambda$2(this.f$0, this.f$1, (Throwable) obj);
                return beginCapture$lambda$2;
        }
    }
}
