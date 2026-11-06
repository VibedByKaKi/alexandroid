package dagger.android;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes9.dex */
public final class DaggerApplication_MembersInjector implements MembersInjector<DaggerApplication> {
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

    public DaggerApplication_MembersInjector(Provider<DispatchingAndroidInjector<Object>> provider) {
        this.androidInjectorProvider = provider;
    }

    public static MembersInjector<DaggerApplication> create(Provider<DispatchingAndroidInjector<Object>> provider) {
        return new DaggerApplication_MembersInjector(provider);
    }

    @InjectedFieldSignature("dagger.android.DaggerApplication.androidInjector")
    public static void injectAndroidInjector(DaggerApplication daggerApplication, DispatchingAndroidInjector<Object> dispatchingAndroidInjector) {
        daggerApplication.androidInjector = dispatchingAndroidInjector;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DaggerApplication daggerApplication) {
        injectAndroidInjector(daggerApplication, this.androidInjectorProvider.get());
    }
}
