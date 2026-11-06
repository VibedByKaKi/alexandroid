package androidx.compose.ui.text;

import androidx.compose.ui.text.intl.LocaleList;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class AnnotatedStringKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LocaleList f$0;

    public /* synthetic */ AnnotatedStringKt$$ExternalSyntheticLambda0(int i, LocaleList localeList) {
        this.$r8$classId = i;
        this.f$0 = localeList;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String decapitalize$lambda$15;
        String capitalize$lambda$14;
        String upperCase$lambda$12;
        String lowerCase$lambda$13;
        int i = this.$r8$classId;
        String str = (String) obj;
        int intValue = ((Integer) obj2).intValue();
        int intValue2 = ((Integer) obj3).intValue();
        LocaleList localeList = this.f$0;
        switch (i) {
            case 0:
                decapitalize$lambda$15 = AnnotatedStringKt.decapitalize$lambda$15(localeList, str, intValue, intValue2);
                return decapitalize$lambda$15;
            case 1:
                capitalize$lambda$14 = AnnotatedStringKt.capitalize$lambda$14(localeList, str, intValue, intValue2);
                return capitalize$lambda$14;
            case 2:
                upperCase$lambda$12 = AnnotatedStringKt.toUpperCase$lambda$12(localeList, str, intValue, intValue2);
                return upperCase$lambda$12;
            default:
                lowerCase$lambda$13 = AnnotatedStringKt.toLowerCase$lambda$13(localeList, str, intValue, intValue2);
                return lowerCase$lambda$13;
        }
    }
}
