package com.amazon.alexa.assistant.ui.conversation.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.fragments.FragmentMetaData;
import com.amazon.alexa.ra.sdk.capability.ConversationCapability;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/model/PrivateContentConfiguration;", "", "data", "Lorg/json/JSONObject;", ConversationCapability.INTENT_EXTRA_FRAGMENT_URI, "", FragmentMetaData.REVISION, "", FragmentMetaData.PENDING_UPDATE, "", "<init>", "(Lorg/json/JSONObject;Ljava/lang/String;IZ)V", "getData", "()Lorg/json/JSONObject;", "getFragmentUri", "()Ljava/lang/String;", "getRevision", "()I", "getPendingUpdate", "()Z", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PrivateContentConfiguration {
    public static final int $stable = 8;

    @NotNull
    private final JSONObject data;

    @NotNull
    private final String fragmentUri;
    private final boolean pendingUpdate;
    private final int revision;

    public PrivateContentConfiguration(@NotNull JSONObject jSONObject, @NotNull String str, int i, boolean z) {
        jSONObject.getClass();
        str.getClass();
        this.data = jSONObject;
        this.fragmentUri = str;
        this.revision = i;
        this.pendingUpdate = z;
    }

    @NotNull
    public final JSONObject getData() {
        return this.data;
    }

    @NotNull
    public final String getFragmentUri() {
        return this.fragmentUri;
    }

    public final boolean getPendingUpdate() {
        return this.pendingUpdate;
    }

    public final int getRevision() {
        return this.revision;
    }
}
