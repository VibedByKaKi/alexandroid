package com.amazon.comms.calling.data.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/amazon/comms/calling/data/util/PCCConstants;", "", "<init>", "()V", "PHONE_CALL_CONTROLLER_NAMESPACE", "", "PHONE_CALL_CONTROLLER_CONTEXT_STATE_NAME", "CAPABILITY_INTERFACE_VERSION", "PHONE_CALL_CONTROLLER_CONNECTION_STATE_KEY", "PHONE_CALL_CONTROLLER_CONFIGURATION_KEY", "PHONE_CALL_CONTROLLER_CALLING_FEATURE_KEY", "PHONE_CALL_CONTROLLER_CALLING_FEATURE_PRESENT_VALUE", "PHONE_CALL_CONTROLLER_CALLING_FEATURE_ABSENT_VALUE", "PHONE_CALL_CONTROLLER_CALL_ID", "PHONE_CALL_CONTROLLER_CODE_KEY", "PHONE_CALL_CONTROLLER_STATE_CONNECTED", "PHONE_CALL_CONTROLLER_STATE_DISCONNECTED", "DIAL_DIRECTIVE", "STOP_DIRECTIVE", "ACCEPT_DIRECTIVE", "DIAL_DIRCTIVE_CALLEE_KEY", "DIAL_DIRCTIVE_ADDRESS_VALUE_KEY", "PCC_NO_CALL_PERMISSION_ERROR_CODE", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class PCCConstants {

    @NotNull
    public static final String ACCEPT_DIRECTIVE = "Answer";

    @NotNull
    public static final String CAPABILITY_INTERFACE_VERSION = "2.0";

    @NotNull
    public static final String DIAL_DIRCTIVE_ADDRESS_VALUE_KEY = "value";

    @NotNull
    public static final String DIAL_DIRCTIVE_CALLEE_KEY = "callee";

    @NotNull
    public static final String DIAL_DIRECTIVE = "Dial";

    @NotNull
    public static final PCCConstants INSTANCE = new PCCConstants();

    @NotNull
    public static final String PCC_NO_CALL_PERMISSION_ERROR_CODE = "NO_CALL_PERMISSION";

    @NotNull
    public static final String PHONE_CALL_CONTROLLER_CALLING_FEATURE_ABSENT_VALUE = "false";

    @NotNull
    public static final String PHONE_CALL_CONTROLLER_CALLING_FEATURE_KEY = "callingFeature";

    @NotNull
    public static final String PHONE_CALL_CONTROLLER_CALLING_FEATURE_PRESENT_VALUE = "true";

    @NotNull
    public static final String PHONE_CALL_CONTROLLER_CALL_ID = "callId";

    @NotNull
    public static final String PHONE_CALL_CONTROLLER_CODE_KEY = "code";

    @NotNull
    public static final String PHONE_CALL_CONTROLLER_CONFIGURATION_KEY = "configuration";

    @NotNull
    public static final String PHONE_CALL_CONTROLLER_CONNECTION_STATE_KEY = "connectionState";

    @NotNull
    public static final String PHONE_CALL_CONTROLLER_CONTEXT_STATE_NAME = "PhoneCallControllerState";

    @NotNull
    public static final String PHONE_CALL_CONTROLLER_NAMESPACE = "Alexa.Comms.PhoneCallController";

    @NotNull
    public static final String PHONE_CALL_CONTROLLER_STATE_CONNECTED = "CONNECTED";

    @NotNull
    public static final String PHONE_CALL_CONTROLLER_STATE_DISCONNECTED = "DISCONNECTED";

    @NotNull
    public static final String STOP_DIRECTIVE = "Stop";

    private PCCConstants() {
    }
}
