package com.amazon.alexa.protocols.service.api;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(21)
/* loaded from: classes18.dex */
public abstract class ComponentRegistry {

    @VisibleForTesting
    @Deprecated
    static ComponentRegistry instance;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ConcreteComponentFactory<T> {
        T create(Context context);
    }

    @NonNull
    public static ComponentRegistry getInstance() {
        Preconditions.checkState(instance != null, "init() must be called before getInstance()");
        return instance;
    }

    @NonNull
    public static ComponentRegistry init(Context context) {
        Preconditions.checkState(instance == null);
        DefaultComponentRegistry defaultComponentRegistry = new DefaultComponentRegistry(context);
        instance = defaultComponentRegistry;
        return defaultComponentRegistry;
    }

    public static void resetForTest() {
        instance = null;
    }

    @NonNull
    public abstract <T> ComponentRegistry bind(@NonNull Class<T> cls, @NonNull String str);

    @NonNull
    public abstract <T> ComponentRegistry bindConcreteFactory(@NonNull Class<T> cls, @NonNull ConcreteComponentFactory<? extends T> concreteComponentFactory);

    @NonNull
    public abstract <T> ComponentRegistry bindFactory(@NonNull Class<T> cls, @NonNull String str);

    @NonNull
    public abstract <T> ComponentRegistry bindList(@NonNull Class<T> cls, @NonNull String... strArr);

    @NonNull
    public abstract <T> Optional<T> get(@NonNull Class<T> cls);

    @NonNull
    public abstract <T> LazyComponent<T> getLazy(@NonNull Class<T> cls);

    @NonNull
    public abstract <T> LazyComponent<List<T>> getLazyList(@NonNull Class<T> cls);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ComponentFactory<T> {
        @Deprecated
        default T create(Context context) {
            return null;
        }

        default T create(ComponentGetter componentGetter, Context context) {
            return null;
        }
    }
}
