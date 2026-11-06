package com.amazon.alexa.ra.core.viewmodel;

import com.amazon.alexa.ra.core.data.fragments.FragmentData;
import com.amazon.alexa.ra.core.data.model.PermissionState;
import com.amazon.alexa.ra.core.data.model.SuggestionPillTextData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class RaConversationViewModel$$ExternalSyntheticLambda9 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RaConversationViewModel f$0;

    public /* synthetic */ RaConversationViewModel$$ExternalSyntheticLambda9(RaConversationViewModel raConversationViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = raConversationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PermissionState _init_$lambda$10;
        Unit _init_$lambda$12;
        Unit _init_$lambda$13;
        SuggestionPillTextData suggestionPillTextData$lambda$22;
        Unit handleFragmentInteraction$lambda$43;
        switch (this.$r8$classId) {
            case 0:
                _init_$lambda$10 = RaConversationViewModel._init_$lambda$10(this.f$0, (String) obj);
                return _init_$lambda$10;
            case 1:
                _init_$lambda$12 = RaConversationViewModel._init_$lambda$12(this.f$0, ((Boolean) obj).booleanValue());
                return _init_$lambda$12;
            case 2:
                _init_$lambda$13 = RaConversationViewModel._init_$lambda$13(this.f$0, (FragmentData) obj);
                return _init_$lambda$13;
            case 3:
                suggestionPillTextData$lambda$22 = RaConversationViewModel.getSuggestionPillTextData$lambda$22(this.f$0, (FragmentData) obj);
                return suggestionPillTextData$lambda$22;
            default:
                handleFragmentInteraction$lambda$43 = RaConversationViewModel.handleFragmentInteraction$lambda$43(this.f$0, ((Boolean) obj).booleanValue());
                return handleFragmentInteraction$lambda$43;
        }
    }
}
