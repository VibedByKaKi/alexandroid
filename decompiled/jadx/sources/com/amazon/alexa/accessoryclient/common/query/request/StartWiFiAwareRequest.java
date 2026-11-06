package com.amazon.alexa.accessoryclient.common.query.request;

import android.os.Bundle;
import com.amazon.alexa.accessoryclient.common.query.Query;
import com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer;
import com.amazon.alexa.assistant.transport.MissingTokenPull;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/query/request/StartWiFiAwareRequest;", "Lcom/amazon/alexa/accessoryclient/common/query/Query$Request;", "identifier", "", "serviceName", "(Ljava/lang/String;Ljava/lang/String;)V", "bundleTransformer", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "getBundleTransformer", "()Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "getIdentifier", "()Ljava/lang/String;", "getServiceName", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "Transformer", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class StartWiFiAwareRequest implements Query.Request<StartWiFiAwareRequest> {

    @NotNull
    private final BundleTransformer<StartWiFiAwareRequest> bundleTransformer;

    @NotNull
    private final String identifier;

    @NotNull
    private final String serviceName;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/query/request/StartWiFiAwareRequest$Transformer;", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "Lcom/amazon/alexa/accessoryclient/common/query/request/StartWiFiAwareRequest;", "()V", "IDENTIFIER_KEY", "", "SERVICE_NAME_KEY", "fromBundle", "bundle", "Landroid/os/Bundle;", "toBundle", MissingTokenPull.TRIGGER_REQUEST, "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Transformer implements BundleTransformer<StartWiFiAwareRequest> {

        @NotNull
        private static final String IDENTIFIER_KEY = "identifier";

        @NotNull
        public static final Transformer INSTANCE = new Transformer();

        @NotNull
        private static final String SERVICE_NAME_KEY = "serviceName";

        private Transformer() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
        @NotNull
        /* renamed from: fromBundle */
        public StartWiFiAwareRequest fromBundle2(@NotNull Bundle bundle) {
            bundle.getClass();
            String string = bundle.getString("identifier");
            string.getClass();
            String string2 = bundle.getString(SERVICE_NAME_KEY);
            string2.getClass();
            return new StartWiFiAwareRequest(string, string2);
        }

        @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
        @NotNull
        public Bundle toBundle(@NotNull StartWiFiAwareRequest request) {
            request.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("identifier", request.getIdentifier());
            bundle.putString(SERVICE_NAME_KEY, request.getServiceName());
            return bundle;
        }
    }

    public StartWiFiAwareRequest(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.identifier = str;
        this.serviceName = str2;
        this.bundleTransformer = Transformer.INSTANCE;
    }

    public static /* synthetic */ StartWiFiAwareRequest copy$default(StartWiFiAwareRequest startWiFiAwareRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = startWiFiAwareRequest.identifier;
        }
        if ((i & 2) != 0) {
            str2 = startWiFiAwareRequest.serviceName;
        }
        return startWiFiAwareRequest.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getServiceName() {
        return this.serviceName;
    }

    @NotNull
    public final StartWiFiAwareRequest copy(@NotNull String identifier, @NotNull String serviceName) {
        identifier.getClass();
        serviceName.getClass();
        return new StartWiFiAwareRequest(identifier, serviceName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartWiFiAwareRequest)) {
            return false;
        }
        StartWiFiAwareRequest startWiFiAwareRequest = (StartWiFiAwareRequest) other;
        return Intrinsics.areEqual(this.identifier, startWiFiAwareRequest.identifier) && Intrinsics.areEqual(this.serviceName, startWiFiAwareRequest.serviceName);
    }

    @Override // com.amazon.alexa.accessoryclient.common.query.Query.Request
    @NotNull
    public Bundle getBundle() {
        return Query.Request.DefaultImpls.getBundle(this);
    }

    @Override // com.amazon.alexa.accessoryclient.common.query.Query.Request
    @NotNull
    public BundleTransformer<StartWiFiAwareRequest> getBundleTransformer() {
        return this.bundleTransformer;
    }

    @NotNull
    public final String getIdentifier() {
        return this.identifier;
    }

    @NotNull
    public final String getServiceName() {
        return this.serviceName;
    }

    public int hashCode() {
        return this.serviceName.hashCode() + (this.identifier.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("StartWiFiAwareRequest(identifier=", this.identifier, ", serviceName=", this.serviceName, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
