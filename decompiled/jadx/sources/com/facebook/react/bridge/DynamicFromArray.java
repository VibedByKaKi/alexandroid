package com.facebook.react.bridge;

import androidx.core.util.Pools;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/facebook/react/bridge/DynamicFromArray;", "Lcom/facebook/react/bridge/Dynamic;", "<init>", "()V", "array", "Lcom/facebook/react/bridge/ReadableArray;", "index", "", "recycle", "", "type", "Lcom/facebook/react/bridge/ReadableType;", "getType", "()Lcom/facebook/react/bridge/ReadableType;", "isNull", "", "()Z", "asArray", "asBoolean", "asDouble", "", "asInt", "asMap", "Lcom/facebook/react/bridge/ReadableMap;", "asString", "", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DynamicFromArray implements Dynamic {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Pools.SimplePool<DynamicFromArray> pool = new Pools.SimplePool<>(10);

    @Nullable
    private ReadableArray array;
    private int index;

    private DynamicFromArray() {
        this.index = -1;
    }

    @JvmStatic
    @NotNull
    public static final DynamicFromArray create(@NotNull ReadableArray readableArray, int i) {
        return INSTANCE.create(readableArray, i);
    }

    @Override // com.facebook.react.bridge.Dynamic
    @NotNull
    public ReadableArray asArray() {
        ReadableArray array;
        ReadableArray readableArray = this.array;
        if (readableArray != null && (array = readableArray.getArray(this.index)) != null) {
            return array;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("This dynamic value has been recycled");
        return null;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean asBoolean() {
        ReadableArray readableArray = this.array;
        if (readableArray != null) {
            return readableArray.getBoolean(this.index);
        }
        Single$$ExternalSyntheticBUOutline0.m$2("This dynamic value has been recycled");
        return false;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public double asDouble() {
        ReadableArray readableArray = this.array;
        if (readableArray != null) {
            return readableArray.getDouble(this.index);
        }
        Single$$ExternalSyntheticBUOutline0.m$2("This dynamic value has been recycled");
        return 0.0d;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public int asInt() {
        ReadableArray readableArray = this.array;
        if (readableArray != null) {
            return readableArray.getInt(this.index);
        }
        Single$$ExternalSyntheticBUOutline0.m$2("This dynamic value has been recycled");
        return 0;
    }

    @Override // com.facebook.react.bridge.Dynamic
    @NotNull
    public ReadableMap asMap() {
        ReadableMap map;
        ReadableArray readableArray = this.array;
        if (readableArray != null && (map = readableArray.getMap(this.index)) != null) {
            return map;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("This dynamic value has been recycled");
        return null;
    }

    @Override // com.facebook.react.bridge.Dynamic
    @NotNull
    public String asString() {
        String string;
        ReadableArray readableArray = this.array;
        if (readableArray != null && (string = readableArray.getString(this.index)) != null) {
            return string;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("This dynamic value has been recycled");
        return null;
    }

    @Override // com.facebook.react.bridge.Dynamic
    @NotNull
    public ReadableType getType() {
        ReadableType type;
        ReadableArray readableArray = this.array;
        if (readableArray != null && (type = readableArray.getType(this.index)) != null) {
            return type;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("This dynamic value has been recycled");
        return null;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean isNull() {
        ReadableArray readableArray = this.array;
        if (readableArray != null) {
            return readableArray.isNull(this.index);
        }
        Single$$ExternalSyntheticBUOutline0.m$2("This dynamic value has been recycled");
        return false;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public void recycle() {
        this.array = null;
        this.index = -1;
        pool.release(this);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/facebook/react/bridge/DynamicFromArray$Companion;", "", "<init>", "()V", "pool", "Landroidx/core/util/Pools$SimplePool;", "Lcom/facebook/react/bridge/DynamicFromArray;", "create", "array", "Lcom/facebook/react/bridge/ReadableArray;", "index", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final DynamicFromArray create(@NotNull ReadableArray array, int index) {
            array.getClass();
            DynamicFromArray dynamicFromArray = (DynamicFromArray) DynamicFromArray.pool.acquire();
            if (dynamicFromArray == null) {
                dynamicFromArray = new DynamicFromArray(null);
            }
            dynamicFromArray.array = array;
            dynamicFromArray.index = index;
            return dynamicFromArray;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DynamicFromArray(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
