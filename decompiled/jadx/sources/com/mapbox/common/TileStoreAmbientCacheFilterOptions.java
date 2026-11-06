package com.mapbox.common;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public class TileStoreAmbientCacheFilterOptions implements Serializable {

    @Nullable
    private final List<TileDataDomain> domainFilter;

    @Nullable
    private final List<TileStoreAmbientCacheType> typeFilter;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TileStoreAmbientCacheFilterOptions(@Nullable List<TileStoreAmbientCacheType> list, @Nullable List<TileDataDomain> list2) {
        this.typeFilter = list;
        this.domainFilter = list2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TileStoreAmbientCacheFilterOptions tileStoreAmbientCacheFilterOptions = (TileStoreAmbientCacheFilterOptions) obj;
        return Objects.equals(this.typeFilter, tileStoreAmbientCacheFilterOptions.typeFilter) && Objects.equals(this.domainFilter, tileStoreAmbientCacheFilterOptions.domainFilter);
    }

    @Nullable
    public List<TileDataDomain> getDomainFilter() {
        return this.domainFilter;
    }

    @Nullable
    public List<TileStoreAmbientCacheType> getTypeFilter() {
        return this.typeFilter;
    }

    public int hashCode() {
        return Objects.hash(this.typeFilter, this.domainFilter);
    }

    public String toString() {
        return "[typeFilter: " + RecordUtils.fieldToString(this.typeFilter) + ", domainFilter: " + RecordUtils.fieldToString(this.domainFilter) + MarkdownConstants.RIGHT_BRACKET;
    }
}
