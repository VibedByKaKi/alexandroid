package com.amazon.alexa.smarthomecameras.dependencies.modules;

import android.content.Context;
import com.amazon.alexa.smarthomecameras.view.SmartAlertEventView;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class SmartAlertEventViewModule_ProvidesSmartAlertEventViewFactory implements Factory<SmartAlertEventView> {
    private final Provider<Context> contextProvider;
    private final Provider<String> imageUrlProvider;
    private final SmartAlertEventViewModule module;

    public SmartAlertEventViewModule_ProvidesSmartAlertEventViewFactory(SmartAlertEventViewModule smartAlertEventViewModule, Provider<Context> provider, Provider<String> provider2) {
        this.module = smartAlertEventViewModule;
        this.contextProvider = provider;
        this.imageUrlProvider = provider2;
    }

    public static SmartAlertEventViewModule_ProvidesSmartAlertEventViewFactory create(SmartAlertEventViewModule smartAlertEventViewModule, Provider<Context> provider, Provider<String> provider2) {
        return new SmartAlertEventViewModule_ProvidesSmartAlertEventViewFactory(smartAlertEventViewModule, provider, provider2);
    }

    public static SmartAlertEventView providesSmartAlertEventView(SmartAlertEventViewModule smartAlertEventViewModule, Context context, String str) {
        return (SmartAlertEventView) Preconditions.checkNotNull(smartAlertEventViewModule.providesSmartAlertEventView(context, str), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public SmartAlertEventView get() {
        return providesSmartAlertEventView(this.module, this.contextProvider.get(), this.imageUrlProvider.get());
    }
}
