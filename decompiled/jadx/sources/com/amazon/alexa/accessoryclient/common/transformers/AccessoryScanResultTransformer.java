package com.amazon.alexa.accessoryclient.common.transformers;

import android.os.Bundle;
import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.AccessoryScanRecord;
import com.amazon.alexa.accessoryclient.common.api.AccessoryScanResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/transformers/AccessoryScanResultTransformer;", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "Lcom/amazon/alexa/accessoryclient/common/api/AccessoryScanResult;", "()V", "ACCESSORY_KEY", "", "ACCESSORY_SCAN_RECORD_KEY", "RSSI_KEY", "fromBundle", "bundle", "Landroid/os/Bundle;", "toBundle", "accessoryScanResult", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AccessoryScanResultTransformer implements BundleTransformer<AccessoryScanResult> {

    @NotNull
    private static final String ACCESSORY_KEY = "accessory";

    @NotNull
    private static final String ACCESSORY_SCAN_RECORD_KEY = "accessoryScanRecord";

    @NotNull
    public static final AccessoryScanResultTransformer INSTANCE = new AccessoryScanResultTransformer();

    @NotNull
    private static final String RSSI_KEY = "rssi";

    private AccessoryScanResultTransformer() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    /* renamed from: fromBundle */
    public AccessoryScanResult fromBundle2(@NotNull Bundle bundle) {
        bundle.getClass();
        AccessoryTransformer accessoryTransformer = AccessoryTransformer.INSTANCE;
        Bundle bundle2 = bundle.getBundle("accessory");
        bundle2.getClass();
        Accessory fromBundle2 = accessoryTransformer.fromBundle2(bundle2);
        Bundle bundle3 = bundle.getBundle("accessoryScanRecord");
        return new AccessoryScanResult(fromBundle2, bundle3 != null ? AccessoryScanRecordTransformer.INSTANCE.fromBundle2(bundle3) : null, bundle.getInt(RSSI_KEY));
    }

    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    public Bundle toBundle(@NotNull AccessoryScanResult accessoryScanResult) {
        accessoryScanResult.getClass();
        Bundle bundle = new Bundle();
        bundle.putBundle("accessory", AccessoryTransformer.INSTANCE.toBundle(accessoryScanResult.getAccessory()));
        AccessoryScanRecord accessoryScanRecord = accessoryScanResult.getAccessoryScanRecord();
        bundle.putBundle("accessoryScanRecord", accessoryScanRecord != null ? AccessoryScanRecordTransformer.INSTANCE.toBundle(accessoryScanRecord) : null);
        bundle.putInt(RSSI_KEY, accessoryScanResult.getRssi());
        return bundle;
    }
}
