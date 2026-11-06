package com.amazon.alexa.voice.ui.onedesign.ftue.bottomsheet;

import com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetUIBehavior;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface FtueBottomSheetContract {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Interactor {
        void close();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Mediator {
        void close();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Presenter {
        void bottomSheetCanceled();

        void bottomSheetStateChanged(int i);

        void start();

        void stop();

        void updateBottomSheetBehavior();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface View {
        void dismissBottomSheet();

        void setCancelFlowOnCancelDialog();

        void setCancelFlowOnDragDown();

        void setFullScreenHeight();

        void showBottomSheet(BottomSheetUIBehavior bottomSheetUIBehavior);
    }
}
