package androidx.compose.ui.platform.coreshims;

import android.view.autofill.AutofillId;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes13.dex */
public class AutofillIdCompat {
    private final Object mWrappedObj;

    @RequiresApi(26)
    private AutofillIdCompat(AutofillId autofillId) {
        this.mWrappedObj = autofillId;
    }

    @RequiresApi(26)
    public static AutofillIdCompat toAutofillIdCompat(AutofillId autofillId) {
        return new AutofillIdCompat(autofillId);
    }

    @RequiresApi(26)
    public AutofillId toAutofillId() {
        return (AutofillId) this.mWrappedObj;
    }
}
