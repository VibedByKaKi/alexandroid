package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.drm.DrmSession;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UnstableApi
/* loaded from: classes14.dex */
public final class FormatHolder {

    @Nullable
    public DrmSession drmSession;

    @Nullable
    public Format format;

    public void clear() {
        this.drmSession = null;
        this.format = null;
    }
}
