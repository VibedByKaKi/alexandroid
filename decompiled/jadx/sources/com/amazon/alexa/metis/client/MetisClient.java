package com.amazon.alexa.metis.client;

import com.amazon.alexa.metis.api.ChatData;
import com.amazon.alexa.metis.api.TurnData;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.dee.app.http.CoralService;
import com.google.gson.Gson;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001f\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rJ\u0017\u0010\u000e\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0002\b\u0010J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/metis/client/MetisClient;", "", "gson", "Lcom/google/gson/Gson;", "(Lcom/google/gson/Gson;)V", "getGson", "()Lcom/google/gson/Gson;", "getChatTurns", "Lcom/amazon/alexa/metis/api/TurnData;", "coralService", "Lcom/dee/app/http/CoralService;", "chatId", "", "getChatTurns$AlexaMobileAndroidSimbaClient_release", "getChats", "Lcom/amazon/alexa/metis/api/ChatData;", "getChats$AlexaMobileAndroidSimbaClient_release", "postRequest", "Lokhttp3/Response;", "path", "", "Companion", "AlexaMobileAndroidSimbaClient_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMetisClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MetisClient.kt\ncom/amazon/alexa/metis/client/MetisClient\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
/* loaded from: classes14.dex */
public final class MetisClient {

    @NotNull
    private static final String METIS_BASE_PATH = "https://metis-preview.amazon.com/api";

    @NotNull
    private static final String TAG = "MetisClient";

    @NotNull
    private final Gson gson;

    public MetisClient(@NotNull Gson gson) {
        gson.getClass();
        this.gson = gson;
    }

    private final Response postRequest(CoralService coralService, String path) {
        Response execute = coralService.request(path).withHeader("Content-Type", "application/json").get().asRaw().execute();
        execute.code();
        execute.message();
        execute.peekBody(Long.MAX_VALUE).string();
        return execute;
    }

    @NotNull
    public final TurnData getChatTurns$AlexaMobileAndroidSimbaClient_release(@Nullable CoralService coralService, int chatId) {
        if (coralService == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("CoralService can't be null");
            return null;
        }
        Response postRequest = postRequest(coralService, a$$ExternalSyntheticOutline0.m(chatId, "https://metis-preview.amazon.com/api/chat/(", MarkdownConstants.RIGHT_PARENTHESIS));
        Gson gson = this.gson;
        ResponseBody body = postRequest.body();
        Object fromJson = gson.fromJson(body != null ? body.string() : null, (Class<Object>) TurnData.class);
        fromJson.getClass();
        return (TurnData) fromJson;
    }

    @NotNull
    public final ChatData getChats$AlexaMobileAndroidSimbaClient_release(@Nullable CoralService coralService) {
        if (coralService == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("CoralService can't be null");
            return null;
        }
        Response postRequest = postRequest(coralService, "https://metis-preview.amazon.com/api/chat");
        Gson gson = this.gson;
        ResponseBody body = postRequest.body();
        Object fromJson = gson.fromJson(body != null ? body.string() : null, (Class<Object>) ChatData.class);
        fromJson.getClass();
        return (ChatData) fromJson;
    }

    @NotNull
    public final Gson getGson() {
        return this.gson;
    }
}
