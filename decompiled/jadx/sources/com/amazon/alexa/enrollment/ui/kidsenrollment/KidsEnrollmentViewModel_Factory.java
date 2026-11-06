package com.amazon.alexa.enrollment.ui.kidsenrollment;

import android.content.Context;
import com.amazon.alexa.enrollment.utils.PermissionsHelper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class KidsEnrollmentViewModel_Factory implements Factory<KidsEnrollmentViewModel> {
    private final Provider<Context> contextProvider;
    private final Provider<PermissionsHelper> permissionsHelperProvider;

    public KidsEnrollmentViewModel_Factory(Provider<Context> provider, Provider<PermissionsHelper> provider2) {
        this.contextProvider = provider;
        this.permissionsHelperProvider = provider2;
    }

    public static KidsEnrollmentViewModel_Factory create(Provider<Context> provider, Provider<PermissionsHelper> provider2) {
        return new KidsEnrollmentViewModel_Factory(provider, provider2);
    }

    public static KidsEnrollmentViewModel newInstance(Context context, PermissionsHelper permissionsHelper) {
        return new KidsEnrollmentViewModel(context, permissionsHelper);
    }

    @Override // javax.inject.Provider
    public KidsEnrollmentViewModel get() {
        return newInstance(this.contextProvider.get(), this.permissionsHelperProvider.get());
    }
}
