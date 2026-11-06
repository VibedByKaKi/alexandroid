package androidx.compose.ui.node;

import com.amazon.alexa.cantilever.HelpConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0012\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0002\u001a \u0010\u000b\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0000\u001aO\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001aW\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001aW\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001b\u001a\r\u0010\u001d\u001a\u00020\u0003*\u00020\rH\u0082\b\u001a8\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u0016H\u0000\u001a\u001c\u0010%\u001a\u00020\b*\u00020\u00162\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0003H\u0002¨\u0006("}, d2 = {"calculateDiff", "Landroidx/compose/ui/node/IntStack;", "oldSize", "", "newSize", "cb", "Landroidx/compose/ui/node/DiffCallback;", "applyDiff", "", "diagonals", "callback", "executeDiff", "midPoint", "", "oldStart", "oldEnd", "newStart", "newEnd", HelpConstants.FORWARD_ACTION, "Landroidx/compose/ui/node/CenteredArray;", "backward", "snake", "", "midPoint-q5eDKzI", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[I[I)Z", "d", "forward-4l5_RBY", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[II[I)Z", "backward-4l5_RBY", "toInt", "fillSnake", "startX", "startY", "endX", "endY", "reverse", "data", "swap", "i", "j", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMyersDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/MyersDiffKt\n+ 2 MyersDiff.kt\nandroidx/compose/ui/node/Snake\n*L\n1#1,488:1\n354#1:498\n354#1:499\n308#2:489\n297#2:490\n289#2:491\n301#2:492\n293#2:493\n289#2:494\n293#2:495\n297#2:496\n301#2:497\n*S KotlinDebug\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/MyersDiffKt\n*L\n196#1:498\n256#1:499\n71#1:489\n71#1:490\n71#1:491\n71#1:492\n71#1:493\n78#1:494\n80#1:495\n85#1:496\n87#1:497\n*E\n"})
/* loaded from: classes13.dex */
public final class MyersDiffKt {
    private static final void applyDiff(IntStack intStack, DiffCallback diffCallback) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < intStack.getLastIndex()) {
            int i4 = i + 2;
            int i5 = intStack.get(i) - intStack.get(i4);
            int i6 = intStack.get(i + 1) - intStack.get(i4);
            int i7 = intStack.get(i4);
            i += 3;
            while (i2 < i5) {
                diffCallback.remove(i3, i2);
                i2++;
            }
            while (i3 < i6) {
                diffCallback.insert(i3);
                i3++;
            }
            while (true) {
                int i8 = i7 - 1;
                if (i7 > 0) {
                    diffCallback.same(i2, i3);
                    i2++;
                    i3++;
                    i7 = i8;
                }
            }
        }
    }

    /* renamed from: backward-4l5_RBY, reason: not valid java name */
    private static final boolean m6319backward4l5_RBY(int i, int i2, int i3, int i4, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        int m6205getimpl;
        int i6;
        int i7;
        int i8 = (i2 - i) - (i4 - i3);
        boolean z = (i8 & 1) == 0;
        int i9 = -i5;
        for (int i10 = i9; i10 <= i5; i10 += 2) {
            if (i10 == i9 || (i10 != i5 && CenteredArray.m6205getimpl(iArr2, i10 + 1) < CenteredArray.m6205getimpl(iArr2, i10 - 1))) {
                m6205getimpl = CenteredArray.m6205getimpl(iArr2, i10 + 1);
                i6 = m6205getimpl;
            } else {
                m6205getimpl = CenteredArray.m6205getimpl(iArr2, i10 - 1);
                i6 = m6205getimpl - 1;
            }
            int i11 = i4 - ((i2 - i6) - i10);
            int i12 = ((i5 != 0 ? 1 : 0) & (i6 == m6205getimpl ? 1 : 0)) + i11;
            while (i6 > i && i11 > i3) {
                if (!diffCallback.areItemsTheSame(i6 - 1, i11 - 1)) {
                    break;
                }
                i6--;
                i11--;
            }
            CenteredArray.m6208setimpl(iArr2, i10, i6);
            if (z && (i7 = i8 - i10) >= i9 && i7 <= i5) {
                if (CenteredArray.m6205getimpl(iArr, i7) >= i6) {
                    fillSnake(i6, i11, m6205getimpl, i12, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final IntStack calculateDiff(int i, int i2, DiffCallback diffCallback) {
        char c = 1;
        int i3 = ((i + i2) + 1) / 2;
        IntStack intStack = new IntStack(i3 * 3);
        IntStack intStack2 = new IntStack(i3 * 4);
        intStack2.pushRange(0, i, 0, i2);
        int i4 = (i3 * 2) + 1;
        int[] m6202constructorimpl = CenteredArray.m6202constructorimpl(new int[i4]);
        int[] m6202constructorimpl2 = CenteredArray.m6202constructorimpl(new int[i4]);
        int[] m6429constructorimpl = Snake.m6429constructorimpl(new int[5]);
        while (intStack2.isNotEmpty()) {
            int pop = intStack2.pop();
            int pop2 = intStack2.pop();
            int pop3 = intStack2.pop();
            int pop4 = intStack2.pop();
            int[] iArr = m6429constructorimpl;
            if (m6321midPointq5eDKzI(pop4, pop3, pop2, pop, diffCallback, m6202constructorimpl, m6202constructorimpl2, m6429constructorimpl)) {
                char c2 = c;
                if (Math.min(iArr[2] - iArr[0], iArr[3] - iArr[c]) > 0) {
                    Snake.m6427addDiagonalToStackimpl(iArr, intStack);
                }
                intStack2.pushRange(pop4, iArr[0], pop2, iArr[c2]);
                intStack2.pushRange(iArr[2], pop3, iArr[3], pop);
                m6429constructorimpl = iArr;
                c = c2;
            } else {
                m6429constructorimpl = iArr;
            }
        }
        intStack.sortDiagonals();
        intStack.pushDiagonal(i, i2, 0);
        return intStack;
    }

    public static final void executeDiff(int i, int i2, @NotNull DiffCallback diffCallback) {
        applyDiff(calculateDiff(i, i2, diffCallback), diffCallback);
    }

    public static final void fillSnake(int i, int i2, int i3, int i4, boolean z, @NotNull int[] iArr) {
        if (iArr.length < 5) {
            return;
        }
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
        iArr[4] = z ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* renamed from: forward-4l5_RBY, reason: not valid java name */
    private static final boolean m6320forward4l5_RBY(int i, int i2, int i3, int i4, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        int m6205getimpl;
        int i6;
        ?? r16;
        int i7 = (i2 - i) - (i4 - i3);
        int i8 = 1;
        boolean z = (Math.abs(i7) & 1) == 1;
        int i9 = -i5;
        int i10 = i9;
        while (i10 <= i5) {
            if (i10 == i9 || (i10 != i5 && CenteredArray.m6205getimpl(iArr, i10 + 1) > CenteredArray.m6205getimpl(iArr, i10 - 1))) {
                m6205getimpl = CenteredArray.m6205getimpl(iArr, i10 + 1);
                i6 = m6205getimpl;
            } else {
                m6205getimpl = CenteredArray.m6205getimpl(iArr, i10 - 1);
                i6 = m6205getimpl + 1;
            }
            int i11 = ((i6 - i) + i3) - i10;
            int i12 = i11 - ((i5 != 0 ? i8 : 0) & (i6 == m6205getimpl ? i8 : 0));
            while (i6 < i2 && i11 < i4) {
                if (!diffCallback.areItemsTheSame(i6, i11)) {
                    break;
                }
                i6++;
                i11++;
            }
            CenteredArray.m6208setimpl(iArr, i10, i6);
            if (z) {
                int i13 = i7 - i10;
                r16 = i8;
                r16 = r16;
                if (i13 >= i9 + 1) {
                    r16 = r16;
                    if (i13 <= i5 - 1) {
                        if (CenteredArray.m6205getimpl(iArr2, i13) <= i6) {
                            fillSnake(m6205getimpl, i12, i6, i11, false, iArr3);
                            return r16;
                        }
                        i10 += 2;
                        i8 = r16;
                    }
                }
            } else {
                r16 = i8;
            }
            i10 += 2;
            i8 = r16;
        }
        return false;
    }

    /* renamed from: midPoint-q5eDKzI, reason: not valid java name */
    private static final boolean m6321midPointq5eDKzI(int i, int i2, int i3, int i4, DiffCallback diffCallback, int[] iArr, int[] iArr2, int[] iArr3) {
        int i5 = i2 - i;
        int i6 = i4 - i3;
        if (i5 >= 1 && i6 >= 1) {
            int i7 = ((i5 + i6) + 1) / 2;
            int[] iArr4 = iArr;
            CenteredArray.m6208setimpl(iArr4, 1, i);
            int[] iArr5 = iArr2;
            CenteredArray.m6208setimpl(iArr5, 1, i2);
            int i8 = 0;
            while (i8 < i7) {
                if (m6320forward4l5_RBY(i, i2, i3, i4, diffCallback, iArr4, iArr5, i8, iArr3) || m6319backward4l5_RBY(i, i2, i3, i4, diffCallback, iArr, iArr2, i8, iArr3)) {
                    return true;
                }
                i8++;
                iArr4 = iArr;
                iArr5 = iArr2;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void swap(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }

    private static final int toInt(boolean z) {
        return z ? 1 : 0;
    }
}
