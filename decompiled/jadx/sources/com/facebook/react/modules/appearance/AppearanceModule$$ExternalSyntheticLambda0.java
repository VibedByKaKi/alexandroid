package com.facebook.react.modules.appearance;

import com.amazon.alexa.accessory.notificationpublisher.providers.AccessoryProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class AppearanceModule$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ AppearanceModule$$ExternalSyntheticLambda0(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                AppearanceModule.setColorScheme$lambda$0(str);
                break;
            default:
                AccessoryProvider.lambda$subscribeToAccessoryStateChanges$0(str);
                break;
        }
    }
}
