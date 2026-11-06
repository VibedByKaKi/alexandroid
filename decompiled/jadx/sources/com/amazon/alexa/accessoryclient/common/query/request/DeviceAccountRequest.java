package com.amazon.alexa.accessoryclient.common.query.request;

import android.os.Bundle;
import com.amazon.alexa.accessory.registration.DeviceRegistration;
import com.amazon.alexa.accessoryclient.common.query.Query;
import com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer;
import com.amazon.alexa.accessoryclient.common.transformers.DeviceRegistrationTransformer;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/query/request/DeviceAccountRequest;", "Lcom/amazon/alexa/accessoryclient/common/query/Query$Request;", "registration", "Lcom/amazon/alexa/accessory/registration/DeviceRegistration;", "(Lcom/amazon/alexa/accessory/registration/DeviceRegistration;)V", "bundleTransformer", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "getBundleTransformer", "()Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "getRegistration", "()Lcom/amazon/alexa/accessory/registration/DeviceRegistration;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "Transformer", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class DeviceAccountRequest implements Query.Request<DeviceAccountRequest> {

    @NotNull
    private final BundleTransformer<DeviceAccountRequest> bundleTransformer;

    @NotNull
    private final DeviceRegistration registration;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/query/request/DeviceAccountRequest$Transformer;", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "Lcom/amazon/alexa/accessoryclient/common/query/request/DeviceAccountRequest;", "()V", "fromBundle", "bundle", "Landroid/os/Bundle;", "toBundle", "deviceAccountRequest", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Transformer implements BundleTransformer<DeviceAccountRequest> {

        @NotNull
        public static final Transformer INSTANCE = new Transformer();

        private Transformer() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
        @NotNull
        /* renamed from: fromBundle */
        public DeviceAccountRequest fromBundle2(@NotNull Bundle bundle) {
            bundle.getClass();
            return new DeviceAccountRequest(DeviceRegistrationTransformer.INSTANCE.fromBundle2(bundle));
        }

        @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
        @NotNull
        public Bundle toBundle(@NotNull DeviceAccountRequest deviceAccountRequest) {
            deviceAccountRequest.getClass();
            return DeviceRegistrationTransformer.INSTANCE.toBundle(deviceAccountRequest.getRegistration());
        }
    }

    public DeviceAccountRequest(@NotNull DeviceRegistration deviceRegistration) {
        deviceRegistration.getClass();
        this.registration = deviceRegistration;
        this.bundleTransformer = Transformer.INSTANCE;
    }

    public static /* synthetic */ DeviceAccountRequest copy$default(DeviceAccountRequest deviceAccountRequest, DeviceRegistration deviceRegistration, int i, Object obj) {
        if ((i & 1) != 0) {
            deviceRegistration = deviceAccountRequest.registration;
        }
        return deviceAccountRequest.copy(deviceRegistration);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final DeviceRegistration getRegistration() {
        return this.registration;
    }

    @NotNull
    public final DeviceAccountRequest copy(@NotNull DeviceRegistration registration) {
        registration.getClass();
        return new DeviceAccountRequest(registration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeviceAccountRequest) && Intrinsics.areEqual(this.registration, ((DeviceAccountRequest) other).registration);
    }

    @Override // com.amazon.alexa.accessoryclient.common.query.Query.Request
    @NotNull
    public Bundle getBundle() {
        return Query.Request.DefaultImpls.getBundle(this);
    }

    @Override // com.amazon.alexa.accessoryclient.common.query.Query.Request
    @NotNull
    public BundleTransformer<DeviceAccountRequest> getBundleTransformer() {
        return this.bundleTransformer;
    }

    @NotNull
    public final DeviceRegistration getRegistration() {
        return this.registration;
    }

    public int hashCode() {
        return this.registration.hashCode();
    }

    @NotNull
    public String toString() {
        return "DeviceAccountRequest(registration=" + this.registration + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
