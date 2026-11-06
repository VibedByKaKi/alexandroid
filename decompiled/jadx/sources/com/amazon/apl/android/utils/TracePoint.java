package com.amazon.apl.android.utils;

import com.amazon.alexa.voice.tta.Constants;
import com.amazon.apl.android.providers.ITelemetryProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum TracePoint {
    APL_CONTROLLER_RENDER_DOCUMENT("APLController", ITelemetryProvider.RENDER_DOCUMENT),
    ROOT_CONTEXT_CREATE("RootContext", "create"),
    TEXT_MEASURE("TextMeasure", "measure"),
    APL_LAYOUT_INFLATE_COMPONENT_HIERARCHY("APLLayout", "inflateComponentHierarchy"),
    APL_LAYOUT_ON_LAYOUT("APLLayout", "onLayout"),
    APL_LAYOUT_ON_LAYOUT_FOR("APLLayout", "onLayout.for"),
    ROOT_CONTEXT_DO_FRAME("RootContext", "doFrame"),
    ROOT_CONTEXT_UPDATE_TIME("RootContext", "updateTime"),
    ROOT_CONTEXT_CLEAR_PENDING("RootContext", "clearPending"),
    ROOT_CONTEXT_HANDLE_DIRTY_PROPERTIES("RootContext", "handleDirtyProperties"),
    ROOT_CONTEXT_HANDLE_EVENTS("RootContext", "handleEvents"),
    ROOT_CONTEXT_AUDIOPLAYER_TIMEUPDATE("RootContext", "audioPlayerOnTimeUpdate"),
    ROOT_CONTEXT_NOTIFY_VISUAL_CONTEXT("RootContext", "notifyVisualContext"),
    ROOT_CONTEXT_NOTIFY_DATA_SOURCE_CONTEXT("RootContext", "notifyDataSourceContext"),
    ROOT_CONTEXT_NEW_VIEWHOST_TICK("RootContext", "newViewhostTick"),
    ROOT_CONTEXT_ON_COMPONENT_CHANGE("RootContext", "onComponentChange"),
    COMPONENT_REQUEST_LAYOUT("Component", "requestLayout"),
    COMPONENT_ON_CHILDREN_CHANGED("Component", "onChildrenChanged"),
    TEXT_APPLY_LAYOUT(Constants.Namespaces.TEXT, "applyLayout"),
    IMAGE_INIT_IMAGE_LOAD("Image", "initImageLoad"),
    ROOT_CONTEXT_RE_INFLATE("RootContext", "reinflate"),
    APL_LAYOUT_HANDLE_TOUCH("APLLayout", "handleTouch"),
    APL_LAYOUT_HANDLE_CONFIGURATION_CHANGE("APLLayout", "handleConfigurationChange");

    private final String mClassName;
    private final String mMethodName;

    TracePoint(String str, String str2) {
        this.mClassName = str;
        this.mMethodName = str2;
    }

    public String getClassName() {
        return this.mClassName;
    }

    public String getMethodName() {
        return this.mMethodName;
    }
}
