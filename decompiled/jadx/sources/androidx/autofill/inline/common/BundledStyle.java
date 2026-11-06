package androidx.autofill.inline.common;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(api = 30)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public abstract class BundledStyle {

    @NonNull
    protected final Bundle mBundle;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Builder<T extends BundledStyle> {

        @NonNull
        protected final Bundle mBundle;

        public Builder(@NonNull String str) {
            Bundle bundle = new Bundle();
            this.mBundle = bundle;
            bundle.putBoolean(str, true);
        }

        @NonNull
        public abstract T build();
    }

    public BundledStyle(@NonNull Bundle bundle) {
        this.mBundle = bundle;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void assertIsValid() {
        if (isValid()) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m(getStyleKey(), "Invalid style, missing bundle key ");
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final Bundle getBundle() {
        return this.mBundle;
    }

    @NonNull
    public abstract String getStyleKey();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean isValid() {
        Bundle bundle = this.mBundle;
        return bundle != null && bundle.getBoolean(getStyleKey(), false);
    }
}
