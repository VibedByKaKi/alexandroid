package com.amazon.alexa.accessoryclient.common.query.response;

import android.os.Bundle;
import com.amazon.alexa.accessory.protocol.Moments;
import com.amazon.alexa.accessoryclient.common.query.Query;
import com.amazon.alexa.accessoryclient.common.transformers.AccessoryContextDataPointTransformer;
import com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/query/response/AccessoryContextDataPointResponse;", "Lcom/amazon/alexa/accessoryclient/common/query/Query$Response;", "contextData", "", "Lcom/amazon/alexa/accessory/protocol/Moments$AccessoryContextDataPoint;", "(Ljava/util/List;)V", "bundleTransformer", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "getBundleTransformer", "()Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "getContextData", "()Ljava/util/List;", "Transformer", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AccessoryContextDataPointResponse implements Query.Response<AccessoryContextDataPointResponse> {

    @NotNull
    private final BundleTransformer<AccessoryContextDataPointResponse> bundleTransformer;

    @NotNull
    private final List<Moments.AccessoryContextDataPoint> contextData;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/query/response/AccessoryContextDataPointResponse$Transformer;", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "Lcom/amazon/alexa/accessoryclient/common/query/response/AccessoryContextDataPointResponse;", "()V", "fromBundle", "bundle", "Landroid/os/Bundle;", "toBundle", "t", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Transformer implements BundleTransformer<AccessoryContextDataPointResponse> {

        @NotNull
        public static final Transformer INSTANCE = new Transformer();

        private Transformer() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
        @NotNull
        /* renamed from: fromBundle */
        public AccessoryContextDataPointResponse fromBundle2(@NotNull Bundle bundle) {
            bundle.getClass();
            return new AccessoryContextDataPointResponse(AccessoryContextDataPointTransformer.INSTANCE.getListTransformer().fromBundle2(bundle));
        }

        @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
        @NotNull
        public Bundle toBundle(@NotNull AccessoryContextDataPointResponse t) {
            t.getClass();
            return AccessoryContextDataPointTransformer.INSTANCE.getListTransformer().toBundle(t.getContextData());
        }
    }

    public AccessoryContextDataPointResponse(@NotNull List<Moments.AccessoryContextDataPoint> list) {
        list.getClass();
        this.contextData = list;
        this.bundleTransformer = Transformer.INSTANCE;
    }

    @Override // com.amazon.alexa.accessoryclient.common.query.Query.Response
    @NotNull
    public Bundle getBundle() {
        return Query.Response.DefaultImpls.getBundle(this);
    }

    @Override // com.amazon.alexa.accessoryclient.common.query.Query.Response
    @NotNull
    public BundleTransformer<AccessoryContextDataPointResponse> getBundleTransformer() {
        return this.bundleTransformer;
    }

    @NotNull
    public final List<Moments.AccessoryContextDataPoint> getContextData() {
        return this.contextData;
    }
}
