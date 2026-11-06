package com.google.android.gms.home.matter.settings;

import android.content.IntentSender;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public interface SettingsClient extends HasApiKey<zza>, OptionalModuleApi {
    @NonNull
    @RequiresApi(27)
    Task<IntentSender> getDeviceListIntent();
}
