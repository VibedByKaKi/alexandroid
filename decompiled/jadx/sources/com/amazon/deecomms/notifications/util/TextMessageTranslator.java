package com.amazon.deecomms.notifications.util;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class TextMessageTranslator {
    private final Context context;

    public TextMessageTranslator(@NonNull Context context) {
        this.context = context;
    }

    @NonNull
    public String translate(@NonNull String str, @NonNull String str2) {
        int identifier = this.context.getResources().getIdentifier(str, TypedValues.Custom.S_STRING, this.context.getPackageName());
        return identifier == 0 ? str2 : this.context.getResources().getString(identifier);
    }
}
