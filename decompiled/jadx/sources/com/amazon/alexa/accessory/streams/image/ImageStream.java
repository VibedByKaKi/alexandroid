package com.amazon.alexa.accessory.streams.image;

import com.amazon.alexa.accessory.AccessoryStream;
import com.amazon.alexa.accessory.internal.util.IOUtils;
import com.amazon.alexa.accessory.internal.util.Logger;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.io.Sink;
import com.amazon.alexa.accessory.io.SizedSource;
import java.io.Closeable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class ImageStream implements Closeable, AccessoryStream {
    private static final String TAG = "ImageStream:";
    private final byte[] buffer;
    private final Callback callback;
    private boolean finished;
    private int readBytes;
    private final Sink sink;
    private final int size;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Callback {
        void onComplete();

        void onStart();
    }

    public ImageStream(Sink sink, int i, Callback callback) {
        Preconditions.notNull(sink, "sink");
        Preconditions.notNegative(i, "size");
        Preconditions.notNull(callback, "callback");
        this.sink = sink;
        this.size = i;
        this.callback = callback;
        this.buffer = new byte[2048];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.finished) {
            return;
        }
        this.finished = true;
        int i = this.readBytes;
        if (i < this.size) {
            Logger.w("%s close() called mid-transfer at %d/%d; closing sink to release pipe", TAG, Integer.valueOf(i), Integer.valueOf(this.size));
        }
        IOUtils.closeQuietly(this.sink);
    }

    @Override // com.amazon.alexa.accessory.AccessoryStream
    public int getId() {
        return 8;
    }

    @Override // com.amazon.alexa.accessory.AccessoryStream
    public boolean handleData(SizedSource sizedSource) throws Exception {
        Preconditions.notNull(sizedSource, "data");
        if (this.finished) {
            return false;
        }
        sizedSource.reset();
        if (this.readBytes == 0) {
            this.callback.onStart();
        }
        int min = Math.min(this.size - this.readBytes, sizedSource.size());
        this.readBytes += min;
        try {
            IOUtils.transfer(sizedSource, this.sink, this.buffer, min);
            Logger.d("%s handleData() read %d/%d", TAG, Integer.valueOf(this.readBytes), Integer.valueOf(this.size));
            if (this.readBytes >= this.size) {
                this.finished = true;
                this.callback.onComplete();
            }
            return true;
        } catch (Exception e) {
            Logger.e("%s handleData() failed at %d/%d on thread %s", e, TAG, Integer.valueOf(this.readBytes), Integer.valueOf(this.size), Thread.currentThread().getName());
            throw e;
        }
    }
}
