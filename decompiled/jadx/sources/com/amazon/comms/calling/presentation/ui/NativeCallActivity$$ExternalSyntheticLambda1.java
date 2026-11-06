package com.amazon.comms.calling.presentation.ui;

import com.amazon.comms.calling.presentation.viewmodel.NativeCallViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class NativeCallActivity$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ NativeCallActivity f$0;

    public /* synthetic */ NativeCallActivity$$ExternalSyntheticLambda1(NativeCallActivity nativeCallActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = nativeCallActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit onNewIntent$lambda$6;
        Unit onNewIntent$lambda$7;
        NativeCallViewModel viewModel_delegate$lambda$1;
        String[] permissionsNeeded_delegate$lambda$4;
        int i = this.$r8$classId;
        NativeCallActivity nativeCallActivity = this.f$0;
        switch (i) {
            case 0:
                onNewIntent$lambda$6 = NativeCallActivity.onNewIntent$lambda$6(nativeCallActivity);
                return onNewIntent$lambda$6;
            case 1:
                onNewIntent$lambda$7 = NativeCallActivity.onNewIntent$lambda$7(nativeCallActivity);
                return onNewIntent$lambda$7;
            case 2:
                viewModel_delegate$lambda$1 = NativeCallActivity.viewModel_delegate$lambda$1(nativeCallActivity);
                return viewModel_delegate$lambda$1;
            default:
                permissionsNeeded_delegate$lambda$4 = NativeCallActivity.permissionsNeeded_delegate$lambda$4(nativeCallActivity);
                return permissionsNeeded_delegate$lambda$4;
        }
    }
}
