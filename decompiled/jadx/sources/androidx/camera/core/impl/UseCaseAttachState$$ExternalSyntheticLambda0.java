package androidx.camera.core.impl;

import androidx.camera.core.impl.UseCaseAttachState;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class UseCaseAttachState$$ExternalSyntheticLambda0 implements UseCaseAttachState.AttachStateFilter {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ UseCaseAttachState$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // androidx.camera.core.impl.UseCaseAttachState.AttachStateFilter
    public final boolean filter(UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo) {
        boolean attached;
        boolean attached2;
        boolean attached3;
        boolean lambda$getActiveAndAttachedSessionConfigs$3;
        switch (this.$r8$classId) {
            case 0:
                attached = useCaseAttachInfo.getAttached();
                return attached;
            case 1:
                attached2 = useCaseAttachInfo.getAttached();
                return attached2;
            case 2:
                attached3 = useCaseAttachInfo.getAttached();
                return attached3;
            default:
                lambda$getActiveAndAttachedSessionConfigs$3 = UseCaseAttachState.lambda$getActiveAndAttachedSessionConfigs$3(useCaseAttachInfo);
                return lambda$getActiveAndAttachedSessionConfigs$3;
        }
    }
}
