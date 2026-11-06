package com.amazon.alexa.growth.coachmark;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface TourCoachMarkListener {
    void onComplete();

    void onNext();

    default void onDismiss() {
    }
}
