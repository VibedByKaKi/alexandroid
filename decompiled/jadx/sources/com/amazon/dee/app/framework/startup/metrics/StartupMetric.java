package com.amazon.dee.app.framework.startup.metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final class StartupMetric {
    public static final String CORE_STARTUP_COMPONENT = "core_startup";
    public static final String CORE_STARTUP_TIME = "core.startup.time";
    public static final String CRITICAL_TASK_COMPONENT = "critical_component";
    public static final String CRITICAL_TASK_INIT_TIME = "core.startup.critical_init.time";
    public static final String CRITICAL_TASK_REGISTRATION_TIME = "core.startup.registration.time";
    public static final String DEFERRED_TASK_COMPONENT = "deferred_component";
    public static final String DEFERRED_TASK_INIT_TIME = "core.startup.non_critical_init.time";
    public static final String DEPENDENCY_INIT_TIME = "core.startup.dependency_init.time";
    public static final String STARTUP_INIT_FAIL = "core.startup.init_fail";

    private StartupMetric() {
    }
}
