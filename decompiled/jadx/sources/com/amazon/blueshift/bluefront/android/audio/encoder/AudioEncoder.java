package com.amazon.blueshift.bluefront.android.audio.encoder;

import com.google.common.net.MediaType;
import java.io.Closeable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface AudioEncoder extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    byte[] encode(short[] sArr, int i) throws AudioEncoderException;

    int getFrameSize();

    MediaType getMediaType();

    int getPacketSize();
}
