package com.amazon.dee.app.services.shortcut;

import io.ktor.client.utils.CacheControl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/dee/app/services/shortcut/ShortcutConstants;", "", "<init>", "()V", "METRIC_NAME_KEY", "", "SHORTCUT_ACTION", "ACTION_LAUNCH_FROM_SHORTCUT", "MAIN_ACTIVITY_CLASS", "VOICE_ACTIVITY_CLASS", "ROUTE_PREFIX", "ASK_ALEXA_SHORTCUT_ID", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ShortcutConstants {

    @NotNull
    public static final String ACTION_LAUNCH_FROM_SHORTCUT = "com.amazon.alexa.action.WIDGET_SHORTCUT";

    @NotNull
    public static final String ASK_ALEXA_SHORTCUT_ID = "i_ask_alexa";

    @NotNull
    public static final ShortcutConstants INSTANCE = new ShortcutConstants();

    @NotNull
    public static final String MAIN_ACTIVITY_CLASS = "com.amazon.dee.app.ui.main.MainActivity";

    @NotNull
    public static final String METRIC_NAME_KEY = "metricName";

    @NotNull
    public static final String ROUTE_PREFIX = "https://alexa.amazon.com/spa/index.html#";

    @NotNull
    public static final String SHORTCUT_ACTION = "com.amazon.alexa.action.SHORTCUT_ACTION";

    @NotNull
    public static final String VOICE_ACTIVITY_CLASS = "com.amazon.dee.app.ui.voice.LaunchAlexaActivity";

    private ShortcutConstants() {
    }
}
