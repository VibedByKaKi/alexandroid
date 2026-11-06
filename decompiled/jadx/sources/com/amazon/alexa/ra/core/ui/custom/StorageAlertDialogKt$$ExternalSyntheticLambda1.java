package com.amazon.alexa.ra.core.ui.custom;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class StorageAlertDialogKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ StorageAlertDialogKt$$ExternalSyntheticLambda1(int i, int i2, Function1 function1) {
        this.$r8$classId = i2;
        this.f$0 = function1;
        this.f$1 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit StorageAlertDialog$lambda$2;
        Unit MaliciousUrlAlertDialog$lambda$8;
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                StorageAlertDialog$lambda$2 = StorageAlertDialogKt.StorageAlertDialog$lambda$2(this.f$0, this.f$1, composer, intValue);
                return StorageAlertDialog$lambda$2;
            default:
                MaliciousUrlAlertDialog$lambda$8 = MaliciousUrlAlertDialogKt.MaliciousUrlAlertDialog$lambda$8(this.f$0, this.f$1, composer, intValue);
                return MaliciousUrlAlertDialog$lambda$8;
        }
    }
}
