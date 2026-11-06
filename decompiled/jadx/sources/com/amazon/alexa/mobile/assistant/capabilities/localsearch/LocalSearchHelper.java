package com.amazon.alexa.mobile.assistant.capabilities.localsearch;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/capabilities/localsearch/LocalSearchHelper;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "launchUnifiedSearch", "", "query", "", "searchChannel", "Companion", "capabilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class LocalSearchHelper {

    @NotNull
    private static final String EXTRA_SEARCH_INTENT_CHANNEL = "channel";

    @NotNull
    private static final String EXTRA_SEARCH_INTENT_QUERY = "query";

    @NotNull
    private static final String SEARCH_INTENT_ACTION = "com.amazon.kindle.unifiedSearch.action.VOICE_SEARCH";

    @NotNull
    private static final String TAG = "LocalSearchHelper";

    @NotNull
    private final Context context;

    public LocalSearchHelper(@NotNull Context context) {
        context.getClass();
        this.context = context;
    }

    public final void launchUnifiedSearch(@NotNull String query, @NotNull String searchChannel) {
        query.getClass();
        searchChannel.getClass();
        Intent intent = new Intent();
        intent.setFlags(268435456);
        intent.setAction(SEARCH_INTENT_ACTION);
        intent.putExtra("query", query);
        intent.putExtra("channel", searchChannel);
        this.context.startActivity(intent);
    }
}
