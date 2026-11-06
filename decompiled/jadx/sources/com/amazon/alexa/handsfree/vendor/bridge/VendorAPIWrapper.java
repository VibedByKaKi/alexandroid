package com.amazon.alexa.handsfree.vendor.bridge;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.api.UVRContract;
import com.amazon.alexa.handsfree.protocols.wakewordsettings.connection.WakeWordSettingsServiceConnection;
import com.amazon.alexa.handsfree.protocols.wakewordsettings.connection.WakeWordSettingsServiceStateCallback;
import com.amazon.alexa.handsfree.settings.contract.SettingsContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface VendorAPIWrapper {
    @NonNull
    Intent getAudioProviderServiceIntent(Context context);

    @NonNull
    Intent getPermissionIntent();

    @NonNull
    SettingsContract getSettingsContract();

    @NonNull
    UVRContract getUVRContract(@NonNull Context context);

    @NonNull
    WakeWordSettingsServiceConnection getWakeWordSettingsServiceConnection(WakeWordSettingsServiceStateCallback wakeWordSettingsServiceStateCallback, Context context);
}
