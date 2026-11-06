package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes.dex */
public abstract class Identifier {
    @NonNull
    public static Identifier create(@NonNull Object obj) {
        return new AutoValue_Identifier(obj);
    }

    @NonNull
    public abstract Object getValue();
}
