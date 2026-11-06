package ai.onnxruntime;

import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class OnnxMap$$ExternalSyntheticBUOutline0 {
    public static /* synthetic */ void m(int i, String str, Object obj, Object obj2) {
        throw new IllegalStateException(str + i + obj + obj2);
    }

    public static /* synthetic */ void m$1(int i, String str, Object obj, Object obj2) {
        throw new IllegalArgumentException(str + i + obj + obj2);
    }

    public static /* bridge */ /* synthetic */ Class m$2() {
        return DeleteGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class m$3() {
        return SelectRangeGesture.class;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedCallback m(Object obj) {
        return (OnBackInvokedCallback) obj;
    }

    /* renamed from: m$1, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Class m11m$1() {
        return DeleteRangeGesture.class;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher m6m(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Class m7m() {
        return SelectGesture.class;
    }

    public static /* synthetic */ void m$1(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m9m() {
        throw new ConcurrentModificationException();
    }

    public static /* bridge */ /* synthetic */ boolean m$1(Object obj) {
        return obj instanceof RemoveSpaceGesture;
    }

    public static /* synthetic */ void m(Object obj, Object obj2, StringBuilder sb) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void m(Object obj, String str, int i, long j) {
        throw new IllegalArgumentException(str + i + obj + j);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void m(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ boolean m10m(Object obj) {
        return obj instanceof SelectGesture;
    }
}
