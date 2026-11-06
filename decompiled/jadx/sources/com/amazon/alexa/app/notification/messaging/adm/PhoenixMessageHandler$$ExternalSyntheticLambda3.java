package com.amazon.alexa.app.notification.messaging.adm;

import com.amazon.alexa.crashreporting.api.CrashReporter;
import java.util.function.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class PhoenixMessageHandler$$ExternalSyntheticLambda3 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RuntimeException f$0;

    public /* synthetic */ PhoenixMessageHandler$$ExternalSyntheticLambda3(RuntimeException runtimeException, int i) {
        this.$r8$classId = i;
        this.f$0 = runtimeException;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        RuntimeException runtimeException = this.f$0;
        CrashReporter crashReporter = (CrashReporter) obj;
        switch (i) {
            case 0:
                crashReporter.reportNonFatal(runtimeException, 1);
                break;
            default:
                crashReporter.reportNonFatal(runtimeException, 1);
                break;
        }
    }
}
