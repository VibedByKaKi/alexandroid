package com.amazon.alexa.client.alexaservice.base.application;

import android.app.Activity;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class ActivityModule_ProvidesActivityFactory implements Factory<Activity> {
    private final ActivityModule module;

    public ActivityModule_ProvidesActivityFactory(ActivityModule activityModule) {
        this.module = activityModule;
    }

    public static ActivityModule_ProvidesActivityFactory create(ActivityModule activityModule) {
        return new ActivityModule_ProvidesActivityFactory(activityModule);
    }

    public static Activity providesActivity(ActivityModule activityModule) {
        return (Activity) Preconditions.checkNotNullFromProvides(activityModule.providesActivity());
    }

    @Override // javax.inject.Provider
    public Activity get() {
        return providesActivity(this.module);
    }
}
