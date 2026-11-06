package com.amazon.alexa.mobilytics.event.userinteraction;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.mobilytics.event.MobilyticsEvent;
import com.amazon.alexa.mobilytics.event.userinteraction.interactionDetails.InteractionDetails;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface MobilyticsUserInteractionEvent extends MobilyticsEvent {
    @Nullable
    InteractionDetails getInteractionDetails();

    String getInteractionType();

    @Nullable
    String getRefMarker();

    void setInteractionDetails(@NonNull InteractionDetails interactionDetails);

    void setRefMarker(@NonNull String str);
}
