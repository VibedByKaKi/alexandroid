package com.amazon.alexa.assistant.transport;

import com.amazon.alexa.assistant.toolkit.session.model.AuthorizationSessionState;
import com.amazon.alexa.assistant.toolkit.session.model.AuthorizationSessionUser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002¨\u0006\u0005"}, d2 = {"holdsTokenOtherThan", "", "Lcom/amazon/alexa/assistant/toolkit/session/model/AuthorizationSessionState;", "rejected", "", "transport_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DefaultTransportClientKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean holdsTokenOtherThan(AuthorizationSessionState authorizationSessionState, String str) {
        AuthorizationSessionUser user;
        String str2 = null;
        AuthorizationSessionState.SignedIn signedIn = authorizationSessionState instanceof AuthorizationSessionState.SignedIn ? (AuthorizationSessionState.SignedIn) authorizationSessionState : null;
        if (signedIn != null && (user = signedIn.getUser()) != null) {
            str2 = user.getToken();
        }
        return (str2 == null || str2.length() == 0 || Intrinsics.areEqual(str2, str)) ? false : true;
    }
}
