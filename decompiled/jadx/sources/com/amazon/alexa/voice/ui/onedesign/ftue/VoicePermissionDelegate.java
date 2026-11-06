package com.amazon.alexa.voice.ui.onedesign.ftue;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class VoicePermissionDelegate implements PermissionsDelegate {
    private final Context context;

    public VoicePermissionDelegate(Context context) {
        this.context = context;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.PermissionsDelegate
    public boolean hasPermission(@NonNull String str) {
        return ContextCompat.checkSelfPermission(this.context, str) == 0;
    }
}
