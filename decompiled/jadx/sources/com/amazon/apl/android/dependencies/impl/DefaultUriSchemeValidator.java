package com.amazon.apl.android.dependencies.impl;

import androidx.annotation.NonNull;
import com.amazon.apl.android.dependencies.IImageUriSchemeValidator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DefaultUriSchemeValidator implements IImageUriSchemeValidator {
    @Override // com.amazon.apl.android.dependencies.IImageUriSchemeValidator
    public boolean isUriSchemeValid(@NonNull String str) {
        return "https".equals(str) || "data".equals(str) || "content".equals(str) || "file".equals(str);
    }
}
