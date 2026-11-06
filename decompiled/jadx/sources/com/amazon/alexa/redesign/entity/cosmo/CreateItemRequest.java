package com.amazon.alexa.redesign.entity.cosmo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/redesign/entity/cosmo/CreateItemRequest;", "", "type", "", "payload", "Lcom/amazon/alexa/redesign/entity/cosmo/CreateItemPayload;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/redesign/entity/cosmo/CreateItemPayload;)V", "getType", "()Ljava/lang/String;", "getPayload", "()Lcom/amazon/alexa/redesign/entity/cosmo/CreateItemPayload;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class CreateItemRequest {
    public static final int $stable = 0;

    @NotNull
    private final CreateItemPayload payload;

    @NotNull
    private final String type;

    public CreateItemRequest(@NotNull String str, @NotNull CreateItemPayload createItemPayload) {
        str.getClass();
        createItemPayload.getClass();
        this.type = str;
        this.payload = createItemPayload;
    }

    public static /* synthetic */ CreateItemRequest copy$default(CreateItemRequest createItemRequest, String str, CreateItemPayload createItemPayload, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createItemRequest.type;
        }
        if ((i & 2) != 0) {
            createItemPayload = createItemRequest.payload;
        }
        return createItemRequest.copy(str, createItemPayload);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CreateItemPayload getPayload() {
        return this.payload;
    }

    @NotNull
    public final CreateItemRequest copy(@NotNull String type, @NotNull CreateItemPayload payload) {
        type.getClass();
        payload.getClass();
        return new CreateItemRequest(type, payload);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateItemRequest)) {
            return false;
        }
        CreateItemRequest createItemRequest = (CreateItemRequest) other;
        return Intrinsics.areEqual(this.type, createItemRequest.type) && Intrinsics.areEqual(this.payload, createItemRequest.payload);
    }

    @NotNull
    public final CreateItemPayload getPayload() {
        return this.payload;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.payload.hashCode() + (this.type.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "CreateItemRequest(type=" + this.type + ", payload=" + this.payload + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
