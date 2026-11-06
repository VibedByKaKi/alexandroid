package com.amazon.alexa.assistant.foundation.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.data.fragments.Content;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/PrivateContainerInteraction;", "", Content.SCHEMA, "", "version", "fragmentURI", "payload", "Lorg/json/JSONObject;", "timestamp", "Ljava/time/Instant;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/time/Instant;)V", "getSchema", "()Ljava/lang/String;", "getVersion", "getFragmentURI", "getPayload", "()Lorg/json/JSONObject;", "getTimestamp", "()Ljava/time/Instant;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PrivateContainerInteraction {

    @NotNull
    private final String fragmentURI;

    @NotNull
    private final JSONObject payload;

    @NotNull
    private final String schema;

    @NotNull
    private final Instant timestamp;

    @NotNull
    private final String version;

    public PrivateContainerInteraction(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull JSONObject jSONObject, @NotNull Instant instant) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        jSONObject.getClass();
        instant.getClass();
        this.schema = str;
        this.version = str2;
        this.fragmentURI = str3;
        this.payload = jSONObject;
        this.timestamp = instant;
    }

    public static /* synthetic */ PrivateContainerInteraction copy$default(PrivateContainerInteraction privateContainerInteraction, String str, String str2, String str3, JSONObject jSONObject, Instant instant, int i, Object obj) {
        if ((i & 1) != 0) {
            str = privateContainerInteraction.schema;
        }
        if ((i & 2) != 0) {
            str2 = privateContainerInteraction.version;
        }
        if ((i & 4) != 0) {
            str3 = privateContainerInteraction.fragmentURI;
        }
        if ((i & 8) != 0) {
            jSONObject = privateContainerInteraction.payload;
        }
        if ((i & 16) != 0) {
            instant = privateContainerInteraction.timestamp;
        }
        Instant instant2 = instant;
        String str4 = str3;
        return privateContainerInteraction.copy(str, str2, str4, jSONObject, instant2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSchema() {
        return this.schema;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getFragmentURI() {
        return this.fragmentURI;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final JSONObject getPayload() {
        return this.payload;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final Instant getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final PrivateContainerInteraction copy(@NotNull String schema, @NotNull String version, @NotNull String fragmentURI, @NotNull JSONObject payload, @NotNull Instant timestamp) {
        schema.getClass();
        version.getClass();
        fragmentURI.getClass();
        payload.getClass();
        timestamp.getClass();
        return new PrivateContainerInteraction(schema, version, fragmentURI, payload, timestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrivateContainerInteraction)) {
            return false;
        }
        PrivateContainerInteraction privateContainerInteraction = (PrivateContainerInteraction) other;
        return Intrinsics.areEqual(this.schema, privateContainerInteraction.schema) && Intrinsics.areEqual(this.version, privateContainerInteraction.version) && Intrinsics.areEqual(this.fragmentURI, privateContainerInteraction.fragmentURI) && Intrinsics.areEqual(this.payload, privateContainerInteraction.payload) && Intrinsics.areEqual(this.timestamp, privateContainerInteraction.timestamp);
    }

    @NotNull
    public final String getFragmentURI() {
        return this.fragmentURI;
    }

    @NotNull
    public final JSONObject getPayload() {
        return this.payload;
    }

    @NotNull
    public final String getSchema() {
        return this.schema;
    }

    @NotNull
    public final Instant getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.timestamp.hashCode() + ((this.payload.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(this.schema.hashCode() * 31, 31, this.version), 31, this.fragmentURI)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.schema;
        String str2 = this.version;
        String str3 = this.fragmentURI;
        JSONObject jSONObject = this.payload;
        Instant instant = this.timestamp;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("PrivateContainerInteraction(schema=", str, ", version=", str2, ", fragmentURI=");
        m.append(str3);
        m.append(", payload=");
        m.append(jSONObject);
        m.append(", timestamp=");
        m.append(instant);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }
}
