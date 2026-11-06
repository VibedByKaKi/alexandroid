package dagger.android;

import dagger.BindsInstance;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface AndroidInjector<T> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Deprecated
    public static abstract class Builder<T> implements Factory<T> {
        public abstract AndroidInjector<T> build();

        @Override // dagger.android.AndroidInjector.Factory
        public final AndroidInjector<T> create(T t) {
            seedInstance(t);
            return build();
        }

        @BindsInstance
        public abstract void seedInstance(T t);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Factory<T> {
        AndroidInjector<T> create(@BindsInstance T t);
    }

    void inject(T t);
}
