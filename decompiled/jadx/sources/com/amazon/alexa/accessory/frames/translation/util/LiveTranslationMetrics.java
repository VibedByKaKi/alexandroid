package com.amazon.alexa.accessory.frames.translation.util;

import com.amazon.alexa.accessory.frames.metrics.MetricsConstants;
import com.amazon.alexa.accessory.frames.metrics.MetricsRecorder;
import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.amazon.alexa.accessory.frames.translation.model.TranslationMessage;
import com.amazon.alexa.accessory.frames.utils.Log;
import com.amazon.identity.auth.device.api.MAPActorManager;
import com.dee.app.contacts.common.constants.Constants;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b<\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0080\u0001\u0081\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DJ\u000e\u0010E\u001a\u00020B2\u0006\u0010C\u001a\u00020DJ\u000e\u0010F\u001a\u00020B2\u0006\u0010C\u001a\u00020DJ\u000e\u0010G\u001a\u00020B2\u0006\u0010C\u001a\u00020DJ\u000e\u0010H\u001a\u00020B2\u0006\u0010C\u001a\u00020DJ\u000e\u0010I\u001a\u00020B2\u0006\u0010J\u001a\u00020KJ\u0006\u0010L\u001a\u00020BJ\u0006\u0010M\u001a\u00020BJ\u0006\u0010N\u001a\u00020BJ\u0006\u0010O\u001a\u00020BJ\u000e\u0010P\u001a\u00020B2\u0006\u0010Q\u001a\u00020RJ\u0006\u0010S\u001a\u00020BJ\u0006\u0010T\u001a\u00020BJ\u000e\u0010U\u001a\u00020B2\u0006\u0010V\u001a\u00020WJ\u0006\u0010X\u001a\u00020BJ\u0006\u0010Y\u001a\u00020BJ\u0006\u0010Z\u001a\u00020BJ\u0006\u0010[\u001a\u00020BJ\u000e\u0010\\\u001a\u00020B2\u0006\u0010]\u001a\u00020^J\u000e\u0010_\u001a\u00020B2\u0006\u0010C\u001a\u00020DJ\u0016\u0010_\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010`\u001a\u00020aJ\u0006\u0010b\u001a\u00020BJ\u000e\u0010c\u001a\u00020B2\u0006\u0010d\u001a\u00020eJ\u0010\u0010f\u001a\u00020B2\b\b\u0002\u0010g\u001a\u00020hJ\u0010\u0010i\u001a\u00020B2\b\b\u0002\u0010g\u001a\u00020hJ\u0010\u0010j\u001a\u00020B2\b\b\u0002\u0010g\u001a\u00020hJ\u0006\u0010k\u001a\u00020BJ\u0006\u0010l\u001a\u00020BJ\u0006\u0010m\u001a\u00020BJ\u0006\u0010n\u001a\u00020BJ\u0010\u0010o\u001a\u00020B2\b\b\u0002\u0010p\u001a\u00020eJ\u0006\u0010q\u001a\u00020BJ\u000e\u0010r\u001a\u00020B2\u0006\u0010]\u001a\u00020^J\u000e\u0010s\u001a\u00020B2\u0006\u0010]\u001a\u00020^J\u000e\u0010t\u001a\u00020B2\u0006\u0010]\u001a\u00020^J\u000e\u0010u\u001a\u00020B2\u0006\u0010]\u001a\u00020^J\u000e\u0010v\u001a\u00020B2\u0006\u0010]\u001a\u00020^J\u000e\u0010w\u001a\u00020B2\u0006\u0010]\u001a\u00020^J$\u0010x\u001a\u00020B2\u0006\u0010y\u001a\u00020\u00052\b\b\u0002\u0010z\u001a\u00020\u00052\b\b\u0002\u0010g\u001a\u00020hH\u0002J\u0018\u0010{\u001a\u00020B2\u0006\u0010y\u001a\u00020\u00052\u0006\u0010]\u001a\u00020^H\u0002J\u0010\u0010|\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0002J\u0010\u0010}\u001a\u00020\u00052\u0006\u0010C\u001a\u00020DH\u0002J\u0010\u0010~\u001a\u00020\u00052\u0006\u0010C\u001a\u00020DH\u0002J\u0010\u0010\u007f\u001a\u00020\u00052\u0006\u0010C\u001a\u00020DH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0082\u0001"}, d2 = {"Lcom/amazon/alexa/accessory/frames/translation/util/LiveTranslationMetrics;", "", "<init>", "()V", Constants.LOG_TAG, "", "LIVE_TRANSLATION_SESSION_START_REQUESTED_APP", "LIVE_TRANSLATION_SESSION_START_REQUESTED_VOICE", "LIVE_TRANSLATION_SESSION_START_REQUESTED_GESTURE", "LIVE_TRANSLATION_SESSION_STARTED_APP", "LIVE_TRANSLATION_SESSION_STARTED_VOICE", "LIVE_TRANSLATION_SESSION_STARTED_GESTURE", "LIVE_TRANSLATION_SESSION_START_FAILED_APP", "LIVE_TRANSLATION_SESSION_START_FAILED_VOICE", "LIVE_TRANSLATION_SESSION_START_FAILED_GESTURE", "LIVE_TRANSLATION_SESSION_START_ERROR_LANGUAGE_NOT_CONFIGURED", "LIVE_TRANSLATION_SESSION_START_FAILED_SESSION_ALREADY_ACTIVE", "LIVE_TRANSLATION_SESSION_START_FAILED_UNSUPPORTED_DEVICE_SOFTWARE", "LIVE_TRANSLATION_SESSION_STOPPED", "LIVE_TRANSLATION_SESSION_STOPPED_USER_LOCAL_STOP", "LIVE_TRANSLATION_SESSION_STOPPED_CLOUD_STOP", "LIVE_TRANSLATION_SESSION_STOPPED_DEVICE_DISCONNECTED", "LIVE_TRANSLATION_SESSION_STOPPED_UNKNOWN", "LIVE_TRANSLATION_SESSION_PAUSE_REQUESTED", "LIVE_TRANSLATION_SESSION_PAUSED", "LIVE_TRANSLATION_SESSION_RESUME_REQUESTED", "LIVE_TRANSLATION_SESSION_RESUMED", "LIVE_TRANSLATION_MESSAGE_COMMITTED", "LIVE_TRANSLATION_MESSAGE_COMMITTED_USER", "LIVE_TRANSLATION_MESSAGE_COMMITTED_BYSTANDER", "LIVE_TRANSLATION_AUDIO_REPLAY_REQUESTED", "LIVE_TRANSLATION_AUDIO_REPLAY_PAUSED", "LIVE_TRANSLATION_AUDIO_REPLAY_FAILED", "LIVE_TRANSLATION_INGRESS_ROUTED", "LIVE_TRANSLATION_INGRESS_OPENED_FOREGROUND", "LIVE_TRANSLATION_INGRESS_ROUTED_BACKGROUND", "LIVE_TRANSLATION_SETUP_PROMPT_PLAYED", "LIVE_TRANSLATION_SETUP_PROMPT_PLAY_FAILED", "LIVE_TRANSLATION_SESSION_DURATION", "LIVE_TRANSLATION_START_FAILED_CONTROL_PLANE_UNAVAILABLE", "LIVE_TRANSLATION_START_FAILED_ACCESSORY_REJECTED", "LIVE_TRANSLATION_START_FAILED_CLOUD_CONNECTION", "LIVE_TRANSLATION_START_FAILED_CLOUD_TIMEOUT", "LIVE_TRANSLATION_START_FAILED_VOICE_STREAM", "LIVE_TRANSLATION_STOP_FAILED", "LIVE_TRANSLATION_WEBSOCKET_FAILURE", "LIVE_TRANSLATION_WEBSOCKET_ERROR_RETRYABLE", "LIVE_TRANSLATION_WEBSOCKET_ERROR_FATAL", "LIVE_TRANSLATION_AUDIO_FRAME_DROPPED", "LIVE_TRANSLATION_AUDIO_FRAME_SENT", "LIVE_TRANSLATION_AUDIO_FRAME_RECEIVED", "LIVE_TRANSLATION_PENDING_QUEUE_EVICTED", "LIVE_TRANSLATION_TRANSLATION_WITHOUT_PENDING", "LIVE_TRANSLATION_AUDIO_COMMIT_DROPPED", "LIVE_TRANSLATION_AUDIO_ENDED_WITHOUT_AUDIO", "LIVE_TRANSLATION_AUDIO_ENDED_WITHOUT_PENDING", "LIVE_TRANSLATION_AUDIO_PLAYBACK_FAILED", "LIVE_TRANSLATION_AUDIO_PLAYBACK_DECODE_FAILED", "LIVE_TRANSLATION_INVALID_STATE_TRANSITION", "LIVE_TRANSLATION_START_TO_ACCESSORY_ACK", "LIVE_TRANSLATION_ACCESSORY_ACK_TO_CLOUD_SESSION_STARTED", "LIVE_TRANSLATION_CLOUD_SESSION_STARTED_TO_VOICE_STREAM_STARTED", "LIVE_TRANSLATION_SESSION_START_TO_VOICE_STREAM_STARTED", "LIVE_TRANSLATION_VOICE_STREAM_STARTED_TO_FIRST_MESSAGE_COMMITTED", "LIVE_TRANSLATION_AUDIO_REPLAY_DURATION", "recordSessionStartRequested", "", LiveTranslationCapabilityConstants.KEY_INITIATOR_TYPE, "Lcom/amazon/alexa/accessory/frames/translation/capability/LiveTranslationCapabilityConstants$InitiatorType;", "recordSessionStarted", "recordSessionStartBlockedLanguageNotConfigured", "recordSessionStartBlockedSessionAlreadyActive", "recordSessionStartBlockedUnsupportedDeviceSoftware", "recordSessionStopped", "reasonType", "Lcom/amazon/alexa/accessory/frames/translation/capability/LiveTranslationCapabilityConstants$StopReasonType;", "recordSessionPauseRequested", "recordSessionPaused", "recordSessionResumeRequested", "recordSessionResumed", "recordMessageCommitted", "source", "Lcom/amazon/alexa/accessory/frames/translation/model/TranslationMessage$Source;", "recordAudioReplayRequested", "recordAudioReplayPaused", "recordAudioReplayFailed", "reason", "Lcom/amazon/alexa/accessory/frames/translation/util/LiveTranslationMetrics$ReplayFailureReason;", "recordIngressOpenedForeground", "recordIngressRoutedBackground", "recordSetupPromptPlayed", "recordSetupPromptPlayFailed", "recordSessionDuration", "durationMillis", "", "recordSessionStartFailed", "stage", "Lcom/amazon/alexa/accessory/frames/translation/util/LiveTranslationMetrics$StartFailureStage;", "recordStopFailed", "recordWebSocketFailure", MAPActorManager.KEY_RETRYABLE, "", "recordAudioFrameDropped", "count", "", "recordAudioFrameSent", "recordAudioFrameReceived", "recordPendingQueueEvicted", "recordTranslationWithoutPending", "recordAudioCommitDroppedWithoutAudio", "recordAudioCommitDroppedWithoutPending", "recordAudioPlaybackFailed", "isDecodeFailure", "recordInvalidStateTransition", "recordStartToAccessoryAck", "recordAccessoryAckToCloudSessionStarted", "recordCloudSessionStartedToVoiceStreamStarted", "recordSessionStartToVoiceStreamStarted", "recordVoiceStreamStartedToFirstMessageCommitted", "recordAudioReplayDuration", "recordCounter", "name", "subComponent", "recordDuration", "recordGenericSessionStartFailed", "startRequestedMetricForInitiator", "startedMetricForInitiator", "startFailedMetricForInitiator", "StartFailureStage", "ReplayFailureReason", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LiveTranslationMetrics {

    @NotNull
    public static final LiveTranslationMetrics INSTANCE = new LiveTranslationMetrics();

    @NotNull
    private static final String LIVE_TRANSLATION_ACCESSORY_ACK_TO_CLOUD_SESSION_STARTED = "live_translation_accessory_ack_to_cloud_session_started";

    @NotNull
    private static final String LIVE_TRANSLATION_AUDIO_COMMIT_DROPPED = "live_translation_audio_commit_dropped";

    @NotNull
    private static final String LIVE_TRANSLATION_AUDIO_ENDED_WITHOUT_AUDIO = "live_translation_audio_ended_without_audio";

    @NotNull
    private static final String LIVE_TRANSLATION_AUDIO_ENDED_WITHOUT_PENDING = "live_translation_audio_ended_without_pending";

    @NotNull
    private static final String LIVE_TRANSLATION_AUDIO_FRAME_DROPPED = "live_translation_audio_frame_dropped";

    @NotNull
    private static final String LIVE_TRANSLATION_AUDIO_FRAME_RECEIVED = "live_translation_audio_frame_received";

    @NotNull
    private static final String LIVE_TRANSLATION_AUDIO_FRAME_SENT = "live_translation_audio_frame_sent";

    @NotNull
    private static final String LIVE_TRANSLATION_AUDIO_PLAYBACK_DECODE_FAILED = "live_translation_audio_playback_decode_failed";

    @NotNull
    private static final String LIVE_TRANSLATION_AUDIO_PLAYBACK_FAILED = "live_translation_audio_playback_failed";

    @NotNull
    private static final String LIVE_TRANSLATION_AUDIO_REPLAY_DURATION = "live_translation_audio_replay_duration";

    @NotNull
    private static final String LIVE_TRANSLATION_AUDIO_REPLAY_FAILED = "live_translation_audio_replay_failed";

    @NotNull
    private static final String LIVE_TRANSLATION_AUDIO_REPLAY_PAUSED = "live_translation_audio_replay_paused";

    @NotNull
    private static final String LIVE_TRANSLATION_AUDIO_REPLAY_REQUESTED = "live_translation_audio_replay_requested";

    @NotNull
    private static final String LIVE_TRANSLATION_CLOUD_SESSION_STARTED_TO_VOICE_STREAM_STARTED = "live_translation_cloud_session_started_to_voice_stream_started";

    @NotNull
    private static final String LIVE_TRANSLATION_INGRESS_OPENED_FOREGROUND = "live_translation_ingress_opened_foreground";

    @NotNull
    private static final String LIVE_TRANSLATION_INGRESS_ROUTED = "live_translation_ingress_routed";

    @NotNull
    private static final String LIVE_TRANSLATION_INGRESS_ROUTED_BACKGROUND = "live_translation_ingress_routed_background";

    @NotNull
    private static final String LIVE_TRANSLATION_INVALID_STATE_TRANSITION = "live_translation_invalid_state_transition";

    @NotNull
    private static final String LIVE_TRANSLATION_MESSAGE_COMMITTED = "live_translation_message_committed";

    @NotNull
    private static final String LIVE_TRANSLATION_MESSAGE_COMMITTED_BYSTANDER = "live_translation_message_committed_bystander";

    @NotNull
    private static final String LIVE_TRANSLATION_MESSAGE_COMMITTED_USER = "live_translation_message_committed_user";

    @NotNull
    private static final String LIVE_TRANSLATION_PENDING_QUEUE_EVICTED = "live_translation_pending_queue_evicted";

    @NotNull
    private static final String LIVE_TRANSLATION_SESSION_DURATION = "live_translation_session_duration";

    @NotNull
    private static final String LIVE_TRANSLATION_SESSION_PAUSED = "live_translation_session_paused";

    @NotNull
    private static final String LIVE_TRANSLATION_SESSION_PAUSE_REQUESTED = "live_translation_session_pause_requested";

    @NotNull
    private static final String LIVE_TRANSLATION_SESSION_RESUMED = "live_translation_session_resumed";

    @NotNull
    private static final String LIVE_TRANSLATION_SESSION_RESUME_REQUESTED = "live_translation_session_resume_requested";

    @NotNull
    private static final String LIVE_TRANSLATION_SESSION_STARTED_APP = "live_translation_session_started_app";

    @NotNull
    private static final String LIVE_TRANSLATION_SESSION_STARTED_GESTURE = "live_translation_session_started_gesture";

    @NotNull
    private static final String LIVE_TRANSLATION_SESSION_STARTED_VOICE = "live_translation_session_started_voice";

    @NotNull
    private static final String LIVE_TRANSLATION_SESSION_START_ERROR_LANGUAGE_NOT_CONFIGURED = "live_translation_session_start_error_language_not_configured";

    @NotNull
    private static final String LIVE_TRANSLATION_SESSION_START_FAILED_APP = "live_translation_session_start_failed_app";

    @NotNull
    private static final String LIVE_TRANSLATION_SESSION_START_FAILED_GESTURE = "live_translation_session_start_failed_gesture";

    @NotNull
    private static final String LIVE_TRANSLATION_SESSION_START_FAILED_SESSION_ALREADY_ACTIVE = "live_translation_session_start_failed_session_already_active";

    @NotNull
    private static final String LIVE_TRANSLATION_SESSION_START_FAILED_UNSUPPORTED_DEVICE_SOFTWARE = "live_translation_session_start_failed_unsupported_device_software";

    @NotNull
    private static final String LIVE_TRANSLATION_SESSION_START_FAILED_VOICE = "live_translation_session_start_failed_voice";

    @NotNull
    private static final String LIVE_TRANSLATION_SESSION_START_REQUESTED_APP = "live_translation_session_start_requested_app";

    @NotNull
    private static final String LIVE_TRANSLATION_SESSION_START_REQUESTED_GESTURE = "live_translation_session_start_requested_gesture";

    @NotNull
    private static final String LIVE_TRANSLATION_SESSION_START_REQUESTED_VOICE = "live_translation_session_start_requested_voice";

    @NotNull
    private static final String LIVE_TRANSLATION_SESSION_START_TO_VOICE_STREAM_STARTED = "live_translation_session_start_to_voice_stream_started";

    @NotNull
    private static final String LIVE_TRANSLATION_SESSION_STOPPED = "live_translation_session_stopped";

    @NotNull
    private static final String LIVE_TRANSLATION_SESSION_STOPPED_CLOUD_STOP = "live_translation_session_stopped_cloud_stop";

    @NotNull
    private static final String LIVE_TRANSLATION_SESSION_STOPPED_DEVICE_DISCONNECTED = "live_translation_session_stopped_device_disconnected";

    @NotNull
    private static final String LIVE_TRANSLATION_SESSION_STOPPED_UNKNOWN = "live_translation_session_stopped_unknown";

    @NotNull
    private static final String LIVE_TRANSLATION_SESSION_STOPPED_USER_LOCAL_STOP = "live_translation_session_stopped_user_local_stop";

    @NotNull
    private static final String LIVE_TRANSLATION_SETUP_PROMPT_PLAYED = "live_translation_setup_prompt_played";

    @NotNull
    private static final String LIVE_TRANSLATION_SETUP_PROMPT_PLAY_FAILED = "live_translation_setup_prompt_play_failed";

    @NotNull
    private static final String LIVE_TRANSLATION_START_FAILED_ACCESSORY_REJECTED = "live_translation_start_failed_accessory_rejected";

    @NotNull
    private static final String LIVE_TRANSLATION_START_FAILED_CLOUD_CONNECTION = "live_translation_start_failed_cloud_connection";

    @NotNull
    private static final String LIVE_TRANSLATION_START_FAILED_CLOUD_TIMEOUT = "live_translation_start_failed_cloud_timeout";

    @NotNull
    private static final String LIVE_TRANSLATION_START_FAILED_CONTROL_PLANE_UNAVAILABLE = "live_translation_start_failed_control_plane_unavailable";

    @NotNull
    private static final String LIVE_TRANSLATION_START_FAILED_VOICE_STREAM = "live_translation_start_failed_voice_stream";

    @NotNull
    private static final String LIVE_TRANSLATION_START_TO_ACCESSORY_ACK = "live_translation_start_to_accessory_ack";

    @NotNull
    private static final String LIVE_TRANSLATION_STOP_FAILED = "live_translation_stop_failed";

    @NotNull
    private static final String LIVE_TRANSLATION_TRANSLATION_WITHOUT_PENDING = "live_translation_translation_without_pending";

    @NotNull
    private static final String LIVE_TRANSLATION_VOICE_STREAM_STARTED_TO_FIRST_MESSAGE_COMMITTED = "live_translation_voice_stream_started_to_first_message_committed";

    @NotNull
    private static final String LIVE_TRANSLATION_WEBSOCKET_ERROR_FATAL = "live_translation_websocket_error_fatal";

    @NotNull
    private static final String LIVE_TRANSLATION_WEBSOCKET_ERROR_RETRYABLE = "live_translation_websocket_error_retryable";

    @NotNull
    private static final String LIVE_TRANSLATION_WEBSOCKET_FAILURE = "live_translation_websocket_failure";

    @NotNull
    private static final String TAG = "LiveTranslationMetrics";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/accessory/frames/translation/util/LiveTranslationMetrics$ReplayFailureReason;", "", "subComponent", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getSubComponent", "()Ljava/lang/String;", "FILE_MISSING", "DECODE_ERROR", "AUDIO_SESSION_ERROR", "VOICE_STREAM_RESTART_FAILED", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ReplayFailureReason {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ReplayFailureReason[] $VALUES;

        @NotNull
        private final String subComponent;
        public static final ReplayFailureReason FILE_MISSING = new ReplayFailureReason("FILE_MISSING", 0, "file_missing");
        public static final ReplayFailureReason DECODE_ERROR = new ReplayFailureReason("DECODE_ERROR", 1, "decode_error");
        public static final ReplayFailureReason AUDIO_SESSION_ERROR = new ReplayFailureReason("AUDIO_SESSION_ERROR", 2, "audio_session_error");
        public static final ReplayFailureReason VOICE_STREAM_RESTART_FAILED = new ReplayFailureReason("VOICE_STREAM_RESTART_FAILED", 3, "voice_stream_restart_failed");

        private static final /* synthetic */ ReplayFailureReason[] $values() {
            return new ReplayFailureReason[]{FILE_MISSING, DECODE_ERROR, AUDIO_SESSION_ERROR, VOICE_STREAM_RESTART_FAILED};
        }

        static {
            ReplayFailureReason[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private ReplayFailureReason(String str, int i, String str2) {
            this.subComponent = str2;
        }

        @NotNull
        public static EnumEntries<ReplayFailureReason> getEntries() {
            return $ENTRIES;
        }

        public static ReplayFailureReason valueOf(String str) {
            return (ReplayFailureReason) Enum.valueOf(ReplayFailureReason.class, str);
        }

        public static ReplayFailureReason[] values() {
            return (ReplayFailureReason[]) $VALUES.clone();
        }

        @NotNull
        public final String getSubComponent() {
            return this.subComponent;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/accessory/frames/translation/util/LiveTranslationMetrics$StartFailureStage;", "", "<init>", "(Ljava/lang/String;I)V", "CONTROL_PLANE_UNAVAILABLE", "ACCESSORY_REJECTED", "CLOUD_CONNECTION", "CLOUD_TIMEOUT", "VOICE_STREAM", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StartFailureStage {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StartFailureStage[] $VALUES;
        public static final StartFailureStage CONTROL_PLANE_UNAVAILABLE = new StartFailureStage("CONTROL_PLANE_UNAVAILABLE", 0);
        public static final StartFailureStage ACCESSORY_REJECTED = new StartFailureStage("ACCESSORY_REJECTED", 1);
        public static final StartFailureStage CLOUD_CONNECTION = new StartFailureStage("CLOUD_CONNECTION", 2);
        public static final StartFailureStage CLOUD_TIMEOUT = new StartFailureStage("CLOUD_TIMEOUT", 3);
        public static final StartFailureStage VOICE_STREAM = new StartFailureStage("VOICE_STREAM", 4);

        private static final /* synthetic */ StartFailureStage[] $values() {
            return new StartFailureStage[]{CONTROL_PLANE_UNAVAILABLE, ACCESSORY_REJECTED, CLOUD_CONNECTION, CLOUD_TIMEOUT, VOICE_STREAM};
        }

        static {
            StartFailureStage[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private StartFailureStage(String str, int i) {
        }

        @NotNull
        public static EnumEntries<StartFailureStage> getEntries() {
            return $ENTRIES;
        }

        public static StartFailureStage valueOf(String str) {
            return (StartFailureStage) Enum.valueOf(StartFailureStage.class, str);
        }

        public static StartFailureStage[] values() {
            return (StartFailureStage[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[LiveTranslationCapabilityConstants.StopReasonType.values().length];
            try {
                iArr[LiveTranslationCapabilityConstants.StopReasonType.USER_LOCAL_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LiveTranslationCapabilityConstants.StopReasonType.CLOUD_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LiveTranslationCapabilityConstants.StopReasonType.DEVICE_DISCONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TranslationMessage.Source.values().length];
            try {
                iArr2[TranslationMessage.Source.USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TranslationMessage.Source.BYSTANDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[StartFailureStage.values().length];
            try {
                iArr3[StartFailureStage.CONTROL_PLANE_UNAVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[StartFailureStage.ACCESSORY_REJECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[StartFailureStage.CLOUD_CONNECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[StartFailureStage.CLOUD_TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[StartFailureStage.VOICE_STREAM.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[LiveTranslationCapabilityConstants.InitiatorType.values().length];
            try {
                iArr4[LiveTranslationCapabilityConstants.InitiatorType.APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[LiveTranslationCapabilityConstants.InitiatorType.VOICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[LiveTranslationCapabilityConstants.InitiatorType.GESTURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    private LiveTranslationMetrics() {
    }

    public static /* synthetic */ void recordAudioFrameDropped$default(LiveTranslationMetrics liveTranslationMetrics, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        liveTranslationMetrics.recordAudioFrameDropped(i);
    }

    public static /* synthetic */ void recordAudioFrameReceived$default(LiveTranslationMetrics liveTranslationMetrics, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        liveTranslationMetrics.recordAudioFrameReceived(i);
    }

    public static /* synthetic */ void recordAudioFrameSent$default(LiveTranslationMetrics liveTranslationMetrics, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        liveTranslationMetrics.recordAudioFrameSent(i);
    }

    public static /* synthetic */ void recordAudioPlaybackFailed$default(LiveTranslationMetrics liveTranslationMetrics, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        liveTranslationMetrics.recordAudioPlaybackFailed(z);
    }

    private final void recordCounter(String name, String subComponent, int count) {
        String str;
        if (count <= 0) {
            return;
        }
        try {
            str = name;
        } catch (Exception e) {
            e = e;
            str = name;
        }
        try {
            MetricsRecorder.getInstance().recordCounter(str, MetricsConstants.COMPONENT_NAME, subComponent, count, null);
        } catch (Exception e2) {
            e = e2;
            Log.e(TAG, "Failed to record counter %s", e, str);
        }
    }

    public static /* synthetic */ void recordCounter$default(LiveTranslationMetrics liveTranslationMetrics, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = "default";
        }
        if ((i2 & 4) != 0) {
            i = 1;
        }
        liveTranslationMetrics.recordCounter(str, str2, i);
    }

    private final void recordDuration(String name, long durationMillis) {
        if (durationMillis < 0) {
            return;
        }
        try {
            MetricsRecorder.getInstance().recordDuration(name, durationMillis);
        } catch (Exception e) {
            Log.e(TAG, "Failed to record duration %s", e, name);
        }
    }

    private final void recordGenericSessionStartFailed(LiveTranslationCapabilityConstants.InitiatorType initiatorType) {
        recordCounter$default(this, startFailedMetricForInitiator(initiatorType), null, 0, 6, null);
    }

    private final String startFailedMetricForInitiator(LiveTranslationCapabilityConstants.InitiatorType initiatorType) {
        int i = WhenMappings.$EnumSwitchMapping$3[initiatorType.ordinal()];
        if (i == 1) {
            return LIVE_TRANSLATION_SESSION_START_FAILED_APP;
        }
        if (i == 2) {
            return LIVE_TRANSLATION_SESSION_START_FAILED_VOICE;
        }
        if (i == 3) {
            return LIVE_TRANSLATION_SESSION_START_FAILED_GESTURE;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    private final String startRequestedMetricForInitiator(LiveTranslationCapabilityConstants.InitiatorType initiatorType) {
        int i = WhenMappings.$EnumSwitchMapping$3[initiatorType.ordinal()];
        if (i == 1) {
            return LIVE_TRANSLATION_SESSION_START_REQUESTED_APP;
        }
        if (i == 2) {
            return LIVE_TRANSLATION_SESSION_START_REQUESTED_VOICE;
        }
        if (i == 3) {
            return LIVE_TRANSLATION_SESSION_START_REQUESTED_GESTURE;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    private final String startedMetricForInitiator(LiveTranslationCapabilityConstants.InitiatorType initiatorType) {
        int i = WhenMappings.$EnumSwitchMapping$3[initiatorType.ordinal()];
        if (i == 1) {
            return LIVE_TRANSLATION_SESSION_STARTED_APP;
        }
        if (i == 2) {
            return LIVE_TRANSLATION_SESSION_STARTED_VOICE;
        }
        if (i == 3) {
            return LIVE_TRANSLATION_SESSION_STARTED_GESTURE;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    public final void recordAccessoryAckToCloudSessionStarted(long durationMillis) {
        recordDuration(LIVE_TRANSLATION_ACCESSORY_ACK_TO_CLOUD_SESSION_STARTED, durationMillis);
    }

    public final void recordAudioCommitDroppedWithoutAudio() {
        recordCounter$default(this, LIVE_TRANSLATION_AUDIO_COMMIT_DROPPED, null, 0, 6, null);
        recordCounter$default(this, LIVE_TRANSLATION_AUDIO_ENDED_WITHOUT_AUDIO, null, 0, 6, null);
    }

    public final void recordAudioCommitDroppedWithoutPending() {
        recordCounter$default(this, LIVE_TRANSLATION_AUDIO_COMMIT_DROPPED, null, 0, 6, null);
        recordCounter$default(this, LIVE_TRANSLATION_AUDIO_ENDED_WITHOUT_PENDING, null, 0, 6, null);
    }

    public final void recordAudioFrameDropped(int count) {
        recordCounter$default(this, LIVE_TRANSLATION_AUDIO_FRAME_DROPPED, null, count, 2, null);
    }

    public final void recordAudioFrameReceived(int count) {
        recordCounter$default(this, LIVE_TRANSLATION_AUDIO_FRAME_RECEIVED, null, count, 2, null);
    }

    public final void recordAudioFrameSent(int count) {
        recordCounter$default(this, LIVE_TRANSLATION_AUDIO_FRAME_SENT, null, count, 2, null);
    }

    public final void recordAudioPlaybackFailed(boolean isDecodeFailure) {
        recordCounter$default(this, LIVE_TRANSLATION_AUDIO_PLAYBACK_FAILED, null, 0, 6, null);
        if (isDecodeFailure) {
            recordCounter$default(this, LIVE_TRANSLATION_AUDIO_PLAYBACK_DECODE_FAILED, null, 0, 6, null);
        }
    }

    public final void recordAudioReplayDuration(long durationMillis) {
        recordDuration(LIVE_TRANSLATION_AUDIO_REPLAY_DURATION, durationMillis);
    }

    public final void recordAudioReplayFailed(@NotNull ReplayFailureReason reason) {
        reason.getClass();
        recordCounter$default(this, LIVE_TRANSLATION_AUDIO_REPLAY_FAILED, reason.getSubComponent(), 0, 4, null);
    }

    public final void recordAudioReplayPaused() {
        recordCounter$default(this, LIVE_TRANSLATION_AUDIO_REPLAY_PAUSED, null, 0, 6, null);
    }

    public final void recordAudioReplayRequested() {
        recordCounter$default(this, LIVE_TRANSLATION_AUDIO_REPLAY_REQUESTED, null, 0, 6, null);
    }

    public final void recordCloudSessionStartedToVoiceStreamStarted(long durationMillis) {
        recordDuration(LIVE_TRANSLATION_CLOUD_SESSION_STARTED_TO_VOICE_STREAM_STARTED, durationMillis);
    }

    public final void recordIngressOpenedForeground() {
        recordCounter$default(this, LIVE_TRANSLATION_INGRESS_ROUTED, null, 0, 6, null);
        recordCounter$default(this, LIVE_TRANSLATION_INGRESS_OPENED_FOREGROUND, null, 0, 6, null);
    }

    public final void recordIngressRoutedBackground() {
        recordCounter$default(this, LIVE_TRANSLATION_INGRESS_ROUTED, null, 0, 6, null);
        recordCounter$default(this, LIVE_TRANSLATION_INGRESS_ROUTED_BACKGROUND, null, 0, 6, null);
    }

    public final void recordInvalidStateTransition() {
        recordCounter$default(this, LIVE_TRANSLATION_INVALID_STATE_TRANSITION, null, 0, 6, null);
    }

    public final void recordMessageCommitted(@NotNull TranslationMessage.Source source) {
        String str;
        source.getClass();
        recordCounter$default(this, LIVE_TRANSLATION_MESSAGE_COMMITTED, null, 0, 6, null);
        int i = WhenMappings.$EnumSwitchMapping$1[source.ordinal()];
        if (i == 1) {
            str = LIVE_TRANSLATION_MESSAGE_COMMITTED_USER;
        } else {
            if (i != 2) {
                PathKt$$ExternalSyntheticBUOutline0.m();
                return;
            }
            str = LIVE_TRANSLATION_MESSAGE_COMMITTED_BYSTANDER;
        }
        recordCounter$default(this, str, null, 0, 6, null);
    }

    public final void recordPendingQueueEvicted() {
        recordCounter$default(this, LIVE_TRANSLATION_PENDING_QUEUE_EVICTED, null, 0, 6, null);
    }

    public final void recordSessionDuration(long durationMillis) {
        recordDuration(LIVE_TRANSLATION_SESSION_DURATION, durationMillis);
    }

    public final void recordSessionPauseRequested() {
        recordCounter$default(this, LIVE_TRANSLATION_SESSION_PAUSE_REQUESTED, null, 0, 6, null);
    }

    public final void recordSessionPaused() {
        recordCounter$default(this, LIVE_TRANSLATION_SESSION_PAUSED, null, 0, 6, null);
    }

    public final void recordSessionResumeRequested() {
        recordCounter$default(this, LIVE_TRANSLATION_SESSION_RESUME_REQUESTED, null, 0, 6, null);
    }

    public final void recordSessionResumed() {
        recordCounter$default(this, LIVE_TRANSLATION_SESSION_RESUMED, null, 0, 6, null);
    }

    public final void recordSessionStartBlockedLanguageNotConfigured(@NotNull LiveTranslationCapabilityConstants.InitiatorType initiatorType) {
        initiatorType.getClass();
        recordSessionStartFailed(initiatorType);
        recordCounter$default(this, LIVE_TRANSLATION_SESSION_START_ERROR_LANGUAGE_NOT_CONFIGURED, null, 0, 6, null);
    }

    public final void recordSessionStartBlockedSessionAlreadyActive(@NotNull LiveTranslationCapabilityConstants.InitiatorType initiatorType) {
        initiatorType.getClass();
        recordSessionStartFailed(initiatorType);
        recordCounter$default(this, LIVE_TRANSLATION_SESSION_START_FAILED_SESSION_ALREADY_ACTIVE, null, 0, 6, null);
    }

    public final void recordSessionStartBlockedUnsupportedDeviceSoftware(@NotNull LiveTranslationCapabilityConstants.InitiatorType initiatorType) {
        initiatorType.getClass();
        recordSessionStartFailed(initiatorType);
        recordCounter$default(this, LIVE_TRANSLATION_SESSION_START_FAILED_UNSUPPORTED_DEVICE_SOFTWARE, null, 0, 6, null);
    }

    public final void recordSessionStartFailed(@NotNull LiveTranslationCapabilityConstants.InitiatorType initiatorType, @NotNull StartFailureStage stage) {
        String str;
        initiatorType.getClass();
        stage.getClass();
        recordGenericSessionStartFailed(initiatorType);
        int i = WhenMappings.$EnumSwitchMapping$2[stage.ordinal()];
        if (i == 1) {
            str = LIVE_TRANSLATION_START_FAILED_CONTROL_PLANE_UNAVAILABLE;
        } else if (i == 2) {
            str = LIVE_TRANSLATION_START_FAILED_ACCESSORY_REJECTED;
        } else if (i == 3) {
            str = LIVE_TRANSLATION_START_FAILED_CLOUD_CONNECTION;
        } else if (i == 4) {
            str = LIVE_TRANSLATION_START_FAILED_CLOUD_TIMEOUT;
        } else {
            if (i != 5) {
                PathKt$$ExternalSyntheticBUOutline0.m();
                return;
            }
            str = LIVE_TRANSLATION_START_FAILED_VOICE_STREAM;
        }
        recordCounter$default(this, str, null, 0, 6, null);
    }

    public final void recordSessionStartRequested(@NotNull LiveTranslationCapabilityConstants.InitiatorType initiatorType) {
        initiatorType.getClass();
        recordCounter$default(this, startRequestedMetricForInitiator(initiatorType), null, 0, 6, null);
    }

    public final void recordSessionStartToVoiceStreamStarted(long durationMillis) {
        recordDuration(LIVE_TRANSLATION_SESSION_START_TO_VOICE_STREAM_STARTED, durationMillis);
    }

    public final void recordSessionStarted(@NotNull LiveTranslationCapabilityConstants.InitiatorType initiatorType) {
        initiatorType.getClass();
        recordCounter$default(this, startedMetricForInitiator(initiatorType), null, 0, 6, null);
    }

    public final void recordSessionStopped(@NotNull LiveTranslationCapabilityConstants.StopReasonType reasonType) {
        reasonType.getClass();
        recordCounter$default(this, LIVE_TRANSLATION_SESSION_STOPPED, null, 0, 6, null);
        int i = WhenMappings.$EnumSwitchMapping$0[reasonType.ordinal()];
        recordCounter$default(this, i != 1 ? i != 2 ? i != 3 ? LIVE_TRANSLATION_SESSION_STOPPED_UNKNOWN : LIVE_TRANSLATION_SESSION_STOPPED_DEVICE_DISCONNECTED : LIVE_TRANSLATION_SESSION_STOPPED_CLOUD_STOP : LIVE_TRANSLATION_SESSION_STOPPED_USER_LOCAL_STOP, null, 0, 6, null);
    }

    public final void recordSetupPromptPlayFailed() {
        recordCounter$default(this, LIVE_TRANSLATION_SETUP_PROMPT_PLAY_FAILED, null, 0, 6, null);
    }

    public final void recordSetupPromptPlayed() {
        recordCounter$default(this, LIVE_TRANSLATION_SETUP_PROMPT_PLAYED, null, 0, 6, null);
    }

    public final void recordStartToAccessoryAck(long durationMillis) {
        recordDuration(LIVE_TRANSLATION_START_TO_ACCESSORY_ACK, durationMillis);
    }

    public final void recordStopFailed() {
        recordCounter$default(this, LIVE_TRANSLATION_STOP_FAILED, null, 0, 6, null);
    }

    public final void recordTranslationWithoutPending() {
        recordCounter$default(this, LIVE_TRANSLATION_TRANSLATION_WITHOUT_PENDING, null, 0, 6, null);
    }

    public final void recordVoiceStreamStartedToFirstMessageCommitted(long durationMillis) {
        recordDuration(LIVE_TRANSLATION_VOICE_STREAM_STARTED_TO_FIRST_MESSAGE_COMMITTED, durationMillis);
    }

    public final void recordWebSocketFailure(boolean retryable) {
        recordCounter$default(this, LIVE_TRANSLATION_WEBSOCKET_FAILURE, null, 0, 6, null);
        recordCounter$default(this, retryable ? LIVE_TRANSLATION_WEBSOCKET_ERROR_RETRYABLE : LIVE_TRANSLATION_WEBSOCKET_ERROR_FATAL, null, 0, 6, null);
    }

    public final void recordSessionStartFailed(@NotNull LiveTranslationCapabilityConstants.InitiatorType initiatorType) {
        initiatorType.getClass();
        recordGenericSessionStartFailed(initiatorType);
    }
}
