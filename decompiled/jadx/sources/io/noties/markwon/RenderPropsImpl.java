package io.noties.markwon;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
class RenderPropsImpl implements RenderProps {
    private final Map<Prop, Object> values = new HashMap(3);

    @Override // io.noties.markwon.RenderProps
    public <T> void clear(@NonNull Prop<T> prop) {
        this.values.remove(prop);
    }

    @Override // io.noties.markwon.RenderProps
    public void clearAll() {
        this.values.clear();
    }

    @Override // io.noties.markwon.RenderProps
    @NonNull
    public <T> T get(@NonNull Prop<T> prop, @NonNull T t) {
        T t2 = (T) this.values.get(prop);
        return t2 != null ? t2 : t;
    }

    @Override // io.noties.markwon.RenderProps
    public <T> void set(@NonNull Prop<T> prop, @Nullable T t) {
        Map<Prop, Object> map = this.values;
        if (t == null) {
            map.remove(prop);
        } else {
            map.put(prop, t);
        }
    }

    @Override // io.noties.markwon.RenderProps
    @Nullable
    public <T> T get(@NonNull Prop<T> prop) {
        return (T) this.values.get(prop);
    }
}
