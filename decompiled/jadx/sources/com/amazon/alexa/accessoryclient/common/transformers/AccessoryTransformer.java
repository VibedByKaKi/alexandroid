package com.amazon.alexa.accessoryclient.common.transformers;

import android.os.Bundle;
import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.AccessoryTransport;
import com.amazon.alexa.accessorykit.ModelTransformer;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/transformers/AccessoryTransformer;", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "Lcom/amazon/alexa/accessory/Accessory;", "()V", "ADDRESS_KEY", "", "ListTransformer", "", "getListTransformer", "()Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "NAME_KEY", "TRANSPORT_TYPE_KEY", "fromBundle", "bundle", "Landroid/os/Bundle;", "toBundle", ModelTransformer.KEY_ACCESSORY, "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AccessoryTransformer implements BundleTransformer<Accessory> {

    @NotNull
    private static final String ADDRESS_KEY = "address";

    @NotNull
    public static final AccessoryTransformer INSTANCE;

    @NotNull
    private static final BundleTransformer<List<Accessory>> ListTransformer;

    @NotNull
    private static final String NAME_KEY = "name";

    @NotNull
    private static final String TRANSPORT_TYPE_KEY = "transportType";

    static {
        AccessoryTransformer accessoryTransformer = new AccessoryTransformer();
        INSTANCE = accessoryTransformer;
        ListTransformer = new ListTransformer(accessoryTransformer);
    }

    private AccessoryTransformer() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    /* renamed from: fromBundle */
    public Accessory fromBundle2(@NotNull Bundle bundle) {
        bundle.getClass();
        String string = bundle.getString("address");
        AccessoryTransportTypeTransformer accessoryTransportTypeTransformer = AccessoryTransportTypeTransformer.INSTANCE;
        Bundle bundle2 = bundle.getBundle("transportType");
        bundle2.getClass();
        return new Accessory(string, accessoryTransportTypeTransformer.fromBundle2(bundle2), bundle.getString("name"));
    }

    @NotNull
    public final BundleTransformer<List<Accessory>> getListTransformer() {
        return ListTransformer;
    }

    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    public Bundle toBundle(@NotNull Accessory accessory) {
        accessory.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("address", accessory.getAddress());
        AccessoryTransportTypeTransformer accessoryTransportTypeTransformer = AccessoryTransportTypeTransformer.INSTANCE;
        AccessoryTransport.Type transport = accessory.getTransport();
        transport.getClass();
        bundle.putBundle("transportType", accessoryTransportTypeTransformer.toBundle(transport));
        bundle.putString("name", accessory.getName());
        return bundle;
    }
}
