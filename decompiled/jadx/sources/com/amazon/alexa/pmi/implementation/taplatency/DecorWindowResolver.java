package com.amazon.alexa.pmi.implementation.taplatency;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\tJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\tH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/pmi/implementation/taplatency/DecorWindowResolver;", "", "<init>", "()V", "windowField", "Ljava/lang/reflect/Field;", "isWindowRoot", "", "view", "Landroid/view/View;", "windowOf", "Landroid/view/Window;", "decor", "windowFieldOf", "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSecondaryWindowTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SecondaryWindowTracker.kt\ncom/amazon/alexa/pmi/implementation/taplatency/DecorWindowResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,292:1\n1#2:293\n1310#3,2:294\n*S KotlinDebug\n*F\n+ 1 SecondaryWindowTracker.kt\ncom/amazon/alexa/pmi/implementation/taplatency/DecorWindowResolver\n*L\n246#1:294,2\n*E\n"})
/* loaded from: classes18.dex */
public final class DecorWindowResolver {

    @NotNull
    public static final DecorWindowResolver INSTANCE = new DecorWindowResolver();

    @Nullable
    private static Field windowField;

    private DecorWindowResolver() {
    }

    private final Field windowFieldOf(View decor) {
        Field field;
        Field field2 = windowField;
        if (field2 != null) {
            if (!field2.getDeclaringClass().isInstance(decor)) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        for (Class<?> cls = decor.getClass(); cls != null && !Intrinsics.areEqual(cls, View.class); cls = cls.getSuperclass()) {
            Field[] declaredFields = cls.getDeclaredFields();
            declaredFields.getClass();
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    field = null;
                    break;
                }
                field = declaredFields[i];
                if (Intrinsics.areEqual(field.getName(), "mWindow") && Window.class.isAssignableFrom(field.getType())) {
                    break;
                }
                i++;
            }
            if (field != null) {
                field.setAccessible(true);
                windowField = field;
                return field;
            }
        }
        return null;
    }

    public final boolean isWindowRoot(@NotNull View view) {
        int i;
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return layoutParams2 != null && 1 <= (i = layoutParams2.type) && i < 100;
    }

    @Nullable
    public final Window windowOf(@NotNull View decor) {
        decor.getClass();
        Field windowFieldOf = windowFieldOf(decor);
        Object obj = windowFieldOf != null ? windowFieldOf.get(decor) : null;
        if (obj instanceof Window) {
            return (Window) obj;
        }
        return null;
    }
}
