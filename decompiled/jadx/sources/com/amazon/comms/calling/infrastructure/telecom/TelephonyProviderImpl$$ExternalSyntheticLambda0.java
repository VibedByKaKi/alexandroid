package com.amazon.comms.calling.infrastructure.telecom;

import com.amazon.comms.calling.infrastructure.telecom.TelecomProviderServiceImpl$telecomEventsFlow$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.channels.ConflatedBroadcastChannel;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class TelephonyProviderImpl$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ TelephonyProviderImpl$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ConflatedBroadcastChannel telephonyEventChannel_delegate$lambda$0;
        Unit onSilence$lambda$0;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                telephonyEventChannel_delegate$lambda$0 = TelephonyProviderImpl.telephonyEventChannel_delegate$lambda$0((TelephonyProviderImpl) obj);
                return telephonyEventChannel_delegate$lambda$0;
            default:
                onSilence$lambda$0 = TelecomProviderServiceImpl$telecomEventsFlow$1.AnonymousClass1.onSilence$lambda$0((TelecomProviderServiceImpl$telecomEventsFlow$1.AnonymousClass1) obj);
                return onSilence$lambda$0;
        }
    }
}
