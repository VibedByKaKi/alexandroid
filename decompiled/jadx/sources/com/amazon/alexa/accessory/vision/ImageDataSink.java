package com.amazon.alexa.accessory.vision;

import android.os.ParcelFileDescriptor;
import com.amazon.alexa.accessory.internal.util.Logger;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class ImageDataSink extends OutputStream {
    private static final String TAG = "ImageDataSink:";
    private final OutputStream outputStream;
    private final ParcelFileDescriptor readDescriptor;
    private final ParcelFileDescriptor writeDescriptor;

    public ImageDataSink() throws IOException {
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        this.readDescriptor = createPipe[0];
        ParcelFileDescriptor parcelFileDescriptor = createPipe[1];
        this.writeDescriptor = parcelFileDescriptor;
        this.outputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.outputStream != null) {
                Logger.d("%s Closing output stream", TAG);
                this.outputStream.close();
            }
        } catch (IOException e) {
            Logger.e("%s Could not close output stream.", e, TAG);
        }
    }

    public synchronized ParcelFileDescriptor getReadDescriptor() {
        return this.readDescriptor;
    }

    public synchronized OutputStream openForWriting() {
        return this;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.outputStream.write(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.outputStream.write(bArr);
    }
}
