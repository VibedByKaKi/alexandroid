package com.amazon.alexa.accessoryclient.common.transformers;

import android.os.Bundle;
import com.amazon.alexa.accessory.repositories.device.DeviceFeature;
import com.amazon.alexa.accessory.repositories.device.SubFeature;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/transformers/DeviceFeatureTransformer;", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "Lcom/amazon/alexa/accessory/repositories/device/DeviceFeature;", "()V", "ID_KEY", "", "ListTransformer", "", "getListTransformer", "()Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "SUB_FEATURES_KEY", "VERSION_KEY", "fromBundle", "bundle", "Landroid/os/Bundle;", "toBundle", "t", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceFeatureTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceFeatureTransformer.kt\ncom/amazon/alexa/accessoryclient/common/transformers/DeviceFeatureTransformer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
/* loaded from: classes16.dex */
public final class DeviceFeatureTransformer implements BundleTransformer<DeviceFeature> {

    @NotNull
    private static final String ID_KEY = "id";

    @NotNull
    public static final DeviceFeatureTransformer INSTANCE;

    @NotNull
    private static final BundleTransformer<List<DeviceFeature>> ListTransformer;

    @NotNull
    private static final String SUB_FEATURES_KEY = "sub_features";

    @NotNull
    private static final String VERSION_KEY = "version";

    static {
        DeviceFeatureTransformer deviceFeatureTransformer = new DeviceFeatureTransformer();
        INSTANCE = deviceFeatureTransformer;
        ListTransformer = new ListTransformer(deviceFeatureTransformer);
    }

    private DeviceFeatureTransformer() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    /* renamed from: fromBundle */
    public DeviceFeature fromBundle2(@NotNull Bundle bundle) {
        Bundle bundle2;
        bundle.getClass();
        List<SubFeature> list = null;
        Integer valueOf = bundle.containsKey("version") ? Integer.valueOf(bundle.getInt("version")) : null;
        if (bundle.containsKey(SUB_FEATURES_KEY) && (bundle2 = bundle.getBundle(SUB_FEATURES_KEY)) != null) {
            list = SubFeatureTransformer.INSTANCE.getListTransformer().fromBundle2(bundle2);
        }
        return new DeviceFeature(bundle.getInt("id"), valueOf, list);
    }

    @NotNull
    public final BundleTransformer<List<DeviceFeature>> getListTransformer() {
        return ListTransformer;
    }

    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    public Bundle toBundle(@NotNull DeviceFeature t) {
        t.getClass();
        Bundle bundle = new Bundle();
        bundle.putInt("id", t.getId());
        Integer version = t.getVersion();
        if (version != null) {
            bundle.putInt("version", version.intValue());
        }
        List<SubFeature> subFeatures = t.getSubFeatures();
        if (subFeatures != null) {
            bundle.putBundle(SUB_FEATURES_KEY, SubFeatureTransformer.INSTANCE.getListTransformer().toBundle(subFeatures));
        }
        return bundle;
    }
}
