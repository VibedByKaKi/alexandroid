package com.amazon.alexa.api;

import android.os.Bundle;
import com.amazon.alexa.api.Bundles;
import com.amazon.alexa.client.annotations.Nullable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaUserInterfaceOptions {
    private final boolean enableApl;
    private final boolean enableBottomSheet;
    private final boolean enableHints;
    private final boolean enableSpeechResponseAlways;
    private final boolean enableTyping;
    private final boolean hideAttachButton;
    private final boolean hideContextualMenu;
    private final boolean hideOverflowMenu;
    private final String hintText;
    private final boolean showRemarkableAlexa;
    private final SuggestionTheme suggestionTheme;
    private final Theme theme;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum SuggestionTheme {
        ADULT,
        KID_FRIENDLY,
        HIDDEN;

        public static SuggestionTheme fromString(@Nullable String str) {
            try {
                return str == null ? ADULT : valueOf(str);
            } catch (Exception unused) {
                return ADULT;
            }
        }

        public static boolean isKidsTheme(SuggestionTheme suggestionTheme) {
            return suggestionTheme == KID_FRIENDLY || suggestionTheme == HIDDEN;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Theme {
        DEFAULT,
        MINIMAL;

        public static Theme fromString(@Nullable String str) {
            try {
                return str == null ? DEFAULT : valueOf(str);
            } catch (Exception unused) {
                return DEFAULT;
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum UiOptionKeys implements Bundles.Key {
        HINT_TEXT,
        ENABLE_HINTS,
        THEME,
        ENABLE_TYPING,
        ENABLE_APL,
        ENABLE_BOTTOMSHEET,
        SHOW_REMARKABLE_ALEXA,
        SHOW_KIDS_SUGGESTIONS,
        SUGGESTION_THEME,
        HIDE_OVERFLOW_MENU,
        ENABLE_SPEECH_RESPONSE_ALWAYS,
        HIDE_ATTACH_BUTTON,
        HIDE_CONTEXTUAL_MENU
    }

    public AlexaUserInterfaceOptions(@Nullable Bundle bundle) {
        this.hintText = Bundles.getOptionalString(bundle, UiOptionKeys.HINT_TEXT);
        this.enableHints = Bundles.getBoolean(bundle, UiOptionKeys.ENABLE_HINTS);
        this.theme = Theme.fromString(Bundles.getOptionalString(bundle, UiOptionKeys.THEME));
        this.enableTyping = Bundles.getBoolean(bundle, UiOptionKeys.ENABLE_TYPING);
        this.enableApl = Bundles.getBoolean(bundle, UiOptionKeys.ENABLE_APL);
        this.enableBottomSheet = Bundles.getBoolean(bundle, UiOptionKeys.ENABLE_BOTTOMSHEET);
        this.showRemarkableAlexa = Bundles.getBoolean(bundle, UiOptionKeys.SHOW_REMARKABLE_ALEXA);
        this.suggestionTheme = SuggestionTheme.fromString(Bundles.getOptionalString(bundle, UiOptionKeys.SUGGESTION_THEME));
        this.hideOverflowMenu = Bundles.getBoolean(bundle, UiOptionKeys.HIDE_OVERFLOW_MENU);
        this.enableSpeechResponseAlways = Bundles.getBoolean(bundle, UiOptionKeys.ENABLE_SPEECH_RESPONSE_ALWAYS);
        this.hideAttachButton = Bundles.getBoolean(bundle, UiOptionKeys.HIDE_ATTACH_BUTTON);
        this.hideContextualMenu = Bundles.getBoolean(bundle, UiOptionKeys.HIDE_CONTEXTUAL_MENU);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder getBuilder(AlexaUserInterfaceOptions alexaUserInterfaceOptions) {
        return builder().setHintText(alexaUserInterfaceOptions.getHintText()).setHintsEnabled(alexaUserInterfaceOptions.getHintsEnabled()).setTheme(alexaUserInterfaceOptions.getTheme()).setTypingEnabled(alexaUserInterfaceOptions.getTypingEnabled()).setAplEnabled(alexaUserInterfaceOptions.getAplEnabled()).setBottomSheetEnabled(alexaUserInterfaceOptions.getBottomSheetEnabled()).setShowRemarkableAlexa(alexaUserInterfaceOptions.getShowRemarkableAlexa()).setSuggestionTheme(alexaUserInterfaceOptions.getSuggestionTheme()).setHideOverflowMenu(alexaUserInterfaceOptions.getHideOverflowMenu()).setEnableSpeechResponseAlways(alexaUserInterfaceOptions.getEnableSpeechResponseAlways()).setHideAttachButton(alexaUserInterfaceOptions.getHideAttachButton()).setHideContextualMenu(alexaUserInterfaceOptions.getHideContextualMenu());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AlexaUserInterfaceOptions alexaUserInterfaceOptions = (AlexaUserInterfaceOptions) obj;
            if (this.enableHints == alexaUserInterfaceOptions.enableHints && Objects.equals(this.hintText, alexaUserInterfaceOptions.hintText) && this.theme == alexaUserInterfaceOptions.theme && this.enableTyping == alexaUserInterfaceOptions.enableTyping && this.enableApl == alexaUserInterfaceOptions.enableApl && this.enableBottomSheet == alexaUserInterfaceOptions.enableBottomSheet && this.showRemarkableAlexa == alexaUserInterfaceOptions.showRemarkableAlexa && this.suggestionTheme == alexaUserInterfaceOptions.suggestionTheme && this.hideOverflowMenu == alexaUserInterfaceOptions.hideOverflowMenu && this.enableSpeechResponseAlways == alexaUserInterfaceOptions.enableSpeechResponseAlways && this.hideAttachButton == alexaUserInterfaceOptions.hideAttachButton && this.hideContextualMenu == alexaUserInterfaceOptions.hideContextualMenu) {
                return true;
            }
        }
        return false;
    }

    public boolean getAplEnabled() {
        return this.enableApl;
    }

    public boolean getBottomSheetEnabled() {
        return this.enableBottomSheet;
    }

    public Bundle getBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(UiOptionKeys.HINT_TEXT.name(), this.hintText);
        bundle.putBoolean(UiOptionKeys.ENABLE_HINTS.name(), this.enableHints);
        bundle.putString(UiOptionKeys.THEME.name(), this.theme.name());
        bundle.putBoolean(UiOptionKeys.ENABLE_TYPING.name(), this.enableTyping);
        bundle.putBoolean(UiOptionKeys.ENABLE_APL.name(), this.enableApl);
        bundle.putBoolean(UiOptionKeys.ENABLE_BOTTOMSHEET.name(), this.enableBottomSheet);
        bundle.putBoolean(UiOptionKeys.SHOW_REMARKABLE_ALEXA.name(), this.showRemarkableAlexa);
        bundle.putString(UiOptionKeys.SUGGESTION_THEME.name(), this.suggestionTheme.name());
        bundle.putBoolean(UiOptionKeys.HIDE_OVERFLOW_MENU.name(), this.hideOverflowMenu);
        bundle.putBoolean(UiOptionKeys.ENABLE_SPEECH_RESPONSE_ALWAYS.name(), this.enableSpeechResponseAlways);
        bundle.putBoolean(UiOptionKeys.HIDE_ATTACH_BUTTON.name(), this.hideAttachButton);
        bundle.putBoolean(UiOptionKeys.HIDE_CONTEXTUAL_MENU.name(), this.hideContextualMenu);
        return bundle;
    }

    public boolean getEnableSpeechResponseAlways() {
        return this.enableSpeechResponseAlways;
    }

    public boolean getHideAttachButton() {
        return this.hideAttachButton;
    }

    public boolean getHideContextualMenu() {
        return this.hideContextualMenu;
    }

    public boolean getHideOverflowMenu() {
        return this.hideOverflowMenu;
    }

    @Nullable
    public String getHintText() {
        return this.hintText;
    }

    public boolean getHintsEnabled() {
        return this.enableHints;
    }

    public boolean getShowRemarkableAlexa() {
        return this.showRemarkableAlexa;
    }

    public SuggestionTheme getSuggestionTheme() {
        return this.suggestionTheme;
    }

    public Theme getTheme() {
        return this.theme;
    }

    public boolean getTypingEnabled() {
        return this.enableTyping;
    }

    public int hashCode() {
        return Objects.hash(this.hintText, Boolean.valueOf(this.enableHints), this.theme, Boolean.valueOf(this.enableTyping), Boolean.valueOf(this.enableApl), Boolean.valueOf(this.enableBottomSheet), Boolean.valueOf(this.showRemarkableAlexa), this.suggestionTheme, Boolean.valueOf(this.hideOverflowMenu), Boolean.valueOf(this.enableSpeechResponseAlways), Boolean.valueOf(this.hideAttachButton), Boolean.valueOf(this.hideContextualMenu));
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private boolean enableApl;
        private boolean enableBottomSheet;
        private boolean enableHints;
        private boolean enableSpeechResponseAlways;
        private boolean enableTyping;
        private boolean hideAttachButton;
        private boolean hideContextualMenu;
        private boolean hideOverflowMenu;
        private String hintText;
        private boolean showRemarkableAlexa;
        private SuggestionTheme suggestionTheme;
        private Theme theme;

        public AlexaUserInterfaceOptions build() {
            return new AlexaUserInterfaceOptions(this);
        }

        public Builder setAplEnabled(boolean z) {
            this.enableApl = z;
            return this;
        }

        public Builder setBottomSheetEnabled(boolean z) {
            this.enableBottomSheet = z;
            return this;
        }

        public Builder setEnableSpeechResponseAlways(boolean z) {
            this.enableSpeechResponseAlways = z;
            return this;
        }

        public Builder setHideAttachButton(boolean z) {
            this.hideAttachButton = z;
            return this;
        }

        public Builder setHideContextualMenu(boolean z) {
            this.hideContextualMenu = z;
            return this;
        }

        public Builder setHideOverflowMenu(boolean z) {
            this.hideOverflowMenu = z;
            return this;
        }

        public Builder setHintText(String str) {
            this.enableHints = true;
            this.hintText = str;
            return this;
        }

        public Builder setHintsEnabled(boolean z) {
            this.enableHints = z;
            return this;
        }

        public Builder setShowRemarkableAlexa(boolean z) {
            this.showRemarkableAlexa = z;
            return this;
        }

        public Builder setSuggestionTheme(SuggestionTheme suggestionTheme) {
            this.suggestionTheme = suggestionTheme;
            return this;
        }

        public Builder setTheme(Theme theme) {
            this.theme = theme;
            return this;
        }

        public Builder setTypingEnabled(boolean z) {
            this.enableTyping = z;
            return this;
        }

        private Builder() {
        }
    }

    private AlexaUserInterfaceOptions(Builder builder) {
        this.hintText = builder.hintText;
        this.enableHints = builder.enableHints;
        this.theme = builder.theme == null ? Theme.DEFAULT : builder.theme;
        this.enableTyping = builder.enableTyping;
        this.enableApl = builder.enableApl;
        this.enableBottomSheet = builder.enableBottomSheet;
        this.showRemarkableAlexa = builder.showRemarkableAlexa;
        this.suggestionTheme = builder.suggestionTheme == null ? SuggestionTheme.ADULT : builder.suggestionTheme;
        this.hideOverflowMenu = builder.hideOverflowMenu;
        this.enableSpeechResponseAlways = builder.enableSpeechResponseAlways;
        this.hideAttachButton = builder.hideAttachButton;
        this.hideContextualMenu = builder.hideContextualMenu;
    }
}
