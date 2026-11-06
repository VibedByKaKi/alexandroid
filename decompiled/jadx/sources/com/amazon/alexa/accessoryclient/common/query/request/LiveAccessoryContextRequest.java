package com.amazon.alexa.accessoryclient.common.query.request;

import android.os.Bundle;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.protocol.Moments;
import com.amazon.alexa.accessoryclient.common.query.Query;
import com.amazon.alexa.accessoryclient.common.transformers.AccessoryContextCategoryTransformer;
import com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001dB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J-\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/query/request/LiveAccessoryContextRequest;", "Lcom/amazon/alexa/accessoryclient/common/query/Query$Request;", "identifier", "", "categories", "", "Lcom/amazon/alexa/accessory/protocol/Moments$AccessoryContextCategory;", "uniqueClientId", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "bundleTransformer", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "getBundleTransformer", "()Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "getCategories", "()Ljava/util/List;", "getIdentifier", "()Ljava/lang/String;", "getUniqueClientId", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "Transformer", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class LiveAccessoryContextRequest implements Query.Request<LiveAccessoryContextRequest> {

    @NotNull
    private final BundleTransformer<LiveAccessoryContextRequest> bundleTransformer;

    @NotNull
    private final List<Moments.AccessoryContextCategory> categories;

    @NotNull
    private final String identifier;

    @NotNull
    private final String uniqueClientId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/query/request/LiveAccessoryContextRequest$Transformer;", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "Lcom/amazon/alexa/accessoryclient/common/query/request/LiveAccessoryContextRequest;", "()V", "CATEGORIES_LIST_KEY", "", "IDENTIFIER_KEY", "UNIQUE_CLIENT_ID", "fromBundle", "bundle", "Landroid/os/Bundle;", "toBundle", "liveAccessoryContextRequest", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Transformer implements BundleTransformer<LiveAccessoryContextRequest> {

        @NotNull
        private static final String CATEGORIES_LIST_KEY = "categoriesList";

        @NotNull
        private static final String IDENTIFIER_KEY = "identifier";

        @NotNull
        public static final Transformer INSTANCE = new Transformer();

        @NotNull
        private static final String UNIQUE_CLIENT_ID = "uniqueClientId";

        private Transformer() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
        @NotNull
        /* renamed from: fromBundle */
        public LiveAccessoryContextRequest fromBundle2(@NotNull Bundle bundle) {
            bundle.getClass();
            String string = bundle.getString("identifier");
            string.getClass();
            BundleTransformer<List<Moments.AccessoryContextCategory>> listTransformer = AccessoryContextCategoryTransformer.INSTANCE.getListTransformer();
            Bundle bundle2 = bundle.getBundle(CATEGORIES_LIST_KEY);
            bundle2.getClass();
            List<Moments.AccessoryContextCategory> fromBundle2 = listTransformer.fromBundle2(bundle2);
            String string2 = bundle.getString(UNIQUE_CLIENT_ID);
            string2.getClass();
            return new LiveAccessoryContextRequest(string, fromBundle2, string2);
        }

        @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
        @NotNull
        public Bundle toBundle(@NotNull LiveAccessoryContextRequest liveAccessoryContextRequest) {
            liveAccessoryContextRequest.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("identifier", liveAccessoryContextRequest.getIdentifier());
            bundle.putBundle(CATEGORIES_LIST_KEY, AccessoryContextCategoryTransformer.INSTANCE.getListTransformer().toBundle(liveAccessoryContextRequest.getCategories()));
            bundle.putString(UNIQUE_CLIENT_ID, liveAccessoryContextRequest.getUniqueClientId());
            return bundle;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LiveAccessoryContextRequest(@NotNull String str, @NotNull List<? extends Moments.AccessoryContextCategory> list, @NotNull String str2) {
        str.getClass();
        list.getClass();
        str2.getClass();
        this.identifier = str;
        this.categories = list;
        this.uniqueClientId = str2;
        this.bundleTransformer = Transformer.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveAccessoryContextRequest copy$default(LiveAccessoryContextRequest liveAccessoryContextRequest, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = liveAccessoryContextRequest.identifier;
        }
        if ((i & 2) != 0) {
            list = liveAccessoryContextRequest.categories;
        }
        if ((i & 4) != 0) {
            str2 = liveAccessoryContextRequest.uniqueClientId;
        }
        return liveAccessoryContextRequest.copy(str, list, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    @NotNull
    public final List<Moments.AccessoryContextCategory> component2() {
        return this.categories;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getUniqueClientId() {
        return this.uniqueClientId;
    }

    @NotNull
    public final LiveAccessoryContextRequest copy(@NotNull String identifier, @NotNull List<? extends Moments.AccessoryContextCategory> categories, @NotNull String uniqueClientId) {
        identifier.getClass();
        categories.getClass();
        uniqueClientId.getClass();
        return new LiveAccessoryContextRequest(identifier, categories, uniqueClientId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveAccessoryContextRequest)) {
            return false;
        }
        LiveAccessoryContextRequest liveAccessoryContextRequest = (LiveAccessoryContextRequest) other;
        return Intrinsics.areEqual(this.identifier, liveAccessoryContextRequest.identifier) && Intrinsics.areEqual(this.categories, liveAccessoryContextRequest.categories) && Intrinsics.areEqual(this.uniqueClientId, liveAccessoryContextRequest.uniqueClientId);
    }

    @Override // com.amazon.alexa.accessoryclient.common.query.Query.Request
    @NotNull
    public Bundle getBundle() {
        return Query.Request.DefaultImpls.getBundle(this);
    }

    @Override // com.amazon.alexa.accessoryclient.common.query.Query.Request
    @NotNull
    public BundleTransformer<LiveAccessoryContextRequest> getBundleTransformer() {
        return this.bundleTransformer;
    }

    @NotNull
    public final List<Moments.AccessoryContextCategory> getCategories() {
        return this.categories;
    }

    @NotNull
    public final String getIdentifier() {
        return this.identifier;
    }

    @NotNull
    public final String getUniqueClientId() {
        return this.uniqueClientId;
    }

    public int hashCode() {
        return this.uniqueClientId.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(this.categories, this.identifier.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.identifier;
        List<Moments.AccessoryContextCategory> list = this.categories;
        return a$$ExternalSyntheticOutline0.m(AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m14724m("LiveAccessoryContextRequest(identifier=", str, ", categories=", (List) list, ", uniqueClientId="), this.uniqueClientId, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
