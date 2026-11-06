package com.swmansion.worklets;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import androidx.annotation.OptIn;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.common.annotations.FrameworkAPI;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class JSCallInvokerResolver {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    @OptIn(markerClass = {FrameworkAPI.class})
    public static CallInvokerHolderImpl getJSCallInvokerHolder(ReactApplicationContext reactApplicationContext) {
        try {
            try {
                return (CallInvokerHolderImpl) reactApplicationContext.getClass().getMethod("getJSCallInvokerHolder", null).invoke(reactApplicationContext, null);
            } catch (Exception e) {
                OnnxMap$$ExternalSyntheticBUOutline0.m("Failed to get JSCallInvokerHolder", e);
                return null;
            }
        } catch (Exception unused) {
            Object invoke = reactApplicationContext.getClass().getMethod("getCatalystInstance", null).invoke(reactApplicationContext, null);
            return (CallInvokerHolderImpl) invoke.getClass().getMethod("getJSCallInvokerHolder", null).invoke(invoke, null);
        }
    }
}
