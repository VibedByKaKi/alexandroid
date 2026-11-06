package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import androidx.annotation.FloatRange;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import com.amazon.alexa.apl.handler.event.LoadIndexListDataEventHandler;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ8\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$H\u0002J'\u0010&\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b'R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019¨\u0006("}, d2 = {"Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "Landroid/text/style/LineHeightSpan;", ViewProps.LINE_HEIGHT, "", LoadIndexListDataEventHandler.START_INDEX_KEY, "", "endIndex", "trimFirstLineTop", "", "trimLastLineBottom", "topRatio", "preserveMinimumHeight", "<init>", "(FIIZZFZ)V", "getLineHeight", "()F", "getTrimLastLineBottom", "()Z", "firstAscent", "ascent", "descent", "lastDescent", "value", "firstAscentDiff", "getFirstAscentDiff", "()I", "lastDescentDiff", "getLastDescentDiff", "chooseHeight", "", "text", "", "start", "end", "spanStartVertical", "fontMetricsInt", "Landroid/graphics/Paint$FontMetricsInt;", "calculateTargetMetrics", "copy", "copy$ui_text", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLineHeightStyleSpan.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LineHeightStyleSpan.android.kt\nandroidx/compose/ui/text/android/style/LineHeightStyleSpan\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,157:1\n81#2,4:158\n*S KotlinDebug\n*F\n+ 1 LineHeightStyleSpan.android.kt\nandroidx/compose/ui/text/android/style/LineHeightStyleSpan\n*L\n68#1:158,4\n*E\n"})
/* loaded from: classes13.dex */
public final class LineHeightStyleSpan implements android.text.style.LineHeightSpan {
    public static final int $stable = 8;
    private final int endIndex;
    private int firstAscentDiff;
    private int lastDescentDiff;
    private final float lineHeight;
    private final boolean preserveMinimumHeight;
    private final int startIndex;
    private final float topRatio;
    private final boolean trimFirstLineTop;
    private final boolean trimLastLineBottom;
    private int firstAscent = Integer.MIN_VALUE;
    private int ascent = Integer.MIN_VALUE;
    private int descent = Integer.MIN_VALUE;
    private int lastDescent = Integer.MIN_VALUE;

    public LineHeightStyleSpan(float f, int i, int i2, boolean z, boolean z2, @FloatRange(from = -1.0d, to = 1.0d) float f2, boolean z3) {
        this.lineHeight = f;
        this.startIndex = i;
        this.endIndex = i2;
        this.trimFirstLineTop = z;
        this.trimLastLineBottom = z2;
        this.topRatio = f2;
        this.preserveMinimumHeight = z3;
        if ((0.0f <= f2 && f2 <= 1.0f) || f2 == -1.0f) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("topRatio should be in [0..1] range or -1");
    }

    private final void calculateTargetMetrics(Paint.FontMetricsInt fontMetricsInt) {
        double ceil;
        int ceil2 = (int) Math.ceil(this.lineHeight);
        int lineHeight = ceil2 - LineHeightStyleSpan_androidKt.lineHeight(fontMetricsInt);
        if (this.preserveMinimumHeight && lineHeight <= 0) {
            int i = fontMetricsInt.ascent;
            this.ascent = i;
            int i2 = fontMetricsInt.descent;
            this.descent = i2;
            this.firstAscent = i;
            this.lastDescent = i2;
            this.firstAscentDiff = 0;
            this.lastDescentDiff = 0;
            return;
        }
        float f = this.topRatio;
        if (f == -1.0f) {
            f = Math.abs(fontMetricsInt.ascent) / LineHeightStyleSpan_androidKt.lineHeight(fontMetricsInt);
        }
        if (lineHeight <= 0) {
            ceil = Math.ceil(lineHeight * f);
        } else {
            ceil = Math.ceil((1.0f - f) * lineHeight);
        }
        int i3 = (int) ceil;
        int i4 = fontMetricsInt.descent;
        int i5 = i3 + i4;
        this.descent = i5;
        int i6 = i5 - ceil2;
        this.ascent = i6;
        if (this.trimFirstLineTop) {
            i6 = fontMetricsInt.ascent;
        }
        this.firstAscent = i6;
        if (this.trimLastLineBottom) {
            i5 = i4;
        }
        this.lastDescent = i5;
        this.firstAscentDiff = fontMetricsInt.ascent - i6;
        this.lastDescentDiff = i5 - i4;
    }

    public static /* synthetic */ LineHeightStyleSpan copy$ui_text$default(LineHeightStyleSpan lineHeightStyleSpan, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = lineHeightStyleSpan.trimFirstLineTop;
        }
        return lineHeightStyleSpan.copy$ui_text(i, i2, z);
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(@NotNull CharSequence text, int start, int end, int spanStartVertical, int lineHeight, @NotNull Paint.FontMetricsInt fontMetricsInt) {
        if (LineHeightStyleSpan_androidKt.lineHeight(fontMetricsInt) <= 0) {
            return;
        }
        boolean z = start == this.startIndex;
        boolean z2 = end == this.endIndex;
        if (z && z2 && this.trimFirstLineTop && this.trimLastLineBottom) {
            return;
        }
        if (this.firstAscent == Integer.MIN_VALUE) {
            calculateTargetMetrics(fontMetricsInt);
        }
        fontMetricsInt.ascent = z ? this.firstAscent : this.ascent;
        fontMetricsInt.descent = z2 ? this.lastDescent : this.descent;
    }

    @NotNull
    public final LineHeightStyleSpan copy$ui_text(int startIndex, int endIndex, boolean trimFirstLineTop) {
        return new LineHeightStyleSpan(this.lineHeight, startIndex, endIndex, trimFirstLineTop, this.trimLastLineBottom, this.topRatio, this.preserveMinimumHeight);
    }

    public final int getFirstAscentDiff() {
        return this.firstAscentDiff;
    }

    public final int getLastDescentDiff() {
        return this.lastDescentDiff;
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }

    public final boolean getTrimLastLineBottom() {
        return this.trimLastLineBottom;
    }
}
