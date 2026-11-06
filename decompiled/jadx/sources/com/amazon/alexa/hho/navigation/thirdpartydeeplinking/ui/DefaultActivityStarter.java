package com.amazon.alexa.hho.navigation.thirdpartydeeplinking.ui;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final class DefaultActivityStarter implements ActivityStarter {
    private final Context context;

    public DefaultActivityStarter(@NonNull Context context) {
        Objects.requireNonNull(context);
        this.context = context;
    }

    @Override // com.amazon.alexa.hho.navigation.thirdpartydeeplinking.ui.ActivityStarter
    public void startActivity(@Nullable Intent intent) {
        if (intent != null) {
            this.context.startActivity(intent);
        }
    }
}
