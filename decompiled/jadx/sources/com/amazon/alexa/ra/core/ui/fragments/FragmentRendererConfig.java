package com.amazon.alexa.ra.core.ui.fragments;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import com.amazon.alexa.accessorykit.ModelTransformer;
import com.amazon.alexa.ra.core.data.fragments.FragmentData;
import com.amazon.alexa.ra.core.data.model.InputBarEvents$$ExternalSyntheticLambda2;
import com.amazon.alexa.ra.core.ui.RaThemeKt$$ExternalSyntheticLambda0;
import com.amazon.alexa.ra.core.ui.events.UiElementInteractedEvent;
import com.amazon.alexa.ra.core.ui.events.UiElementRenderUpdateEvent;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.facebook.react.uimanager.ViewProps;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000b\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u0015\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000bHÆ\u0003J\u0015\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000bHÆ\u0003J\u0015\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000bHÆ\u0003J\u0015\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u000bHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u0010\u00102\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b3\u0010\u001bJ¶\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000b2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u0016HÆ\u0001¢\u0006\u0004\b5\u00106J\u0013\u00107\u001a\u00020\u00032\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020<HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0019R\u0013\u0010\u0015\u001a\u00020\u0016¢\u0006\n\n\u0002\u0010'\u001a\u0004\b&\u0010\u001b¨\u0006="}, d2 = {"Lcom/amazon/alexa/ra/core/ui/fragments/FragmentRendererConfig;", "", "isEnabled", "", "alpha", "", ModelTransformer.KEY_BATTERY_SCALE, ViewProps.ON_CLICK, "Lkotlin/Function0;", "", "onLongClick", "Lkotlin/Function1;", "Lcom/amazon/alexa/ra/core/data/fragments/FragmentData;", "onFragmentAction", "onUiElementRenderUpdateEvent", "Lcom/amazon/alexa/ra/core/ui/events/UiElementRenderUpdateEvent;", "onUiElementInteractedEvent", "Lcom/amazon/alexa/ra/core/ui/events/UiElementInteractedEvent;", "authTokenProvider", "Lcom/amazon/alexa/ra/core/ui/fragments/AuthTokenProvider;", "isLargeScreenDevice", "availableWidth", "Landroidx/compose/ui/unit/Dp;", "<init>", "(ZFFLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/amazon/alexa/ra/core/ui/fragments/AuthTokenProvider;ZFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "()Z", "getAlpha", "()F", "getScale", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "getOnLongClick", "()Lkotlin/jvm/functions/Function1;", "getOnFragmentAction", "getOnUiElementRenderUpdateEvent", "getOnUiElementInteractedEvent", "getAuthTokenProvider", "()Lcom/amazon/alexa/ra/core/ui/fragments/AuthTokenProvider;", "getAvailableWidth-D9Ej5fM", "F", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component11-D9Ej5fM", "copy", "copy-7IhJQOk", "(ZFFLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/amazon/alexa/ra/core/ui/fragments/AuthTokenProvider;ZF)Lcom/amazon/alexa/ra/core/ui/fragments/FragmentRendererConfig;", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class FragmentRendererConfig {
    public static final int $stable = 8;
    private final float alpha;

    @Nullable
    private final AuthTokenProvider authTokenProvider;
    private final float availableWidth;
    private final boolean isEnabled;
    private final boolean isLargeScreenDevice;

    @NotNull
    private final Function0<Unit> onClick;

    @NotNull
    private final Function1<FragmentData, Unit> onFragmentAction;

    @NotNull
    private final Function1<FragmentData, Unit> onLongClick;

    @NotNull
    private final Function1<UiElementInteractedEvent, Unit> onUiElementInteractedEvent;

    @NotNull
    private final Function1<UiElementRenderUpdateEvent, Unit> onUiElementRenderUpdateEvent;
    private final float scale;

    public /* synthetic */ FragmentRendererConfig(boolean z, float f, float f2, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Function1 function14, AuthTokenProvider authTokenProvider, boolean z2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? 1.0f : f, (i & 4) == 0 ? f2 : 1.0f, (i & 8) != 0 ? new RaThemeKt$$ExternalSyntheticLambda0(28) : function0, (i & 16) != 0 ? new InputBarEvents$$ExternalSyntheticLambda2(21) : function1, (i & 32) != 0 ? new InputBarEvents$$ExternalSyntheticLambda2(22) : function12, (i & 64) != 0 ? new InputBarEvents$$ExternalSyntheticLambda2(23) : function13, (i & 128) != 0 ? new InputBarEvents$$ExternalSyntheticLambda2(24) : function14, (i & 256) != 0 ? null : authTokenProvider, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? Dp.INSTANCE.m7388getUnspecifiedD9Ej5fM() : f3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(FragmentData fragmentData) {
        fragmentData.getClass();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$2(FragmentData fragmentData) {
        fragmentData.getClass();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$3(UiElementRenderUpdateEvent uiElementRenderUpdateEvent) {
        uiElementRenderUpdateEvent.getClass();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$4(UiElementInteractedEvent uiElementInteractedEvent) {
        uiElementInteractedEvent.getClass();
        return Unit.INSTANCE;
    }

    /* renamed from: copy-7IhJQOk$default, reason: not valid java name */
    public static /* synthetic */ FragmentRendererConfig m18888copy7IhJQOk$default(FragmentRendererConfig fragmentRendererConfig, boolean z, float f, float f2, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Function1 function14, AuthTokenProvider authTokenProvider, boolean z2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = fragmentRendererConfig.isEnabled;
        }
        if ((i & 2) != 0) {
            f = fragmentRendererConfig.alpha;
        }
        if ((i & 4) != 0) {
            f2 = fragmentRendererConfig.scale;
        }
        if ((i & 8) != 0) {
            function0 = fragmentRendererConfig.onClick;
        }
        if ((i & 16) != 0) {
            function1 = fragmentRendererConfig.onLongClick;
        }
        if ((i & 32) != 0) {
            function12 = fragmentRendererConfig.onFragmentAction;
        }
        if ((i & 64) != 0) {
            function13 = fragmentRendererConfig.onUiElementRenderUpdateEvent;
        }
        if ((i & 128) != 0) {
            function14 = fragmentRendererConfig.onUiElementInteractedEvent;
        }
        if ((i & 256) != 0) {
            authTokenProvider = fragmentRendererConfig.authTokenProvider;
        }
        if ((i & 512) != 0) {
            z2 = fragmentRendererConfig.isLargeScreenDevice;
        }
        if ((i & 1024) != 0) {
            f3 = fragmentRendererConfig.availableWidth;
        }
        boolean z3 = z2;
        float f4 = f3;
        Function1 function15 = function14;
        AuthTokenProvider authTokenProvider2 = authTokenProvider;
        Function1 function16 = function12;
        Function1 function17 = function13;
        Function1 function18 = function1;
        float f5 = f2;
        return fragmentRendererConfig.m18890copy7IhJQOk(z, f, f5, function0, function18, function16, function17, function15, authTokenProvider2, z3, f4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsLargeScreenDevice() {
        return this.isLargeScreenDevice;
    }

    /* renamed from: component11-D9Ej5fM, reason: not valid java name and from getter */
    public final float getAvailableWidth() {
        return this.availableWidth;
    }

    /* renamed from: component2, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    /* renamed from: component3, reason: from getter */
    public final float getScale() {
        return this.scale;
    }

    @NotNull
    public final Function0<Unit> component4() {
        return this.onClick;
    }

    @NotNull
    public final Function1<FragmentData, Unit> component5() {
        return this.onLongClick;
    }

    @NotNull
    public final Function1<FragmentData, Unit> component6() {
        return this.onFragmentAction;
    }

    @NotNull
    public final Function1<UiElementRenderUpdateEvent, Unit> component7() {
        return this.onUiElementRenderUpdateEvent;
    }

    @NotNull
    public final Function1<UiElementInteractedEvent, Unit> component8() {
        return this.onUiElementInteractedEvent;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final AuthTokenProvider getAuthTokenProvider() {
        return this.authTokenProvider;
    }

    @NotNull
    /* renamed from: copy-7IhJQOk, reason: not valid java name */
    public final FragmentRendererConfig m18890copy7IhJQOk(boolean isEnabled, float alpha, float scale, @NotNull Function0<Unit> onClick, @NotNull Function1<? super FragmentData, Unit> onLongClick, @NotNull Function1<? super FragmentData, Unit> onFragmentAction, @NotNull Function1<? super UiElementRenderUpdateEvent, Unit> onUiElementRenderUpdateEvent, @NotNull Function1<? super UiElementInteractedEvent, Unit> onUiElementInteractedEvent, @Nullable AuthTokenProvider authTokenProvider, boolean isLargeScreenDevice, float availableWidth) {
        onClick.getClass();
        onLongClick.getClass();
        onFragmentAction.getClass();
        onUiElementRenderUpdateEvent.getClass();
        onUiElementInteractedEvent.getClass();
        return new FragmentRendererConfig(isEnabled, alpha, scale, onClick, onLongClick, onFragmentAction, onUiElementRenderUpdateEvent, onUiElementInteractedEvent, authTokenProvider, isLargeScreenDevice, availableWidth, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FragmentRendererConfig)) {
            return false;
        }
        FragmentRendererConfig fragmentRendererConfig = (FragmentRendererConfig) other;
        return this.isEnabled == fragmentRendererConfig.isEnabled && Float.compare(this.alpha, fragmentRendererConfig.alpha) == 0 && Float.compare(this.scale, fragmentRendererConfig.scale) == 0 && Intrinsics.areEqual(this.onClick, fragmentRendererConfig.onClick) && Intrinsics.areEqual(this.onLongClick, fragmentRendererConfig.onLongClick) && Intrinsics.areEqual(this.onFragmentAction, fragmentRendererConfig.onFragmentAction) && Intrinsics.areEqual(this.onUiElementRenderUpdateEvent, fragmentRendererConfig.onUiElementRenderUpdateEvent) && Intrinsics.areEqual(this.onUiElementInteractedEvent, fragmentRendererConfig.onUiElementInteractedEvent) && Intrinsics.areEqual(this.authTokenProvider, fragmentRendererConfig.authTokenProvider) && this.isLargeScreenDevice == fragmentRendererConfig.isLargeScreenDevice && Dp.m7373equalsimpl0(this.availableWidth, fragmentRendererConfig.availableWidth);
    }

    public final float getAlpha() {
        return this.alpha;
    }

    @Nullable
    public final AuthTokenProvider getAuthTokenProvider() {
        return this.authTokenProvider;
    }

    /* renamed from: getAvailableWidth-D9Ej5fM, reason: not valid java name */
    public final float m18891getAvailableWidthD9Ej5fM() {
        return this.availableWidth;
    }

    @NotNull
    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    @NotNull
    public final Function1<FragmentData, Unit> getOnFragmentAction() {
        return this.onFragmentAction;
    }

    @NotNull
    public final Function1<FragmentData, Unit> getOnLongClick() {
        return this.onLongClick;
    }

    @NotNull
    public final Function1<UiElementInteractedEvent, Unit> getOnUiElementInteractedEvent() {
        return this.onUiElementInteractedEvent;
    }

    @NotNull
    public final Function1<UiElementRenderUpdateEvent, Unit> getOnUiElementRenderUpdateEvent() {
        return this.onUiElementRenderUpdateEvent;
    }

    public final float getScale() {
        return this.scale;
    }

    public int hashCode() {
        int m = DoubleList$$ExternalSyntheticOutline0.m(DoubleList$$ExternalSyntheticOutline0.m(DoubleList$$ExternalSyntheticOutline0.m(DoubleList$$ExternalSyntheticOutline0.m(DoubleList$$ExternalSyntheticOutline0.m(DoubleList$$ExternalSyntheticOutline0.m(this.scale, DoubleList$$ExternalSyntheticOutline0.m(this.alpha, Boolean.hashCode(this.isEnabled) * 31, 31), 31), 31, this.onClick), 31, (Function1) this.onLongClick), 31, (Function1) this.onFragmentAction), 31, (Function1) this.onUiElementRenderUpdateEvent), 31, (Function1) this.onUiElementInteractedEvent);
        AuthTokenProvider authTokenProvider = this.authTokenProvider;
        return Dp.m7374hashCodeimpl(this.availableWidth) + DoubleList$$ExternalSyntheticOutline0.m(this.isLargeScreenDevice, (m + (authTokenProvider == null ? 0 : authTokenProvider.hashCode())) * 31, 31);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isLargeScreenDevice() {
        return this.isLargeScreenDevice;
    }

    @NotNull
    public String toString() {
        boolean z = this.isEnabled;
        float f = this.alpha;
        float f2 = this.scale;
        Function0<Unit> function0 = this.onClick;
        Function1<FragmentData, Unit> function1 = this.onLongClick;
        Function1<FragmentData, Unit> function12 = this.onFragmentAction;
        Function1<UiElementRenderUpdateEvent, Unit> function13 = this.onUiElementRenderUpdateEvent;
        Function1<UiElementInteractedEvent, Unit> function14 = this.onUiElementInteractedEvent;
        AuthTokenProvider authTokenProvider = this.authTokenProvider;
        boolean z2 = this.isLargeScreenDevice;
        String m7379toStringimpl = Dp.m7379toStringimpl(this.availableWidth);
        StringBuilder sb = new StringBuilder("FragmentRendererConfig(isEnabled=");
        sb.append(z);
        sb.append(", alpha=");
        sb.append(f);
        sb.append(", scale=");
        sb.append(f2);
        sb.append(", onClick=");
        sb.append(function0);
        sb.append(", onLongClick=");
        sb.append(function1);
        sb.append(", onFragmentAction=");
        sb.append(function12);
        sb.append(", onUiElementRenderUpdateEvent=");
        sb.append(function13);
        sb.append(", onUiElementInteractedEvent=");
        sb.append(function14);
        sb.append(", authTokenProvider=");
        sb.append(authTokenProvider);
        sb.append(", isLargeScreenDevice=");
        sb.append(z2);
        sb.append(", availableWidth=");
        return a$$ExternalSyntheticOutline0.m(sb, m7379toStringimpl, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private FragmentRendererConfig(boolean z, float f, float f2, Function0<Unit> function0, Function1<? super FragmentData, Unit> function1, Function1<? super FragmentData, Unit> function12, Function1<? super UiElementRenderUpdateEvent, Unit> function13, Function1<? super UiElementInteractedEvent, Unit> function14, AuthTokenProvider authTokenProvider, boolean z2, float f3) {
        function0.getClass();
        function1.getClass();
        function12.getClass();
        function13.getClass();
        function14.getClass();
        this.isEnabled = z;
        this.alpha = f;
        this.scale = f2;
        this.onClick = function0;
        this.onLongClick = function1;
        this.onFragmentAction = function12;
        this.onUiElementRenderUpdateEvent = function13;
        this.onUiElementInteractedEvent = function14;
        this.authTokenProvider = authTokenProvider;
        this.isLargeScreenDevice = z2;
        this.availableWidth = f3;
    }

    public /* synthetic */ FragmentRendererConfig(boolean z, float f, float f2, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Function1 function14, AuthTokenProvider authTokenProvider, boolean z2, float f3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, f2, function0, function1, function12, function13, function14, authTokenProvider, z2, f3);
    }
}
