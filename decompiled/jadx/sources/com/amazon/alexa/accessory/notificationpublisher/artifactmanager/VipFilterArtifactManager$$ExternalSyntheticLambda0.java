package com.amazon.alexa.accessory.notificationpublisher.artifactmanager;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class VipFilterArtifactManager$$ExternalSyntheticLambda0 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ VipFilterArtifactManager f$0;

    public /* synthetic */ VipFilterArtifactManager$$ExternalSyntheticLambda0(VipFilterArtifactManager vipFilterArtifactManager, int i) {
        this.$r8$classId = i;
        this.f$0 = vipFilterArtifactManager;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Boolean lambda$checkForUpdatesForDownloadedAssets$7;
        Boolean lambda$checkIfTemplatesNeedDownload$10;
        int i = this.$r8$classId;
        VipFilterArtifactManager vipFilterArtifactManager = this.f$0;
        switch (i) {
            case 0:
                lambda$checkForUpdatesForDownloadedAssets$7 = vipFilterArtifactManager.lambda$checkForUpdatesForDownloadedAssets$7();
                return lambda$checkForUpdatesForDownloadedAssets$7;
            default:
                lambda$checkIfTemplatesNeedDownload$10 = vipFilterArtifactManager.lambda$checkIfTemplatesNeedDownload$10();
                return lambda$checkIfTemplatesNeedDownload$10;
        }
    }
}
