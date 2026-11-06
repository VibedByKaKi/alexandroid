package com.mapbox.maps.extension.observable.model;

import com.amazon.alexa.ra.core.metrics.VisualShareErrorType;
import com.facebook.common.util.UriUtil;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated(level = DeprecationLevel.WARNING, message = "This eum class is deprecated, and will be removed in next major release.", replaceWith = @ReplaceWith(expression = "RequestDataSourceType", imports = {}))
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/mapbox/maps/extension/observable/model/DataSourceType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "RESOURCE_LOADER", VisualShareErrorType.NETWORK, "DATABASE", "ASSET", "FILE_SYSTEM", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public enum DataSourceType {
    RESOURCE_LOADER("resource-loader"),
    NETWORK("network"),
    DATABASE("database"),
    ASSET(UriUtil.LOCAL_ASSET_SCHEME),
    FILE_SYSTEM("file-system");


    @NotNull
    private final String value;

    DataSourceType(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
