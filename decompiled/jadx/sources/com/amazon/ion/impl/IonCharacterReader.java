package com.amazon.ion.impl;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.Reader;
import java.util.LinkedList;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
final class IonCharacterReader extends PushbackReader {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int BUFFER_PADDING = 1;
    public static final int DEFAULT_BUFFER_SIZE = 12;
    private int m_column;
    private LinkedList<Integer> m_columns;
    private long m_consumed;
    private int m_line;
    private int m_size;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public IonCharacterReader(java.io.Reader r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            int r5 = r5 + r0
            r3.<init>(r4, r5)
            r1 = 0
            r3.m_consumed = r1
            r3.m_line = r0
            r4 = 0
            r3.m_column = r4
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            r3.m_columns = r4
            r3.m_size = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.ion.impl.IonCharacterReader.<init>(java.io.Reader, int):void");
    }

    private final int popColumn() throws IOException {
        if (!this.m_columns.isEmpty()) {
            return this.m_columns.removeLast().intValue();
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2("Cannot unread past buffer");
        return 0;
    }

    private final void pushColumn(int i) {
        if (this.m_columns.size() == this.m_size) {
            this.m_columns.removeFirst();
        }
        this.m_columns.addLast(Integer.valueOf(i));
    }

    private void unreadImpl(int i, boolean z) throws IOException {
        if (i != -1) {
            if (z) {
                if (i == 10) {
                    this.m_line--;
                    this.m_column = popColumn();
                } else {
                    this.m_column--;
                }
                this.m_consumed--;
            }
            super.unread(i);
        }
    }

    public final int getColumn() {
        return this.m_column;
    }

    public final long getConsumedAmount() {
        return this.m_consumed;
    }

    public final int getLineNumber() {
        return this.m_line;
    }

    @Override // java.io.PushbackReader, java.io.FilterReader, java.io.Reader
    public int read() throws IOException {
        int read = super.read();
        if (read != -1) {
            if (read == 10) {
                this.m_line++;
                pushColumn(this.m_column);
                this.m_column = 0;
            } else if (read == 13) {
                int read2 = super.read();
                if (read2 != 10) {
                    unreadImpl(read2, false);
                }
                this.m_line++;
                pushColumn(this.m_column);
                this.m_column = 0;
                read = 10;
            } else {
                this.m_column++;
            }
            this.m_consumed++;
        }
        return read;
    }

    @Override // java.io.PushbackReader, java.io.FilterReader, java.io.Reader
    public long skip(long j) throws IOException {
        long j2 = j;
        while (j2 > 0 && read() != -1) {
            j2--;
        }
        return j - j2;
    }

    @Override // java.io.PushbackReader
    public void unread(int i) throws IOException {
        if (i != 13) {
            unreadImpl(i, true);
        } else {
            Buffer$$ExternalSyntheticBUOutline0.m$2("Cannot unread a carriage return");
        }
    }

    @Override // java.io.PushbackReader
    public void unread(char[] cArr) throws IOException {
        unread(cArr, 0, cArr.length);
    }

    @Override // java.io.PushbackReader
    public void unread(char[] cArr, int i, int i2) throws IOException {
        for (int i3 = (i2 + i) - 1; i3 >= i; i3--) {
            unread(cArr[i3]);
        }
    }

    public IonCharacterReader(Reader reader) {
        this(reader, 12);
    }

    @Override // java.io.PushbackReader, java.io.FilterReader, java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        int read;
        int i3 = i2 + i;
        int i4 = 0;
        while (i < i3 && (read = read()) != -1) {
            cArr[i] = (char) read;
            i4++;
            i++;
        }
        if (i4 == 0) {
            return -1;
        }
        return i4;
    }
}
