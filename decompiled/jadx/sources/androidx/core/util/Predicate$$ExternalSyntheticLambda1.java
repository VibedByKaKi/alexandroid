package androidx.core.util;

import android.content.ClipData;
import android.content.ComponentName;
import android.net.Uri;
import androidx.core.content.IntentSanitizer;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class Predicate$$ExternalSyntheticLambda1 implements Predicate {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Predicate$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        boolean isNull;
        boolean lambda$allowAnyComponent$10;
        boolean lambda$allowExtra$14;
        boolean lambda$new$0;
        boolean lambda$new$1;
        boolean lambda$new$2;
        boolean lambda$new$3;
        boolean lambda$new$4;
        boolean lambda$new$5;
        boolean lambda$new$6;
        boolean lambda$new$7;
        boolean lambda$allowExtra$12;
        switch (this.$r8$classId) {
            case 0:
                isNull = Objects.isNull(obj);
                return isNull;
            case 1:
                lambda$allowAnyComponent$10 = IntentSanitizer.Builder.lambda$allowAnyComponent$10((ComponentName) obj);
                return lambda$allowAnyComponent$10;
            case 2:
                lambda$allowExtra$14 = IntentSanitizer.Builder.lambda$allowExtra$14(obj);
                return lambda$allowExtra$14;
            case 3:
                lambda$new$0 = IntentSanitizer.Builder.lambda$new$0((String) obj);
                return lambda$new$0;
            case 4:
                lambda$new$1 = IntentSanitizer.Builder.lambda$new$1((Uri) obj);
                return lambda$new$1;
            case 5:
                lambda$new$2 = IntentSanitizer.Builder.lambda$new$2((String) obj);
                return lambda$new$2;
            case 6:
                lambda$new$3 = IntentSanitizer.Builder.lambda$new$3((String) obj);
                return lambda$new$3;
            case 7:
                lambda$new$4 = IntentSanitizer.Builder.lambda$new$4((String) obj);
                return lambda$new$4;
            case 8:
                lambda$new$5 = IntentSanitizer.Builder.lambda$new$5((ComponentName) obj);
                return lambda$new$5;
            case 9:
                lambda$new$6 = IntentSanitizer.Builder.lambda$new$6((Uri) obj);
                return lambda$new$6;
            case 10:
                lambda$new$7 = IntentSanitizer.Builder.lambda$new$7((ClipData) obj);
                return lambda$new$7;
            default:
                lambda$allowExtra$12 = IntentSanitizer.Builder.lambda$allowExtra$12(obj);
                return lambda$allowExtra$12;
        }
    }
}
