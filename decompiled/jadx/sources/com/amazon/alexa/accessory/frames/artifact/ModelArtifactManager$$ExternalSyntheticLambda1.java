package com.amazon.alexa.accessory.frames.artifact;

import com.amazon.alexa.accessory.frames.artifact.ModelArtifactManager;
import com.amazon.alexa.accessory.frames.artifact.SmartPlayArtifactManager;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class ModelArtifactManager$$ExternalSyntheticLambda1 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Enum f$1;

    public /* synthetic */ ModelArtifactManager$$ExternalSyntheticLambda1(Object obj, Enum r2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = r2;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((ModelArtifactManager) this.f$0).lambda$onStoredPathMissing$6((ModelArtifactManager.ModelCategory) this.f$1, (Boolean) obj);
                break;
            case 1:
                ((ModelArtifactManager.AnonymousClass1) this.f$0).lambda$onFailure$1((ModelArtifactManager.ModelCategory) this.f$1, (Throwable) obj);
                break;
            default:
                ((SmartPlayArtifactManager) this.f$0).lambda$downloadArtifact$3((SmartPlayArtifactManager.ArtifactType) this.f$1, (Throwable) obj);
                break;
        }
    }
}
