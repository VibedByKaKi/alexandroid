package com.imagepicker;

import android.media.MediaMetadataRetriever;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class CustomMediaMetadataRetriever extends MediaMetadataRetriever implements AutoCloseable {
    @Override // android.media.MediaMetadataRetriever, java.lang.AutoCloseable
    public void close() throws IOException {
        release();
    }
}
