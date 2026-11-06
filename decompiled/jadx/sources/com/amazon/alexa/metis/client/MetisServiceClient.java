package com.amazon.alexa.metis.client;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.deecomms.common.Constants;
import com.dee.app.http.CoralService;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0002J\u0012\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0012H\u0002J \u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0012H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/amazon/alexa/metis/client/MetisServiceClient;", "Landroid/app/IntentService;", "name", "", "(Ljava/lang/String;)V", "coralService", "Lcom/dee/app/http/CoralService;", "metisClient", "Lcom/amazon/alexa/metis/client/MetisClient;", "getMetisClient", "()Lcom/amazon/alexa/metis/client/MetisClient;", "setMetisClient", "(Lcom/amazon/alexa/metis/client/MetisClient;)V", "handleGetChatTurns", "", Constants.BUNDLE_RECEIVER_TAG, "Landroid/os/ResultReceiver;", "chatId", "", "handleGetChats", "initCoralService", "onHandleIntent", "intent", "Landroid/content/Intent;", "onHandleWork", "sendError", "resultCode", "sendResult", "result", "Landroid/os/Bundle;", "AlexaMobileAndroidSimbaClient_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MetisServiceClient extends IntentService {

    @Nullable
    private CoralService coralService;

    @Inject
    public MetisClient metisClient;

    public /* synthetic */ MetisServiceClient(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "MetisServiceClient" : str);
    }

    private final void handleGetChatTurns(ResultReceiver receiver, int chatId) {
        Bundle bundle = new Bundle();
        try {
            bundle.putParcelable("chatsMetisResponse", getMetisClient().getChatTurns$AlexaMobileAndroidSimbaClient_release(this.coralService, chatId));
            sendResult(receiver, bundle, 2);
        } catch (Exception unused) {
            sendError(receiver, 1000);
        }
    }

    private final void handleGetChats(ResultReceiver receiver) {
        Bundle bundle = new Bundle();
        try {
            bundle.putParcelable("chatsMetisResponse", getMetisClient().getChats$AlexaMobileAndroidSimbaClient_release(this.coralService));
            sendResult(receiver, bundle, 2);
        } catch (Exception unused) {
            sendError(receiver, 1001);
        }
    }

    private final void initCoralService() {
        if (this.coralService == null) {
            this.coralService = (CoralService) Automotive$$ExternalSyntheticOutline0.m(CoralService.class);
        }
    }

    private final void sendError(ResultReceiver receiver, int resultCode) {
        Bundle bundle = new Bundle();
        bundle.putString("METIS_ERROR", "METIS_ERROR");
        receiver.send(resultCode, bundle);
    }

    private final void sendResult(ResultReceiver receiver, Bundle result, int resultCode) {
        receiver.send(resultCode, result);
    }

    @NotNull
    public final MetisClient getMetisClient() {
        MetisClient metisClient = this.metisClient;
        if (metisClient != null) {
            return metisClient;
        }
        Intrinsics.throwUninitializedPropertyAccessException("metisClient");
        return null;
    }

    @Override // android.app.IntentService
    public void onHandleIntent(@Nullable Intent intent) {
        if (intent != null) {
            onHandleWork(intent);
        }
    }

    public final void onHandleWork(@NotNull Intent intent) {
        ResultReceiver resultReceiver;
        intent.getClass();
        Log.i("MetisClient", "onHandleWork");
        initCoralService();
        if (this.coralService == null || (resultReceiver = (ResultReceiver) intent.getParcelableExtra("android.intent.extra.RESULT_RECEIVER")) == null) {
            return;
        }
        int intExtra = intent.getIntExtra("metis_action", 0);
        if (intExtra == 1) {
            handleGetChatTurns(resultReceiver, intent.getIntExtra("metis_chat_turn_id", 0));
        } else if (intExtra != 2) {
            ArcMode$$ExternalSyntheticOutline0.m(intExtra, "onHandleWork: Unknown action ", "MetisClient");
        } else {
            handleGetChats(resultReceiver);
        }
    }

    public final void setMetisClient(@NotNull MetisClient metisClient) {
        metisClient.getClass();
        this.metisClient = metisClient;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetisServiceClient(@NotNull String str) {
        super(str);
        str.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MetisServiceClient() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
