package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.Config;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public interface MutableConfig extends Config {
    <ValueT> void insertOption(@NonNull Config.Option<ValueT> option, @NonNull Config.OptionPriority optionPriority, @Nullable ValueT valuet);

    <ValueT> void insertOption(@NonNull Config.Option<ValueT> option, @Nullable ValueT valuet);

    @Nullable
    <ValueT> ValueT removeOption(@NonNull Config.Option<ValueT> option);
}
