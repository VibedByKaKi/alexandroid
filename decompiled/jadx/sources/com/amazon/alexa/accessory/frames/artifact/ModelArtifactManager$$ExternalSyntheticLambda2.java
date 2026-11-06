package com.amazon.alexa.accessory.frames.artifact;

import com.amazon.alexa.accessory.frames.artifact.ModelArtifactManager;
import com.amazon.alexa.accessory.frames.artifact.SmartPlayArtifactManager;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class ModelArtifactManager$$ExternalSyntheticLambda2 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Enum f$0;

    public /* synthetic */ ModelArtifactManager$$ExternalSyntheticLambda2(Enum r1, int i) {
        this.$r8$classId = i;
        this.f$0 = r1;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Enum r1 = this.f$0;
        switch (i) {
            case 0:
                ModelArtifactManager.lambda$onStoredPathMissing$7((ModelArtifactManager.ModelCategory) r1, (Throwable) obj);
                break;
            case 1:
                ModelArtifactManager.AnonymousClass1.lambda$onFailure$0((ModelArtifactManager.ModelCategory) r1, (Boolean) obj);
                break;
            case 2:
                ModelArtifactManager.lambda$removeDownloaderRecord$9((ModelArtifactManager.ModelCategory) r1, (Boolean) obj);
                break;
            case 3:
                ModelArtifactManager.lambda$removeDownloaderRecord$10((ModelArtifactManager.ModelCategory) r1, (Throwable) obj);
                break;
            case 4:
                ModelArtifactManager.lambda$downloadArtifact$2((ModelArtifactManager.ModelCategory) r1, (Boolean) obj);
                break;
            case 5:
                ModelArtifactManager.lambda$downloadArtifact$3((ModelArtifactManager.ModelCategory) r1, (Throwable) obj);
                break;
            default:
                SmartPlayArtifactManager.lambda$downloadArtifact$2((SmartPlayArtifactManager.ArtifactType) r1, (Boolean) obj);
                break;
        }
    }
}
