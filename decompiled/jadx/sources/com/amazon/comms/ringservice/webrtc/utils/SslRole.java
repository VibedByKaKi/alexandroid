package com.amazon.comms.ringservice.webrtc.utils;

import com.amazon.comms.log.CommsLogger;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.common.base.Strings;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum SslRole {
    CLIENT,
    SERVER,
    UNKNOWN;

    private static final CommsLogger log = CommsLogger.getLogger(SslRole.class);

    public static SslRole getLocalSslRole(boolean z, String str, String str2) {
        log.i("getLocalSslRole: localDTLSRole " + str + " remoteDTLSRole " + str2);
        return (Strings.isNullOrEmpty(str) || Strings.isNullOrEmpty(str2)) ? UNKNOWN : z ? AppStateModule.APP_STATE_ACTIVE.equals(str2) ? SERVER : CLIENT : "passive".equals(str) ? SERVER : CLIENT;
    }
}
