package com.amazon.alexa.voice.ui.tta;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface TtaNavigator {
    void navigateInApp(@NonNull Context context, @NonNull String str, @Nullable Map<String, String> map);

    void navigateToExternalUrl(@NonNull Context context, @NonNull String str);

    void openVoiceScrim(@NonNull Context context);
}
