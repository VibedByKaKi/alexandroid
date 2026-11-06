package com.amazon.alexa.ra.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/amazon/alexa/ra/ui/RaActivityConstants;", "", "<init>", "()V", "Companion", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class RaActivityConstants {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String ACTION_DISMISS_VUI = "amazon.intent.action.DISMISS_VUI";

    @NotNull
    private static final String ACTION_LOCKSCREEN_LAUNCHED = "amazon.intent.action.LOCKSCREEN_LAUNCHED";

    @NotNull
    private static final String PERMISSION_LOCKSCREEN_BROADCAST = "com.amazon.dee.app.permission.LOCKSCREEN_BROADCAST";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/ra/ui/RaActivityConstants$Companion;", "", "<init>", "()V", "ACTION_DISMISS_VUI", "", "getACTION_DISMISS_VUI", "()Ljava/lang/String;", "ACTION_LOCKSCREEN_LAUNCHED", "getACTION_LOCKSCREEN_LAUNCHED", "PERMISSION_LOCKSCREEN_BROADCAST", "getPERMISSION_LOCKSCREEN_BROADCAST", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getACTION_DISMISS_VUI() {
            return RaActivityConstants.ACTION_DISMISS_VUI;
        }

        @NotNull
        public final String getACTION_LOCKSCREEN_LAUNCHED() {
            return RaActivityConstants.ACTION_LOCKSCREEN_LAUNCHED;
        }

        @NotNull
        public final String getPERMISSION_LOCKSCREEN_BROADCAST() {
            return RaActivityConstants.PERMISSION_LOCKSCREEN_BROADCAST;
        }

        private Companion() {
        }
    }
}
