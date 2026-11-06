package com.amazon.alexa.accessory.frames.artifact;

import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class ModelArtifactManager$$ExternalSyntheticLambda6 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ArtifactManager f$0;

    public /* synthetic */ ModelArtifactManager$$ExternalSyntheticLambda6(ArtifactManager artifactManager, int i) {
        this.$r8$classId = i;
        this.f$0 = artifactManager;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        SingleSource lambda$downloadArtifact$0;
        SingleSource lambda$downloadArtifact$02;
        SingleSource lambda$downloadArtifact$1;
        int i = this.$r8$classId;
        ArtifactManager artifactManager = this.f$0;
        switch (i) {
            case 0:
                lambda$downloadArtifact$0 = ((ModelArtifactManager) artifactManager).lambda$downloadArtifact$0((Long) obj);
                return lambda$downloadArtifact$0;
            case 1:
                lambda$downloadArtifact$02 = ((TapRoutinesArtifactManager) artifactManager).lambda$downloadArtifact$0((Long) obj);
                return lambda$downloadArtifact$02;
            default:
                lambda$downloadArtifact$1 = ((TapRoutinesArtifactManager) artifactManager).lambda$downloadArtifact$1((Boolean) obj);
                return lambda$downloadArtifact$1;
        }
    }
}
