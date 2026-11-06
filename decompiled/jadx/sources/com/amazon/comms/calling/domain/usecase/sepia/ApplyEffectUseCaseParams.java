package com.amazon.comms.calling.domain.usecase.sepia;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/sepia/ApplyEffectUseCaseParams;", "", "effectId", "", "errorCb", "Lkotlin/Function1;", "Lcom/amazon/comms/calling/domain/usecase/sepia/SepiaMenuEvent;", "", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getEffectId", "()Ljava/lang/String;", "getErrorCb", "()Lkotlin/jvm/functions/Function1;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class ApplyEffectUseCaseParams {

    @NotNull
    private final String effectId;

    @NotNull
    private final Function1<SepiaMenuEvent, Unit> errorCb;

    /* JADX WARN: Multi-variable type inference failed */
    public ApplyEffectUseCaseParams(@NotNull String str, @NotNull Function1<? super SepiaMenuEvent, Unit> function1) {
        str.getClass();
        function1.getClass();
        this.effectId = str;
        this.errorCb = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApplyEffectUseCaseParams copy$default(ApplyEffectUseCaseParams applyEffectUseCaseParams, String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = applyEffectUseCaseParams.effectId;
        }
        if ((i & 2) != 0) {
            function1 = applyEffectUseCaseParams.errorCb;
        }
        return applyEffectUseCaseParams.copy(str, function1);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEffectId() {
        return this.effectId;
    }

    @NotNull
    public final Function1<SepiaMenuEvent, Unit> component2() {
        return this.errorCb;
    }

    @NotNull
    public final ApplyEffectUseCaseParams copy(@NotNull String effectId, @NotNull Function1<? super SepiaMenuEvent, Unit> errorCb) {
        effectId.getClass();
        errorCb.getClass();
        return new ApplyEffectUseCaseParams(effectId, errorCb);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplyEffectUseCaseParams)) {
            return false;
        }
        ApplyEffectUseCaseParams applyEffectUseCaseParams = (ApplyEffectUseCaseParams) other;
        return Intrinsics.areEqual(this.effectId, applyEffectUseCaseParams.effectId) && Intrinsics.areEqual(this.errorCb, applyEffectUseCaseParams.errorCb);
    }

    @NotNull
    public final String getEffectId() {
        return this.effectId;
    }

    @NotNull
    public final Function1<SepiaMenuEvent, Unit> getErrorCb() {
        return this.errorCb;
    }

    public int hashCode() {
        return this.errorCb.hashCode() + (this.effectId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ApplyEffectUseCaseParams(effectId=" + this.effectId + ", errorCb=" + this.errorCb + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
