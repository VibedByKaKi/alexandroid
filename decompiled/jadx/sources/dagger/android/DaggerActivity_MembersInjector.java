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
public final class DaggerActivity_MembersInjector implements MembersInjector<DaggerActivity> {
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

    public DaggerActivity_MembersInjector(Provider<DispatchingAndroidInjector<Object>> provider) {
        this.androidInjectorProvider = provider;
    }

    public static MembersInjector<DaggerActivity> create(Provider<DispatchingAndroidInjector<Object>> provider) {
        return new DaggerActivity_MembersInjector(provider);
    }

    @InjectedFieldSignature("dagger.android.DaggerActivity.androidInjector")
    public static void injectAndroidInjector(DaggerActivity daggerActivity, DispatchingAndroidInjector<Object> dispatchingAndroidInjector) {
        daggerActivity.androidInjector = dispatchingAndroidInjector;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DaggerActivity daggerActivity) {
        injectAndroidInjector(daggerActivity, this.androidInjectorProvider.get());
    }
}
