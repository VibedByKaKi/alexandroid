package com.amazon.alexa.accessoryclient.common.transformers;

import android.os.Bundle;
import com.amazon.alexa.accessory.AccessorySessionOptions;
import com.amazon.alexa.accessory.capabilities.Capability;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/transformers/AccessorySessionOptionsTransformer;", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "Lcom/amazon/alexa/accessory/AccessorySessionOptions;", "()V", "DEVICE_KNOWN_KEY", "", "SHOULD_FORCE_CONNECTION_KEY", "SHOULD_USE_UNESECURE_LE_CONNECTION_KEY", "SUPPORTED_CAPABILITIES_KEY", "fromBundle", "bundle", "Landroid/os/Bundle;", "toBundle", "t", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAccessorySessionOptionsTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccessorySessionOptionsTransformer.kt\ncom/amazon/alexa/accessoryclient/common/transformers/AccessorySessionOptionsTransformer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,45:1\n1549#2:46\n1620#2,3:47\n1549#2:50\n1620#2,3:51\n*S KotlinDebug\n*F\n+ 1 AccessorySessionOptionsTransformer.kt\ncom/amazon/alexa/accessoryclient/common/transformers/AccessorySessionOptionsTransformer\n*L\n25#1:46\n25#1:47,3\n38#1:50\n38#1:51,3\n*E\n"})
/* loaded from: classes16.dex */
public final class AccessorySessionOptionsTransformer implements BundleTransformer<AccessorySessionOptions> {

    @NotNull
    private static final String DEVICE_KNOWN_KEY = "isDeviceKnown";

    @NotNull
    public static final AccessorySessionOptionsTransformer INSTANCE = new AccessorySessionOptionsTransformer();

    @NotNull
    private static final String SHOULD_FORCE_CONNECTION_KEY = "shouldForceConnection";

    @NotNull
    private static final String SHOULD_USE_UNESECURE_LE_CONNECTION_KEY = "shouldUseUnsecureLeConnection";

    @NotNull
    private static final String SUPPORTED_CAPABILITIES_KEY = "supportedCapabilities";

    private AccessorySessionOptionsTransformer() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    /* renamed from: fromBundle */
    public AccessorySessionOptions fromBundle2(@NotNull Bundle bundle) {
        bundle.getClass();
        AccessorySessionOptions accessorySessionOptions = new AccessorySessionOptions();
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(SUPPORTED_CAPABILITIES_KEY);
        if (integerArrayList != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(integerArrayList, 10));
            for (Integer num : integerArrayList) {
                Capability[] values = Capability.values();
                num.getClass();
                arrayList.add(values[num.intValue()]);
            }
            accessorySessionOptions.setSupportedCapabilities(arrayList);
        }
        accessorySessionOptions.useUnsecureLowEnergyConnection(bundle.getBoolean(SHOULD_USE_UNESECURE_LE_CONNECTION_KEY));
        accessorySessionOptions.setDeviceKnown(bundle.getBoolean(DEVICE_KNOWN_KEY));
        accessorySessionOptions.setForceConnection(bundle.getBoolean(SHOULD_FORCE_CONNECTION_KEY));
        return accessorySessionOptions;
    }

    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    public Bundle toBundle(@NotNull AccessorySessionOptions t) {
        t.getClass();
        Bundle bundle = new Bundle();
        List<Capability> supportedCapabilities = t.getSupportedCapabilities();
        if (supportedCapabilities != null) {
            List<Capability> list = supportedCapabilities;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(((Capability) it2.next()).ordinal()));
            }
            bundle.putIntegerArrayList(SUPPORTED_CAPABILITIES_KEY, new ArrayList<>(arrayList));
        }
        bundle.putBoolean(SHOULD_USE_UNESECURE_LE_CONNECTION_KEY, t.shouldUseUnsecureLowEnergyConnection());
        bundle.putBoolean(DEVICE_KNOWN_KEY, t.isDeviceKnown());
        bundle.putBoolean(SHOULD_FORCE_CONNECTION_KEY, t.shouldForceConnection());
        return bundle;
    }
}
