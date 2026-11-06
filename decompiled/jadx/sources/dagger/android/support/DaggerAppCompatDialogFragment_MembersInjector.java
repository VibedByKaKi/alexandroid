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
public final class DaggerAppCompatDialogFragment_MembersInjector implements MembersInjector<DaggerAppCompatDialogFragment> {
    private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

    public DaggerAppCompatDialogFragment_MembersInjector(Provider<DispatchingAndroidInjector<Object>> provider) {
        this.androidInjectorProvider = provider;
    }

    public static MembersInjector<DaggerAppCompatDialogFragment> create(Provider<DispatchingAndroidInjector<Object>> provider) {
        return new DaggerAppCompatDialogFragment_MembersInjector(provider);
    }

    @InjectedFieldSignature("dagger.android.support.DaggerAppCompatDialogFragment.androidInjector")
    public static void injectAndroidInjector(DaggerAppCompatDialogFragment daggerAppCompatDialogFragment, DispatchingAndroidInjector<Object> dispatchingAndroidInjector) {
        daggerAppCompatDialogFragment.androidInjector = dispatchingAndroidInjector;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DaggerAppCompatDialogFragment daggerAppCompatDialogFragment) {
        injectAndroidInjector(daggerAppCompatDialogFragment, this.androidInjectorProvider.get());
    }
}
