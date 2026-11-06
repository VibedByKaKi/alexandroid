package com.amazon.alexa.ra.core.data.model;

import com.amazon.alexa.ra.core.data.fragments.FragmentData;
import com.amazon.alexa.ra.core.data.visualcontext.VisualContextManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class Fragments$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Fragments f$0;

    public /* synthetic */ Fragments$$ExternalSyntheticLambda0(Fragments fragments, int i) {
        this.$r8$classId = i;
        this.f$0 = fragments;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FragmentData blockFragmentsForRoot$lambda$66$lambda$63;
        List blockFragments$lambda$3;
        List childFragments$lambda$4;
        List responseFragments$lambda$9;
        List continuedBy$lambda$12;
        List relatedAgentText$lambda$13;
        boolean isClearedPreamble$lambda$14;
        Unit fragmentAnimationStarted$lambda$15;
        Unit fragmentAnimationEnded$lambda$16;
        FragmentData relatedExpansionOFragment$lambda$19;
        boolean isActiveRespondingFragment$lambda$21;
        boolean isFragmentRenderingPaused$lambda$22;
        boolean updateVisibleItemsVisualContext$lambda$3;
        boolean updateVisibleItemsVisualContext$lambda$4;
        boolean updateVisibleItemsVisualContext$lambda$5;
        int i = this.$r8$classId;
        Fragments fragments = this.f$0;
        switch (i) {
            case 0:
                blockFragmentsForRoot$lambda$66$lambda$63 = Fragments.getBlockFragmentsForRoot$lambda$66$lambda$63(fragments, (String) obj);
                return blockFragmentsForRoot$lambda$66$lambda$63;
            case 1:
                blockFragments$lambda$3 = Fragments.blockFragments$lambda$3(fragments, (FragmentData) obj);
                return blockFragments$lambda$3;
            case 2:
                childFragments$lambda$4 = Fragments.childFragments$lambda$4(fragments, (FragmentData) obj);
                return childFragments$lambda$4;
            case 3:
                responseFragments$lambda$9 = Fragments.responseFragments$lambda$9(fragments, (FragmentData) obj);
                return responseFragments$lambda$9;
            case 4:
                continuedBy$lambda$12 = Fragments.continuedBy$lambda$12(fragments, (FragmentData) obj);
                return continuedBy$lambda$12;
            case 5:
                relatedAgentText$lambda$13 = Fragments.relatedAgentText$lambda$13(fragments, (FragmentData) obj);
                return relatedAgentText$lambda$13;
            case 6:
                isClearedPreamble$lambda$14 = Fragments.isClearedPreamble$lambda$14(fragments, (FragmentData) obj);
                return Boolean.valueOf(isClearedPreamble$lambda$14);
            case 7:
                fragmentAnimationStarted$lambda$15 = Fragments.fragmentAnimationStarted$lambda$15(fragments, (FragmentData) obj);
                return fragmentAnimationStarted$lambda$15;
            case 8:
                fragmentAnimationEnded$lambda$16 = Fragments.fragmentAnimationEnded$lambda$16(fragments, (FragmentData) obj);
                return fragmentAnimationEnded$lambda$16;
            case 9:
                relatedExpansionOFragment$lambda$19 = Fragments.getRelatedExpansionOFragment$lambda$19(fragments, (String) obj);
                return relatedExpansionOFragment$lambda$19;
            case 10:
                isActiveRespondingFragment$lambda$21 = Fragments.isActiveRespondingFragment$lambda$21(fragments, (FragmentData) obj);
                return Boolean.valueOf(isActiveRespondingFragment$lambda$21);
            case 11:
                isFragmentRenderingPaused$lambda$22 = Fragments.isFragmentRenderingPaused$lambda$22(fragments, (FragmentData) obj);
                return Boolean.valueOf(isFragmentRenderingPaused$lambda$22);
            case 12:
                updateVisibleItemsVisualContext$lambda$3 = VisualContextManager.updateVisibleItemsVisualContext$lambda$3(fragments, (String) obj);
                return Boolean.valueOf(updateVisibleItemsVisualContext$lambda$3);
            case 13:
                updateVisibleItemsVisualContext$lambda$4 = VisualContextManager.updateVisibleItemsVisualContext$lambda$4(fragments, (String) obj);
                return Boolean.valueOf(updateVisibleItemsVisualContext$lambda$4);
            default:
                updateVisibleItemsVisualContext$lambda$5 = VisualContextManager.updateVisibleItemsVisualContext$lambda$5(fragments, (String) obj);
                return Boolean.valueOf(updateVisibleItemsVisualContext$lambda$5);
        }
    }
}
