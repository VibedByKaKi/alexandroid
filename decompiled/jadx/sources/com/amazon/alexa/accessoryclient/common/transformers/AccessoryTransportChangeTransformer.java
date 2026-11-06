package com.amazon.alexa.accessoryclient.common.transformers;

import android.os.Bundle;
import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.AccessoryTransport;
import com.amazon.alexa.accessoryclient.common.api.AccessoryTransportChange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/transformers/AccessoryTransportChangeTransformer;", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "Lcom/amazon/alexa/accessoryclient/common/api/AccessoryTransportChange;", "()V", "NEW_ACCESSORY_KEY", "", "NEW_TRANSPORT_KEY", "OLD_ACCESSORY_KEY", "OLD_TRANSPORT_KEY", "fromBundle", "bundle", "Landroid/os/Bundle;", "toBundle", "t", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AccessoryTransportChangeTransformer implements BundleTransformer<AccessoryTransportChange> {

    @NotNull
    public static final AccessoryTransportChangeTransformer INSTANCE = new AccessoryTransportChangeTransformer();

    @NotNull
    private static final String NEW_ACCESSORY_KEY = "accessoryNew";

    @NotNull
    private static final String NEW_TRANSPORT_KEY = "transportNew";

    @NotNull
    private static final String OLD_ACCESSORY_KEY = "accessoryOld";

    @NotNull
    private static final String OLD_TRANSPORT_KEY = "transportOld";

    private AccessoryTransportChangeTransformer() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    /* renamed from: fromBundle */
    public AccessoryTransportChange fromBundle2(@NotNull Bundle bundle) {
        bundle.getClass();
        AccessoryTransformer accessoryTransformer = AccessoryTransformer.INSTANCE;
        Bundle bundle2 = bundle.getBundle(OLD_ACCESSORY_KEY);
        bundle2.getClass();
        Accessory fromBundle2 = accessoryTransformer.fromBundle2(bundle2);
        AccessoryTransportTypeTransformer accessoryTransportTypeTransformer = AccessoryTransportTypeTransformer.INSTANCE;
        Bundle bundle3 = bundle.getBundle(OLD_TRANSPORT_KEY);
        bundle3.getClass();
        AccessoryTransport.Type fromBundle22 = accessoryTransportTypeTransformer.fromBundle2(bundle3);
        Bundle bundle4 = bundle.getBundle(NEW_ACCESSORY_KEY);
        bundle4.getClass();
        Accessory fromBundle23 = accessoryTransformer.fromBundle2(bundle4);
        Bundle bundle5 = bundle.getBundle(NEW_TRANSPORT_KEY);
        bundle5.getClass();
        return new AccessoryTransportChange(fromBundle2, fromBundle22, fromBundle23, accessoryTransportTypeTransformer.fromBundle2(bundle5));
    }

    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    public Bundle toBundle(@NotNull AccessoryTransportChange t) {
        t.getClass();
        Bundle bundle = new Bundle();
        AccessoryTransformer accessoryTransformer = AccessoryTransformer.INSTANCE;
        bundle.putBundle(OLD_ACCESSORY_KEY, accessoryTransformer.toBundle(t.getOldAccessory()));
        AccessoryTransportTypeTransformer accessoryTransportTypeTransformer = AccessoryTransportTypeTransformer.INSTANCE;
        bundle.putBundle(OLD_TRANSPORT_KEY, accessoryTransportTypeTransformer.toBundle(t.getOldTransport()));
        bundle.putBundle(NEW_ACCESSORY_KEY, accessoryTransformer.toBundle(t.getNewAccessory()));
        bundle.putBundle(NEW_TRANSPORT_KEY, accessoryTransportTypeTransformer.toBundle(t.getNewTransport()));
        return bundle;
    }
}
