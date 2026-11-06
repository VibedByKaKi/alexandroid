package com.amazon.alexa.voice.model;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Nullable;
import com.amazon.alexa.protocols.messaging.MessagingReceiver;
import com.amazon.alexa.protocols.ui.TabBarAnimator;
import com.amazon.alexa.voice.navigation.NavigationAppInfo;
import com.amazon.alexa.voice.nowplaying.AudioPlayerListener;
import com.amazon.alexa.voice.nowplaying.NowPlayingCardManager;
import com.amazon.alexa.voice.ui.VoiceActivityLauncher;
import com.amazon.alexa.voice.ui.onedesign.scrim.ScrimParametersModel;
import com.amazon.alexa.voice.ui.player.PlaybackController;
import com.amazon.alexa.voice.ui.ra.RaUiOptions;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface VoiceService {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum InvocationType {
        APP_INGRESS("AlexaApp.AppIngress"),
        SEARCH_BAR("AlexaApp.SearchBarIngress"),
        CARD("AlexaApp.CardIngress"),
        DEVICE_ASSISTANT("AlexaApp.DeviceAssistant"),
        PUSH_BUTTON("AlexaApp.PushButton"),
        INTENT("AlexaApp.Intent"),
        SHORTCUT("AlexaApp.Shortcut"),
        QUICK_ACTIONS_WIDGET("AlexaApp.QuickActionsWidget"),
        VOICE_COMMAND_INTENT("AlexaApp.VoiceCommand"),
        BS_MICROPHONE_CLICK("AlexaApp.BsMicrophoneClick"),
        ANDROID_VOICE_SEARCH_INTENT("AlexaApp.HandsfreeSearch"),
        WAKE_WORD("AlexaApp.WakeWord"),
        ROUTE("AlexaApp.Route"),
        ROUTE_SKIP_FTUE("AlexaApp.RouteSkipFtue"),
        VOICE_ENROLLMENT("AlexaApp.VoiceEnrollment"),
        DRIVE_MODE_TAP("AlexaApp.DriveModeTap"),
        QUICK_SETTINGS_TILE("AlexaApp.AskAlexaQuickSettingsTile"),
        UNKNOWN("AlexaApp.Unknown");

        private String name;

        InvocationType(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum RecordPermission {
        REQUIRED("AlexaApp.Required"),
        NOT_REQUIRED("AlexaApp.NotRequired");

        private String name;

        RecordPermission(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }
    }

    void addAudioPlayerListener(AudioPlayerListener audioPlayerListener);

    void cancel();

    void clearScrimSubscription();

    @Nullable
    RaUiOptions consumePendingFtueUiOptions();

    void doNotBackground(boolean z);

    void enableHandsfreeSettings(boolean z);

    List<NavigationAppInfo> getAllNavigationApps();

    MessagingReceiver getMessagingReceiver();

    NowPlayingCardManager getNowPlayingCardManager();

    PlaybackController getPlaybackController();

    boolean hasMinimumPermission();

    void ingressClicked();

    boolean isAlexaActive();

    boolean isAssistantAllowed();

    boolean isHandsfreeEnabled();

    boolean isHandsfreeSupported();

    boolean isListeningOrProcessing();

    boolean isTypeToAlexaAllowed();

    boolean isVoiceAllowed();

    boolean isVoicePossible();

    void launchAlexaUIActivity(String str, String str2, String str3, boolean z);

    void onBackground();

    void onForeground(RecordPermission recordPermission);

    Observable<Boolean> onIdle();

    void onResumeMainActivity(Activity activity);

    void onStartMainActivity(Activity activity);

    void onStopMainActivity(Activity activity);

    void onUserLoggedOut();

    Single<Boolean> recognizeSpeech(InvocationType invocationType);

    Single<Boolean> recognizeSpeech(InvocationType invocationType, ScrimParametersModel scrimParametersModel, String str);

    Single<Boolean> recognizeSpeech(InvocationType invocationType, ScrimParametersModel scrimParametersModel, String str, RaUiOptions raUiOptions);

    Single<Boolean> recognizeSpeech(InvocationType invocationType, ScrimParametersModel scrimParametersModel, String str, RaUiOptions raUiOptions, boolean z, boolean z2);

    Single<Boolean> recognizeSpeech(InvocationType invocationType, ScrimParametersModel scrimParametersModel, String str, String str2);

    Single<Boolean> recognizeSpeech(InvocationType invocationType, ScrimParametersModel scrimParametersModel, String str, String str2, RaUiOptions raUiOptions);

    Single<Boolean> recognizeSpeech(InvocationType invocationType, RaUiOptions raUiOptions);

    void registerScrimListenerIfSpeaking();

    void release();

    void removeAudioPlayerListener(AudioPlayerListener audioPlayerListener);

    void setPreferredNavigationApp(String str);

    void setTabBarAnimator(TabBarAnimator tabBarAnimator);

    void setVoiceActivityLauncher(VoiceActivityLauncher voiceActivityLauncher);

    void startRAConversationsExperience(RaUiOptions raUiOptions, InvocationType invocationType);

    void startVoiceExperience(Context context, String str, String str2, Map<String, String> map, InvocationType invocationType, ScrimParametersModel scrimParametersModel);

    void startVoiceExperience(Context context, String str, String str2, Map<String, String> map, InvocationType invocationType, ScrimParametersModel scrimParametersModel, RaUiOptions raUiOptions);

    void stopListening();

    void storeProfileInformation();

    void updateLocale(Locale locale);
}
