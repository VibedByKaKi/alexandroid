package com.amazon.alexa.voice.ui.ra;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface RaConversationPlugin {
    void applyIngressionToActiveSession(@NonNull String str, @Nullable Map<String, String> map);

    @NonNull
    View createConversationView(@NonNull Context context, @NonNull RaUiOptions raUiOptions, @NonNull RaConversationDisplayMode raConversationDisplayMode, @Nullable OnDismissCallback onDismissCallback);

    void openConversationView(@NonNull Activity activity, @Nullable Bundle bundle, @Nullable OnDismissCallback onDismissCallback);

    void openConversationView(@NonNull Activity activity, @NonNull RaUiOptions raUiOptions, @Nullable OnDismissCallback onDismissCallback);

    default boolean openConversationWhenHostReady(@NonNull Context context, @Nullable Bundle bundle) {
        return false;
    }

    default void cancelPendingHostOpens() {
    }
}
