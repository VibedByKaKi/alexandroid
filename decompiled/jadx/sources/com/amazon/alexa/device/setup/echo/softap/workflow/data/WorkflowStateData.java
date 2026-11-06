package com.amazon.alexa.device.setup.echo.softap.workflow.data;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.device.setup.echo.softap.thrift.exception.AuthorizeLinkCodeException;
import com.amazon.alexa.device.setup.echo.softap.thrift.exception.CompleteSetupException;
import com.amazon.alexa.device.setup.echo.softap.thrift.exception.ConnectToAPException;
import com.amazon.alexa.device.setup.echo.softap.thrift.exception.EvaluateCaptivePortalException;
import com.amazon.alexa.device.setup.echo.softap.thrift.exception.GetDeviceDetailsException;
import com.amazon.alexa.device.setup.echo.softap.thrift.exception.GetLinkCodeException;
import com.amazon.alexa.device.setup.echo.softap.thrift.exception.GetOtaDetailsException;
import com.amazon.alexa.device.setup.echo.softap.thrift.exception.IncorrectPasswordException;
import com.amazon.alexa.device.setup.echo.softap.thrift.exception.SetLocaleAndEndpointsException;
import com.amazon.alexa.device.setup.echo.softap.thrift.exception.VerifyAlexaConnectionException;
import com.amazon.alexa.device.setup.echo.softap.thrift.exception.VerifyDeviceRegistrationException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class WorkflowStateData<T> {
    public String errorMethodName;
    public String state;
    public T workflowData;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum State {
        ERROR,
        NOT_CONNECTED,
        CONNECTED,
        START_PROVISIONING,
        SET_LOCALE_AND_ENDPOINT,
        GET_SCAN_LIST,
        GET_DEVICE_DETAILS,
        CONNECT_TO_AP,
        CONNECT_TO_AP_INCORRECT_PASSWORD,
        CONNECT_TO_AP_HOT_SPOT,
        GET_LINK_CODE,
        AUTHORIZE_LINK_CODE,
        REGISTER_DEVICE,
        VERIFY_DEVICE_REGISTRATION,
        GET_OTA_DETAILS,
        VERIFY_ALEXA_SERVICE_CONNECTION,
        COMPLETE_SETUP,
        PROVISIONING_COMPLETE,
        EVALUATE_CAPTIVE_PORTAL,
        NETWORK_BOUND
    }

    public WorkflowStateData(Throwable th, State state) {
        this.workflowData = (T) th.getMessage();
        this.state = state.toString();
        if (th instanceof ConnectToAPException) {
            this.errorMethodName = State.CONNECT_TO_AP.toString();
            return;
        }
        if (th instanceof CompleteSetupException) {
            this.errorMethodName = State.COMPLETE_SETUP.toString();
            return;
        }
        if (th instanceof EvaluateCaptivePortalException) {
            this.errorMethodName = State.EVALUATE_CAPTIVE_PORTAL.toString();
            return;
        }
        if (th instanceof GetDeviceDetailsException) {
            this.errorMethodName = State.GET_DEVICE_DETAILS.toString();
            return;
        }
        if (th instanceof GetLinkCodeException) {
            this.errorMethodName = State.GET_LINK_CODE.toString();
            return;
        }
        if (th instanceof GetOtaDetailsException) {
            this.errorMethodName = State.GET_OTA_DETAILS.toString();
            return;
        }
        if (th instanceof SetLocaleAndEndpointsException) {
            this.errorMethodName = State.SET_LOCALE_AND_ENDPOINT.toString();
            return;
        }
        if (th instanceof VerifyAlexaConnectionException) {
            this.errorMethodName = State.VERIFY_ALEXA_SERVICE_CONNECTION.toString();
            return;
        }
        if (th instanceof VerifyDeviceRegistrationException) {
            this.errorMethodName = State.VERIFY_DEVICE_REGISTRATION.toString();
        } else if (th instanceof AuthorizeLinkCodeException) {
            this.errorMethodName = State.AUTHORIZE_LINK_CODE.toString();
        } else if (th instanceof IncorrectPasswordException) {
            this.errorMethodName = State.CONNECT_TO_AP_INCORRECT_PASSWORD.toString();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WorkflowStateData: { State: ");
        sb.append(this.state);
        sb.append(", workflowData: ");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, " }", this.workflowData);
    }

    public WorkflowStateData(T t, State state) {
        this.workflowData = t;
        this.state = state.toString();
    }
}
