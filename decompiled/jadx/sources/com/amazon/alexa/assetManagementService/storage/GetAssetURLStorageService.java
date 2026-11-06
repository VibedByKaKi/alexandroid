package com.amazon.alexa.assetManagementService.storage;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.accessory.frames.TopContactProvider$$ExternalSyntheticLambda0;
import com.amazon.alexa.assetManagementService.dao.AssetMappingDao;
import com.amazon.alexa.assetManagementService.entity.AssetMapping;
import com.amazon.alexa.assetManagementService.util.AssetMappingDatabase;
import com.amazon.alexa.benefits.helpers.NetworkHelper$$ExternalSyntheticLambda0;
import com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class GetAssetURLStorageService {
    private final AssetMappingDao assetMappingDao;

    @VisibleForTesting
    final ExecutorService executorService;

    public GetAssetURLStorageService(Context context, ExecutorService executorService) {
        this.assetMappingDao = AssetMappingDatabase.getInstance(context).assetMappingDao();
        this.executorService = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearAll$1() {
        this.assetMappingDao.deleteAll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$getAllBundleIds$4() throws Exception {
        return this.assetMappingDao.getAllBundleIds();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$getAssetMapping$3(String str) throws Exception {
        return this.assetMappingDao.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$loadAll$2() throws Exception {
        return this.assetMappingDao.getAll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$save$0(List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            this.assetMappingDao.insert((AssetMapping) it2.next());
        }
    }

    public Future clearAll() {
        return this.executorService.submit(new TopContactProvider$$ExternalSyntheticLambda0(this, 19));
    }

    public Future<List<String>> getAllBundleIds() {
        return this.executorService.submit(new GetAssetURLStorageService$$ExternalSyntheticLambda0(this, 0));
    }

    public Future<List<AssetMapping>> getAssetMapping(@NonNull String str) {
        return this.executorService.submit(new ReactHostImpl$$ExternalSyntheticLambda0(this, str, 8));
    }

    public Future<List<AssetMapping>> loadAll() {
        return this.executorService.submit(new GetAssetURLStorageService$$ExternalSyntheticLambda0(this, 1));
    }

    public Future save(@NonNull List<AssetMapping> list) {
        return this.executorService.submit(new NetworkHelper$$ExternalSyntheticLambda0(this, list, 28));
    }
}
