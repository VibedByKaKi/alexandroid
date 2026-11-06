package com.amazon.alexa.ra.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.fragments.FragmentDataOperation;
import com.amazon.alexa.ra.core.data.utils.JsonUtilsKt;
import com.amazon.alexa.ra.sdk.capability.ConversationCapability;
import com.amazon.alexa.ra.sdk.capability.UpdateFragmentDataPayload;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013BE\u0012<\u0010\u0002\u001a8\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016RD\u0010\u0002\u001a8\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/ra/sdk/UpdateFragmentDataReceiver;", "Landroid/content/BroadcastReceiver;", "onUpdateFragmentData", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", ConversationCapability.INTENT_EXTRA_FRAGMENT_URI, "", "Lcom/amazon/alexa/ra/core/data/fragments/FragmentDataOperation;", "operations", "", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "onReceive", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUpdateFragmentDataReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdateFragmentDataReceiver.kt\ncom/amazon/alexa/ra/sdk/UpdateFragmentDataReceiver\n+ 2 JsonUtils.kt\ncom/amazon/alexa/ra/core/data/utils/JsonUtilsKt\n*L\n1#1,48:1\n105#2:49\n*S KotlinDebug\n*F\n+ 1 UpdateFragmentDataReceiver.kt\ncom/amazon/alexa/ra/sdk/UpdateFragmentDataReceiver\n*L\n36#1:49\n*E\n"})
/* loaded from: classes19.dex */
public final class UpdateFragmentDataReceiver extends BroadcastReceiver {
    public static final int $stable = 0;

    @NotNull
    private static final String TAG = "UpdateFragmentDataReceiver";

    @NotNull
    private final Function2<String, List<FragmentDataOperation>, Unit> onUpdateFragmentData;

    /* JADX WARN: Multi-variable type inference failed */
    public UpdateFragmentDataReceiver(@NotNull Function2<? super String, ? super List<FragmentDataOperation>, Unit> function2) {
        function2.getClass();
        this.onUpdateFragmentData = function2;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        String stringExtra = intent != null ? intent.getStringExtra(ConversationCapability.INTENT_EXTRA_PAYLOAD_JSON) : null;
        if (stringExtra == null) {
            return;
        }
        try {
            UpdateFragmentDataPayload updateFragmentDataPayload = (UpdateFragmentDataPayload) JsonUtilsKt.toObject(stringExtra, UpdateFragmentDataPayload.class);
            this.onUpdateFragmentData.invoke(updateFragmentDataPayload.getFragmentUri(), updateFragmentDataPayload.getOperations());
        } catch (Exception e) {
            Log.w(TAG, "UpdateFragmentData: failed to deserialize payload", e);
        }
    }
}
