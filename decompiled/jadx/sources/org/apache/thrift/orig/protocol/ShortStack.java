package org.apache.thrift.orig.protocol;

import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
class ShortStack {
    private int top = 0;
    private short[] vector;

    public ShortStack(int i) {
        this.vector = new short[i];
    }

    private void grow() {
        short[] sArr = this.vector;
        this.vector = Arrays.copyOf(sArr, sArr.length << 1);
    }

    public void clear() {
        this.top = 0;
    }

    public short pop() {
        short[] sArr = this.vector;
        int i = this.top - 1;
        this.top = i;
        return sArr[i];
    }

    public void push(short s) {
        if (this.vector.length == this.top) {
            grow();
        }
        short[] sArr = this.vector;
        int i = this.top;
        this.top = i + 1;
        sArr[i] = s;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<ShortStack vector:[");
        int i = 0;
        while (true) {
            short[] sArr = this.vector;
            if (i >= sArr.length) {
                sb.append("]>");
                return sb.toString();
            }
            boolean z = i == this.top - 1;
            short s = sArr[i];
            if (i != 0) {
                sb.append(' ');
            }
            if (z) {
                sb.append(">>");
                sb.append((int) s);
                sb.append("<<");
            } else {
                sb.append((int) s);
            }
            i++;
        }
    }
}
