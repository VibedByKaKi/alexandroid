package com.amazon.alexa.redesign.entity.agentforward.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.presenter.StartHandler$$ExternalSyntheticLambda2;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/domain/OpenConvoCX;", "Lcom/amazon/alexa/redesign/entity/agentforward/domain/ContentAction;", "runnable", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "getRunnable", "()Lkotlin/jvm/functions/Function0;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class OpenConvoCX implements ContentAction {
    public static final int $stable = 0;

    @NotNull
    private final Function0<Unit> runnable;

    public /* synthetic */ OpenConvoCX(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new StartHandler$$ExternalSyntheticLambda2(5) : function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OpenConvoCX copy$default(OpenConvoCX openConvoCX, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = openConvoCX.runnable;
        }
        return openConvoCX.copy(function0);
    }

    @NotNull
    public final Function0<Unit> component1() {
        return this.runnable;
    }

    @NotNull
    public final OpenConvoCX copy(@NotNull Function0<Unit> runnable) {
        runnable.getClass();
        return new OpenConvoCX(runnable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OpenConvoCX) && Intrinsics.areEqual(this.runnable, ((OpenConvoCX) other).runnable);
    }

    @NotNull
    public final Function0<Unit> getRunnable() {
        return this.runnable;
    }

    public int hashCode() {
        return this.runnable.hashCode();
    }

    @NotNull
    public String toString() {
        return "OpenConvoCX(runnable=" + this.runnable + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @JsonCreator
    public OpenConvoCX(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.runnable = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JsonCreator
    public OpenConvoCX() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
