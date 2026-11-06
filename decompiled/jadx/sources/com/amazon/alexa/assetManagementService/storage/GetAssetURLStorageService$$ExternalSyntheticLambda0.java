package com.amazon.alexa.assetManagementService.storage;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class GetAssetURLStorageService$$ExternalSyntheticLambda0 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GetAssetURLStorageService f$0;

    public /* synthetic */ GetAssetURLStorageService$$ExternalSyntheticLambda0(GetAssetURLStorageService getAssetURLStorageService, int i) {
        this.$r8$classId = i;
        this.f$0 = getAssetURLStorageService;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        List lambda$getAllBundleIds$4;
        List lambda$loadAll$2;
        int i = this.$r8$classId;
        GetAssetURLStorageService getAssetURLStorageService = this.f$0;
        switch (i) {
            case 0:
                lambda$getAllBundleIds$4 = getAssetURLStorageService.lambda$getAllBundleIds$4();
                return lambda$getAllBundleIds$4;
            default:
                lambda$loadAll$2 = getAssetURLStorageService.lambda$loadAll$2();
                return lambda$loadAll$2;
        }
    }
}
