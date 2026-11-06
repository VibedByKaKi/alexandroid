package com.bugsnag.android;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/bugsnag/android/Delivery;", "", "deliver", "Lcom/bugsnag/android/DeliveryStatus;", "payload", "Lcom/bugsnag/android/EventPayload;", "deliveryParams", "Lcom/bugsnag/android/DeliveryParams;", "Lcom/bugsnag/android/Session;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public interface Delivery {
    @NotNull
    DeliveryStatus deliver(@NotNull EventPayload payload, @NotNull DeliveryParams deliveryParams);

    @NotNull
    DeliveryStatus deliver(@NotNull Session payload, @NotNull DeliveryParams deliveryParams);
}
