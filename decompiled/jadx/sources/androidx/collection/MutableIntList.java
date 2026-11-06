package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.RuntimeHelpersKt;
import com.amazon.clouddrive.extended.model.BulkOperationType;
import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import com.dee.app.metrics.MetricsConstants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003J\u0018\u0010\b\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003J\u0011\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0001H\u0086\bJ\u0018\u0010\r\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0001J\u0018\u0010\r\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fJ\u0011\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086\bJ\u0006\u0010\u0010\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0003J\u0011\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0001H\u0086\u0002J\u0011\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H\u0086\nJ\u0011\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086\u0002J\u0011\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0001H\u0086\nJ\u0011\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H\u0086\nJ\u0011\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086\nJ\u000e\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003J\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0001J\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0016\u001a\u00020\u00032\b\b\u0001\u0010\f\u001a\u00020\u0003J\u001a\u0010\u0017\u001a\u00020\u000b2\b\b\u0001\u0010\u0018\u001a\u00020\u00032\b\b\u0001\u0010\u0019\u001a\u00020\u0003J\u000e\u0010\u001a\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0001J\u000e\u0010\u001a\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001b\u0010\u001b\u001a\u00020\u00032\b\b\u0001\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0086\u0002J\u0006\u0010\u001c\u001a\u00020\u000bJ\u0006\u0010\u001d\u001a\u00020\u000bJ\u0010\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u0003R\u0012\u0010\u0005\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006 "}, d2 = {"Landroidx/collection/MutableIntList;", "Landroidx/collection/IntList;", "initialCapacity", "", "(I)V", "capacity", "getCapacity", "()I", BulkOperationType.add, "", "element", "", "index", "addAll", AlexaMetricsConstants.MetricsComponents.ELEMENTS, "", MetricsConstants.Method.CACHE_CLEAR, "ensureCapacity", "minusAssign", "plusAssign", BulkOperationType.remove, "removeAll", "removeAt", "removeRange", "start", "end", "retainAll", "set", "sort", "sortDescending", "trim", "minCapacity", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/MutableIntList\n+ 2 IntList.kt\nandroidx/collection/IntList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,968:1\n556#1:970\n363#2:969\n70#2:971\n237#2,6:974\n70#2:980\n70#2:981\n70#2:988\n13330#3,2:972\n1663#3,6:982\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/MutableIntList\n*L\n692#1:970\n628#1:969\n749#1:971\n762#1:974,6\n776#1:980\n822#1:981\n839#1:988\n757#1:972,2\n824#1:982,6\n*E\n"})
/* loaded from: classes.dex */
public final class MutableIntList extends IntList {
    public /* synthetic */ MutableIntList(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public static /* synthetic */ void trim$default(MutableIntList mutableIntList, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = mutableIntList._size;
        }
        mutableIntList.trim(i);
    }

    public final void add(@IntRange(from = 0) int index, int element) {
        if (index < 0 || index > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        ensureCapacity(this._size + 1);
        int[] iArr = this.content;
        int i = this._size;
        if (index != i) {
            ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, index + 1, index, i);
        }
        iArr[index] = element;
        this._size++;
    }

    public final boolean addAll(@IntRange(from = 0) int index, @NotNull IntList elements) {
        elements.getClass();
        if (index < 0 || index > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int i = elements._size;
        if (i == 0) {
            return false;
        }
        ensureCapacity(this._size + i);
        int[] iArr = this.content;
        int i2 = this._size;
        if (index != i2) {
            ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, elements._size + index, index, i2);
        }
        ArraysKt___ArraysJvmKt.copyInto(elements.content, iArr, index, 0, elements._size);
        this._size += elements._size;
        return true;
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int capacity) {
        int[] iArr = this.content;
        if (iArr.length < capacity) {
            this.content = Arrays.copyOf(iArr, Math.max(capacity, (iArr.length * 3) / 2));
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(@NotNull IntList elements) {
        elements.getClass();
        int[] iArr = elements.content;
        int i = elements._size;
        for (int i2 = 0; i2 < i; i2++) {
            remove(iArr[i2]);
        }
    }

    public final void plusAssign(@NotNull IntList elements) {
        elements.getClass();
        addAll(this._size, elements);
    }

    public final boolean remove(int element) {
        int indexOf = indexOf(element);
        if (indexOf < 0) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    public final boolean removeAll(@NotNull IntList elements) {
        elements.getClass();
        int i = this._size;
        int i2 = elements._size - 1;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                remove(elements.get(i3));
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        return i != this._size;
    }

    public final int removeAt(@IntRange(from = 0) int index) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        int[] iArr = this.content;
        int i = iArr[index];
        int i2 = this._size;
        if (index != i2 - 1) {
            ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, index, index + 1, i2);
        }
        this._size--;
        return i;
    }

    public final void removeRange(@IntRange(from = 0) int start, @IntRange(from = 0) int end) {
        int i;
        if (start < 0 || start > (i = this._size) || end < 0 || end > i) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        if (end < start) {
            RuntimeHelpersKt.throwIllegalArgumentException("The end index must be < start index");
        }
        if (end != start) {
            int i2 = this._size;
            if (end < i2) {
                int[] iArr = this.content;
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, start, end, i2);
            }
            this._size -= end - start;
        }
    }

