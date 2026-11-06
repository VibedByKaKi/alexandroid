package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class DashMediaSource$Factory$$ExternalSyntheticLambda0 implements DrmSessionManagerProvider {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DrmSessionManager f$0;

    public /* synthetic */ DashMediaSource$Factory$$ExternalSyntheticLambda0(DrmSessionManager drmSessionManager, int i) {
        this.$r8$classId = i;
        this.f$0 = drmSessionManager;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManagerProvider
    public final DrmSessionManager get(MediaItem mediaItem) {
        DrmSessionManager lambda$setDrmSessionManager$0;
        DrmSessionManager lambda$setDrmSessionManager$02;
        int i = this.$r8$classId;
        DrmSessionManager drmSessionManager = this.f$0;
        switch (i) {
            case 0:
                lambda$setDrmSessionManager$0 = DashMediaSource.Factory.lambda$setDrmSessionManager$0(drmSessionManager, mediaItem);
                return lambda$setDrmSessionManager$0;
            default:
                lambda$setDrmSessionManager$02 = SsMediaSource.Factory.lambda$setDrmSessionManager$0(drmSessionManager, mediaItem);
                return lambda$setDrmSessionManager$02;
        }
    }
}
