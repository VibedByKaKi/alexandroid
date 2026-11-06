package com.amazon.alexa.voice.ui.ra;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface RaConversationHostViewProvider {
    @Nullable
    View createConversationHostView(@NonNull Activity activity, @Nullable Bundle bundle, @NonNull OnDismissCallback onDismissCallback);

    @Nullable
    default RaUiOptions normalizeNewIntentOptions(@Nullable RaUiOptions raUiOptions) {
        return raUiOptions;
    }
}
