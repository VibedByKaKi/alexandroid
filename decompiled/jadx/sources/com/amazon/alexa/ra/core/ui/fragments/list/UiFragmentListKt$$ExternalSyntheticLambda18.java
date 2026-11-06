package com.amazon.alexa.ra.core.ui.fragments.list;

import androidx.compose.runtime.State;
import com.amazon.alexa.ra.core.data.fragments.FragmentData;
import com.amazon.alexa.ra.core.ui.enums.PaginationDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class UiFragmentListKt$$ExternalSyntheticLambda18 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ State f$1;

    public /* synthetic */ UiFragmentListKt$$ExternalSyntheticLambda18(Function1 function1, State state, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit FragmentLists_S3D76Zc$lambda$77$lambda$76;
        Unit AlexaResponseFragment_XDr8ryQ$lambda$71$lambda$70$lambda$65$lambda$64;
        Unit AlexaResponseFragment_XDr8ryQ$lambda$71$lambda$70$lambda$69$lambda$68;
        switch (this.$r8$classId) {
            case 0:
                FragmentLists_S3D76Zc$lambda$77$lambda$76 = UiFragmentListKt.FragmentLists_S3D76Zc$lambda$77$lambda$76(this.f$0, this.f$1, (PaginationDirection) obj);
                return FragmentLists_S3D76Zc$lambda$77$lambda$76;
            case 1:
                AlexaResponseFragment_XDr8ryQ$lambda$71$lambda$70$lambda$65$lambda$64 = AlexaResponseFragmentKt.AlexaResponseFragment_XDr8ryQ$lambda$71$lambda$70$lambda$65$lambda$64(this.f$0, this.f$1, (FragmentData) obj);
                return AlexaResponseFragment_XDr8ryQ$lambda$71$lambda$70$lambda$65$lambda$64;
            default:
                AlexaResponseFragment_XDr8ryQ$lambda$71$lambda$70$lambda$69$lambda$68 = AlexaResponseFragmentKt.AlexaResponseFragment_XDr8ryQ$lambda$71$lambda$70$lambda$69$lambda$68(this.f$0, this.f$1, (FragmentData) obj);
                return AlexaResponseFragment_XDr8ryQ$lambda$71$lambda$70$lambda$69$lambda$68;
        }
    }
}
