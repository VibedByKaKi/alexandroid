package com.amazon.alexa.handsfree.protocols.uservoicerecognition.enrollmenttype;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class EnrollmentStatusManager_Factory implements Factory<EnrollmentStatusManager> {
    private final Provider<Context> contextProvider;

    public EnrollmentStatusManager_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static EnrollmentStatusManager_Factory create(Provider<Context> provider) {
        return new EnrollmentStatusManager_Factory(provider);
    }

    public static EnrollmentStatusManager newEnrollmentStatusManager(Context context) {
        return new EnrollmentStatusManager(context);
    }

    public static EnrollmentStatusManager provideInstance(Provider<Context> provider) {
        return new EnrollmentStatusManager(provider.get());
    }

    @Override // javax.inject.Provider
    public EnrollmentStatusManager get() {
        return provideInstance(this.contextProvider);
    }
}
