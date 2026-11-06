package com.amazon.alexa.accessory.frames.artifact;

import com.amazon.alexa.accessory.frames.artifact.ModelArtifactManager;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class ModelArtifactManager$$ExternalSyntheticLambda0 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ModelArtifactManager f$0;
    public final /* synthetic */ ModelArtifactManager.ModelCategory f$1;

    public /* synthetic */ ModelArtifactManager$$ExternalSyntheticLambda0(ModelArtifactManager modelArtifactManager, ModelArtifactManager.ModelCategory modelCategory, int i) {
        this.$r8$classId = i;
        this.f$0 = modelArtifactManager;
        this.f$1 = modelCategory;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Boolean lambda$onStoredPathMissing$5;
        Boolean lambda$removeDownloaderRecord$8;
        switch (this.$r8$classId) {
            case 0:
                lambda$onStoredPathMissing$5 = this.f$0.lambda$onStoredPathMissing$5(this.f$1);
                return lambda$onStoredPathMissing$5;
            default:
                lambda$removeDownloaderRecord$8 = this.f$0.lambda$removeDownloaderRecord$8(this.f$1);
                return lambda$removeDownloaderRecord$8;
        }
    }
}
