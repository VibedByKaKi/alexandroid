package com.bugsnag.android.internal;

import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.auth.BuildConfig;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.http.CodecsKt$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rJ$\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fJh\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00012K\u0010\u0013\u001aG\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00110\u0014H\u0082\bJ\u000e\u0010\u001a\u001a\u00020\u001b*\u0004\u0018\u00010\u0001H\u0002J\u000e\u0010\u001c\u001a\u00020\u001b*\u0004\u0018\u00010\u0001H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/bugsnag/android/internal/StringUtils;", "", "()V", "trimMessageLength", "", "stringTrimmedTo", "", "maxLength", "str", "trimStringValuesTo", "Lcom/bugsnag/android/internal/TrimMetrics;", "maxStringLength", "list", "", BuildConfig.FLAVOR_authType, "", "trimValue", "", "value", "update", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "newValue", "stringTrimmed", "charsTrimmed", "isDefinitelyMutableList", "", "isDefinitelyMutableMap", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class StringUtils {

    @NotNull
    public static final StringUtils INSTANCE = new StringUtils();
    private static final int trimMessageLength = 25;

    private StringUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isDefinitelyMutableList(Object obj) {
        return (obj instanceof ArrayList) || (obj instanceof LinkedList) || (obj instanceof CopyOnWriteArrayList) || (obj instanceof Vector);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isDefinitelyMutableMap(Object obj) {
        return (obj instanceof HashMap) || (obj instanceof TreeMap) || (obj instanceof ConcurrentMap) || (obj instanceof EnumMap) || (obj instanceof Hashtable) || (obj instanceof WeakHashMap);
    }

    private final void trimValue(int maxStringLength, Object value, Function3<Object, ? super Integer, ? super Integer, Unit> update) {
        if (value instanceof String) {
            String str = (String) value;
            if (str.length() > maxStringLength) {
                update.invoke(stringTrimmedTo(maxStringLength, str), 1, Integer.valueOf(str.length() - maxStringLength));
                return;
            }
        }
        if (isDefinitelyMutableMap(value)) {
            if (value == null) {
                CodecsKt$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                return;
            }
            TrimMetrics trimStringValuesTo = trimStringValuesTo(maxStringLength, TypeIntrinsics.asMutableMap(value));
            update.invoke(value, Integer.valueOf(trimStringValuesTo.getItemsTrimmed()), Integer.valueOf(trimStringValuesTo.getDataTrimmed()));
            return;
        }
        if (isDefinitelyMutableList(value)) {
            if (value == null) {
                CodecsKt$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any?>");
                return;
            }
            TrimMetrics trimStringValuesTo2 = trimStringValuesTo(maxStringLength, TypeIntrinsics.asMutableList(value));
            update.invoke(value, Integer.valueOf(trimStringValuesTo2.getItemsTrimmed()), Integer.valueOf(trimStringValuesTo2.getDataTrimmed()));
            return;
        }
        if (!(value instanceof Map)) {
            if (value instanceof Collection) {
                List<Object> mutableList = CollectionsKt.toMutableList((Collection) value);
                TrimMetrics trimStringValuesTo3 = trimStringValuesTo(maxStringLength, mutableList);
                update.invoke(mutableList, Integer.valueOf(trimStringValuesTo3.getItemsTrimmed()), Integer.valueOf(trimStringValuesTo3.getDataTrimmed()));
                return;
            }
            return;
        }
        Map mutableMap = MapsKt.toMutableMap((Map) value);
        if (mutableMap == null) {
            CodecsKt$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
            return;
        }
        Map<String, Object> asMutableMap = TypeIntrinsics.asMutableMap(mutableMap);
        TrimMetrics trimStringValuesTo4 = trimStringValuesTo(maxStringLength, asMutableMap);
        update.invoke(asMutableMap, Integer.valueOf(trimStringValuesTo4.getItemsTrimmed()), Integer.valueOf(trimStringValuesTo4.getDataTrimmed()));
    }

    @NotNull
    public final String stringTrimmedTo(int maxLength, @NotNull String str) {
        str.getClass();
        int length = str.length() - maxLength;
        if (length < 25) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        TableInfo$$ExternalSyntheticOutline0.m(str, 0, maxLength, sb, "***<");
        return a$$ExternalSyntheticOutline0.m(sb, length, "> CHARS TRUNCATED***");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final TrimMetrics trimStringValuesTo(int maxStringLength, @NotNull Map<String, Object> map) {
        int itemsTrimmed;
        int dataTrimmed;
        Map<String, Object> map2;
        map.getClass();
        Iterator<T> it2 = map.entrySet().iterator();
        int i = 0;
        int i2 = 0;
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            StringUtils stringUtils = INSTANCE;
            Object value = entry.getValue();
            if (value instanceof String) {
                String str = (String) value;
                if (str.length() > maxStringLength) {
                    String stringTrimmedTo = stringUtils.stringTrimmedTo(maxStringLength, str);
                    int length = str.length() - maxStringLength;
                    entry.setValue(stringTrimmedTo);
                    i++;
                    i2 += length;
                }
            }
            if (stringUtils.isDefinitelyMutableMap(value)) {
                if (value == 0) {
                    CodecsKt$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                    return null;
                }
                TrimMetrics trimStringValuesTo = stringUtils.trimStringValuesTo(maxStringLength, TypeIntrinsics.asMutableMap(value));
                itemsTrimmed = trimStringValuesTo.getItemsTrimmed();
                dataTrimmed = trimStringValuesTo.getDataTrimmed();
                map2 = value;
            } else if (stringUtils.isDefinitelyMutableList(value)) {
                if (value == 0) {
                    CodecsKt$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any?>");
                    return null;
                }
                TrimMetrics trimStringValuesTo2 = stringUtils.trimStringValuesTo(maxStringLength, TypeIntrinsics.asMutableList(value));
                itemsTrimmed = trimStringValuesTo2.getItemsTrimmed();
                dataTrimmed = trimStringValuesTo2.getDataTrimmed();
                map2 = value;
            } else if (value instanceof Map) {
                Map mutableMap = MapsKt.toMutableMap((Map) value);
                if (mutableMap == null) {
                    CodecsKt$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                    return null;
                }
                Map<String, Object> asMutableMap = TypeIntrinsics.asMutableMap(mutableMap);
                TrimMetrics trimStringValuesTo3 = stringUtils.trimStringValuesTo(maxStringLength, asMutableMap);
                itemsTrimmed = trimStringValuesTo3.getItemsTrimmed();
                dataTrimmed = trimStringValuesTo3.getDataTrimmed();
                map2 = asMutableMap;
            } else if (value instanceof Collection) {
                List<Object> mutableList = CollectionsKt.toMutableList((Collection) value);
                TrimMetrics trimStringValuesTo4 = stringUtils.trimStringValuesTo(maxStringLength, mutableList);
                itemsTrimmed = trimStringValuesTo4.getItemsTrimmed();
                dataTrimmed = trimStringValuesTo4.getDataTrimmed();
                map2 = mutableList;
            }
            entry.setValue(map2);
            i += itemsTrimmed;
            i2 += dataTrimmed;
        }
        return new TrimMetrics(i, i2);
    }

    @NotNull
    public final TrimMetrics trimStringValuesTo(int maxStringLength, @NotNull List<Object> list) {
        int itemsTrimmed;
        int dataTrimmed;
        Object obj;
        list.getClass();
        int size = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            StringUtils stringUtils = INSTANCE;
            Object obj2 = list.get(i3);
            if (obj2 instanceof String) {
                String str = (String) obj2;
                if (str.length() > maxStringLength) {
                    String stringTrimmedTo = stringUtils.stringTrimmedTo(maxStringLength, str);
                    int length = str.length() - maxStringLength;
                    list.set(i3, stringTrimmedTo);
                    i++;
                    i2 += length;
                }
            }
            if (stringUtils.isDefinitelyMutableMap(obj2)) {
                if (obj2 != null) {
                    TrimMetrics trimStringValuesTo = stringUtils.trimStringValuesTo(maxStringLength, TypeIntrinsics.asMutableMap(obj2));
                    itemsTrimmed = trimStringValuesTo.getItemsTrimmed();
                    dataTrimmed = trimStringValuesTo.getDataTrimmed();
                    obj = obj2;
                } else {
                    CodecsKt$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                    return null;
                }
            } else if (stringUtils.isDefinitelyMutableList(obj2)) {
                if (obj2 != null) {
                    TrimMetrics trimStringValuesTo2 = stringUtils.trimStringValuesTo(maxStringLength, TypeIntrinsics.asMutableList(obj2));
                    itemsTrimmed = trimStringValuesTo2.getItemsTrimmed();
                    dataTrimmed = trimStringValuesTo2.getDataTrimmed();
                    obj = obj2;
                } else {
                    CodecsKt$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any?>");
                    return null;
                }
            } else if (obj2 instanceof Map) {
                Map mutableMap = MapsKt.toMutableMap((Map) obj2);
                if (mutableMap != null) {
                    Map<String, Object> asMutableMap = TypeIntrinsics.asMutableMap(mutableMap);
                    TrimMetrics trimStringValuesTo3 = stringUtils.trimStringValuesTo(maxStringLength, asMutableMap);
                    itemsTrimmed = trimStringValuesTo3.getItemsTrimmed();
                    dataTrimmed = trimStringValuesTo3.getDataTrimmed();
                    obj = asMutableMap;
                } else {
                    CodecsKt$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                    return null;
                }
            } else if (obj2 instanceof Collection) {
                List<Object> mutableList = CollectionsKt.toMutableList((Collection) obj2);
                TrimMetrics trimStringValuesTo4 = stringUtils.trimStringValuesTo(maxStringLength, mutableList);
                itemsTrimmed = trimStringValuesTo4.getItemsTrimmed();
                dataTrimmed = trimStringValuesTo4.getDataTrimmed();
                obj = mutableList;
            }
            list.set(i3, obj);
            i += itemsTrimmed;
            i2 += dataTrimmed;
        }
        return new TrimMetrics(i, i2);
    }
}
