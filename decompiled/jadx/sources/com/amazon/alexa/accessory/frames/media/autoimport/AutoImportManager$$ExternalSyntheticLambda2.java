package com.amazon.alexa.accessory.frames.media.autoimport;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class AutoImportManager$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AutoImportManager f$0;

    public /* synthetic */ AutoImportManager$$ExternalSyntheticLambda2(AutoImportManager autoImportManager, int i) {
        this.$r8$classId = i;
        this.f$0 = autoImportManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit checkForExistingAssets$lambda$5;
        Unit subscribeToAssetNotifications$lambda$2;
        int i = this.$r8$classId;
        AutoImportManager autoImportManager = this.f$0;
        switch (i) {
            case 0:
                checkForExistingAssets$lambda$5 = AutoImportManager.checkForExistingAssets$lambda$5(autoImportManager);
                return checkForExistingAssets$lambda$5;
            default:
                subscribeToAssetNotifications$lambda$2 = AutoImportManager.subscribeToAssetNotifications$lambda$2(autoImportManager);
                return subscribeToAssetNotifications$lambda$2;
        }
    }
}
