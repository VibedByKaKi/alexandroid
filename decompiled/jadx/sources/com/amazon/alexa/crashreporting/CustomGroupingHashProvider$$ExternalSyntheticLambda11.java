package com.amazon.alexa.crashreporting;

import com.bugsnag.android.Stackframe;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class CustomGroupingHashProvider$$ExternalSyntheticLambda11 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ CustomGroupingHashProvider$$ExternalSyntheticLambda11(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Optional lambda$selectCrashFrame$10;
        String lambda$signatureFor$3;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                lambda$selectCrashFrame$10 = CustomGroupingHashProvider.lambda$selectCrashFrame$10((List) obj2, (Predicate) obj);
                return lambda$selectCrashFrame$10;
            default:
                lambda$signatureFor$3 = CustomGroupingHashProvider.lambda$signatureFor$3((String) obj2, (Stackframe) obj);
                return lambda$signatureFor$3;
        }
    }
}
