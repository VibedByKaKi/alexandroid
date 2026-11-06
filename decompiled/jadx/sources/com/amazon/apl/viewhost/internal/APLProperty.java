package com.amazon.apl.viewhost.internal;

import com.google.common.collect.ImmutableBiMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.amazon.apl.viewhost.internal.APLProperty, still in use, count: 1, list:
  (r0v0 com.amazon.apl.viewhost.internal.APLProperty) from ?: CAST (java.lang.String) (r0v0 com.amazon.apl.viewhost.internal.APLProperty)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class APLProperty {
    kFluidityIncidentUpsThreshold,
    kFluidityIncidentUpsWindowSize,
    kFluidityIncidentMinimumDurationMs,
    kFluidityRefreshRate,
    kIsRuntimeHardwareAccelerationEnabled,
    kPerformanceInflateOnMainThread,
    kPerformanceCoreUpdateOnBackgroundThread,
    kIsSceneGraphEnabled,
    kOverrideConfig,
    kMinContextUpdateIntervalMs;

    public static final ImmutableBiMap<String, APLProperty> sPropertyToEnumMap = ImmutableBiMap.builder().put((ImmutableBiMap.Builder) "fluidityIncident.upsThreshold", (String) new APLProperty()).put((ImmutableBiMap.Builder) "fluidityIncident.upsWindowSize", (String) new APLProperty()).put((ImmutableBiMap.Builder) "fluidityIncident.minimumDurationMs", (String) new APLProperty()).put((ImmutableBiMap.Builder) "fluidityIncident.refreshRate", (String) new APLProperty()).put((ImmutableBiMap.Builder) "isRuntimeHardwareAccelerationEnabled", (String) new APLProperty()).put((ImmutableBiMap.Builder) "inflateOnMainThread", (String) new APLProperty()).put((ImmutableBiMap.Builder) "-experimentalAsyncCoreUpdate", (String) new APLProperty()).put((ImmutableBiMap.Builder) "-experimentalEnableSceneGraph", (String) new APLProperty()).put((ImmutableBiMap.Builder) "overrideConfig", (String) new APLProperty()).put((ImmutableBiMap.Builder) "minContextUpdateIntervalMs", (String) new APLProperty()).build();

    static {
    }

    private APLProperty() {
    }

    public static APLProperty valueOf(String str) {
        return (APLProperty) Enum.valueOf(APLProperty.class, str);
    }

    public static APLProperty[] values() {
        return (APLProperty[]) $VALUES.clone();
    }
}
