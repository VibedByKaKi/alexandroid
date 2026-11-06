package com.amazon.comms.calling.dependency.modules;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Calendar;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class ApplicationModule_ProvidesCalendarFactory implements Factory<Calendar> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesCalendarFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesCalendarFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesCalendarFactory(applicationModule);
    }

    public static Calendar providesCalendar(ApplicationModule applicationModule) {
        return (Calendar) Preconditions.checkNotNullFromProvides(applicationModule.providesCalendar());
    }

    @Override // javax.inject.Provider
    public Calendar get() {
        return providesCalendar(this.module);
    }
}
