package com.brentvatne.exoplayer;

import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class CMCDConfig$$ExternalSyntheticLambda0 implements CmcdConfiguration.Factory {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ CMCDConfig$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory
    public final CmcdConfiguration createCmcdConfiguration(MediaItem mediaItem) {
        CmcdConfiguration createCmcdConfiguration;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                createCmcdConfiguration = ((CMCDConfig) obj).createCmcdConfiguration(mediaItem);
                return createCmcdConfiguration;
            default:
                return ((CmcdConfiguration.Factory) obj).createCmcdConfiguration(mediaItem);
        }
    }
}
