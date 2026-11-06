package com.amazon.alexa.pmi.implementation.taplatency;

import android.view.MotionEvent;
import android.view.View;
import com.amazon.alexa.featureservice.constants.FeatureConstants;
import com.amazon.alexa.ra.cards.components.IconKt$$ExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\"\b\u0002\u0010\u000b\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\f\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\rJ\u0006\u0010\u001e\u001a\u00020\u0013J \u0010\u001f\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000eH\u0002J \u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u000b\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/amazon/alexa/pmi/implementation/taplatency/TapGestureArmer;", "", "touchSlopPx", "", FeatureConstants.Network.TREATMENT, "", "arming", "Lcom/amazon/alexa/pmi/implementation/taplatency/ArmedInteractionState;", "shouldSample", "Lkotlin/Function0;", "", "hitTest", "Lkotlin/Function3;", "Landroid/view/View;", "", "Lcom/amazon/alexa/pmi/implementation/taplatency/TapTarget;", "onTapUp", "Lkotlin/Function1;", "", "", "onTouchDown", "<init>", "(ILjava/lang/String;Lcom/amazon/alexa/pmi/implementation/taplatency/ArmedInteractionState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "gesture", "Lcom/amazon/alexa/pmi/implementation/taplatency/Gesture;", "lastCleanTap", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "decor", "reset", "isSameSpot", "rawX", "rawY", "arm", "tapGesture", "target", "tapUpTimeMs", "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTapGestureArmer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapGestureArmer.kt\ncom/amazon/alexa/pmi/implementation/taplatency/TapGestureArmer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n1#2:153\n*E\n"})
/* loaded from: classes18.dex */
public final class TapGestureArmer {

    @NotNull
    private final ArmedInteractionState arming;

    @Nullable
    private Gesture gesture;

    @NotNull
    private final Function3<View, Float, Float, TapTarget> hitTest;

    @Nullable
    private Gesture lastCleanTap;

    @NotNull
    private final Function1<Long, Unit> onTapUp;

    @NotNull
    private final Function1<Long, Unit> onTouchDown;

    @NotNull
    private final Function0<Boolean> shouldSample;
    private final int touchSlopPx;

    @NotNull
    private final String treatment;

    public /* synthetic */ TapGestureArmer(int i, String str, ArmedInteractionState armedInteractionState, Function0 function0, Function3 function3, Function1 function1, Function1 function12, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, armedInteractionState, function0, (i2 & 16) != 0 ? AnonymousClass1.INSTANCE : function3, (i2 & 32) != 0 ? new IconKt$$ExternalSyntheticLambda0(2) : function1, (i2 & 64) != 0 ? new IconKt$$ExternalSyntheticLambda0(3) : function12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(long j) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(long j) {
        return Unit.INSTANCE;
    }

    private final void arm(Gesture tapGesture, TapTarget target, long tapUpTimeMs) {
        this.arming.arm(new Armed(tapUpTimeMs, target.getLabel(), target.isReactNative(), this.treatment, tapGesture.getRawX(), tapGesture.getRawY()));
    }

    private final boolean isSameSpot(MotionEvent event, float rawX, float rawY) {
        return ((float) Math.hypot((double) (event.getRawX() - rawX), (double) (event.getRawY() - rawY))) <= ((float) this.touchSlopPx);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c8, code lost:
    
        if (r3 < 200) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onTouchEvent(@org.jetbrains.annotations.NotNull android.view.MotionEvent r14, @org.jetbrains.annotations.Nullable android.view.View r15) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.pmi.implementation.taplatency.TapGestureArmer.onTouchEvent(android.view.MotionEvent, android.view.View):void");
    }

    public final void reset() {
        this.gesture = null;
        this.lastCleanTap = null;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.amazon.alexa.pmi.implementation.taplatency.TapGestureArmer$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function3<View, Float, Float, TapTarget> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(3, TapGestureArmerKt.class, "defaultTapHitTest", "defaultTapHitTest(Landroid/view/View;FF)Lcom/amazon/alexa/pmi/implementation/taplatency/TapTarget;", 1);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ TapTarget invoke(View view, Float f, Float f2) {
            return invoke(view, f.floatValue(), f2.floatValue());
        }

        public final TapTarget invoke(View view, float f, float f2) {
            return TapGestureArmerKt.defaultTapHitTest(view, f, f2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TapGestureArmer(int i, @NotNull String str, @NotNull ArmedInteractionState armedInteractionState, @NotNull Function0<Boolean> function0, @NotNull Function3<? super View, ? super Float, ? super Float, TapTarget> function3, @NotNull Function1<? super Long, Unit> function1, @NotNull Function1<? super Long, Unit> function12) {
        str.getClass();
        armedInteractionState.getClass();
        function0.getClass();
        function3.getClass();
        function1.getClass();
        function12.getClass();
        this.touchSlopPx = i;
        this.treatment = str;
        this.arming = armedInteractionState;
        this.shouldSample = function0;
        this.hitTest = function3;
        this.onTapUp = function1;
        this.onTouchDown = function12;
    }
}
