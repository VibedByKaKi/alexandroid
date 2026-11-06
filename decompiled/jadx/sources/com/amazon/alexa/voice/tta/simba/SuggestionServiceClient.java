package com.amazon.alexa.voice.tta.simba;

import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;
import android.util.Log;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.TextResponseMetadataBundleKeys;
import com.amazon.deecomms.common.Constants;
import com.google.android.gms.actions.SearchIntents;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/amazon/alexa/voice/tta/simba/SuggestionServiceClient;", "", "<init>", "()V", "Companion", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class SuggestionServiceClient {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJT\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000bJ&\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u001e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rJ\u0018\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001aH\u0002¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/voice/tta/simba/SuggestionServiceClient$Companion;", "", "<init>", "()V", "fetchSuggestions", "", "context", "Landroid/content/Context;", Constants.BUNDLE_RECEIVER_TAG, "Landroid/os/ResultReceiver;", SearchIntents.EXTRA_QUERY, "", "locale", "Ljava/util/Locale;", "fetchSearchResults", "wasAvsResponseEmpty", "", "avsResponseToken", TextResponseMetadataBundleKeys.PROMPT_ID, "variant", "namespace", "updateInteraction", "resultId", "fetchFricativePrompts", "startSimbaSearchService", "intent", "Landroid/content/Intent;", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void startSimbaSearchService(Context context, Intent intent) {
            try {
                intent.setAction("amazon.intent.action.SIMBA_SEARCH");
                intent.setPackage(context.getPackageName());
                context.getPackageName();
                context.startService(intent);
            } catch (Exception e) {
                Log.e("SuggestionServiceClient", "Error starting service for intent amazon.intent.action.SIMBA_SEARCH", e);
            }
        }

        public final void fetchFricativePrompts(@NotNull Context context, @NotNull ResultReceiver receiver, @NotNull Locale locale) {
            context.getClass();
            receiver.getClass();
            locale.getClass();
            Intent intent = new Intent();
            intent.putExtra("android.intent.extra.RESULT_RECEIVER", receiver);
            intent.putExtra("simba_action", 4);
            intent.putExtra("requested_locale", locale);
            startSimbaSearchService(context, intent);
        }

        public final void fetchSearchResults(@NotNull Context context, @NotNull ResultReceiver receiver, @NotNull String query, @NotNull Locale locale, boolean wasAvsResponseEmpty, @NotNull String avsResponseToken, @Nullable String promptId, @Nullable String variant, @Nullable String namespace) {
            context.getClass();
            receiver.getClass();
            query.getClass();
            locale.getClass();
            avsResponseToken.getClass();
            Intent intent = new Intent();
            intent.putExtra("android.intent.extra.RESULT_RECEIVER", receiver);
            intent.putExtra("simba_action", 2);
            intent.putExtra("requested_locale", locale);
            intent.putExtra("search_query", query);
            intent.putExtra("avs_response_empty", wasAvsResponseEmpty);
            intent.putExtra("avs_response_token", avsResponseToken);
            intent.putExtra("avs_prompt_id", promptId);
            intent.putExtra("avs_variant_id", variant);
            intent.putExtra("avs_namespace", namespace);
            startSimbaSearchService(context, intent);
        }

        public final void fetchSuggestions(@NotNull Context context, @NotNull ResultReceiver receiver, @NotNull String query, @NotNull Locale locale) {
            context.getClass();
            receiver.getClass();
            query.getClass();
            locale.getClass();
            Intent intent = new Intent();
            context.getPackageName();
            intent.putExtra("android.intent.extra.RESULT_RECEIVER", receiver);
            intent.putExtra("simba_action", 1);
            intent.putExtra("requested_locale", locale);
            intent.putExtra("suggestion_query", query);
            startSimbaSearchService(context, intent);
        }

        public final void updateInteraction(@NotNull Context context, @NotNull ResultReceiver receiver, @NotNull String resultId, @NotNull Locale locale) {
            context.getClass();
            receiver.getClass();
            resultId.getClass();
            locale.getClass();
            Intent intent = new Intent();
            intent.putExtra("android.intent.extra.RESULT_RECEIVER", receiver);
            intent.putExtra("simba_action", 3);
            intent.putExtra("selected_id", resultId);
            intent.putExtra("requested_locale", locale);
            startSimbaSearchService(context, intent);
        }

        private Companion() {
        }
    }
}
