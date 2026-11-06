package com.amazon.alexa.handsfree.devices.utils;

import android.content.Context;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ResourceFilesLoader {
    @NonNull
    public String[] getStringArrayResource(@NonNull Context context, @NonNull int i) {
        return context.getResources().getStringArray(i);
    }

    @NonNull
    public String getStringResource(@NonNull Context context, @NonNull int i) {
        return context.getResources().getString(i);
    }
}
