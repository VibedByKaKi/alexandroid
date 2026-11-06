package com.amazon.rtvi.capabilityagent.avs;

import android.content.Context;
import com.amazon.alexa.api.compat.model.CapabilitiesApiV2;
import com.amazon.alexa.api.compat.model.ContextProviderApiV2;
import com.amazon.rtvi.capabilityagent.avs.RTVIEventSender;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class RTVIEventSender$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ RTVIEventSender$$ExternalSyntheticLambda3(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CapabilitiesApiV2 _init_$lambda$1$lambda$0;
        ContextProviderApiV2 _init_$lambda$1$lambda$02;
        Unit onSuccess$lambda$0;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                _init_$lambda$1$lambda$0 = RTVIEventSender._init_$lambda$1$lambda$0((Context) obj);
                return _init_$lambda$1$lambda$0;
            case 1:
                _init_$lambda$1$lambda$02 = RTVIAlexaContextProvider._init_$lambda$1$lambda$0((Context) obj);
                return _init_$lambda$1$lambda$02;
            default:
                onSuccess$lambda$0 = RTVIEventSender$sendViaCompat$1.onSuccess$lambda$0((RTVIEventSender.DeliveryTracker) obj);
                return onSuccess$lambda$0;
        }
    }
}
