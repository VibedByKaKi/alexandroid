package com.amazon.alexa.apl.payload;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/apl/payload/ExecuteCommandPayload;", "Lcom/amazon/alexa/apl/payload/APLPayload;", "mPresentationToken", "", "mCommands", "(Ljava/lang/String;Ljava/lang/String;)V", "getMCommands", "()Ljava/lang/String;", "getMPresentationToken", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toJson", "Lorg/json/JSONObject;", "toString", "Companion", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ExecuteCommandPayload extends APLPayload {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String FIELD_COMMANDS = "commands";

    @NotNull
    private final String mCommands;

    @NotNull
    private final String mPresentationToken;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExecuteCommandPayload(@NotNull String str, @NotNull String str2) {
        super(str);
        str.getClass();
        str2.getClass();
        this.mPresentationToken = str;
        this.mCommands = str2;
    }

    public static /* synthetic */ ExecuteCommandPayload copy$default(ExecuteCommandPayload executeCommandPayload, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = executeCommandPayload.mPresentationToken;
        }
        if ((i & 2) != 0) {
            str2 = executeCommandPayload.mCommands;
        }
        return executeCommandPayload.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getMPresentationToken() {
        return this.mPresentationToken;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getMCommands() {
        return this.mCommands;
    }

    @NotNull
    public final ExecuteCommandPayload copy(@NotNull String mPresentationToken, @NotNull String mCommands) {
        mPresentationToken.getClass();
        mCommands.getClass();
        return new ExecuteCommandPayload(mPresentationToken, mCommands);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExecuteCommandPayload)) {
            return false;
        }
        ExecuteCommandPayload executeCommandPayload = (ExecuteCommandPayload) other;
        return Intrinsics.areEqual(this.mPresentationToken, executeCommandPayload.mPresentationToken) && Intrinsics.areEqual(this.mCommands, executeCommandPayload.mCommands);
    }

    @NotNull
    public final String getMCommands() {
        return this.mCommands;
    }

    @Override // com.amazon.alexa.apl.payload.APLPayload
    @NotNull
    public String getMPresentationToken() {
        return this.mPresentationToken;
    }

    public int hashCode() {
        return this.mCommands.hashCode() + (this.mPresentationToken.hashCode() * 31);
    }

    @Override // com.amazon.alexa.apl.payload.APLPayload
    @NotNull
    public JSONObject toJson() throws JSONException {
        JSONObject put = super.toJson().put(FIELD_COMMANDS, this.mCommands);
        put.getClass();
        return put;
    }

    @Override // com.amazon.alexa.apl.payload.APLPayload
    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("ExecuteCommandPayload(mPresentationToken=", this.mPresentationToken, ", mCommands=", this.mCommands, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/apl/payload/ExecuteCommandPayload$Companion;", "", "()V", "FIELD_COMMANDS", "", "fromJson", "Lcom/amazon/alexa/apl/payload/ExecuteCommandPayload;", "payload", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ExecuteCommandPayload fromJson(@NotNull String payload) throws JSONException {
            payload.getClass();
            JSONObject jSONObject = new JSONObject(payload);
            String optString = jSONObject.optString("presentationToken", "");
            String optString2 = jSONObject.optString(ExecuteCommandPayload.FIELD_COMMANDS, "");
            optString.getClass();
            optString2.getClass();
            return new ExecuteCommandPayload(optString, optString2);
        }

        private Companion() {
        }
    }
}
