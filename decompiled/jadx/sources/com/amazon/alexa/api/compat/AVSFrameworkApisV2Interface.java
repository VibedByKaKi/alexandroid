package com.amazon.alexa.api.compat;

import android.content.Context;
import com.amazon.alexa.api.compat.model.AccountApiV2;
import com.amazon.alexa.api.compat.model.AlertsApiV2;
import com.amazon.alexa.api.compat.model.AttentionSystemApiV2;
import com.amazon.alexa.api.compat.model.AudioPlaybackControlApiV2;
import com.amazon.alexa.api.compat.model.AudioTaskSchedulerApiV2;
import com.amazon.alexa.api.compat.model.CamerasApiV2;
import com.amazon.alexa.api.compat.model.CapabilitiesApiV2;
import com.amazon.alexa.api.compat.model.CardsApiV2;
import com.amazon.alexa.api.compat.model.ContextProviderApiV2;
import com.amazon.alexa.api.compat.model.ConversationUiApiV2;
import com.amazon.alexa.api.compat.model.ConversationsApiV2;
import com.amazon.alexa.api.compat.model.DialogApiV2;
import com.amazon.alexa.api.compat.model.DriveModeApiV2;
import com.amazon.alexa.api.compat.model.EndpointsApi;
import com.amazon.alexa.api.compat.model.LocaleApiV2;
import com.amazon.alexa.api.compat.model.MetricsApiV2;
import com.amazon.alexa.api.compat.model.NaturalTurnControllersApiV2;
import com.amazon.alexa.api.compat.model.ReadinessApiV2;
import com.amazon.alexa.api.compat.model.SettingsApiV2;
import com.amazon.alexa.api.compat.model.TextApiV2;
import com.amazon.alexa.api.compat.model.UserSpeechProvidersApiV2;
import com.amazon.alexa.api.compat.model.VisualTaskApiV2;
import com.amazon.alexa.api.compat.model.VoiceActivityDetectionApiV2;
import com.amazon.alexa.api.compat.model.WakeWordApiV2;
import com.amazon.alexa.biloba.metrics.MetricsConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0018H&J\b\u0010\u0019\u001a\u00020\u001aH&J\b\u0010\u001b\u001a\u00020\u001cH&J\b\u0010\u001d\u001a\u00020\u001eH&J\b\u0010\u001f\u001a\u00020 H&J\b\u0010!\u001a\u00020\"H&J\b\u0010#\u001a\u00020$H&J\b\u0010%\u001a\u00020&H&J\b\u0010'\u001a\u00020(H&J\b\u0010)\u001a\u00020*H&J\b\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020.H&J\b\u0010/\u001a\u000200H&J\b\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u000204H&J\b\u00105\u001a\u000206H&J\b\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u00020:H\u0016¨\u0006;"}, d2 = {"Lcom/amazon/alexa/api/compat/AVSFrameworkApisV2Interface;", "", "start", "", "stop", "destroy", "isStarted", "", "wakeUp", "context", "Landroid/content/Context;", "getDialogApi", "Lcom/amazon/alexa/api/compat/model/DialogApiV2;", "getCardsApi", "Lcom/amazon/alexa/api/compat/model/CardsApiV2;", "getAttentionSystemApi", "Lcom/amazon/alexa/api/compat/model/AttentionSystemApiV2;", "getMetricsApi", "Lcom/amazon/alexa/api/compat/model/MetricsApiV2;", "getLocaleApi", "Lcom/amazon/alexa/api/compat/model/LocaleApiV2;", "getTextApi", "Lcom/amazon/alexa/api/compat/model/TextApiV2;", "getAudioPlaybackControlApi", "Lcom/amazon/alexa/api/compat/model/AudioPlaybackControlApiV2;", "getWakeWordApi", "Lcom/amazon/alexa/api/compat/model/WakeWordApiV2;", "getReadinessApi", "Lcom/amazon/alexa/api/compat/model/ReadinessApiV2;", "getContextProviderApi", "Lcom/amazon/alexa/api/compat/model/ContextProviderApiV2;", "getAudioTaskSchedulerApi", "Lcom/amazon/alexa/api/compat/model/AudioTaskSchedulerApiV2;", "getUserSpeechProvidersApi", "Lcom/amazon/alexa/api/compat/model/UserSpeechProvidersApiV2;", "getAlertsApi", "Lcom/amazon/alexa/api/compat/model/AlertsApiV2;", "getVisualTaskApi", "Lcom/amazon/alexa/api/compat/model/VisualTaskApiV2;", "getDriveModeApi", "Lcom/amazon/alexa/api/compat/model/DriveModeApiV2;", "getCamerasApi", "Lcom/amazon/alexa/api/compat/model/CamerasApiV2;", "getNaturalTurnControllersApi", "Lcom/amazon/alexa/api/compat/model/NaturalTurnControllersApiV2;", "getConversationsApi", "Lcom/amazon/alexa/api/compat/model/ConversationsApiV2;", "getCapabilitiesApi", "Lcom/amazon/alexa/api/compat/model/CapabilitiesApiV2;", "getEndpointsApi", "Lcom/amazon/alexa/api/compat/model/EndpointsApi;", "getAccountApi", "Lcom/amazon/alexa/api/compat/model/AccountApiV2;", "getConversationUiApi", "Lcom/amazon/alexa/api/compat/model/ConversationUiApiV2;", "getVoiceActivityDetectionApi", "Lcom/amazon/alexa/api/compat/model/VoiceActivityDetectionApiV2;", MetricsConstants.OperationalMetrics.GET_SETTINGS_API, "Lcom/amazon/alexa/api/compat/model/SettingsApiV2;", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface AVSFrameworkApisV2Interface {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static EndpointsApi getEndpointsApi(@NotNull AVSFrameworkApisV2Interface aVSFrameworkApisV2Interface) {
            throw new UnsupportedOperationException("EndpointsApi not available");
        }

        @NotNull
        public static NaturalTurnControllersApiV2 getNaturalTurnControllersApi(@NotNull AVSFrameworkApisV2Interface aVSFrameworkApisV2Interface) {
            throw new UnsupportedOperationException("NaturalTurnControllersApiV2 is not supported by this implementation");
        }

        @NotNull
        public static SettingsApiV2 getSettingsApi(@NotNull AVSFrameworkApisV2Interface aVSFrameworkApisV2Interface) {
            throw new UnsupportedOperationException("SettingsApiV2 is not supported by this implementation");
        }

        @NotNull
        public static VoiceActivityDetectionApiV2 getVoiceActivityDetectionApi(@NotNull AVSFrameworkApisV2Interface aVSFrameworkApisV2Interface) {
            throw new UnsupportedOperationException("VoiceActivityDetectionApiV2 is not supported by this implementation");
        }
    }

    void destroy();

    @NotNull
    AccountApiV2 getAccountApi();

    @NotNull
    AlertsApiV2 getAlertsApi();

    @NotNull
    AttentionSystemApiV2 getAttentionSystemApi();

    @NotNull
    AudioPlaybackControlApiV2 getAudioPlaybackControlApi();

    @NotNull
    AudioTaskSchedulerApiV2 getAudioTaskSchedulerApi();

    @NotNull
    CamerasApiV2 getCamerasApi();

    @NotNull
    CapabilitiesApiV2 getCapabilitiesApi();

    @NotNull
    CardsApiV2 getCardsApi();

    @NotNull
    ContextProviderApiV2 getContextProviderApi();

    @NotNull
    ConversationUiApiV2 getConversationUiApi();

    @NotNull
    ConversationsApiV2 getConversationsApi();

    @NotNull
    DialogApiV2 getDialogApi();

    @NotNull
    DriveModeApiV2 getDriveModeApi();

    @NotNull
    EndpointsApi getEndpointsApi();

    @NotNull
    LocaleApiV2 getLocaleApi();

    @NotNull
    MetricsApiV2 getMetricsApi();

    @NotNull
    NaturalTurnControllersApiV2 getNaturalTurnControllersApi();

    @NotNull
    ReadinessApiV2 getReadinessApi();

    @NotNull
    SettingsApiV2 getSettingsApi();

    @NotNull
    TextApiV2 getTextApi();

    @NotNull
    UserSpeechProvidersApiV2 getUserSpeechProvidersApi();

    @NotNull
    VisualTaskApiV2 getVisualTaskApi();

    @NotNull
    VoiceActivityDetectionApiV2 getVoiceActivityDetectionApi();

    @NotNull
    WakeWordApiV2 getWakeWordApi();

    boolean isStarted();

    void start();

    void stop();

    void wakeUp(@NotNull Context context);
}
