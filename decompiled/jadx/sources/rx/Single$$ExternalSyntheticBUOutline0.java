package rx;

import java.text.ParseException;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final /* synthetic */ class Single$$ExternalSyntheticBUOutline0 {
    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void m$1(int i, String str) {
        throw new RuntimeException(str + i);
    }

    public static /* synthetic */ void m$2(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void m$3(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void m$1(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void m$1(String str, Throwable th) {
        throw new IllegalStateException(str, th);
    }

    public static /* synthetic */ void m(int i, String str) {
        throw new ParseException(str, i);
    }

    public static /* synthetic */ void m(int i, StringBuilder sb) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void m(Object obj, Object obj2, StringBuilder sb) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void m(String str) {
        throw new RuntimeException(str);
    }

    public static /* synthetic */ void m() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void m(String str, Throwable th) {
        throw new IllegalArgumentException(str, th);
    }
}
