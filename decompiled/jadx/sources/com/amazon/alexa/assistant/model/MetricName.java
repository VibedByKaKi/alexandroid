package com.amazon.alexa.assistant.model;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.metis.api.ChatData$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\bl\b\u0086\u0081\u0002\u0018\u0000 n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bm¨\u0006o"}, d2 = {"Lcom/amazon/alexa/assistant/model/MetricName;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ASSISTANT_START_TO_READY_LATENCY", "ASSISTANT_START_LATENCY", "ASSISTANT_STOP_LATENCY", "ASSISTANT_BOOTSTRAP_LATENCY", "SYNCHRONIZE_STATE_SUCCESS_LATENCY", "SYNCHRONIZE_STATE_FAILURE_LATENCY", "ASSISTANT_START_TO_FULLY_READY_LATENCY", "TRANSPORT_CONNECTED_TO_FULLY_READY_LATENCY", "CAPABILITY_AGENTS_START_LATENCY", "CAPABILITY_AGENTS_START_FAILURE_LATENCY", "ASSISTANT_RECONNECT_LATENCY", "SET_GATEWAY_DIRECTIVE_PROCESSING_LATENCY", "SET_GATEWAY_SUCCESS", "GATEWAY_FAILURE", "VERIFY_GATEWAY_EVENT_SENT", "DISCOVERY_FAILURE", "INPUT_TEXT_IGNORING_DUE_TO_BUSY", "INPUT_TEXT_CANCELLED", "INPUT_TEXT_SUCCEEDED", "INPUT_TEXT_FAILED", "SYSTEM_USER_PREFERENCE_UPDATED", "SPEAKER_SYSTEM_VOLUME_OPERATION_FAILED", "SPEECH_SYNTHESIZER_DECODE_PAYLOAD_ATTEMPT", "SPEECH_SYNTHESIZER_DECODE_PAYLOAD_FAILED", "SPEECH_SYNTHESIZER_CREATE_PLAYBACK_TASK_FAILED", "SPEECH_SYNTHESIZER_CREATE_PLAYBACK_TASK_SUCCESS", "SPEECH_SYNTHESIZER_COMPLETION_FAILED", "SPEECH_SYNTHESIZER_COMPLETION_SUCCESS", "SPEECH_SYNTHESIZER_SYNTHESIZE_SPEECH_CANCELLED", "SPEECH_SYNTHESIZER_TIME_TO_FIRST_AUDIO", "SPEECH_SYNTHESIZER_STREAM_COMPLETE_AT_PLAY_START", "SPEECH_SYNTHESIZER_STREAM_INCOMPLETE_AT_PLAY_START", "SPEECH_RECOGNIZER_EXPECT_SPEECH_FROM_PROVIDER_RECEIVED", "SPEECH_RECOGNIZER_EXPECT_SPEECH_FROM_DIRECTIVE_RECEIVED", "SPEECH_RECOGNIZER_REDUNDANT_EXPECTING_SPEECH", "SPEECH_RECOGNIZER_CAPTURE_IN_PROGRESS", "WAKE_WORD_DIALOG_GATED", "SPEECH_RECOGNIZER_STREAM_BINDING_INIT_FAILED", "SPEECH_RECOGNIZER_EXPECT_SPEECH_STREAM_BINDING_INIT_FAILED", "SPEECH_RECOGNIZER_EXPECT_SPEECH_STATE_TIMEDOUT", "SPEECH_RECOGNIZER_EXPECT_SPEECH_DIRECTIVE_TIMEDOUT", "SPEECH_RECOGNIZER_ENGINE_ATTEMPT_TO_START", "SPEECH_RECOGNIZER_ENGINE_FAIL_TO_START", "SPEECH_RECOGNIZER_SET_END_OF_SPEECH_OFFSET", "SPEECH_RECOGNIZER_STOP_CAPTURE_RECEIVED", "SPEECH_RECOGNIZER_RESET_PRESERVED", "SPEECH_RECOGNIZER_RESET_PRESERVED_ANSWERED", "SPEECH_RECOGNIZER_RESET_PRESERVED_ORPHANED", "SPEECH_RECOGNIZER_DIRECTIVE_CANCELLED", "SPEECH_RECOGNIZER_INVALID_STATE_TRANSITION", "SPEECH_RECOGNIZER_EVENT_SUCCESS", "SPEECH_PROVIDER_ENGINE_ATTEMPT_TO_START", "SPEECH_PROVIDER_INITIALIZE_SOURCE_AUDIO_FAILED", "SPEECH_PROVIDER_START_AUDIO_ENGINE_FAILED", "WAKE_WORD_AUDIO_RECORD_START_DEFERRED", "WAKE_WORD_AUDIO_RECORD_RETRY_FAILED", "VOICE_CHAT_DIALOG_STARTED", "VOICE_CHAT_BARGE_IN_STARTED_DIALOG", "VOICE_CHAT_DIALOG_REQUEST_DENIED", "VOICE_CHAT_DIALOG_NO_DATA_ON_REQUEST", "VOICE_CHAT_DIALOG_SPEECH_PROVIDER_NOT_REGISTERED", "LIVE_MODE_INTERACTION_COUNT", "LIVE_MODE_SESSION_STARTED", "LIVE_MODE_SESSION_ENDED", "LIVE_MODE_SESSION_END_ERROR", "LIVE_MODE_SESSION_DURATION", "VOICE_CHAT_MANAGER_INVALID_STATE_TRANSITION", "LIVE_MODE_ENTRY_BLOCKED_NO_NETWORK", "VOICE_CHAT_MIC_HANDOFF_RELEASED", "VOICE_CHAT_MIC_HANDOFF_RESTORED", "VOICE_CHAT_MIC_HANDOFF_FAILED", "VOICE_CHAT_WAKEWORD_SUPPRESSOR_TOGGLED", "VOICE_CHAT_VAD_INITIALIZATION_LATENCY", "VOICE_CHAT_VAD_START_FAILED", "VOICE_CHAT_VAD_MODEL_FILE_NOT_FOUND", "VOICE_CHAT_VAD_FAILED_TO_LOAD_MODEL", "VOICE_CHAT_VAD_PROCESSING_ERROR", "VOICE_CHAT_VAD_BUFFER_READ_TIMEOUT", "VOICE_CHAT_VAD_BUFFER_READ_FAILED", "VOICE_CHAT_LIVE_PREVIEW_INTENT_CLASSIFIER_INVOKED", "VOICE_CHAT_LIVE_PREVIEW_INTENT_NONE", "VOICE_CHAT_LIVE_PREVIEW_INTENT_MUTE", "VOICE_CHAT_LIVE_PREVIEW_INTENT_EXIT", "VOICE_CHAT_LIVE_PREVIEW_INTENT_LOW_CONFIDENCE", "VOICE_CHAT_LIVE_PREVIEW_INTENT_MODEL_LOAD_FAILED", "VOICE_CHAT_LIVE_PREVIEW_INTENT_INFERENCE_FAILED", "VOICE_CHAT_LIVE_PREVIEW_INTENT_MODEL_LOAD_LATENCY", "VOICE_CHAT_LIVE_PREVIEW_INTENT_INFERENCE_LATENCY", "VOICE_CHAT_LIVE_PREVIEW_INTENT_CONFIDENCE_BUCKET", "VOICE_CHAT_PAUSE_RESUME_INITIATED", "VOICE_CHAT_PAUSE_RESUME_CONFIRMED_BY_LIVE_PREVIEW", "VOICE_CHAT_PAUSE_RESUME_TIMED_OUT", "VOICE_CHAT_PAUSE_RESUME_NEW_SR_COMPLETED_WITHOUT_LIVE_PREVIEW", "VOICE_CHAT_PAUSE_RESUME_RESOLVED_BY_IDLE_TRANSITION", "VOICE_CHAT_PAUSE_RESUME_CANCELLED_BY_STOP", "VOICE_CHAT_PAUSE_RESUME_SUPERSEDED", "VOICE_CHAT_PAUSE_RESUME_PAUSE_FAILED", "VOICE_CHAT_PAUSE_RESUME_OLD_SPEAK_RESUMED", "VOICE_CHAT_PAUSE_RESUME_OLD_SPEAK_FAILED_DURING_PAUSE", "VOICE_CHAT_PAUSE_RESUME_TIMEOUT_MS", "VOICE_CHAT_PAUSE_RESUME_CONFIRM_LATENCY_MS", "VOICE_CHAT_PAUSE_RESUME_PAUSE_DURATION_MS", "Companion", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MetricName {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MetricName[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String value;
    public static final MetricName ASSISTANT_START_TO_READY_LATENCY = new MetricName("ASSISTANT_START_TO_READY_LATENCY", 0, "assistantStartToReadyLatency");
    public static final MetricName ASSISTANT_START_LATENCY = new MetricName("ASSISTANT_START_LATENCY", 1, "assistantStartReturnLatency");
    public static final MetricName ASSISTANT_STOP_LATENCY = new MetricName("ASSISTANT_STOP_LATENCY", 2, "assistantStopReturnLatency");
    public static final MetricName ASSISTANT_BOOTSTRAP_LATENCY = new MetricName("ASSISTANT_BOOTSTRAP_LATENCY", 3, "assistantBootstrapLatency");
    public static final MetricName SYNCHRONIZE_STATE_SUCCESS_LATENCY = new MetricName("SYNCHRONIZE_STATE_SUCCESS_LATENCY", 4, "transport.connection.synchronizedState.succeeded.Latency");
    public static final MetricName SYNCHRONIZE_STATE_FAILURE_LATENCY = new MetricName("SYNCHRONIZE_STATE_FAILURE_LATENCY", 5, "transport.connection.synchronizedState.failed.Latency");
    public static final MetricName ASSISTANT_START_TO_FULLY_READY_LATENCY = new MetricName("ASSISTANT_START_TO_FULLY_READY_LATENCY", 6, "assistantStartToFullyReadyLatency");
    public static final MetricName TRANSPORT_CONNECTED_TO_FULLY_READY_LATENCY = new MetricName("TRANSPORT_CONNECTED_TO_FULLY_READY_LATENCY", 7, "transportConnectedToFullyReadyLatency");
    public static final MetricName CAPABILITY_AGENTS_START_LATENCY = new MetricName("CAPABILITY_AGENTS_START_LATENCY", 8, "capabilityAgentsStartLatency");
    public static final MetricName CAPABILITY_AGENTS_START_FAILURE_LATENCY = new MetricName("CAPABILITY_AGENTS_START_FAILURE_LATENCY", 9, "capabilityAgentsStartFailureLatency");
    public static final MetricName ASSISTANT_RECONNECT_LATENCY = new MetricName("ASSISTANT_RECONNECT_LATENCY", 10, "assistantReconnectLatency");
    public static final MetricName SET_GATEWAY_DIRECTIVE_PROCESSING_LATENCY = new MetricName("SET_GATEWAY_DIRECTIVE_PROCESSING_LATENCY", 11, "setGatewayDirectiveProcessingLatency");
    public static final MetricName SET_GATEWAY_SUCCESS = new MetricName("SET_GATEWAY_SUCCESS", 12, "GATEWAY_VERIFIED");
    public static final MetricName GATEWAY_FAILURE = new MetricName("GATEWAY_FAILURE", 13, "GATEWAY_FAILURE");
    public static final MetricName VERIFY_GATEWAY_EVENT_SENT = new MetricName("VERIFY_GATEWAY_EVENT_SENT", 14, "VERIFY_GATEWAY_EVENT_SENT");
    public static final MetricName DISCOVERY_FAILURE = new MetricName("DISCOVERY_FAILURE", 15, "discoveryFailure");
    public static final MetricName INPUT_TEXT_IGNORING_DUE_TO_BUSY = new MetricName("INPUT_TEXT_IGNORING_DUE_TO_BUSY", 16, "InputText.ignoringTextDueToBusy");
    public static final MetricName INPUT_TEXT_CANCELLED = new MetricName("INPUT_TEXT_CANCELLED", 17, "InputText.textCancelled");
    public static final MetricName INPUT_TEXT_SUCCEEDED = new MetricName("INPUT_TEXT_SUCCEEDED", 18, "InputText.textSucceeded");
    public static final MetricName INPUT_TEXT_FAILED = new MetricName("INPUT_TEXT_FAILED", 19, "InputText.textFailed");
    public static final MetricName SYSTEM_USER_PREFERENCE_UPDATED = new MetricName("SYSTEM_USER_PREFERENCE_UPDATED", 20, "systemCapabilityAgentUserPreferenceUpdated");
    public static final MetricName SPEAKER_SYSTEM_VOLUME_OPERATION_FAILED = new MetricName("SPEAKER_SYSTEM_VOLUME_OPERATION_FAILED", 21, "speakerCapabilityAgentSystemVolumeOperationFailed");
    public static final MetricName SPEECH_SYNTHESIZER_DECODE_PAYLOAD_ATTEMPT = new MetricName("SPEECH_SYNTHESIZER_DECODE_PAYLOAD_ATTEMPT", 22, "presentation.speechsynthesizer.decodePayloadAttempt");
    public static final MetricName SPEECH_SYNTHESIZER_DECODE_PAYLOAD_FAILED = new MetricName("SPEECH_SYNTHESIZER_DECODE_PAYLOAD_FAILED", 23, "presentation.speechsynthesizer.decodePayloadFailed");
    public static final MetricName SPEECH_SYNTHESIZER_CREATE_PLAYBACK_TASK_FAILED = new MetricName("SPEECH_SYNTHESIZER_CREATE_PLAYBACK_TASK_FAILED", 24, "presentation.speechsynthesizer.createPlaybackTaskFailed");
    public static final MetricName SPEECH_SYNTHESIZER_CREATE_PLAYBACK_TASK_SUCCESS = new MetricName("SPEECH_SYNTHESIZER_CREATE_PLAYBACK_TASK_SUCCESS", 25, "presentation.speechsynthesizer.createPlaybackTaskSuccess");
    public static final MetricName SPEECH_SYNTHESIZER_COMPLETION_FAILED = new MetricName("SPEECH_SYNTHESIZER_COMPLETION_FAILED", 26, "presentation.speechsynthesizer.speechSynthesizerCompletionFailed");
    public static final MetricName SPEECH_SYNTHESIZER_COMPLETION_SUCCESS = new MetricName("SPEECH_SYNTHESIZER_COMPLETION_SUCCESS", 27, "presentation.speechsynthesizer.speechSynthesizerCompletionSuccess");
    public static final MetricName SPEECH_SYNTHESIZER_SYNTHESIZE_SPEECH_CANCELLED = new MetricName("SPEECH_SYNTHESIZER_SYNTHESIZE_SPEECH_CANCELLED", 28, "presentation.speechsynthesizer.speechcancelled");
    public static final MetricName SPEECH_SYNTHESIZER_TIME_TO_FIRST_AUDIO = new MetricName("SPEECH_SYNTHESIZER_TIME_TO_FIRST_AUDIO", 29, "presentation.speechsynthesizer.timeToFirstAudioMs");
    public static final MetricName SPEECH_SYNTHESIZER_STREAM_COMPLETE_AT_PLAY_START = new MetricName("SPEECH_SYNTHESIZER_STREAM_COMPLETE_AT_PLAY_START", 30, "presentation.speechsynthesizer.streamCompleteAtPlayStart");
    public static final MetricName SPEECH_SYNTHESIZER_STREAM_INCOMPLETE_AT_PLAY_START = new MetricName("SPEECH_SYNTHESIZER_STREAM_INCOMPLETE_AT_PLAY_START", 31, "presentation.speechsynthesizer.streamIncompleteAtPlayStart");
    public static final MetricName SPEECH_RECOGNIZER_EXPECT_SPEECH_FROM_PROVIDER_RECEIVED = new MetricName("SPEECH_RECOGNIZER_EXPECT_SPEECH_FROM_PROVIDER_RECEIVED", 32, "SpeechRecognizer.expectSpeechFromProviderReceived");
    public static final MetricName SPEECH_RECOGNIZER_EXPECT_SPEECH_FROM_DIRECTIVE_RECEIVED = new MetricName("SPEECH_RECOGNIZER_EXPECT_SPEECH_FROM_DIRECTIVE_RECEIVED", 33, "SpeechRecognizer.expectSpeechFromDirectiveReceived");
    public static final MetricName SPEECH_RECOGNIZER_REDUNDANT_EXPECTING_SPEECH = new MetricName("SPEECH_RECOGNIZER_REDUNDANT_EXPECTING_SPEECH", 34, "SpeechRecognizer.redundantExpectingSpeech");
    public static final MetricName SPEECH_RECOGNIZER_CAPTURE_IN_PROGRESS = new MetricName("SPEECH_RECOGNIZER_CAPTURE_IN_PROGRESS", 35, "SpeechRecognizer.captureInProgress");
    public static final MetricName WAKE_WORD_DIALOG_GATED = new MetricName("WAKE_WORD_DIALOG_GATED", 36, "wakeWordDialogGated");
    public static final MetricName SPEECH_RECOGNIZER_STREAM_BINDING_INIT_FAILED = new MetricName("SPEECH_RECOGNIZER_STREAM_BINDING_INIT_FAILED", 37, "SpeechRecognizer.streamBindingInitFailed");
    public static final MetricName SPEECH_RECOGNIZER_EXPECT_SPEECH_STREAM_BINDING_INIT_FAILED = new MetricName("SPEECH_RECOGNIZER_EXPECT_SPEECH_STREAM_BINDING_INIT_FAILED", 38, "SpeechRecognizer.expectSpeechStreamBindingInitFailed");
    public static final MetricName SPEECH_RECOGNIZER_EXPECT_SPEECH_STATE_TIMEDOUT = new MetricName("SPEECH_RECOGNIZER_EXPECT_SPEECH_STATE_TIMEDOUT", 39, "SpeechRecognizer.expectSpeechStateTimedout");
    public static final MetricName SPEECH_RECOGNIZER_EXPECT_SPEECH_DIRECTIVE_TIMEDOUT = new MetricName("SPEECH_RECOGNIZER_EXPECT_SPEECH_DIRECTIVE_TIMEDOUT", 40, "SpeechRecognizer.expectSpeechDirectiveTimedout");
    public static final MetricName SPEECH_RECOGNIZER_ENGINE_ATTEMPT_TO_START = new MetricName("SPEECH_RECOGNIZER_ENGINE_ATTEMPT_TO_START", 41, "SpeechRecognizer.engineAttemptToStart");
    public static final MetricName SPEECH_RECOGNIZER_ENGINE_FAIL_TO_START = new MetricName("SPEECH_RECOGNIZER_ENGINE_FAIL_TO_START", 42, "SpeechRecognizer.engineFailToStart");
    public static final MetricName SPEECH_RECOGNIZER_SET_END_OF_SPEECH_OFFSET = new MetricName("SPEECH_RECOGNIZER_SET_END_OF_SPEECH_OFFSET", 43, "SpeechRecognizer.endOfSpeechOffsetReceived");
    public static final MetricName SPEECH_RECOGNIZER_STOP_CAPTURE_RECEIVED = new MetricName("SPEECH_RECOGNIZER_STOP_CAPTURE_RECEIVED", 44, "SpeechRecognizer.stopCaptureReceived");
    public static final MetricName SPEECH_RECOGNIZER_RESET_PRESERVED = new MetricName("SPEECH_RECOGNIZER_RESET_PRESERVED", 45, "RECOGNIZE_RESET_PRESERVED");
    public static final MetricName SPEECH_RECOGNIZER_RESET_PRESERVED_ANSWERED = new MetricName("SPEECH_RECOGNIZER_RESET_PRESERVED_ANSWERED", 46, "RECOGNIZE_RESET_PRESERVED.Answered");
    public static final MetricName SPEECH_RECOGNIZER_RESET_PRESERVED_ORPHANED = new MetricName("SPEECH_RECOGNIZER_RESET_PRESERVED_ORPHANED", 47, "RECOGNIZE_RESET_PRESERVED.Orphaned");
    public static final MetricName SPEECH_RECOGNIZER_DIRECTIVE_CANCELLED = new MetricName("SPEECH_RECOGNIZER_DIRECTIVE_CANCELLED", 48, "SpeechRecognizer.directiveCancelled");
    public static final MetricName SPEECH_RECOGNIZER_INVALID_STATE_TRANSITION = new MetricName("SPEECH_RECOGNIZER_INVALID_STATE_TRANSITION", 49, "SpeechRecognizer.invalidStateTransition");
    public static final MetricName SPEECH_RECOGNIZER_EVENT_SUCCESS = new MetricName("SPEECH_RECOGNIZER_EVENT_SUCCESS", 50, "SpeechRecognizer.eventSuccess");
    public static final MetricName SPEECH_PROVIDER_ENGINE_ATTEMPT_TO_START = new MetricName("SPEECH_PROVIDER_ENGINE_ATTEMPT_TO_START", 51, "SpeechRecognizer.speechProviderEngineAttemptToStart");
    public static final MetricName SPEECH_PROVIDER_INITIALIZE_SOURCE_AUDIO_FAILED = new MetricName("SPEECH_PROVIDER_INITIALIZE_SOURCE_AUDIO_FAILED", 52, "SpeechRecognizer.speechProviderInitializeSourceAudioFailed");
    public static final MetricName SPEECH_PROVIDER_START_AUDIO_ENGINE_FAILED = new MetricName("SPEECH_PROVIDER_START_AUDIO_ENGINE_FAILED", 53, "SpeechRecognizer.speechProviderStartAudioEngineFailed");
    public static final MetricName WAKE_WORD_AUDIO_RECORD_START_DEFERRED = new MetricName("WAKE_WORD_AUDIO_RECORD_START_DEFERRED", 54, "SpeechRecognizer.wakeWordAudioRecordStartDeferred");
    public static final MetricName WAKE_WORD_AUDIO_RECORD_RETRY_FAILED = new MetricName("WAKE_WORD_AUDIO_RECORD_RETRY_FAILED", 55, "SpeechRecognizer.wakeWordAudioRecordRetryFailed");
    public static final MetricName VOICE_CHAT_DIALOG_STARTED = new MetricName("VOICE_CHAT_DIALOG_STARTED", 56, "VoiceChat.Dialog.Started");
    public static final MetricName VOICE_CHAT_BARGE_IN_STARTED_DIALOG = new MetricName("VOICE_CHAT_BARGE_IN_STARTED_DIALOG", 57, "VoiceChat.BargeInManager.StartedDialog");
    public static final MetricName VOICE_CHAT_DIALOG_REQUEST_DENIED = new MetricName("VOICE_CHAT_DIALOG_REQUEST_DENIED", 58, "VoiceChat.Dialog.RequestDenied");
    public static final MetricName VOICE_CHAT_DIALOG_NO_DATA_ON_REQUEST = new MetricName("VOICE_CHAT_DIALOG_NO_DATA_ON_REQUEST", 59, "VoiceChat.Dialog.NoDataOnRequest");
    public static final MetricName VOICE_CHAT_DIALOG_SPEECH_PROVIDER_NOT_REGISTERED = new MetricName("VOICE_CHAT_DIALOG_SPEECH_PROVIDER_NOT_REGISTERED", 60, "VoiceChat.Dialog.SpeechProviderNotRegistered");
    public static final MetricName LIVE_MODE_INTERACTION_COUNT = new MetricName("LIVE_MODE_INTERACTION_COUNT", 61, "LIVE_MODE_INTERACTION_COUNT");
    public static final MetricName LIVE_MODE_SESSION_STARTED = new MetricName("LIVE_MODE_SESSION_STARTED", 62, "LIVE_MODE_SESSION_STARTED");
    public static final MetricName LIVE_MODE_SESSION_ENDED = new MetricName("LIVE_MODE_SESSION_ENDED", 63, "LIVE_MODE_SESSION_ENDED");
    public static final MetricName LIVE_MODE_SESSION_END_ERROR = new MetricName("LIVE_MODE_SESSION_END_ERROR", 64, "LIVE_MODE_SESSION_END_ERROR");
    public static final MetricName LIVE_MODE_SESSION_DURATION = new MetricName("LIVE_MODE_SESSION_DURATION", 65, "LIVE_MODE_SESSION_DURATION");
    public static final MetricName VOICE_CHAT_MANAGER_INVALID_STATE_TRANSITION = new MetricName("VOICE_CHAT_MANAGER_INVALID_STATE_TRANSITION", 66, "VoiceChat.Manager.InvalidStateTransition");
    public static final MetricName LIVE_MODE_ENTRY_BLOCKED_NO_NETWORK = new MetricName("LIVE_MODE_ENTRY_BLOCKED_NO_NETWORK", 67, "LIVE_MODE_ENTRY_BLOCKED_NO_NETWORK");
    public static final MetricName VOICE_CHAT_MIC_HANDOFF_RELEASED = new MetricName("VOICE_CHAT_MIC_HANDOFF_RELEASED", 68, "VoiceChat.MicHandoff.Released");
    public static final MetricName VOICE_CHAT_MIC_HANDOFF_RESTORED = new MetricName("VOICE_CHAT_MIC_HANDOFF_RESTORED", 69, "VoiceChat.MicHandoff.Restored");
    public static final MetricName VOICE_CHAT_MIC_HANDOFF_FAILED = new MetricName("VOICE_CHAT_MIC_HANDOFF_FAILED", 70, "VoiceChat.MicHandoff.Failed");
    public static final MetricName VOICE_CHAT_WAKEWORD_SUPPRESSOR_TOGGLED = new MetricName("VOICE_CHAT_WAKEWORD_SUPPRESSOR_TOGGLED", 71, "VoiceChat.WakewordSuppressor.Toggled");
    public static final MetricName VOICE_CHAT_VAD_INITIALIZATION_LATENCY = new MetricName("VOICE_CHAT_VAD_INITIALIZATION_LATENCY", 72, "VoiceChat.AlexaVoiceActivityDetector.InitializationLatency");
    public static final MetricName VOICE_CHAT_VAD_START_FAILED = new MetricName("VOICE_CHAT_VAD_START_FAILED", 73, "VoiceChat.AlexaVoiceActivityDetector.Start.Failed");
    public static final MetricName VOICE_CHAT_VAD_MODEL_FILE_NOT_FOUND = new MetricName("VOICE_CHAT_VAD_MODEL_FILE_NOT_FOUND", 74, "VoiceChat.VADManager.ModelFileNotFound");
    public static final MetricName VOICE_CHAT_VAD_FAILED_TO_LOAD_MODEL = new MetricName("VOICE_CHAT_VAD_FAILED_TO_LOAD_MODEL", 75, "VoiceChat.VADManager.FailedToLoadModel");
    public static final MetricName VOICE_CHAT_VAD_PROCESSING_ERROR = new MetricName("VOICE_CHAT_VAD_PROCESSING_ERROR", 76, "VoiceChat.AlexaVoiceActivityDetector.ProcessingError");
    public static final MetricName VOICE_CHAT_VAD_BUFFER_READ_TIMEOUT = new MetricName("VOICE_CHAT_VAD_BUFFER_READ_TIMEOUT", 77, "VoiceChat.AlexaVoiceActivityDetector.BufferReadTimeout");
    public static final MetricName VOICE_CHAT_VAD_BUFFER_READ_FAILED = new MetricName("VOICE_CHAT_VAD_BUFFER_READ_FAILED", 78, "VoiceChat.AlexaVoiceActivityDetector.BufferReadFailed");
    public static final MetricName VOICE_CHAT_LIVE_PREVIEW_INTENT_CLASSIFIER_INVOKED = new MetricName("VOICE_CHAT_LIVE_PREVIEW_INTENT_CLASSIFIER_INVOKED", 79, "VoiceChat.LivePreviewIntent.ClassifierInvoked");
    public static final MetricName VOICE_CHAT_LIVE_PREVIEW_INTENT_NONE = new MetricName("VOICE_CHAT_LIVE_PREVIEW_INTENT_NONE", 80, "VoiceChat.LivePreviewIntent.None");
    public static final MetricName VOICE_CHAT_LIVE_PREVIEW_INTENT_MUTE = new MetricName("VOICE_CHAT_LIVE_PREVIEW_INTENT_MUTE", 81, "VoiceChat.LivePreviewIntent.Mute");
    public static final MetricName VOICE_CHAT_LIVE_PREVIEW_INTENT_EXIT = new MetricName("VOICE_CHAT_LIVE_PREVIEW_INTENT_EXIT", 82, "VoiceChat.LivePreviewIntent.Exit");
    public static final MetricName VOICE_CHAT_LIVE_PREVIEW_INTENT_LOW_CONFIDENCE = new MetricName("VOICE_CHAT_LIVE_PREVIEW_INTENT_LOW_CONFIDENCE", 83, "VoiceChat.LivePreviewIntent.LowConfidence");
    public static final MetricName VOICE_CHAT_LIVE_PREVIEW_INTENT_MODEL_LOAD_FAILED = new MetricName("VOICE_CHAT_LIVE_PREVIEW_INTENT_MODEL_LOAD_FAILED", 84, "VoiceChat.LivePreviewIntent.ModelLoadFailed");
    public static final MetricName VOICE_CHAT_LIVE_PREVIEW_INTENT_INFERENCE_FAILED = new MetricName("VOICE_CHAT_LIVE_PREVIEW_INTENT_INFERENCE_FAILED", 85, "VoiceChat.LivePreviewIntent.InferenceFailed");
    public static final MetricName VOICE_CHAT_LIVE_PREVIEW_INTENT_MODEL_LOAD_LATENCY = new MetricName("VOICE_CHAT_LIVE_PREVIEW_INTENT_MODEL_LOAD_LATENCY", 86, "VoiceChat.LivePreviewIntent.ModelLoadLatency");
    public static final MetricName VOICE_CHAT_LIVE_PREVIEW_INTENT_INFERENCE_LATENCY = new MetricName("VOICE_CHAT_LIVE_PREVIEW_INTENT_INFERENCE_LATENCY", 87, "VoiceChat.LivePreviewIntent.InferenceLatency");
    public static final MetricName VOICE_CHAT_LIVE_PREVIEW_INTENT_CONFIDENCE_BUCKET = new MetricName("VOICE_CHAT_LIVE_PREVIEW_INTENT_CONFIDENCE_BUCKET", 88, "VoiceChat.LivePreviewIntent.ConfidenceBucket");
    public static final MetricName VOICE_CHAT_PAUSE_RESUME_INITIATED = new MetricName("VOICE_CHAT_PAUSE_RESUME_INITIATED", 89, "VoiceChat.PauseResume.Initiated");
    public static final MetricName VOICE_CHAT_PAUSE_RESUME_CONFIRMED_BY_LIVE_PREVIEW = new MetricName("VOICE_CHAT_PAUSE_RESUME_CONFIRMED_BY_LIVE_PREVIEW", 90, "VoiceChat.PauseResume.ConfirmedByLivePreview");
    public static final MetricName VOICE_CHAT_PAUSE_RESUME_TIMED_OUT = new MetricName("VOICE_CHAT_PAUSE_RESUME_TIMED_OUT", 91, "VoiceChat.PauseResume.TimedOut");
    public static final MetricName VOICE_CHAT_PAUSE_RESUME_NEW_SR_COMPLETED_WITHOUT_LIVE_PREVIEW = new MetricName("VOICE_CHAT_PAUSE_RESUME_NEW_SR_COMPLETED_WITHOUT_LIVE_PREVIEW", 92, "VoiceChat.PauseResume.NewSRCompletedWithoutLivePreview");
    public static final MetricName VOICE_CHAT_PAUSE_RESUME_RESOLVED_BY_IDLE_TRANSITION = new MetricName("VOICE_CHAT_PAUSE_RESUME_RESOLVED_BY_IDLE_TRANSITION", 93, "VoiceChat.PauseResume.ResolvedByIdleTransition");
    public static final MetricName VOICE_CHAT_PAUSE_RESUME_CANCELLED_BY_STOP = new MetricName("VOICE_CHAT_PAUSE_RESUME_CANCELLED_BY_STOP", 94, "VoiceChat.PauseResume.CancelledByStop");
    public static final MetricName VOICE_CHAT_PAUSE_RESUME_SUPERSEDED = new MetricName("VOICE_CHAT_PAUSE_RESUME_SUPERSEDED", 95, "VoiceChat.PauseResume.Superseded");
    public static final MetricName VOICE_CHAT_PAUSE_RESUME_PAUSE_FAILED = new MetricName("VOICE_CHAT_PAUSE_RESUME_PAUSE_FAILED", 96, "VoiceChat.PauseResume.PauseFailed");
    public static final MetricName VOICE_CHAT_PAUSE_RESUME_OLD_SPEAK_RESUMED = new MetricName("VOICE_CHAT_PAUSE_RESUME_OLD_SPEAK_RESUMED", 97, "VoiceChat.PauseResume.OldSpeakResumed");
    public static final MetricName VOICE_CHAT_PAUSE_RESUME_OLD_SPEAK_FAILED_DURING_PAUSE = new MetricName("VOICE_CHAT_PAUSE_RESUME_OLD_SPEAK_FAILED_DURING_PAUSE", 98, "VoiceChat.PauseResume.OldSpeakFailedDuringPause");
    public static final MetricName VOICE_CHAT_PAUSE_RESUME_TIMEOUT_MS = new MetricName("VOICE_CHAT_PAUSE_RESUME_TIMEOUT_MS", 99, "VoiceChat.PauseResume.TimeoutMs");
    public static final MetricName VOICE_CHAT_PAUSE_RESUME_CONFIRM_LATENCY_MS = new MetricName("VOICE_CHAT_PAUSE_RESUME_CONFIRM_LATENCY_MS", 100, "VoiceChat.PauseResume.ConfirmLatencyMs");
    public static final MetricName VOICE_CHAT_PAUSE_RESUME_PAUSE_DURATION_MS = new MetricName("VOICE_CHAT_PAUSE_RESUME_PAUSE_DURATION_MS", 101, "VoiceChat.PauseResume.PauseDurationMs");

    private static final /* synthetic */ MetricName[] $values() {
        return new MetricName[]{ASSISTANT_START_TO_READY_LATENCY, ASSISTANT_START_LATENCY, ASSISTANT_STOP_LATENCY, ASSISTANT_BOOTSTRAP_LATENCY, SYNCHRONIZE_STATE_SUCCESS_LATENCY, SYNCHRONIZE_STATE_FAILURE_LATENCY, ASSISTANT_START_TO_FULLY_READY_LATENCY, TRANSPORT_CONNECTED_TO_FULLY_READY_LATENCY, CAPABILITY_AGENTS_START_LATENCY, CAPABILITY_AGENTS_START_FAILURE_LATENCY, ASSISTANT_RECONNECT_LATENCY, SET_GATEWAY_DIRECTIVE_PROCESSING_LATENCY, SET_GATEWAY_SUCCESS, GATEWAY_FAILURE, VERIFY_GATEWAY_EVENT_SENT, DISCOVERY_FAILURE, INPUT_TEXT_IGNORING_DUE_TO_BUSY, INPUT_TEXT_CANCELLED, INPUT_TEXT_SUCCEEDED, INPUT_TEXT_FAILED, SYSTEM_USER_PREFERENCE_UPDATED, SPEAKER_SYSTEM_VOLUME_OPERATION_FAILED, SPEECH_SYNTHESIZER_DECODE_PAYLOAD_ATTEMPT, SPEECH_SYNTHESIZER_DECODE_PAYLOAD_FAILED, SPEECH_SYNTHESIZER_CREATE_PLAYBACK_TASK_FAILED, SPEECH_SYNTHESIZER_CREATE_PLAYBACK_TASK_SUCCESS, SPEECH_SYNTHESIZER_COMPLETION_FAILED, SPEECH_SYNTHESIZER_COMPLETION_SUCCESS, SPEECH_SYNTHESIZER_SYNTHESIZE_SPEECH_CANCELLED, SPEECH_SYNTHESIZER_TIME_TO_FIRST_AUDIO, SPEECH_SYNTHESIZER_STREAM_COMPLETE_AT_PLAY_START, SPEECH_SYNTHESIZER_STREAM_INCOMPLETE_AT_PLAY_START, SPEECH_RECOGNIZER_EXPECT_SPEECH_FROM_PROVIDER_RECEIVED, SPEECH_RECOGNIZER_EXPECT_SPEECH_FROM_DIRECTIVE_RECEIVED, SPEECH_RECOGNIZER_REDUNDANT_EXPECTING_SPEECH, SPEECH_RECOGNIZER_CAPTURE_IN_PROGRESS, WAKE_WORD_DIALOG_GATED, SPEECH_RECOGNIZER_STREAM_BINDING_INIT_FAILED, SPEECH_RECOGNIZER_EXPECT_SPEECH_STREAM_BINDING_INIT_FAILED, SPEECH_RECOGNIZER_EXPECT_SPEECH_STATE_TIMEDOUT, SPEECH_RECOGNIZER_EXPECT_SPEECH_DIRECTIVE_TIMEDOUT, SPEECH_RECOGNIZER_ENGINE_ATTEMPT_TO_START, SPEECH_RECOGNIZER_ENGINE_FAIL_TO_START, SPEECH_RECOGNIZER_SET_END_OF_SPEECH_OFFSET, SPEECH_RECOGNIZER_STOP_CAPTURE_RECEIVED, SPEECH_RECOGNIZER_RESET_PRESERVED, SPEECH_RECOGNIZER_RESET_PRESERVED_ANSWERED, SPEECH_RECOGNIZER_RESET_PRESERVED_ORPHANED, SPEECH_RECOGNIZER_DIRECTIVE_CANCELLED, SPEECH_RECOGNIZER_INVALID_STATE_TRANSITION, SPEECH_RECOGNIZER_EVENT_SUCCESS, SPEECH_PROVIDER_ENGINE_ATTEMPT_TO_START, SPEECH_PROVIDER_INITIALIZE_SOURCE_AUDIO_FAILED, SPEECH_PROVIDER_START_AUDIO_ENGINE_FAILED, WAKE_WORD_AUDIO_RECORD_START_DEFERRED, WAKE_WORD_AUDIO_RECORD_RETRY_FAILED, VOICE_CHAT_DIALOG_STARTED, VOICE_CHAT_BARGE_IN_STARTED_DIALOG, VOICE_CHAT_DIALOG_REQUEST_DENIED, VOICE_CHAT_DIALOG_NO_DATA_ON_REQUEST, VOICE_CHAT_DIALOG_SPEECH_PROVIDER_NOT_REGISTERED, LIVE_MODE_INTERACTION_COUNT, LIVE_MODE_SESSION_STARTED, LIVE_MODE_SESSION_ENDED, LIVE_MODE_SESSION_END_ERROR, LIVE_MODE_SESSION_DURATION, VOICE_CHAT_MANAGER_INVALID_STATE_TRANSITION, LIVE_MODE_ENTRY_BLOCKED_NO_NETWORK, VOICE_CHAT_MIC_HANDOFF_RELEASED, VOICE_CHAT_MIC_HANDOFF_RESTORED, VOICE_CHAT_MIC_HANDOFF_FAILED, VOICE_CHAT_WAKEWORD_SUPPRESSOR_TOGGLED, VOICE_CHAT_VAD_INITIALIZATION_LATENCY, VOICE_CHAT_VAD_START_FAILED, VOICE_CHAT_VAD_MODEL_FILE_NOT_FOUND, VOICE_CHAT_VAD_FAILED_TO_LOAD_MODEL, VOICE_CHAT_VAD_PROCESSING_ERROR, VOICE_CHAT_VAD_BUFFER_READ_TIMEOUT, VOICE_CHAT_VAD_BUFFER_READ_FAILED, VOICE_CHAT_LIVE_PREVIEW_INTENT_CLASSIFIER_INVOKED, VOICE_CHAT_LIVE_PREVIEW_INTENT_NONE, VOICE_CHAT_LIVE_PREVIEW_INTENT_MUTE, VOICE_CHAT_LIVE_PREVIEW_INTENT_EXIT, VOICE_CHAT_LIVE_PREVIEW_INTENT_LOW_CONFIDENCE, VOICE_CHAT_LIVE_PREVIEW_INTENT_MODEL_LOAD_FAILED, VOICE_CHAT_LIVE_PREVIEW_INTENT_INFERENCE_FAILED, VOICE_CHAT_LIVE_PREVIEW_INTENT_MODEL_LOAD_LATENCY, VOICE_CHAT_LIVE_PREVIEW_INTENT_INFERENCE_LATENCY, VOICE_CHAT_LIVE_PREVIEW_INTENT_CONFIDENCE_BUCKET, VOICE_CHAT_PAUSE_RESUME_INITIATED, VOICE_CHAT_PAUSE_RESUME_CONFIRMED_BY_LIVE_PREVIEW, VOICE_CHAT_PAUSE_RESUME_TIMED_OUT, VOICE_CHAT_PAUSE_RESUME_NEW_SR_COMPLETED_WITHOUT_LIVE_PREVIEW, VOICE_CHAT_PAUSE_RESUME_RESOLVED_BY_IDLE_TRANSITION, VOICE_CHAT_PAUSE_RESUME_CANCELLED_BY_STOP, VOICE_CHAT_PAUSE_RESUME_SUPERSEDED, VOICE_CHAT_PAUSE_RESUME_PAUSE_FAILED, VOICE_CHAT_PAUSE_RESUME_OLD_SPEAK_RESUMED, VOICE_CHAT_PAUSE_RESUME_OLD_SPEAK_FAILED_DURING_PAUSE, VOICE_CHAT_PAUSE_RESUME_TIMEOUT_MS, VOICE_CHAT_PAUSE_RESUME_CONFIRM_LATENCY_MS, VOICE_CHAT_PAUSE_RESUME_PAUSE_DURATION_MS};
    }

    static {
        MetricName[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private MetricName(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<MetricName> getEntries() {
        return $ENTRIES;
    }

    public static MetricName valueOf(String str) {
        return (MetricName) Enum.valueOf(MetricName.class, str);
    }

    public static MetricName[] values() {
        return (MetricName[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u001e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/model/MetricName$Companion;", "", "<init>", "()V", "eventSuccess", "", "requestType", "eventFailure", "eventCancelled", "speechProviderFailure", "providerType", "errorDescription", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String eventCancelled(@NotNull String requestType) {
            return ChatData$$ExternalSyntheticOutline0.m(requestType, "SpeechRecognizer.eventCancelled.", requestType);
        }

        @NotNull
        public final String eventFailure(@NotNull String requestType) {
            return ChatData$$ExternalSyntheticOutline0.m(requestType, "SpeechRecognizer.eventFailure.", requestType);
        }

        @NotNull
        public final String eventSuccess(@NotNull String requestType) {
            return ChatData$$ExternalSyntheticOutline0.m(requestType, "SpeechRecognizer.eventSuccess.", requestType);
        }

        @NotNull
        public final String speechProviderFailure(@NotNull String requestType, @NotNull String providerType, @NotNull String errorDescription) {
            requestType.getClass();
            providerType.getClass();
            errorDescription.getClass();
            StringBuilder sb = new StringBuilder("SpeechRecognizer.");
            sb.append(requestType);
            return DoubleList$$ExternalSyntheticOutline0.m(sb, "SpeechProviderFailure.", providerType, ".", errorDescription);
        }

        private Companion() {
        }
    }
}
