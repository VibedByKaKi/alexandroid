package com.amazon.dee.app.ui.web;

import android.app.Activity;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class WifiBridge extends JavaScriptBridge {
    private static final String KEY_AUTO_NETWORK_SWITCH_SETTING_LABEL_NAME = "autoNetworkSwitchSettingLabelName";
    private static final String KEY_IS_AUTO_NETWORK_SWITCH_ENABLED = "isAutoNetworkSwitchEnabled";
    private static final String KEY_SSID = "ssid";
    private static final String KEY_TIMEOUT = "timeout";
    private Map<String, JavaScriptBridgeMethod> mMethods;

    public WifiBridge(Activity activity, JavaScriptInjector javaScriptInjector, JavaScriptResponseQueue javaScriptResponseQueue) {
        super(javaScriptInjector, javaScriptResponseQueue);
        this.mMethods = new HashMap();
    }

    @Override // com.amazon.dee.app.ui.web.JavaScriptBridge
    public Map<String, JavaScriptBridgeMethod> getExposedMethods() {
        return this.mMethods;
    }

    @Override // com.amazon.dee.app.ui.web.JavaScriptBridge
    public final String getJavaScriptInterfaceName() {
        return "WifiBridge";
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
    }
}
