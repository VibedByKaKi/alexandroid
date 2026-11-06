package com.amazon.alexa.accessoryclient.common.query.request;

import android.os.Bundle;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessoryclient.common.query.Query;
import com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001bB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/query/request/QuerySessionBooleanStringRequest;", "Lcom/amazon/alexa/accessoryclient/common/query/Query$Request;", "identifier", "", "booleanValue", "", "stringValue", "(Ljava/lang/String;ZLjava/lang/String;)V", "getBooleanValue", "()Z", "bundleTransformer", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "getBundleTransformer", "()Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "getIdentifier", "()Ljava/lang/String;", "getStringValue", "component1", "component2", "component3", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "Transformer", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class QuerySessionBooleanStringRequest implements Query.Request<QuerySessionBooleanStringRequest> {
    private final boolean booleanValue;

    @NotNull
    private final BundleTransformer<QuerySessionBooleanStringRequest> bundleTransformer;

    @NotNull
    private final String identifier;

    @NotNull
    private final String stringValue;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/query/request/QuerySessionBooleanStringRequest$Transformer;", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "Lcom/amazon/alexa/accessoryclient/common/query/request/QuerySessionBooleanStringRequest;", "()V", "BOOLEAN_KEY", "", "IDENTIFIER_KEY", "STRING_KEY", "fromBundle", "bundle", "Landroid/os/Bundle;", "toBundle", "querySessionBooleanStringRequest", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Transformer implements BundleTransformer<QuerySessionBooleanStringRequest> {

        @NotNull
        private static final String BOOLEAN_KEY = "boolean";

        @NotNull
        private static final String IDENTIFIER_KEY = "identifier";

        @NotNull
        public static final Transformer INSTANCE = new Transformer();

        @NotNull
        private static final String STRING_KEY = "string";

        private Transformer() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
        @NotNull
        /* renamed from: fromBundle */
        public QuerySessionBooleanStringRequest fromBundle2(@NotNull Bundle bundle) {
            bundle.getClass();
            String string = bundle.getString("identifier");
            string.getClass();
            boolean z = bundle.getBoolean("boolean");
            String string2 = bundle.getString("string");
            string2.getClass();
            return new QuerySessionBooleanStringRequest(string, z, string2);
        }

        @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
        @NotNull
        public Bundle toBundle(@NotNull QuerySessionBooleanStringRequest querySessionBooleanStringRequest) {
            querySessionBooleanStringRequest.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("identifier", querySessionBooleanStringRequest.getIdentifier());
            bundle.putBoolean("boolean", querySessionBooleanStringRequest.getBooleanValue());
            bundle.putString("string", querySessionBooleanStringRequest.getStringValue());
            return bundle;
        }
    }

    public QuerySessionBooleanStringRequest(@NotNull String str, boolean z, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.identifier = str;
        this.booleanValue = z;
        this.stringValue = str2;
        this.bundleTransformer = Transformer.INSTANCE;
    }

    public static /* synthetic */ QuerySessionBooleanStringRequest copy$default(QuerySessionBooleanStringRequest querySessionBooleanStringRequest, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = querySessionBooleanStringRequest.identifier;
        }
        if ((i & 2) != 0) {
            z = querySessionBooleanStringRequest.booleanValue;
        }
        if ((i & 4) != 0) {
            str2 = querySessionBooleanStringRequest.stringValue;
        }
        return querySessionBooleanStringRequest.copy(str, z, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getBooleanValue() {
        return this.booleanValue;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getStringValue() {
        return this.stringValue;
    }

    @NotNull
    public final QuerySessionBooleanStringRequest copy(@NotNull String identifier, boolean booleanValue, @NotNull String stringValue) {
        identifier.getClass();
        stringValue.getClass();
        return new QuerySessionBooleanStringRequest(identifier, booleanValue, stringValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuerySessionBooleanStringRequest)) {
            return false;
        }
        QuerySessionBooleanStringRequest querySessionBooleanStringRequest = (QuerySessionBooleanStringRequest) other;
        return Intrinsics.areEqual(this.identifier, querySessionBooleanStringRequest.identifier) && this.booleanValue == querySessionBooleanStringRequest.booleanValue && Intrinsics.areEqual(this.stringValue, querySessionBooleanStringRequest.stringValue);
    }

    public final boolean getBooleanValue() {
        return this.booleanValue;
    }

    @Override // com.amazon.alexa.accessoryclient.common.query.Query.Request
    @NotNull
    public Bundle getBundle() {
        return Query.Request.DefaultImpls.getBundle(this);
    }

    @Override // com.amazon.alexa.accessoryclient.common.query.Query.Request
    @NotNull
    public BundleTransformer<QuerySessionBooleanStringRequest> getBundleTransformer() {
        return this.bundleTransformer;
    }

    @NotNull
    public final String getIdentifier() {
        return this.identifier;
    }

    @NotNull
    public final String getStringValue() {
        return this.stringValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.identifier.hashCode() * 31;
        boolean z = this.booleanValue;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.stringValue.hashCode() + ((hashCode + i) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.identifier;
        boolean z = this.booleanValue;
        return a$$ExternalSyntheticOutline0.m(Automotive$$ExternalSyntheticOutline0.m("QuerySessionBooleanStringRequest(identifier=", str, ", booleanValue=", z, ", stringValue="), this.stringValue, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
