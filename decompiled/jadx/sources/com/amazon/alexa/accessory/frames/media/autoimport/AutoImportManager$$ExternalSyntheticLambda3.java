package com.amazon.alexa.accessory.frames.media.autoimport;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class AutoImportManager$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AutoImportManager f$0;

    public /* synthetic */ AutoImportManager$$ExternalSyntheticLambda3(AutoImportManager autoImportManager, int i) {
        this.$r8$classId = i;
        this.f$0 = autoImportManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit checkForExistingAssets$lambda$6;
        Unit start$lambda$0;
        switch (this.$r8$classId) {
            case 0:
                checkForExistingAssets$lambda$6 = AutoImportManager.checkForExistingAssets$lambda$6(this.f$0, (Throwable) obj);
                return checkForExistingAssets$lambda$6;
            default:
                start$lambda$0 = AutoImportManager.start$lambda$0(this.f$0, ((Integer) obj).intValue());
                return start$lambda$0;
        }
    }
}
