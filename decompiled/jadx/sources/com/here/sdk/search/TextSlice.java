package com.here.sdk.search;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class TextSlice {

    @NonNull
    public String text = "";
    public boolean matchesQuery = false;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextSlice)) {
            return false;
        }
        TextSlice textSlice = (TextSlice) obj;
        return Objects.equals(this.text, textSlice.text) && this.matchesQuery == textSlice.matchesQuery;
    }

    public int hashCode() {
        String str = this.text;
        return ((JfifUtil.MARKER_EOI + (str != null ? str.hashCode() : 0)) * 31) + (this.matchesQuery ? 79 : 97);
    }
}
