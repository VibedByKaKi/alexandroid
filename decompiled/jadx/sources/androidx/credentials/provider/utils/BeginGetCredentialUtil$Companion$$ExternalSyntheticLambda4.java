package androidx.credentials.provider.utils;

import androidx.credentials.provider.utils.BeginCreateCredentialUtil;
import androidx.credentials.provider.utils.BeginGetCredentialUtil;
import java.util.function.Predicate;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda4 implements Predicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda4(Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean convertToJetpackResponse$lambda$7;
        boolean convertToJetpackResponse$lambda$3;
        boolean convertToJetpackResponse$lambda$13;
        boolean convertToJetpackResponse$lambda$10;
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                convertToJetpackResponse$lambda$7 = BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$7(function1, obj);
                return convertToJetpackResponse$lambda$7;
            case 1:
                convertToJetpackResponse$lambda$3 = BeginCreateCredentialUtil.Companion.convertToJetpackResponse$lambda$3(function1, obj);
                return convertToJetpackResponse$lambda$3;
            case 2:
                convertToJetpackResponse$lambda$13 = BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$13(function1, obj);
                return convertToJetpackResponse$lambda$13;
            default:
                convertToJetpackResponse$lambda$10 = BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$10(function1, obj);
                return convertToJetpackResponse$lambda$10;
        }
    }
}
