package kotlin.text;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import dagger.internal.codegen.base.Formatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u001e\u0010\u0003\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0001H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u0001\u001a\u0011\u0010\t\u001a\u00020\n*\u00020\u0001H\u0002¢\u0006\u0002\b\u000b\u001a!\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\r2\u0006\u0010\b\u001a\u00020\u0001H\u0002¢\u0006\u0002\b\u000e\u001aJ\u0010\u000f\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\r2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rH\u0082\b¢\u0006\u0002\b\u0014¨\u0006\u0015"}, d2 = {"trimMargin", "", "marginPrefix", "replaceIndentByMargin", "newIndent", "trimIndent", "replaceIndent", "prependIndent", "indent", "indentWidth", "", "indentWidth$StringsKt__IndentKt", "getIndentFunction", "Lkotlin/Function1;", "getIndentFunction$StringsKt__IndentKt", "reindent", "", "resultSizeEstimate", "indentAddFunction", "indentCutFunction", "reindent$StringsKt__IndentKt", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/text/StringsKt")
@SourceDebugExtension({"SMAP\nIndent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,129:1\n119#1,2:131\n121#1,4:146\n126#1,2:159\n119#1,2:168\n121#1,4:183\n126#1,2:190\n1#2:130\n1#2:156\n1#2:187\n1#2:211\n1583#3,11:133\n1878#3,2:144\n1880#3:157\n1594#3:158\n774#3:161\n865#3,2:162\n1563#3:164\n1634#3,3:165\n1583#3,11:170\n1878#3,2:181\n1880#3:188\n1594#3:189\n1583#3,11:198\n1878#3,2:209\n1880#3:212\n1594#3:213\n158#4,6:150\n158#4,6:192\n*S KotlinDebug\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n*L\n42#1:131,2\n42#1:146,4\n42#1:159,2\n83#1:168,2\n83#1:183,4\n83#1:190,2\n42#1:156\n83#1:187\n120#1:211\n42#1:133,11\n42#1:144,2\n42#1:157\n42#1:158\n79#1:161\n79#1:162,2\n80#1:164\n80#1:165,3\n83#1:170,11\n83#1:181,2\n83#1:188\n83#1:189\n120#1:198,11\n120#1:209,2\n120#1:212\n120#1:213\n43#1:150,6\n107#1:192,6\n*E\n"})
/* loaded from: classes10.dex */
public class StringsKt__IndentKt extends StringsKt__AppendableKt {
    private static final Function1<String, String> getIndentFunction$StringsKt__IndentKt(String str) {
        return str.length() == 0 ? new StringsKt__IndentKt$$ExternalSyntheticLambda1(0) : new StringsKt__IndentKt$$ExternalSyntheticLambda0(str, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getIndentFunction$lambda$0$StringsKt__IndentKt(String str) {
        str.getClass();
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getIndentFunction$lambda$1$StringsKt__IndentKt(String str, String str2) {
        str2.getClass();
        return str + str2;
    }

    private static final int indentWidth$StringsKt__IndentKt(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (!CharsKt__CharJVMKt.isWhitespace(str.charAt(i))) {
                break;
            }
            i++;
        }
        return i == -1 ? str.length() : i;
    }

    @NotNull
    public static final String prependIndent(@NotNull String str, @NotNull String str2) {
        String joinToString$default;
        str.getClass();
        str2.getClass();
        joinToString$default = SequencesKt___SequencesKt.joinToString$default(SequencesKt.map(StringsKt__StringsKt.lineSequence(str), new StringsKt__IndentKt$$ExternalSyntheticLambda0(str2, 0)), "\n", null, null, 0, null, null, 62, null);
        return joinToString$default;
    }

    public static /* synthetic */ String prependIndent$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = Formatter.INDENT;
        }
        return prependIndent(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prependIndent$lambda$0$StringsKt__IndentKt(String str, String str2) {
        str2.getClass();
        return StringsKt__StringsKt.isBlank(str2) ? str2.length() < str.length() ? str : str2 : BitVector$$ExternalSyntheticOutline0.m(str, str2);
    }

    private static final String reindent$StringsKt__IndentKt(List<String> list, int i, Function1<? super String, String> function1, Function1<? super String, String> function12) {
        String invoke;
        int lastIndex = CollectionsKt.getLastIndex(list);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            if ((i2 == 0 || i2 == lastIndex) && StringsKt__StringsKt.isBlank(str)) {
                str = null;
            } else {
                String invoke2 = function12.invoke(str);
                if (invoke2 != null && (invoke = function1.invoke(invoke2)) != null) {
                    str = invoke;
                }
            }
            if (str != null) {
                arrayList.add(str);
            }
            i2 = i3;
        }
        return ((StringBuilder) CollectionsKt.joinTo$default(arrayList, new StringBuilder(i), "\n", null, null, null, 124)).toString();
    }

    @NotNull
    public static final String replaceIndent(@NotNull String str, @NotNull String str2) {
        String invoke;
        str.getClass();
        str2.getClass();
        List<String> lines = StringsKt__StringsKt.lines(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : lines) {
            if (!StringsKt__StringsKt.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(indentWidth$StringsKt__IndentKt((String) it2.next())));
        }
        Integer num = (Integer) CollectionsKt___CollectionsKt.minOrNull((Iterable) arrayList2);
        int i = 0;
        int intValue = num != null ? num.intValue() : 0;
        int size = (lines.size() * str2.length()) + str.length();
        Function1<String, String> indentFunction$StringsKt__IndentKt = getIndentFunction$StringsKt__IndentKt(str2);
        int lastIndex = CollectionsKt.getLastIndex(lines);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : lines) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str3 = (String) obj2;
            if ((i == 0 || i == lastIndex) && StringsKt__StringsKt.isBlank(str3)) {
                str3 = null;
            } else {
                String drop = StringsKt___StringsKt.drop(str3, intValue);
                if (drop != null && (invoke = indentFunction$StringsKt__IndentKt.invoke(drop)) != null) {
                    str3 = invoke;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i = i2;
        }
        return ((StringBuilder) CollectionsKt.joinTo$default(arrayList3, new StringBuilder(size), "\n", null, null, null, 124)).toString();
    }

    public static /* synthetic */ String replaceIndent$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "";
        }
        return replaceIndent(str, str2);
    }

    @NotNull
    public static final String replaceIndentByMargin(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        String str4;
        String invoke;
        ParcelCompat$$ExternalSyntheticOutline0.m(str, str2, str3);
        if (StringsKt__StringsKt.isBlank(str3)) {
            Single$$ExternalSyntheticBUOutline0.m$3("marginPrefix must be non-blank string.");
            return null;
        }
        List<String> lines = StringsKt__StringsKt.lines(str);
        int size = (lines.size() * str2.length()) + str.length();
        Function1<String, String> indentFunction$StringsKt__IndentKt = getIndentFunction$StringsKt__IndentKt(str2);
        int lastIndex = CollectionsKt.getLastIndex(lines);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : lines) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str5 = (String) obj;
            String str6 = null;
            if ((i == 0 || i == lastIndex) && StringsKt__StringsKt.isBlank(str5)) {
                str4 = str3;
                str5 = null;
            } else {
                int length = str5.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        i3 = -1;
                        break;
                    }
                    if (!CharsKt__CharJVMKt.isWhitespace(str5.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 == -1) {
                    str4 = str3;
                } else {
                    int i4 = i3;
                    str4 = str3;
                    if (StringsKt__StringsJVMKt.startsWith$default(str5, str4, i4, false, 4, null)) {
                        str6 = ParcelCompat$$ExternalSyntheticOutline0.m(i4, str4, str5);
                    }
                }
                if (str6 != null && (invoke = indentFunction$StringsKt__IndentKt.invoke(str6)) != null) {
                    str5 = invoke;
                }
            }
            if (str5 != null) {
                arrayList.add(str5);
            }
            i = i2;
            str3 = str4;
        }
        return ((StringBuilder) CollectionsKt.joinTo$default(arrayList, new StringBuilder(size), "\n", null, null, null, 124)).toString();
    }

    public static /* synthetic */ String replaceIndentByMargin$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "";
        }
        if ((i & 2) != 0) {
            str3 = "|";
        }
        return replaceIndentByMargin(str, str2, str3);
    }

    @IntrinsicConstEvaluation
    @NotNull
    public static String trimIndent(@NotNull String str) {
        str.getClass();
        return replaceIndent(str, "");
    }

    @IntrinsicConstEvaluation
    @NotNull
    public static final String trimMargin(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        return replaceIndentByMargin(str, "", str2);
    }

    public static /* synthetic */ String trimMargin$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "|";
        }
        return trimMargin(str, str2);
    }
}
