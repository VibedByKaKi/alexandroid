package com.amazon.dee.app.dependencies;

import com.amazon.alexa.crashreporting.CrashReportingService;
import com.facebook.react.ReactHost;
import dagger.Lazy;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ServiceModule$$ExternalSyntheticLambda2 implements Provider {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ServiceModule$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        ReactHost lambda$provideReactNativeViewManager$0;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                return (CrashReportingService) ((Lazy) obj).get();
            default:
                lambda$provideReactNativeViewManager$0 = ViewManagerModule.lambda$provideReactNativeViewManager$0((ReactHost) obj);
                return lambda$provideReactNativeViewManager$0;
        }
    }
}
