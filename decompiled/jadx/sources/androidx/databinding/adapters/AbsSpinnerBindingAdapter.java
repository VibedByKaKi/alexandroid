package androidx.databinding.adapters;

import android.R;
import android.widget.AbsSpinner;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes13.dex */
public class AbsSpinnerBindingAdapter {
    @BindingAdapter({"android:entries"})
    public static <T extends CharSequence> void setEntries(AbsSpinner absSpinner, T[] tArr) {
        if (tArr == null) {
            absSpinner.setAdapter((SpinnerAdapter) null);
            return;
        }
        SpinnerAdapter adapter = absSpinner.getAdapter();
        if (adapter != null && adapter.getCount() == tArr.length) {
            for (int i = 0; i < tArr.length; i++) {
                if (tArr[i].equals(adapter.getItem(i))) {
                }
            }
            return;
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(absSpinner.getContext(), R.layout.simple_spinner_item, tArr);
        arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        absSpinner.setAdapter((SpinnerAdapter) arrayAdapter);
    }

    @BindingAdapter({"android:entries"})
    public static <T> void setEntries(AbsSpinner absSpinner, List<T> list) {
        if (list != null) {
            SpinnerAdapter adapter = absSpinner.getAdapter();
            if (adapter instanceof ObservableListAdapter) {
                ((ObservableListAdapter) adapter).setList(list);
                return;
            } else {
                absSpinner.setAdapter((SpinnerAdapter) new ObservableListAdapter(absSpinner.getContext(), list, R.layout.simple_spinner_item, R.layout.simple_spinner_dropdown_item, 0));
                return;
            }
        }
        absSpinner.setAdapter((SpinnerAdapter) null);
    }
}
