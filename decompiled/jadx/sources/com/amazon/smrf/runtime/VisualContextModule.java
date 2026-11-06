package com.amazon.smrf.runtime;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.redesign.entity.viewtypes.ImageModel;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import defpackage.a$$ExternalSyntheticOutline0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "VisualContext")
/* loaded from: classes16.dex */
public class VisualContextModule extends NativeVisualContextModuleSpec {
    private static final AtomicBoolean FALLBACK_WARNING_LOGGED = new AtomicBoolean(false);
    public static final String NAME = "VisualContext";
    private static final String TAG = "VisualContext";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class WindowManagerGlobalAccess {

        @Nullable
        static final Method GET_INSTANCE;

        @Nullable
        static final Throwable RESOLUTION_FAILURE;

        @Nullable
        static final Field VIEWS_FIELD;

        static {
            Throwable th;
            Field field;
            Method method = null;
            try {
                Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
                Method declaredMethod = cls.getDeclaredMethod("getInstance", null);
                field = cls.getDeclaredField("mViews");
                field.setAccessible(true);
                th = null;
                method = declaredMethod;
            } catch (Throwable th2) {
                th = th2;
                field = null;
            }
            GET_INSTANCE = method;
            VIEWS_FIELD = field;
            RESOLUTION_FAILURE = th;
        }

        private WindowManagerGlobalAccess() {
        }

        public static boolean isAvailable() {
            return (GET_INSTANCE == null || VIEWS_FIELD == null) ? false : true;
        }
    }

    public VisualContextModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0124 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0160 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x004c  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.facebook.react.bridge.WritableMap buildElement(@androidx.annotation.NonNull android.view.View r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.smrf.runtime.VisualContextModule.buildElement(android.view.View, int, int):com.facebook.react.bridge.WritableMap");
    }

    private WritableMap emptyNode() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("id", "");
        return createMap;
    }

    @Nullable
    private String extractRole(@NonNull View view) {
        CharSequence accessibilityClassName = view.getAccessibilityClassName();
        if (accessibilityClassName == null) {
            return null;
        }
        String charSequence = accessibilityClassName.toString();
        if (charSequence.contains("RadioButton")) {
            return "radiobutton";
        }
        if (charSequence.contains("CheckBox")) {
            return "checkbox";
        }
        if (charSequence.contains("Switch")) {
            return "switch";
        }
        if (charSequence.contains("Button")) {
            return "button";
        }
        if (charSequence.contains(ImageModel.IMAGE_MODEL_TYPE)) {
            return "image";
        }
        if (charSequence.contains("EditText") || charSequence.contains("TextView")) {
            return "text";
        }
        if (charSequence.contains("ScrollView")) {
            return "scrollable";
        }
        return null;
    }

    @Nullable
    private WritableMap extractScrollable(@NonNull View view) {
        boolean canScrollVertically = view.canScrollVertically(1);
        boolean canScrollVertically2 = view.canScrollVertically(-1);
        boolean canScrollHorizontally = view.canScrollHorizontally(1);
        boolean canScrollHorizontally2 = view.canScrollHorizontally(-1);
        if (canScrollVertically || canScrollVertically2) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("direction", "vertical");
            createMap.putBoolean("allowForward", canScrollVertically);
            createMap.putBoolean("allowBackward", canScrollVertically2);
            return createMap;
        }
        if (!canScrollHorizontally && !canScrollHorizontally2) {
            return null;
        }
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putString("direction", "horizontal");
        createMap2.putBoolean("allowForward", canScrollHorizontally);
        createMap2.putBoolean("allowBackward", canScrollHorizontally2);
        return createMap2;
    }

    @Nullable
    private View findViewWithNativeId(@NonNull View view, @NonNull String str) {
        Object tag = view.getTag();
        if ((tag instanceof String) && str.equals(tag)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View findViewWithNativeId = findViewWithNativeId(viewGroup.getChildAt(i), str);
            if (findViewWithNativeId != null) {
                return findViewWithNativeId;
            }
        }
        return null;
    }

    @NonNull
    private List<View> getWindowRoots() {
        ArrayList arrayList = new ArrayList();
        if (WindowManagerGlobalAccess.isAvailable()) {
            try {
                ArrayList arrayList2 = (ArrayList) WindowManagerGlobalAccess.VIEWS_FIELD.get(WindowManagerGlobalAccess.GET_INSTANCE.invoke(null, null));
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.addAll(arrayList2);
                    return arrayList;
                }
                warnFallbackOnce("WindowManagerGlobal reported no attached windows", null);
            } catch (Throwable th) {
                warnFallbackOnce("WindowManagerGlobal access failed", th);
            }
        } else {
            warnFallbackOnce("WindowManagerGlobal members could not be resolved (hidden API restricted?)", WindowManagerGlobalAccess.RESOLUTION_FAILURE);
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            arrayList.add(currentActivity.getWindow().getDecorView());
        }
        return arrayList;
    }

    private void warnFallbackOnce(@NonNull String str, @Nullable Throwable th) {
        if (FALLBACK_WARNING_LOGGED.compareAndSet(false, true)) {
            String m = a$$ExternalSyntheticOutline0.m("[Visual Context] ", str, "; falling back to the current Activity decorView. Fragments rendered into an overlay or other secondary window will report an empty visual context.");
            if (th != null) {
                Log.w("VisualContext", m, th);
            } else {
                Log.w("VisualContext", m);
            }
        }
    }

    @Override // com.amazon.smrf.runtime.NativeVisualContextModuleSpec
    public WritableMap getAccessibilityTree(String str) {
        try {
            List<View> windowRoots = getWindowRoots();
            Iterator<View> it2 = windowRoots.iterator();
            View view = null;
            while (it2.hasNext() && (view = findViewWithNativeId(it2.next(), str)) == null) {
            }
            if (view != null) {
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                WritableMap buildElement = buildElement(view, iArr[0], iArr[1]);
                return buildElement != null ? buildElement : emptyNode();
            }
            Log.w("VisualContext", "[Visual Context] Root view not found for rootTag=" + str + " across " + windowRoots.size() + " window root(s)");
            return emptyNode();
        } catch (Exception e) {
            Log.e("VisualContext", "Error building accessibility tree", e);
            return emptyNode();
        }
    }

    @Override // com.amazon.smrf.runtime.NativeVisualContextModuleSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "VisualContext";
    }
}
