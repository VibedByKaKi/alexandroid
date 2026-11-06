package androidx.transition;

import android.util.SparseArray;
import android.view.View;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
class TransitionValuesMaps {
    final ArrayMap<View, TransitionValues> mViewValues = new ArrayMap<>();
    final SparseArray<View> mIdValues = new SparseArray<>();
    final LongSparseArray<View> mItemIdValues = new LongSparseArray<>();
    final ArrayMap<String, View> mNameValues = new ArrayMap<>();
}
