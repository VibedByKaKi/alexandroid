package com.amazon.alexa.accessory.frames.artifact;

import com.amazon.alexa.accessory.frames.artifact.SmartPlayArtifactManager;
import com.amazon.alexa.accessory.notificationpublisher.artifactdownloader.ArtifactDownloader;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class SmartPlayArtifactManager$$ExternalSyntheticLambda0 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SmartPlayArtifactManager f$0;
    public final /* synthetic */ SmartPlayArtifactManager.ArtifactType f$1;
    public final /* synthetic */ ArtifactDownloader f$2;

    public /* synthetic */ SmartPlayArtifactManager$$ExternalSyntheticLambda0(SmartPlayArtifactManager smartPlayArtifactManager, SmartPlayArtifactManager.ArtifactType artifactType, ArtifactDownloader artifactDownloader, int i) {
        this.$r8$classId = i;
        this.f$0 = smartPlayArtifactManager;
        this.f$1 = artifactType;
        this.f$2 = artifactDownloader;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Boolean lambda$downloadAndSaveArtifact$4;
        Long lambda$getLastUpdatedTimeForArtifact$5;
        switch (this.$r8$classId) {
            case 0:
                lambda$downloadAndSaveArtifact$4 = this.f$0.lambda$downloadAndSaveArtifact$4(this.f$1, this.f$2);
                return lambda$downloadAndSaveArtifact$4;
            default:
                lambda$getLastUpdatedTimeForArtifact$5 = this.f$0.lambda$getLastUpdatedTimeForArtifact$5(this.f$1, this.f$2);
                return lambda$getLastUpdatedTimeForArtifact$5;
        }
    }
}
