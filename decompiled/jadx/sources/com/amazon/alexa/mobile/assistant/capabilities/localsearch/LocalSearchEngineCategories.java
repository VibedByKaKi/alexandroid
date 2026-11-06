package com.amazon.alexa.mobile.assistant.capabilities.localsearch;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/capabilities/localsearch/LocalSearchEngineCategories;", "", "<init>", "()V", LocalSearchEngineCategories.APP, "", "VIDEO", LocalSearchEngineCategories.BOOK, "AUDIO_BOOK", "UNKNOWN", LocalSearchEngineCategories.SHOP, "WEB", LocalSearchEngineCategories.MUSIC, "CATEGORY_SEARCH_CHANNEL_MAP", "", "getCATEGORY_SEARCH_CHANNEL_MAP", "()Ljava/util/Map;", "capabilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class LocalSearchEngineCategories {

    @NotNull
    public static final String UNKNOWN = "UNKNOWN";

    @NotNull
    public static final String VIDEO = "VIDEO";

    @NotNull
    public static final String WEB = "WEB";

    @NotNull
    public static final LocalSearchEngineCategories INSTANCE = new LocalSearchEngineCategories();

    @NotNull
    public static final String APP = "APP";

    @NotNull
    public static final String BOOK = "BOOK";

    @NotNull
    public static final String AUDIO_BOOK = "AUDIOBOOK";

    @NotNull
    public static final String SHOP = "SHOP";

    @NotNull
    public static final String MUSIC = "MUSIC";

    @NotNull
    private static final Map<String, String> CATEGORY_SEARCH_CHANNEL_MAP = MapsKt.mapOf(TuplesKt.to(APP, "Apps"), TuplesKt.to("VIDEO", "Video"), TuplesKt.to(BOOK, "Books"), TuplesKt.to(AUDIO_BOOK, "AudioBooks"), TuplesKt.to("UNKNOWN", "Home"), TuplesKt.to(SHOP, "Shop"), TuplesKt.to("WEB", "Web"), TuplesKt.to(MUSIC, "Music"));

    private LocalSearchEngineCategories() {
    }

    @NotNull
    public final Map<String, String> getCATEGORY_SEARCH_CHANNEL_MAP() {
        return CATEGORY_SEARCH_CHANNEL_MAP;
    }
}
