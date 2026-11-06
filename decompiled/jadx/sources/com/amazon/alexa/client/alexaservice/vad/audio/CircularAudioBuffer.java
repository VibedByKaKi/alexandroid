package com.amazon.alexa.client.alexaservice.vad.audio;

import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class CircularAudioBuffer {
    private static final String TAG = "CircularAudioBuffer";
    private final short[] buffer;
    private final int capacity;
    private int writePosition = 0;

    public CircularAudioBuffer(int i, int i2) {
        int i3 = (i * i2) / 1000;
        this.capacity = i3;
        this.buffer = new short[i3];
    }

    public synchronized void clear() {
        Arrays.fill(this.buffer, (short) 0);
        this.writePosition = 0;
    }

    public synchronized short[] extractPreroll(int i) {
        if (i <= 0) {
            return new short[0];
        }
        int min = Math.min(i, this.capacity);
        short[] sArr = new short[min];
        int i2 = this.writePosition - min;
        int i3 = this.capacity;
        int i4 = (i2 + i3) % i3;
        for (int i5 = 0; i5 < min; i5++) {
            sArr[i5] = this.buffer[i4];
            i4 = (i4 + 1) % this.capacity;
        }
        return sArr;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getWritePosition() {
        return this.writePosition;
    }

    public synchronized void write(short[] sArr) {
        if (sArr != null) {
            if (sArr.length != 0) {
                for (short s : sArr) {
                    short[] sArr2 = this.buffer;
                    int i = this.writePosition;
                    sArr2[i] = s;
                    this.writePosition = (i + 1) % this.capacity;
                }
            }
        }
    }
}
