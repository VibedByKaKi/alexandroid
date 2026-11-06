package androidx.compose.ui.text.input;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.InternalTextApi;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import com.dee.app.metrics.MetricsConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003J\u0011\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fH\u0086\u0002J\b\u0010\u0018\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/text/input/PartialGapBuffer;", "", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "setText", "buffer", "Landroidx/compose/ui/text/input/GapBuffer;", "bufStart", "", "bufEnd", "length", "getLength", "()I", "replace", "", "start", "end", MetricsConstants.Method.CACHE_GET, "", "index", "toString", "Companion", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
@InternalTextApi
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nGapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/ui/text/input/PartialGapBuffer\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,318:1\n118#2,4:319\n118#2,4:323\n*S KotlinDebug\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/ui/text/input/PartialGapBuffer\n*L\n242#1:319,4\n245#1:323,4\n*E\n"})
/* loaded from: classes13.dex */
public final class PartialGapBuffer {
    public static final int BUF_SIZE = 255;
    public static final int NOWHERE = -1;
    public static final int SURROUNDING_SIZE = 64;

    @Nullable
    private GapBuffer buffer;

    @NotNull
    private String text;
    public static final int $stable = 8;
    private int bufStart = -1;
    private int bufEnd = -1;

    public PartialGapBuffer(@NotNull String str) {
        this.text = str;
    }

    public final char get(int index) {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text.charAt(index);
        }
        if (index < this.bufStart) {
            return this.text.charAt(index);
        }
        int length = gapBuffer.length();
        int i = this.bufStart;
        return index < length + i ? gapBuffer.get(index - i) : this.text.charAt(index - ((length - this.bufEnd) + i));
    }

    public final int getLength() {
        GapBuffer gapBuffer = this.buffer;
        String str = this.text;
        return gapBuffer == null ? str.length() : (str.length() - (this.bufEnd - this.bufStart)) + gapBuffer.length();
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final void replace(int start, int end, @NotNull String text) {
        if (!(start <= end)) {
            InlineClassHelperKt.throwIllegalArgumentException("start index must be less than or equal to end index: " + start + " > " + end);
        }
        if (!(start >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("start must be non-negative, but was " + start);
        }
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer != null) {
            int i = this.bufStart;
            int i2 = start - i;
            int i3 = end - i;
            if (i2 >= 0 && i3 <= gapBuffer.length()) {
                gapBuffer.replace(i2, i3, text);
                return;
            }
            this.text = toString();
            this.buffer = null;
            this.bufStart = -1;
            this.bufEnd = -1;
            replace(start, end, text);
            return;
        }
        int max = Math.max(255, text.length() + 128);
        char[] cArr = new char[max];
        int min = Math.min(start, 64);
        int min2 = Math.min(this.text.length() - end, 64);
        int i4 = start - min;
        GapBuffer_jvmKt.toCharArray(this.text, cArr, 0, i4, start);
        int i5 = max - min2;
        int i6 = min2 + end;
        GapBuffer_jvmKt.toCharArray(this.text, cArr, i5, end, i6);
        GapBufferKt.toCharArray(text, cArr, min);
        this.buffer = new GapBuffer(cArr, text.length() + min, i5);
        this.bufStart = i4;
        this.bufEnd = i6;
    }

    public final void setText(@NotNull String str) {
        this.text = str;
    }

    @NotNull
    public String toString() {
        GapBuffer gapBuffer = this.buffer;
        String str = this.text;
        if (gapBuffer == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str, 0, this.bufStart);
        gapBuffer.append(sb);
        String str2 = this.text;
        sb.append((CharSequence) str2, this.bufEnd, str2.length());
        return sb.toString();
    }
}
