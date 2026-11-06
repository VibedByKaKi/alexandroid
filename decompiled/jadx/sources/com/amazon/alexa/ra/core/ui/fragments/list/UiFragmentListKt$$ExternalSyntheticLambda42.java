package com.amazon.alexa.ra.core.ui.fragments.list;

import androidx.compose.runtime.State;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class UiFragmentListKt$$ExternalSyntheticLambda42 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ State f$0;

    public /* synthetic */ UiFragmentListKt$$ExternalSyntheticLambda42(State state, int i) {
        this.$r8$classId = i;
        this.f$0 = state;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit FragmentLists_S3D76Zc$lambda$69$lambda$68$lambda$66;
        List access$CardRevealTimers$lambda$24;
        int access$CardRevealTimers$lambda$25;
        boolean invokeSuspend$lambda$0;
        int invokeSuspend$lambda$02;
        int i = this.$r8$classId;
        State state = this.f$0;
        switch (i) {
            case 0:
                FragmentLists_S3D76Zc$lambda$69$lambda$68$lambda$66 = UiFragmentListKt.FragmentLists_S3D76Zc$lambda$69$lambda$68$lambda$66(state);
                return FragmentLists_S3D76Zc$lambda$69$lambda$68$lambda$66;
            case 1:
                access$CardRevealTimers$lambda$24 = CardRevealKt.access$CardRevealTimers$lambda$24(state);
                return access$CardRevealTimers$lambda$24;
            case 2:
                access$CardRevealTimers$lambda$25 = CardRevealKt.access$CardRevealTimers$lambda$25(state);
                return Integer.valueOf(access$CardRevealTimers$lambda$25);
            case 3:
                invokeSuspend$lambda$0 = UiFragmentListKt$FragmentLists$20$1.invokeSuspend$lambda$0(state);
                return Boolean.valueOf(invokeSuspend$lambda$0);
            default:
                invokeSuspend$lambda$02 = UiFragmentListKt$LandOnLatestTurn$3$1.invokeSuspend$lambda$0(state);
                return Integer.valueOf(invokeSuspend$lambda$02);
        }
    }
}
