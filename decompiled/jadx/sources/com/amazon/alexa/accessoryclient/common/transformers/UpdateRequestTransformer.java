package com.amazon.alexa.accessoryclient.common.transformers;

import android.os.Bundle;
import com.amazon.alexa.accessory.kota.UpdateRequest;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/transformers/UpdateRequestTransformer;", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "Lcom/amazon/alexa/accessory/kota/UpdateRequest;", "()V", "BUILD_DIMENSION_KEY", "", "COMPONENT_ID_KEY", "COMPONENT_VERSION_KEY", "DEVICE_SERIAL_NUMBER_KEY", "DEVICE_TYPE_KEY", "URL_KEY", "fromBundle", "bundle", "Landroid/os/Bundle;", "toBundle", "t", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class UpdateRequestTransformer implements BundleTransformer<UpdateRequest> {

    @NotNull
    private static final String BUILD_DIMENSION_KEY = "buildDimension";

    @NotNull
    private static final String COMPONENT_ID_KEY = "componentId";

    @NotNull
    private static final String COMPONENT_VERSION_KEY = "componentVersion";

    @NotNull
    private static final String DEVICE_SERIAL_NUMBER_KEY = "deviceSerialNumber";

    @NotNull
    private static final String DEVICE_TYPE_KEY = "deviceType";

    @NotNull
    public static final UpdateRequestTransformer INSTANCE = new UpdateRequestTransformer();

    @NotNull
    private static final String URL_KEY = "url";

    private UpdateRequestTransformer() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    public UpdateRequest fromBundle(@NotNull Bundle bundle) {
        bundle.getClass();
        UpdateRequest build = new UpdateRequest.Builder().buildDimension(bundle.getString(BUILD_DIMENSION_KEY)).componentId(bundle.getString(COMPONENT_ID_KEY)).componentVersion(bundle.getInt(COMPONENT_VERSION_KEY)).deviceSerialNumber(bundle.getString("deviceSerialNumber")).deviceType(bundle.getString("deviceType")).url(bundle.getString("url")).build();
        build.getClass();
        return build;
    }

    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    public Bundle toBundle(@NotNull UpdateRequest t) {
        t.getClass();
        Bundle bundle = new Bundle();
        bundle.putString(BUILD_DIMENSION_KEY, t.getBuildDimension());
        bundle.putString(COMPONENT_ID_KEY, t.getComponentId());
        bundle.putInt(COMPONENT_VERSION_KEY, t.getComponentVersion());
        bundle.putString("deviceSerialNumber", t.getDeviceSerialNumber());
        bundle.putString("deviceType", t.getDeviceType());
        bundle.putString("url", t.getUrl());
        return bundle;
    }
}
