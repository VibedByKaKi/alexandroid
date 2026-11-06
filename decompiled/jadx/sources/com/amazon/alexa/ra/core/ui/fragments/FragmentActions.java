package com.amazon.alexa.ra.core.ui.fragments;

import android.content.Context;
import com.amazon.alexa.ra.core.data.fragments.Artifact;
import com.amazon.alexa.ra.core.data.fragments.FragmentData;
import com.amazon.alexa.ra.core.data.model.InputBarEvents$$ExternalSyntheticLambda2;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H&J.\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00052\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H&J\u0010\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0016Je\u0010\u000e\u001aW\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000fj\u0004\u0018\u0001`\u00172\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/fragments/FragmentActions;", "", "getFormattedText", "", "fragmentData", "Lcom/amazon/alexa/ra/core/data/fragments/FragmentData;", "relatedAgentText", "Lkotlin/Function1;", "", "getArtifact", "Lcom/amazon/alexa/ra/core/data/fragments/Artifact;", "getVisualContext", "Lkotlinx/coroutines/flow/Flow;", "Lcom/amazon/alexa/ra/core/ui/fragments/VisualContext;", "getShareHandler", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "fragments", "responseText", "Landroid/content/Context;", "context", "", "Lcom/amazon/alexa/ra/core/ui/fragments/ShareHandler;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface FragmentActions {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        @Nullable
        public static Function3<List<FragmentData>, String, Context, Unit> getShareHandler(@NotNull FragmentActions fragmentActions, @NotNull FragmentData fragmentData) {
            fragmentData.getClass();
            return FragmentActions.super.getShareHandler(fragmentData);
        }

        @Deprecated
        @Nullable
        public static Flow<VisualContext> getVisualContext(@NotNull FragmentActions fragmentActions) {
            return FragmentActions.super.getVisualContext();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Artifact getArtifact$default(FragmentActions fragmentActions, FragmentData fragmentData, Function1 function1, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: getArtifact");
            return null;
        }
        if ((i & 2) != 0) {
            function1 = new InputBarEvents$$ExternalSyntheticLambda2(19);
        }
        return fragmentActions.getArtifact(fragmentData, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static List getArtifact$lambda$1(FragmentData fragmentData) {
        fragmentData.getClass();
        return CollectionsKt.emptyList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ String getFormattedText$default(FragmentActions fragmentActions, FragmentData fragmentData, Function1 function1, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: getFormattedText");
            return null;
        }
        if ((i & 2) != 0) {
            function1 = new InputBarEvents$$ExternalSyntheticLambda2(20);
        }
        return fragmentActions.getFormattedText(fragmentData, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static List getFormattedText$lambda$0(FragmentData fragmentData) {
        fragmentData.getClass();
        return CollectionsKt.emptyList();
    }

    @Nullable
    Artifact getArtifact(@NotNull FragmentData fragmentData, @NotNull Function1<? super FragmentData, ? extends List<FragmentData>> relatedAgentText);

    @NotNull
    String getFormattedText(@NotNull FragmentData fragmentData, @NotNull Function1<? super FragmentData, ? extends List<FragmentData>> relatedAgentText);

    @Nullable
    default Function3<List<FragmentData>, String, Context, Unit> getShareHandler(@NotNull FragmentData fragmentData) {
        fragmentData.getClass();
        return null;
    }

    @Nullable
    default Flow<VisualContext> getVisualContext() {
        return null;
    }
}
