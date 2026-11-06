package com.amazon.rtvi.capture.metrics;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b7\n\u0002\u0010$\n\u0002\b\u0019\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001d\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050=¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u000e\u0010@\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001d\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050=¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010?R\u001d\u0010R\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050=¢\u0006\b\n\u0000\u001a\u0004\bS\u0010?R\u001d\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050=¢\u0006\b\n\u0000\u001a\u0004\bU\u0010?¨\u0006V"}, d2 = {"Lcom/amazon/rtvi/capture/metrics/MetricNames;", "", "<init>", "()V", "CAPTURE_SESSION_STARTED", "", "CAPTURE_SESSION_COMPLETED", "CAPTURE_SESSION_FAILED", "CAPTURE_SESSION_DURATION_MS", "CAPTURE_SESSION_START_REASON_CLOUD_DIRECTIVE", "CAPTURE_SESSION_START_REASON_ON_DEVICE_INTELLIGENCE", "STATE_TRANSITION_FAILURE", "INVALID_STATE_TRANSITION", "FRAME_CAPTURED", "FRAME_DROPPED", "FRAME_READ_DURATION_MS", "DIRECTIVE_RECEIVED_START_CAPTURE", "DIRECTIVE_RECEIVED_STOP_CAPTURE", "DIRECTIVE_RECEIVED_PAUSE_CAPTURE", "DIRECTIVE_RECEIVED_RESUME_CAPTURE", "DIRECTIVE_RECEIVED_REQUEST_FRAMES", "DIRECTIVE_STATUS_START_CAPTURE", "DIRECTIVE_STATUS_STOP_CAPTURE", "DIRECTIVE_STATUS_PAUSE_CAPTURE", "DIRECTIVE_STATUS_RESUME_CAPTURE", "DIRECTIVE_STATUS_REQUEST_FRAMES", "ALEXA_EVENT_HANDOVER_CAPTURE_STARTED", "ALEXA_EVENT_HANDOVER_CAPTURE_STOPPED", "ALEXA_EVENT_HANDOVER_CAPTURE_PAUSED", "ALEXA_EVENT_HANDOVER_CAPTURE_RESUMED", "ALEXA_EVENT_HANDOVER_ENRICHMENTS_GENERATED", "ALEXA_EVENT_HANDOVER_FRAME_ADDONS_FINALIZED", "ALEXA_EVENT_HANDOVER_FRAME_DATA", "ALEXA_EVENT_HANDOVER_START_CAPTURE_FAILED", "ALEXA_EVENT_HANDOVER_RESUME_CAPTURE_FAILED", "ALEXA_EVENT_HANDOVER_REQUEST_FRAMES_FAILED", "ALEXA_EVENT_DELIVERED_CAPTURE_STARTED", "ALEXA_EVENT_DELIVERED_CAPTURE_STOPPED", "ALEXA_EVENT_DELIVERED_CAPTURE_PAUSED", "ALEXA_EVENT_DELIVERED_CAPTURE_RESUMED", "ALEXA_EVENT_DELIVERED_ENRICHMENTS_GENERATED", "ALEXA_EVENT_DELIVERED_FRAME_ADDONS_FINALIZED", "ALEXA_EVENT_DELIVERED_FRAME_DATA", "ALEXA_EVENT_DELIVERED_START_CAPTURE_FAILED", "ALEXA_EVENT_DELIVERED_RESUME_CAPTURE_FAILED", "ALEXA_EVENT_DELIVERED_REQUEST_FRAMES_FAILED", "ALEXA_EVENT_FRAME_DELIVERY_DURATION", "ALEXA_EVENT_ENRICHMENTS_DELIVERY_DURATION", "ENRICHMENT_PROCESSING", "OCR_TEXT_DETECTED", "FACE_DETECTED", "GESTURE_DETECTED", "OPTICAL_CODE_DETECTED", "FRAME_PARENT_CONTEXT_MISS", "ERROR_COUNT", "CAPTURE_START_FAILED", "CAPTURE_RESUME_FAILED", "REQUEST_FRAMES_FAILED", "CAPTURE_MODE_USAGE_DISCRETE", "CAPTURE_MODE_USAGE_CONTINUOUS", "CAPTURE_MODE_USAGE_METRICS", "", "getCAPTURE_MODE_USAGE_METRICS", "()Ljava/util/Map;", "PROVIDER_CONNECTION_DURATION_MS", "VIO_GATEWAY_FRAME_UPLOAD", "VIO_GATEWAY_FRAME_UPLOAD_DURATION_MS", "VIO_GATEWAY_FRAME_UPLOAD_RESULT", "VIO_GATEWAY_ENRICHMENTS_UPLOAD", "VIO_GATEWAY_ENRICHMENTS_UPLOAD_DURATION_MS", "VIO_GATEWAY_ENRICHMENTS_UPLOAD_RESULT", "VIO_GATEWAY_QUEUE_DEPTH", "VIO_GATEWAY_SESSION_MINT", "VIO_GATEWAY_SESSION_MINT_DURATION_MS", "VIO_GATEWAY_SESSION_MINT_RESULT", "SUBCOMPONENT_ORCHESTRATOR", "SUBCOMPONENT_CAPABILITY_AGENT", "SUBCOMPONENT_CONTROLLER_SERVICE", "SUBCOMPONENT_EVENT_SENDER", "SUBCOMPONENT_VIO_GATEWAY", "ALEXA_EVENT_HANDOVER_METRICS", "getALEXA_EVENT_HANDOVER_METRICS", "ALEXA_EVENT_DELIVERED_METRICS", "getALEXA_EVENT_DELIVERED_METRICS", "ALEXA_EVENT_DELIVERY_DURATION_METRICS", "getALEXA_EVENT_DELIVERY_DURATION_METRICS", "interface-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MetricNames {

    @NotNull
    public static final String CAPTURE_RESUME_FAILED = "capture_resume_failed_count";

    @NotNull
    public static final String CAPTURE_SESSION_COMPLETED = "capture_session_completed_count";

    @NotNull
    public static final String CAPTURE_SESSION_DURATION_MS = "capture_session_duration_ms";

    @NotNull
    public static final String CAPTURE_SESSION_FAILED = "capture_session_failed_count";

    @NotNull
    public static final String CAPTURE_SESSION_STARTED = "capture_session_started_count";

    @NotNull
    public static final String CAPTURE_SESSION_START_REASON_CLOUD_DIRECTIVE = "capture_session_start_reason.CloudDirective";

    @NotNull
    public static final String CAPTURE_SESSION_START_REASON_ON_DEVICE_INTELLIGENCE = "capture_session_start_reason.OnDeviceIntelligence";

    @NotNull
    public static final String CAPTURE_START_FAILED = "capture_start_failed_count";

    @NotNull
    public static final String DIRECTIVE_RECEIVED_PAUSE_CAPTURE = "directive_received.PauseCapture";

    @NotNull
    public static final String DIRECTIVE_RECEIVED_REQUEST_FRAMES = "directive_received.RequestFrames";

    @NotNull
    public static final String DIRECTIVE_RECEIVED_RESUME_CAPTURE = "directive_received.ResumeCapture";

    @NotNull
    public static final String DIRECTIVE_RECEIVED_START_CAPTURE = "directive_received.StartCapture";

    @NotNull
    public static final String DIRECTIVE_RECEIVED_STOP_CAPTURE = "directive_received.StopCapture";

    @NotNull
    public static final String DIRECTIVE_STATUS_PAUSE_CAPTURE = "directive_status.PauseCapture";

    @NotNull
    public static final String DIRECTIVE_STATUS_REQUEST_FRAMES = "directive_status.RequestFrames";

    @NotNull
    public static final String DIRECTIVE_STATUS_RESUME_CAPTURE = "directive_status.ResumeCapture";

    @NotNull
    public static final String DIRECTIVE_STATUS_START_CAPTURE = "directive_status.StartCapture";

    @NotNull
    public static final String DIRECTIVE_STATUS_STOP_CAPTURE = "directive_status.StopCapture";

    @NotNull
    public static final String ENRICHMENT_PROCESSING = "enrichment_processing_count";

    @NotNull
    public static final String ERROR_COUNT = "error_count";

    @NotNull
    public static final String FACE_DETECTED = "face_detected_count";

    @NotNull
    public static final String FRAME_CAPTURED = "frame_captured_count";

    @NotNull
    public static final String FRAME_DROPPED = "frame_dropped_count";

    @NotNull
    public static final String FRAME_PARENT_CONTEXT_MISS = "frame_parent_context_miss_count";

    @NotNull
    public static final String FRAME_READ_DURATION_MS = "frame_read_duration_ms";

    @NotNull
    public static final String GESTURE_DETECTED = "gesture_detected_count";

    @NotNull
    public static final String INVALID_STATE_TRANSITION = "invalid_state_transition_count";

    @NotNull
    public static final String OCR_TEXT_DETECTED = "ocr_text_detected_count";

    @NotNull
    public static final String OPTICAL_CODE_DETECTED = "optical_code_detected_count";

    @NotNull
    public static final String PROVIDER_CONNECTION_DURATION_MS = "provider_connection_duration_ms";

    @NotNull
    public static final String REQUEST_FRAMES_FAILED = "request_frames_failed_count";

    @NotNull
    public static final String STATE_TRANSITION_FAILURE = "state_transition_failure_count";

    @NotNull
    public static final String SUBCOMPONENT_CAPABILITY_AGENT = "RTVI_CapabilityAgent";

    @NotNull
    public static final String SUBCOMPONENT_CONTROLLER_SERVICE = "RTVI_ControllerService";

    @NotNull
    public static final String SUBCOMPONENT_EVENT_SENDER = "RTVI_AVS_EventSender";

    @NotNull
    public static final String SUBCOMPONENT_ORCHESTRATOR = "RTVI_Orchestrator";

    @NotNull
    public static final String SUBCOMPONENT_VIO_GATEWAY = "RTVI_VioGateway";

    @NotNull
    public static final String VIO_GATEWAY_ENRICHMENTS_UPLOAD = "vio_gateway_enrichments_upload";

    @NotNull
    public static final String VIO_GATEWAY_ENRICHMENTS_UPLOAD_DURATION_MS = "vio_gateway_enrichments_upload_duration_ms";

    @NotNull
    public static final String VIO_GATEWAY_ENRICHMENTS_UPLOAD_RESULT = "vio_gateway_enrichments_upload_result";

    @NotNull
    public static final String VIO_GATEWAY_FRAME_UPLOAD = "vio_gateway_frame_upload";

    @NotNull
    public static final String VIO_GATEWAY_FRAME_UPLOAD_DURATION_MS = "vio_gateway_frame_upload_duration_ms";

    @NotNull
    public static final String VIO_GATEWAY_FRAME_UPLOAD_RESULT = "vio_gateway_frame_upload_result";

    @NotNull
    public static final String VIO_GATEWAY_QUEUE_DEPTH = "vio_gateway_queue_depth";

    @NotNull
    public static final String VIO_GATEWAY_SESSION_MINT = "vio_gateway_session_mint";

    @NotNull
    public static final String VIO_GATEWAY_SESSION_MINT_DURATION_MS = "vio_gateway_session_mint_duration_ms";

    @NotNull
    public static final String VIO_GATEWAY_SESSION_MINT_RESULT = "vio_gateway_session_mint_result";

    @NotNull
    public static final MetricNames INSTANCE = new MetricNames();

    @NotNull
    public static final String CAPTURE_MODE_USAGE_DISCRETE = "capture_mode_usage.Discrete";

    @NotNull
    public static final String CAPTURE_MODE_USAGE_CONTINUOUS = "capture_mode_usage.Continuous";

    @NotNull
    private static final Map<String, String> CAPTURE_MODE_USAGE_METRICS = MapsKt.mapOf(TuplesKt.to("DISCRETE", CAPTURE_MODE_USAGE_DISCRETE), TuplesKt.to("CONTINUOUS", CAPTURE_MODE_USAGE_CONTINUOUS));

    @NotNull
    public static final String ALEXA_EVENT_HANDOVER_CAPTURE_STARTED = "alexa_event_handover.CaptureStarted";

    @NotNull
    public static final String ALEXA_EVENT_HANDOVER_CAPTURE_STOPPED = "alexa_event_handover.CaptureStopped";

    @NotNull
    public static final String ALEXA_EVENT_HANDOVER_CAPTURE_PAUSED = "alexa_event_handover.CapturePaused";

    @NotNull
    public static final String ALEXA_EVENT_HANDOVER_CAPTURE_RESUMED = "alexa_event_handover.CaptureResumed";

    @NotNull
    public static final String ALEXA_EVENT_HANDOVER_ENRICHMENTS_GENERATED = "alexa_event_handover.EnrichmentsGenerated";

    @NotNull
    public static final String ALEXA_EVENT_HANDOVER_FRAME_ADDONS_FINALIZED = "alexa_event_handover.FrameAddonsFinalized";

    @NotNull
    public static final String ALEXA_EVENT_HANDOVER_FRAME_DATA = "alexa_event_handover.FrameData";

    @NotNull
    public static final String ALEXA_EVENT_HANDOVER_START_CAPTURE_FAILED = "alexa_event_handover.StartCaptureFailed";

    @NotNull
    public static final String ALEXA_EVENT_HANDOVER_RESUME_CAPTURE_FAILED = "alexa_event_handover.ResumeCaptureFailed";

    @NotNull
    public static final String ALEXA_EVENT_HANDOVER_REQUEST_FRAMES_FAILED = "alexa_event_handover.RequestFramesFailed";

    @NotNull
    private static final Map<String, String> ALEXA_EVENT_HANDOVER_METRICS = MapsKt.mapOf(TuplesKt.to("CaptureStarted", ALEXA_EVENT_HANDOVER_CAPTURE_STARTED), TuplesKt.to("CaptureStopped", ALEXA_EVENT_HANDOVER_CAPTURE_STOPPED), TuplesKt.to("CapturePaused", ALEXA_EVENT_HANDOVER_CAPTURE_PAUSED), TuplesKt.to("CaptureResumed", ALEXA_EVENT_HANDOVER_CAPTURE_RESUMED), TuplesKt.to("EnrichmentsGenerated", ALEXA_EVENT_HANDOVER_ENRICHMENTS_GENERATED), TuplesKt.to("FrameAddonsFinalized", ALEXA_EVENT_HANDOVER_FRAME_ADDONS_FINALIZED), TuplesKt.to("FrameData", ALEXA_EVENT_HANDOVER_FRAME_DATA), TuplesKt.to("StartCaptureFailed", ALEXA_EVENT_HANDOVER_START_CAPTURE_FAILED), TuplesKt.to("ResumeCaptureFailed", ALEXA_EVENT_HANDOVER_RESUME_CAPTURE_FAILED), TuplesKt.to("RequestFramesFailed", ALEXA_EVENT_HANDOVER_REQUEST_FRAMES_FAILED));

    @NotNull
    public static final String ALEXA_EVENT_DELIVERED_CAPTURE_STARTED = "alexa_event_delivered.CaptureStarted";

    @NotNull
    public static final String ALEXA_EVENT_DELIVERED_CAPTURE_STOPPED = "alexa_event_delivered.CaptureStopped";

    @NotNull
    public static final String ALEXA_EVENT_DELIVERED_CAPTURE_PAUSED = "alexa_event_delivered.CapturePaused";

    @NotNull
    public static final String ALEXA_EVENT_DELIVERED_CAPTURE_RESUMED = "alexa_event_delivered.CaptureResumed";

    @NotNull
    public static final String ALEXA_EVENT_DELIVERED_ENRICHMENTS_GENERATED = "alexa_event_delivered.EnrichmentsGenerated";

    @NotNull
    public static final String ALEXA_EVENT_DELIVERED_FRAME_ADDONS_FINALIZED = "alexa_event_delivered.FrameAddonsFinalized";

    @NotNull
    public static final String ALEXA_EVENT_DELIVERED_FRAME_DATA = "alexa_event_delivered.FrameData";

    @NotNull
    public static final String ALEXA_EVENT_DELIVERED_START_CAPTURE_FAILED = "alexa_event_delivered.StartCaptureFailed";

    @NotNull
    public static final String ALEXA_EVENT_DELIVERED_RESUME_CAPTURE_FAILED = "alexa_event_delivered.ResumeCaptureFailed";

    @NotNull
    public static final String ALEXA_EVENT_DELIVERED_REQUEST_FRAMES_FAILED = "alexa_event_delivered.RequestFramesFailed";

    @NotNull
    private static final Map<String, String> ALEXA_EVENT_DELIVERED_METRICS = MapsKt.mapOf(TuplesKt.to("CaptureStarted", ALEXA_EVENT_DELIVERED_CAPTURE_STARTED), TuplesKt.to("CaptureStopped", ALEXA_EVENT_DELIVERED_CAPTURE_STOPPED), TuplesKt.to("CapturePaused", ALEXA_EVENT_DELIVERED_CAPTURE_PAUSED), TuplesKt.to("CaptureResumed", ALEXA_EVENT_DELIVERED_CAPTURE_RESUMED), TuplesKt.to("EnrichmentsGenerated", ALEXA_EVENT_DELIVERED_ENRICHMENTS_GENERATED), TuplesKt.to("FrameAddonsFinalized", ALEXA_EVENT_DELIVERED_FRAME_ADDONS_FINALIZED), TuplesKt.to("FrameData", ALEXA_EVENT_DELIVERED_FRAME_DATA), TuplesKt.to("StartCaptureFailed", ALEXA_EVENT_DELIVERED_START_CAPTURE_FAILED), TuplesKt.to("ResumeCaptureFailed", ALEXA_EVENT_DELIVERED_RESUME_CAPTURE_FAILED), TuplesKt.to("RequestFramesFailed", ALEXA_EVENT_DELIVERED_REQUEST_FRAMES_FAILED));

    @NotNull
    public static final String ALEXA_EVENT_FRAME_DELIVERY_DURATION = "alexa_event_frame_delivery_duration_ms";

    @NotNull
    public static final String ALEXA_EVENT_ENRICHMENTS_DELIVERY_DURATION = "alexa_event_enrichments_delivery_duration_ms";

    @NotNull
    private static final Map<String, String> ALEXA_EVENT_DELIVERY_DURATION_METRICS = MapsKt.mapOf(TuplesKt.to("FrameData", ALEXA_EVENT_FRAME_DELIVERY_DURATION), TuplesKt.to("EnrichmentsGenerated", ALEXA_EVENT_ENRICHMENTS_DELIVERY_DURATION));

    private MetricNames() {
    }

    @NotNull
    public final Map<String, String> getALEXA_EVENT_DELIVERED_METRICS() {
        return ALEXA_EVENT_DELIVERED_METRICS;
    }

    @NotNull
    public final Map<String, String> getALEXA_EVENT_DELIVERY_DURATION_METRICS() {
        return ALEXA_EVENT_DELIVERY_DURATION_METRICS;
    }

    @NotNull
    public final Map<String, String> getALEXA_EVENT_HANDOVER_METRICS() {
        return ALEXA_EVENT_HANDOVER_METRICS;
    }

    @NotNull
    public final Map<String, String> getCAPTURE_MODE_USAGE_METRICS() {
        return CAPTURE_MODE_USAGE_METRICS;
    }
}
