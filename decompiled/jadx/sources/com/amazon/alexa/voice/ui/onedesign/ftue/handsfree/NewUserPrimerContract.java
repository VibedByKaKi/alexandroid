package com.amazon.alexa.voice.ui.onedesign.ftue.handsfree;

import com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.HandsfreePrimerContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface NewUserPrimerContract extends HandsfreePrimerContract {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Interactor extends HandsfreePrimerContract.Interactor {
        void permissionsResultReceived();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Presenter extends HandsfreePrimerContract.Presenter {
        void permissionsResultReceived();

        void showAlert();
    }
}
