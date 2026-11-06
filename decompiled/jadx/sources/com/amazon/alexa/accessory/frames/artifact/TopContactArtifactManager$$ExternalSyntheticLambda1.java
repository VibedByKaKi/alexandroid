package com.amazon.alexa.accessory.frames.artifact;

import com.amazon.alexa.accessory.frames.artifact.TranslationArtifactDownloader;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class TopContactArtifactManager$$ExternalSyntheticLambda1 implements Consumer {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ TopContactArtifactManager$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                TopContactArtifactManager.lambda$checkForUpdatesForDownloadedAssets$5((Boolean) obj);
                break;
            case 1:
                TranslationArtifactDownloader.AnonymousClass1.lambda$onFailure$0((Boolean) obj);
                break;
            case 2:
                TranslationArtifactDownloader.AnonymousClass1.lambda$onFailure$1((Throwable) obj);
                break;
            case 3:
                TapRoutinesArtifactManager.lambda$downloadArtifact$2((Boolean) obj);
                break;
            case 4:
                TapRoutinesArtifactManager.lambda$downloadArtifact$3((Throwable) obj);
                break;
            case 5:
                TopContactArtifactManager.lambda$checkForUpdatesForDownloadedAssets$6((Throwable) obj);
                break;
            case 6:
                TopContactArtifactManager.lambda$downloadArtifact$1((Boolean) obj);
                break;
            case 7:
                TopContactArtifactManager.lambda$downloadArtifact$2((Throwable) obj);
                break;
            case 8:
                TranslationArtifactDownloader.lambda$downloadArtifact$2((Boolean) obj);
                break;
            default:
                TranslationArtifactDownloader.lambda$downloadArtifact$3((Throwable) obj);
                break;
        }
    }
}
