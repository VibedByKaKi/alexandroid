package com.amazon.apl.android.font;

import com.amazon.apl.android.font.AutoValue_FontKey;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class FontKey {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract FontKey build();

        public abstract Builder family(String str);

        public abstract Builder italic(boolean z);

        public abstract Builder language(String str);

        public abstract Builder weight(int i);
    }

    public static Builder build(String str, int i) {
        return new AutoValue_FontKey.Builder().family(str).weight(i).italic(false).language("");
    }

    public abstract String getFamily();

    public abstract String getLanguage();

    public abstract int getWeight();

    public abstract boolean isItalic();
}
