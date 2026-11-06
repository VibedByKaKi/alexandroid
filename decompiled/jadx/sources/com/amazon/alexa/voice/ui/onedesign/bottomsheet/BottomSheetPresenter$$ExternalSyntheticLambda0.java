package com.amazon.alexa.voice.ui.onedesign.bottomsheet;

import com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.ConversationBubbleItem;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.TextInputStyleType;
import com.amazon.alexa.voice.ui.util.AlexaState;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class BottomSheetPresenter$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BottomSheetPresenter f$0;

    public /* synthetic */ BottomSheetPresenter$$ExternalSyntheticLambda0(BottomSheetPresenter bottomSheetPresenter, int i) {
        this.$r8$classId = i;
        this.f$0 = bottomSheetPresenter;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        BottomSheetPresenter bottomSheetPresenter = this.f$0;
        switch (i) {
            case 0:
                bottomSheetPresenter.lambda$start$0((Float) obj);
                break;
            case 1:
                bottomSheetPresenter.lambda$start$10((String) obj);
                break;
            case 2:
                bottomSheetPresenter.lambda$handleInAppSearchMetricDisposables$17((Boolean) obj);
                break;
            case 3:
                bottomSheetPresenter.lambda$handleInAppSearchMetricDisposables$18((Boolean) obj);
                break;
            case 4:
                bottomSheetPresenter.lambda$handleInAppSearchMetricDisposables$19((Boolean) obj);
                break;
            case 5:
                bottomSheetPresenter.lambda$start$11((ConversationBubbleItem) obj);
                break;
            case 6:
                bottomSheetPresenter.lambda$handleAutoSuggestionsDisposables$20((CharSequence) obj);
                break;
            case 7:
                bottomSheetPresenter.lambda$handleAutoSuggestionsDisposables$22((List) obj);
                break;
            case 8:
                bottomSheetPresenter.fadeSuggestionsView((Boolean) obj);
                break;
            case 9:
                bottomSheetPresenter.lambda$start$2((Boolean) obj);
                break;
            case 10:
                bottomSheetPresenter.lambda$start$3((Boolean) obj);
                break;
            case 11:
                bottomSheetPresenter.lambda$start$6((AlexaState) obj);
                break;
            case 12:
                bottomSheetPresenter.lambda$start$7((List) obj);
                break;
            case 13:
                bottomSheetPresenter.updateTextInputStyle((TextInputStyleType) obj);
                break;
            default:
                bottomSheetPresenter.lambda$start$9((String) obj);
                break;
        }
    }
}
