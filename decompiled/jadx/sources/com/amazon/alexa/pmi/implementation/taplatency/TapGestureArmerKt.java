package com.amazon.alexa.pmi.implementation.taplatency;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000\u001a \u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002\u001a\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"REPEAT_TAP_WINDOW_MS", "", "defaultTapHitTest", "Lcom/amazon/alexa/pmi/implementation/taplatency/TapTarget;", "decor", "Landroid/view/View;", "pointX", "", "pointY", "deepestViewAt", "root", "isUnderReactRoot", "", "view", "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTapGestureArmer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapGestureArmer.kt\ncom/amazon/alexa/pmi/implementation/taplatency/TapGestureArmerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n1#2:153\n*E\n"})
/* loaded from: classes18.dex */
public final class TapGestureArmerKt {
    public static final long REPEAT_TAP_WINDOW_MS = 200;

    private static final View deepestViewAt(View view, float f, float f2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (-1 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt.getVisibility() == 0) {
                    float scrollX = ((viewGroup.getScrollX() + f) - childAt.getLeft()) - childAt.getTranslationX();
                    float scrollY = ((viewGroup.getScrollY() + f2) - childAt.getTop()) - childAt.getTranslationY();
                    if (scrollX >= 0.0f && scrollX < childAt.getWidth() && scrollY >= 0.0f && scrollY < childAt.getHeight()) {
                        return deepestViewAt(childAt, scrollX, scrollY);
                    }
                }
            }
        }
        return view;
    }

    @NotNull
    public static final TapTarget defaultTapHitTest(@Nullable View view, float f, float f2) {
        if (view == null) {
            return new TapTarget("?", false);
        }
        try {
            View deepestViewAt = deepestViewAt(view, f, f2);
            String simpleName = deepestViewAt.getClass().getSimpleName();
            if (simpleName.length() == 0) {
                simpleName = deepestViewAt.getClass().getName();
            }
            return new TapTarget(simpleName, isUnderReactRoot(deepestViewAt));
        } catch (Throwable unused) {
            return new TapTarget("?", false);
        }
    }

    private static final boolean isUnderReactRoot(View view) {
        boolean startsWith$default;
        boolean contains$default;
        boolean contains$default2;
        boolean contains$default3;
        boolean startsWith$default2;
        for (int i = 0; view != null && i < 40; i++) {
            String name = view.getClass().getName();
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(name, BuildConfig.LIBRARY_PACKAGE_NAME, false, 2, null);
            if (startsWith$default) {
                return true;
            }
            contains$default = StringsKt__StringsKt.contains$default(name, "ReactRootView", false, 2, (Object) null);
            if (contains$default) {
                return true;
            }
            contains$default2 = StringsKt__StringsKt.contains$default(name, "ReactViewGroup", false, 2, (Object) null);
            if (contains$default2) {
                return true;
            }
            contains$default3 = StringsKt__StringsKt.contains$default(name, "ReactSurface", false, 2, (Object) null);
            if (contains$default3) {
                return true;
            }
            startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(name, "com.swmansion", false, 2, null);
            if (startsWith$default2) {
                return true;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return false;
    }
}
