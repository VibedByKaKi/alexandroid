package com.amazon.alexa.accessory.repositories.system;

import com.amazon.alexa.accessory.protocol.Common;
import com.amazon.alexa.accessory.protocol.System;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class MemorySystemRepository$$ExternalSyntheticLambda9 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MemorySystemRepository f$0;
    public final /* synthetic */ System.Locale f$1;

    public /* synthetic */ MemorySystemRepository$$ExternalSyntheticLambda9(MemorySystemRepository memorySystemRepository, System.Locale locale, int i) {
        this.$r8$classId = i;
        this.f$0 = memorySystemRepository;
        this.f$1 = locale;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        SingleSource lambda$setLocale$16;
        SingleSource lambda$downloadThenSetLocale$26;
        SingleSource lambda$setLocaleAsync$21;
        switch (this.$r8$classId) {
            case 0:
                lambda$setLocale$16 = this.f$0.lambda$setLocale$16(this.f$1, (System.Locales) obj);
                return lambda$setLocale$16;
            case 1:
                lambda$downloadThenSetLocale$26 = this.f$0.lambda$downloadThenSetLocale$26(this.f$1, (Common.ErrorCode) obj);
                return lambda$downloadThenSetLocale$26;
            default:
                lambda$setLocaleAsync$21 = this.f$0.lambda$setLocaleAsync$21(this.f$1, (System.Wakewords) obj);
                return lambda$setLocaleAsync$21;
        }
    }
}
