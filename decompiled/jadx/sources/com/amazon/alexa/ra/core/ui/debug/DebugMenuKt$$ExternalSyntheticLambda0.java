package com.amazon.alexa.ra.core.ui.debug;

import androidx.compose.runtime.Composer;
import com.amazon.alexa.ra.core.ui.custom.CameraUnavailableDialogKt;
import com.amazon.alexa.ra.core.ui.custom.LoadingSpinnerKt;
import com.amazon.alexa.ra.core.ui.screen.LiveModeLearnMoreScreenKt;
import com.amazon.alexa.ra.core.ui.screen.utils.KeepScreenOnKt;
import com.amazon.alexa.ra.core.ui.utils.PermissionDeepLinkUtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class DebugMenuKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ DebugMenuKt$$ExternalSyntheticLambda0(int i, int i2, Function0 function0) {
        this.$r8$classId = i2;
        this.f$0 = function0;
        this.f$1 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit DebugMenuDialog$lambda$0;
        Unit CameraUnavailableDialog$lambda$0;
        Unit LoadingSpinner$lambda$4;
        Unit SettingsParagraph$lambda$29;
        Unit PrivacyParagraph$lambda$37;
        Unit KeepScreenOn$lambda$4;
        Unit DeepLinkErrorDialog$lambda$1;
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                DebugMenuDialog$lambda$0 = DebugMenuKt.DebugMenuDialog$lambda$0(this.f$0, this.f$1, composer, intValue);
                return DebugMenuDialog$lambda$0;
            case 1:
                CameraUnavailableDialog$lambda$0 = CameraUnavailableDialogKt.CameraUnavailableDialog$lambda$0(this.f$0, this.f$1, composer, intValue);
                return CameraUnavailableDialog$lambda$0;
            case 2:
                LoadingSpinner$lambda$4 = LoadingSpinnerKt.LoadingSpinner$lambda$4(this.f$0, this.f$1, composer, intValue);
                return LoadingSpinner$lambda$4;
            case 3:
                SettingsParagraph$lambda$29 = LiveModeLearnMoreScreenKt.SettingsParagraph$lambda$29(this.f$0, this.f$1, composer, intValue);
                return SettingsParagraph$lambda$29;
            case 4:
                PrivacyParagraph$lambda$37 = LiveModeLearnMoreScreenKt.PrivacyParagraph$lambda$37(this.f$0, this.f$1, composer, intValue);
                return PrivacyParagraph$lambda$37;
            case 5:
                KeepScreenOn$lambda$4 = KeepScreenOnKt.KeepScreenOn$lambda$4(this.f$0, this.f$1, composer, intValue);
                return KeepScreenOn$lambda$4;
            default:
                DeepLinkErrorDialog$lambda$1 = PermissionDeepLinkUtilsKt.DeepLinkErrorDialog$lambda$1(this.f$0, this.f$1, composer, intValue);
                return DeepLinkErrorDialog$lambda$1;
        }
    }
}
