package com.amazon.alexa.alertsca;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes16.dex */
public final class AlertsAnalyzer_Factory implements Factory<AlertsAnalyzer> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final AlertsAnalyzer_Factory INSTANCE = new AlertsAnalyzer_Factory();

        private InstanceHolder() {
        }
    }

    public static AlertsAnalyzer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AlertsAnalyzer newInstance() {
        return new AlertsAnalyzer();
    }

    @Override // javax.inject.Provider
    public AlertsAnalyzer get() {
        return newInstance();
    }
}
