package com.here.sdk.search;

import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.core.LanguageCode;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class SearchOptions {

    @Nullable
    public LanguageCode languageCode = null;

    @Nullable
    public Integer maxItems = null;
    public boolean highDensityEncodingEnabled = false;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchOptions)) {
            return false;
        }
        SearchOptions searchOptions = (SearchOptions) obj;
        return Objects.equals(this.languageCode, searchOptions.languageCode) && Objects.equals(this.maxItems, searchOptions.maxItems) && this.highDensityEncodingEnabled == searchOptions.highDensityEncodingEnabled;
    }

    public int hashCode() {
        LanguageCode languageCode = this.languageCode;
        int hashCode = (JfifUtil.MARKER_EOI + (languageCode != null ? languageCode.hashCode() : 0)) * 31;
        Integer num = this.maxItems;
        return ((hashCode + (num != null ? num.hashCode() : 0)) * 31) + (this.highDensityEncodingEnabled ? 79 : 97);
    }
}
