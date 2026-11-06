package com.amazon.apl.devtools.enums;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum TargetType {
    VIEW("view");

    private static final String VIEW_TEXT = "view";
    private final String mTargetTypeText;

    TargetType(String str) {
        this.mTargetTypeText = str;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.mTargetTypeText;
    }
}
