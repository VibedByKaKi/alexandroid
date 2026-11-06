package com.amazon.alexa.accessory.speechapi;

import com.amazon.alexa.accessory.speechapi.camera.CameraProvider;
import com.amazon.alexa.accessory.speechapi.context.MessageContextProvider;
import com.amazon.alexa.accessory.speechapi.events.AccessoryEventSender;
import com.amazon.alexa.accessory.speechapi.events.AccessoryStateReportGenerator;
import com.amazon.alexa.accessory.speechapi.events.ApiCallbacks;
import com.amazon.alexa.accessory.speechapi.events.MessageEvent;
import com.amazon.alexa.accessory.speechapi.listeners.AlertsListener;
import com.amazon.alexa.accessory.speechapi.listeners.AudioPlaybackStatusListener;
import com.amazon.alexa.accessory.speechapi.listeners.CaptionListener;
import com.amazon.alexa.accessory.speechapi.listeners.CardListener;
import com.amazon.alexa.accessory.speechapi.listeners.ConnectionListener;
import com.amazon.alexa.accessory.speechapi.listeners.ReadinessListener;
import com.amazon.alexa.accessory.speechapi.listeners.SettingsListener;
import com.amazon.alexa.accessory.speechapi.listeners.StateListener;
import com.amazon.alexa.accessory.speechapi.naturalturndetection.NaturalTurnDetectionController;
import com.amazon.alexa.accessory.speechapi.speech.AccessorySink;
import com.amazon.alexa.accessory.speechapi.speech.DialogRequest;
import com.amazon.alexa.accessory.speechapi.speech.UserSpeechProvider;
import com.amazon.alexa.accessory.speechapi.speech.UserSpeechProviderMetadata;
import com.amazon.alexa.accessory.utils.feature.FeatureChecker;
import com.amazon.alexa.assistant.transport.MissingTokenPull;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0012H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0017H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0019H&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u001bH&J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001eH&J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!H&J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020#H&J\u0010\u0010$\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020%H&J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020'H&J\b\u0010(\u001a\u00020\u0003H&J\n\u0010)\u001a\u0004\u0018\u00010*H&J\b\u0010+\u001a\u00020,H&J\b\u0010-\u001a\u00020,H&J\u0010\u0010.\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010/\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0012H&J\u0010\u00100\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u00101\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0017H&J\u0010\u00102\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0019H&J\u0010\u00103\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u001bH&J\u0010\u00104\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001eH&J\u0010\u00105\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!H&J\u0010\u00106\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020#H&J\u0010\u00107\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020%H&J\u0010\u00108\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020'H&J\u0018\u00109\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010:\u001a\u00020;H&J\u0018\u0010<\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010=\u001a\u00020>H&J\u0010\u0010?\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!H&J\u0018\u0010@\u001a\u00020\u00032\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH&J\u0010\u0010E\u001a\u00020\u00032\u0006\u0010F\u001a\u00020,H&J\u0012\u0010G\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010HH&J \u0010I\u001a\u00020\u00032\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020OH&¨\u0006P"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/AlexaConnection;", "", "bindAmbientSoundDispatcher", "", "ambientSoundDispatcher", "Lcom/amazon/alexa/accessory/speechapi/AmbientSoundDispatcher;", "cancelUserInteraction", MissingTokenPull.TRIGGER_CONNECT, "createAccessoryAudioSink", "Lcom/amazon/alexa/accessory/speechapi/speech/AccessorySink;", "createAccessoryDataSink", "deRegisterUserSpeechProvider", "userSpeechProvider", "Lcom/amazon/alexa/accessory/speechapi/speech/UserSpeechProvider;", "deregisterAlertsListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/amazon/alexa/accessory/speechapi/listeners/AlertsListener;", "deregisterAudioPlaybackStatusListener", "Lcom/amazon/alexa/accessory/speechapi/listeners/AudioPlaybackStatusListener;", "deregisterCameraProvider", "cameraProvider", "Lcom/amazon/alexa/accessory/speechapi/camera/CameraProvider;", "deregisterCaptionListener", "Lcom/amazon/alexa/accessory/speechapi/listeners/CaptionListener;", "deregisterCardListener", "Lcom/amazon/alexa/accessory/speechapi/listeners/CardListener;", "deregisterConnectionListener", "Lcom/amazon/alexa/accessory/speechapi/listeners/ConnectionListener;", "deregisterMessageContextProvider", "messageContextProvider", "Lcom/amazon/alexa/accessory/speechapi/context/MessageContextProvider;", "deregisterNaturalTurnDetectionController", "controller", "Lcom/amazon/alexa/accessory/speechapi/naturalturndetection/NaturalTurnDetectionController;", "deregisterReadinessListener", "Lcom/amazon/alexa/accessory/speechapi/listeners/ReadinessListener;", "deregisterSettingsListener", "Lcom/amazon/alexa/accessory/speechapi/listeners/SettingsListener;", "deregisterStateListener", "Lcom/amazon/alexa/accessory/speechapi/listeners/StateListener;", "disconnect", "getLocale", "Ljava/util/Locale;", "isConnected", "", "isConnecting", "registerAlertsListener", "registerAudioPlaybackStatusListener", "registerCamera", "registerCaptionListener", "registerCardListener", "registerConnectionListener", "registerMessageContextProvider", "registerNaturalTurnDetectionController", "registerReadinessListener", "registerSettingsListener", "registerStateListener", "registerUserSpeechProvider", "metadata", "Lcom/amazon/alexa/accessory/speechapi/speech/UserSpeechProviderMetadata;", "requestDialog", "dialogRequest", "Lcom/amazon/alexa/accessory/speechapi/speech/DialogRequest;", "requestNaturalTurnSession", "sendEvent", "event", "Lcom/amazon/alexa/accessory/speechapi/events/MessageEvent;", "apiCallbacks", "Lcom/amazon/alexa/accessory/speechapi/events/ApiCallbacks;", "setAllowsBackgroundActivityStarts", "allowsBackgroundActivityStarts", "setOnDialogRequestedListener", "Ljava/lang/Runnable;", "setReportAccessoryStateDependencies", "reportGenerator", "Lcom/amazon/alexa/accessory/speechapi/events/AccessoryStateReportGenerator;", "accessoryEventSender", "Lcom/amazon/alexa/accessory/speechapi/events/AccessoryEventSender;", "featureChecker", "Lcom/amazon/alexa/accessory/utils/feature/FeatureChecker;", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface AlexaConnection {
    void bindAmbientSoundDispatcher(@NotNull AmbientSoundDispatcher ambientSoundDispatcher);

    void cancelUserInteraction();

    void connect();

    @NotNull
    AccessorySink createAccessoryAudioSink() throws Exception;

    @NotNull
    AccessorySink createAccessoryDataSink() throws Exception;

    void deRegisterUserSpeechProvider(@NotNull UserSpeechProvider userSpeechProvider);

    void deregisterAlertsListener(@NotNull AlertsListener listener);

    void deregisterAudioPlaybackStatusListener(@NotNull AudioPlaybackStatusListener listener);

    void deregisterCameraProvider(@NotNull CameraProvider cameraProvider);

    void deregisterCaptionListener(@NotNull CaptionListener listener);

    void deregisterCardListener(@NotNull CardListener listener);

    void deregisterConnectionListener(@NotNull ConnectionListener listener);

    void deregisterMessageContextProvider(@NotNull MessageContextProvider messageContextProvider);

    void deregisterNaturalTurnDetectionController(@NotNull NaturalTurnDetectionController controller);

    void deregisterReadinessListener(@NotNull ReadinessListener listener);

    void deregisterSettingsListener(@NotNull SettingsListener listener);

    void deregisterStateListener(@NotNull StateListener listener);

    void disconnect();

    @Nullable
    Locale getLocale();

    boolean isConnected();

    boolean isConnecting();

    void registerAlertsListener(@NotNull AlertsListener listener);

    void registerAudioPlaybackStatusListener(@NotNull AudioPlaybackStatusListener listener);

    void registerCamera(@NotNull CameraProvider cameraProvider);

    void registerCaptionListener(@NotNull CaptionListener listener);

    void registerCardListener(@NotNull CardListener listener);

    void registerConnectionListener(@NotNull ConnectionListener listener);

    void registerMessageContextProvider(@NotNull MessageContextProvider messageContextProvider);

    void registerNaturalTurnDetectionController(@NotNull NaturalTurnDetectionController controller);

    void registerReadinessListener(@NotNull ReadinessListener listener);

    void registerSettingsListener(@NotNull SettingsListener listener);

    void registerStateListener(@NotNull StateListener listener);

    void registerUserSpeechProvider(@NotNull UserSpeechProvider userSpeechProvider, @NotNull UserSpeechProviderMetadata metadata);

    void requestDialog(@NotNull UserSpeechProvider userSpeechProvider, @NotNull DialogRequest dialogRequest);

    void requestNaturalTurnSession(@NotNull NaturalTurnDetectionController controller);

    void sendEvent(@NotNull MessageEvent event, @NotNull ApiCallbacks apiCallbacks);

    void setAllowsBackgroundActivityStarts(boolean allowsBackgroundActivityStarts);

    void setOnDialogRequestedListener(@Nullable Runnable listener);

    void setReportAccessoryStateDependencies(@NotNull AccessoryStateReportGenerator reportGenerator, @NotNull AccessoryEventSender accessoryEventSender, @NotNull FeatureChecker featureChecker);
}
