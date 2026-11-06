package androidx.compose.runtime;

import com.amazon.alexa.ra.core.ui.ProvideCardRuntimeThemeKt;
import com.amazon.alexa.ra.core.ui.RemarkableAlexaThemeKt;
import com.amazon.alexa.ra.core.ui.screen.RaMainScreenKt;
import com.amazon.alexa.ra.ui.AppAlexaThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class EffectsKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function2 f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ EffectsKt$$ExternalSyntheticLambda0(int i, int i2, Function2 function2) {
        this.$r8$classId = i2;
        this.f$0 = function2;
        this.f$1 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit LaunchedEffect$lambda$4;
        Unit ProvideCardRuntimeTheme$lambda$1;
        Unit RaTheme$lambda$8;
        Unit NoRippleTheme$lambda$60;
        Unit AppAlexaTheme$lambda$3;
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                LaunchedEffect$lambda$4 = EffectsKt.LaunchedEffect$lambda$4(this.f$0, this.f$1, composer, intValue);
                return LaunchedEffect$lambda$4;
            case 1:
                ProvideCardRuntimeTheme$lambda$1 = ProvideCardRuntimeThemeKt.ProvideCardRuntimeTheme$lambda$1(this.f$0, this.f$1, composer, intValue);
                return ProvideCardRuntimeTheme$lambda$1;
            case 2:
                RaTheme$lambda$8 = RemarkableAlexaThemeKt.RaTheme$lambda$8(this.f$0, this.f$1, composer, intValue);
                return RaTheme$lambda$8;
            case 3:
                NoRippleTheme$lambda$60 = RaMainScreenKt.NoRippleTheme$lambda$60(this.f$0, this.f$1, composer, intValue);
                return NoRippleTheme$lambda$60;
            default:
                AppAlexaTheme$lambda$3 = AppAlexaThemeKt.AppAlexaTheme$lambda$3(this.f$0, this.f$1, composer, intValue);
                return AppAlexaTheme$lambda$3;
        }
    }
}
