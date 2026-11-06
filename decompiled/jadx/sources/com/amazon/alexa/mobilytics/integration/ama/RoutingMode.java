package com.amazon.alexa.mobilytics.integration.ama;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public enum RoutingMode {
    LEGACY,
    KINESIS_MINERVA_DUAL,
    MINERVA_ONLY;

    public static final String INDICATOR_DUAL = "dual";
    public static final String INDICATOR_LEGACY = "kinesis_legacy";
    public static final String INDICATOR_MINERVA_ONLY = "minerva_only";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.mobilytics.integration.ama.RoutingMode$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$mobilytics$integration$ama$RoutingMode;

        static {
            int[] iArr = new int[RoutingMode.values().length];
            $SwitchMap$com$amazon$alexa$mobilytics$integration$ama$RoutingMode = iArr;
            try {
                iArr[RoutingMode.KINESIS_MINERVA_DUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$mobilytics$integration$ama$RoutingMode[RoutingMode.MINERVA_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$mobilytics$integration$ama$RoutingMode[RoutingMode.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @NonNull
    public String indicator() {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$mobilytics$integration$ama$RoutingMode[ordinal()];
        return i != 1 ? i != 2 ? INDICATOR_LEGACY : INDICATOR_MINERVA_ONLY : INDICATOR_DUAL;
    }
}
