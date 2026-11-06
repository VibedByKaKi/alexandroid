package com.amazon.dee.app.services.shortcut;

import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsOperationalEvent;
import com.amazon.dee.app.dependencies.ApplicationScope;
import com.amazon.dee.app.services.shortcut.api.ShortcutMetricsApi;
import dagger.Lazy;
import defpackage.a$$ExternalSyntheticOutline0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/dee/app/services/shortcut/ShortcutMetrics;", "Lcom/amazon/dee/app/services/shortcut/api/ShortcutMetricsApi;", "mobilytics", "Ldagger/Lazy;", "Lcom/amazon/alexa/mobilytics/Mobilytics;", "<init>", "(Ldagger/Lazy;)V", "logShortcutMetric", "", "metric", "", "Companion", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
@ApplicationScope
/* loaded from: classes5.dex */
public final class ShortcutMetrics implements ShortcutMetricsApi {

    @NotNull
    private static final String COMPONENT = "AlexaShortcut";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String SHORTCUT_PREFIX = "Shortcut";

    @NotNull
    private static final String SUBCOMPONENT = "AlexaShortcut";

    @NotNull
    private final Lazy<Mobilytics> mobilytics;

    @Inject
    public ShortcutMetrics(@NotNull Lazy<Mobilytics> lazy) {
        lazy.getClass();
        this.mobilytics = lazy;
    }

    @JvmStatic
    @NotNull
    public static final String getShortcutMetric(@NotNull String str) {
        return INSTANCE.getShortcutMetric(str);
    }

    @Override // com.amazon.dee.app.services.shortcut.api.ShortcutMetricsApi
    public void logShortcutMetric(@Nullable String metric) {
        if (metric == null) {
            return;
        }
        MobilyticsOperationalEvent createOperationalEvent = this.mobilytics.get().createOperationalEvent(INSTANCE.getShortcutMetric(metric), "counter", "AlexaShortcut", "AlexaShortcut", "cbea4080-337a-4b7e-8e0b-ea16ec85c09a");
        createOperationalEvent.getClass();
        this.mobilytics.get().recordOperationalEvent(createOperationalEvent);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/amazon/dee/app/services/shortcut/ShortcutMetrics$Companion;", "", "<init>", "()V", "SHORTCUT_PREFIX", "", "COMPONENT", "SUBCOMPONENT", "getShortcutMetric", "suffix", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String getShortcutMetric(@NotNull String suffix) {
            suffix.getClass();
            return a$$ExternalSyntheticOutline0.m("Shortcut.", new Regex("\\s").replace(suffix, ""));
        }

        private Companion() {
        }
    }
}
