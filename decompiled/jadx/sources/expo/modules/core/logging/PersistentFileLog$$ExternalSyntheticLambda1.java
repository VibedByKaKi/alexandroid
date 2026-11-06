package expo.modules.core.logging;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class PersistentFileLog$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ PersistentFileLog f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ PersistentFileLog$$ExternalSyntheticLambda1(PersistentFileLog persistentFileLog, String str, Function1 function1) {
        this.f$0 = persistentFileLog;
        this.f$2 = str;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit purgeEntriesNotMatchingFilter$lambda$2;
        Unit appendEntry$lambda$1;
        switch (this.$r8$classId) {
            case 0:
                purgeEntriesNotMatchingFilter$lambda$2 = PersistentFileLog.purgeEntriesNotMatchingFilter$lambda$2(this.f$0, this.f$1, (Function1) this.f$2);
                return purgeEntriesNotMatchingFilter$lambda$2;
            default:
                appendEntry$lambda$1 = PersistentFileLog.appendEntry$lambda$1(this.f$0, (String) this.f$2, this.f$1);
                return appendEntry$lambda$1;
        }
    }

    public /* synthetic */ PersistentFileLog$$ExternalSyntheticLambda1(PersistentFileLog persistentFileLog, Function1 function1, Function1 function12) {
        this.f$0 = persistentFileLog;
        this.f$1 = function1;
        this.f$2 = function12;
    }
}
