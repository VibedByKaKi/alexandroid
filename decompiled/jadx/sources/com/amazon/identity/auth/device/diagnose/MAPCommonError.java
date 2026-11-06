package com.amazon.identity.auth.device.diagnose;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum MAPCommonError {
    PandaForbiddenError("MAP can't register the account because your device type is not on-boarded with PandaService, please file a on-board SIM with us.", "https://w.amazon.com/index.php/IdentityServices/PandaService/Onboarding"),
    SSLHandshakeException("MAP received a SSLHandShakeException while making https connection. It is usually caused by:", "1. Your device's clock is not set correctly, which may cause SSL handshake fail.", "2. The server's certificate is not issued by a root CA trusted by the device's trust store.", "3. Your device is connected to an http proxy that intercepts TLS connections.", "4. Your connection is under Man-In-The-Middle attack.", "5. If you are using AuthenticatedURLConnection to call devo endpoints, you need to switch MAP to devo mode.", "See https://w.amazon.com/index.php/IdentityServices/Mobile/DevoPreprodProdSwitch/UserGuide"),
    DevoProdSwitchError("Please make sure you strictly follow our guidance before you do a devo/pre-prod/prod switch,", "most problems are caused by missing one or more steps during switching.", "Check https://w.amazon.com/index.php/IdentityServices/Mobile/DevoPreprodProdSwitch/UserGuide for detail"),
    DeviceFulfillmentError("Please make sure your device is fulfilled on DMS.", "At least one of the UserData is missing"),
    MetricsComponentMissingError("Your application is not integrated with metrics component or the component version is too old. ", "Please refer to https://tiny.amazon.com/yrtuflld/wamazbinviewMobiPlatMetr3rdp to consume correct metrics component. ", "This is a hard requirement since MAP version: https://w.amazon.com/bin/view/IdentityServices/Mobile/MAP/Integ-Release/02-13-2018/", "MOBI team will not give operation support if your app does not integrate metric component."),
    DCMIntegrationError("You application integrate with metrics component in a wrong way."),
    FeatureDeprecatedWarning("This is just a WARNING! You are using a deprecated API, please migrate and move away from this API!"),
    MinervaIntegrationError("Improper integration of Minerva metrics component.");

    public String mAdditionalContextLog;
    public List<String> mLogLines;

    MAPCommonError(String... strArr) {
        this.mLogLines = Arrays.asList(strArr);
    }

    public MAPCommonError addContextLog(String str) {
        this.mAdditionalContextLog = str;
        return this;
    }
}
