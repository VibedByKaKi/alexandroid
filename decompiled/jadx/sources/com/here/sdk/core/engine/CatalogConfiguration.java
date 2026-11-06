package com.here.sdk.core.engine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.core.SDKLibraryLoader;
import com.here.time.Duration;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class CatalogConfiguration {
    static final SDKLibraryLoader LIBRARY_LOADER = new SDKLibraryLoader("SDK");

    @NonNull
    public DesiredCatalog catalog;

    @Nullable
    public String patchHrn = null;

    @Nullable
    public Duration cacheExpirationPeriod = null;
    public boolean allowDownload = true;

    public CatalogConfiguration(@NonNull DesiredCatalog desiredCatalog) {
        this.catalog = desiredCatalog;
    }

    @NonNull
    public static native CatalogConfiguration getDefault(@NonNull CatalogType catalogType);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CatalogConfiguration)) {
            return false;
        }
        CatalogConfiguration catalogConfiguration = (CatalogConfiguration) obj;
        return Objects.equals(this.catalog, catalogConfiguration.catalog) && Objects.equals(this.patchHrn, catalogConfiguration.patchHrn) && Objects.equals(this.cacheExpirationPeriod, catalogConfiguration.cacheExpirationPeriod) && this.allowDownload == catalogConfiguration.allowDownload;
    }

    public int hashCode() {
        DesiredCatalog desiredCatalog = this.catalog;
        int hashCode = (JfifUtil.MARKER_EOI + (desiredCatalog != null ? desiredCatalog.hashCode() : 0)) * 31;
        String str = this.patchHrn;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Duration duration = this.cacheExpirationPeriod;
        return ((hashCode2 + (duration != null ? duration.hashCode() : 0)) * 31) + (this.allowDownload ? 79 : 97);
    }
}
