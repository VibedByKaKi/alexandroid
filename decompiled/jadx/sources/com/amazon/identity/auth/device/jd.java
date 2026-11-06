package com.amazon.identity.auth.device;

import com.amazon.identity.mobi.common.javascript.JavaScriptBridgeCommon;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class jd implements JavaScriptBridgeCommon.FunctionEvaluator {
    @Override // com.amazon.identity.mobi.common.javascript.JavaScriptBridgeCommon.FunctionEvaluator
    public final boolean shouldFunctionReturnBoolean(String str) {
        return "isUserVerifyingPlatformAuthenticatorAvailable".equals(str) || "isAuthenticatorCredentialAvailable".equals(str);
    }
}
