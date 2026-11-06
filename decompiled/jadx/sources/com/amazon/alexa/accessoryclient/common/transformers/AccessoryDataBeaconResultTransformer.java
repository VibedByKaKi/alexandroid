package com.amazon.alexa.accessoryclient.common.transformers;

import android.os.Bundle;
import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessoryclient.common.api.AccessoryDataBeaconResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/transformers/AccessoryDataBeaconResultTransformer;", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "Lcom/amazon/alexa/accessoryclient/common/api/AccessoryDataBeaconResult;", "()V", "ACCESSORY_DATA_BEACON_RECORD_KEY", "", "ACCESSORY_KEY", "RSSI_KEY", "fromBundle", "bundle", "Landroid/os/Bundle;", "toBundle", "accessoryDataBeaconResult", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AccessoryDataBeaconResultTransformer implements BundleTransformer<AccessoryDataBeaconResult> {

    @NotNull
    private static final String ACCESSORY_DATA_BEACON_RECORD_KEY = "beaconRecord";

    @NotNull
    private static final String ACCESSORY_KEY = "accessory";

    @NotNull
    public static final AccessoryDataBeaconResultTransformer INSTANCE = new AccessoryDataBeaconResultTransformer();

    @NotNull
    private static final String RSSI_KEY = "rssi";

    private AccessoryDataBeaconResultTransformer() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    /* renamed from: fromBundle */
    public AccessoryDataBeaconResult fromBundle2(@NotNull Bundle bundle) {
        bundle.getClass();
        AccessoryTransformer accessoryTransformer = AccessoryTransformer.INSTANCE;
        Bundle bundle2 = bundle.getBundle("accessory");
        bundle2.getClass();
        Accessory fromBundle2 = accessoryTransformer.fromBundle2(bundle2);
        AccessoryDataBeaconRecordTransformer accessoryDataBeaconRecordTransformer = AccessoryDataBeaconRecordTransformer.INSTANCE;
        Bundle bundle3 = bundle.getBundle(ACCESSORY_DATA_BEACON_RECORD_KEY);
        bundle3.getClass();
        return new AccessoryDataBeaconResult(fromBundle2, accessoryDataBeaconRecordTransformer.fromBundle2(bundle3), bundle.getInt(RSSI_KEY));
    }

    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    public Bundle toBundle(@NotNull AccessoryDataBeaconResult accessoryDataBeaconResult) {
        accessoryDataBeaconResult.getClass();
        Bundle bundle = new Bundle();
        bundle.putBundle("accessory", AccessoryTransformer.INSTANCE.toBundle(accessoryDataBeaconResult.getAccessory()));
        bundle.putBundle(ACCESSORY_DATA_BEACON_RECORD_KEY, AccessoryDataBeaconRecordTransformer.INSTANCE.toBundle(accessoryDataBeaconResult.getAccessoryDataBeaconRecord()));
        bundle.putInt(RSSI_KEY, accessoryDataBeaconResult.getRssi());
        return bundle;
    }
}
