package org.json;

import org.codehaus.jackson.JsonLocation;
import org.codehaus.jackson.JsonParseException;
import org.objenesis.ObjenesisException;
import org.openjdk.tools.javac.code.Symbol;
import org.openjdk.tools.javac.jvm.Pool;
import org.openjdk.tools.javac.model.FilteredMemberList;
import org.openjdk.tools.javac.parser.JavacParser;
import org.openjdk.tools.javac.parser.Tokens;
import org.openjdk.tools.javac.util.ClientCodeException;
import org.openjdk.tools.javac.util.Filter;
import org.openjdk.tools.javac.util.Name;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class XML$$ExternalSyntheticBUOutline0 implements Filter {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ XML$$ExternalSyntheticBUOutline0(int i) {
        this.$r8$classId = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m(int i, Object obj, Object obj2, Object obj3, String str) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + ((char) i)).toString());
    }

    public static /* synthetic */ void m$1(String str, Object obj, Object obj2, Object obj3) {
        throw new AssertionError(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void m$2(String str, Object obj, Object obj2, Object obj3) {
        throw new ClassCastException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void m$3(Object obj, String str) {
        throw new DateTimeException(str + obj);
    }

    @Override // org.openjdk.tools.javac.util.Filter
    public boolean accepts(Object obj) {
        boolean lambda$new$0;
        boolean lambda$new$1;
        boolean lambda$iterator$0;
        boolean lambda$new$12;
        switch (this.$r8$classId) {
            case 19:
                lambda$new$0 = Pool.MethodHandle.lambda$new$0((Name) obj);
                return lambda$new$0;
            case 20:
                lambda$new$1 = Pool.MethodHandle.lambda$new$1((Name) obj);
                return lambda$new$1;
            case 21:
                lambda$iterator$0 = FilteredMemberList.lambda$iterator$0((Symbol) obj);
                return lambda$iterator$0;
            default:
                lambda$new$12 = JavacParser.lambda$new$1((Tokens.TokenKind) obj);
                return lambda$new$12;
        }
    }

    public static /* synthetic */ void m$3(String str) {
        throw new DateTimeException(str);
    }

    public static /* synthetic */ void m$1(String str) {
        throw new JSONException(str);
    }

    public static /* synthetic */ void m$2(String str) {
        throw new NumberFormatException(str);
    }

    public static /* synthetic */ void m$1(Object obj, String str) {
        throw new DateTimeException(str + obj);
    }

    public static /* synthetic */ void m$2(Object obj, String str) {
        throw new UnsupportedTemporalTypeException(str + obj);
    }

    public static /* synthetic */ void m$1(Throwable th) {
        throw new ClientCodeException(th);
    }

    public static /* synthetic */ void m(int i, long j) {
        throw new ArithmeticException("Multiplication overflows a long: " + j + ((Object) " * ") + i);
    }

    public static /* synthetic */ void m() {
        throw new RuntimeException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m(int i, String str, Object obj) {
        throw new IllegalStateException((str + obj + ((char) i)).toString());
    }

    public static /* synthetic */ void m(Object obj) {
        throw new RuntimeException(obj.toString());
    }

    public static /* synthetic */ void m(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static /* synthetic */ void m(Object obj, Object obj2, StringBuilder sb) {
        sb.append(obj);
        sb.append(obj2);
        throw new DateTimeException(sb.toString());
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new IllegalArgumentException(str + ((Object) obj.toString()));
    }

    public static /* synthetic */ void m(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void m(String str, JsonLocation jsonLocation) {
        throw new JsonParseException(str, jsonLocation);
    }

    public static /* synthetic */ void m(StringBuffer stringBuffer) {
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public static /* synthetic */ void m(StringBuilder sb, long j) {
        sb.append(j);
        throw new ArithmeticException(sb.toString());
    }

    public static /* synthetic */ void m(StringBuilder sb, Object obj, Object obj2, Object obj3) {
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new AssertionError(sb.toString());
    }

    public static /* synthetic */ void m(Throwable th) {
        throw new ObjenesisException(th);
    }

    public static /* synthetic */ void m(Throwable th, Object obj, String str) {
        throw new RuntimeException(str + obj, th);
    }
}
