package com.amazon.alexa.ra.apl.fragments.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012<\u0010\u0004\u001a8\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005j\u0002`\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J?\u0010\u0013\u001a8\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005j\u0002`\u000bHÆ\u0003JS\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032>\b\u0002\u0010\u0004\u001a8\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005j\u0002`\u000bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fRG\u0010\u0004\u001a8\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005j\u0002`\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/amazon/alexa/ra/apl/fragments/data/APLFragmentExpandEvent;", "Lcom/amazon/alexa/ra/apl/fragments/data/APLFragmentEvent;", "fragment", "Lcom/amazon/alexa/ra/apl/fragments/data/APLFragmentData;", "authHeaderProvider", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "fragmentData", "", "url", "Lcom/amazon/alexa/ra/apl/fragments/managers/APLAuthHeaderProvider;", "<init>", "(Lcom/amazon/alexa/ra/apl/fragments/data/APLFragmentData;Lkotlin/jvm/functions/Function2;)V", "getFragment", "()Lcom/amazon/alexa/ra/apl/fragments/data/APLFragmentData;", "getAuthHeaderProvider", "()Lkotlin/jvm/functions/Function2;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AVSMobileFramework-ra-apl-fragment-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class APLFragmentExpandEvent implements APLFragmentEvent {
    public static final int $stable = 8;

    @NotNull
    private final Function2<APLFragmentData, String, String> authHeaderProvider;

    @NotNull
    private final APLFragmentData fragment;

    /* JADX WARN: Multi-variable type inference failed */
    public APLFragmentExpandEvent(@NotNull APLFragmentData aPLFragmentData, @NotNull Function2<? super APLFragmentData, ? super String, String> function2) {
        aPLFragmentData.getClass();
        function2.getClass();
        this.fragment = aPLFragmentData;
        this.authHeaderProvider = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ APLFragmentExpandEvent copy$default(APLFragmentExpandEvent aPLFragmentExpandEvent, APLFragmentData aPLFragmentData, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            aPLFragmentData = aPLFragmentExpandEvent.fragment;
        }
        if ((i & 2) != 0) {
            function2 = aPLFragmentExpandEvent.authHeaderProvider;
        }
        return aPLFragmentExpandEvent.copy(aPLFragmentData, function2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final APLFragmentData getFragment() {
        return this.fragment;
    }

    @NotNull
    public final Function2<APLFragmentData, String, String> component2() {
        return this.authHeaderProvider;
    }

    @NotNull
    public final APLFragmentExpandEvent copy(@NotNull APLFragmentData fragment, @NotNull Function2<? super APLFragmentData, ? super String, String> authHeaderProvider) {
        fragment.getClass();
        authHeaderProvider.getClass();
        return new APLFragmentExpandEvent(fragment, authHeaderProvider);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof APLFragmentExpandEvent)) {
            return false;
        }
        APLFragmentExpandEvent aPLFragmentExpandEvent = (APLFragmentExpandEvent) other;
        return Intrinsics.areEqual(this.fragment, aPLFragmentExpandEvent.fragment) && Intrinsics.areEqual(this.authHeaderProvider, aPLFragmentExpandEvent.authHeaderProvider);
    }

    @NotNull
    public final Function2<APLFragmentData, String, String> getAuthHeaderProvider() {
        return this.authHeaderProvider;
    }

    @NotNull
    public final APLFragmentData getFragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.authHeaderProvider.hashCode() + (this.fragment.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "APLFragmentExpandEvent(fragment=" + this.fragment + ", authHeaderProvider=" + this.authHeaderProvider + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
