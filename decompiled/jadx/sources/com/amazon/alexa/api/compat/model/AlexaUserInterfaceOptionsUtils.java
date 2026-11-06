package com.amazon.alexa.api.compat.model;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.api.compat.model.AlexaUserInterfaceOptions;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.UiOptionsBundleKeys;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007Jj\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH\u0007¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaUserInterfaceOptionsUtils;", "", "<init>", "()V", "getBundle", "Landroid/os/Bundle;", "options", "Lcom/amazon/alexa/api/compat/model/AlexaUserInterfaceOptions;", "getAlexaUserInterfaceOptions", "showHint", "", UiOptionsBundleKeys.HINT_TEXT, "", "isMinimalTheme", "showTtaIngress", UiOptionsBundleKeys.ENABLE_APL, "showBottomSheet", UiOptionsBundleKeys.SHOW_REMARKABLE_ALEXA, "suggestionTheme", "Lcom/amazon/alexa/api/compat/model/AlexaUserInterfaceOptions$SuggestionTheme;", "hideOverflowMenu", "enableSpeechResponseAlways", "hideAttachButton", "hideContextualMenu", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAlexaUserInterfaceOptionsUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlexaUserInterfaceOptionsUtils.kt\ncom/amazon/alexa/api/compat/model/AlexaUserInterfaceOptionsUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
/* loaded from: classes16.dex */
public final class AlexaUserInterfaceOptionsUtils {
    public static final int $stable = 0;

    @NotNull
    public static final AlexaUserInterfaceOptionsUtils INSTANCE = new AlexaUserInterfaceOptionsUtils();

    private AlexaUserInterfaceOptionsUtils() {
    }

    @JvmStatic
    @NotNull
    public static final AlexaUserInterfaceOptions getAlexaUserInterfaceOptions(boolean showHint, @Nullable String hintText, boolean isMinimalTheme, boolean showTtaIngress, boolean enableApl, boolean showBottomSheet, boolean showRemarkableAlexa, @NotNull AlexaUserInterfaceOptions.SuggestionTheme suggestionTheme, boolean hideOverflowMenu, boolean enableSpeechResponseAlways, boolean hideAttachButton, boolean hideContextualMenu) {
        suggestionTheme.getClass();
        AlexaUserInterfaceOptions.Builder hideContextualMenu2 = AlexaUserInterfaceOptions.INSTANCE.builder().setHintsEnabled(showHint).setTheme(isMinimalTheme ? AlexaUserInterfaceOptions.Theme.MINIMAL : AlexaUserInterfaceOptions.Theme.DEFAULT).setTypingEnabled(showTtaIngress).setAplEnabled(enableApl).setBottomSheetEnabled(showBottomSheet).setShowRemarkableAlexa(showRemarkableAlexa).setSuggestionTheme(suggestionTheme).setHideOverflowMenu(hideOverflowMenu).setEnableSpeechResponseAlways(enableSpeechResponseAlways).setHideAttachButton(hideAttachButton).setHideContextualMenu(hideContextualMenu);
        if (hintText != null) {
            hideContextualMenu2.setHintText(hintText);
        }
        return hideContextualMenu2.build();
    }

    @JvmStatic
    @NotNull
    public static final Bundle getBundle(@NotNull AlexaUserInterfaceOptions options) {
        options.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("ENABLE_HINTS", options.getEnableHints());
        String hintText = options.getHintText();
        if (hintText != null) {
            bundle.putString("HINT_TEXT", hintText);
        }
        bundle.putString("THEME", options.getTheme().name());
        bundle.putBoolean("ENABLE_TYPING", options.getEnableTyping());
        bundle.putBoolean("ENABLE_APL", options.getEnableApl());
        bundle.putBoolean("ENABLE_BOTTOMSHEET", options.getEnableBottomSheet());
        bundle.putBoolean("SHOW_REMARKABLE_ALEXA", options.getShowRemarkableAlexa());
        bundle.putString("SUGGESTION_THEME", options.getSuggestionTheme().name());
        bundle.putBoolean("HIDE_OVERFLOW_MENU", options.getHideOverflowMenu());
        bundle.putBoolean("ENABLE_SPEECH_RESPONSE_ALWAYS", options.getEnableSpeechResponseAlways());
        bundle.putBoolean("HIDE_ATTACH_BUTTON", options.getHideAttachButton());
        bundle.putBoolean("HIDE_CONTEXTUAL_MENU", options.getHideContextualMenu());
        return bundle;
    }
}
