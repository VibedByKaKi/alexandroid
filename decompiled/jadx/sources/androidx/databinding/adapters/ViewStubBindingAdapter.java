package androidx.databinding.adapters;

import android.view.ViewStub;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;
import androidx.databinding.Untaggable;
import androidx.databinding.ViewStubProxy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@BindingMethods({@BindingMethod(attribute = "android:layout", method = "setLayoutResource", type = ViewStub.class)})
@Untaggable({"android.view.ViewStub"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes13.dex */
public class ViewStubBindingAdapter {
    @BindingAdapter({"android:onInflate"})
    public static void setOnInflateListener(ViewStubProxy viewStubProxy, ViewStub.OnInflateListener onInflateListener) {
        viewStubProxy.setOnInflateListener(onInflateListener);
    }
}
