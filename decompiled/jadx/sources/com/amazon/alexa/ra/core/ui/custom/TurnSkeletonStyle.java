package com.amazon.alexa.ra.core.ui.custom;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Shape;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/TurnSkeletonStyle;", "", "backdrop", "Landroidx/compose/ui/graphics/Color;", ReactTextInputShadowNode.PROP_PLACEHOLDER, "bubble", "bubbleShape", "Landroidx/compose/ui/graphics/Shape;", "smartFragmentShape", "pillShape", "rowAlphas", "", "Landroidx/compose/runtime/State;", "", "<init>", "(JJJLandroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Shape;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackdrop-0d7_KjU", "()J", "J", "getPlaceholder-0d7_KjU", "getBubble-0d7_KjU", "getBubbleShape", "()Landroidx/compose/ui/graphics/Shape;", "getSmartFragmentShape", "getPillShape", "getRowAlphas", "()Ljava/util/List;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
final class TurnSkeletonStyle {
    private final long backdrop;
    private final long bubble;

    @NotNull
    private final Shape bubbleShape;

    @NotNull
    private final Shape pillShape;
    private final long placeholder;

    @NotNull
    private final List<State<Float>> rowAlphas;

    @NotNull
    private final Shape smartFragmentShape;

    /* JADX WARN: Multi-variable type inference failed */
    private TurnSkeletonStyle(long j, long j2, long j3, Shape shape, Shape shape2, Shape shape3, List<? extends State<Float>> list) {
        shape.getClass();
        shape2.getClass();
        shape3.getClass();
        list.getClass();
        this.backdrop = j;
        this.placeholder = j2;
        this.bubble = j3;
        this.bubbleShape = shape;
        this.smartFragmentShape = shape2;
        this.pillShape = shape3;
        this.rowAlphas = list;
    }

    /* renamed from: getBackdrop-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackdrop() {
        return this.backdrop;
    }

    /* renamed from: getBubble-0d7_KjU, reason: not valid java name and from getter */
    public final long getBubble() {
        return this.bubble;
    }

    @NotNull
    public final Shape getBubbleShape() {
        return this.bubbleShape;
    }

    @NotNull
    public final Shape getPillShape() {
        return this.pillShape;
    }

    /* renamed from: getPlaceholder-0d7_KjU, reason: not valid java name and from getter */
    public final long getPlaceholder() {
        return this.placeholder;
    }

    @NotNull
    public final List<State<Float>> getRowAlphas() {
        return this.rowAlphas;
    }

    @NotNull
    public final Shape getSmartFragmentShape() {
        return this.smartFragmentShape;
    }

    public /* synthetic */ TurnSkeletonStyle(long j, long j2, long j3, Shape shape, Shape shape2, Shape shape3, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, shape, shape2, shape3, list);
    }
}
