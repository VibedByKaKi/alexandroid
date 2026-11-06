package com.google.android.exoplayer2.source.hls;

import androidx.annotation.Nullable;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class SampleQueueMappingException extends IOException {
    public SampleQueueMappingException(@Nullable String str) {
        super(a$$ExternalSyntheticOutline0.m("Unable to bind a sample queue to TrackGroup with mime type ", str, "."));
    }
}
