package com.here.sdk.core.engine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class AndroidLocaleFactory implements LocaleFactory {
    @Override // com.here.sdk.core.engine.LocaleFactory
    @Nullable
    public Locale getLocaleByBcp47(@NonNull String str) {
        Locale forLanguageTag = Locale.forLanguageTag(str);
        if (forLanguageTag.toLanguageTag().equals("und")) {
            return null;
        }
        return forLanguageTag;
    }
}
