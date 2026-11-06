package androidx.media3.exoplayer.drm;

import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class DefaultDrmSession$$ExternalSyntheticLambda0 implements Consumer, DrmSessionManager.DrmSessionReference {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ DefaultDrmSession$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        DrmSessionEventListener.EventDispatcher eventDispatcher = (DrmSessionEventListener.EventDispatcher) obj;
        switch (this.$r8$classId) {
            case 0:
                eventDispatcher.drmSessionAcquired(3);
                break;
            case 1:
                eventDispatcher.drmKeysRemoved();
                break;
            case 2:
                eventDispatcher.drmKeysLoaded();
                break;
            default:
                eventDispatcher.drmKeysRestored();
                break;
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference
    public void release() {
        DrmSessionManager.DrmSessionReference.lambda$static$0();
    }
}
