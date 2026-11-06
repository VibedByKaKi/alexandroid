package com.amazon.apl.devtools.enums;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum CommandMethod {
    EMPTY(""),
    TARGET_GET_TARGETS(TARGET_GET_TARGETS_TEXT),
    TARGET_ATTACH_TO_TARGET(TARGET_ATTACH_TO_TARGET_TEXT),
    TARGET_DETACH_FROM_TARGET(TARGET_DETACH_FROM_TARGET_TEXT),
    VIEW_SET_DOCUMENT(VIEW_SET_DOCUMENT_TEXT),
    VIEW_CAPTURE_IMAGE(VIEW_CAPTURE_IMAGE_TEXT),
    VIEW_EXECUTE_COMMANDS(VIEW_EXECUTE_COMMANDS_TEXT),
    VIEW_UPDATE_DATASOURCE(VIEW_UPDATE_DATASOURCE_TEXT),
    LIVE_DATA_UPDATE(LIVE_DATA_UPDATE_TEXT),
    PERFORMANCE_GET_METRICS(PERFORMANCE_GET_METRICS_TEXT),
    PERFORMANCE_ENABLE(PERFORMANCE_ENABLE_TEXT),
    PERFORMANCE_DISABLE(PERFORMANCE_DISABLE_TEXT),
    MEMORY_GET_MEMORY(MEMORY_GET_MEMORY_TEXT),
    FRAMEMETRICS_RECORD(FRAMEMETRICS_RECORD_TEXT),
    FRAMEMETRICS_STOP(FRAMEMETRICS_STOP_TEXT),
    SESSION_RECORDER_RECORD(SESSION_RECORDER_RECORD_TEXT),
    SESSION_RECORDER_STOP(SESSION_RECORDER_STOP_TEXT),
    SESSION_RECORDER_REPLAY(SESSION_RECORDER_REPLAY_TEXT),
    FRAMEMETRICS_ENABLE(FRAMEMETRICS_ENABLE_TEXT),
    FRAMEMETRICS_DISABLE(FRAMEMETRICS_DISABLE_TEXT),
    LOG_ENABLE(LOG_ENABLE_TEXT),
    LOG_DISABLE(LOG_DISABLE_TEXT),
    LOG_CLEAR(LOG_CLEAR_TEXT),
    DOCUMENT_GET_MAIN_PACKAGE(DOCUMENT_GET_MAIN_PACKAGE_TEXT),
    DOCUMENT_GET_PACKAGE_LIST(DOCUMENT_GET_PACKAGE_LIST_TEXT),
    DOCUMENT_GET_PACKAGE(DOCUMENT_GET_PACKAGE_TEXT),
    DOCUMENT_GET_VISUAL_CONTEXT(DOCUMENT_GET_VISUAL_CONTEXT_TEXT),
    DOCUMENT_GET_DOM(DOCUMENT_GET_DOM_TEXT),
    DOCUMENT_GET_SCENE_GRAPH(DOCUMENT_GET_SCENE_GRAPH_TEXT),
    DOCUMENT_GET_ROOT_CONTEXT(DOCUMENT_GET_ROOT_CONTEXT_TEXT),
    DOCUMENT_GET_CONTEXT(DOCUMENT_GET_CONTEXT_TEXT),
    DOCUMENT_HIGHLIGHT_COMPONENT(DOCUMENT_HIGHLIGHT_COMPONENT_TEXT),
    DOCUMENT_HIDE_HIGHLIGHT(DOCUMENT_HIDE_HIGHLIGHT_TEXT),
    INPUT_TOUCH(INPUT_TOUCH_TEXT),
    INPUT_CANCEL(INPUT_CANCEL_TEXT),
    NETWORK_ENABLE(NETWORK_ENABLE_TEXT),
    NETWORK_DISABLE(NETWORK_DISABLE_TEXT),
    SYSTEM_INFO_GET_APPLICATION_PROCESSOR_USAGE(SYSTEM_INFO_GET_APPLICATION_PROCESSOR_USAGE_TEXT),
    SYSTEM_INFO_GET_ENVIRONMENT_PROCESSOR_USAGE(SYSTEM_INFO_GET_ENVIRONMENT_PROCESSOR_USAGE_TEXT),
    SYSTEM_INFO_GET_ENVIRONMENT_MEMORY(SYSTEM_INFO_GET_ENVIRONMENT_MEMORY_TEXT);

    private static final String DOCUMENT_GET_CONTEXT_TEXT = "Document.getContext";
    private static final String DOCUMENT_GET_DOM_TEXT = "Document.getDOM";
    private static final String DOCUMENT_GET_MAIN_PACKAGE_TEXT = "Document.getMainPackage";
    private static final String DOCUMENT_GET_PACKAGE_LIST_TEXT = "Document.getPackageList";
    private static final String DOCUMENT_GET_PACKAGE_TEXT = "Document.getPackage";
    private static final String DOCUMENT_GET_ROOT_CONTEXT_TEXT = "Document.getRootContext";
    private static final String DOCUMENT_GET_SCENE_GRAPH_TEXT = "Document.getSceneGraph";
    private static final String DOCUMENT_GET_VISUAL_CONTEXT_TEXT = "Document.getVisualContext";
    private static final String DOCUMENT_HIDE_HIGHLIGHT_TEXT = "Document.hideHighlight";
    private static final String DOCUMENT_HIGHLIGHT_COMPONENT_TEXT = "Document.highlightComponent";
    private static final String FRAMEMETRICS_DISABLE_TEXT = "FrameMetrics.disable";
    private static final String FRAMEMETRICS_ENABLE_TEXT = "FrameMetrics.enable";
    private static final String FRAMEMETRICS_RECORD_TEXT = "FrameMetrics.record";
    private static final String FRAMEMETRICS_STOP_TEXT = "FrameMetrics.stop";
    private static final String INPUT_CANCEL_TEXT = "Input.cancel";
    private static final String INPUT_TOUCH_TEXT = "Input.touch";
    private static final String LIVE_DATA_UPDATE_TEXT = "LiveData.update";
    private static final String LOG_CLEAR_TEXT = "Log.clear";
    private static final String LOG_DISABLE_TEXT = "Log.disable";
    private static final String LOG_ENABLE_TEXT = "Log.enable";
    private static final String MEMORY_GET_MEMORY_TEXT = "Memory.getMemory";
    private static final String NETWORK_DISABLE_TEXT = "Network.disable";
    private static final String NETWORK_ENABLE_TEXT = "Network.enable";
    private static final String PERFORMANCE_DISABLE_TEXT = "Performance.disable";
    private static final String PERFORMANCE_ENABLE_TEXT = "Performance.enable";
    private static final String PERFORMANCE_GET_METRICS_TEXT = "Performance.getMetrics";
    private static final String SESSION_RECORDER_RECORD_TEXT = "SessionRecorder.record";
    private static final String SESSION_RECORDER_REPLAY_TEXT = "SessionRecorder.replay";
    private static final String SESSION_RECORDER_STOP_TEXT = "SessionRecorder.stop";
    private static final String SYSTEM_INFO_GET_APPLICATION_PROCESSOR_USAGE_TEXT = "SystemInfo.getApplicationProcessorUsage";
    private static final String SYSTEM_INFO_GET_ENVIRONMENT_MEMORY_TEXT = "SystemInfo.getEnvironmentMemory";
    private static final String SYSTEM_INFO_GET_ENVIRONMENT_PROCESSOR_USAGE_TEXT = "SystemInfo.getEnvironmentProcessorUsage";
    private static final String TARGET_ATTACH_TO_TARGET_TEXT = "Target.attachToTarget";
    private static final String TARGET_DETACH_FROM_TARGET_TEXT = "Target.detachFromTarget";
    private static final String TARGET_GET_TARGETS_TEXT = "Target.getTargets";
    private static final String VIEW_CAPTURE_IMAGE_TEXT = "View.captureImage";
    private static final String VIEW_EXECUTE_COMMANDS_TEXT = "View.executeCommands";
    private static final String VIEW_SET_DOCUMENT_TEXT = "View.setDocument";
    private static final String VIEW_UPDATE_DATASOURCE_TEXT = "View.updateDataSource";
    private final String mCommandMethodText;

    CommandMethod(String str) {
        this.mCommandMethodText = str;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.mCommandMethodText;
    }
}
