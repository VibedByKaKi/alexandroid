package com.google.android.exoplayer2.transformer;

import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
interface Muxer {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Factory {
        Muxer create(ParcelFileDescriptor parcelFileDescriptor, String str) throws IOException;

        Muxer create(String str, String str2) throws IOException;

        boolean supportsOutputMimeType(String str);
    }

    int addTrack(Format format);

    void release(boolean z);

    boolean supportsSampleMimeType(@Nullable String str);

    void writeSampleData(int i, ByteBuffer byteBuffer, boolean z, long j);
}
