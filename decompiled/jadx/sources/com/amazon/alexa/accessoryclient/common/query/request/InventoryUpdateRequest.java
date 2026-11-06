package com.amazon.alexa.accessoryclient.common.query.request;

import android.os.Bundle;
import com.amazon.alexa.accessory.kota.KotaJobSchedulerService;
import com.amazon.alexa.accessory.kota.UpdateRequest;
import com.amazon.alexa.accessoryclient.common.query.Query;
import com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer;
import com.amazon.alexa.accessoryclient.common.transformers.UpdateRequestTransformer;
import com.amazon.alexa.mobile.assistant.client.auth.RejectedTokenRefreshKt;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0019B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/query/request/InventoryUpdateRequest;", "Lcom/amazon/alexa/accessoryclient/common/query/Query$Request;", KotaJobSchedulerService.UPDATE_REQUEST_KEY, "Lcom/amazon/alexa/accessory/kota/UpdateRequest;", RejectedTokenRefreshKt.REFRESH_ACTION_FORCE, "", "(Lcom/amazon/alexa/accessory/kota/UpdateRequest;Z)V", "bundleTransformer", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "getBundleTransformer", "()Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "getForce", "()Z", "getUpdateRequest", "()Lcom/amazon/alexa/accessory/kota/UpdateRequest;", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "Transformer", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class InventoryUpdateRequest implements Query.Request<InventoryUpdateRequest> {

    @NotNull
    private final BundleTransformer<InventoryUpdateRequest> bundleTransformer;
    private final boolean force;

    @NotNull
    private final UpdateRequest updateRequest;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/query/request/InventoryUpdateRequest$Transformer;", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "Lcom/amazon/alexa/accessoryclient/common/query/request/InventoryUpdateRequest;", "()V", "FORCE_KEY", "", "UPDATE_REQUEST_KEY", "fromBundle", "bundle", "Landroid/os/Bundle;", "toBundle", "t", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Transformer implements BundleTransformer<InventoryUpdateRequest> {

        @NotNull
        private static final String FORCE_KEY = "force";

        @NotNull
        public static final Transformer INSTANCE = new Transformer();

        @NotNull
        private static final String UPDATE_REQUEST_KEY = "updateRequest";

        private Transformer() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
        @NotNull
        /* renamed from: fromBundle */
        public InventoryUpdateRequest fromBundle2(@NotNull Bundle bundle) {
            bundle.getClass();
            UpdateRequestTransformer updateRequestTransformer = UpdateRequestTransformer.INSTANCE;
            Bundle bundle2 = bundle.getBundle("updateRequest");
            bundle2.getClass();
            return new InventoryUpdateRequest(updateRequestTransformer.fromBundle2(bundle2), bundle.getBoolean("force"));
        }

        @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
        @NotNull
        public Bundle toBundle(@NotNull InventoryUpdateRequest t) {
            t.getClass();
            Bundle bundle = new Bundle();
            bundle.putBundle("updateRequest", UpdateRequestTransformer.INSTANCE.toBundle(t.getUpdateRequest()));
            bundle.putBoolean("force", t.getForce());
            return bundle;
        }
    }

    public InventoryUpdateRequest(@NotNull UpdateRequest updateRequest, boolean z) {
        updateRequest.getClass();
        this.updateRequest = updateRequest;
        this.force = z;
        this.bundleTransformer = Transformer.INSTANCE;
    }

    public static /* synthetic */ InventoryUpdateRequest copy$default(InventoryUpdateRequest inventoryUpdateRequest, UpdateRequest updateRequest, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            updateRequest = inventoryUpdateRequest.updateRequest;
        }
        if ((i & 2) != 0) {
            z = inventoryUpdateRequest.force;
        }
        return inventoryUpdateRequest.copy(updateRequest, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final UpdateRequest getUpdateRequest() {
        return this.updateRequest;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getForce() {
        return this.force;
    }

    @NotNull
    public final InventoryUpdateRequest copy(@NotNull UpdateRequest updateRequest, boolean force) {
        updateRequest.getClass();
        return new InventoryUpdateRequest(updateRequest, force);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InventoryUpdateRequest)) {
            return false;
        }
        InventoryUpdateRequest inventoryUpdateRequest = (InventoryUpdateRequest) other;
        return Intrinsics.areEqual(this.updateRequest, inventoryUpdateRequest.updateRequest) && this.force == inventoryUpdateRequest.force;
    }

    @Override // com.amazon.alexa.accessoryclient.common.query.Query.Request
    @NotNull
    public Bundle getBundle() {
        return Query.Request.DefaultImpls.getBundle(this);
    }

    @Override // com.amazon.alexa.accessoryclient.common.query.Query.Request
    @NotNull
    public BundleTransformer<InventoryUpdateRequest> getBundleTransformer() {
        return this.bundleTransformer;
    }

    public final boolean getForce() {
        return this.force;
    }

    @NotNull
    public final UpdateRequest getUpdateRequest() {
        return this.updateRequest;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.updateRequest.hashCode() * 31;
        boolean z = this.force;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        return "InventoryUpdateRequest(updateRequest=" + this.updateRequest + ", force=" + this.force + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
