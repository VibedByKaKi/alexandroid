package dagger.android;

import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.Multibinds;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes9.dex */
public abstract class AndroidInjectionModule {
    private AndroidInjectionModule() {
    }

    @Multibinds
    public abstract Map<Class<?>, AndroidInjector.Factory<?>> classKeyedInjectorFactories();

    @Multibinds
    public abstract Map<String, AndroidInjector.Factory<?>> stringKeyedInjectorFactories();
}
