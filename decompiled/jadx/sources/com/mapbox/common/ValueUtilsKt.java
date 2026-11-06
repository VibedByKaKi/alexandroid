package com.mapbox.common;

import android.os.BaseBundle;
import android.os.Bundle;
import com.dee.app.contacts.common.constants.Constants;
import com.mapbox.bindgen.Value;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u001a\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\n\u0010\u0006\u001a\u00020\u0003*\u00020\u0007\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u0005H\u0002\u001a\u0011\u0010\u0006\u001a\u00020\u0003*\u0004\u0018\u00010\b¢\u0006\u0002\u0010\t\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\f\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\u000e\u001a\u0011\u0010\u0006\u001a\u00020\u0003*\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010\u001a\u0011\u0010\u0006\u001a\u00020\u0003*\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012\u001a\f\u0010\u0006\u001a\u00020\u0003*\u0004\u0018\u00010\u0001\u001a*\u0010\u0006\u001a\u00020\u0003*\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013j\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0014\u001a\u0012\u0010\u0006\u001a\u00020\u0003*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {Constants.LOG_TAG, "", "arrayToValue", "Lcom/mapbox/bindgen/Value;", "array", "", "toValue", "Landroid/os/BaseBundle;", "", "(Ljava/lang/Boolean;)Lcom/mapbox/bindgen/Value;", "", "requireIsFinite", "(Ljava/lang/Double;Z)Lcom/mapbox/bindgen/Value;", "", "(Ljava/lang/Float;Z)Lcom/mapbox/bindgen/Value;", "", "(Ljava/lang/Integer;)Lcom/mapbox/bindgen/Value;", "", "(Ljava/lang/Long;)Lcom/mapbox/bindgen/Value;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class ValueUtilsKt {

    @NotNull
    private static final String TAG = "ValueUtils";

    private static final Value arrayToValue(Object obj) {
        ArrayList arrayList;
        int i = 0;
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            arrayList = new ArrayList(zArr.length);
            int length = zArr.length;
            while (i < length) {
                arrayList.add(Value.valueOf(zArr[i]));
                i++;
            }
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            arrayList = new ArrayList(bArr.length);
            int length2 = bArr.length;
            while (i < length2) {
                arrayList.add(Value.valueOf(bArr[i]));
                i++;
            }
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            arrayList = new ArrayList(iArr.length);
            int length3 = iArr.length;
            while (i < length3) {
                arrayList.add(Value.valueOf(iArr[i]));
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            arrayList = new ArrayList(jArr.length);
            int length4 = jArr.length;
            while (i < length4) {
                arrayList.add(Value.valueOf(jArr[i]));
                i++;
            }
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            arrayList = new ArrayList(fArr.length);
            int length5 = fArr.length;
            while (i < length5) {
                arrayList.add(Value.valueOf(fArr[i]));
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            arrayList = new ArrayList(dArr.length);
            int length6 = dArr.length;
            while (i < length6) {
                arrayList.add(Value.valueOf(dArr[i]));
                i++;
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        return Value.valueOf(arrayList);
    }

    private static final Value toValue(Object obj) {
        if (obj instanceof Byte) {
            return Value.valueOf(((Number) obj).byteValue());
        }
        if (obj instanceof Integer) {
            return Value.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return Value.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof Float) {
            return Value.valueOf(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return Value.valueOf(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return Value.valueOf(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return Value.valueOf((String) obj);
        }
        if (obj instanceof boolean[] ? true : obj instanceof byte[] ? true : obj instanceof int[] ? true : obj instanceof long[] ? true : obj instanceof float[] ? true : obj instanceof double[]) {
            return arrayToValue(obj);
        }
        if (obj instanceof Bundle) {
            return toValue((BaseBundle) obj);
        }
        Log.warning(TAG, "Type is not supported: " + obj.getClass().getCanonicalName());
        return null;
    }

    public static /* synthetic */ Value toValue$default(Float f, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return toValue(f, z);
    }

    public static /* synthetic */ Value toValue$default(Double d, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return toValue(d, z);
    }

    @NotNull
    public static final Value toValue(@Nullable String str) {
        if (str != null) {
            Value valueOf = Value.valueOf(str);
            valueOf.getClass();
            return valueOf;
        }
        Value nullValue = Value.nullValue();
        nullValue.getClass();
        return nullValue;
    }

    @NotNull
    public static final Value toValue(@Nullable Boolean bool) {
        if (bool != null) {
            Value valueOf = Value.valueOf(bool.booleanValue());
            valueOf.getClass();
            return valueOf;
        }
        Value nullValue = Value.nullValue();
        nullValue.getClass();
        return nullValue;
    }

    @NotNull
    public static final Value toValue(@Nullable Integer num) {
        if (num != null) {
            Value valueOf = Value.valueOf(num.intValue());
            valueOf.getClass();
            return valueOf;
        }
        Value nullValue = Value.nullValue();
        nullValue.getClass();
        return nullValue;
    }

    @NotNull
    public static final Value toValue(@Nullable Long l) {
        if (l != null) {
            Value valueOf = Value.valueOf(l.longValue());
            valueOf.getClass();
            return valueOf;
        }
        Value nullValue = Value.nullValue();
        nullValue.getClass();
        return nullValue;
    }

    @NotNull
    public static final Value toValue(@Nullable Float f, boolean z) {
        if (f != null) {
            float floatValue = f.floatValue();
            if (z) {
                float floatValue2 = f.floatValue();
                if (Float.isInfinite(floatValue2) || Float.isNaN(floatValue2)) {
                    Single$$ExternalSyntheticBUOutline0.m$3("Value can not be Double.NaN, Double.POSITIVE_INFINITY or Double.NEGATIVE_INFINITY");
                    return null;
                }
            }
            Value valueOf = Value.valueOf(floatValue);
            valueOf.getClass();
            return valueOf;
        }
        Value nullValue = Value.nullValue();
        nullValue.getClass();
        return nullValue;
    }

    @NotNull
    public static final Value toValue(@Nullable Double d, boolean z) {
        if (d != null) {
            double doubleValue = d.doubleValue();
            if (z) {
                double doubleValue2 = d.doubleValue();
                if (Double.isInfinite(doubleValue2) || Double.isNaN(doubleValue2)) {
                    Single$$ExternalSyntheticBUOutline0.m$3("Value can not be Float.NaN, Float.POSITIVE_INFINITY or Float.NEGATIVE_INFINITY");
                    return null;
                }
            }
            Value valueOf = Value.valueOf(doubleValue);
            valueOf.getClass();
            return valueOf;
        }
        Value nullValue = Value.nullValue();
        nullValue.getClass();
        return nullValue;
    }

    @NotNull
    public static final Value toValue(@Nullable List<? extends Value> list) {
        if (list != null) {
            Value valueOf = Value.valueOf((List<Value>) list);
            valueOf.getClass();
            return valueOf;
        }
        Value nullValue = Value.nullValue();
        nullValue.getClass();
        return nullValue;
    }

    @NotNull
    public static final Value toValue(@Nullable HashMap<String, Value> hashMap) {
        if (hashMap != null) {
            Value valueOf = Value.valueOf(hashMap);
            valueOf.getClass();
            return valueOf;
        }
        Value nullValue = Value.nullValue();
        nullValue.getClass();
        return nullValue;
    }

    @NotNull
    public static final Value toValue(@NotNull BaseBundle baseBundle) {
        baseBundle.getClass();
        HashMap hashMap = new HashMap();
        if (baseBundle.isEmpty()) {
            Value valueOf = Value.valueOf((HashMap<String, Value>) hashMap);
            valueOf.getClass();
            return valueOf;
        }
        for (String str : baseBundle.keySet()) {
            Object obj = baseBundle.get(str);
            if (obj != null) {
                if ((obj instanceof Bundle) && Intrinsics.areEqual(obj, baseBundle)) {
                    Log.warning(TAG, "This bundle contains reference to itself");
                } else {
                    Value value = toValue(obj);
                    if (value != null) {
                    }
                }
            }
        }
        Value valueOf2 = Value.valueOf((HashMap<String, Value>) hashMap);
        valueOf2.getClass();
        return valueOf2;
    }
}
