package com.amazon.alexa.accessoryclient.common.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/util/MetricsConstants;", "", "()V", "Companion", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class MetricsConstants {

    @NotNull
    public static final String CLIENT_CONNECTION = "AccessoryClientConnection";

    @NotNull
    public static final String CLIENT_CONNECTION_ACKED_WITHIN_60_SECONDS = "connectionAckedWithinSixtySeconds";

    @NotNull
    public static final String CLIENT_CONNECTION_BINDING_FAILED = "bindingFailed";

    @NotNull
    public static final String CLIENT_CONNECTION_ON_BINDING_DIED = "onBindingDied";

    @NotNull
    public static final String CLIENT_CONNECTION_ON_NULL_BINDING = "onNullBinding";

    @NotNull
    public static final String CLIENT_CONNECTION_ON_SERVICE_DISCONNECTED = "onServiceDisconnected";

    @NotNull
    public static final String CLIENT_CONNECTION_RECONNECT_ATTEMPT = "reconnectAttempt";

    @NotNull
    public static final String CLIENT_CONNECTION_REQUEST = "connectionRequested";

    @NotNull
    public static final String CLIENT_CONNECTION_REQUEST_DISCONNECT = "disconnectRequested";

    @NotNull
    public static final String CLIENT_CONNECTION_SUCCESS = "connectionSuccess";

    @NotNull
    public static final String CLIENT_CONNECTION_UNBINDING_DISCONNECT_FAILED = "unbindingFailedDisconnect";

    @NotNull
    public static final String CLIENT_CONNECTION_UNBINDING_RECONNECT_FAILED = "unbindingFailedReconnect";

    @NotNull
    public static final String CLIENT_CONNECTION_UNEXPECTEDLY_DISCONNECTED_WITHIN_60_SECONDS = "connectionUnexpectedlyDisconnectedWithinSixtySeconds";

    @NotNull
    public static final String CLIENT_CONNECTION_UNSUPPORTED_VERSION = "clientVersionUnsupported";

    @NotNull
    public static final String CLIENT_OUTPUT_STREAM = "AccessoryClientOutputStream";

    @NotNull
    public static final String CLIENT_OUTPUT_STREAM_INITIALIZE_EXCEPTION = "outputStreamInitializationException";

    @NotNull
    public static final String CLIENT_OUTPUT_STREAM_WRITE_EXCEPTION = "outputStreamWriteException";

    @NotNull
    public static final String COMPONENT_NAME = "alexa_accessories";

    @NotNull
    public static final String SERVICE_CONNECTION = "AccessoryServiceConnection";

    @NotNull
    public static final String SERVICE_CONNECTION_DISCONNECT = "disconnectRequested";

    @NotNull
    public static final String SERVICE_CONNECTION_FAILED = "serviceConnectionFailed";

    @NotNull
    public static final String SERVICE_CONNECTION_INITIALIZE = "serviceConnectionInitialize";

    @NotNull
    public static final String SERVICE_CONNECTION_UNSUPPORTED_CLIENT = "clientVersionUnsupported";
}
