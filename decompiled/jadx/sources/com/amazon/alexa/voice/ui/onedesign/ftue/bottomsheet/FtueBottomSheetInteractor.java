package com.amazon.alexa.voice.ui.onedesign.ftue.bottomsheet;

import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.onedesign.ftue.bottomsheet.FtueBottomSheetContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class FtueBottomSheetInteractor implements FtueBottomSheetContract.Interactor {
    private final FtueBottomSheetContract.Mediator mediator;

    public FtueBottomSheetInteractor(@NonNull FtueBottomSheetContract.Mediator mediator) {
        this.mediator = mediator;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.bottomsheet.FtueBottomSheetContract.Interactor
    public void close() {
        this.mediator.close();
    }
}
