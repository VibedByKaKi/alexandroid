package com.amazon.alexa.accessory.streams.voice;

import com.amazon.alexa.accessory.AccessoryStream;
import com.amazon.alexa.accessory.internal.util.IOUtils;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.io.Sink;
import com.amazon.alexa.accessory.io.SizedSource;
import java.io.Closeable;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class VoiceStream implements Closeable, AccessoryStream {
    private final byte[] buffer;
    private final Callback callback;
    private volatile boolean closed;
    private final Sink sink;
    private int total;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Callback {
        void onError(Throwable th);
    }

    public VoiceStream(Sink sink, Callback callback) {
        Preconditions.notNull(sink, "sink");
        Preconditions.notNull(callback, "callback");
        this.sink = sink;
        this.buffer = new byte[2048];
        this.callback = callback;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
    }

    @Override // com.amazon.alexa.accessory.AccessoryStream
    public int getId() {
        return 1;
    }

    public int getTotal() {
        return this.total;
    }

    @Override // com.amazon.alexa.accessory.AccessoryStream
    public boolean handleData(SizedSource sizedSource) throws Exception {
        sizedSource.reset();
        try {
            IOUtils.transfer(sizedSource, this.sink, this.buffer);
            this.total = sizedSource.size() + this.total;
            return true;
        } catch (IOException e) {
            if (this.closed) {
                return false;
            }
            this.closed = true;
            this.callback.onError(e);
            return false;
        }
    }
}
