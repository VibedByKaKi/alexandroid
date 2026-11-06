package com.amazon.alexa.accessoryclient.common.transformers;

import android.os.Bundle;
import com.amazon.alexa.accessory.AccessoryScanRecord;
import com.amazon.alexa.accessory.internal.bluetooth.DefaultAccessoryScanRecord;
import com.amazon.alexa.accessorykit.ModelTransformer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/transformers/AccessoryScanRecordTransformer;", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "Lcom/amazon/alexa/accessory/AccessoryScanRecord;", "()V", "COLOR_KEY", "", "HAS_UPDATE_AVAILABLE_KEY", "IS_DISCOVERABLE_OVER_BT_CLASSIC_KEY", "IS_IN_OOBE_MODE_KEY", "PREFERS_RFCOMM_KEY", "PRODUCT_ID_KEY", "PRODUCT_SPECIFIC_DATA_KEY", "VENDOR_ID_KEY", "fromBundle", "bundle", "Landroid/os/Bundle;", "toBundle", ModelTransformer.KEY_ACCESSORY_SCAN_RECORD, "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AccessoryScanRecordTransformer implements BundleTransformer<AccessoryScanRecord> {

    @NotNull
    private static final String COLOR_KEY = "color";

    @NotNull
    private static final String HAS_UPDATE_AVAILABLE_KEY = "hasUpdateAvailable";

    @NotNull
    public static final AccessoryScanRecordTransformer INSTANCE = new AccessoryScanRecordTransformer();

    @NotNull
    private static final String IS_DISCOVERABLE_OVER_BT_CLASSIC_KEY = "btClassicDiscoverable";

    @NotNull
    private static final String IS_IN_OOBE_MODE_KEY = "isInOobeMode";

    @NotNull
    private static final String PREFERS_RFCOMM_KEY = "prefersRfcomm";

    @NotNull
    private static final String PRODUCT_ID_KEY = "productId";

    @NotNull
    private static final String PRODUCT_SPECIFIC_DATA_KEY = "productSpecificData";

    @NotNull
    private static final String VENDOR_ID_KEY = "vendorId";

    private AccessoryScanRecordTransformer() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    /* renamed from: fromBundle */
    public AccessoryScanRecord fromBundle2(@NotNull Bundle bundle) {
        bundle.getClass();
        return new DefaultAccessoryScanRecord(bundle.getByteArray(PRODUCT_SPECIFIC_DATA_KEY), bundle.getShort(VENDOR_ID_KEY), bundle.getShort(PRODUCT_ID_KEY), bundle.getByte("color"), bundle.getBoolean(IS_IN_OOBE_MODE_KEY), bundle.getBoolean(IS_DISCOVERABLE_OVER_BT_CLASSIC_KEY), bundle.getBoolean(PREFERS_RFCOMM_KEY), bundle.getBoolean(HAS_UPDATE_AVAILABLE_KEY));
    }

    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    public Bundle toBundle(@NotNull AccessoryScanRecord accessoryScanRecord) {
        accessoryScanRecord.getClass();
        Bundle bundle = new Bundle();
        bundle.putByteArray(PRODUCT_SPECIFIC_DATA_KEY, accessoryScanRecord.getProductSpecificData());
        bundle.putShort(VENDOR_ID_KEY, accessoryScanRecord.getVendorId());
        bundle.putShort(PRODUCT_ID_KEY, accessoryScanRecord.getProductId());
        bundle.putByte("color", accessoryScanRecord.getColor());
        bundle.putBoolean(IS_IN_OOBE_MODE_KEY, accessoryScanRecord.isInOOBEMode());
        bundle.putBoolean(IS_DISCOVERABLE_OVER_BT_CLASSIC_KEY, accessoryScanRecord.isDiscoverableOverBTClassic());
        bundle.putBoolean(PREFERS_RFCOMM_KEY, accessoryScanRecord.prefersRFCOMMConnection());
        bundle.putBoolean(HAS_UPDATE_AVAILABLE_KEY, accessoryScanRecord.hasAnUpdateAvailable());
        return bundle;
    }
}
