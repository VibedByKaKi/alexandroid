package com.amazon.alexa.voice.ui.onedesign.bottomsheetcontainer;

import android.content.DialogInterface;
import androidx.annotation.FloatRange;
import com.amazon.alexa.voice.ui.util.AlexaState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import io.reactivex.rxjava3.core.Observable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface BottomSheetContainerContract {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Interactor {
        Observable<AlexaState> alexaState();

        void cleanup();

        void close();

        Observable<Float> getSoundLevel();

        Observable<Boolean> onAlexaStateModified();

        boolean onBackPressed();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Mediator {
        void cleanup();

        void close();

        boolean onBackPressed();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Presenter {
        void bottomSheetDialogShown();

        void collapse();

        void onBackPressed();

        void start();

        void stop();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface View {
        void dismissBottomSheet();

        void hideChromeView();

        void setBottomSheetState(int i);

        void setCancelDialogOnTouchOutside(DialogInterface.OnCancelListener onCancelListener);

        void setChromeLevel(@FloatRange(from = 0.0d, to = 1.0d) float f);

        void setChromeLocked(boolean z);

        void setCollapseBottomSheetOnDragdown(BottomSheetBehavior.BottomSheetCallback bottomSheetCallback);

        void setFitToContents(boolean z);

        void setHideable(boolean z);

        void setOnBackPressedListener();

        void setToFullScreen();

        void showChromeView();
    }
}
