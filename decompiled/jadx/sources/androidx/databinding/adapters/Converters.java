package androidx.databinding.adapters;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import androidx.databinding.BindingConversion;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class Converters {
    @BindingConversion
    public static ColorStateList convertColorToColorStateList(int i) {
        return ColorStateList.valueOf(i);
    }

    @BindingConversion
    public static ColorDrawable convertColorToDrawable(int i) {
        return new ColorDrawable(i);
    }
}