    public final boolean retainAll(@NotNull int[] elements) {
        elements.getClass();
        int i = this._size;
        int[] iArr = this.content;
        int i2 = i - 1;
        while (true) {
            int i3 = 0;
            int i4 = -1;
            if (-1 >= i2) {
                break;
            }
            int i5 = iArr[i2];
            int length = elements.length;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (elements[i3] == i5) {
                    i4 = i3;
                    break;
                }
                i3++;
            }
            if (i4 < 0) {
                removeAt(i2);
            }
            i2--;
        }
        return i != this._size;
    }

    public final int set(@IntRange(from = 0) int index, int element) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        int[] iArr = this.content;
        int i = iArr[index];
        iArr[index] = element;
        return i;
    }

    public final void sort() {
        int i = this._size;
        if (i == 0) {
            return;
        }
        ArraysKt___ArraysJvmKt.sort(this.content, 0, i);
    }

    public final void sortDescending() {
        int i = this._size;
        if (i == 0) {
            return;
        }
        ArraysKt___ArraysKt.sortDescending(this.content, 0, i);
    }

    public final void trim(int minCapacity) {
        int max = Math.max(minCapacity, this._size);
        int[] iArr = this.content;
        if (iArr.length > max) {
            this.content = Arrays.copyOf(iArr, max);
        }
    }

    public final void plusAssign(@NotNull int[] elements) {
        elements.getClass();
        addAll(this._size, elements);
    }

    public MutableIntList(int i) {
        super(i, null);
    }

    public final void plusAssign(int element) {
        add(element);
    }

    public MutableIntList() {
        this(0, 1, null);
    }

    public final void minusAssign(@NotNull int[] elements) {
        elements.getClass();
        for (int i : elements) {
            remove(i);
        }
    }

    public final void minusAssign(int element) {
        remove(element);
    }

    public final boolean removeAll(@NotNull int[] elements) {
        elements.getClass();
        int i = this._size;
        for (int i2 : elements) {
            remove(i2);
        }
        return i != this._size;
    }

    public final boolean add(int element) {
        ensureCapacity(this._size + 1);
        int[] iArr = this.content;
        int i = this._size;
        iArr[i] = element;
        this._size = i + 1;
        return true;
    }

    public final boolean retainAll(@NotNull IntList elements) {
        elements.getClass();
        int i = this._size;
        int[] iArr = this.content;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!elements.contains(iArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this._size;
    }

    public final boolean addAll(@IntRange(from = 0) int index, @NotNull int[] elements) {
        elements.getClass();
        if (index < 0 || index > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(this._size + elements.length);
        int[] iArr = this.content;
        int i = this._size;
        if (index != i) {
            ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, elements.length + index, index, i);
        }
        ArraysKt___ArraysJvmKt.copyInto$default(elements, iArr, index, 0, 0, 12, (Object) null);
        this._size += elements.length;
        return true;
    }

    public final boolean addAll(@NotNull IntList elements) {
        elements.getClass();
        return addAll(this._size, elements);
    }

    public final boolean addAll(@NotNull int[] elements) {
        elements.getClass();
        return addAll(this._size, elements);
    }
}
