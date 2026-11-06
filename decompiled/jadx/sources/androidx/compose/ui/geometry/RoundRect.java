package androidx.compose.ui.geometry;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.runtime.Immutable;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.mobile.heremapsexplore.Constants.ReactProperties;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Immutable
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0001?BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u001e\u001a\u00020\u0000H\u0002J(\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0003H\u0002J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0086\u0002¢\u0006\u0004\b(\u0010)J\b\u0010*\u001a\u00020+H\u0016J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u0010\u00100\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b1\u0010\u0014J\u0010\u00102\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b3\u0010\u0014J\u0010\u00104\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b5\u0010\u0014J\u0010\u00106\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b7\u0010\u0014J`\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b9\u0010:J\u0013\u0010;\u001a\u00020%2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020>HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u00020\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u00020\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\n\u001a\u00020\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\u000b\u001a\u00020\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000fR\u0011\u0010\u001b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000fR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect;", "", "left", "", "top", "right", "bottom", "topLeftCornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "topRightCornerRadius", "bottomRightCornerRadius", "bottomLeftCornerRadius", "<init>", "(FFFFJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLeft", "()F", "getTop", "getRight", "getBottom", "getTopLeftCornerRadius-kKHJgLs", "()J", "J", "getTopRightCornerRadius-kKHJgLs", "getBottomRightCornerRadius-kKHJgLs", "getBottomLeftCornerRadius-kKHJgLs", "width", "getWidth", "height", "getHeight", "_scaledRadiiRect", "scaledRadiiRect", "minRadius", ReactProperties.GEOFENCE_MINIMUM_RANGE, "radius1", "radius2", "limit", "contains", "", "point", "Landroidx/compose/ui/geometry/Offset;", "contains-k-4lQ0M", "(J)Z", "toString", "", "component1", "component2", "component3", "component4", "component5", "component5-kKHJgLs", "component6", "component6-kKHJgLs", "component7", "component7-kKHJgLs", "component8", "component8-kKHJgLs", "copy", "copy-MDFrsts", "(FFFFJJJJ)Landroidx/compose/ui/geometry/RoundRect;", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "Companion", "ui-geometry"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRoundRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundRect.kt\nandroidx/compose/ui/geometry/RoundRect\n+ 2 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n1#1,423:1\n53#2:424\n48#2:427\n53#2:430\n48#2:433\n48#2:436\n53#2:439\n48#2:446\n53#2:449\n48#2:456\n53#2:459\n48#2:466\n53#2:469\n48#2:484\n53#2:488\n48#2:492\n53#2:496\n48#2:497\n53#2:500\n48#2:506\n53#2:510\n48#2:514\n53#2:518\n48#2:519\n53#2:522\n48#2:528\n53#2:532\n48#2:536\n53#2:540\n48#2:541\n53#2:544\n48#2:550\n53#2:554\n48#2:558\n53#2:562\n48#2:563\n53#2:566\n48#2:569\n53#2:572\n48#2:574\n48#2:577\n53#2:580\n70#3:425\n60#3:428\n70#3:431\n60#3:434\n60#3:437\n70#3:440\n53#3,3:443\n60#3:447\n70#3:450\n53#3,3:453\n60#3:457\n70#3:460\n53#3,3:463\n60#3:467\n70#3:470\n53#3,3:473\n60#3:477\n70#3:480\n60#3:482\n70#3:486\n60#3:490\n70#3:494\n60#3:498\n70#3:501\n60#3:504\n70#3:508\n60#3:512\n70#3:516\n60#3:520\n70#3:523\n60#3:526\n70#3:530\n60#3:534\n70#3:538\n60#3:542\n70#3:545\n60#3:548\n70#3:552\n60#3:556\n70#3:560\n60#3:564\n70#3:567\n60#3:570\n70#3:573\n60#3:575\n60#3:578\n70#3:581\n22#4:426\n22#4:429\n22#4:432\n22#4:435\n22#4:438\n22#4:441\n22#4:448\n22#4:451\n22#4:458\n22#4:461\n22#4:468\n22#4:471\n22#4:478\n22#4:483\n22#4:487\n22#4:491\n22#4:495\n22#4:499\n22#4:502\n22#4:505\n22#4:509\n22#4:513\n22#4:517\n22#4:521\n22#4:524\n22#4:527\n22#4:531\n22#4:535\n22#4:539\n22#4:543\n22#4:546\n22#4:549\n22#4:553\n22#4:557\n22#4:561\n22#4:565\n22#4:568\n22#4:571\n22#4:576\n22#4:579\n22#4:582\n33#5:442\n33#5:452\n33#5:462\n33#5:472\n65#6:476\n69#6:479\n65#6:481\n69#6:485\n65#6:489\n69#6:493\n65#6:503\n69#6:507\n65#6:511\n69#6:515\n65#6:525\n69#6:529\n65#6:533\n69#6:537\n65#6:547\n69#6:551\n65#6:555\n69#6:559\n*S KotlinDebug\n*F\n+ 1 RoundRect.kt\nandroidx/compose/ui/geometry/RoundRect\n*L\n73#1:424\n74#1:427\n76#1:430\n78#1:433\n87#1:436\n88#1:439\n92#1:446\n93#1:449\n97#1:456\n98#1:459\n102#1:466\n103#1:469\n149#1:484\n150#1:488\n152#1:492\n153#1:496\n154#1:497\n155#1:500\n157#1:506\n158#1:510\n160#1:514\n161#1:518\n162#1:519\n163#1:522\n165#1:528\n166#1:532\n168#1:536\n169#1:540\n170#1:541\n171#1:544\n173#1:550\n174#1:554\n176#1:558\n177#1:562\n178#1:563\n179#1:566\n203#1:569\n203#1:572\n204#1:574\n206#1:577\n207#1:580\n73#1:425\n74#1:428\n76#1:431\n78#1:434\n87#1:437\n88#1:440\n86#1:443,3\n92#1:447\n93#1:450\n91#1:453,3\n97#1:457\n98#1:460\n96#1:463,3\n102#1:467\n103#1:470\n101#1:473,3\n135#1:477\n135#1:480\n149#1:482\n150#1:486\n152#1:490\n153#1:494\n154#1:498\n155#1:501\n157#1:504\n158#1:508\n160#1:512\n161#1:516\n162#1:520\n163#1:523\n165#1:526\n166#1:530\n168#1:534\n169#1:538\n170#1:542\n171#1:545\n173#1:548\n174#1:552\n176#1:556\n177#1:560\n178#1:564\n179#1:567\n203#1:570\n203#1:573\n204#1:575\n206#1:578\n207#1:581\n73#1:426\n74#1:429\n76#1:432\n78#1:435\n87#1:438\n88#1:441\n92#1:448\n93#1:451\n97#1:458\n98#1:461\n102#1:468\n103#1:471\n135#1:478\n149#1:483\n150#1:487\n152#1:491\n153#1:495\n154#1:499\n155#1:502\n157#1:505\n158#1:509\n160#1:513\n161#1:517\n162#1:521\n163#1:524\n165#1:527\n166#1:531\n168#1:535\n169#1:539\n170#1:543\n171#1:546\n173#1:549\n174#1:553\n176#1:557\n177#1:561\n178#1:565\n179#1:568\n203#1:571\n204#1:576\n206#1:579\n207#1:582\n86#1:442\n91#1:452\n96#1:462\n101#1:472\n135#1:476\n135#1:479\n149#1:481\n150#1:485\n152#1:489\n153#1:493\n157#1:503\n158#1:507\n160#1:511\n161#1:515\n165#1:525\n166#1:529\n168#1:533\n169#1:537\n173#1:547\n174#1:551\n176#1:555\n177#1:559\n*E\n"})
/* loaded from: classes13.dex */
public final /* data */ class RoundRect {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final RoundRect Zero = RoundRectKt.m4454RoundRectgG7oq9Y(0.0f, 0.0f, 0.0f, 0.0f, CornerRadius.INSTANCE.m4372getZerokKHJgLs());

    @Nullable
    private RoundRect _scaledRadiiRect;
    private final float bottom;
    private final long bottomLeftCornerRadius;
    private final long bottomRightCornerRadius;
    private final float left;
    private final float right;
    private final float top;
    private final long topLeftCornerRadius;
    private final long topRightCornerRadius;

    public /* synthetic */ RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, (i & 16) != 0 ? CornerRadius.INSTANCE.m4372getZerokKHJgLs() : j, (i & 32) != 0 ? CornerRadius.INSTANCE.m4372getZerokKHJgLs() : j2, (i & 64) != 0 ? CornerRadius.INSTANCE.m4372getZerokKHJgLs() : j3, (i & 128) != 0 ? CornerRadius.INSTANCE.m4372getZerokKHJgLs() : j4, null);
    }

    /* renamed from: copy-MDFrsts$default, reason: not valid java name */
    public static /* synthetic */ RoundRect m4441copyMDFrsts$default(RoundRect roundRect, float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = roundRect.left;
        }
        if ((i & 2) != 0) {
            f2 = roundRect.top;
        }
        if ((i & 4) != 0) {
            f3 = roundRect.right;
        }
        if ((i & 8) != 0) {
            f4 = roundRect.bottom;
        }
        if ((i & 16) != 0) {
            j = roundRect.topLeftCornerRadius;
        }
        if ((i & 32) != 0) {
            j2 = roundRect.topRightCornerRadius;
        }
        if ((i & 64) != 0) {
            j3 = roundRect.bottomRightCornerRadius;
        }
        if ((i & 128) != 0) {
            j4 = roundRect.bottomLeftCornerRadius;
        }
        long j5 = j4;
        long j6 = j3;
        long j7 = j2;
        long j8 = j;
        return roundRect.m4447copyMDFrsts(f, f2, f3, f4, j8, j7, j6, j5);
    }

    @NotNull
    public static final RoundRect getZero() {
        return INSTANCE.getZero();
    }

    private final float minRadius(float min, float radius1, float radius2, float limit) {
        float f = radius1 + radius2;
        return f > limit ? f == 0.0f ? min : Math.min(min, limit / f) : min;
    }

    private final RoundRect scaledRadiiRect() {
        RoundRect roundRect = this._scaledRadiiRect;
        if (roundRect != null) {
            return roundRect;
        }
        float minRadius = minRadius(minRadius(minRadius(minRadius(1.0f, Float.intBitsToFloat((int) (this.bottomLeftCornerRadius & 4294967295L)), Float.intBitsToFloat((int) (this.topLeftCornerRadius & 4294967295L)), getHeight()), Float.intBitsToFloat((int) (this.topLeftCornerRadius >> 32)), Float.intBitsToFloat((int) (this.topRightCornerRadius >> 32)), getWidth()), Float.intBitsToFloat((int) (this.topRightCornerRadius & 4294967295L)), Float.intBitsToFloat((int) (this.bottomRightCornerRadius & 4294967295L)), getHeight()), Float.intBitsToFloat((int) (this.bottomRightCornerRadius >> 32)), Float.intBitsToFloat((int) (this.bottomLeftCornerRadius >> 32)), getWidth());
        float f = this.left * minRadius;
        float f2 = this.top * minRadius;
        float f3 = this.right * minRadius;
        float f4 = this.bottom * minRadius;
        float intBitsToFloat = Float.intBitsToFloat((int) (this.topLeftCornerRadius >> 32)) * minRadius;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.topLeftCornerRadius & 4294967295L)) * minRadius;
        long m4354constructorimpl = CornerRadius.m4354constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (this.topRightCornerRadius >> 32)) * minRadius;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (this.topRightCornerRadius & 4294967295L)) * minRadius;
        long m4354constructorimpl2 = CornerRadius.m4354constructorimpl((Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (this.bottomRightCornerRadius >> 32)) * minRadius;
        float intBitsToFloat6 = Float.intBitsToFloat((int) (this.bottomRightCornerRadius & 4294967295L)) * minRadius;
        long m4354constructorimpl3 = CornerRadius.m4354constructorimpl((Float.floatToRawIntBits(intBitsToFloat6) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat5) << 32));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (this.bottomLeftCornerRadius >> 32)) * minRadius;
        float intBitsToFloat8 = Float.intBitsToFloat((int) (this.bottomLeftCornerRadius & 4294967295L)) * minRadius;
        RoundRect roundRect2 = new RoundRect(f, f2, f3, f4, m4354constructorimpl, m4354constructorimpl2, m4354constructorimpl3, CornerRadius.m4354constructorimpl((Float.floatToRawIntBits(intBitsToFloat7) << 32) | (Float.floatToRawIntBits(intBitsToFloat8) & 4294967295L)), null);
        this._scaledRadiiRect = roundRect2;
        return roundRect2;
    }

    /* renamed from: component1, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    /* renamed from: component2, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* renamed from: component3, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    /* renamed from: component4, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: component5-kKHJgLs, reason: not valid java name and from getter */
    public final long getTopLeftCornerRadius() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: component6-kKHJgLs, reason: not valid java name and from getter */
    public final long getTopRightCornerRadius() {
        return this.topRightCornerRadius;
    }

    /* renamed from: component7-kKHJgLs, reason: not valid java name and from getter */
    public final long getBottomRightCornerRadius() {
        return this.bottomRightCornerRadius;
    }

    /* renamed from: component8-kKHJgLs, reason: not valid java name and from getter */
    public final long getBottomLeftCornerRadius() {
        return this.bottomLeftCornerRadius;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01a5 A[RETURN] */
    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m4446containsk4lQ0M(long r11) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.geometry.RoundRect.m4446containsk4lQ0M(long):boolean");
    }

    @NotNull
    /* renamed from: copy-MDFrsts, reason: not valid java name */
    public final RoundRect m4447copyMDFrsts(float left, float top, float right, float bottom, long topLeftCornerRadius, long topRightCornerRadius, long bottomRightCornerRadius, long bottomLeftCornerRadius) {
        return new RoundRect(left, top, right, bottom, topLeftCornerRadius, topRightCornerRadius, bottomRightCornerRadius, bottomLeftCornerRadius, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoundRect)) {
            return false;
        }
        RoundRect roundRect = (RoundRect) other;
        return Float.compare(this.left, roundRect.left) == 0 && Float.compare(this.top, roundRect.top) == 0 && Float.compare(this.right, roundRect.right) == 0 && Float.compare(this.bottom, roundRect.bottom) == 0 && CornerRadius.m4359equalsimpl0(this.topLeftCornerRadius, roundRect.topLeftCornerRadius) && CornerRadius.m4359equalsimpl0(this.topRightCornerRadius, roundRect.topRightCornerRadius) && CornerRadius.m4359equalsimpl0(this.bottomRightCornerRadius, roundRect.bottomRightCornerRadius) && CornerRadius.m4359equalsimpl0(this.bottomLeftCornerRadius, roundRect.bottomLeftCornerRadius);
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: getBottomLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m4448getBottomLeftCornerRadiuskKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    /* renamed from: getBottomRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m4449getBottomRightCornerRadiuskKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    /* renamed from: getTopLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m4450getTopLeftCornerRadiuskKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: getTopRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m4451getTopRightCornerRadiuskKHJgLs() {
        return this.topRightCornerRadius;
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return CornerRadius.m4362hashCodeimpl(this.bottomLeftCornerRadius) + ((CornerRadius.m4362hashCodeimpl(this.bottomRightCornerRadius) + ((CornerRadius.m4362hashCodeimpl(this.topRightCornerRadius) + ((CornerRadius.m4362hashCodeimpl(this.topLeftCornerRadius) + DoubleList$$ExternalSyntheticOutline0.m(this.bottom, DoubleList$$ExternalSyntheticOutline0.m(this.right, DoubleList$$ExternalSyntheticOutline0.m(this.top, Float.hashCode(this.left) * 31, 31), 31), 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        long j = this.topLeftCornerRadius;
        long j2 = this.topRightCornerRadius;
        long j3 = this.bottomRightCornerRadius;
        long j4 = this.bottomLeftCornerRadius;
        String str = GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1);
        if (!CornerRadius.m4359equalsimpl0(j, j2) || !CornerRadius.m4359equalsimpl0(j2, j3) || !CornerRadius.m4359equalsimpl0(j3, j4)) {
            StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("RoundRect(rect=", str, ", topLeft=");
            m2m.append((Object) CornerRadius.m4368toStringimpl(j));
            m2m.append(", topRight=");
            m2m.append((Object) CornerRadius.m4368toStringimpl(j2));
            m2m.append(", bottomRight=");
            m2m.append((Object) CornerRadius.m4368toStringimpl(j3));
            m2m.append(", bottomLeft=");
            m2m.append((Object) CornerRadius.m4368toStringimpl(j4));
            m2m.append(')');
            return m2m.toString();
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            StringBuilder m2m2 = a$$ExternalSyntheticOutline0.m2m("RoundRect(rect=", str, ", radius=");
            m2m2.append(GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i), 1));
            m2m2.append(')');
            return m2m2.toString();
        }
        StringBuilder m2m3 = a$$ExternalSyntheticOutline0.m2m("RoundRect(rect=", str, ", x=");
        m2m3.append(GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i), 1));
        m2m3.append(", y=");
        m2m3.append(GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i2), 1));
        m2m3.append(')');
        return m2m3.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect$Companion;", "", "<init>", "()V", "Zero", "Landroidx/compose/ui/geometry/RoundRect;", "getZero$annotations", "getZero", "()Landroidx/compose/ui/geometry/RoundRect;", "ui-geometry"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RoundRect getZero() {
            return RoundRect.Zero;
        }

        private Companion() {
        }

        @JvmStatic
        public static /* synthetic */ void getZero$annotations() {
        }
    }

    private RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
        this.topLeftCornerRadius = j;
        this.topRightCornerRadius = j2;
        this.bottomRightCornerRadius = j3;
        this.bottomLeftCornerRadius = j4;
    }

    public /* synthetic */ RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, j, j2, j3, j4);
    }
}
