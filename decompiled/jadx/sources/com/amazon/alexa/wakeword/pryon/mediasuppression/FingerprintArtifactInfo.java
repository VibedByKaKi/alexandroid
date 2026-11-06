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
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0004X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/wakeword/pryon/mediasuppression/FingerprintArtifactInfo;", "Lcom/amazon/alexa/wakeword/davs/ArtifactInfo;", "()V", "davsFilters", "", "", "", "getDavsFilters", "()Ljava/util/Map;", "Companion", "AVSAndroidClient-pryonprovider_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class FingerprintArtifactInfo extends ArtifactInfo {

    @NotNull
    private static final String ARTIFACT_KEY = "alexa";

    @NotNull
    private static final String ARTIFACT_TYPE = "fingerprint";

    @NotNull
    private static final String FILTER_KEY_DB_SIZE_CLASS = "dbSizeClass";

    @NotNull
    private static final String FILTER_KEY_ENGINE_COMPATIBILITY_ID_LIST = "engineCompatibilityIdList";

    @NotNull
    private static final String FILTER_KEY_WAKEWORD_LOCALE_LIST = "locale";

    @NotNull
    private final Map<String, List<String>> davsFilters;

    @NotNull
    private static final List<String> WAKEWORD_LOCALE_LIST = CollectionsKt.listOf("en-US");

    @NotNull
    private static final List<String> ENGINE_COMPATIBILITY_ID_LIST = CollectionsKt.listOf("3");

    @NotNull
    private static final List<String> DB_SIZE_CLASS = CollectionsKt.listOf("M");

    public FingerprintArtifactInfo() {
        super(ARTIFACT_TYPE, "alexa");
        this.davsFilters = MapsKt.mapOf(TuplesKt.to(FILTER_KEY_ENGINE_COMPATIBILITY_ID_LIST, ENGINE_COMPATIBILITY_ID_LIST), TuplesKt.to("locale", WAKEWORD_LOCALE_LIST), TuplesKt.to(FILTER_KEY_DB_SIZE_CLASS, DB_SIZE_CLASS));
    }

    @Override // com.amazon.alexa.wakeword.davs.ArtifactInfo
    @NotNull
    public Map<String, List<String>> getDavsFilters() {
        return this.davsFilters;
    }
}
