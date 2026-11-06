package com.amazon.dee.app.services.metrics;

import io.ktor.client.utils.CacheControl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/amazon/dee/app/services/metrics/InfraConstants;", "", "<init>", "()V", "SP_RN_BRIDGE_LOAD", "", "BRIDGE_INIT_TILL_ELEMENTS_READY", "BRIDGE_INIT_TILL_BUNDLE_INITIALIZED", "APP_START_TILL_ELEMENTS_INIT", "APP_START_TILL_ELEMENTS_READY", "ACTIVITY_START_TILL_CREATE_REACT_CONTEXT_START", "STATIC_ROUTE_REGISTRATIONS", "APP_START_TILL_STATIC_ROUTES_REGISTERED", InfraConstants.RN_LOAD_TO_RENDER, InfraConstants.CATALYST_LOADED, InfraConstants.VOICE_INITIALIZED, InfraConstants.ON_CREATE_FINISHED, InfraConstants.VIEW_MODEL_STARTED, InfraConstants.REACT_BRIDGE_READY, InfraConstants.COMPONENTS_INJECTED, InfraConstants.REACT_NATIVE_LIB_INIT, InfraConstants.APPLICATION_INITIALIZATION, InfraConstants.APP_STARTUP, InfraConstants.WHEN_READY_END, InfraConstants.WHEN_READY_START, InfraConstants.REACT_BRIDGE_FINISH, InfraConstants.REACT_BRIDGE_START, CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InfraConstants {

    @NotNull
    public static final String ACTIVITY_START_TILL_CREATE_REACT_CONTEXT_START = "activityStart:createReactContextStart";

    @NotNull
    public static final String APPLICATION_INITIALIZATION = "APPLICATION_INITIALIZATION";

    @NotNull
    public static final String APP_STARTUP = "APP_STARTUP";

    @NotNull
    public static final String APP_START_TILL_ELEMENTS_INIT = "appStart:ElementsInit";

    @NotNull
    public static final String APP_START_TILL_ELEMENTS_READY = "appStart:ElementsReady";

    @NotNull
    public static final String APP_START_TILL_STATIC_ROUTES_REGISTERED = "appStart:StaticRoutesRegistered";

    @NotNull
    public static final String BRIDGE_INIT_TILL_BUNDLE_INITIALIZED = "bridgeInit:BundleInitialized";

    @NotNull
    public static final String BRIDGE_INIT_TILL_ELEMENTS_READY = "bridgeInit:ElementsReady";

    @NotNull
    public static final String CATALYST_LOADED = "CATALYST_LOADED";

    @NotNull
    public static final String COMPONENTS_INJECTED = "COMPONENTS_INJECTED";

    @NotNull
    public static final InfraConstants INSTANCE = new InfraConstants();

    @NotNull
    public static final String ON_CREATE_FINISHED = "ON_CREATE_FINISHED";

    @NotNull
    public static final String REACT_BRIDGE_FINISH = "REACT_BRIDGE_FINISH";

    @NotNull
    public static final String REACT_BRIDGE_READY = "REACT_BRIDGE_READY";

    @NotNull
    public static final String REACT_BRIDGE_START = "REACT_BRIDGE_START";

    @NotNull
    public static final String REACT_NATIVE_LIB_INIT = "REACT_NATIVE_LIB_INIT";

    @NotNull
    public static final String RN_LOAD_TO_RENDER = "RN_LOAD_TO_RENDER";

    @NotNull
    public static final String SP_RN_BRIDGE_LOAD = "iRNBridgeLoad";

    @NotNull
    public static final String STATIC_ROUTE_REGISTRATIONS = "staticRoutesRegistration";

    @NotNull
    public static final String VIEW_MODEL_STARTED = "VIEW_MODEL_STARTED";

    @NotNull
    public static final String VOICE_INITIALIZED = "VOICE_INITIALIZED";

    @NotNull
    public static final String WHEN_READY_END = "WHEN_READY_END";

    @NotNull
    public static final String WHEN_READY_START = "WHEN_READY_START";

    private InfraConstants() {
    }
}
