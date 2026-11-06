package com.amazon.alexa.routing;

import com.amazon.alexa.accessory.avsclient.AccessoryDiagnostics;
import com.amazon.minerva.transport.direct.UploadResult;
import io.reactivex.rxjava3.core.CompletableEmitter;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;
import org.apache.commons.lang3.concurrent.BackgroundInitializer;
import org.apache.commons.lang3.concurrent.MultiBackgroundInitializer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class DefaultRoutingService$$ExternalSyntheticLambda2 implements BiConsumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ DefaultRoutingService$$ExternalSyntheticLambda2(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((DefaultRoutingService) this.f$0).lambda$processRouteEventsDictionary$0((ConcurrentHashMap) this.f$1, (String) obj, (Integer) obj2);
                break;
            case 1:
                AccessoryDiagnostics.lambda$uploadBatchToMinerva$23((String) this.f$0, (CompletableEmitter) this.f$1, (UploadResult) obj, (Throwable) obj2);
                break;
            default:
                MultiBackgroundInitializer.lambda$initialize$1((HashMap) this.f$0, (HashMap) this.f$1, (String) obj, (BackgroundInitializer) obj2);
                break;
        }
    }
}
