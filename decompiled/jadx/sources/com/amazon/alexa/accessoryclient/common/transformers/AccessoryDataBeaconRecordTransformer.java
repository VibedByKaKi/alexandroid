package com.amazon.alexa.accessoryclient.common.transformers;

import android.os.Bundle;
import com.amazon.alexa.accessory.AccessoryDataBeaconRecord;
import com.amazon.alexa.accessory.internal.bluetooth.DefaultAccessoryDataBeaconRecord;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/transformers/AccessoryDataBeaconRecordTransformer;", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "Lcom/amazon/alexa/accessory/AccessoryDataBeaconRecord;", "()V", "APPLICATION_ID_KEY", "", "APPLICATION_SPECIFIC_DATA_KEY", "VENDOR_ID_KEY", "fromBundle", "bundle", "Landroid/os/Bundle;", "toBundle", "accessoryDataBeaconRecord", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AccessoryDataBeaconRecordTransformer implements BundleTransformer<AccessoryDataBeaconRecord> {

    @NotNull
    private static final String APPLICATION_ID_KEY = "applicationId";

    @NotNull
    private static final String APPLICATION_SPECIFIC_DATA_KEY = "applicationSpecificData";

    @NotNull
    public static final AccessoryDataBeaconRecordTransformer INSTANCE = new AccessoryDataBeaconRecordTransformer();

    @NotNull
    private static final String VENDOR_ID_KEY = "vendorId";

    private AccessoryDataBeaconRecordTransformer() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    /* renamed from: fromBundle */
    public AccessoryDataBeaconRecord fromBundle2(@NotNull Bundle bundle) {
        bundle.getClass();
        return new DefaultAccessoryDataBeaconRecord(bundle.getByteArray(APPLICATION_SPECIFIC_DATA_KEY), bundle.getShort(VENDOR_ID_KEY), bundle.getShort(APPLICATION_ID_KEY));
    }

    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    public Bundle toBundle(@NotNull AccessoryDataBeaconRecord accessoryDataBeaconRecord) {
        accessoryDataBeaconRecord.getClass();
        Bundle bundle = new Bundle();
        bundle.putByteArray(APPLICATION_SPECIFIC_DATA_KEY, accessoryDataBeaconRecord.getApplicationSpecificData());
        bundle.putShort(VENDOR_ID_KEY, accessoryDataBeaconRecord.getVendorId());
        bundle.putShort(APPLICATION_ID_KEY, accessoryDataBeaconRecord.getApplicationId());
        return bundle;
    }
}
