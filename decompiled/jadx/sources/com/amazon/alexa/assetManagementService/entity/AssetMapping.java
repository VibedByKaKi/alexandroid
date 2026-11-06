package com.amazon.alexa.assetManagementService.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.amazon.alexa.assetManagementService.model.constants.LocalDBQuery;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Entity(primaryKeys = {"resourceId", "bundleId"})
/* loaded from: classes.dex */
public final class AssetMapping {

    @NonNull
    @ColumnInfo(name = LocalDBQuery.ASSET_URL_COLUMN)
    public String assetURL;

    @NonNull
    @ColumnInfo(name = "bundleId")
    public String bundleId;

    @NonNull
    @ColumnInfo(name = "resourceId")
    public String resourceId;

    public AssetMapping(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("bundleId is marked non-null but is null");
            throw null;
        }
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("resourceId is marked non-null but is null");
            throw null;
        }
        if (str3 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("assetURL is marked non-null but is null");
            throw null;
        }
        this.bundleId = str;
        this.resourceId = str2;
        this.assetURL = str3;
    }

    public AssetMapping() {
    }
}
