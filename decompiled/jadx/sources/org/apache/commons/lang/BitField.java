package org.apache.commons.lang;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class BitField {
    private final int _mask;
    private final int _shift_count;

    public BitField(int i) {
        this._mask = i;
        int i2 = 0;
        if (i != 0) {
            while ((i & 1) == 0) {
                i2++;
                i >>= 1;
            }
        }
        this._shift_count = i2;
    }

    public int clear(int i) {
        return (~this._mask) & i;
    }

    public byte clearByte(byte b) {
        return (byte) clear(b);
    }

    public short clearShort(short s) {
        return (short) clear(s);
    }

    public int getRawValue(int i) {
        return this._mask & i;
    }

    public short getShortRawValue(short s) {
        return (short) getRawValue(s);
    }

    public short getShortValue(short s) {
        return (short) getValue(s);
    }

    public int getValue(int i) {
        return getRawValue(i) >> this._shift_count;
    }

    public boolean isAllSet(int i) {
        int i2 = this._mask;
        return (i & i2) == i2;
    }

    public boolean isSet(int i) {
        return (this._mask & i) != 0;
    }

    public int set(int i) {
        return this._mask | i;
    }

    public int setBoolean(int i, boolean z) {
        return z ? set(i) : clear(i);
    }

    public byte setByte(byte b) {
        return (byte) set(b);
    }

    public byte setByteBoolean(byte b, boolean z) {
        return z ? setByte(b) : clearByte(b);
    }

    public short setShort(short s) {
        return (short) set(s);
    }

    public short setShortBoolean(short s, boolean z) {
        return z ? setShort(s) : clearShort(s);
    }

    public short setShortValue(short s, short s2) {
        return (short) setValue(s, s2);
    }

    public int setValue(int i, int i2) {
        int i3 = this._mask;
        return ((i2 << this._shift_count) & i3) | (i & (~i3));
    }
}
