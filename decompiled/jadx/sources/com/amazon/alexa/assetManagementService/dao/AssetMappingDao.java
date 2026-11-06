package com.amazon.alexa.assetManagementService.dao;

import androidx.annotation.NonNull;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.amazon.alexa.assetManagementService.entity.AssetMapping;
import com.amazon.alexa.assetManagementService.model.constants.LocalDBQuery;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Dao
/* loaded from: classes.dex */
public interface AssetMappingDao {
    @Query(LocalDBQuery.DELETE_ALL_ASSET_MAPPINGS_QUERY)
    void deleteAll();

    @Query(LocalDBQuery.SELECT_MAPPING_FOR_BUNDLE_ID)
    List<AssetMapping> get(@NonNull String str);

    @Query(LocalDBQuery.SELECT_ALL_ASSET_MAPPINGS_QUERY)
    List<AssetMapping> getAll();

    @Query(LocalDBQuery.SELECT_ALL_BUNDLE_IDS_QUERY)
    List<String> getAllBundleIds();

    @Insert(onConflict = 1)
    void insert(@NonNull AssetMapping assetMapping);
}
