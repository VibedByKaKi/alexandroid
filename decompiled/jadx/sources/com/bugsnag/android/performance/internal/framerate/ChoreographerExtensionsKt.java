package com.bugsnag.android.performance.internal.framerate;

import android.annotation.SuppressLint;
import android.view.Choreographer;
import java.lang.reflect.Field;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00018\u0002X\u0083\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"choreographerLastFrameTimeField", "Ljava/lang/reflect/Field;", "lastFrameTimeNanos", "", "Landroid/view/Choreographer;", "getLastFrameTimeNanos", "(Landroid/view/Choreographer;)Ljava/lang/Long;", "bugsnag-android-performance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChoreographerExtensionsKt {

    @SuppressLint({"PrivateApi"})
    @Nullable
    private static final Field choreographerLastFrameTimeField;

    static {
        Field field;
        try {
            field = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
            field.setAccessible(true);
        } catch (Exception unused) {
            field = null;
        }
        choreographerLastFrameTimeField = field;
    }

    @Nullable
    public static final Long getLastFrameTimeNanos(@NotNull Choreographer choreographer) {
        choreographer.getClass();
        try {
            Field field = choreographerLastFrameTimeField;
            return (Long) (field != null ? field.get(choreographer) : null);
        } catch (Exception unused) {
            return null;
        }
    }
}
