package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import com.amazon.appmanager.lib.DefaultPreloadManager;
import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import com.dee.app.metrics.MetricsConstants;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003J\u0006\u0010\u0013\u001a\u00020\u0010J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\u0011\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0086\u0002J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0003J\u0006\u0010\u001a\u001a\u00020\u0003J\u000e\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0003J\u000e\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0003J\u0006\u0010\u001e\u001a\u00020\u0003R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\nR\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Landroidx/collection/CircularIntArray;", "", "minCapacity", "", "(I)V", "capacityBitmask", AlexaMetricsConstants.MetricsComponents.ELEMENTS, "", DefaultPreloadManager.METRIC_PATH_FIRST, "getFirst", "()I", "head", "last", "getLast", "tail", "addFirst", "", "element", "addLast", MetricsConstants.Method.CACHE_CLEAR, "doubleCapacity", MetricsConstants.Method.CACHE_GET, "index", "isEmpty", "", "popFirst", "popLast", "removeFromEnd", "count", "removeFromStart", "size", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCircularIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularIntArray.kt\nandroidx/collection/CircularIntArray\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,212:1\n59#2,5:213\n59#2,5:218\n24#3:223\n24#3:224\n24#3:225\n24#3:226\n24#3:227\n24#3:228\n24#3:229\n*S KotlinDebug\n*F\n+ 1 CircularIntArray.kt\nandroidx/collection/CircularIntArray\n*L\n37#1:213,5\n38#1:218,5\n101#1:223\n114#1:224\n138#1:225\n155#1:226\n168#1:227\n180#1:228\n192#1:229\n*E\n"})
/* loaded from: classes.dex */
public final class CircularIntArray {
    private int capacityBitmask;

    @NotNull
    private int[] elements;
    private int head;
    private int tail;

    @JvmOverloads
    public CircularIntArray(int i) {
        if (!(i >= 1)) {
            RuntimeHelpersKt.throwIllegalArgumentException("capacity must be >= 1");
        }
        if (!(i <= 1073741824)) {
            RuntimeHelpersKt.throwIllegalArgumentException("capacity must be <= 2^30");
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.capacityBitmask = i - 1;
        this.elements = new int[i];
    }

    private final void doubleCapacity() {
        int[] iArr = this.elements;
        int length = iArr.length;
        int i = this.head;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 < 0) {
            Single$$ExternalSyntheticBUOutline0.m("Max array capacity exceeded");
            return;
        }
        int[] iArr2 = new int[i3];
        ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, 0, i, length);
        ArraysKt___ArraysJvmKt.copyInto(this.elements, iArr2, i2, 0, this.head);
        this.elements = iArr2;
        this.head = 0;
        this.tail = length;
        this.capacityBitmask = i3 - 1;
    }

    public final void addFirst(int element) {
        int i = (this.head - 1) & this.capacityBitmask;
        this.head = i;
        this.elements[i] = element;
        if (i == this.tail) {
            doubleCapacity();
        }
    }

    public final void addLast(int element) {
        int[] iArr = this.elements;
        int i = this.tail;
        iArr[i] = element;
        int i2 = this.capacityBitmask & (i + 1);
        this.tail = i2;
        if (i2 == this.head) {
            doubleCapacity();
        }
    }

    public final void clear() {
        this.tail = this.head;
    }

    public final int get(int index) {
        if (index < 0 || index >= size()) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            Buffer$$ExternalSyntheticBUOutline0.m$1();
            return 0;
        }
        return this.elements[this.capacityBitmask & (this.head + index)];
    }

    public final int getFirst() {
        int i = this.head;
        if (i != this.tail) {
            return this.elements[i];
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        Buffer$$ExternalSyntheticBUOutline0.m$1();
        return 0;
    }

    public final int getLast() {
        int i = this.head;
        int i2 = this.tail;
        if (i != i2) {
            return this.elements[this.capacityBitmask & (i2 - 1)];
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        Buffer$$ExternalSyntheticBUOutline0.m$1();
        return 0;
    }

    public final boolean isEmpty() {
        return this.head == this.tail;
    }

    public final int popFirst() {
        int i = this.head;
        if (i != this.tail) {
            int i2 = this.elements[i];
            this.head = (i + 1) & this.capacityBitmask;
            return i2;
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        Buffer$$ExternalSyntheticBUOutline0.m$1();
        return 0;
    }

    public final int popLast() {
        int i = this.head;
        int i2 = this.tail;
        if (i == i2) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            Buffer$$ExternalSyntheticBUOutline0.m$1();
            return 0;
        }
        int i3 = this.capacityBitmask & (i2 - 1);
        int i4 = this.elements[i3];
        this.tail = i3;
        return i4;
    }

    public final void removeFromEnd(int count) {
        if (count <= 0) {
            return;
        }
        if (count <= size()) {
            this.tail = this.capacityBitmask & (this.tail - count);
        } else {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            Buffer$$ExternalSyntheticBUOutline0.m$1();
        }
    }

    public final void removeFromStart(int count) {
        if (count <= 0) {
            return;
        }
        if (count <= size()) {
            this.head = this.capacityBitmask & (this.head + count);
        } else {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            Buffer$$ExternalSyntheticBUOutline0.m$1();
        }
    }

    public final int size() {
        return this.capacityBitmask & (this.tail - this.head);
    }

    @JvmOverloads
    public CircularIntArray() {
        this(0, 1, null);
    }

    public /* synthetic */ CircularIntArray(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 8 : i);
    }
}
