package com.amazon.alexa.voice.handsfree.settings.providers;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.protocols.wakewordsettings.connection.WakeWordServiceConnectionProviderContract;
import com.amazon.alexa.handsfree.protocols.wakewordsettings.connection.WakeWordSettingsServiceConnection;
import com.amazon.alexa.handsfree.protocols.wakewordsettings.connection.WakeWordSettingsServiceStateCallback;
import com.amazon.alexa.handsfree.vendor.bridge.VendorAPIWrapper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class WakeWordServiceConnectionProvider implements WakeWordServiceConnectionProviderContract {
    private static final String TAG = "WakeWordServiceConnectionProvider";
    private VendorAPIWrapper mVendorAPIWrapper;

    public WakeWordServiceConnectionProvider(@NonNull VendorAPIWrapper vendorAPIWrapper) {
        this.mVendorAPIWrapper = vendorAPIWrapper;
    }

    @Override // com.amazon.alexa.handsfree.protocols.wakewordsettings.connection.WakeWordServiceConnectionProviderContract
    public WakeWordSettingsServiceConnection getWakeWordSettingsServiceConnection(@NonNull WakeWordSettingsServiceStateCallback wakeWordSettingsServiceStateCallback, @NonNull Context context) {
        return this.mVendorAPIWrapper.getWakeWordSettingsServiceConnection(wakeWordSettingsServiceStateCallback, context);
    }
}
