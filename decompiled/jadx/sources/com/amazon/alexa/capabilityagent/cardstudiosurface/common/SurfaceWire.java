package com.amazon.alexa.capabilityagent.cardstudiosurface.common;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/capabilityagent/cardstudiosurface/common/SurfaceWire;", "", "<init>", "()V", "CAPABILITY_TYPE", "", "NAMESPACE", "VERSION", "INSTANCE_CARD_STUDIO", "NAME_NOTIFY_ITEM_CHANGED", "NAME_REPORT_ITEM_ACTIVITY", "SURFACE_CARD_STUDIO", "RENDER_TYPE_RAW", "RENDER_TYPE_FRAGMENT", "RENDER_TYPE_JSON_SPEC", "OPERATIONS_ALL", "", "getOPERATIONS_ALL", "()Ljava/util/List;", "DEVICE_CARD_PROVIDERS", "getDEVICE_CARD_PROVIDERS", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SurfaceWire {

    @NotNull
    public static final String CAPABILITY_TYPE = "AlexaInterface";

    @NotNull
    public static final String INSTANCE_CARD_STUDIO = "amzn1.mobile-surface.card-studio";

    @NotNull
    public static final String NAMESPACE = "Alexa.Multimodal.Surface";

    @NotNull
    public static final String NAME_NOTIFY_ITEM_CHANGED = "NotifyItemChanged";

    @NotNull
    public static final String NAME_REPORT_ITEM_ACTIVITY = "ReportItemActivity";

    @NotNull
    public static final String RENDER_TYPE_FRAGMENT = "FRAGMENT";

    @NotNull
    public static final String RENDER_TYPE_JSON_SPEC = "JSON_SPEC";

    @NotNull
    public static final String RENDER_TYPE_RAW = "RAW";

    @NotNull
    public static final String SURFACE_CARD_STUDIO = "card-studio";

    @NotNull
    public static final String VERSION = "1.1";

    @NotNull
    public static final SurfaceWire INSTANCE = new SurfaceWire();

    @NotNull
    private static final List<String> OPERATIONS_ALL = CollectionsKt.listOf((Object[]) new String[]{"PIN", "UNPIN", "HIDE", "REORDER", "DELETE"});

    @NotNull
    private static final List<String> DEVICE_CARD_PROVIDERS = CollectionsKt.listOf((Object[]) new String[]{"smart-home", "music", "alarms-timers", "lists-notes", "reminders-tasks", "calendar"});
    public static final int $stable = 8;

    private SurfaceWire() {
    }

    @NotNull
    public final List<String> getDEVICE_CARD_PROVIDERS() {
        return DEVICE_CARD_PROVIDERS;
    }

    @NotNull
    public final List<String> getOPERATIONS_ALL() {
        return OPERATIONS_ALL;
    }
}
