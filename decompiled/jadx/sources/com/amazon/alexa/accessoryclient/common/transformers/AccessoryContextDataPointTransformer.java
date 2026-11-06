package com.amazon.alexa.accessoryclient.common.transformers;

import android.os.Bundle;
import com.amazon.alexa.accessory.protocol.Moments;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/transformers/AccessoryContextDataPointTransformer;", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "Lcom/amazon/alexa/accessory/protocol/Moments$AccessoryContextDataPoint;", "()V", "PROTO_BYTES_KEY", "", "listTransformer", "", "getListTransformer", "()Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "fromBundle", "bundle", "Landroid/os/Bundle;", "toBundle", "accessoryContextDataPoint", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AccessoryContextDataPointTransformer implements BundleTransformer<Moments.AccessoryContextDataPoint> {

    @NotNull
    public static final AccessoryContextDataPointTransformer INSTANCE;

    @NotNull
    private static final String PROTO_BYTES_KEY = "proto";

    @NotNull
    private static final BundleTransformer<List<Moments.AccessoryContextDataPoint>> listTransformer;

    static {
        AccessoryContextDataPointTransformer accessoryContextDataPointTransformer = new AccessoryContextDataPointTransformer();
        INSTANCE = accessoryContextDataPointTransformer;
        listTransformer = new ListTransformer(accessoryContextDataPointTransformer);
    }

    private AccessoryContextDataPointTransformer() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    /* renamed from: fromBundle */
    public Moments.AccessoryContextDataPoint fromBundle2(@NotNull Bundle bundle) {
        bundle.getClass();
        Moments.AccessoryContextDataPoint parseFrom = Moments.AccessoryContextDataPoint.parseFrom(bundle.getByteArray(PROTO_BYTES_KEY));
        parseFrom.getClass();
        return parseFrom;
    }

    @NotNull
    public final BundleTransformer<List<Moments.AccessoryContextDataPoint>> getListTransformer() {
        return listTransformer;
    }

    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    public Bundle toBundle(@NotNull Moments.AccessoryContextDataPoint accessoryContextDataPoint) {
        accessoryContextDataPoint.getClass();
        Bundle bundle = new Bundle();
        bundle.putByteArray(PROTO_BYTES_KEY, accessoryContextDataPoint.toByteArray());
        return bundle;
    }
}
