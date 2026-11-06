package com.amazon.alexa.accessoryclient.common.query.request;

import android.os.Bundle;
import com.amazon.alexa.accessory.repositories.calling.ATCommand;
import com.amazon.alexa.accessoryclient.common.query.Query;
import com.amazon.alexa.accessoryclient.common.transformers.AtCommandTransformer;
import com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0019B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/query/request/AtCommandRequest;", "Lcom/amazon/alexa/accessoryclient/common/query/Query$Request;", "atCommand", "Lcom/amazon/alexa/accessory/repositories/calling/ATCommand;", "identifier", "", "(Lcom/amazon/alexa/accessory/repositories/calling/ATCommand;Ljava/lang/String;)V", "getAtCommand", "()Lcom/amazon/alexa/accessory/repositories/calling/ATCommand;", "bundleTransformer", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "getBundleTransformer", "()Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "getIdentifier", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "Transformer", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AtCommandRequest implements Query.Request<AtCommandRequest> {

    @NotNull
    private final ATCommand atCommand;

    @NotNull
    private final BundleTransformer<AtCommandRequest> bundleTransformer;

    @NotNull
    private final String identifier;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/query/request/AtCommandRequest$Transformer;", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "Lcom/amazon/alexa/accessoryclient/common/query/request/AtCommandRequest;", "()V", "AT_COMMAND_KEY", "", "IDENTIFIER_KEY", "fromBundle", "bundle", "Landroid/os/Bundle;", "toBundle", "t", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Transformer implements BundleTransformer<AtCommandRequest> {

        @NotNull
        private static final String AT_COMMAND_KEY = "atCommand";

        @NotNull
        private static final String IDENTIFIER_KEY = "identifier";

        @NotNull
        public static final Transformer INSTANCE = new Transformer();

        private Transformer() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
        @NotNull
        /* renamed from: fromBundle */
        public AtCommandRequest fromBundle2(@NotNull Bundle bundle) {
            bundle.getClass();
            AtCommandTransformer atCommandTransformer = AtCommandTransformer.INSTANCE;
            Bundle bundle2 = bundle.getBundle(AT_COMMAND_KEY);
            bundle2.getClass();
            ATCommand fromBundle2 = atCommandTransformer.fromBundle2(bundle2);
            String string = bundle.getString("identifier");
            string.getClass();
            return new AtCommandRequest(fromBundle2, string);
        }

        @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
        @NotNull
        public Bundle toBundle(@NotNull AtCommandRequest t) {
            t.getClass();
            Bundle bundle = new Bundle();
            bundle.putBundle(AT_COMMAND_KEY, AtCommandTransformer.INSTANCE.toBundle(t.getAtCommand()));
            bundle.putString("identifier", t.getIdentifier());
            return bundle;
        }
    }

    public AtCommandRequest(@NotNull ATCommand aTCommand, @NotNull String str) {
        aTCommand.getClass();
        str.getClass();
        this.atCommand = aTCommand;
        this.identifier = str;
        this.bundleTransformer = Transformer.INSTANCE;
    }

    public static /* synthetic */ AtCommandRequest copy$default(AtCommandRequest atCommandRequest, ATCommand aTCommand, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            aTCommand = atCommandRequest.atCommand;
        }
        if ((i & 2) != 0) {
            str = atCommandRequest.identifier;
        }
        return atCommandRequest.copy(aTCommand, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ATCommand getAtCommand() {
        return this.atCommand;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    @NotNull
    public final AtCommandRequest copy(@NotNull ATCommand atCommand, @NotNull String identifier) {
        atCommand.getClass();
        identifier.getClass();
        return new AtCommandRequest(atCommand, identifier);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AtCommandRequest)) {
            return false;
        }
        AtCommandRequest atCommandRequest = (AtCommandRequest) other;
        return Intrinsics.areEqual(this.atCommand, atCommandRequest.atCommand) && Intrinsics.areEqual(this.identifier, atCommandRequest.identifier);
    }

    @NotNull
    public final ATCommand getAtCommand() {
        return this.atCommand;
    }

    @Override // com.amazon.alexa.accessoryclient.common.query.Query.Request
    @NotNull
    public Bundle getBundle() {
        return Query.Request.DefaultImpls.getBundle(this);
    }

    @Override // com.amazon.alexa.accessoryclient.common.query.Query.Request
    @NotNull
    public BundleTransformer<AtCommandRequest> getBundleTransformer() {
        return this.bundleTransformer;
    }

    @NotNull
    public final String getIdentifier() {
        return this.identifier;
    }

    public int hashCode() {
        return this.identifier.hashCode() + (this.atCommand.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AtCommandRequest(atCommand=" + this.atCommand + ", identifier=" + this.identifier + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
