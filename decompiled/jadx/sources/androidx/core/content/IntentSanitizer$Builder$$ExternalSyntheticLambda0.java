package androidx.core.content;

import android.content.ComponentName;
import android.net.Uri;
import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class IntentSanitizer$Builder$$ExternalSyntheticLambda0 implements Predicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ IntentSanitizer$Builder$$ExternalSyntheticLambda0(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        boolean lambda$allowExtraOutput$16;
        boolean lambda$allowComponentWithPackage$9;
        boolean lambda$allowDataWithAuthority$8;
        boolean lambda$allowClipDataUriWithAuthority$11;
        boolean lambda$allowExtraStreamUriWithAuthority$15;
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                lambda$allowExtraOutput$16 = IntentSanitizer.Builder.lambda$allowExtraOutput$16(str, (Uri) obj);
                return lambda$allowExtraOutput$16;
            case 1:
                return str.equals((String) obj);
            case 2:
                lambda$allowComponentWithPackage$9 = IntentSanitizer.Builder.lambda$allowComponentWithPackage$9(str, (ComponentName) obj);
                return lambda$allowComponentWithPackage$9;
            case 3:
                lambda$allowDataWithAuthority$8 = IntentSanitizer.Builder.lambda$allowDataWithAuthority$8(str, (Uri) obj);
                return lambda$allowDataWithAuthority$8;
            case 4:
                lambda$allowClipDataUriWithAuthority$11 = IntentSanitizer.Builder.lambda$allowClipDataUriWithAuthority$11(str, (Uri) obj);
                return lambda$allowClipDataUriWithAuthority$11;
            default:
                lambda$allowExtraStreamUriWithAuthority$15 = IntentSanitizer.Builder.lambda$allowExtraStreamUriWithAuthority$15(str, (Uri) obj);
                return lambda$allowExtraStreamUriWithAuthority$15;
        }
    }
}
