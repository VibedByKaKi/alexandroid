package com.amazon.alexa.ra.core.ui.markdown.renderer.model;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import com.amazon.alexa.accessorykit.ModelTransformer;
import com.amazon.alexa.ra.core.data.fragments.Content;
import com.amazon.alexa.ra.core.data.fragments.Reference;
import com.amazon.alexa.ra.core.data.model.CitationDisplayMode;
import com.amazon.alexa.ra.core.data.model.InputBarEvents$$ExternalSyntheticLambda2;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.ra.ui.screen.APLLightBoxScreenKt$$ExternalSyntheticLambda1;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001BÏ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\u001a\b\u0002\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00060\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0017\u00103\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bHÆ\u0003J\u001b\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000eHÆ\u0003J\t\u00105\u001a\u00020\u0012HÆ\u0003J\u0011\u00106\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u001b\u00107\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00060\u000bHÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0019HÆ\u0003J×\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\u001a\b\u0002\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u001a\b\u0002\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00060\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0019HÆ\u0001J\u0013\u0010;\u001a\u00020\u00032\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\u0010HÖ\u0001J\t\u0010>\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R#\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R#\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u001dR\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006?"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/RendererContext;", "", "shouldAnimate", "", "onAnimationComplete", "Lkotlin/Function0;", "", "onStreamingAnimationComplete", ViewProps.ON_CLICK, "onLongClick", "onUrlClick", "Lkotlin/Function1;", "", "handleTextClick", "Lkotlin/Function2;", "Landroidx/compose/ui/text/AnnotatedString;", "", ModelTransformer.KEY_BATTERY_SCALE, "", Content.REFERENCES, "", "Lcom/amazon/alexa/ra/core/data/fragments/Reference;", "onCitationClick", "isPaused", "citationDisplayMode", "Lcom/amazon/alexa/ra/core/data/model/CitationDisplayMode;", "<init>", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;FLjava/util/List;Lkotlin/jvm/functions/Function1;ZLcom/amazon/alexa/ra/core/data/model/CitationDisplayMode;)V", "getShouldAnimate", "()Z", "getOnAnimationComplete", "()Lkotlin/jvm/functions/Function0;", "getOnStreamingAnimationComplete", "getOnClick", "getOnLongClick", "getOnUrlClick", "()Lkotlin/jvm/functions/Function1;", "getHandleTextClick", "()Lkotlin/jvm/functions/Function2;", "getScale", "()F", "getReferences", "()Ljava/util/List;", "getOnCitationClick", "getCitationDisplayMode", "()Lcom/amazon/alexa/ra/core/data/model/CitationDisplayMode;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class RendererContext {
    public static final int $stable = 8;

    @NotNull
    private final CitationDisplayMode citationDisplayMode;

    @NotNull
    private final Function2<AnnotatedString, Integer, Unit> handleTextClick;
    private final boolean isPaused;

    @NotNull
    private final Function0<Unit> onAnimationComplete;

    @NotNull
    private final Function1<List<Reference>, Unit> onCitationClick;

    @Nullable
    private final Function0<Unit> onClick;

    @Nullable
    private final Function0<Unit> onLongClick;

    @NotNull
    private final Function0<Unit> onStreamingAnimationComplete;

    @Nullable
    private final Function1<String, Unit> onUrlClick;

    @Nullable
    private final List<Reference> references;
    private final float scale;
    private final boolean shouldAnimate;

    public /* synthetic */ RendererContext(boolean z, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function1 function1, Function2 function2, float f, List list, Function1 function12, boolean z2, CitationDisplayMode citationDisplayMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, function0, (i & 4) != 0 ? new APLLightBoxScreenKt$$ExternalSyntheticLambda1(3) : function02, (i & 8) != 0 ? null : function03, (i & 16) != 0 ? null : function04, (i & 32) != 0 ? null : function1, function2, (i & 128) != 0 ? 1.0f : f, (i & 256) != 0 ? null : list, (i & 512) != 0 ? new InputBarEvents$$ExternalSyntheticLambda2(29) : function12, (i & 1024) != 0 ? false : z2, (i & 2048) != 0 ? CitationDisplayMode.ALL : citationDisplayMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(List list) {
        list.getClass();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ RendererContext copy$default(RendererContext rendererContext, boolean z, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function1 function1, Function2 function2, float f, List list, Function1 function12, boolean z2, CitationDisplayMode citationDisplayMode, int i, Object obj) {
        if ((i & 1) != 0) {
            z = rendererContext.shouldAnimate;
        }
        if ((i & 2) != 0) {
            function0 = rendererContext.onAnimationComplete;
        }
        if ((i & 4) != 0) {
            function02 = rendererContext.onStreamingAnimationComplete;
        }
        if ((i & 8) != 0) {
            function03 = rendererContext.onClick;
        }
        if ((i & 16) != 0) {
            function04 = rendererContext.onLongClick;
        }
        if ((i & 32) != 0) {
            function1 = rendererContext.onUrlClick;
        }
        if ((i & 64) != 0) {
            function2 = rendererContext.handleTextClick;
        }
        if ((i & 128) != 0) {
            f = rendererContext.scale;
        }
        if ((i & 256) != 0) {
            list = rendererContext.references;
        }
        if ((i & 512) != 0) {
            function12 = rendererContext.onCitationClick;
        }
        if ((i & 1024) != 0) {
            z2 = rendererContext.isPaused;
        }
        if ((i & 2048) != 0) {
            citationDisplayMode = rendererContext.citationDisplayMode;
        }
        boolean z3 = z2;
        CitationDisplayMode citationDisplayMode2 = citationDisplayMode;
        List list2 = list;
        Function1 function13 = function12;
        Function2 function22 = function2;
        float f2 = f;
        Function0 function05 = function04;
        Function1 function14 = function1;
        return rendererContext.copy(z, function0, function02, function03, function05, function14, function22, f2, list2, function13, z3, citationDisplayMode2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShouldAnimate() {
        return this.shouldAnimate;
    }

    @NotNull
    public final Function1<List<Reference>, Unit> component10() {
        return this.onCitationClick;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsPaused() {
        return this.isPaused;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final CitationDisplayMode getCitationDisplayMode() {
        return this.citationDisplayMode;
    }

    @NotNull
    public final Function0<Unit> component2() {
        return this.onAnimationComplete;
    }

    @NotNull
    public final Function0<Unit> component3() {
        return this.onStreamingAnimationComplete;
    }

    @Nullable
    public final Function0<Unit> component4() {
        return this.onClick;
    }

    @Nullable
    public final Function0<Unit> component5() {
        return this.onLongClick;
    }

    @Nullable
    public final Function1<String, Unit> component6() {
        return this.onUrlClick;
    }

    @NotNull
    public final Function2<AnnotatedString, Integer, Unit> component7() {
        return this.handleTextClick;
    }

    /* renamed from: component8, reason: from getter */
    public final float getScale() {
        return this.scale;
    }

    @Nullable
    public final List<Reference> component9() {
        return this.references;
    }

    @NotNull
    public final RendererContext copy(boolean shouldAnimate, @NotNull Function0<Unit> onAnimationComplete, @NotNull Function0<Unit> onStreamingAnimationComplete, @Nullable Function0<Unit> onClick, @Nullable Function0<Unit> onLongClick, @Nullable Function1<? super String, Unit> onUrlClick, @NotNull Function2<? super AnnotatedString, ? super Integer, Unit> handleTextClick, float scale, @Nullable List<Reference> references, @NotNull Function1<? super List<Reference>, Unit> onCitationClick, boolean isPaused, @NotNull CitationDisplayMode citationDisplayMode) {
        onAnimationComplete.getClass();
        onStreamingAnimationComplete.getClass();
        handleTextClick.getClass();
        onCitationClick.getClass();
        citationDisplayMode.getClass();
        return new RendererContext(shouldAnimate, onAnimationComplete, onStreamingAnimationComplete, onClick, onLongClick, onUrlClick, handleTextClick, scale, references, onCitationClick, isPaused, citationDisplayMode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RendererContext)) {
            return false;
        }
        RendererContext rendererContext = (RendererContext) other;
        return this.shouldAnimate == rendererContext.shouldAnimate && Intrinsics.areEqual(this.onAnimationComplete, rendererContext.onAnimationComplete) && Intrinsics.areEqual(this.onStreamingAnimationComplete, rendererContext.onStreamingAnimationComplete) && Intrinsics.areEqual(this.onClick, rendererContext.onClick) && Intrinsics.areEqual(this.onLongClick, rendererContext.onLongClick) && Intrinsics.areEqual(this.onUrlClick, rendererContext.onUrlClick) && Intrinsics.areEqual(this.handleTextClick, rendererContext.handleTextClick) && Float.compare(this.scale, rendererContext.scale) == 0 && Intrinsics.areEqual(this.references, rendererContext.references) && Intrinsics.areEqual(this.onCitationClick, rendererContext.onCitationClick) && this.isPaused == rendererContext.isPaused && this.citationDisplayMode == rendererContext.citationDisplayMode;
    }

    @NotNull
    public final CitationDisplayMode getCitationDisplayMode() {
        return this.citationDisplayMode;
    }

    @NotNull
    public final Function2<AnnotatedString, Integer, Unit> getHandleTextClick() {
        return this.handleTextClick;
    }

    @NotNull
    public final Function0<Unit> getOnAnimationComplete() {
        return this.onAnimationComplete;
    }

    @NotNull
    public final Function1<List<Reference>, Unit> getOnCitationClick() {
        return this.onCitationClick;
    }

    @Nullable
    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    @Nullable
    public final Function0<Unit> getOnLongClick() {
        return this.onLongClick;
    }

    @NotNull
    public final Function0<Unit> getOnStreamingAnimationComplete() {
        return this.onStreamingAnimationComplete;
    }

    @Nullable
    public final Function1<String, Unit> getOnUrlClick() {
        return this.onUrlClick;
    }

    @Nullable
    public final List<Reference> getReferences() {
        return this.references;
    }

    public final float getScale() {
        return this.scale;
    }

    public final boolean getShouldAnimate() {
        return this.shouldAnimate;
    }

    public int hashCode() {
        int m = DoubleList$$ExternalSyntheticOutline0.m(DoubleList$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.shouldAnimate) * 31, 31, this.onAnimationComplete), 31, this.onStreamingAnimationComplete);
        Function0<Unit> function0 = this.onClick;
        int hashCode = (m + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function0<Unit> function02 = this.onLongClick;
        int hashCode2 = (hashCode + (function02 == null ? 0 : function02.hashCode())) * 31;
        Function1<String, Unit> function1 = this.onUrlClick;
        int m2 = DoubleList$$ExternalSyntheticOutline0.m(this.scale, (this.handleTextClick.hashCode() + ((hashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31)) * 31, 31);
        List<Reference> list = this.references;
        return this.citationDisplayMode.hashCode() + DoubleList$$ExternalSyntheticOutline0.m(this.isPaused, DoubleList$$ExternalSyntheticOutline0.m((m2 + (list != null ? list.hashCode() : 0)) * 31, 31, (Function1) this.onCitationClick), 31);
    }

    public final boolean isPaused() {
        return this.isPaused;
    }

    @NotNull
    public String toString() {
        return "RendererContext(shouldAnimate=" + this.shouldAnimate + ", onAnimationComplete=" + this.onAnimationComplete + ", onStreamingAnimationComplete=" + this.onStreamingAnimationComplete + ", onClick=" + this.onClick + ", onLongClick=" + this.onLongClick + ", onUrlClick=" + this.onUrlClick + ", handleTextClick=" + this.handleTextClick + ", scale=" + this.scale + ", references=" + this.references + ", onCitationClick=" + this.onCitationClick + ", isPaused=" + this.isPaused + ", citationDisplayMode=" + this.citationDisplayMode + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RendererContext(boolean z, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @Nullable Function0<Unit> function03, @Nullable Function0<Unit> function04, @Nullable Function1<? super String, Unit> function1, @NotNull Function2<? super AnnotatedString, ? super Integer, Unit> function2, float f, @Nullable List<Reference> list, @NotNull Function1<? super List<Reference>, Unit> function12, boolean z2, @NotNull CitationDisplayMode citationDisplayMode) {
        function0.getClass();
        function02.getClass();
        function2.getClass();
        function12.getClass();
        citationDisplayMode.getClass();
        this.shouldAnimate = z;
        this.onAnimationComplete = function0;
        this.onStreamingAnimationComplete = function02;
        this.onClick = function03;
        this.onLongClick = function04;
        this.onUrlClick = function1;
        this.handleTextClick = function2;
        this.scale = f;
        this.references = list;
        this.onCitationClick = function12;
        this.isPaused = z2;
        this.citationDisplayMode = citationDisplayMode;
    }
}
