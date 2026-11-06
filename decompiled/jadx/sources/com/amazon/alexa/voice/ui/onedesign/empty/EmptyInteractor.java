package com.amazon.alexa.voice.ui.onedesign.empty;

import android.util.Log;
import com.amazon.alexa.voice.ui.onedesign.empty.EmptyContract;
import com.amazon.alexa.voice.ui.onedesign.list.ListType;
import com.amazon.alexa.voice.ui.routing.Destination;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class EmptyInteractor implements EmptyContract.Interactor {
    private static final String TAG = "EmptyInteractor";
    private final EmptyCard card;
    private final EmptyContract.Mediator mediator;

    public EmptyInteractor(EmptyCard emptyCard, EmptyContract.Mediator mediator) {
        this.card = emptyCard;
        this.mediator = mediator;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.empty.EmptyContract.Interactor
    public void close() {
        this.mediator.close();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.empty.EmptyContract.Interactor
    public void dismiss() {
        this.mediator.dismiss();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.empty.EmptyContract.Interactor
    public EmptyCard getCard() {
        return this.card;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.empty.EmptyContract.Interactor
    public void navigateToManageDestination() {
        String manageButtonDestination = this.card.getManageButtonDestination();
        if (manageButtonDestination == null) {
            Log.e(TAG, "navigateToManageDestination was called but manageButtonDestination is null");
            return;
        }
        boolean equals = manageButtonDestination.equals(Destination.LISTS);
        EmptyContract.Mediator mediator = this.mediator;
        if (equals) {
            mediator.navigateToList(ListType.from(this.card.getType()));
        } else {
            mediator.navigateTo(manageButtonDestination);
        }
    }
}
