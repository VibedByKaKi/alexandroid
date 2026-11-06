package com.amazon.alexa.voice.ui.onedesign.ftue.bottomsheet;

import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetUIBehavior;
import com.amazon.alexa.voice.ui.onedesign.ftue.bottomsheet.FtueBottomSheetContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class FtueBottomSheetPresenter implements FtueBottomSheetContract.Presenter {
    private static final String TAG = "FtueBottomSheetPresenter";
    private final BottomSheetUIBehavior behavior = new BottomSheetUIBehavior(false, true, true);
    private final FtueBottomSheetContract.Interactor interactor;
    private final FtueBottomSheetContract.View view;

    public FtueBottomSheetPresenter(@NonNull FtueBottomSheetContract.Interactor interactor, @NonNull FtueBottomSheetContract.View view) {
        this.interactor = interactor;
        this.view = view;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.bottomsheet.FtueBottomSheetContract.Presenter
    public void bottomSheetCanceled() {
        this.interactor.close();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.bottomsheet.FtueBottomSheetContract.Presenter
    public void bottomSheetStateChanged(int i) {
        if (i == 5 || i == 4) {
            this.interactor.close();
        }
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.bottomsheet.FtueBottomSheetContract.Presenter
    public void start() {
        this.view.showBottomSheet(this.behavior);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.bottomsheet.FtueBottomSheetContract.Presenter
    public void stop() {
        this.view.dismissBottomSheet();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.bottomsheet.FtueBottomSheetContract.Presenter
    public void updateBottomSheetBehavior() {
        if (this.behavior.isFullScreen()) {
            this.view.setFullScreenHeight();
        }
        this.view.setCancelFlowOnCancelDialog();
        this.view.setCancelFlowOnDragDown();
    }
}
