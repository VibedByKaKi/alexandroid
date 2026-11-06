package androidx.media3.exoplayer.hls;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UnstableApi
/* loaded from: classes14.dex */
public final class SampleQueueMappingException extends IOException {
    public SampleQueueMappingException(@Nullable String str) {
        super(a$$ExternalSyntheticOutline0.m("Unable to bind a sample queue to TrackGroup with MIME type ", str, "."));
    }
}
