package com.amazon.alexa.client.alexaservice.eventing.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class ConnectivityErrorEvent extends Event.NotGated {
    public static ConnectivityErrorEvent create(boolean z, boolean z2, boolean z3, @Nullable DialogRequestIdentifier dialogRequestIdentifier) {
        return new AutoValue_ConnectivityErrorEvent(z, z2, z3, dialogRequestIdentifier);
    }

    @Nullable
    public abstract DialogRequestIdentifier getDialogRequestIdentifier();

    public abstract boolean getIsActiveNetworkTooSlow();

    public abstract boolean getIsNetworkTransition();

    public abstract boolean isTextDialog();
}
