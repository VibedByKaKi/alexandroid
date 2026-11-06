package com.amazon.alexa.assistant.capability.externalmediaplayer.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/FavoritesControllerDirective;", "", "payload", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/FavoritesControllerPayload;", "<init>", "(Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/FavoritesControllerPayload;)V", "getPayload", "()Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/FavoritesControllerPayload;", "playerId", "", "getPlayerId", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class FavoritesControllerDirective {

    @NotNull
    private final FavoritesControllerPayload payload;

    public FavoritesControllerDirective(@NotNull FavoritesControllerPayload favoritesControllerPayload) {
        favoritesControllerPayload.getClass();
        this.payload = favoritesControllerPayload;
    }

    public static /* synthetic */ FavoritesControllerDirective copy$default(FavoritesControllerDirective favoritesControllerDirective, FavoritesControllerPayload favoritesControllerPayload, int i, Object obj) {
        if ((i & 1) != 0) {
            favoritesControllerPayload = favoritesControllerDirective.payload;
        }
        return favoritesControllerDirective.copy(favoritesControllerPayload);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final FavoritesControllerPayload getPayload() {
        return this.payload;
    }

    @NotNull
    public final FavoritesControllerDirective copy(@NotNull FavoritesControllerPayload payload) {
        payload.getClass();
        return new FavoritesControllerDirective(payload);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FavoritesControllerDirective) && Intrinsics.areEqual(this.payload, ((FavoritesControllerDirective) other).payload);
    }

    @NotNull
    public final FavoritesControllerPayload getPayload() {
        return this.payload;
    }

    @NotNull
    public final String getPlayerId() {
        return this.payload.getPlayerId();
    }

    public int hashCode() {
        return this.payload.hashCode();
    }

    @NotNull
    public String toString() {
        return "FavoritesControllerDirective(payload=" + this.payload + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
