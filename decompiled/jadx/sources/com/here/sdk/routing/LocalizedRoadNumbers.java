package com.here.sdk.routing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class LocalizedRoadNumbers {

    @NonNull
    public List<LocalizedRoadNumber> items = new ArrayList();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LocalizedRoadNumbers) {
            return Objects.equals(this.items, ((LocalizedRoadNumbers) obj).items);
        }
        return false;
    }

    @Nullable
    public native String getDefaultValue();

    @Nullable
    public native String getPreferredValueForLocales(@NonNull List<Locale> list);

    public int hashCode() {
        List<LocalizedRoadNumber> list = this.items;
        return JfifUtil.MARKER_EOI + (list != null ? list.hashCode() : 0);
    }
}
