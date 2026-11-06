package com.amazon.identity.auth.device;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.URLConnection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class qc extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f898a = new Object[0];
    public final ByteArrayOutputStream b = new ByteArrayOutputStream();
    public final URLConnection c;
    public OutputStream d;

    public qc(URLConnection uRLConnection) {
        this.c = uRLConnection;
    }

    public final void a() {
        synchronized (this.f898a) {
            OutputStream outputStream = this.c.getOutputStream();
            this.d = outputStream;
            outputStream.write(this.b.toByteArray());
            flush();
        }
    }

    public final byte[] b() {
        byte[] byteArray;
        synchronized (this.f898a) {
            byteArray = this.b.toByteArray();
        }
        return byteArray;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        OutputStream outputStream = this.d;
        if (outputStream != null) {
            outputStream.close();
        }
        super.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        OutputStream outputStream = this.d;
        if (outputStream != null) {
            outputStream.flush();
        }
        super.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        synchronized (this.f898a) {
            try {
                OutputStream outputStream = this.d;
                if (outputStream != null) {
                    outputStream.write(i);
                } else {
                    this.b.write(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
