package com.facebook.react.bridge;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.facebook.infer.annotation.Nullsafe;
import com.facebook.proguard.annotations.DoNotStrip;
import defpackage.a$$ExternalSyntheticOutline0;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DoNotStrip
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class Arguments {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.facebook.react.bridge.Arguments$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
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

    private static void addEntry(WritableNativeMap writableNativeMap, String str, @Nullable Object obj) {
        Object makeNativeObject = makeNativeObject(obj);
        if (makeNativeObject == null) {
            writableNativeMap.putNull(str);
            return;
        }
        if (makeNativeObject instanceof Boolean) {
            writableNativeMap.putBoolean(str, ((Boolean) makeNativeObject).booleanValue());
            return;
        }
        if (makeNativeObject instanceof Integer) {
            writableNativeMap.putInt(str, ((Integer) makeNativeObject).intValue());
            return;
        }
        if (makeNativeObject instanceof Number) {
            writableNativeMap.putDouble(str, ((Number) makeNativeObject).doubleValue());
            return;
        }
        if (makeNativeObject instanceof String) {
            writableNativeMap.putString(str, (String) makeNativeObject);
            return;
        }
        if (makeNativeObject instanceof WritableNativeArray) {
            writableNativeMap.putArray(str, (WritableNativeArray) makeNativeObject);
        } else if (makeNativeObject instanceof WritableNativeMap) {
            writableNativeMap.putMap(str, (WritableNativeMap) makeNativeObject);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(makeNativeObject, new StringBuilder("Could not convert ")));
        }
    }

    public static WritableArray createArray() {
        return new WritableNativeArray();
    }

    public static WritableMap createMap() {
        return new WritableNativeMap();
    }

    public static WritableArray fromArray(Object obj) {
        WritableArray createArray = createArray();
        int i = 0;
        if (obj instanceof String[]) {
            String[] strArr = (String[]) obj;
            int length = strArr.length;
            while (i < length) {
                createArray.pushString(strArr[i]);
                i++;
            }
        } else if (obj instanceof Bundle[]) {
            Bundle[] bundleArr = (Bundle[]) obj;
            int length2 = bundleArr.length;
            while (i < length2) {
                createArray.pushMap(fromBundle(bundleArr[i]));
                i++;
            }
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length;
            while (i < length3) {
                createArray.pushInt(iArr[i]);
                i++;
            }
        } else if (obj instanceof float[]) {
            int length4 = ((float[]) obj).length;
            while (i < length4) {
                createArray.pushDouble(r5[i]);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length5 = dArr.length;
            while (i < length5) {
                createArray.pushDouble(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length6 = zArr.length;
            while (i < length6) {
                createArray.pushBoolean(zArr[i]);
                i++;
            }
        } else {
            if (!(obj instanceof Parcelable[])) {
                Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(obj, new StringBuilder("Unknown array type ")));
                return null;
            }
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            int length7 = parcelableArr.length;
            while (i < length7) {
                Parcelable parcelable = parcelableArr[i];
                if (!(parcelable instanceof Bundle)) {
                    Buffer$$ExternalSyntheticBUOutline0.m$3(parcelable.getClass(), "Unexpected array member type ");
                    return null;
                }
                createArray.pushMap(fromBundle((Bundle) parcelable));
                i++;
            }
        }
        return createArray;
    }

    public static WritableMap fromBundle(Bundle bundle) {
        WritableMap createMap = createMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj == null) {
                createMap.putNull(str);
            } else if (obj.getClass().isArray()) {
                createMap.putArray(str, fromArray(obj));
            } else if (obj instanceof String) {
                createMap.putString(str, (String) obj);
            } else if (obj instanceof Number) {
                if (obj instanceof Integer) {
                    createMap.putInt(str, ((Integer) obj).intValue());
                } else {
                    createMap.putDouble(str, ((Number) obj).doubleValue());
                }
            } else if (obj instanceof Boolean) {
                createMap.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Bundle) {
                createMap.putMap(str, fromBundle((Bundle) obj));
            } else {
                if (!(obj instanceof List)) {
                    Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(obj, new StringBuilder("Could not convert ")));
                    return null;
                }
                createMap.putArray(str, fromList((List) obj));
            }
        }
        return createMap;
    }

    public static WritableNativeArray fromJavaArgs(Object[] objArr) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (Object obj : objArr) {
            if (obj == null) {
                writableNativeArray.pushNull();
            } else {
                Class<?> cls = obj.getClass();
                if (cls == Boolean.class) {
                    writableNativeArray.pushBoolean(((Boolean) obj).booleanValue());
                } else if (cls == Integer.class) {
                    writableNativeArray.pushDouble(((Integer) obj).doubleValue());
                } else if (cls == Double.class) {
                    writableNativeArray.pushDouble(((Double) obj).doubleValue());
                } else if (cls == Float.class) {
                    writableNativeArray.pushDouble(((Float) obj).doubleValue());
                } else if (cls == String.class) {
                    writableNativeArray.pushString(obj.toString());
                } else if (cls == WritableNativeMap.class) {
                    writableNativeArray.pushMap((WritableNativeMap) obj);
                } else {
                    if (cls != WritableNativeArray.class) {
                        Single$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("Cannot convert argument of type ", cls));
                        return null;
                    }
                    writableNativeArray.pushArray((WritableNativeArray) obj);
                }
            }
        }
        return writableNativeArray;
    }

    public static WritableArray fromList(List list) {
        WritableArray createArray = createArray();
        for (Object obj : list) {
            if (obj == null) {
                createArray.pushNull();
            } else if (obj.getClass().isArray()) {
                createArray.pushArray(fromArray(obj));
            } else if (obj instanceof Bundle) {
                createArray.pushMap(fromBundle((Bundle) obj));
            } else if (obj instanceof List) {
                createArray.pushArray(fromList((List) obj));
            } else if (obj instanceof String) {
                createArray.pushString((String) obj);
            } else if (obj instanceof Integer) {
                createArray.pushInt(((Integer) obj).intValue());
            } else if (obj instanceof Number) {
                createArray.pushDouble(((Number) obj).doubleValue());
            } else {
                if (!(obj instanceof Boolean)) {
                    Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(obj, new StringBuilder("Unknown value type ")));
                    return null;
                }
                createArray.pushBoolean(((Boolean) obj).booleanValue());
            }
        }
        return createArray;
    }

    public static WritableNativeArray makeNativeArray(@Nullable List list) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Object makeNativeObject = makeNativeObject(it2.next());
                if (makeNativeObject == null) {
                    writableNativeArray.pushNull();
                } else if (makeNativeObject instanceof Boolean) {
                    writableNativeArray.pushBoolean(((Boolean) makeNativeObject).booleanValue());
                } else if (makeNativeObject instanceof Integer) {
                    writableNativeArray.pushInt(((Integer) makeNativeObject).intValue());
                } else if (makeNativeObject instanceof Double) {
                    writableNativeArray.pushDouble(((Double) makeNativeObject).doubleValue());
                } else if (makeNativeObject instanceof String) {
                    writableNativeArray.pushString((String) makeNativeObject);
                } else if (makeNativeObject instanceof WritableNativeArray) {
                    writableNativeArray.pushArray((WritableNativeArray) makeNativeObject);
                } else {
                    if (!(makeNativeObject instanceof WritableNativeMap)) {
                        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(makeNativeObject, new StringBuilder("Could not convert ")));
                        return null;
                    }
                    writableNativeArray.pushMap((WritableNativeMap) makeNativeObject);
                }
            }
        }
        return writableNativeArray;
    }

    @DoNotStrip
    public static WritableNativeMap makeNativeMap(@Nullable Map<String, Object> map) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                addEntry(writableNativeMap, entry.getKey(), entry.getValue());
            }
        }
        return writableNativeMap;
    }

    @Nullable
    private static Object makeNativeObject(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return ((obj instanceof Float) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short)) ? Double.valueOf(((Number) obj).doubleValue()) : obj.getClass().isArray() ? makeNativeArray(obj) : obj instanceof List ? makeNativeArray((List) obj) : obj instanceof Map ? makeNativeMap((Map<String, Object>) obj) : obj instanceof Bundle ? makeNativeMap((Bundle) obj) : obj instanceof JavaOnlyMap ? makeNativeMap(((JavaOnlyMap) obj).toHashMap()) : obj instanceof JavaOnlyArray ? makeNativeArray((List) ((JavaOnlyArray) obj).toArrayList()) : obj;
    }

    @Nullable
    public static Bundle toBundle(@Nullable ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        Bundle bundle = new Bundle();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (AnonymousClass2.$SwitchMap$com$facebook$react$bridge$ReadableType[readableMap.getType(nextKey).ordinal()]) {
                case 1:
                    bundle.putString(nextKey, null);
                    break;
                case 2:
                    bundle.putBoolean(nextKey, readableMap.getBoolean(nextKey));
                    break;
                case 3:
                    bundle.putDouble(nextKey, readableMap.getDouble(nextKey));
                    break;
                case 4:
                    bundle.putString(nextKey, readableMap.getString(nextKey));
                    break;
                case 5:
                    bundle.putBundle(nextKey, toBundle(readableMap.getMap(nextKey)));
                    break;
                case 6:
                    bundle.putSerializable(nextKey, toList(readableMap.getArray(nextKey)));
                    break;
                default:
                    Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Could not convert object with key: ", nextKey, "."));
                    return null;
            }
        }
        return bundle;
    }

    @Nullable
    public static ArrayList toList(@Nullable ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            switch (AnonymousClass2.$SwitchMap$com$facebook$react$bridge$ReadableType[readableArray.getType(i).ordinal()]) {
                case 1:
                    arrayList.add(null);
                    break;
                case 2:
                    arrayList.add(Boolean.valueOf(readableArray.getBoolean(i)));
                    break;
                case 3:
                    double d = readableArray.getDouble(i);
                    if (d == Math.rint(d)) {
                        arrayList.add(Integer.valueOf((int) d));
                        break;
                    } else {
                        arrayList.add(Double.valueOf(d));
                        break;
                    }
                case 4:
                    arrayList.add(readableArray.getString(i));
                    break;
                case 5:
                    arrayList.add(toBundle(readableArray.getMap(i)));
                    break;
                case 6:
                    arrayList.add(toList(readableArray.getArray(i)));
                    break;
                default:
                    Single$$ExternalSyntheticBUOutline0.m$3("Could not convert object in array.");
                    return null;
            }
        }
        return arrayList;
    }

    @DoNotStrip
    public static WritableNativeMap makeNativeMap(@Nullable Bundle bundle) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                addEntry(writableNativeMap, str, bundle.get(str));
            }
        }
        return writableNativeMap;
    }

    public static <T> WritableNativeArray makeNativeArray(@Nullable final Object obj) {
        if (obj == null) {
            return new WritableNativeArray();
        }
        return makeNativeArray((List) new AbstractList() { // from class: com.facebook.react.bridge.Arguments.1
            @Override // java.util.AbstractList, java.util.List
            @Nullable
            public Object get(int i) {
                return Array.get(obj, i);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return Array.getLength(obj);
            }
        });
    }
}
