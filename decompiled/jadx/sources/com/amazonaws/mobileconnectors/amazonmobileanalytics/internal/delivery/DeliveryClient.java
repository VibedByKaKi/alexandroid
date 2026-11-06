package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event.EventObserver;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event.InternalEvent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public interface DeliveryClient extends EventObserver {
    void attemptDelivery();

    void enqueueEventForDelivery(InternalEvent internalEvent);
}
