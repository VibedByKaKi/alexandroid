package com.amazon.alexa.voice.ui.onedesign.util;

import com.amazon.alexa.voice.ui.onedesign.bottomsheet.BottomSheetInteractor;
import com.amazon.alexa.voice.ui.onedesign.bottomsheetcards.BottomSheetCardsInteractor;
import com.amazon.alexa.voice.ui.onedesign.bottomsheetcontainer.BottomSheetContainerInteractor;
import com.amazon.alexa.voice.ui.onedesign.scrim.ScrimInteractor;
import com.amazon.alexa.voice.ui.speech.AttentionSystemContract;
import com.amazon.alexa.voice.ui.util.AlexaStateProperty;
import com.amazon.alexa.voice.ui.util.BaseProperty;
import com.amazon.alexa.voice.ui.util.BooleanProperty;
import com.amazon.alexa.voice.ui.util.FloatProperty;
import io.reactivex.rxjava3.core.ObservableEmitter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class Properties$$ExternalSyntheticLambda0 implements BaseProperty.OnChangedListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ Properties$$ExternalSyntheticLambda0(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // com.amazon.alexa.voice.ui.util.BaseProperty.OnChangedListener
    public final void onPropertyChanged() {
        switch (this.$r8$classId) {
            case 0:
                Properties.lambda$toObservable$3((BooleanProperty) this.f$0, (ObservableEmitter) this.f$1);
                break;
            case 1:
                ((BottomSheetInteractor) this.f$0).lambda$new$0((AttentionSystemContract) this.f$1);
                break;
            case 2:
                ((BottomSheetCardsInteractor) this.f$0).lambda$new$0((AttentionSystemContract) this.f$1);
                break;
            case 3:
                ((BottomSheetContainerInteractor) this.f$0).lambda$new$0((AttentionSystemContract) this.f$1);
                break;
            case 4:
                ((ScrimInteractor) this.f$0).lambda$new$0((AttentionSystemContract) this.f$1);
                break;
            case 5:
                Properties.lambda$toObservable$6((AlexaStateProperty) this.f$0, (ObservableEmitter) this.f$1);
                break;
            default:
                Properties.lambda$toObservable$0((FloatProperty) this.f$0, (ObservableEmitter) this.f$1);
                break;
        }
    }
}
