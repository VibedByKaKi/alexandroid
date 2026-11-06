package com.amazon.alexa.accessoryclient.common.transformers;

import android.os.Bundle;
import com.amazon.alexa.accessory.kota.InventoryUpdate;
import com.amazon.alexa.accessory.kota.InventoryUpdateBundle;
import com.amazon.alexa.accessory.kota.UpdateRequest;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/transformers/InventoryUpdateBundleTransformer;", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "Lcom/amazon/alexa/accessory/kota/InventoryUpdateBundle;", "()V", "INVENTORY_UPDATE_KEY", "", "ListTransformer", "", "getListTransformer", "()Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "UPDATE_REQUEST_KEY", "fromBundle", "bundle", "Landroid/os/Bundle;", "toBundle", "t", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class InventoryUpdateBundleTransformer implements BundleTransformer<InventoryUpdateBundle> {

    @NotNull
    public static final InventoryUpdateBundleTransformer INSTANCE;

    @NotNull
    private static final String INVENTORY_UPDATE_KEY = "inventoryUpdate";

    @NotNull
    private static final BundleTransformer<List<InventoryUpdateBundle>> ListTransformer;

    @NotNull
    private static final String UPDATE_REQUEST_KEY = "updateRequest";

    static {
        InventoryUpdateBundleTransformer inventoryUpdateBundleTransformer = new InventoryUpdateBundleTransformer();
        INSTANCE = inventoryUpdateBundleTransformer;
        ListTransformer = new ListTransformer(inventoryUpdateBundleTransformer);
    }

    private InventoryUpdateBundleTransformer() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    /* renamed from: fromBundle */
    public InventoryUpdateBundle fromBundle2(@NotNull Bundle bundle) {
        bundle.getClass();
        InventoryUpdateBundle.Builder builder = new InventoryUpdateBundle.Builder();
        InventoryUpdateTransformer inventoryUpdateTransformer = InventoryUpdateTransformer.INSTANCE;
        Bundle bundle2 = bundle.getBundle("inventoryUpdate");
        bundle2.getClass();
        InventoryUpdateBundle.Builder inventoryUpdate = builder.inventoryUpdate(inventoryUpdateTransformer.fromBundle2(bundle2));
        UpdateRequestTransformer updateRequestTransformer = UpdateRequestTransformer.INSTANCE;
        Bundle bundle3 = bundle.getBundle("updateRequest");
        bundle3.getClass();
        InventoryUpdateBundle build = inventoryUpdate.updateRequest(updateRequestTransformer.fromBundle2(bundle3)).build();
        build.getClass();
        return build;
    }

    @NotNull
    public final BundleTransformer<List<InventoryUpdateBundle>> getListTransformer() {
        return ListTransformer;
    }

    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    public Bundle toBundle(@NotNull InventoryUpdateBundle t) {
        t.getClass();
        Bundle bundle = new Bundle();
        InventoryUpdateTransformer inventoryUpdateTransformer = InventoryUpdateTransformer.INSTANCE;
        InventoryUpdate inventoryUpdate = t.getInventoryUpdate();
        inventoryUpdate.getClass();
        bundle.putBundle("inventoryUpdate", inventoryUpdateTransformer.toBundle(inventoryUpdate));
        UpdateRequestTransformer updateRequestTransformer = UpdateRequestTransformer.INSTANCE;
        UpdateRequest updateRequest = t.getUpdateRequest();
        updateRequest.getClass();
        bundle.putBundle("updateRequest", updateRequestTransformer.toBundle(updateRequest));
        return bundle;
    }
}
