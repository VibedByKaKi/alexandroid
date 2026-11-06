package androidx.autofill.inline.common;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceSpec;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.autofill.inline.UiVersions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(api = 30)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public abstract class SlicedContent implements UiVersions.Content {
    static final Uri INLINE_SLICE_URI = Uri.parse("inline.slice");

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    protected final Slice mSlice;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static abstract class Builder<T extends SlicedContent> {

        @NonNull
        protected final Slice.Builder mSliceBuilder;

        public Builder(@NonNull String str) {
            this.mSliceBuilder = new Slice.Builder(SlicedContent.INLINE_SLICE_URI, new SliceSpec(str, 1));
        }

        @NonNull
        public abstract T build();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public SlicedContent(@NonNull Slice slice) {
        this.mSlice = slice;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static String getVersion(@NonNull Slice slice) {
        return slice.getSpec().getType();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public abstract PendingIntent getAttributionIntent();

    @Override // androidx.autofill.inline.UiVersions.Content
    @NonNull
    public final Slice getSlice() {
        return this.mSlice;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public abstract boolean isValid();
}
