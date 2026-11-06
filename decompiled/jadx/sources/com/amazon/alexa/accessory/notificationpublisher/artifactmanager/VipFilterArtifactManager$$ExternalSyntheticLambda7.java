package com.amazon.alexa.accessory.notificationpublisher.artifactmanager;

import com.amazon.alexa.accessory.notificationpublisher.artifactdownloader.ArtifactDownloader;
import com.amazon.alexa.accessory.notificationpublisher.artifactmanager.VipFilterArtifactManager;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class VipFilterArtifactManager$$ExternalSyntheticLambda7 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ VipFilterArtifactManager f$0;
    public final /* synthetic */ VipFilterArtifactManager.ArtifactType f$1;
    public final /* synthetic */ ArtifactDownloader f$2;

    public /* synthetic */ VipFilterArtifactManager$$ExternalSyntheticLambda7(VipFilterArtifactManager vipFilterArtifactManager, VipFilterArtifactManager.ArtifactType artifactType, ArtifactDownloader artifactDownloader, int i) {
        this.$r8$classId = i;
        this.f$0 = vipFilterArtifactManager;
        this.f$1 = artifactType;
        this.f$2 = artifactDownloader;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Boolean lambda$downloadAndSaveArtifact$5;
        Long lambda$getLastUpdatedTimeForArtifact$6;
        switch (this.$r8$classId) {
            case 0:
                lambda$downloadAndSaveArtifact$5 = this.f$0.lambda$downloadAndSaveArtifact$5(this.f$1, this.f$2);
                return lambda$downloadAndSaveArtifact$5;
            default:
                lambda$getLastUpdatedTimeForArtifact$6 = this.f$0.lambda$getLastUpdatedTimeForArtifact$6(this.f$1, this.f$2);
                return lambda$getLastUpdatedTimeForArtifact$6;
        }
    }
}
