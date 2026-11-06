package com.amazon.alexa.assetManagementService.model.constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final class LocalDBQuery {
    public static final String ASSET_MAPPING_DB = "com.amazon.alexa.assetManagementService.db";
    public static final String ASSET_URL_COLUMN = "assetURL";
    public static final String DELETE_ALL_ASSET_MAPPINGS_QUERY = "DELETE FROM AssetMapping";
    public static final String SELECT_ALL_ASSET_MAPPINGS_QUERY = "SELECT * from AssetMapping";
    public static final String SELECT_ALL_BUNDLE_IDS_QUERY = "SELECT DISTINCT bundleId FROM AssetMapping";
    public static final String SELECT_MAPPING_FOR_BUNDLE_ID = "SELECT * from AssetMapping WHERE bundleId = :bundleName";

    private LocalDBQuery() {
    }
}
