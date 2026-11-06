package com.amazon.dee.app.elements;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.font.FontResolver;
import com.amazon.alexa.routing.api.Route;
import com.amazon.alexa.routing.api.RouteContext;
import com.amazon.dee.app.ui.util.UiUtils;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.google.common.base.Preconditions;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final class ElementsUtils {
    public static final String APP_BUNDLE = "APP_BUNDLE";
    private static final String LOG_TAG = "com.amazon.dee.app.elements.ElementsUtils";
    public static final String ROOT_APP_NAME = "ElementsRootComponent";
    public static final String ROUTE_CONTEXT = "ROUTE_CONTEXT";
    public static final String V2_PREFIX = "v2/";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.dee.app.elements.ElementsUtils$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

        static {
            int[] iArr = new int[ReadableType.values().length];
            $SwitchMap$com$facebook$react$bridge$ReadableType = iArr;
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static Bundle convertHashMapToBundle(@NonNull HashMap<String, Object> hashMap) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof String) {
                bundle.putCharSequence(entry.getKey(), (String) value);
            } else if (value instanceof Double) {
                bundle.putDouble(entry.getKey(), ((Double) value).doubleValue());
            } else if (value instanceof Integer) {
                bundle.putInt(entry.getKey(), ((Integer) value).intValue());
            } else if (value instanceof Boolean) {
                bundle.putBoolean(entry.getKey(), ((Boolean) value).booleanValue());
            } else if (value instanceof HashMap) {
                bundle.putBundle(entry.getKey(), convertHashMapToBundle((HashMap) value));
            } else if (value != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$3(entry.getKey(), "invalid value type associated with ");
                return null;
            }
        }
        return bundle;
    }

    public static List<Object> deepReadableArrayToList(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            switch (AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[readableArray.getType(i).ordinal()]) {
                case 1:
                    arrayList.add(i, null);
                    break;
                case 2:
                    arrayList.add(i, Boolean.valueOf(readableArray.getBoolean(i)));
                    break;
                case 3:
                    arrayList.add(i, Double.valueOf(readableArray.getDouble(i)));
                    break;
                case 4:
                    arrayList.add(i, readableArray.getString(i));
                    break;
                case 5:
                    arrayList.add(i, deepReadableMapToMap(readableArray.getMap(i)));
                    break;
                case 6:
                    arrayList.add(i, deepReadableArrayToList(readableArray.getArray(i)));
                    break;
            }
        }
        return arrayList;
    }

    @SuppressFBWarnings({"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
    public static Map<String, Object> deepReadableMapToMap(ReadableMap readableMap) {
        HashMap hashMap = new HashMap();
        if (readableMap != null) {
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                switch (AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[readableMap.getType(nextKey).ordinal()]) {
                    case 1:
                        hashMap.put(nextKey, null);
                        break;
                    case 2:
                        hashMap.put(nextKey, Boolean.valueOf(readableMap.getBoolean(nextKey)));
                        break;
                    case 3:
                        hashMap.put(nextKey, Double.valueOf(readableMap.getDouble(nextKey)));
                        break;
                    case 4:
                        hashMap.put(nextKey, readableMap.getString(nextKey));
                        break;
                    case 5:
                        hashMap.put(nextKey, deepReadableMapToMap(readableMap.getMap(nextKey)));
                        break;
                    case 6:
                        hashMap.put(nextKey, deepReadableArrayToList(readableMap.getArray(nextKey)));
                        break;
                }
            }
        }
        return hashMap;
    }

    public static Route.Theme getJasperTheme(boolean z, boolean z2) {
        return z2 ? z ? Route.Theme.JASPER_LIGHT_FONT_V2 : Route.Theme.JASPER_DARK_FONT_V2 : z ? Route.Theme.JASPER_LIGHT : Route.Theme.JASPER_DARK;
    }

    @Nullable
    public static Route.Theme getLoggedOnUsersEffectiveTheme(Context context, @NonNull Route route) {
        Route.Theme theme = route.getTheme();
        return theme != Route.Theme.DEFAULT ? theme : context != null ? getJasperTheme(UiUtils.isLightMode(context), useJasperThemeWithFontV2(context)) : Route.Theme.CHANNELS;
    }

    public static int getOrDefault(Map map, String str, int i) {
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            if (obj instanceof String) {
                return Integer.parseInt((String) obj);
            }
            if (obj instanceof Double) {
                return ((Double) obj).intValue();
            }
        }
        return i;
    }

    public static ReactFeature getReactFeatureFromRouteContext(@NonNull RouteContext routeContext) {
        Preconditions.checkNotNull(routeContext);
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        String uri = routeContext.toUri();
        if (TextUtils.isEmpty(uri)) {
            Log.e(LOG_TAG, "Uri was empty!");
        }
        if (!uri.startsWith(V2_PREFIX)) {
            uri = V2_PREFIX.concat(uri);
        }
        bundle2.putString("uri", uri);
        bundle2.putBundle(ElementsRouteKeys.ARGS, routeContext.getBundle(ElementsRouteKeys.ARGS));
        bundle.putBundle("route", bundle2);
        Bundle bundle3 = new Bundle();
        bundle3.putParcelable(ROUTE_CONTEXT, routeContext);
        bundle3.putBundle(APP_BUNDLE, bundle);
        String requestId = routeContext.getRequestId();
        bundle.putString("requestId", requestId);
        bundle.putString("theme", routeContext.getTheme().name().toLowerCase());
        bundle.putBundle(ElementsRouteKeys.STATE, convertHashMapToBundle(routeContext.getState()));
        return new ReactFeatureBuilder().withAppName(ROOT_APP_NAME).withInstanceId(requestId).withLaunchOptions(bundle).build();
    }

    public static boolean isElementsRoute(@NonNull Route route) {
        return 1 == route.getAdapterId();
    }

    private static boolean useJasperThemeWithFontV2(Context context) {
        return context != null && FontResolver.isLocaleArabic(context);
    }

    public static String getOrDefault(Map map, String str, String str2) {
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return str2;
    }

    public static boolean getOrDefault(Map map, String str, boolean z) {
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
        }
        return z;
    }
}
