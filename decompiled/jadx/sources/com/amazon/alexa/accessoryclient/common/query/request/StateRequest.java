package com.amazon.alexa.accessoryclient.common.query.request;

import android.os.Bundle;
import com.amazon.alexa.accessory.protocol.StateOuterClass;
import com.amazon.alexa.accessoryclient.common.query.Query;
import com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer;
import com.amazon.alexa.accessoryclient.common.transformers.StateTransformer;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0019\u001aB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/query/request/StateRequest;", "Lcom/amazon/alexa/accessoryclient/common/query/Query$Request;", "state", "Lcom/amazon/alexa/accessory/protocol/StateOuterClass$State;", "identifier", "", "(Lcom/amazon/alexa/accessory/protocol/StateOuterClass$State;Ljava/lang/String;)V", "bundleTransformer", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "getBundleTransformer", "()Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "getIdentifier", "()Ljava/lang/String;", "getState", "()Lcom/amazon/alexa/accessory/protocol/StateOuterClass$State;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "Companion", "Transformer", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class StateRequest implements Query.Request<StateRequest> {

    @NotNull
    private static final String IDENTIFIER_KEY = "identifier";

    @NotNull
    private static final String STATE_KEY = "state";

    @NotNull
    private final BundleTransformer<StateRequest> bundleTransformer;

    @NotNull
    private final String identifier;

    @NotNull
    private final StateOuterClass.State state;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/query/request/StateRequest$Transformer;", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "Lcom/amazon/alexa/accessoryclient/common/query/request/StateRequest;", "()V", "fromBundle", "bundle", "Landroid/os/Bundle;", "toBundle", "stateRequest", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Transformer implements BundleTransformer<StateRequest> {

        @NotNull
        public static final Transformer INSTANCE = new Transformer();

        private Transformer() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
        @NotNull
        /* renamed from: fromBundle */
        public StateRequest fromBundle2(@NotNull Bundle bundle) {
            bundle.getClass();
            StateTransformer stateTransformer = StateTransformer.INSTANCE;
            Bundle bundle2 = bundle.getBundle(StateRequest.STATE_KEY);
            bundle2.getClass();
            StateOuterClass.State fromBundle2 = stateTransformer.fromBundle2(bundle2);
            String string = bundle.getString(StateRequest.IDENTIFIER_KEY);
            string.getClass();
            return new StateRequest(fromBundle2, string);
        }

        @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
        @NotNull
        public Bundle toBundle(@NotNull StateRequest stateRequest) {
            stateRequest.getClass();
            Bundle bundle = new Bundle();
            bundle.putBundle(StateRequest.STATE_KEY, StateTransformer.INSTANCE.toBundle(stateRequest.getState()));
            bundle.putString(StateRequest.IDENTIFIER_KEY, stateRequest.getIdentifier());
            return bundle;
        }
    }

    public StateRequest(@NotNull StateOuterClass.State state, @NotNull String str) {
        state.getClass();
        str.getClass();
        this.state = state;
        this.identifier = str;
        this.bundleTransformer = Transformer.INSTANCE;
    }

    public static /* synthetic */ StateRequest copy$default(StateRequest stateRequest, StateOuterClass.State state, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            state = stateRequest.state;
        }
        if ((i & 2) != 0) {
            str = stateRequest.identifier;
        }
        return stateRequest.copy(state, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final StateOuterClass.State getState() {
        return this.state;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    @NotNull
    public final StateRequest copy(@NotNull StateOuterClass.State state, @NotNull String identifier) {
        state.getClass();
        identifier.getClass();
        return new StateRequest(state, identifier);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StateRequest)) {
            return false;
        }
        StateRequest stateRequest = (StateRequest) other;
        return Intrinsics.areEqual(this.state, stateRequest.state) && Intrinsics.areEqual(this.identifier, stateRequest.identifier);
    }

    @Override // com.amazon.alexa.accessoryclient.common.query.Query.Request
    @NotNull
    public Bundle getBundle() {
        return Query.Request.DefaultImpls.getBundle(this);
    }

    @Override // com.amazon.alexa.accessoryclient.common.query.Query.Request
    @NotNull
    public BundleTransformer<StateRequest> getBundleTransformer() {
        return this.bundleTransformer;
    }

    @NotNull
    public final String getIdentifier() {
        return this.identifier;
    }

    @NotNull
    public final StateOuterClass.State getState() {
        return this.state;
    }

    public int hashCode() {
        return this.identifier.hashCode() + (this.state.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "StateRequest(state=" + this.state + ", identifier=" + this.identifier + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
