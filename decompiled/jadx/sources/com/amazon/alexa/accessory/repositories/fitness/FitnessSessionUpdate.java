package com.amazon.alexa.accessory.repositories.fitness;

import com.amazon.alexa.accessory.internal.util.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class FitnessSessionUpdate {
    private final FitnessSession fitnessSession;
    private final OnUpdateProcessedListener onUpdateProcessedListener;
    private final Origin origin;
    private boolean updateProcessed;
    private final Object[] updateProcessedLock;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface OnUpdateProcessedListener {
        void onFailure(Throwable th);

        void onSuccess();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Origin {
        ACCESSORY,
        APPLICATION
    }

    public FitnessSessionUpdate(Origin origin, FitnessSession fitnessSession, OnUpdateProcessedListener onUpdateProcessedListener) {
        Preconditions.notNull(origin, "origin");
        Preconditions.notNull(fitnessSession, "fitnessSession");
        Preconditions.notNull(onUpdateProcessedListener, "onUpdateProcessedListener");
        this.origin = origin;
        this.fitnessSession = fitnessSession;
        this.onUpdateProcessedListener = onUpdateProcessedListener;
        this.updateProcessedLock = new Object[0];
    }

    public FitnessSession getFitnessSession() {
        return this.fitnessSession;
    }

    public Origin getOrigin() {
        return this.origin;
    }

    public boolean isMarked() {
        boolean z;
        synchronized (this.updateProcessedLock) {
            z = this.updateProcessed;
        }
        return z;
    }

    public void markFailed(Throwable th) {
        synchronized (this.updateProcessedLock) {
            try {
                if (!this.updateProcessed) {
                    this.updateProcessed = true;
                    this.onUpdateProcessedListener.onFailure(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void markSuccessful() {
        synchronized (this.updateProcessedLock) {
            try {
                if (!this.updateProcessed) {
                    this.updateProcessed = true;
                    this.onUpdateProcessedListener.onSuccess();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
