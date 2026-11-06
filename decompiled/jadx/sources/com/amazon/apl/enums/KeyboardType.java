package com.amazon.apl.enums;

import android.util.SparseArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum KeyboardType implements APLEnum {
    kKeyboardTypeDecimalPad(0),
    kKeyboardTypeEmailAddress(1),
    kKeyboardTypeNormal(2),
    kKeyboardTypeNumberPad(3),
    kKeyboardTypePhonePad(4),
    kKeyboardTypeUrl(5);

    private static SparseArray<KeyboardType> values;
    private final int index;

    static {
        values = null;
        values = new SparseArray<>();
        for (KeyboardType keyboardType : values()) {
            values.put(keyboardType.getIndex(), keyboardType);
        }
    }

    KeyboardType(int i) {
        this.index = i;
    }

    @Override // com.amazon.apl.enums.APLEnum
    public int getIndex() {
        return this.index;
    }

    public static KeyboardType valueOf(int i) {
        return values.get(i);
    }
}
