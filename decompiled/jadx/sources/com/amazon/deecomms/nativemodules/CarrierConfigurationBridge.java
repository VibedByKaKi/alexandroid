package com.amazon.deecomms.nativemodules;

import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CarrierConfigurationBridge extends ReactContextBaseJavaModule {
    public static final String MODULE_NAME = "CarrierConfigurationBridge";

    public CarrierConfigurationBridge(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private String getMobileCountryCodeAndMobileNetworkCode() {
        TelephonyManager telephonyManager = getTelephonyManager();
        if (telephonyManager != null) {
            return telephonyManager.getSimOperator();
        }
        return null;
    }

    private TelephonyManager getTelephonyManager() {
        return (TelephonyManager) getReactApplicationContext().getApplicationContext().getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r1.equals("") != false) goto L6;
     */
    @com.facebook.react.bridge.ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void getIsoCountryCode(com.facebook.react.bridge.Promise r2) {
        /*
            r1 = this;
            android.telephony.TelephonyManager r1 = r1.getTelephonyManager()
            if (r1 == 0) goto L12
            java.lang.String r1 = r1.getSimCountryIso()
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
        L12:
            r1 = 0
        L13:
            r2.resolve(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.deecomms.nativemodules.CarrierConfigurationBridge.getIsoCountryCode(com.facebook.react.bridge.Promise):void");
    }

    @ReactMethod
    public void getMobileCountryCode(Promise promise) {
        String mobileCountryCodeAndMobileNetworkCode = getMobileCountryCodeAndMobileNetworkCode();
        promise.resolve((mobileCountryCodeAndMobileNetworkCode == null || mobileCountryCodeAndMobileNetworkCode.length() <= 2) ? null : mobileCountryCodeAndMobileNetworkCode.substring(0, 3));
    }

    @ReactMethod
    public void getMobileNetworkCode(Promise promise) {
        String mobileCountryCodeAndMobileNetworkCode = getMobileCountryCodeAndMobileNetworkCode();
        promise.resolve((mobileCountryCodeAndMobileNetworkCode == null || mobileCountryCodeAndMobileNetworkCode.length() <= 3) ? null : mobileCountryCodeAndMobileNetworkCode.substring(3));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CarrierConfigurationBridge";
    }
}
