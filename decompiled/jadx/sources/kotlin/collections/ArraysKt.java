package kotlin.collections;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"kotlin/collections/ArraysKt__ArraysJVMKt", "kotlin/collections/ArraysKt__ArraysKt", "kotlin/collections/ArraysKt___ArraysJvmKt", "kotlin/collections/ArraysKt___ArraysKt"}, k = 4, mv = {2, 2, 0}, xi = 49)
/* loaded from: classes10.dex */
public final class ArraysKt extends ArraysKt___ArraysKt {
    private ArraysKt() {
    }

    public static /* bridge */ /* synthetic */ String joinToString$default(double[] dArr) {
        return ArraysKt___ArraysKt.joinToString$default(dArr, (CharSequence) null, MarkdownConstants.LEFT_BRACKET, MarkdownConstants.RIGHT_BRACKET, 0, (CharSequence) null, (Function1) null, 57, (Object) null);
    }

    public static /* bridge */ /* synthetic */ String joinToString$default(byte[] bArr, String str, String str2, String str3, int i, Function1 function1, int i2) {
        return ArraysKt___ArraysKt.joinToString$default(bArr, (CharSequence) str, (CharSequence) str2, (CharSequence) str3, i, (CharSequence) null, function1, i2, (Object) null);
    }

    public static /* bridge */ /* synthetic */ String joinToString$default(int i, String str, int[] iArr) {
        return ArraysKt___ArraysKt.joinToString$default(iArr, (CharSequence) str, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, i, (Object) null);
    }

    public static /* bridge */ /* synthetic */ String joinToString$default(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Function1 function1, int i) {
        return ArraysKt___ArraysKt.joinToString$default(objArr, charSequence, charSequence2, charSequence3, 0, (CharSequence) null, function1, i, (Object) null);
    }
}
