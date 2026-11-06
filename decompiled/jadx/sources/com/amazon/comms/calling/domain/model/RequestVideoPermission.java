package com.amazon.comms.calling.domain.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u001c\u0010\u0002\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\t\u0010\nJ$\u0010\u0010\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\bHÆ\u0003J>\u0010\u0012\u001a\u00020\u00002\u001e\b\u0002\u0010\u0002\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bHÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R)\u0010\u0002\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/amazon/comms/calling/domain/model/RequestVideoPermission;", "Lcom/amazon/comms/calling/domain/model/CallUIState;", "onGranted", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "onDenied", "Lkotlin/Function0;", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "getOnGranted", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function1;", "getOnDenied", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "copy", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Lcom/amazon/comms/calling/domain/model/RequestVideoPermission;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class RequestVideoPermission extends CallUIState {

    @NotNull
    private final Function0<Unit> onDenied;

    @NotNull
    private final Function1<Continuation<? super Unit>, Object> onGranted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RequestVideoPermission(@NotNull Function1<? super Continuation<? super Unit>, ? extends Object> function1, @NotNull Function0<Unit> function0) {
        super(null);
        function1.getClass();
        function0.getClass();
        this.onGranted = function1;
        this.onDenied = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RequestVideoPermission copy$default(RequestVideoPermission requestVideoPermission, Function1 function1, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = requestVideoPermission.onGranted;
        }
        if ((i & 2) != 0) {
            function0 = requestVideoPermission.onDenied;
        }
        return requestVideoPermission.copy(function1, function0);
    }

    @NotNull
    public final Function1<Continuation<? super Unit>, Object> component1() {
        return this.onGranted;
    }

    @NotNull
    public final Function0<Unit> component2() {
        return this.onDenied;
    }

    @NotNull
    public final RequestVideoPermission copy(@NotNull Function1<? super Continuation<? super Unit>, ? extends Object> onGranted, @NotNull Function0<Unit> onDenied) {
        onGranted.getClass();
        onDenied.getClass();
        return new RequestVideoPermission(onGranted, onDenied);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestVideoPermission)) {
            return false;
        }
        RequestVideoPermission requestVideoPermission = (RequestVideoPermission) other;
        return Intrinsics.areEqual(this.onGranted, requestVideoPermission.onGranted) && Intrinsics.areEqual(this.onDenied, requestVideoPermission.onDenied);
    }

    @NotNull
    public final Function0<Unit> getOnDenied() {
        return this.onDenied;
    }

    @NotNull
    public final Function1<Continuation<? super Unit>, Object> getOnGranted() {
        return this.onGranted;
    }

    public int hashCode() {
        return this.onDenied.hashCode() + (this.onGranted.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "RequestVideoPermission(onGranted=" + this.onGranted + ", onDenied=" + this.onDenied + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
