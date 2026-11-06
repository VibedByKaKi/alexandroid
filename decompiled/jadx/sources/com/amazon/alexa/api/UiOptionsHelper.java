package com.amazon.alexa.api;

import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.voice.ui.ra.RaUiOptions;
import com.amazon.alexa.voice.ui.ra.SuggestionTheme;
import com.dee.app.contacts.common.constants.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/api/UiOptionsHelper;", "", "<init>", "()V", Constants.LOG_TAG, "", "UI_OPTIONS_KEY", "RA_UI_OPTIONS_KEY", "EXTRA_LAUNCH_SOURCE", "LAUNCH_SOURCE_WAKE_WORD", "KEY_SUGGESTION_THEME", "KEY_HIDE_ATTACH_BUTTON", "KEY_HIDE_OVERFLOW_MENU", "KEY_HIDE_CONTEXTUAL_MENU", "KEY_ENABLE_SPEECH_RESPONSE_ALWAYS", "parseUiOptions", "Lcom/amazon/alexa/voice/ui/ra/RaUiOptions;", "bundle", "Landroid/os/Bundle;", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUiOptionsHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UiOptionsHelper.kt\ncom/amazon/alexa/api/UiOptionsHelper\n+ 2 Util.kt\ncom/amazon/alexa/ra/core/ui/UtilKt\n*L\n1#1,63:1\n21#2,7:64\n*S KotlinDebug\n*F\n+ 1 UiOptionsHelper.kt\ncom/amazon/alexa/api/UiOptionsHelper\n*L\n33#1:64,7\n*E\n"})
/* loaded from: classes16.dex */
public final class UiOptionsHelper {
    public static final int $stable = 0;

    @NotNull
    public static final String EXTRA_LAUNCH_SOURCE = "launch_source";

    @NotNull
    public static final UiOptionsHelper INSTANCE = new UiOptionsHelper();

    @NotNull
    private static final String KEY_ENABLE_SPEECH_RESPONSE_ALWAYS = "ENABLE_SPEECH_RESPONSE_ALWAYS";

    @NotNull
    private static final String KEY_HIDE_ATTACH_BUTTON = "HIDE_ATTACH_BUTTON";

    @NotNull
    private static final String KEY_HIDE_CONTEXTUAL_MENU = "HIDE_CONTEXTUAL_MENU";

    @NotNull
    private static final String KEY_HIDE_OVERFLOW_MENU = "HIDE_OVERFLOW_MENU";

    @NotNull
    private static final String KEY_SUGGESTION_THEME = "SUGGESTION_THEME";

    @NotNull
    public static final String LAUNCH_SOURCE_WAKE_WORD = "wakeWord";

    @NotNull
    public static final String RA_UI_OPTIONS_KEY = "ra_ui_options";

    @NotNull
    private static final String TAG = "UiOptionsHelper";

    @NotNull
    private static final String UI_OPTIONS_KEY = "ui_options";

    private UiOptionsHelper() {
    }

    @Nullable
    public final RaUiOptions parseUiOptions(@Nullable Bundle bundle) {
        Bundle bundle2;
        if (bundle != null) {
            RaUiOptions raUiOptions = (RaUiOptions) (Build.VERSION.SDK_INT >= 33 ? bundle.getParcelable("ra_ui_options", RaUiOptions.class) : bundle.getParcelable("ra_ui_options"));
            if (raUiOptions != null) {
                return raUiOptions;
            }
        }
        if (bundle == null || (bundle2 = bundle.getBundle("ui_options")) == null) {
            return null;
        }
        long j = bundle.getLong("startTimestamp", SystemClock.elapsedRealtime());
        String string = bundle.getString("launch_source");
        if (string == null) {
            string = "unknown";
        }
        String string2 = bundle2.getString(KEY_SUGGESTION_THEME);
        if (string2 == null) {
            string2 = "ADULT";
        }
        boolean z = bundle2.getBoolean(KEY_HIDE_ATTACH_BUTTON, false);
        return new RaUiOptions.Builder().setReferer(string).setStartTimeStamp(j).setPage("conversation").setSuggestionTheme(SuggestionTheme.fromString(string2)).setHideAttachButton(z).setHideOverflowMenu(bundle2.getBoolean(KEY_HIDE_OVERFLOW_MENU, false)).setHideContextualMenu(bundle2.getBoolean(KEY_HIDE_CONTEXTUAL_MENU, false)).setEnableSpeechResponseAlways(bundle2.getBoolean(KEY_ENABLE_SPEECH_RESPONSE_ALWAYS, false)).build();
    }
}
