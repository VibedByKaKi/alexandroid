package com.amazon.alexa.accessory.repositories.fitness;

import com.amazon.alexa.accessory.protocol.Fitness;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface FitnessProvider {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface OnFailureListener {
        void onFailure();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface OnSuccessListener {
        void onSuccess();
    }

    void onFitnessDataAvailable(OnSuccessListener onSuccessListener);

    void onLiveFitnessData(Fitness.LiveFitnessData liveFitnessData, OnSuccessListener onSuccessListener);

    void onStopLiveFitnessData(Fitness.StopLiveFitnessData stopLiveFitnessData, OnSuccessListener onSuccessListener);

    void onSyncFitnessSession(FitnessSession fitnessSession, OnSuccessListener onSuccessListener, OnFailureListener onFailureListener);
}
