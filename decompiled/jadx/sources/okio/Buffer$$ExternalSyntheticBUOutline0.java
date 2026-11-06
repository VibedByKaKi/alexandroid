package okio;

import java.io.EOFException;
import java.io.IOException;
import kotlin.text.Typography;
import matter.onboardingpayload.OnboardingPayloadException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class Buffer$$ExternalSyntheticBUOutline0 {
    public static /* synthetic */ void m(int i, Object obj, Object obj2) {
        throw new IllegalArgumentException(("Unexpected value " + obj + ((Object) " at index ") + i + obj2).toString());
    }

    public static /* synthetic */ void m$1(String str, Object obj, Object obj2, Object obj3) {
        throw new IOException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void m$2(Object obj, String str) {
        throw new NumberFormatException(str + obj);
    }

    public static /* synthetic */ void m$3(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void m$4(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    public static /* synthetic */ void m$2() {
        throw new AssertionError();
    }

    public static /* synthetic */ void m$3() {
        throw new EOFException();
    }

    public static /* synthetic */ void m$2(String str) {
        throw new IOException(str);
    }

    public static /* synthetic */ void m$3(String str) {
        throw new EOFException(str);
    }

    public static /* synthetic */ void m$2(Throwable th) {
        throw new IOException(th);
    }

    public static /* synthetic */ void m$1(int i, String str) {
        throw new IOException(str + i);
    }

    public static /* synthetic */ void m$1(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void m$1(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void m$1() {
        throw new ArrayIndexOutOfBoundsException();
    }

    public static /* synthetic */ void m$1(Throwable th) {
        throw new IllegalArgumentException(th);
    }

    public static /* synthetic */ void m(int i, long j) {
        throw new IOException("Content-Length (" + j + ((Object) ") and stream length (") + i + ((Object) ") disagree"));
    }

    public static /* synthetic */ void m() {
        throw new IndexOutOfBoundsException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m(int i, Object obj, Object obj2, Object obj3, String str) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + ((char) i)).toString());
    }

    public static /* synthetic */ void m(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m(int i, String str, Object obj) {
        throw new IllegalArgumentException((str + obj + ((char) i)).toString());
    }

    public static /* synthetic */ void m(int i, StringBuilder sb) {
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void m(long j, Object obj) {
        throw new EOFException("\\n not found: limit=" + j + ((Object) " content=") + obj + Typography.ellipsis);
    }

    public static /* synthetic */ void m(Object obj) {
        throw new AssertionError(obj);
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new AssertionError(str + obj);
    }

    public static /* synthetic */ void m(Object obj, StringBuilder sb) {
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void m(String str) {
        throw new OnboardingPayloadException(str);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3) {
        throw new AssertionError(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void m(String str, Throwable th) {
        throw new IOException(str, th);
    }

    public static /* synthetic */ void m(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static /* synthetic */ void m(Throwable th) {
        throw new RuntimeException(th);
    }
}
