package com.amazon.alexa.ra.core.ui.custom;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class LiveModeViewKt$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ LiveModeViewKt$$ExternalSyntheticLambda2(Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit ScreenShareButton$lambda$74$lambda$73;
        Unit CancelButton$lambda$64$lambda$63;
        Unit UnMutedButton$lambda$54$lambda$53;
        Unit CameraButton$lambda$69$lambda$68;
        Unit MaliciousUrlAlertDialog$lambda$7$lambda$6;
        Unit StorageAlertDialog$lambda$1$lambda$0;
        Unit VoiceStatusDisplayField$lambda$12$lambda$11$lambda$10;
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                ScreenShareButton$lambda$74$lambda$73 = LiveModeViewKt.ScreenShareButton$lambda$74$lambda$73(function1);
                return ScreenShareButton$lambda$74$lambda$73;
            case 1:
                CancelButton$lambda$64$lambda$63 = LiveModeViewKt.CancelButton$lambda$64$lambda$63(function1);
                return CancelButton$lambda$64$lambda$63;
            case 2:
                UnMutedButton$lambda$54$lambda$53 = LiveModeViewKt.UnMutedButton$lambda$54$lambda$53(function1);
                return UnMutedButton$lambda$54$lambda$53;
            case 3:
                CameraButton$lambda$69$lambda$68 = LiveModeViewKt.CameraButton$lambda$69$lambda$68(function1);
                return CameraButton$lambda$69$lambda$68;
            case 4:
                MaliciousUrlAlertDialog$lambda$7$lambda$6 = MaliciousUrlAlertDialogKt.MaliciousUrlAlertDialog$lambda$7$lambda$6(function1);
                return MaliciousUrlAlertDialog$lambda$7$lambda$6;
            case 5:
                StorageAlertDialog$lambda$1$lambda$0 = StorageAlertDialogKt.StorageAlertDialog$lambda$1$lambda$0(function1);
                return StorageAlertDialog$lambda$1$lambda$0;
            default:
                VoiceStatusDisplayField$lambda$12$lambda$11$lambda$10 = VoiceStatusDisplayFieldKt.VoiceStatusDisplayField$lambda$12$lambda$11$lambda$10(function1);
                return VoiceStatusDisplayField$lambda$12$lambda$11$lambda$10;
        }
    }
}
