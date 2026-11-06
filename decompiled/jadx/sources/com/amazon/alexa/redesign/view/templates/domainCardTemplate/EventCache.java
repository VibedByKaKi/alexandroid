package com.amazon.alexa.redesign.view.templates.domainCardTemplate;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.viewprovider.api.event.personalization.InteractionEventData;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0007J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0007H\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/redesign/view/templates/domainCardTemplate/EventCache;", "", "<init>", "()V", "uniqueClickEvent", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/amazon/alexa/viewprovider/api/event/personalization/InteractionEventData;", "addClickEvent", "", "interactionEventData", "clearClickEvents", "clickEventExists", "", "getUniqueId", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class EventCache {
    public static final int $stable = 8;

    @NotNull
    private final ConcurrentHashMap<String, InteractionEventData> uniqueClickEvent = new ConcurrentHashMap<>();

    private final String getUniqueId(InteractionEventData interactionEventData) {
        String contentId = interactionEventData.getContentId();
        if (contentId == null) {
            contentId = "";
        }
        String contentType = interactionEventData.getContentType();
        if (contentType == null) {
            contentType = "";
        }
        String contentProvider = interactionEventData.getContentProvider();
        return a$$ExternalSyntheticOutline0.m$1(contentId, contentType, contentProvider != null ? contentProvider : "");
    }

    public final void addClickEvent(@NotNull InteractionEventData interactionEventData) {
        interactionEventData.getClass();
        this.uniqueClickEvent.put(getUniqueId(interactionEventData), interactionEventData);
    }

    public final void clearClickEvents() {
        this.uniqueClickEvent.clear();
    }

    public final boolean clickEventExists(@NotNull InteractionEventData interactionEventData) {
        interactionEventData.getClass();
        return this.uniqueClickEvent.containsKey(getUniqueId(interactionEventData));
    }
}
