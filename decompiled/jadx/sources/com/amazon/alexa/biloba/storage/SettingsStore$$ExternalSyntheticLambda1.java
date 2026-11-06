package com.amazon.alexa.biloba.storage;

import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class SettingsStore$$ExternalSyntheticLambda1 implements Action1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SettingsStore f$0;

    public /* synthetic */ SettingsStore$$ExternalSyntheticLambda1(SettingsStore settingsStore, int i) {
        this.$r8$classId = i;
        this.f$0 = settingsStore;
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public final void mo8903call(Object obj) {
        int i = this.$r8$classId;
        SettingsStore settingsStore = this.f$0;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                settingsStore.lambda$setTimeZoneSettings$3(th);
                break;
            default:
                settingsStore.lambda$getTimeZoneSettings$1(th);
                break;
        }
    }
}
