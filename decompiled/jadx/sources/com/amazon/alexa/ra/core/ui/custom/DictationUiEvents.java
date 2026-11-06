package com.amazon.alexa.ra.core.ui.custom;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.accessorykit.ApplicationLifecycleObserverEventEmitter;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0001,B¢\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u000b\u0012#\b\u0002\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0015\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u000bHÆ\u0003J$\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00040\u000bHÆ\u0003J¤\u0001\u0010&\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u000b2#\b\u0002\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00040\u000bHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u000eHÖ\u0001J\t\u0010+\u001a\u00020\fHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR,\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001c¨\u0006-"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/DictationUiEvents;", "", "onMicClick", "Lkotlin/Function0;", "", "onCancel", ApplicationLifecycleObserverEventEmitter.LIFECYCLE_EVENT_STOP, "onSubmit", "onHoldBegin", "onHoldEnd", "onDraftChanged", "Lkotlin/Function1;", "", "onCommitHandled", "", "Lkotlin/ParameterName;", "name", "id", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getOnMicClick", "()Lkotlin/jvm/functions/Function0;", "getOnCancel", "getOnStop", "getOnSubmit", "getOnHoldBegin", "getOnHoldEnd", "getOnDraftChanged", "()Lkotlin/jvm/functions/Function1;", "getOnCommitHandled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "Companion", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class DictationUiEvents {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final DictationUiEvents NoOp = new DictationUiEvents(null, null, null, null, null, null, null, null, 255, null);

    @NotNull
    private final Function0<Unit> onCancel;

    @NotNull
    private final Function1<Integer, Unit> onCommitHandled;

    @NotNull
    private final Function1<String, Unit> onDraftChanged;

    @NotNull
    private final Function0<Unit> onHoldBegin;

    @NotNull
    private final Function0<Unit> onHoldEnd;

    @NotNull
    private final Function0<Unit> onMicClick;

    @NotNull
    private final Function0<Unit> onStop;

    @NotNull
    private final Function0<Unit> onSubmit;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ DictationUiEvents(kotlin.jvm.functions.Function0 r4, kotlin.jvm.functions.Function0 r5, kotlin.jvm.functions.Function0 r6, kotlin.jvm.functions.Function0 r7, kotlin.jvm.functions.Function0 r8, kotlin.jvm.functions.Function0 r9, kotlin.jvm.functions.Function1 r10, kotlin.jvm.functions.Function1 r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r3 = this;
            r1 = r12 & 1
            if (r1 == 0) goto La
            com.amazon.alexa.ra.core.ui.custom.ImageCardKt$$ExternalSyntheticLambda1 r4 = new com.amazon.alexa.ra.core.ui.custom.ImageCardKt$$ExternalSyntheticLambda1
            r1 = 4
            r4.<init>(r1)
        La:
            r1 = r12 & 2
            if (r1 == 0) goto L14
            com.amazon.alexa.ra.core.ui.custom.ImageCardKt$$ExternalSyntheticLambda1 r5 = new com.amazon.alexa.ra.core.ui.custom.ImageCardKt$$ExternalSyntheticLambda1
            r1 = 5
            r5.<init>(r1)
        L14:
            r1 = r12 & 4
            if (r1 == 0) goto L1e
            com.amazon.alexa.ra.core.ui.custom.ImageCardKt$$ExternalSyntheticLambda1 r6 = new com.amazon.alexa.ra.core.ui.custom.ImageCardKt$$ExternalSyntheticLambda1
            r1 = 6
            r6.<init>(r1)
        L1e:
            r1 = r12 & 8
            if (r1 == 0) goto L28
            com.amazon.alexa.ra.core.ui.custom.ImageCardKt$$ExternalSyntheticLambda1 r7 = new com.amazon.alexa.ra.core.ui.custom.ImageCardKt$$ExternalSyntheticLambda1
            r1 = 7
            r7.<init>(r1)
        L28:
            r1 = r12 & 16
            if (r1 == 0) goto L33
            com.amazon.alexa.ra.core.ui.custom.ImageCardKt$$ExternalSyntheticLambda1 r8 = new com.amazon.alexa.ra.core.ui.custom.ImageCardKt$$ExternalSyntheticLambda1
            r1 = 8
            r8.<init>(r1)
        L33:
            r1 = r12 & 32
            if (r1 == 0) goto L3e
            com.amazon.alexa.ra.core.ui.custom.ImageCardKt$$ExternalSyntheticLambda1 r9 = new com.amazon.alexa.ra.core.ui.custom.ImageCardKt$$ExternalSyntheticLambda1
            r1 = 9
            r9.<init>(r1)
        L3e:
            r1 = r12 & 64
            if (r1 == 0) goto L4a
            com.amazon.alexa.ra.core.ui.custom.ImageCardKt$$ExternalSyntheticLambda6 r1 = new com.amazon.alexa.ra.core.ui.custom.ImageCardKt$$ExternalSyntheticLambda6
            r2 = 17
            r1.<init>(r2)
            goto L4b
        L4a:
            r1 = r10
        L4b:
            r0 = r12 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L60
            com.amazon.alexa.ra.core.ui.custom.ImageCardKt$$ExternalSyntheticLambda6 r0 = new com.amazon.alexa.ra.core.ui.custom.ImageCardKt$$ExternalSyntheticLambda6
            r2 = 18
            r0.<init>(r2)
            r13 = r0
            r10 = r8
            r11 = r9
            r12 = r1
            r8 = r6
            r9 = r7
            r6 = r4
        L5d:
            r7 = r5
            r5 = r3
            goto L68
        L60:
            r13 = r11
            r10 = r8
            r12 = r1
            r8 = r6
            r11 = r9
            r6 = r4
            r9 = r7
            goto L5d
        L68:
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.ra.core.ui.custom.DictationUiEvents.<init>(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$6(String str) {
        str.getClass();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$7(int i) {
        return Unit.INSTANCE;
    }

    public static /* synthetic */ DictationUiEvents copy$default(DictationUiEvents dictationUiEvents, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function1 function1, Function1 function12, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = dictationUiEvents.onMicClick;
        }
        if ((i & 2) != 0) {
            function02 = dictationUiEvents.onCancel;
        }
        if ((i & 4) != 0) {
            function03 = dictationUiEvents.onStop;
        }
        if ((i & 8) != 0) {
            function04 = dictationUiEvents.onSubmit;
        }
        if ((i & 16) != 0) {
            function05 = dictationUiEvents.onHoldBegin;
        }
        if ((i & 32) != 0) {
            function06 = dictationUiEvents.onHoldEnd;
        }
        if ((i & 64) != 0) {
            function1 = dictationUiEvents.onDraftChanged;
        }
        if ((i & 128) != 0) {
            function12 = dictationUiEvents.onCommitHandled;
        }
        Function1 function13 = function1;
        Function1 function14 = function12;
        Function0 function07 = function05;
        Function0 function08 = function06;
        return dictationUiEvents.copy(function0, function02, function03, function04, function07, function08, function13, function14);
    }

    @NotNull
    public final Function0<Unit> component1() {
        return this.onMicClick;
    }

    @NotNull
    public final Function0<Unit> component2() {
        return this.onCancel;
    }

    @NotNull
    public final Function0<Unit> component3() {
        return this.onStop;
    }

    @NotNull
    public final Function0<Unit> component4() {
        return this.onSubmit;
    }

    @NotNull
    public final Function0<Unit> component5() {
        return this.onHoldBegin;
    }

    @NotNull
    public final Function0<Unit> component6() {
        return this.onHoldEnd;
    }

    @NotNull
    public final Function1<String, Unit> component7() {
        return this.onDraftChanged;
    }

    @NotNull
    public final Function1<Integer, Unit> component8() {
        return this.onCommitHandled;
    }

    @NotNull
    public final DictationUiEvents copy(@NotNull Function0<Unit> onMicClick, @NotNull Function0<Unit> onCancel, @NotNull Function0<Unit> onStop, @NotNull Function0<Unit> onSubmit, @NotNull Function0<Unit> onHoldBegin, @NotNull Function0<Unit> onHoldEnd, @NotNull Function1<? super String, Unit> onDraftChanged, @NotNull Function1<? super Integer, Unit> onCommitHandled) {
        onMicClick.getClass();
        onCancel.getClass();
        onStop.getClass();
        onSubmit.getClass();
        onHoldBegin.getClass();
        onHoldEnd.getClass();
        onDraftChanged.getClass();
        onCommitHandled.getClass();
        return new DictationUiEvents(onMicClick, onCancel, onStop, onSubmit, onHoldBegin, onHoldEnd, onDraftChanged, onCommitHandled);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DictationUiEvents)) {
            return false;
        }
        DictationUiEvents dictationUiEvents = (DictationUiEvents) other;
        return Intrinsics.areEqual(this.onMicClick, dictationUiEvents.onMicClick) && Intrinsics.areEqual(this.onCancel, dictationUiEvents.onCancel) && Intrinsics.areEqual(this.onStop, dictationUiEvents.onStop) && Intrinsics.areEqual(this.onSubmit, dictationUiEvents.onSubmit) && Intrinsics.areEqual(this.onHoldBegin, dictationUiEvents.onHoldBegin) && Intrinsics.areEqual(this.onHoldEnd, dictationUiEvents.onHoldEnd) && Intrinsics.areEqual(this.onDraftChanged, dictationUiEvents.onDraftChanged) && Intrinsics.areEqual(this.onCommitHandled, dictationUiEvents.onCommitHandled);
    }

    @NotNull
    public final Function0<Unit> getOnCancel() {
        return this.onCancel;
    }

    @NotNull
    public final Function1<Integer, Unit> getOnCommitHandled() {
        return this.onCommitHandled;
    }

    @NotNull
    public final Function1<String, Unit> getOnDraftChanged() {
        return this.onDraftChanged;
    }

    @NotNull
    public final Function0<Unit> getOnHoldBegin() {
        return this.onHoldBegin;
    }

    @NotNull
    public final Function0<Unit> getOnHoldEnd() {
        return this.onHoldEnd;
    }

    @NotNull
    public final Function0<Unit> getOnMicClick() {
        return this.onMicClick;
    }

    @NotNull
    public final Function0<Unit> getOnStop() {
        return this.onStop;
    }

    @NotNull
    public final Function0<Unit> getOnSubmit() {
        return this.onSubmit;
    }

    public int hashCode() {
        return this.onCommitHandled.hashCode() + DoubleList$$ExternalSyntheticOutline0.m(DoubleList$$ExternalSyntheticOutline0.m(DoubleList$$ExternalSyntheticOutline0.m(DoubleList$$ExternalSyntheticOutline0.m(DoubleList$$ExternalSyntheticOutline0.m(DoubleList$$ExternalSyntheticOutline0.m(this.onMicClick.hashCode() * 31, 31, this.onCancel), 31, this.onStop), 31, this.onSubmit), 31, this.onHoldBegin), 31, this.onHoldEnd), 31, (Function1) this.onDraftChanged);
    }

    @NotNull
    public String toString() {
        return "DictationUiEvents(onMicClick=" + this.onMicClick + ", onCancel=" + this.onCancel + ", onStop=" + this.onStop + ", onSubmit=" + this.onSubmit + ", onHoldBegin=" + this.onHoldBegin + ", onHoldEnd=" + this.onHoldEnd + ", onDraftChanged=" + this.onDraftChanged + ", onCommitHandled=" + this.onCommitHandled + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/DictationUiEvents$Companion;", "", "<init>", "()V", "NoOp", "Lcom/amazon/alexa/ra/core/ui/custom/DictationUiEvents;", "getNoOp", "()Lcom/amazon/alexa/ra/core/ui/custom/DictationUiEvents;", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DictationUiEvents getNoOp() {
            return DictationUiEvents.NoOp;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DictationUiEvents(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03, @NotNull Function0<Unit> function04, @NotNull Function0<Unit> function05, @NotNull Function0<Unit> function06, @NotNull Function1<? super String, Unit> function1, @NotNull Function1<? super Integer, Unit> function12) {
        function0.getClass();
        function02.getClass();
        function03.getClass();
        function04.getClass();
        function05.getClass();
        function06.getClass();
        function1.getClass();
        function12.getClass();
        this.onMicClick = function0;
        this.onCancel = function02;
        this.onStop = function03;
        this.onSubmit = function04;
        this.onHoldBegin = function05;
        this.onHoldEnd = function06;
        this.onDraftChanged = function1;
        this.onCommitHandled = function12;
    }

    public DictationUiEvents() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
