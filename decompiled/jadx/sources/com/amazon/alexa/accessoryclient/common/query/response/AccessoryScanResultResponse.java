package com.amazon.alexa.accessoryclient.common.query.response;

import android.os.Bundle;
import com.amazon.alexa.accessoryclient.common.api.AccessoryScanResult;
import com.amazon.alexa.accessoryclient.common.query.Query;
import com.amazon.alexa.accessoryclient.common.transformers.AccessoryScanResultTransformer;
import com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/query/response/AccessoryScanResultResponse;", "Lcom/amazon/alexa/accessoryclient/common/query/Query$Response;", "accessoryScanResult", "Lcom/amazon/alexa/accessoryclient/common/api/AccessoryScanResult;", "(Lcom/amazon/alexa/accessoryclient/common/api/AccessoryScanResult;)V", "getAccessoryScanResult", "()Lcom/amazon/alexa/accessoryclient/common/api/AccessoryScanResult;", "bundleTransformer", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "getBundleTransformer", "()Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "Transformer", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AccessoryScanResultResponse implements Query.Response<AccessoryScanResultResponse> {

    @NotNull
    private final AccessoryScanResult accessoryScanResult;

    @NotNull
    private final BundleTransformer<AccessoryScanResultResponse> bundleTransformer;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/query/response/AccessoryScanResultResponse$Transformer;", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "Lcom/amazon/alexa/accessoryclient/common/query/response/AccessoryScanResultResponse;", "()V", "fromBundle", "bundle", "Landroid/os/Bundle;", "toBundle", "accessoryScanResultResponse", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Transformer implements BundleTransformer<AccessoryScanResultResponse> {

        @NotNull
        public static final Transformer INSTANCE = new Transformer();

        private Transformer() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
        @NotNull
        /* renamed from: fromBundle */
        public AccessoryScanResultResponse fromBundle2(@NotNull Bundle bundle) {
            bundle.getClass();
            return new AccessoryScanResultResponse(AccessoryScanResultTransformer.INSTANCE.fromBundle2(bundle));
        }

        @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
        @NotNull
        public Bundle toBundle(@NotNull AccessoryScanResultResponse accessoryScanResultResponse) {
            accessoryScanResultResponse.getClass();
            return AccessoryScanResultTransformer.INSTANCE.toBundle(accessoryScanResultResponse.getAccessoryScanResult());
        }
    }

    public AccessoryScanResultResponse(@NotNull AccessoryScanResult accessoryScanResult) {
        accessoryScanResult.getClass();
        this.accessoryScanResult = accessoryScanResult;
        this.bundleTransformer = Transformer.INSTANCE;
    }

    public static /* synthetic */ AccessoryScanResultResponse copy$default(AccessoryScanResultResponse accessoryScanResultResponse, AccessoryScanResult accessoryScanResult, int i, Object obj) {
        if ((i & 1) != 0) {
            accessoryScanResult = accessoryScanResultResponse.accessoryScanResult;
        }
        return accessoryScanResultResponse.copy(accessoryScanResult);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AccessoryScanResult getAccessoryScanResult() {
        return this.accessoryScanResult;
    }

    @NotNull
    public final AccessoryScanResultResponse copy(@NotNull AccessoryScanResult accessoryScanResult) {
        accessoryScanResult.getClass();
        return new AccessoryScanResultResponse(accessoryScanResult);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AccessoryScanResultResponse) && Intrinsics.areEqual(this.accessoryScanResult, ((AccessoryScanResultResponse) other).accessoryScanResult);
    }

    @NotNull
    public final AccessoryScanResult getAccessoryScanResult() {
        return this.accessoryScanResult;
    }

    @Override // com.amazon.alexa.accessoryclient.common.query.Query.Response
    @NotNull
    public Bundle getBundle() {
        return Query.Response.DefaultImpls.getBundle(this);
    }

    @Override // com.amazon.alexa.accessoryclient.common.query.Query.Response
    @NotNull
    public BundleTransformer<AccessoryScanResultResponse> getBundleTransformer() {
        return this.bundleTransformer;
    }

    public int hashCode() {
        return this.accessoryScanResult.hashCode();
    }

    @NotNull
    public String toString() {
        return "AccessoryScanResultResponse(accessoryScanResult=" + this.accessoryScanResult + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
