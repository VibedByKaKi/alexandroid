package com.amazon.alexa.accessory.frames.artifact;

import com.amazon.alexa.accessory.notificationpublisher.artifactdownloader.ArtifactDownloader;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class TopContactArtifactManager$$ExternalSyntheticLambda3 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TopContactArtifactManager f$0;
    public final /* synthetic */ ArtifactDownloader f$1;

    public /* synthetic */ TopContactArtifactManager$$ExternalSyntheticLambda3(TopContactArtifactManager topContactArtifactManager, ArtifactDownloader artifactDownloader, int i) {
        this.$r8$classId = i;
        this.f$0 = topContactArtifactManager;
        this.f$1 = artifactDownloader;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Long lambda$getLastUpdatedTimeForArtifact$7;
        Boolean lambda$downloadAndSaveArtifact$3;
        switch (this.$r8$classId) {
            case 0:
                lambda$getLastUpdatedTimeForArtifact$7 = this.f$0.lambda$getLastUpdatedTimeForArtifact$7(this.f$1);
                return lambda$getLastUpdatedTimeForArtifact$7;
            default:
                lambda$downloadAndSaveArtifact$3 = this.f$0.lambda$downloadAndSaveArtifact$3(this.f$1);
                return lambda$downloadAndSaveArtifact$3;
        }
    }
}
