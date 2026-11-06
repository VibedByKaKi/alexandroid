package com.amazon.alexa.accessoryclient.common.query.request;

import android.os.Bundle;
import com.amazon.alexa.accessory.protocol.System;
import com.amazon.alexa.accessoryclient.common.query.Query;
import com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0019B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/query/request/ResetDeviceRequest;", "Lcom/amazon/alexa/accessoryclient/common/query/Query$Request;", "identifier", "", "resetType", "Lcom/amazon/alexa/accessory/protocol/System$ResetDevice$ResetType;", "(Ljava/lang/String;Lcom/amazon/alexa/accessory/protocol/System$ResetDevice$ResetType;)V", "bundleTransformer", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "getBundleTransformer", "()Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "getIdentifier", "()Ljava/lang/String;", "getResetType", "()Lcom/amazon/alexa/accessory/protocol/System$ResetDevice$ResetType;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "Transformer", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ResetDeviceRequest implements Query.Request<ResetDeviceRequest> {

    @NotNull
    private final BundleTransformer<ResetDeviceRequest> bundleTransformer;

    @NotNull
    private final String identifier;

    @NotNull
    private final System.ResetDevice.ResetType resetType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/query/request/ResetDeviceRequest$Transformer;", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "Lcom/amazon/alexa/accessoryclient/common/query/request/ResetDeviceRequest;", "()V", "IDENTIFIER_KEY", "", "RESET_TYPE_KEY", "fromBundle", "bundle", "Landroid/os/Bundle;", "toBundle", "resetDeviceRequest", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Transformer implements BundleTransformer<ResetDeviceRequest> {

        @NotNull
        private static final String IDENTIFIER_KEY = "identifier";

        @NotNull
        public static final Transformer INSTANCE = new Transformer();

        @NotNull
        private static final String RESET_TYPE_KEY = "resetType";

        private Transformer() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
        @NotNull
        /* renamed from: fromBundle */
        public ResetDeviceRequest fromBundle2(@NotNull Bundle bundle) {
            bundle.getClass();
            String string = bundle.getString("identifier");
            string.getClass();
            Serializable serializable = bundle.getSerializable(RESET_TYPE_KEY);
            serializable.getClass();
            return new ResetDeviceRequest(string, (System.ResetDevice.ResetType) serializable);
        }

        @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
        @NotNull
        public Bundle toBundle(@NotNull ResetDeviceRequest resetDeviceRequest) {
            resetDeviceRequest.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("identifier", resetDeviceRequest.getIdentifier());
            bundle.putSerializable(RESET_TYPE_KEY, resetDeviceRequest.getResetType());
            return bundle;
        }
    }

    public ResetDeviceRequest(@NotNull String str, @NotNull System.ResetDevice.ResetType resetType) {
        str.getClass();
        resetType.getClass();
        this.identifier = str;
        this.resetType = resetType;
        this.bundleTransformer = Transformer.INSTANCE;
    }

    public static /* synthetic */ ResetDeviceRequest copy$default(ResetDeviceRequest resetDeviceRequest, String str, System.ResetDevice.ResetType resetType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = resetDeviceRequest.identifier;
        }
        if ((i & 2) != 0) {
            resetType = resetDeviceRequest.resetType;
        }
        return resetDeviceRequest.copy(str, resetType);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final System.ResetDevice.ResetType getResetType() {
        return this.resetType;
    }

    @NotNull
    public final ResetDeviceRequest copy(@NotNull String identifier, @NotNull System.ResetDevice.ResetType resetType) {
        identifier.getClass();
        resetType.getClass();
        return new ResetDeviceRequest(identifier, resetType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResetDeviceRequest)) {
            return false;
        }
        ResetDeviceRequest resetDeviceRequest = (ResetDeviceRequest) other;
        return Intrinsics.areEqual(this.identifier, resetDeviceRequest.identifier) && this.resetType == resetDeviceRequest.resetType;
    }

    @Override // com.amazon.alexa.accessoryclient.common.query.Query.Request
    @NotNull
    public Bundle getBundle() {
        return Query.Request.DefaultImpls.getBundle(this);
    }

    @Override // com.amazon.alexa.accessoryclient.common.query.Query.Request
    @NotNull
    public BundleTransformer<ResetDeviceRequest> getBundleTransformer() {
        return this.bundleTransformer;
    }

    @NotNull
    public final String getIdentifier() {
        return this.identifier;
    }

    @NotNull
    public final System.ResetDevice.ResetType getResetType() {
        return this.resetType;
    }

    public int hashCode() {
        return this.resetType.hashCode() + (this.identifier.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ResetDeviceRequest(identifier=" + this.identifier + ", resetType=" + this.resetType + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
