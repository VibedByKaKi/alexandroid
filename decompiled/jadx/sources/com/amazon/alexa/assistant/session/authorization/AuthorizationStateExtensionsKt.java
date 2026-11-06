package com.amazon.alexa.assistant.session.authorization;

import com.amazon.alexa.assistant.authorization.AuthorizationState;
import com.amazon.alexa.assistant.toolkit.session.model.AuthorizationSessionState;
import com.amazon.alexa.assistant.toolkit.session.model.AuthorizationSessionUser;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toAuthorizationSessionState", "Lcom/amazon/alexa/assistant/toolkit/session/model/AuthorizationSessionState;", "Lcom/amazon/alexa/assistant/authorization/AuthorizationState;", "session_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AuthorizationStateExtensionsKt {
    @NotNull
    public static final AuthorizationSessionState toAuthorizationSessionState(@NotNull AuthorizationState authorizationState) {
        authorizationState.getClass();
        if (!(authorizationState instanceof AuthorizationState.SignedIn)) {
            if (authorizationState instanceof AuthorizationState.SignedOut) {
                return AuthorizationSessionState.SignedOut.INSTANCE;
            }
            PathKt$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        AuthorizationState.SignedIn signedIn = (AuthorizationState.SignedIn) authorizationState;
        if (signedIn.getUser().getToken() == null || signedIn.getUser().getDeviceSerialNumber() == null || signedIn.getUser().getDeviceType() == null) {
            return AuthorizationSessionState.SignedOut.INSTANCE;
        }
        String userId = signedIn.getUser().getUserId();
        String token = signedIn.getUser().getToken();
        if (token == null) {
            token = "";
        }
        String deviceSerialNumber = signedIn.getUser().getDeviceSerialNumber();
        if (deviceSerialNumber == null) {
            deviceSerialNumber = "";
        }
        String deviceType = signedIn.getUser().getDeviceType();
        return new AuthorizationSessionState.SignedIn(new AuthorizationSessionUser(userId, token, deviceSerialNumber, deviceType != null ? deviceType : ""));
    }
}
