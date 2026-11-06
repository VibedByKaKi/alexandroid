package com.mapbox.maps.module;

import androidx.annotation.RestrictTo;
import com.mapbox.common.FeatureTelemetryCounter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/mapbox/maps/module/TelemetryEvent;", "", "name", "", "(Ljava/lang/String;)V", "counter", "Lcom/mapbox/common/FeatureTelemetryCounter;", "increment", "", "Companion", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes9.dex */
public final class TelemetryEvent {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final FeatureTelemetryCounter counter;

    @NotNull
    private final String name;

    private TelemetryEvent(String str) {
        FeatureTelemetryCounter featureTelemetryCounter;
        this.name = str;
        try {
            featureTelemetryCounter = FeatureTelemetryCounter.create(str);
        } catch (Throwable unused) {
            featureTelemetryCounter = null;
        }
        this.counter = featureTelemetryCounter;
    }

    public final void increment() {
        FeatureTelemetryCounter featureTelemetryCounter = this.counter;
        if (featureTelemetryCounter != null) {
            featureTelemetryCounter.increment();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/module/TelemetryEvent$Companion;", "", "()V", "create", "Lcom/mapbox/maps/module/TelemetryEvent;", "name", "", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TelemetryEvent create(@NotNull String name) {
            name.getClass();
            return new TelemetryEvent("maps-mobile/".concat(name), null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ TelemetryEvent(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
