package com.amazon.alexa.accessory.capabilities.system;

import com.amazon.alexa.accessory.protocol.System;
import com.amazon.alexa.accessory.repositories.system.SystemProvider;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class SystemCapability$$ExternalSyntheticLambda2 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SystemProvider f$0;

    public /* synthetic */ SystemCapability$$ExternalSyntheticLambda2(SystemProvider systemProvider, int i) {
        this.$r8$classId = i;
        this.f$0 = systemProvider;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        SystemProvider systemProvider = this.f$0;
        switch (i) {
            case 0:
                systemProvider.provideWakewords((System.Wakewords) obj);
                break;
            case 1:
                systemProvider.provideLocales((System.Locales) obj);
                break;
            case 2:
                systemProvider.provideLocalesError((Throwable) obj);
                break;
            default:
                systemProvider.provideWakewordsError((Throwable) obj);
                break;
        }
    }
}
