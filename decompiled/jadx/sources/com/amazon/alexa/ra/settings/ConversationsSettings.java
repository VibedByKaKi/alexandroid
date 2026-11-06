package com.amazon.alexa.ra.settings;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bJ\u0006\u0010\u000f\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bR\u0018\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/ra/settings/ConversationsSettings;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "Landroid/content/SharedPreferences;", "isBackgroundVoiceModeEnabled", "", "setBackgroundVoiceModeEnabled", "", "enabled", "isBackgroundVoiceModeOOBEShown", "setBackgroundVoiceModeOOBEShown", "Companion", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class ConversationsSettings {

    @NotNull
    private static final String KEY_BACKGROUND_OOBE_SHOWN = "background_voice_mode_oobe_shown";

    @NotNull
    private static final String KEY_BACKGROUND_VOICEENABLED = "background_voice_mode_enabled";

    @NotNull
    private static final String PREFS_NAME = "ra_conversation_settings";
    private final SharedPreferences sharedPreferences;
    public static final int $stable = 8;

    public ConversationsSettings(@NotNull Context context) {
        context.getClass();
        this.sharedPreferences = context.getSharedPreferences(PREFS_NAME, 0);
    }

    public final boolean isBackgroundVoiceModeEnabled() {
        return this.sharedPreferences.getBoolean("background_voice_mode_enabled", false);
    }

    public final boolean isBackgroundVoiceModeOOBEShown() {
        return this.sharedPreferences.getBoolean("background_voice_mode_oobe_shown", false);
    }

    public final void setBackgroundVoiceModeEnabled(boolean enabled) {
        AppLaunchChecker$$ExternalSyntheticOutline0.m(this.sharedPreferences, "background_voice_mode_enabled", enabled);
    }

    public final void setBackgroundVoiceModeOOBEShown(boolean enabled) {
        AppLaunchChecker$$ExternalSyntheticOutline0.m(this.sharedPreferences, "background_voice_mode_oobe_shown", enabled);
    }
}
