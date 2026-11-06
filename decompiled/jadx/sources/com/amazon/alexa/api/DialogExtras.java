package com.amazon.alexa.api;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.api.AlexaDialogExtras;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class DialogExtras extends AlexaDialogExtras {
    public static final AlexaDialogExtras DEFAULT = AlexaDialogExtras.builder().build();

    public DialogExtras(@Nullable Bundle bundle) {
        super(bundle);
    }

    public static AlexaDialogExtras.Builder getBuilder(@NonNull AlexaDialogExtras alexaDialogExtras) {
        return AlexaDialogExtras.getBuilder(alexaDialogExtras);
    }
}
