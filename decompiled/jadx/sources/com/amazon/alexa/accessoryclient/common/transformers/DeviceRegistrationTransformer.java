package com.amazon.alexa.accessoryclient.common.transformers;

import android.os.Bundle;
import com.amazon.alexa.accessory.registration.DeviceRegistration;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/transformers/DeviceRegistrationTransformer;", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "Lcom/amazon/alexa/accessory/registration/DeviceRegistration;", "()V", "DEVICE_REGISTRATION_JSON_KEY", "", "ListTransformer", "", "getListTransformer", "()Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "fromBundle", "bundle", "Landroid/os/Bundle;", "toBundle", "deviceRegistration", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class DeviceRegistrationTransformer implements BundleTransformer<DeviceRegistration> {

    @NotNull
    private static final String DEVICE_REGISTRATION_JSON_KEY = "deviceRegistrationJson";

    @NotNull
    public static final DeviceRegistrationTransformer INSTANCE;

    @NotNull
    private static final BundleTransformer<List<DeviceRegistration>> ListTransformer;

    static {
        DeviceRegistrationTransformer deviceRegistrationTransformer = new DeviceRegistrationTransformer();
        INSTANCE = deviceRegistrationTransformer;
        ListTransformer = new ListTransformer(deviceRegistrationTransformer);
    }

    private DeviceRegistrationTransformer() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    /* renamed from: fromBundle */
    public DeviceRegistration fromBundle2(@NotNull Bundle bundle) {
        bundle.getClass();
        DeviceRegistration create = DeviceRegistration.FACTORY.create(new JSONObject(bundle.getString(DEVICE_REGISTRATION_JSON_KEY)));
        create.getClass();
        return create;
    }

    @NotNull
    public final BundleTransformer<List<DeviceRegistration>> getListTransformer() {
        return ListTransformer;
    }

    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    public Bundle toBundle(@NotNull DeviceRegistration deviceRegistration) {
        deviceRegistration.getClass();
        Bundle bundle = new Bundle();
        bundle.putString(DEVICE_REGISTRATION_JSON_KEY, deviceRegistration.toJsonObject().toString());
        return bundle;
    }
}
