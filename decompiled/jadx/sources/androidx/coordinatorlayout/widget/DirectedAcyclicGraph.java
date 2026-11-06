package androidx.coordinatorlayout.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes13.dex */
public final class DirectedAcyclicGraph<T> {
    private final Pools.Pool<ArrayList<T>> mListPool = new Pools.SimplePool(10);
    private final SimpleArrayMap<T, ArrayList<T>> mGraph = new SimpleArrayMap<>();
    private final ArrayList<T> mSortResult = new ArrayList<>();
    private final HashSet<T> mSortTmpMarked = new HashSet<>();

    private void dfs(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            Single$$ExternalSyntheticBUOutline0.m("This graph contains cyclic dependencies");
            return;
        }
        hashSet.add(t);
        ArrayList<T> arrayList2 = this.mGraph.get(t);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                dfs(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }

    @NonNull
    private ArrayList<T> getEmptyList() {
        ArrayList<T> acquire = this.mListPool.acquire();
        return acquire == null ? new ArrayList<>() : acquire;
    }

    private void poolList(@NonNull ArrayList<T> arrayList) {
        arrayList.clear();
        this.mListPool.release(arrayList);
    }

    public void addEdge(@NonNull T t, @NonNull T t2) {
        if (!this.mGraph.containsKey(t) || !this.mGraph.containsKey(t2)) {
            Single$$ExternalSyntheticBUOutline0.m$3("All nodes must be present in the graph before being added as an edge");
            return;
        }
        ArrayList<T> arrayList = this.mGraph.get(t);
        if (arrayList == null) {
            arrayList = getEmptyList();
            this.mGraph.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    public void addNode(@NonNull T t) {
        if (this.mGraph.containsKey(t)) {
            return;
        }
        this.mGraph.put(t, null);
    }

    public void clear() {
        int size = this.mGraph.getSize();
        int i = 0;
        while (true) {
            SimpleArrayMap<T, ArrayList<T>> simpleArrayMap = this.mGraph;
            if (i >= size) {
                simpleArrayMap.clear();
                return;
            }
            ArrayList<T> valueAt = simpleArrayMap.valueAt(i);
            if (valueAt != null) {
                poolList(valueAt);
            }
            i++;
        }
    }

    public boolean contains(@NonNull T t) {
        return this.mGraph.containsKey(t);
    }

    @Nullable
    public List<T> getIncomingEdges(@NonNull T t) {
        ArrayList<T> incomingEdgesInternal = getIncomingEdgesInternal(t);
        if (incomingEdgesInternal == null) {
            return null;
        }
        return new ArrayList(incomingEdgesInternal);
    }

    @Nullable
    public ArrayList<T> getIncomingEdgesInternal(@NonNull T t) {
        return this.mGraph.get(t);
    }

    @Nullable
    public List<T> getOutgoingEdges(@NonNull T t) {
        int size = this.mGraph.getSize();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList<T> valueAt = this.mGraph.valueAt(i);
            if (valueAt != null && valueAt.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.mGraph.keyAt(i));
            }
        }
        return arrayList;
    }

    @NonNull
    public ArrayList<T> getSortedList() {
        this.mSortResult.clear();
        this.mSortTmpMarked.clear();
        int size = this.mGraph.getSize();
        for (int i = 0; i < size; i++) {
            dfs(this.mGraph.keyAt(i), this.mSortResult, this.mSortTmpMarked);
        }
        return this.mSortResult;
    }

    public boolean hasOutgoingEdges(@NonNull T t) {
        int size = this.mGraph.getSize();
        for (int i = 0; i < size; i++) {
            ArrayList<T> valueAt = this.mGraph.valueAt(i);
            if (valueAt != null && valueAt.contains(t)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return this.mGraph.getSize();
    }
}
