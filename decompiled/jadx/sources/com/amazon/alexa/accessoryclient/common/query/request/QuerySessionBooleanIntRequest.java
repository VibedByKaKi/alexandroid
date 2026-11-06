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
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001cB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/query/request/QuerySessionBooleanIntRequest;", "Lcom/amazon/alexa/accessoryclient/common/query/Query$Request;", "identifier", "", "booleanValue", "", "intValue", "", "(Ljava/lang/String;ZI)V", "getBooleanValue", "()Z", "bundleTransformer", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "getBundleTransformer", "()Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "getIdentifier", "()Ljava/lang/String;", "getIntValue", "()I", "component1", "component2", "component3", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "Transformer", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class QuerySessionBooleanIntRequest implements Query.Request<QuerySessionBooleanIntRequest> {
    private final boolean booleanValue;

    @NotNull
    private final BundleTransformer<QuerySessionBooleanIntRequest> bundleTransformer;

    @NotNull
    private final String identifier;
    private final int intValue;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/query/request/QuerySessionBooleanIntRequest$Transformer;", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "Lcom/amazon/alexa/accessoryclient/common/query/request/QuerySessionBooleanIntRequest;", "()V", "BOOLEAN_KEY", "", "IDENTIFIER_KEY", "INT_KEY", "fromBundle", "bundle", "Landroid/os/Bundle;", "toBundle", "querySessionBooleanIntRequest", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Transformer implements BundleTransformer<QuerySessionBooleanIntRequest> {

        @NotNull
        private static final String BOOLEAN_KEY = "boolean";

        @NotNull
        private static final String IDENTIFIER_KEY = "identifier";

        @NotNull
        public static final Transformer INSTANCE = new Transformer();

        @NotNull
        private static final String INT_KEY = "int";

        private Transformer() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
        @NotNull
        /* renamed from: fromBundle */
        public QuerySessionBooleanIntRequest fromBundle2(@NotNull Bundle bundle) {
            bundle.getClass();
            String string = bundle.getString("identifier");
            string.getClass();
            return new QuerySessionBooleanIntRequest(string, bundle.getBoolean("boolean"), bundle.getInt(INT_KEY));
        }

        @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
        @NotNull
        public Bundle toBundle(@NotNull QuerySessionBooleanIntRequest querySessionBooleanIntRequest) {
            querySessionBooleanIntRequest.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("identifier", querySessionBooleanIntRequest.getIdentifier());
            bundle.putBoolean("boolean", querySessionBooleanIntRequest.getBooleanValue());
            bundle.putInt(INT_KEY, querySessionBooleanIntRequest.getIntValue());
            return bundle;
        }
    }

    public QuerySessionBooleanIntRequest(@NotNull String str, boolean z, int i) {
        str.getClass();
        this.identifier = str;
        this.booleanValue = z;
        this.intValue = i;
        this.bundleTransformer = Transformer.INSTANCE;
    }

    public static /* synthetic */ QuerySessionBooleanIntRequest copy$default(QuerySessionBooleanIntRequest querySessionBooleanIntRequest, String str, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = querySessionBooleanIntRequest.identifier;
        }
        if ((i2 & 2) != 0) {
            z = querySessionBooleanIntRequest.booleanValue;
        }
        if ((i2 & 4) != 0) {
            i = querySessionBooleanIntRequest.intValue;
        }
        return querySessionBooleanIntRequest.copy(str, z, i);
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

    /* renamed from: component3, reason: from getter */
    public final int getIntValue() {
        return this.intValue;
    }

    @NotNull
    public final QuerySessionBooleanIntRequest copy(@NotNull String identifier, boolean booleanValue, int intValue) {
        identifier.getClass();
        return new QuerySessionBooleanIntRequest(identifier, booleanValue, intValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuerySessionBooleanIntRequest)) {
            return false;
        }
        QuerySessionBooleanIntRequest querySessionBooleanIntRequest = (QuerySessionBooleanIntRequest) other;
        return Intrinsics.areEqual(this.identifier, querySessionBooleanIntRequest.identifier) && this.booleanValue == querySessionBooleanIntRequest.booleanValue && this.intValue == querySessionBooleanIntRequest.intValue;
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
    public BundleTransformer<QuerySessionBooleanIntRequest> getBundleTransformer() {
        return this.bundleTransformer;
    }

    @NotNull
    public final String getIdentifier() {
        return this.identifier;
    }

    public final int getIntValue() {
        return this.intValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.identifier.hashCode() * 31;
        boolean z = this.booleanValue;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return Integer.hashCode(this.intValue) + ((hashCode + i) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.identifier;
        boolean z = this.booleanValue;
        return a$$ExternalSyntheticOutline0.m(Automotive$$ExternalSyntheticOutline0.m("QuerySessionBooleanIntRequest(identifier=", str, ", booleanValue=", z, ", intValue="), this.intValue, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
