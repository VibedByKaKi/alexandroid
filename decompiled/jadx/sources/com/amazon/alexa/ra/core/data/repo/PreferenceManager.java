package com.amazon.alexa.ra.core.data.repo;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0006\u0010\u0012\u001a\u00020\u000bJ\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000bJ\u0006\u0010\u0015\u001a\u00020\u000bJ\u000e\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000bJ\u0006\u0010\u0017\u001a\u00020\u000bJ\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000bJ\u0006\u0010\u0019\u001a\u00020\u000bJ\u0006\u0010\u001a\u001a\u00020\u000eJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001cJ\u0006\u0010\u001f\u001a\u00020\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006!"}, d2 = {"Lcom/amazon/alexa/ra/core/data/repo/PreferenceManager;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "Landroid/content/SharedPreferences;", "getStoragePermissionDeniedSecondTime", "", "getCameraPermissionDeniedSecondTime", "setStoragePermissionDeniedSecondTime", "", "setCameraPermissionDeniedSecondTime", "getPersonalizedGreeting", "", "getShowAllProfileChats", "setShowAllProfileChats", "value", "getCameraShareConsentDismissed", "setCameraShareConsentDismissed", "getScreenShareConsentDismissed", "setScreenShareConsentDismissed", "getWakeWordDisabledMessageShown", "setWakeWordDisabledMessageShown", "getPromptSkipCount", "", "setPromptSkipCount", "count", "incrementAndGetLiveModeIngressCount", "Companion", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPreferenceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreferenceManager.kt\ncom/amazon/alexa/ra/core/data/repo/PreferenceManager\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,100:1\n39#2,12:101\n39#2,12:113\n39#2,12:125\n39#2,12:137\n39#2,12:149\n39#2,12:161\n*S KotlinDebug\n*F\n+ 1 PreferenceManager.kt\ncom/amazon/alexa/ra/core/data/repo/PreferenceManager\n*L\n41#1:101,12\n49#1:113,12\n57#1:125,12\n67#1:137,12\n75#1:149,12\n82#1:161,12\n*E\n"})
/* loaded from: classes18.dex */
public final class PreferenceManager {

    @NotNull
    private static final String ALEXA_RA_SHARED_PREFS_FILE_NAME = "ra_alexa_shared_prefs";

    @NotNull
    private static final String KEY_BG_CONVERSATIONS_PROMPT_SKIP_COUNT = "bg_conversations_prompt_skip_count";

    @NotNull
    private static final String KEY_CAMERA_PERMISSION_DENIED_TWICE = "camera_permission_denied_twice";

    @NotNull
    private static final String KEY_CAMERA_SHARE_CONSENT_DISMISSED = "camera_share_consent_dismissed";

    @NotNull
    private static final String KEY_LIVE_MODE_INGRESS_COUNT = "live_mode_ingress_count";

    @NotNull
    private static final String KEY_SCREEN_SHARE_CONSENT_DISMISSED = "screen_share_consent_dismissed";

    @NotNull
    private static final String KEY_SHOW_ALL_PROFILE_CHATS = "show_all_profile_chats";

    @NotNull
    private static final String KEY_STORAGE_PERMISSION_DENIED_TWICE = "storage_permission_denied_twice";

    @NotNull
    private static final String KEY_WW_DISABLED_MESSAGE_SHOWN = "ww_disabled_live_mode_message_shown";

    @NotNull
    private static final String PERSONALIZED_GREETING_KEY = "agent.greeting";

    @NotNull
    private static final String PERSONALIZED_GREETING_PREFS_FILE_NAME = "personalized_greeting_prefs";

    @NotNull
    private final Context context;
    private final SharedPreferences sharedPreferences;
    public static final int $stable = 8;

    public PreferenceManager(@NotNull Context context) {
        context.getClass();
        this.context = context;
        this.sharedPreferences = context.getSharedPreferences(ALEXA_RA_SHARED_PREFS_FILE_NAME, 0);
    }

    public final boolean getCameraPermissionDeniedSecondTime() {
        return this.sharedPreferences.getBoolean(KEY_CAMERA_PERMISSION_DENIED_TWICE, false);
    }

    public final boolean getCameraShareConsentDismissed() {
        return this.sharedPreferences.getBoolean(KEY_CAMERA_SHARE_CONSENT_DISMISSED, false);
    }

    @Nullable
    public final String getPersonalizedGreeting() {
        return this.context.getSharedPreferences(PERSONALIZED_GREETING_PREFS_FILE_NAME, 0).getString(PERSONALIZED_GREETING_KEY, null);
    }

    public final int getPromptSkipCount() {
        return this.sharedPreferences.getInt(KEY_BG_CONVERSATIONS_PROMPT_SKIP_COUNT, 0);
    }

    public final boolean getScreenShareConsentDismissed() {
        return this.sharedPreferences.getBoolean(KEY_SCREEN_SHARE_CONSENT_DISMISSED, false);
    }

    public final boolean getShowAllProfileChats() {
        return this.sharedPreferences.getBoolean(KEY_SHOW_ALL_PROFILE_CHATS, true);
    }

    public final boolean getStoragePermissionDeniedSecondTime() {
        return this.sharedPreferences.getBoolean(KEY_STORAGE_PERMISSION_DENIED_TWICE, false);
    }

    public final boolean getWakeWordDisabledMessageShown() {
        return this.sharedPreferences.getBoolean(KEY_WW_DISABLED_MESSAGE_SHOWN, false);
    }

    public final int incrementAndGetLiveModeIngressCount() {
        int i = this.sharedPreferences.getInt(KEY_LIVE_MODE_INGRESS_COUNT, 0);
        if (i > 2) {
            return i;
        }
        int i2 = i + 1;
        SharedPreferences sharedPreferences = this.sharedPreferences;
        sharedPreferences.getClass();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt(KEY_LIVE_MODE_INGRESS_COUNT, i2);
        edit.apply();
        return i2;
    }

    public final void setCameraPermissionDeniedSecondTime() {
        AppLaunchChecker$$ExternalSyntheticOutline0.m(this.sharedPreferences, KEY_CAMERA_PERMISSION_DENIED_TWICE, true);
    }

    public final void setCameraShareConsentDismissed(boolean value) {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        sharedPreferences.getClass();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean(KEY_CAMERA_SHARE_CONSENT_DISMISSED, value);
        edit.apply();
    }

    public final void setPromptSkipCount(int count) {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        sharedPreferences.getClass();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt(KEY_BG_CONVERSATIONS_PROMPT_SKIP_COUNT, count);
        edit.apply();
    }

    public final void setScreenShareConsentDismissed(boolean value) {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        sharedPreferences.getClass();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean(KEY_SCREEN_SHARE_CONSENT_DISMISSED, value);
        edit.apply();
    }

    public final void setShowAllProfileChats(boolean value) {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        sharedPreferences.getClass();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean(KEY_SHOW_ALL_PROFILE_CHATS, value);
        edit.apply();
    }

    public final void setStoragePermissionDeniedSecondTime() {
        AppLaunchChecker$$ExternalSyntheticOutline0.m(this.sharedPreferences, KEY_STORAGE_PERMISSION_DENIED_TWICE, true);
    }

    public final void setWakeWordDisabledMessageShown() {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        sharedPreferences.getClass();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean(KEY_WW_DISABLED_MESSAGE_SHOWN, true);
        edit.apply();
    }
}
