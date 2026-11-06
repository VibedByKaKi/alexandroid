package com.amazon.alexa.voice.ui.ra;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RaUiOptions implements Parcelable {
    private static final int BOOL_FALSE_VALUE = 0;
    private static final int BOOL_TRUE_VALUE = 1;
    public static final Parcelable.Creator<RaUiOptions> CREATOR = new Parcelable.Creator<RaUiOptions>() { // from class: com.amazon.alexa.voice.ui.ra.RaUiOptions.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RaUiOptions createFromParcel(Parcel parcel) {
            return new RaUiOptions(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RaUiOptions[] newArray(int i) {
            return new RaUiOptions[i];
        }
    };
    public static final String ENTER_ANIMATION_FADE = "fade";
    public static final String ENTER_ANIMATION_NONE = "none";
    public static final String ENTER_ANIMATION_PEEK = "peek";
    public static final String ENTER_ANIMATION_SLIDE = "slide";
    public static final String HINT_TEXT_OPERATION_SEND = "Send";
    public static final String HINT_TEXT_OPERATION_SHOW = "Show";
    public static final String UNKNOWN_REFERER = "UNKNOWN";
    public static String lastConversationId;
    private final int alexaPlusPreviewTextEnabled;
    private final String conversationId;
    private final int conversationTopicsEnabledResult;
    private final int directScreenshotUploadToConversation;
    private final int enableSpeechResponseAlways;
    private final String enterAnimationType;
    private final int feedbackSoundsEnabledResult;
    private final int hideAttachButton;
    private final int hideContextualMenu;
    private final int hideKeyboardOnSubmitEnabled;
    private final int hideOverflowMenu;
    private final String hintText;
    private final String hintTextOperation;
    private final int isScreenshotAvailable;
    private final String itemId;
    private final int navigateToTurnFeatureEnabledResult;
    private final int openShareSheetOnLaunch;
    private final String page;
    private final int personalizedContentEnabledResult;
    private final int preamblesEnabled;
    private final String raConversationLayoutStyle;
    private final String referer;
    private final String shareInUri;
    private final int showRedesignedGreeting;
    private final long startTimestamp;
    private final String startingState;
    private final SuggestionTheme suggestionTheme;
    private final String targetFragmentTimestamp;
    private final String universalPrivacyCode;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private int alexaPlusPreviewTextEnabled;
        private String conversationId;
        private int conversationTopicsEnabledResult;
        private int directScreenshotUploadToConversation;
        private int enableSpeechResponseAlways;
        private String enterAnimationType;
        private int feedbackSoundsEnabledResult;
        private int hideAttachButton;
        private int hideContextualMenu;
        private int hideOverflowMenu;
        private String hintText;
        private String hintTextOperation;
        private int isScreenshotAvailable;
        private String itemId;
        private int navigateToTurnFeatureEnabledResult;
        private int openShareSheetOnLaunch;
        private String page;
        private int personalizedContentEnabledResult;
        private int preamblesEnabled;
        private String raConversationLayoutStyle;
        private String referer;
        private int setHideKeyboardOnSubmitEnabled;
        private String shareInUri;
        private int showRedesignedGreeting;
        private long startTimestamp;
        private String startingState;
        private SuggestionTheme suggestionTheme;
        private String targetFragmentTimestamp;
        private String universalPrivacyCode;

        public RaUiOptions build() {
            return new RaUiOptions(this, 0);
        }

        public Builder setAlexaPlusPreviewTextEnabled(int i) {
            this.alexaPlusPreviewTextEnabled = i;
            return this;
        }

        public Builder setConversationId(@Nullable String str) {
            this.conversationId = str;
            return this;
        }

        public Builder setConversationTopicsEnabledResult(int i) {
            this.conversationTopicsEnabledResult = i;
            return this;
        }

        public Builder setDirectScreenshotUploadToConversation(boolean z) {
            this.directScreenshotUploadToConversation = z ? 1 : 0;
            return this;
        }

        public Builder setEnableSpeechResponseAlways(boolean z) {
            this.enableSpeechResponseAlways = z ? 1 : 0;
            return this;
        }

        public Builder setEnterAnimationType(String str) {
            this.enterAnimationType = str;
            return this;
        }

        public Builder setFeedbackSoundsEnabledResult(int i) {
            this.feedbackSoundsEnabledResult = i;
            return this;
        }

        public Builder setHideAttachButton(boolean z) {
            this.hideAttachButton = z ? 1 : 0;
            return this;
        }

        public Builder setHideContextualMenu(boolean z) {
            this.hideContextualMenu = z ? 1 : 0;
            return this;
        }

        public Builder setHideKeyboardOnSubmitEnabled(int i) {
            this.setHideKeyboardOnSubmitEnabled = i;
            return this;
        }

        public Builder setHideOverflowMenu(boolean z) {
            this.hideOverflowMenu = z ? 1 : 0;
            return this;
        }

        public Builder setHintText(@Nullable String str) {
            this.hintText = str;
            return this;
        }

        public Builder setHintTextOperation(@NonNull String str) {
            this.hintTextOperation = str;
            return this;
        }

        public Builder setIsScreenshotAvailable(boolean z) {
            this.isScreenshotAvailable = z ? 1 : 0;
            return this;
        }

        public Builder setItemId(@Nullable String str) {
            this.itemId = str;
            return this;
        }

        public Builder setNavigateToTurnFeatureEnabledResult(int i) {
            this.navigateToTurnFeatureEnabledResult = i;
            return this;
        }

        public Builder setOpenShareSheetOnLaunch(boolean z) {
            this.openShareSheetOnLaunch = z ? 1 : 0;
            return this;
        }

        public Builder setPage(@Nullable String str) {
            this.page = str;
            return this;
        }

        public Builder setPersonalizedContentEnabledResult(int i) {
            this.personalizedContentEnabledResult = i;
            return this;
        }

        public Builder setPreamblesEnabled(int i) {
            this.preamblesEnabled = i;
            return this;
        }

        public Builder setRaConversationLayoutStyle(@Nullable String str) {
            this.raConversationLayoutStyle = str;
            return this;
        }

        public Builder setReferer(@NonNull String str) {
            this.referer = str;
            return this;
        }

        public Builder setShareInUri(@Nullable String str) {
            this.shareInUri = str;
            return this;
        }

        public Builder setShowRedesignedGreeting(int i) {
            this.showRedesignedGreeting = i;
            return this;
        }

        public Builder setStartTimeStamp(long j) {
            this.startTimestamp = j;
            return this;
        }

        public Builder setStartingState(@Nullable String str) {
            this.startingState = str;
            return this;
        }

        public Builder setSuggestionTheme(SuggestionTheme suggestionTheme) {
            this.suggestionTheme = suggestionTheme;
            return this;
        }

        public Builder setTargetFragmentTimestamp(String str) {
            this.targetFragmentTimestamp = str;
            return this;
        }

        public Builder setUniversalPrivacyCode(String str) {
            this.universalPrivacyCode = str;
            return this;
        }
    }

    private RaUiOptions(Builder builder) {
        this.referer = builder.referer == null ? "UNKNOWN" : builder.referer;
        this.startTimestamp = builder.startTimestamp == 0 ? SystemClock.elapsedRealtime() : builder.startTimestamp;
        this.hintText = builder.hintText;
        this.page = builder.page;
        this.conversationId = builder.conversationId;
        this.shareInUri = builder.shareInUri;
        this.startingState = builder.startingState;
        this.personalizedContentEnabledResult = builder.personalizedContentEnabledResult;
        this.hintTextOperation = builder.hintTextOperation == null ? "Show" : builder.hintTextOperation;
        this.universalPrivacyCode = builder.universalPrivacyCode;
        this.enterAnimationType = builder.enterAnimationType;
        this.preamblesEnabled = builder.preamblesEnabled;
        this.navigateToTurnFeatureEnabledResult = builder.navigateToTurnFeatureEnabledResult;
        this.feedbackSoundsEnabledResult = builder.feedbackSoundsEnabledResult;
        this.conversationTopicsEnabledResult = builder.conversationTopicsEnabledResult;
        this.targetFragmentTimestamp = builder.targetFragmentTimestamp;
        this.suggestionTheme = builder.suggestionTheme == null ? SuggestionTheme.ADULT : builder.suggestionTheme;
        this.hideAttachButton = builder.hideAttachButton;
        this.hideOverflowMenu = builder.hideOverflowMenu;
        this.hideContextualMenu = builder.hideContextualMenu;
        this.enableSpeechResponseAlways = builder.enableSpeechResponseAlways;
        this.hideKeyboardOnSubmitEnabled = builder.setHideKeyboardOnSubmitEnabled;
        this.showRedesignedGreeting = builder.showRedesignedGreeting;
        this.alexaPlusPreviewTextEnabled = builder.alexaPlusPreviewTextEnabled;
        this.openShareSheetOnLaunch = builder.openShareSheetOnLaunch;
        this.isScreenshotAvailable = builder.isScreenshotAvailable;
        this.directScreenshotUploadToConversation = builder.directScreenshotUploadToConversation;
        this.raConversationLayoutStyle = builder.raConversationLayoutStyle;
        this.itemId = builder.itemId;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAlexaPlusPreviewTextEnabled() {
        return this.alexaPlusPreviewTextEnabled;
    }

    @Nullable
    public String getConversationId() {
        return this.conversationId;
    }

    public int getConversationTopicsEnabledResult() {
        return this.conversationTopicsEnabledResult;
    }

    public boolean getDirectScreenshotUploadToConversation() {
        return this.directScreenshotUploadToConversation != 0;
    }

    public boolean getEnableSpeechResponseAlways() {
        return this.enableSpeechResponseAlways != 0;
    }

    @Nullable
    public String getEnterAnimationType() {
        return this.enterAnimationType;
    }

    public int getFeedbackSoundsEnabledResult() {
        return this.feedbackSoundsEnabledResult;
    }

    public boolean getHideAttachButton() {
        return this.hideAttachButton != 0;
    }

    public boolean getHideContextualMenu() {
        return this.hideContextualMenu != 0;
    }

    public int getHideKeyboardOnSubmitEnabled() {
        return this.hideKeyboardOnSubmitEnabled;
    }

    public boolean getHideOverflowMenu() {
        return this.hideOverflowMenu != 0;
    }

    @Nullable
    public String getHintText() {
        return this.hintText;
    }

    @NonNull
    public String getHintTextOperation() {
        return this.hintTextOperation;
    }

    public boolean getIsScreenshotAvailable() {
        return this.isScreenshotAvailable != 0;
    }

    @Nullable
    public String getItemId() {
        return this.itemId;
    }

    public int getNavigateToTurnFeatureEnabledResult() {
        return this.navigateToTurnFeatureEnabledResult;
    }

    public boolean getOpenShareSheetOnLaunch() {
        return this.openShareSheetOnLaunch != 0;
    }

    @Nullable
    public String getPage() {
        return this.page;
    }

    public int getPersonalizedContentEnabledResult() {
        return this.personalizedContentEnabledResult;
    }

    public int getPreamblesEnabled() {
        return this.preamblesEnabled;
    }

    @Nullable
    public String getRaConversationLayoutStyle() {
        return this.raConversationLayoutStyle;
    }

    @NonNull
    public String getReferer() {
        return this.referer;
    }

    @Nullable
    public String getShareInUri() {
        return this.shareInUri;
    }

    public int getShowRedesignedGreeting() {
        return this.showRedesignedGreeting;
    }

    public long getStartTimestamp() {
        return this.startTimestamp;
    }

    @Nullable
    public String getStartingState() {
        return this.startingState;
    }

    @NonNull
    public SuggestionTheme getSuggestionTheme() {
        return this.suggestionTheme;
    }

    @Nullable
    public String getTargetFragmentTimestamp() {
        return this.targetFragmentTimestamp;
    }

    @Nullable
    public String getUniversalPrivacyCode() {
        return this.universalPrivacyCode;
    }

    public Builder toBuilder() {
        return new Builder().setReferer(getReferer()).setStartTimeStamp(getStartTimestamp()).setHintText(getHintText()).setPage(getPage()).setConversationId(getConversationId()).setShareInUri(getShareInUri()).setStartingState(getStartingState()).setPersonalizedContentEnabledResult(getPersonalizedContentEnabledResult()).setHintTextOperation(getHintTextOperation()).setUniversalPrivacyCode(getUniversalPrivacyCode()).setEnterAnimationType(getEnterAnimationType()).setPreamblesEnabled(getPreamblesEnabled()).setNavigateToTurnFeatureEnabledResult(getNavigateToTurnFeatureEnabledResult()).setFeedbackSoundsEnabledResult(getFeedbackSoundsEnabledResult()).setConversationTopicsEnabledResult(getConversationTopicsEnabledResult()).setTargetFragmentTimestamp(getTargetFragmentTimestamp()).setSuggestionTheme(getSuggestionTheme()).setHideAttachButton(getHideAttachButton()).setHideOverflowMenu(getHideOverflowMenu()).setHideContextualMenu(getHideContextualMenu()).setEnableSpeechResponseAlways(getEnableSpeechResponseAlways()).setHideKeyboardOnSubmitEnabled(getHideKeyboardOnSubmitEnabled()).setShowRedesignedGreeting(getShowRedesignedGreeting()).setAlexaPlusPreviewTextEnabled(getAlexaPlusPreviewTextEnabled()).setOpenShareSheetOnLaunch(getOpenShareSheetOnLaunch()).setIsScreenshotAvailable(getIsScreenshotAvailable()).setDirectScreenshotUploadToConversation(getDirectScreenshotUploadToConversation()).setRaConversationLayoutStyle(getRaConversationLayoutStyle()).setItemId(getItemId());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.referer);
        parcel.writeLong(this.startTimestamp);
        parcel.writeString(this.hintText);
        parcel.writeString(this.page);
        parcel.writeString(this.conversationId);
        parcel.writeString(this.shareInUri);
        parcel.writeString(this.startingState);
        parcel.writeInt(this.personalizedContentEnabledResult);
        parcel.writeString(this.hintTextOperation);
        parcel.writeString(this.universalPrivacyCode);
        parcel.writeString(this.enterAnimationType);
        parcel.writeInt(this.preamblesEnabled);
        parcel.writeInt(this.navigateToTurnFeatureEnabledResult);
        parcel.writeInt(this.feedbackSoundsEnabledResult);
        parcel.writeInt(this.conversationTopicsEnabledResult);
        parcel.writeString(this.targetFragmentTimestamp);
        parcel.writeString(this.suggestionTheme.name());
        parcel.writeInt(this.hideAttachButton);
        parcel.writeInt(this.hideOverflowMenu);
        parcel.writeInt(this.hideContextualMenu);
        parcel.writeInt(this.enableSpeechResponseAlways);
        parcel.writeInt(this.hideKeyboardOnSubmitEnabled);
        parcel.writeInt(this.showRedesignedGreeting);
        parcel.writeInt(this.alexaPlusPreviewTextEnabled);
        parcel.writeInt(this.openShareSheetOnLaunch);
        parcel.writeInt(this.isScreenshotAvailable);
        parcel.writeInt(this.directScreenshotUploadToConversation);
        parcel.writeString(this.raConversationLayoutStyle);
        parcel.writeString(this.itemId);
    }

    public /* synthetic */ RaUiOptions(Builder builder, int i) {
        this(builder);
    }

    public RaUiOptions(Parcel parcel) {
        this.referer = parcel.readString();
        this.startTimestamp = parcel.readLong();
        this.hintText = parcel.readString();
        this.page = parcel.readString();
        this.conversationId = parcel.readString();
        this.shareInUri = parcel.readString();
        this.startingState = parcel.readString();
        this.personalizedContentEnabledResult = parcel.readInt();
        this.hintTextOperation = parcel.readString();
        this.universalPrivacyCode = parcel.readString();
        this.enterAnimationType = parcel.readString();
        this.preamblesEnabled = parcel.readInt();
        this.navigateToTurnFeatureEnabledResult = parcel.readInt();
        this.feedbackSoundsEnabledResult = parcel.readInt();
        this.conversationTopicsEnabledResult = parcel.readInt();
        this.targetFragmentTimestamp = parcel.readString();
        this.suggestionTheme = SuggestionTheme.fromString(parcel.readString());
        this.hideAttachButton = parcel.readInt();
        this.hideOverflowMenu = parcel.readInt();
        this.hideContextualMenu = parcel.readInt();
        this.enableSpeechResponseAlways = parcel.readInt();
        this.hideKeyboardOnSubmitEnabled = parcel.readInt();
        this.showRedesignedGreeting = parcel.readInt();
        this.alexaPlusPreviewTextEnabled = parcel.readInt();
        this.openShareSheetOnLaunch = parcel.readInt();
        this.isScreenshotAvailable = parcel.readInt();
        this.directScreenshotUploadToConversation = parcel.readInt();
        this.raConversationLayoutStyle = parcel.readString();
        this.itemId = parcel.readString();
    }
}
