package com.amazon.alexa.api;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaDataSink extends OutputStream {
    private boolean isWriteable;
    private final OutputStream outputStream;
    protected final ParcelFileDescriptor readDescriptor;
    private String tag;
    protected final ParcelFileDescriptor writeDescriptor;

    public AlexaDataSink() throws IOException {
        this.tag = "AlexaDataSink";
        ParcelFileDescriptor[] createReliableSocketPair = ParcelFileDescriptor.createReliableSocketPair();
        this.readDescriptor = createReliableSocketPair[0];
        ParcelFileDescriptor parcelFileDescriptor = createReliableSocketPair[1];
        this.writeDescriptor = parcelFileDescriptor;
        this.outputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
        this.isWriteable = true;
    }

    public synchronized void abandon() {
        try {
            try {
                OutputStream outputStream = this.outputStream;
                if (outputStream != null) {
                    outputStream.close();
                }
                ParcelFileDescriptor parcelFileDescriptor = this.readDescriptor;
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                }
                ParcelFileDescriptor parcelFileDescriptor2 = this.writeDescriptor;
                if (parcelFileDescriptor2 != null) {
                    parcelFileDescriptor2.close();
                }
            } catch (IOException e) {
                Log.e(this.tag, "Could not abandon " + this.tag, e);
            }
            this.isWriteable = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            OutputStream outputStream = this.outputStream;
            if (outputStream != null) {
                outputStream.close();
            }
        } catch (IOException e) {
            Log.e(this.tag, "Could not close output stream.", e);
        }
        this.isWriteable = false;
    }

    public synchronized ParcelFileDescriptor getReadDescriptor() {
        return this.readDescriptor;
    }

    public synchronized boolean isWriteable() {
        return this.isWriteable;
    }

    public synchronized OutputStream openForWriting() {
        return this;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.outputStream.write(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.outputStream.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.outputStream.write(bArr, i, i2);
    }

    public AlexaDataSink(AlexaDataSink alexaDataSink) {
        this(alexaDataSink.readDescriptor, alexaDataSink.writeDescriptor);
    }

    public AlexaDataSink(ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2) {
        this.tag = "AlexaDataSink";
        this.readDescriptor = parcelFileDescriptor;
        this.writeDescriptor = parcelFileDescriptor2;
        this.outputStream = null;
    }
}
