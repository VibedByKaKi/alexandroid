package com.amazon.alexa.accessory.frames.artifact;

import com.amazon.alexa.accessory.frames.artifact.SmartPlayArtifactManager;
import com.amazon.alexa.accessory.notificationpublisher.artifactdownloader.ArtifactDownloader;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class SmartPlayArtifactManager$$ExternalSyntheticLambda6 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ SmartPlayArtifactManager$$ExternalSyntheticLambda6(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Boolean lambda$isFilePathKeyNotAvailable$6;
        Boolean lambda$downloadAndSaveArtifact$4;
        Boolean lambda$downloadAndSaveArtifact$42;
        switch (this.$r8$classId) {
            case 0:
                lambda$isFilePathKeyNotAvailable$6 = ((SmartPlayArtifactManager) this.f$0).lambda$isFilePathKeyNotAvailable$6((SmartPlayArtifactManager.ArtifactType) this.f$1);
                return lambda$isFilePathKeyNotAvailable$6;
            case 1:
                lambda$downloadAndSaveArtifact$4 = ((TapRoutinesArtifactManager) this.f$0).lambda$downloadAndSaveArtifact$4((ArtifactDownloader) this.f$1);
                return lambda$downloadAndSaveArtifact$4;
            default:
                lambda$downloadAndSaveArtifact$42 = ((TranslationArtifactDownloader) this.f$0).lambda$downloadAndSaveArtifact$4((ArtifactDownloader) this.f$1);
                return lambda$downloadAndSaveArtifact$42;
        }
    }
}
