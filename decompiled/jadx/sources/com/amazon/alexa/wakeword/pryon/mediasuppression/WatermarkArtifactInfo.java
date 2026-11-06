package com.amazon.alexa.wakeword.pryon.mediasuppression;

import com.amazon.alexa.wakeword.davs.ArtifactInfo;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0004X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/wakeword/pryon/mediasuppression/WatermarkArtifactInfo;", "Lcom/amazon/alexa/wakeword/davs/ArtifactInfo;", "()V", "davsFilters", "", "", "", "getDavsFilters", "()Ljava/util/Map;", "Companion", "AVSAndroidClient-pryonprovider_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class WatermarkArtifactInfo extends ArtifactInfo {

    @NotNull
    private static final String ARTIFACT_KEY = "watermark";

    @NotNull
    private static final String ARTIFACT_TYPE = "lowpower-watermark";

    @NotNull
    private static final String FILTER_KEY_ENGINE_COMPATIBILITY_ID_LIST = "engineCompatibilityIdList";

    @NotNull
    private static final String FILTER_KEY_FILTER_VERSION = "filterVersion";

    @NotNull
    private static final String FILTER_KEY_WAKE_WORD = "wakeword";

    @NotNull
    private final Map<String, List<String>> davsFilters;

    @NotNull
    private static final List<String> FILTER_VERSION = CollectionsKt.listOf("1");

    @NotNull
    private static final List<String> ENGINE_COMPATIBILITY_ID_LIST = CollectionsKt.listOf("1");

    @NotNull
    private static final List<String> WAKE_WORD = CollectionsKt.listOf("alexa");

    public WatermarkArtifactInfo() {
        super(ARTIFACT_TYPE, ARTIFACT_KEY);
        this.davsFilters = MapsKt.mapOf(TuplesKt.to(FILTER_KEY_ENGINE_COMPATIBILITY_ID_LIST, ENGINE_COMPATIBILITY_ID_LIST), TuplesKt.to(FILTER_KEY_FILTER_VERSION, FILTER_VERSION), TuplesKt.to(FILTER_KEY_WAKE_WORD, WAKE_WORD));
    }

    @Override // com.amazon.alexa.wakeword.davs.ArtifactInfo
    @NotNull
    public Map<String, List<String>> getDavsFilters() {
        return this.davsFilters;
    }
}
