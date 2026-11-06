package com.amazon.alexa.crashreporting;

import com.bugsnag.android.Stackframe;
import java.util.Optional;
import java.util.function.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class CustomGroupingHashProvider$$ExternalSyntheticLambda5 implements Predicate {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CustomGroupingHashProvider$$ExternalSyntheticLambda5(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$selectCrashFrame$4;
        boolean lambda$selectCrashFrame$9;
        boolean lambda$selectCrashFrame$5;
        boolean lambda$selectCrashFrame$6;
        boolean lambda$selectCrashFrame$7;
        boolean lambda$selectCrashFrame$8;
        switch (this.$r8$classId) {
            case 0:
                lambda$selectCrashFrame$4 = CustomGroupingHashProvider.lambda$selectCrashFrame$4((Stackframe) obj);
                return lambda$selectCrashFrame$4;
            case 1:
                lambda$selectCrashFrame$9 = CustomGroupingHashProvider.lambda$selectCrashFrame$9((Stackframe) obj);
                return lambda$selectCrashFrame$9;
            case 2:
                lambda$selectCrashFrame$5 = CustomGroupingHashProvider.lambda$selectCrashFrame$5((Stackframe) obj);
                return lambda$selectCrashFrame$5;
            case 3:
                lambda$selectCrashFrame$6 = CustomGroupingHashProvider.lambda$selectCrashFrame$6((Stackframe) obj);
                return lambda$selectCrashFrame$6;
            case 4:
                lambda$selectCrashFrame$7 = CustomGroupingHashProvider.lambda$selectCrashFrame$7((Stackframe) obj);
                return lambda$selectCrashFrame$7;
            case 5:
                lambda$selectCrashFrame$8 = CustomGroupingHashProvider.lambda$selectCrashFrame$8((Stackframe) obj);
                return lambda$selectCrashFrame$8;
            default:
                return ((Optional) obj).isPresent();
        }
    }
}
