package com.amazon.alexa.accessoryclient.common.transformers;

import android.os.Bundle;
import com.amazon.alexa.accessory.repositories.device.v2.DeviceGroup;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/transformers/DeviceGroupTransformer;", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "Lcom/amazon/alexa/accessory/repositories/device/v2/DeviceGroup;", "()V", "ListTransformer", "", "getListTransformer", "()Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "fromBundle", "bundle", "Landroid/os/Bundle;", "toBundle", "deviceGroup", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class DeviceGroupTransformer implements BundleTransformer<DeviceGroup> {

    @NotNull
    public static final DeviceGroupTransformer INSTANCE;

    @NotNull
    private static final BundleTransformer<List<DeviceGroup>> ListTransformer;

    static {
        DeviceGroupTransformer deviceGroupTransformer = new DeviceGroupTransformer();
        INSTANCE = deviceGroupTransformer;
        ListTransformer = new ListTransformer(deviceGroupTransformer);
    }

    private DeviceGroupTransformer() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    /* renamed from: fromBundle */
    public DeviceGroup fromBundle2(@NotNull Bundle bundle) {
        bundle.getClass();
        DeviceGroup fromBundle = DeviceGroup.fromBundle(bundle);
        fromBundle.getClass();
        return fromBundle;
    }

    @NotNull
    public final BundleTransformer<List<DeviceGroup>> getListTransformer() {
        return ListTransformer;
    }

    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    public Bundle toBundle(@NotNull DeviceGroup deviceGroup) {
        deviceGroup.getClass();
        Bundle bundle = DeviceGroup.toBundle(deviceGroup);
        bundle.getClass();
        return bundle;
    }
}
