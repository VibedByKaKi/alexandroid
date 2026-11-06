package com.amazon.rtvi.mobile.orchestrator;

import android.util.Log;
import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\fJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0006J\u0006\u0010\u0013\u001a\u00020\u0014R*\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/amazon/rtvi/mobile/orchestrator/EnrichmentTracker;", "", "<init>", "()V", "frameMap", "Ljava/util/LinkedHashMap;", "", "Lcom/amazon/rtvi/mobile/orchestrator/FrameAddons;", "Lkotlin/collections/LinkedHashMap;", "recordEnrichments", "frameId", "subframeIds", "", "enrichmentIds", "getFrameAddons", "clearFrame", "", "clearSession", LiveTranslationCapabilityConstants.KEY_SESSION_ID, "trackedFrameCount", "", "Orchestrator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class EnrichmentTracker {

    @NotNull
    private final LinkedHashMap<String, FrameAddons> frameMap = new LinkedHashMap<>();

    public final void clearFrame(@NotNull String frameId) {
        frameId.getClass();
        synchronized (this.frameMap) {
            this.frameMap.remove(frameId);
        }
    }

    public final void clearSession(@NotNull String sessionId) {
        sessionId.getClass();
        synchronized (this.frameMap) {
            int size = this.frameMap.size();
            this.frameMap.clear();
            Log.i("RTVICCS-EnrichmentTracker", "Cleared session " + sessionId + " (" + size + " tracked frames removed)");
        }
    }

    @Nullable
    public final FrameAddons getFrameAddons(@NotNull String frameId) {
        FrameAddons frameAddons;
        frameId.getClass();
        synchronized (this.frameMap) {
            frameAddons = this.frameMap.get(frameId);
        }
        return frameAddons;
    }

    @NotNull
    public final FrameAddons recordEnrichments(@NotNull String frameId, @NotNull List<String> subframeIds, @NotNull List<String> enrichmentIds) {
        FrameAddons frameAddons;
        frameId.getClass();
        subframeIds.getClass();
        enrichmentIds.getClass();
        synchronized (this.frameMap) {
            frameAddons = new FrameAddons(frameId, subframeIds, enrichmentIds);
            this.frameMap.put(frameId, frameAddons);
            subframeIds.size();
            enrichmentIds.size();
        }
        return frameAddons;
    }

    public final int trackedFrameCount() {
        int size;
        synchronized (this.frameMap) {
            size = this.frameMap.size();
        }
        return size;
    }
}
