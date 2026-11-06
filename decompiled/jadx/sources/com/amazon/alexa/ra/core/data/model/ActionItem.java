package com.amazon.alexa.ra.core.data.model;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.RaIconSlot;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.dee.app.elements.bridges.LocationRecoveryTurboModuleDelegate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0087\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u00103\u001a\u00020\n2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u00068"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/ActionItem;", "", "actionIcon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "actionDesc", "", "onAction", "Lkotlin/Function0;", "", "shouldShow", "", "iconSlot", "Lcom/amazon/alexa/ra/core/ui/RaIconSlot;", LocationRecoveryTurboModuleDelegate.KEY_HAS_BACKGROUND, "usesPressedBackground", "usesReducedWidth", "alexaTestTag", "onClickLabel", "backgroundShape", "Landroidx/compose/ui/graphics/Shape;", "<init>", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLcom/amazon/alexa/ra/core/ui/RaIconSlot;ZZZLjava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/Shape;)V", "getActionIcon", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "getActionDesc", "()Ljava/lang/String;", "getOnAction", "()Lkotlin/jvm/functions/Function0;", "getShouldShow", "()Z", "getIconSlot", "()Lcom/amazon/alexa/ra/core/ui/RaIconSlot;", "getHasBackground", "getUsesPressedBackground", "getUsesReducedWidth", "getAlexaTestTag", "getOnClickLabel", "getBackgroundShape", "()Landroidx/compose/ui/graphics/Shape;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class ActionItem {
    public static final int $stable = 0;

    @NotNull
    private final String actionDesc;

    @Nullable
    private final ImageVector actionIcon;

    @Nullable
    private final String alexaTestTag;

    @Nullable
    private final Shape backgroundShape;
    private final boolean hasBackground;

    @Nullable
    private final RaIconSlot iconSlot;

    @NotNull
    private final Function0<Unit> onAction;

    @Nullable
    private final String onClickLabel;
    private final boolean shouldShow;
    private final boolean usesPressedBackground;
    private final boolean usesReducedWidth;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ActionItem(androidx.compose.ui.graphics.vector.ImageVector r3, java.lang.String r4, kotlin.jvm.functions.Function0 r5, boolean r6, com.amazon.alexa.ra.core.ui.RaIconSlot r7, boolean r8, boolean r9, boolean r10, java.lang.String r11, java.lang.String r12, androidx.compose.ui.graphics.Shape r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r2 = this;
            r15 = r14 & 1
            r0 = 0
            if (r15 == 0) goto L6
            r3 = r0
        L6:
            r15 = r14 & 2
            if (r15 == 0) goto Lc
            java.lang.String r4 = ""
        Lc:
            r15 = r14 & 4
            if (r15 == 0) goto L16
            com.amazon.alexa.ra.core.data.model.ActionItem$$ExternalSyntheticLambda0 r5 = new com.amazon.alexa.ra.core.data.model.ActionItem$$ExternalSyntheticLambda0
            r15 = 0
            r5.<init>(r15)
        L16:
            r15 = r14 & 8
            r1 = 0
            if (r15 == 0) goto L20
            if (r3 == 0) goto L1f
            r6 = 1
            goto L20
        L1f:
            r6 = r1
        L20:
            r15 = r14 & 16
            if (r15 == 0) goto L25
            r7 = r0
        L25:
            r15 = r14 & 32
            if (r15 == 0) goto L2a
            r8 = r1
        L2a:
            r15 = r14 & 64
            if (r15 == 0) goto L2f
            r9 = r1
        L2f:
            r15 = r14 & 128(0x80, float:1.8E-43)
            if (r15 == 0) goto L34
            r10 = r1
        L34:
            r15 = r14 & 256(0x100, float:3.59E-43)
            if (r15 == 0) goto L39
            r11 = r0
        L39:
            r15 = r14 & 512(0x200, float:7.17E-43)
            if (r15 == 0) goto L3e
            r12 = r0
        L3e:
            r14 = r14 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L43
            r13 = r0
        L43:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.ra.core.data.model.ActionItem.<init>(androidx.compose.ui.graphics.vector.ImageVector, java.lang.String, kotlin.jvm.functions.Function0, boolean, com.amazon.alexa.ra.core.ui.RaIconSlot, boolean, boolean, boolean, java.lang.String, java.lang.String, androidx.compose.ui.graphics.Shape, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ ActionItem copy$default(ActionItem actionItem, ImageVector imageVector, String str, Function0 function0, boolean z, RaIconSlot raIconSlot, boolean z2, boolean z3, boolean z4, String str2, String str3, Shape shape, int i, Object obj) {
        if ((i & 1) != 0) {
            imageVector = actionItem.actionIcon;
        }
        if ((i & 2) != 0) {
            str = actionItem.actionDesc;
        }
        if ((i & 4) != 0) {
            function0 = actionItem.onAction;
        }
        if ((i & 8) != 0) {
            z = actionItem.shouldShow;
        }
        if ((i & 16) != 0) {
            raIconSlot = actionItem.iconSlot;
        }
        if ((i & 32) != 0) {
            z2 = actionItem.hasBackground;
        }
        if ((i & 64) != 0) {
            z3 = actionItem.usesPressedBackground;
        }
        if ((i & 128) != 0) {
            z4 = actionItem.usesReducedWidth;
        }
        if ((i & 256) != 0) {
            str2 = actionItem.alexaTestTag;
        }
        if ((i & 512) != 0) {
            str3 = actionItem.onClickLabel;
        }
        if ((i & 1024) != 0) {
            shape = actionItem.backgroundShape;
        }
        String str4 = str3;
        Shape shape2 = shape;
        boolean z5 = z4;
        String str5 = str2;
        boolean z6 = z2;
        boolean z7 = z3;
        RaIconSlot raIconSlot2 = raIconSlot;
        Function0 function02 = function0;
        return actionItem.copy(imageVector, str, function02, z, raIconSlot2, z6, z7, z5, str5, str4, shape2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final ImageVector getActionIcon() {
        return this.actionIcon;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getOnClickLabel() {
        return this.onClickLabel;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Shape getBackgroundShape() {
        return this.backgroundShape;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getActionDesc() {
        return this.actionDesc;
    }

    @NotNull
    public final Function0<Unit> component3() {
        return this.onAction;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShouldShow() {
        return this.shouldShow;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final RaIconSlot getIconSlot() {
        return this.iconSlot;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getHasBackground() {
        return this.hasBackground;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getUsesPressedBackground() {
        return this.usesPressedBackground;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getUsesReducedWidth() {
        return this.usesReducedWidth;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getAlexaTestTag() {
        return this.alexaTestTag;
    }

    @NotNull
    public final ActionItem copy(@Nullable ImageVector actionIcon, @NotNull String actionDesc, @NotNull Function0<Unit> onAction, boolean shouldShow, @Nullable RaIconSlot iconSlot, boolean hasBackground, boolean usesPressedBackground, boolean usesReducedWidth, @Nullable String alexaTestTag, @Nullable String onClickLabel, @Nullable Shape backgroundShape) {
        actionDesc.getClass();
        onAction.getClass();
        return new ActionItem(actionIcon, actionDesc, onAction, shouldShow, iconSlot, hasBackground, usesPressedBackground, usesReducedWidth, alexaTestTag, onClickLabel, backgroundShape);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionItem)) {
            return false;
        }
        ActionItem actionItem = (ActionItem) other;
        return Intrinsics.areEqual(this.actionIcon, actionItem.actionIcon) && Intrinsics.areEqual(this.actionDesc, actionItem.actionDesc) && Intrinsics.areEqual(this.onAction, actionItem.onAction) && this.shouldShow == actionItem.shouldShow && this.iconSlot == actionItem.iconSlot && this.hasBackground == actionItem.hasBackground && this.usesPressedBackground == actionItem.usesPressedBackground && this.usesReducedWidth == actionItem.usesReducedWidth && Intrinsics.areEqual(this.alexaTestTag, actionItem.alexaTestTag) && Intrinsics.areEqual(this.onClickLabel, actionItem.onClickLabel) && Intrinsics.areEqual(this.backgroundShape, actionItem.backgroundShape);
    }

    @NotNull
    public final String getActionDesc() {
        return this.actionDesc;
    }

    @Nullable
    public final ImageVector getActionIcon() {
        return this.actionIcon;
    }

    @Nullable
    public final String getAlexaTestTag() {
        return this.alexaTestTag;
    }

    @Nullable
    public final Shape getBackgroundShape() {
        return this.backgroundShape;
    }

    public final boolean getHasBackground() {
        return this.hasBackground;
    }

    @Nullable
    public final RaIconSlot getIconSlot() {
        return this.iconSlot;
    }

    @NotNull
    public final Function0<Unit> getOnAction() {
        return this.onAction;
    }

    @Nullable
    public final String getOnClickLabel() {
        return this.onClickLabel;
    }

    public final boolean getShouldShow() {
        return this.shouldShow;
    }

    public final boolean getUsesPressedBackground() {
        return this.usesPressedBackground;
    }

    public final boolean getUsesReducedWidth() {
        return this.usesReducedWidth;
    }

    public int hashCode() {
        ImageVector imageVector = this.actionIcon;
        int m = DoubleList$$ExternalSyntheticOutline0.m(this.shouldShow, DoubleList$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m((imageVector == null ? 0 : imageVector.hashCode()) * 31, 31, this.actionDesc), 31, this.onAction), 31);
        RaIconSlot raIconSlot = this.iconSlot;
        int m2 = DoubleList$$ExternalSyntheticOutline0.m(this.usesReducedWidth, DoubleList$$ExternalSyntheticOutline0.m(this.usesPressedBackground, DoubleList$$ExternalSyntheticOutline0.m(this.hasBackground, (m + (raIconSlot == null ? 0 : raIconSlot.hashCode())) * 31, 31), 31), 31);
        String str = this.alexaTestTag;
        int hashCode = (m2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.onClickLabel;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Shape shape = this.backgroundShape;
        return hashCode2 + (shape != null ? shape.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ImageVector imageVector = this.actionIcon;
        String str = this.actionDesc;
        Function0<Unit> function0 = this.onAction;
        boolean z = this.shouldShow;
        RaIconSlot raIconSlot = this.iconSlot;
        boolean z2 = this.hasBackground;
        boolean z3 = this.usesPressedBackground;
        boolean z4 = this.usesReducedWidth;
        String str2 = this.alexaTestTag;
        String str3 = this.onClickLabel;
        Shape shape = this.backgroundShape;
        StringBuilder sb = new StringBuilder("ActionItem(actionIcon=");
        sb.append(imageVector);
        sb.append(", actionDesc=");
        sb.append(str);
        sb.append(", onAction=");
        sb.append(function0);
        sb.append(", shouldShow=");
        sb.append(z);
        sb.append(", iconSlot=");
        sb.append(raIconSlot);
        sb.append(", hasBackground=");
        sb.append(z2);
        sb.append(", usesPressedBackground=");
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m14726m(sb, z3, ", usesReducedWidth=", z4, ", alexaTestTag=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, str2, ", onClickLabel=", str3, ", backgroundShape=");
        sb.append(shape);
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }

    public ActionItem(@Nullable ImageVector imageVector, @NotNull String str, @NotNull Function0<Unit> function0, boolean z, @Nullable RaIconSlot raIconSlot, boolean z2, boolean z3, boolean z4, @Nullable String str2, @Nullable String str3, @Nullable Shape shape) {
        str.getClass();
        function0.getClass();
        this.actionIcon = imageVector;
        this.actionDesc = str;
        this.onAction = function0;
        this.shouldShow = z;
        this.iconSlot = raIconSlot;
        this.hasBackground = z2;
        this.usesPressedBackground = z3;
        this.usesReducedWidth = z4;
        this.alexaTestTag = str2;
        this.onClickLabel = str3;
        this.backgroundShape = shape;
    }

    public ActionItem() {
        this(null, null, null, false, null, false, false, false, null, null, null, 2047, null);
    }
}
