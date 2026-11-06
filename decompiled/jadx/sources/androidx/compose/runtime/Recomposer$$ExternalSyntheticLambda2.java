package androidx.compose.runtime;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class Recomposer$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Recomposer$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit broadcastFrameClock$lambda$2;
        List currentStackTrace;
        List currentStackTrace2;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                broadcastFrameClock$lambda$2 = Recomposer.broadcastFrameClock$lambda$2((Recomposer) obj);
                return broadcastFrameClock$lambda$2;
            case 1:
                currentStackTrace = ((ComposerImpl) obj).currentStackTrace();
                return currentStackTrace;
            default:
                currentStackTrace2 = ((ComposerImpl) obj).currentStackTrace();
                return currentStackTrace2;
        }
    }
}
