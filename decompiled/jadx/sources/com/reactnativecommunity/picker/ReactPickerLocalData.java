package com.reactnativecommunity.picker;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class ReactPickerLocalData {
    private final int height;

    public ReactPickerLocalData(int i) {
        this.height = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.height == ((ReactPickerLocalData) obj).height;
    }

    public int getHeight() {
        return this.height;
    }

    public int hashCode() {
        return this.height + 31;
    }

    public String toString() {
        return ErrorUtils$$ExternalSyntheticOutline0.m(new StringBuilder("RectPickerLocalData{height="), this.height, AbstractJsonLexerKt.END_OBJ);
    }
}
