package androidx.databinding.adapters;

import android.widget.RatingBar;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.InverseBindingMethod;
import androidx.databinding.InverseBindingMethods;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@InverseBindingMethods({@InverseBindingMethod(attribute = "android:rating", type = RatingBar.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes13.dex */
public class RatingBarBindingAdapter {
    @BindingAdapter(requireAll = false, value = {"android:onRatingChanged", "android:ratingAttrChanged"})
    public static void setListeners(RatingBar ratingBar, final RatingBar.OnRatingBarChangeListener onRatingBarChangeListener, final InverseBindingListener inverseBindingListener) {
        if (inverseBindingListener == null) {
            ratingBar.setOnRatingBarChangeListener(onRatingBarChangeListener);
        } else {
            ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() { // from class: androidx.databinding.adapters.RatingBarBindingAdapter.1
                @Override // android.widget.RatingBar.OnRatingBarChangeListener
                public void onRatingChanged(RatingBar ratingBar2, float f, boolean z) {
                    RatingBar.OnRatingBarChangeListener onRatingBarChangeListener2 = onRatingBarChangeListener;
                    if (onRatingBarChangeListener2 != null) {
                        onRatingBarChangeListener2.onRatingChanged(ratingBar2, f, z);
                    }
                    inverseBindingListener.onChange();
                }
            });
        }
    }

    @BindingAdapter({"android:rating"})
    public static void setRating(RatingBar ratingBar, float f) {
        if (ratingBar.getRating() != f) {
            ratingBar.setRating(f);
        }
    }
}
