package com.facebook.react.common.mapbuffer;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import android.util.SparseArray;
import androidx.exifinterface.media.ExifInterface;
import com.dee.app.metrics.MetricsConstants;
import com.facebook.hermes.intl.Intl$$ExternalSyntheticBUOutline0;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.common.mapbuffer.MapBuffer;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.NotThreadSafe;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DoNotStrip
@NotThreadSafe
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\t\n\u0002\u0010\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\fJ\u0016\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\rJ\u0016\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000eJ\u0016\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0001J\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0002J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\tH\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u001f\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010!2\u0006\u0010\b\u001a\u00020\tH\u0016J(\u0010\"\u001a\u0002H#\"\u0006\b\u0000\u0010#\u0018\u00012\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0082\b¢\u0006\u0002\u0010$J\u0014\u0010%\u001a\u00020\u0019*\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00160'H\u0096\u0002J\b\u0010(\u001a\u00020)H\u0003J\u0013\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060+H\u0003¢\u0006\u0002\u0010,R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006."}, d2 = {"Lcom/facebook/react/common/mapbuffer/WritableMapBuffer;", "Lcom/facebook/react/common/mapbuffer/MapBuffer;", "<init>", "()V", "values", "Landroid/util/SparseArray;", "", MetricsConstants.Method.CACHE_PUT, "key", "", "value", "", "", "", "", "putInternal", "count", "getCount", "()I", "contains", "getKeyOffset", "entryAt", "Lcom/facebook/react/common/mapbuffer/MapBuffer$Entry;", "offset", "getType", "Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;", "getBoolean", "getInt", "getLong", "getDouble", "getString", "getMapBuffer", "getMapBufferList", "", "verifyValue", ExifInterface.GPS_DIRECTION_TRUE, "(ILjava/lang/Object;)Ljava/lang/Object;", "dataType", "iterator", "", "getKeys", "", "getValues", "", "()[Ljava/lang/Object;", "MapBufferEntry", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWritableMapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WritableMapBuffer.kt\ncom/facebook/react/common/mapbuffer/WritableMapBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,195:1\n131#1:197\n132#1,4:199\n131#1:203\n132#1,4:205\n131#1:209\n132#1,4:211\n131#1:215\n132#1,4:217\n131#1:221\n132#1,4:223\n131#1:227\n132#1,4:229\n131#1:233\n132#1,4:235\n1#2:196\n1#2:198\n1#2:204\n1#2:210\n1#2:216\n1#2:222\n1#2:228\n1#2:234\n*S KotlinDebug\n*F\n+ 1 WritableMapBuffer.kt\ncom/facebook/react/common/mapbuffer/WritableMapBuffer\n*L\n115#1:197\n115#1:199,4\n117#1:203\n117#1:205,4\n119#1:209\n119#1:211,4\n121#1:215\n121#1:217,4\n123#1:221\n123#1:223,4\n125#1:227\n125#1:229,4\n127#1:233\n127#1:235,4\n115#1:198\n117#1:204\n119#1:210\n121#1:216\n123#1:222\n125#1:228\n127#1:234\n*E\n"})
/* loaded from: classes6.dex */
public final class WritableMapBuffer implements MapBuffer {

    @NotNull
    private final SparseArray<Object> values = new SparseArray<>();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\bR\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/facebook/react/common/mapbuffer/WritableMapBuffer$MapBufferEntry;", "Lcom/facebook/react/common/mapbuffer/MapBuffer$Entry;", "index", "", "<init>", "(Lcom/facebook/react/common/mapbuffer/WritableMapBuffer;I)V", "key", "getKey", "()I", "type", "Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;", "getType", "()Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;", "booleanValue", "", "getBooleanValue", "()Z", "intValue", "getIntValue", "longValue", "", "getLongValue", "()J", "doubleValue", "", "getDoubleValue", "()D", "stringValue", "", "getStringValue", "()Ljava/lang/String;", "mapBufferValue", "Lcom/facebook/react/common/mapbuffer/MapBuffer;", "getMapBufferValue", "()Lcom/facebook/react/common/mapbuffer/MapBuffer;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nWritableMapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WritableMapBuffer.kt\ncom/facebook/react/common/mapbuffer/WritableMapBuffer$MapBufferEntry\n+ 2 WritableMapBuffer.kt\ncom/facebook/react/common/mapbuffer/WritableMapBuffer\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,195:1\n131#2:196\n132#2,4:198\n131#2:202\n132#2,4:204\n131#2:208\n132#2,4:210\n131#2:214\n132#2,4:216\n131#2:220\n132#2,4:222\n131#2:226\n132#2,4:228\n1#3:197\n1#3:203\n1#3:209\n1#3:215\n1#3:221\n1#3:227\n*S KotlinDebug\n*F\n+ 1 WritableMapBuffer.kt\ncom/facebook/react/common/mapbuffer/WritableMapBuffer$MapBufferEntry\n*L\n163#1:196\n163#1:198,4\n166#1:202\n166#1:204,4\n169#1:208\n169#1:210,4\n172#1:214\n172#1:216,4\n175#1:220\n175#1:222,4\n178#1:226\n178#1:228,4\n163#1:197\n166#1:203\n169#1:209\n172#1:215\n175#1:221\n178#1:227\n*E\n"})
    public final class MapBufferEntry implements MapBuffer.Entry {
        private final int index;
        private final int key;

        @NotNull
        private final MapBuffer.DataType type;

        public MapBufferEntry(int i) {
            this.index = i;
            this.key = WritableMapBuffer.this.values.keyAt(i);
            Object valueAt = WritableMapBuffer.this.values.valueAt(i);
            valueAt.getClass();
            this.type = WritableMapBuffer.this.dataType(valueAt, getKey());
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public boolean getBooleanValue() {
            int key = getKey();
            Object valueAt = WritableMapBuffer.this.values.valueAt(this.index);
            if (valueAt == null) {
                Path$$ExternalSyntheticBUOutline0.m((Object) a$$ExternalSyntheticOutline0.m(key, "Key not found: "));
                return false;
            }
            if (valueAt instanceof Boolean) {
                return ((Boolean) valueAt).booleanValue();
            }
            Intl$$ExternalSyntheticBUOutline0.m(Boolean.class, key, ", found ", valueAt.getClass());
            return false;
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public double getDoubleValue() {
            int key = getKey();
            Object valueAt = WritableMapBuffer.this.values.valueAt(this.index);
            if (valueAt == null) {
                Path$$ExternalSyntheticBUOutline0.m((Object) a$$ExternalSyntheticOutline0.m(key, "Key not found: "));
                return 0.0d;
            }
            if (valueAt instanceof Double) {
                return ((Number) valueAt).doubleValue();
            }
            Intl$$ExternalSyntheticBUOutline0.m(Double.class, key, ", found ", valueAt.getClass());
            return 0.0d;
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public int getIntValue() {
            int key = getKey();
            Object valueAt = WritableMapBuffer.this.values.valueAt(this.index);
            if (valueAt == null) {
                Path$$ExternalSyntheticBUOutline0.m((Object) a$$ExternalSyntheticOutline0.m(key, "Key not found: "));
                return 0;
            }
            if (valueAt instanceof Integer) {
                return ((Number) valueAt).intValue();
            }
            Intl$$ExternalSyntheticBUOutline0.m(Integer.class, key, ", found ", valueAt.getClass());
            return 0;
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public int getKey() {
            return this.key;
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public long getLongValue() {
            int key = getKey();
            Object valueAt = WritableMapBuffer.this.values.valueAt(this.index);
            if (valueAt == null) {
                Path$$ExternalSyntheticBUOutline0.m((Object) a$$ExternalSyntheticOutline0.m(key, "Key not found: "));
                return 0L;
            }
            if (valueAt instanceof Long) {
                return ((Number) valueAt).longValue();
            }
            Intl$$ExternalSyntheticBUOutline0.m(Long.class, key, ", found ", valueAt.getClass());
            return 0L;
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        @NotNull
        public MapBuffer getMapBufferValue() {
            int key = getKey();
            Object valueAt = WritableMapBuffer.this.values.valueAt(this.index);
            if (valueAt == null) {
                Path$$ExternalSyntheticBUOutline0.m((Object) a$$ExternalSyntheticOutline0.m(key, "Key not found: "));
                return null;
            }
            if (valueAt instanceof MapBuffer) {
                return (MapBuffer) valueAt;
            }
            Intl$$ExternalSyntheticBUOutline0.m(MapBuffer.class, key, ", found ", valueAt.getClass());
            return null;
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        @NotNull
        public String getStringValue() {
            int key = getKey();
            Object valueAt = WritableMapBuffer.this.values.valueAt(this.index);
            if (valueAt == null) {
                Path$$ExternalSyntheticBUOutline0.m((Object) a$$ExternalSyntheticOutline0.m(key, "Key not found: "));
                return null;
            }
            if (valueAt instanceof String) {
                return (String) valueAt;
            }
            Intl$$ExternalSyntheticBUOutline0.m(String.class, key, ", found ", valueAt.getClass());
            return null;
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        @NotNull
        public MapBuffer.DataType getType() {
            return this.type;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MapBuffer.DataType dataType(Object obj, int i) {
        if (obj instanceof Boolean) {
            return MapBuffer.DataType.BOOL;
        }
        if (obj instanceof Integer) {
            return MapBuffer.DataType.INT;
        }
        if (obj instanceof Long) {
            return MapBuffer.DataType.LONG;
        }
        if (obj instanceof Double) {
            return MapBuffer.DataType.DOUBLE;
        }
        if (obj instanceof String) {
            return MapBuffer.DataType.STRING;
        }
        if (obj instanceof MapBuffer) {
            return MapBuffer.DataType.MAP;
        }
        OnnxMap$$ExternalSyntheticBUOutline0.m(i, "Key ", " has value of unknown type: ", obj.getClass());
        return null;
    }

    @DoNotStrip
    private final int[] getKeys() {
        int size = this.values.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = this.values.keyAt(i);
        }
        return iArr;
    }

    @DoNotStrip
    private final Object[] getValues() {
        int size = this.values.size();
        Object[] objArr = new Object[size];
        for (int i = 0; i < size; i++) {
            Object valueAt = this.values.valueAt(i);
            valueAt.getClass();
            objArr[i] = valueAt;
        }
        return objArr;
    }

    private final WritableMapBuffer putInternal(int key, Object value) {
        IntRange kEY_RANGE$ReactAndroid_release = MapBuffer.INSTANCE.getKEY_RANGE$ReactAndroid_release();
        int first = kEY_RANGE$ReactAndroid_release.getFirst();
        if (key > kEY_RANGE$ReactAndroid_release.getLast() || first > key) {
            Single$$ExternalSyntheticBUOutline0.m$3("Only integers in [0;65535] range are allowed for keys.");
            return null;
        }
        this.values.put(key, value);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final /* synthetic */ <T> T verifyValue(int key, Object value) {
        if (value == 0) {
            Path$$ExternalSyntheticBUOutline0.m((Object) a$$ExternalSyntheticOutline0.m(key, "Key not found: "));
            return null;
        }
        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
        if (value != 0) {
            return value;
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        Intl$$ExternalSyntheticBUOutline0.m(Object.class, key, ", found ", value.getClass());
        return null;
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public boolean contains(int key) {
        return this.values.get(key) != null;
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    @NotNull
    public MapBuffer.Entry entryAt(int offset) {
        return new MapBufferEntry(offset);
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public boolean getBoolean(int key) {
        Object obj = this.values.get(key);
        if (obj == null) {
            Path$$ExternalSyntheticBUOutline0.m((Object) a$$ExternalSyntheticOutline0.m(key, "Key not found: "));
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        Intl$$ExternalSyntheticBUOutline0.m(Boolean.class, key, ", found ", obj.getClass());
        return false;
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public int getCount() {
        return this.values.size();
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public double getDouble(int key) {
        Object obj = this.values.get(key);
        if (obj == null) {
            Path$$ExternalSyntheticBUOutline0.m((Object) a$$ExternalSyntheticOutline0.m(key, "Key not found: "));
            return 0.0d;
        }
        if (obj instanceof Double) {
            return ((Number) obj).doubleValue();
        }
        Intl$$ExternalSyntheticBUOutline0.m(Double.class, key, ", found ", obj.getClass());
        return 0.0d;
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public int getInt(int key) {
        Object obj = this.values.get(key);
        if (obj == null) {
            Path$$ExternalSyntheticBUOutline0.m((Object) a$$ExternalSyntheticOutline0.m(key, "Key not found: "));
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        Intl$$ExternalSyntheticBUOutline0.m(Integer.class, key, ", found ", obj.getClass());
        return 0;
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public int getKeyOffset(int key) {
        return this.values.indexOfKey(key);
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public long getLong(int key) {
        Object obj = this.values.get(key);
        if (obj == null) {
            Path$$ExternalSyntheticBUOutline0.m((Object) a$$ExternalSyntheticOutline0.m(key, "Key not found: "));
            return 0L;
        }
        if (obj instanceof Long) {
            return ((Number) obj).longValue();
        }
        Intl$$ExternalSyntheticBUOutline0.m(Long.class, key, ", found ", obj.getClass());
        return 0L;
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    @NotNull
    public MapBuffer getMapBuffer(int key) {
        Object obj = this.values.get(key);
        if (obj == null) {
            Path$$ExternalSyntheticBUOutline0.m((Object) a$$ExternalSyntheticOutline0.m(key, "Key not found: "));
            return null;
        }
        if (obj instanceof MapBuffer) {
            return (MapBuffer) obj;
        }
        Intl$$ExternalSyntheticBUOutline0.m(MapBuffer.class, key, ", found ", obj.getClass());
        return null;
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    @NotNull
    public List<MapBuffer> getMapBufferList(int key) {
        Object obj = this.values.get(key);
        if (obj == null) {
            Path$$ExternalSyntheticBUOutline0.m((Object) a$$ExternalSyntheticOutline0.m(key, "Key not found: "));
            return null;
        }
        if (obj instanceof List) {
            return (List) obj;
        }
        Intl$$ExternalSyntheticBUOutline0.m(List.class, key, ", found ", obj.getClass());
        return null;
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    @NotNull
    public String getString(int key) {
        Object obj = this.values.get(key);
        if (obj == null) {
            Path$$ExternalSyntheticBUOutline0.m((Object) a$$ExternalSyntheticOutline0.m(key, "Key not found: "));
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        Intl$$ExternalSyntheticBUOutline0.m(String.class, key, ", found ", obj.getClass());
        return null;
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    @NotNull
    public MapBuffer.DataType getType(int key) {
        Object obj = this.values.get(key);
        if (obj != null) {
            return dataType(obj, key);
        }
        Path$$ExternalSyntheticBUOutline0.m((Object) a$$ExternalSyntheticOutline0.m(key, "Key not found: "));
        return null;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<MapBuffer.Entry> iterator() {
        return new WritableMapBuffer$iterator$1(this);
    }

    @NotNull
    public final WritableMapBuffer put(int key, boolean value) {
        return putInternal(key, Boolean.valueOf(value));
    }

    @NotNull
    public final WritableMapBuffer put(int key, int value) {
        return putInternal(key, Integer.valueOf(value));
    }

    @NotNull
    public final WritableMapBuffer put(int key, long value) {
        return putInternal(key, Long.valueOf(value));
    }

    @NotNull
    public final WritableMapBuffer put(int key, double value) {
        return putInternal(key, Double.valueOf(value));
    }

    @NotNull
    public final WritableMapBuffer put(int key, @NotNull String value) {
        value.getClass();
        return putInternal(key, value);
    }

    @NotNull
    public final WritableMapBuffer put(int key, @NotNull MapBuffer value) {
        value.getClass();
        return putInternal(key, value);
    }
}
