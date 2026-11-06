package org.eclipse.paho.client.mqttv3.internal.wire;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class CountingInputStream extends InputStream {
    private int counter = 0;
    private InputStream in;

    public CountingInputStream(InputStream inputStream) {
        this.in = inputStream;
    }

    public int getCounter() {
        return this.counter;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int read = this.in.read();
        if (read != -1) {
            this.counter++;
        }
        return read;
    }

    public void resetCounter() {
        this.counter = 0;
    }
}
