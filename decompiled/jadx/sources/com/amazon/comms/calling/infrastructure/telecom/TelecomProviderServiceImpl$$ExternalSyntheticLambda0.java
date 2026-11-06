package com.amazon.comms.calling.infrastructure.telecom;

import android.content.ComponentName;
import android.telecom.PhoneAccountHandle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class TelecomProviderServiceImpl$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TelecomProviderServiceImpl f$0;

    public /* synthetic */ TelecomProviderServiceImpl$$ExternalSyntheticLambda0(TelecomProviderServiceImpl telecomProviderServiceImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = telecomProviderServiceImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ComponentName componentName_delegate$lambda$0;
        Unit invokeSuspend$lambda$0;
        PhoneAccountHandle phoneAccountHandle_delegate$lambda$1;
        int i = this.$r8$classId;
        TelecomProviderServiceImpl telecomProviderServiceImpl = this.f$0;
        switch (i) {
            case 0:
                componentName_delegate$lambda$0 = TelecomProviderServiceImpl.componentName_delegate$lambda$0(telecomProviderServiceImpl);
                return componentName_delegate$lambda$0;
            case 1:
                invokeSuspend$lambda$0 = TelecomProviderServiceImpl$telecomEventsFlow$1.invokeSuspend$lambda$0(telecomProviderServiceImpl);
                return invokeSuspend$lambda$0;
            default:
                phoneAccountHandle_delegate$lambda$1 = TelecomProviderServiceImpl.phoneAccountHandle_delegate$lambda$1(telecomProviderServiceImpl);
                return phoneAccountHandle_delegate$lambda$1;
        }
    }
}
