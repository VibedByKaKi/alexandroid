package androidx.compose.ui.node;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0013\u0010&\u001a\u00020\u00132\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\t8Æ\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\t8Æ\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0012\u0010\u000e\u001a\u00020\t8Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0012\u0010\u0010\u001a\u00020\t8Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0012\u0010\u0012\u001a\u00020\u00138Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\t8Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000bR\u0014\u0010\u0018\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015\u0088\u0001\u0002¨\u0006)"}, d2 = {"Landroidx/compose/ui/node/Snake;", "", "data", "", "constructor-impl", "([I)[I", "getData", "()[I", "startX", "", "getStartX-impl", "([I)I", "startY", "getStartY-impl", "endX", "getEndX-impl", "endY", "getEndY-impl", "reverse", "", "getReverse-impl", "([I)Z", "diagonalSize", "getDiagonalSize-impl", "hasAdditionOrRemoval", "getHasAdditionOrRemoval-impl", "isAddition", "isAddition-impl", "addDiagonalToStack", "", "diagonals", "Landroidx/compose/ui/node/IntStack;", "addDiagonalToStack-impl", "([ILandroidx/compose/ui/node/IntStack;)V", "toString", "", "toString-impl", "([I)Ljava/lang/String;", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nMyersDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/Snake\n+ 2 MyersDiff.kt\nandroidx/compose/ui/node/MyersDiffKt\n*L\n1#1,488:1\n297#1:489\n289#1:490\n301#1:491\n293#1:492\n301#1:493\n293#1,5:494\n289#1:499\n301#1:500\n293#1,5:501\n289#1:506\n289#1:507\n293#1:508\n308#1:509\n297#1:510\n289#1:511\n301#1:512\n293#1:513\n305#1:514\n305#1:516\n297#1:518\n289#1:519\n289#1,17:520\n354#2:515\n354#2:517\n*S KotlinDebug\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/Snake\n*L\n308#1:489\n308#1:490\n308#1:491\n308#1:492\n311#1:493\n311#1:494,5\n311#1:499\n314#1:500\n314#1:501,5\n314#1:506\n339#1:507\n340#1:508\n342#1:509\n342#1:510\n342#1:511\n342#1:512\n342#1:513\n343#1:514\n344#1:516\n346#1:518\n346#1:519\n351#1:520,17\n343#1:515\n344#1:517\n*E\n"})
/* loaded from: classes13.dex */
final class Snake {

    @NotNull
    private final int[] data;

    private /* synthetic */ Snake(int[] iArr) {
        this.data = iArr;
    }

    /* renamed from: addDiagonalToStack-impl, reason: not valid java name */
    public static final void m6427addDiagonalToStackimpl(int[] iArr, @NotNull IntStack intStack) {
        int i;
        int i2 = iArr[0];
        int i3 = iArr[1];
        if (m6435getHasAdditionOrRemovalimpl(iArr)) {
            i = Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
            i2 += ((iArr[4] != 0 ? 1 : 0) | (m6440isAdditionimpl(iArr) ? 1 : 0)) ^ 1;
            i3 += ((!m6440isAdditionimpl(iArr) ? 1 : 0) | (iArr[4] != 0 ? 1 : 0)) ^ 1;
        } else {
            i = iArr[2] - iArr[0];
        }
        intStack.pushDiagonal(i2, i3, i);
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Snake m6428boximpl(int[] iArr) {
        return new Snake(iArr);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6430equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof Snake) && Intrinsics.areEqual(iArr, ((Snake) obj).m6442unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6431equalsimpl0(int[] iArr, int[] iArr2) {
        return Intrinsics.areEqual(iArr, iArr2);
    }

    /* renamed from: getDiagonalSize-impl, reason: not valid java name */
    public static final int m6432getDiagonalSizeimpl(int[] iArr) {
        return Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
    }

    /* renamed from: getEndX-impl, reason: not valid java name */
    public static final int m6433getEndXimpl(int[] iArr) {
        return iArr[2];
    }

    /* renamed from: getEndY-impl, reason: not valid java name */
    public static final int m6434getEndYimpl(int[] iArr) {
        return iArr[3];
    }

    /* renamed from: getHasAdditionOrRemoval-impl, reason: not valid java name */
    private static final boolean m6435getHasAdditionOrRemovalimpl(int[] iArr) {
        return iArr[3] - iArr[1] != iArr[2] - iArr[0];
    }

    /* renamed from: getReverse-impl, reason: not valid java name */
    public static final boolean m6436getReverseimpl(int[] iArr) {
        return iArr[4] != 0;
    }

    /* renamed from: getStartX-impl, reason: not valid java name */
    public static final int m6437getStartXimpl(int[] iArr) {
        return iArr[0];
    }

    /* renamed from: getStartY-impl, reason: not valid java name */
    public static final int m6438getStartYimpl(int[] iArr) {
        return iArr[1];
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6439hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: isAddition-impl, reason: not valid java name */
    private static final boolean m6440isAdditionimpl(int[] iArr) {
        return iArr[3] - iArr[1] > iArr[2] - iArr[0];
    }

    @NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6441toStringimpl(int[] iArr) {
        StringBuilder sb = new StringBuilder("Snake(");
        sb.append(iArr[0]);
        sb.append(AbstractJsonLexerKt.COMMA);
        sb.append(iArr[1]);
        sb.append(AbstractJsonLexerKt.COMMA);
        sb.append(iArr[2]);
        sb.append(AbstractJsonLexerKt.COMMA);
        sb.append(iArr[3]);
        sb.append(AbstractJsonLexerKt.COMMA);
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, iArr[4] != 0, ')');
    }

    public boolean equals(Object other) {
        return m6430equalsimpl(this.data, other);
    }

    @NotNull
    public final int[] getData() {
        return this.data;
    }

    public int hashCode() {
        return m6439hashCodeimpl(this.data);
    }

    @NotNull
    public String toString() {
        return m6441toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m6442unboximpl() {
        return this.data;
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m6429constructorimpl(@NotNull int[] iArr) {
        return iArr;
    }
}
