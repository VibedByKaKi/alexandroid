package com.amazon.deecomms.nativemodules;

import android.telephony.TelephonyManager;
import androidx.annotation.Nullable;
import androidx.autofill.HintConstants;
import com.amazon.alexa.elements.turbomodules.carrierconfigurationbridge.CarrierConfigurationBridgeAPI;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CarrierConfigurationBridgeDelegate implements CarrierConfigurationBridgeAPI {
    public static final String MODULE_NAME = "CarrierConfigurationBridge";

    @Nullable
    private ReactApplicationContext reactContext;

    private String getMobileCountryCodeAndMobileNetworkCode() {
        TelephonyManager telephonyManager = getTelephonyManager();
        if (telephonyManager != null) {
            return telephonyManager.getSimOperator();
        }
        return null;
    }

    private TelephonyManager getTelephonyManager() {
        ReactApplicationContext reactApplicationContext = this.reactContext;
        if (reactApplicationContext == null) {
            return null;
        }
        return (TelephonyManager) reactApplicationContext.getApplicationContext().getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) != false) goto L6;
     */
    @Override // com.amazon.alexa.elements.turbomodules.carrierconfigurationbridge.CarrierConfigurationBridgeAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void getIsoCountryCode(com.facebook.react.bridge.Promise r2) {
        /*
            r1 = this;
            android.telephony.TelephonyManager r1 = r1.getTelephonyManager()
            if (r1 == 0) goto L10
            java.lang.String r1 = r1.getSimCountryIso()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L11
        L10:
            r1 = 0
        L11:
            r2.resolve(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.deecomms.nativemodules.CarrierConfigurationBridgeDelegate.getIsoCountryCode(com.facebook.react.bridge.Promise):void");
    }

    @Override // com.amazon.alexa.elements.turbomodules.carrierconfigurationbridge.CarrierConfigurationBridgeAPI
    public void getMobileCountryCode(Promise promise) {
        String mobileCountryCodeAndMobileNetworkCode = getMobileCountryCodeAndMobileNetworkCode();
        promise.resolve((mobileCountryCodeAndMobileNetworkCode == null || mobileCountryCodeAndMobileNetworkCode.length() <= 2) ? null : mobileCountryCodeAndMobileNetworkCode.substring(0, 3));
    }

    @Override // com.amazon.alexa.elements.turbomodules.carrierconfigurationbridge.CarrierConfigurationBridgeAPI
    public void getMobileNetworkCode(Promise promise) {
        String mobileCountryCodeAndMobileNetworkCode = getMobileCountryCodeAndMobileNetworkCode();
        promise.resolve((mobileCountryCodeAndMobileNetworkCode == null || mobileCountryCodeAndMobileNetworkCode.length() <= 3) ? null : mobileCountryCodeAndMobileNetworkCode.substring(3));
    }

    @Override // com.amazon.alexa.elements.turbomodules.carrierconfigurationbridge.CarrierConfigurationBridgeAPI
    public void setReactContext(@Nullable ReactApplicationContext reactApplicationContext) {
        this.reactContext = reactApplicationContext;
    }
}
