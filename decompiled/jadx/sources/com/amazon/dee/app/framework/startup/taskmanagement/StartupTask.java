package com.amazon.dee.app.framework.startup.taskmanagement;

import androidx.annotation.NonNull;
import com.amazon.dee.app.framework.startup.featuregating.StartupFeature;
import java.util.function.Function;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final class StartupTask<T, R> {
    public static final int TYPE_CODE_EXECUTION_IN_BACKGROUND = 4;
    public static final int TYPE_CODE_EXECUTION_ON_MAIN = 2;
    public static final int TYPE_LOG_DEBUG = 5;
    public static final int TYPE_LOG_INFO = 3;
    public static final int TYPE_PACKAGE_INITIALIZATION = 1;
    private boolean deferAlways;
    private StartupFeature featureFlagForDeferral;
    private StartupFeature featureFlagForEnablement;
    private T input;
    private int taskType;

    private StartupTask(T t, int i) {
        this.input = t;
        this.taskType = i;
    }

    public static <T> StartupTask create(T t, int i) {
        return new StartupTask(t, i);
    }

    public void deferAlways() {
        this.deferAlways = true;
    }

    public void deferUsing(StartupFeature startupFeature) {
        if (this.featureFlagForEnablement == null) {
            this.featureFlagForDeferral = startupFeature;
        } else {
            Buffer$$ExternalSyntheticBUOutline0.m$1("A feature flag for enabling this task is already configuredYou can either configure a feature flag for enablement or deferral but not both");
        }
    }

    public void enableUsing(StartupFeature startupFeature) {
        if (this.featureFlagForDeferral == null) {
            this.featureFlagForEnablement = startupFeature;
        } else {
            Buffer$$ExternalSyntheticBUOutline0.m$1("A feature flag for deferring this task is already configured.You can either configure a feature flag for enablement or deferral but not both");
        }
    }

    public R execute(@NonNull Function<T, R> function) {
        if (function != null) {
            return function.apply(this.input);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Function cannot be null");
        return null;
    }

    public StartupFeature getFeatureFlagForDeferral() {
        return this.featureFlagForDeferral;
    }

    public StartupFeature getFeatureFlagForEnablement() {
        return this.featureFlagForEnablement;
    }

    public int getType() {
        return this.taskType;
    }

    public boolean shouldDeferAlways() {
        return this.deferAlways;
    }
}
