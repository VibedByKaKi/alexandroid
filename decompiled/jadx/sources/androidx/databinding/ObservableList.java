package androidx.databinding;

import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public interface ObservableList<T> extends List<T> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class OnListChangedCallback<T extends ObservableList> {
        public abstract void onChanged(T t);

        public abstract void onItemRangeChanged(T t, int i, int i2);

        public abstract void onItemRangeInserted(T t, int i, int i2);

        public abstract void onItemRangeMoved(T t, int i, int i2, int i3);

        public abstract void onItemRangeRemoved(T t, int i, int i2);
    }

    void addOnListChangedCallback(OnListChangedCallback<? extends ObservableList<T>> onListChangedCallback);

    void removeOnListChangedCallback(OnListChangedCallback<? extends ObservableList<T>> onListChangedCallback);
}
