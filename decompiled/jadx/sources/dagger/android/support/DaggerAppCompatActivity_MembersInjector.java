package dagger.android.support;

import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes9.dex */
public final class DaggerAppCompatActivity_MembersInjector implements MembersInjector<DaggerAppCompatActivity> {
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

    public DaggerAppCompatActivity_MembersInjector(Provider<DispatchingAndroidInjector<Object>> provider) {
        this.androidInjectorProvider = provider;
    }

    public static MembersInjector<DaggerAppCompatActivity> create(Provider<DispatchingAndroidInjector<Object>> provider) {
        return new DaggerAppCompatActivity_MembersInjector(provider);
    }

    @InjectedFieldSignature("dagger.android.support.DaggerAppCompatActivity.androidInjector")
    public static void injectAndroidInjector(DaggerAppCompatActivity daggerAppCompatActivity, DispatchingAndroidInjector<Object> dispatchingAndroidInjector) {
        daggerAppCompatActivity.androidInjector = dispatchingAndroidInjector;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DaggerAppCompatActivity daggerAppCompatActivity) {
        injectAndroidInjector(daggerAppCompatActivity, this.androidInjectorProvider.get());
    }
}
