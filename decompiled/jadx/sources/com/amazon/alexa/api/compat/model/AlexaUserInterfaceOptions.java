package com.amazon.alexa.api.compat.model;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.UiOptionsBundleKeys;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u0000 92\u00020\u0001:\u00046789B\u0081\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\u0083\u0001\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005HÆ\u0001J\u0013\u00101\u001a\u00020\u00052\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017¨\u0006:"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaUserInterfaceOptions;", "", UiOptionsBundleKeys.HINT_TEXT, "", UiOptionsBundleKeys.ENABLE_HINTS, "", "theme", "Lcom/amazon/alexa/api/compat/model/AlexaUserInterfaceOptions$Theme;", UiOptionsBundleKeys.ENABLE_TYPING, UiOptionsBundleKeys.ENABLE_APL, UiOptionsBundleKeys.ENABLE_BOTTOM_SHEET, UiOptionsBundleKeys.SHOW_REMARKABLE_ALEXA, "suggestionTheme", "Lcom/amazon/alexa/api/compat/model/AlexaUserInterfaceOptions$SuggestionTheme;", "hideOverflowMenu", "enableSpeechResponseAlways", "hideAttachButton", "hideContextualMenu", "<init>", "(Ljava/lang/String;ZLcom/amazon/alexa/api/compat/model/AlexaUserInterfaceOptions$Theme;ZZZZLcom/amazon/alexa/api/compat/model/AlexaUserInterfaceOptions$SuggestionTheme;ZZZZ)V", "getHintText", "()Ljava/lang/String;", "getEnableHints", "()Z", "getTheme", "()Lcom/amazon/alexa/api/compat/model/AlexaUserInterfaceOptions$Theme;", "getEnableTyping", "getEnableApl", "getEnableBottomSheet", "getShowRemarkableAlexa", "getSuggestionTheme", "()Lcom/amazon/alexa/api/compat/model/AlexaUserInterfaceOptions$SuggestionTheme;", "getHideOverflowMenu", "getEnableSpeechResponseAlways", "getHideAttachButton", "getHideContextualMenu", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Theme", "SuggestionTheme", "Builder", "Companion", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AlexaUserInterfaceOptions {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean enableApl;
    private final boolean enableBottomSheet;
    private final boolean enableHints;
    private final boolean enableSpeechResponseAlways;
    private final boolean enableTyping;
    private final boolean hideAttachButton;
    private final boolean hideContextualMenu;
    private final boolean hideOverflowMenu;

    @Nullable
    private final String hintText;
    private final boolean showRemarkableAlexa;

    @NotNull
    private final SuggestionTheme suggestionTheme;

    @NotNull
    private final Theme theme;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0007J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0007J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0007J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0007J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0007J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0007J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0007J\u0006\u0010 \u001a\u00020!R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaUserInterfaceOptions$Builder;", "", "<init>", "()V", UiOptionsBundleKeys.HINT_TEXT, "", UiOptionsBundleKeys.ENABLE_HINTS, "", "theme", "Lcom/amazon/alexa/api/compat/model/AlexaUserInterfaceOptions$Theme;", UiOptionsBundleKeys.ENABLE_TYPING, UiOptionsBundleKeys.ENABLE_APL, UiOptionsBundleKeys.ENABLE_BOTTOM_SHEET, UiOptionsBundleKeys.SHOW_REMARKABLE_ALEXA, "suggestionTheme", "Lcom/amazon/alexa/api/compat/model/AlexaUserInterfaceOptions$SuggestionTheme;", "hideOverflowMenu", "enableSpeechResponseAlways", "hideAttachButton", "hideContextualMenu", "setHintText", "setHintsEnabled", "setTheme", "setTypingEnabled", "setAplEnabled", "setBottomSheetEnabled", "setShowRemarkableAlexa", "setSuggestionTheme", "setHideOverflowMenu", "setEnableSpeechResponseAlways", "setHideAttachButton", "setHideContextualMenu", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/api/compat/model/AlexaUserInterfaceOptions;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAlexaUserInterfaceOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlexaUserInterfaceOptions.kt\ncom/amazon/alexa/api/compat/model/AlexaUserInterfaceOptions$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,89:1\n1#2:90\n*E\n"})
    public static final class Builder {
        public static final int $stable = 8;
        private boolean enableApl;
        private boolean enableBottomSheet;
        private boolean enableHints;
        private boolean enableSpeechResponseAlways;
        private boolean enableTyping;
        private boolean hideAttachButton;
        private boolean hideContextualMenu;
        private boolean hideOverflowMenu;

        @Nullable
        private String hintText;
        private boolean showRemarkableAlexa;

        @NotNull
        private Theme theme = Theme.DEFAULT;

        @NotNull
        private SuggestionTheme suggestionTheme = SuggestionTheme.ADULT;

        @NotNull
        public final AlexaUserInterfaceOptions build() {
            return new AlexaUserInterfaceOptions(this.hintText, this.enableHints, this.theme, this.enableTyping, this.enableApl, this.enableBottomSheet, this.showRemarkableAlexa, this.suggestionTheme, this.hideOverflowMenu, this.enableSpeechResponseAlways, this.hideAttachButton, this.hideContextualMenu);
        }

        @NotNull
        public final Builder setAplEnabled(boolean enableApl) {
            this.enableApl = enableApl;
            return this;
        }

        @NotNull
        public final Builder setBottomSheetEnabled(boolean enableBottomSheet) {
            this.enableBottomSheet = enableBottomSheet;
            return this;
        }

        @NotNull
        public final Builder setEnableSpeechResponseAlways(boolean enableSpeechResponseAlways) {
            this.enableSpeechResponseAlways = enableSpeechResponseAlways;
            return this;
        }

        @NotNull
        public final Builder setHideAttachButton(boolean hideAttachButton) {
            this.hideAttachButton = hideAttachButton;
            return this;
        }

        @NotNull
        public final Builder setHideContextualMenu(boolean hideContextualMenu) {
            this.hideContextualMenu = hideContextualMenu;
            return this;
        }

        @NotNull
        public final Builder setHideOverflowMenu(boolean hideOverflowMenu) {
            this.hideOverflowMenu = hideOverflowMenu;
            return this;
        }

        @NotNull
        public final Builder setHintText(@Nullable String hintText) {
            this.hintText = hintText;
            this.enableHints = true;
            return this;
        }

        @NotNull
        public final Builder setHintsEnabled(boolean enableHints) {
            this.enableHints = enableHints;
            return this;
        }

        @NotNull
        public final Builder setShowRemarkableAlexa(boolean showRemarkableAlexa) {
            this.showRemarkableAlexa = showRemarkableAlexa;
            return this;
        }

        @NotNull
        public final Builder setSuggestionTheme(@NotNull SuggestionTheme suggestionTheme) {
            suggestionTheme.getClass();
            this.suggestionTheme = suggestionTheme;
            return this;
        }

        @NotNull
        public final Builder setTheme(@NotNull Theme theme) {
            theme.getClass();
            this.theme = theme;
            return this;
        }

        @NotNull
        public final Builder setTypingEnabled(boolean enableTyping) {
            this.enableTyping = enableTyping;
            return this;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaUserInterfaceOptions$SuggestionTheme;", "", "<init>", "(Ljava/lang/String;I)V", "ADULT", "KID_FRIENDLY", "HIDDEN", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SuggestionTheme {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SuggestionTheme[] $VALUES;
        public static final SuggestionTheme ADULT = new SuggestionTheme("ADULT", 0);
        public static final SuggestionTheme KID_FRIENDLY = new SuggestionTheme("KID_FRIENDLY", 1);
        public static final SuggestionTheme HIDDEN = new SuggestionTheme("HIDDEN", 2);

        private static final /* synthetic */ SuggestionTheme[] $values() {
            return new SuggestionTheme[]{ADULT, KID_FRIENDLY, HIDDEN};
        }

        static {
            SuggestionTheme[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private SuggestionTheme(String str, int i) {
        }

        @NotNull
        public static EnumEntries<SuggestionTheme> getEntries() {
            return $ENTRIES;
        }

        public static SuggestionTheme valueOf(String str) {
            return (SuggestionTheme) Enum.valueOf(SuggestionTheme.class, str);
        }

        public static SuggestionTheme[] values() {
            return (SuggestionTheme[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaUserInterfaceOptions$Theme;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "MINIMAL", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Theme {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Theme[] $VALUES;
        public static final Theme DEFAULT = new Theme("DEFAULT", 0);
        public static final Theme MINIMAL = new Theme("MINIMAL", 1);

        private static final /* synthetic */ Theme[] $values() {
            return new Theme[]{DEFAULT, MINIMAL};
        }

        static {
            Theme[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private Theme(String str, int i) {
        }

        @NotNull
        public static EnumEntries<Theme> getEntries() {
            return $ENTRIES;
        }

        public static Theme valueOf(String str) {
            return (Theme) Enum.valueOf(Theme.class, str);
        }

        public static Theme[] values() {
            return (Theme[]) $VALUES.clone();
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ AlexaUserInterfaceOptions(java.lang.String r2, boolean r3, com.amazon.alexa.api.compat.model.AlexaUserInterfaceOptions.Theme r4, boolean r5, boolean r6, boolean r7, boolean r8, com.amazon.alexa.api.compat.model.AlexaUserInterfaceOptions.SuggestionTheme r9, boolean r10, boolean r11, boolean r12, boolean r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r1 = this;
            r15 = r14 & 1
            if (r15 == 0) goto L5
            r2 = 0
        L5:
            r15 = r14 & 2
            r0 = 0
            if (r15 == 0) goto Lb
            r3 = r0
        Lb:
            r15 = r14 & 4
            if (r15 == 0) goto L11
            com.amazon.alexa.api.compat.model.AlexaUserInterfaceOptions$Theme r4 = com.amazon.alexa.api.compat.model.AlexaUserInterfaceOptions.Theme.DEFAULT
        L11:
            r15 = r14 & 8
            if (r15 == 0) goto L16
            r5 = r0
        L16:
            r15 = r14 & 16
            if (r15 == 0) goto L1b
            r6 = r0
        L1b:
            r15 = r14 & 32
            if (r15 == 0) goto L20
            r7 = r0
        L20:
            r15 = r14 & 64
            if (r15 == 0) goto L25
            r8 = r0
        L25:
            r15 = r14 & 128(0x80, float:1.8E-43)
            if (r15 == 0) goto L2b
            com.amazon.alexa.api.compat.model.AlexaUserInterfaceOptions$SuggestionTheme r9 = com.amazon.alexa.api.compat.model.AlexaUserInterfaceOptions.SuggestionTheme.ADULT
        L2b:
            r15 = r14 & 256(0x100, float:3.59E-43)
            if (r15 == 0) goto L30
            r10 = r0
        L30:
            r15 = r14 & 512(0x200, float:7.17E-43)
            if (r15 == 0) goto L35
            r11 = r0
        L35:
            r15 = r14 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L3a
            r12 = r0
        L3a:
            r14 = r14 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L4c
            r15 = r0
            r13 = r11
            r14 = r12
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L59
        L4c:
            r15 = r13
            r14 = r12
            r12 = r10
            r13 = r11
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L59:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.api.compat.model.AlexaUserInterfaceOptions.<init>(java.lang.String, boolean, com.amazon.alexa.api.compat.model.AlexaUserInterfaceOptions$Theme, boolean, boolean, boolean, boolean, com.amazon.alexa.api.compat.model.AlexaUserInterfaceOptions$SuggestionTheme, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @JvmStatic
    @NotNull
    public static final Builder builder() {
        return INSTANCE.builder();
    }

    public static /* synthetic */ AlexaUserInterfaceOptions copy$default(AlexaUserInterfaceOptions alexaUserInterfaceOptions, String str, boolean z, Theme theme, boolean z2, boolean z3, boolean z4, boolean z5, SuggestionTheme suggestionTheme, boolean z6, boolean z7, boolean z8, boolean z9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alexaUserInterfaceOptions.hintText;
        }
        if ((i & 2) != 0) {
            z = alexaUserInterfaceOptions.enableHints;
        }
        if ((i & 4) != 0) {
            theme = alexaUserInterfaceOptions.theme;
        }
        if ((i & 8) != 0) {
            z2 = alexaUserInterfaceOptions.enableTyping;
        }
        if ((i & 16) != 0) {
            z3 = alexaUserInterfaceOptions.enableApl;
        }
        if ((i & 32) != 0) {
            z4 = alexaUserInterfaceOptions.enableBottomSheet;
        }
        if ((i & 64) != 0) {
            z5 = alexaUserInterfaceOptions.showRemarkableAlexa;
        }
        if ((i & 128) != 0) {
            suggestionTheme = alexaUserInterfaceOptions.suggestionTheme;
        }
        if ((i & 256) != 0) {
            z6 = alexaUserInterfaceOptions.hideOverflowMenu;
        }
        if ((i & 512) != 0) {
            z7 = alexaUserInterfaceOptions.enableSpeechResponseAlways;
        }
        if ((i & 1024) != 0) {
            z8 = alexaUserInterfaceOptions.hideAttachButton;
        }
        if ((i & 2048) != 0) {
            z9 = alexaUserInterfaceOptions.hideContextualMenu;
        }
        boolean z10 = z8;
        boolean z11 = z9;
        boolean z12 = z6;
        boolean z13 = z7;
        boolean z14 = z5;
        SuggestionTheme suggestionTheme2 = suggestionTheme;
        boolean z15 = z3;
        boolean z16 = z4;
        return alexaUserInterfaceOptions.copy(str, z, theme, z2, z15, z16, z14, suggestionTheme2, z12, z13, z10, z11);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getHintText() {
        return this.hintText;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getEnableSpeechResponseAlways() {
        return this.enableSpeechResponseAlways;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getHideAttachButton() {
        return this.hideAttachButton;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getHideContextualMenu() {
        return this.hideContextualMenu;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnableHints() {
        return this.enableHints;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Theme getTheme() {
        return this.theme;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getEnableTyping() {
        return this.enableTyping;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getEnableApl() {
        return this.enableApl;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getEnableBottomSheet() {
        return this.enableBottomSheet;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShowRemarkableAlexa() {
        return this.showRemarkableAlexa;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final SuggestionTheme getSuggestionTheme() {
        return this.suggestionTheme;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getHideOverflowMenu() {
        return this.hideOverflowMenu;
    }

    @NotNull
    public final AlexaUserInterfaceOptions copy(@Nullable String hintText, boolean enableHints, @NotNull Theme theme, boolean enableTyping, boolean enableApl, boolean enableBottomSheet, boolean showRemarkableAlexa, @NotNull SuggestionTheme suggestionTheme, boolean hideOverflowMenu, boolean enableSpeechResponseAlways, boolean hideAttachButton, boolean hideContextualMenu) {
        theme.getClass();
        suggestionTheme.getClass();
        return new AlexaUserInterfaceOptions(hintText, enableHints, theme, enableTyping, enableApl, enableBottomSheet, showRemarkableAlexa, suggestionTheme, hideOverflowMenu, enableSpeechResponseAlways, hideAttachButton, hideContextualMenu);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlexaUserInterfaceOptions)) {
            return false;
        }
        AlexaUserInterfaceOptions alexaUserInterfaceOptions = (AlexaUserInterfaceOptions) other;
        return Intrinsics.areEqual(this.hintText, alexaUserInterfaceOptions.hintText) && this.enableHints == alexaUserInterfaceOptions.enableHints && this.theme == alexaUserInterfaceOptions.theme && this.enableTyping == alexaUserInterfaceOptions.enableTyping && this.enableApl == alexaUserInterfaceOptions.enableApl && this.enableBottomSheet == alexaUserInterfaceOptions.enableBottomSheet && this.showRemarkableAlexa == alexaUserInterfaceOptions.showRemarkableAlexa && this.suggestionTheme == alexaUserInterfaceOptions.suggestionTheme && this.hideOverflowMenu == alexaUserInterfaceOptions.hideOverflowMenu && this.enableSpeechResponseAlways == alexaUserInterfaceOptions.enableSpeechResponseAlways && this.hideAttachButton == alexaUserInterfaceOptions.hideAttachButton && this.hideContextualMenu == alexaUserInterfaceOptions.hideContextualMenu;
    }

    public final boolean getEnableApl() {
        return this.enableApl;
    }

    public final boolean getEnableBottomSheet() {
        return this.enableBottomSheet;
    }

    public final boolean getEnableHints() {
        return this.enableHints;
    }

    public final boolean getEnableSpeechResponseAlways() {
        return this.enableSpeechResponseAlways;
    }

    public final boolean getEnableTyping() {
        return this.enableTyping;
    }

    public final boolean getHideAttachButton() {
        return this.hideAttachButton;
    }

    public final boolean getHideContextualMenu() {
        return this.hideContextualMenu;
    }

    public final boolean getHideOverflowMenu() {
        return this.hideOverflowMenu;
    }

    @Nullable
    public final String getHintText() {
        return this.hintText;
    }

    public final boolean getShowRemarkableAlexa() {
        return this.showRemarkableAlexa;
    }

    @NotNull
    public final SuggestionTheme getSuggestionTheme() {
        return this.suggestionTheme;
    }

    @NotNull
    public final Theme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        String str = this.hintText;
        return Boolean.hashCode(this.hideContextualMenu) + DoubleList$$ExternalSyntheticOutline0.m(this.hideAttachButton, DoubleList$$ExternalSyntheticOutline0.m(this.enableSpeechResponseAlways, DoubleList$$ExternalSyntheticOutline0.m(this.hideOverflowMenu, (this.suggestionTheme.hashCode() + DoubleList$$ExternalSyntheticOutline0.m(this.showRemarkableAlexa, DoubleList$$ExternalSyntheticOutline0.m(this.enableBottomSheet, DoubleList$$ExternalSyntheticOutline0.m(this.enableApl, DoubleList$$ExternalSyntheticOutline0.m(this.enableTyping, (this.theme.hashCode() + DoubleList$$ExternalSyntheticOutline0.m(this.enableHints, (str == null ? 0 : str.hashCode()) * 31, 31)) * 31, 31), 31), 31), 31)) * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.hintText;
        boolean z = this.enableHints;
        Theme theme = this.theme;
        boolean z2 = this.enableTyping;
        boolean z3 = this.enableApl;
        boolean z4 = this.enableBottomSheet;
        boolean z5 = this.showRemarkableAlexa;
        SuggestionTheme suggestionTheme = this.suggestionTheme;
        boolean z6 = this.hideOverflowMenu;
        boolean z7 = this.enableSpeechResponseAlways;
        boolean z8 = this.hideAttachButton;
        boolean z9 = this.hideContextualMenu;
        StringBuilder m = Automotive$$ExternalSyntheticOutline0.m("AlexaUserInterfaceOptions(hintText=", str, ", enableHints=", z, ", theme=");
        m.append(theme);
        m.append(", enableTyping=");
        m.append(z2);
        m.append(", enableApl=");
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m14726m(m, z3, ", enableBottomSheet=", z4, ", showRemarkableAlexa=");
        m.append(z5);
        m.append(", suggestionTheme=");
        m.append(suggestionTheme);
        m.append(", hideOverflowMenu=");
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m14726m(m, z6, ", enableSpeechResponseAlways=", z7, ", hideAttachButton=");
        return AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(m, z8, ", hideContextualMenu=", z9, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaUserInterfaceOptions$Companion;", "", "<init>", "()V", "builder", "Lcom/amazon/alexa/api/compat/model/AlexaUserInterfaceOptions$Builder;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Builder builder() {
            return new Builder();
        }

        private Companion() {
        }
    }

    public AlexaUserInterfaceOptions(@Nullable String str, boolean z, @NotNull Theme theme, boolean z2, boolean z3, boolean z4, boolean z5, @NotNull SuggestionTheme suggestionTheme, boolean z6, boolean z7, boolean z8, boolean z9) {
        theme.getClass();
        suggestionTheme.getClass();
        this.hintText = str;
        this.enableHints = z;
        this.theme = theme;
        this.enableTyping = z2;
        this.enableApl = z3;
        this.enableBottomSheet = z4;
        this.showRemarkableAlexa = z5;
        this.suggestionTheme = suggestionTheme;
        this.hideOverflowMenu = z6;
        this.enableSpeechResponseAlways = z7;
        this.hideAttachButton = z8;
        this.hideContextualMenu = z9;
    }

    public AlexaUserInterfaceOptions() {
        this(null, false, null, false, false, false, false, null, false, false, false, false, 4095, null);
    }
}
