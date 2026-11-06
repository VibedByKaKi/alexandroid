package com.amazon.alexa.ra.features.personality;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.chrome.model.PersonalityId;
import com.amazon.alexa.ra.sdk.capability.PersonalityCapability;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014BA\u00128\u0010\u0002\u001a4\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016RC\u0010\u0002\u001a4\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/ra/features/personality/PersonalityReceiver;", "Landroid/content/BroadcastReceiver;", "onPersonalityUpdated", "Lkotlin/Function2;", "Lcom/amazon/alexa/ra/chrome/model/PersonalityId;", "Lkotlin/ParameterName;", "name", PersonalityCapability.PERSONALITY_ID_KEY, "", "dialogRequestId", "", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "getOnPersonalityUpdated", "()Lkotlin/jvm/functions/Function2;", "onReceive", "context", "Landroid/content/Context;", "receivedIntent", "Landroid/content/Intent;", "Companion", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class PersonalityReceiver extends BroadcastReceiver {
    public static final int $stable = 0;

    @NotNull
    public static final String TAG = "PersonalityReceiver";

    @NotNull
    private final Function2<PersonalityId, String, Unit> onPersonalityUpdated;

    /* JADX WARN: Multi-variable type inference failed */
    public PersonalityReceiver(@NotNull Function2<? super PersonalityId, ? super String, Unit> function2) {
        function2.getClass();
        this.onPersonalityUpdated = function2;
    }

    @NotNull
    public final Function2<PersonalityId, String, Unit> getOnPersonalityUpdated() {
        return this.onPersonalityUpdated;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent receivedIntent) {
        if (receivedIntent == null) {
            Log.e(TAG, "Null intent");
            return;
        }
        receivedIntent.getAction();
        String action = receivedIntent.getAction();
        if (action == null || action.hashCode() != 794094460 || !action.equals(PersonalityCapability.PERSONALITY_UPDATED_INTENT)) {
            Log.e(TAG, "Unknown action: " + receivedIntent.getAction());
            return;
        }
        String stringExtra = receivedIntent.getStringExtra(PersonalityCapability.PERSONALITY_ID_KEY);
        if (stringExtra == null) {
            stringExtra = "";
        }
        try {
            PersonalityId valueOf = PersonalityId.valueOf(stringExtra);
            this.onPersonalityUpdated.invoke(valueOf, receivedIntent.getStringExtra("dialogRequestId"));
        } catch (IllegalArgumentException unused) {
            Log.e(TAG, "Unknown personality id: ".concat(stringExtra));
        }
    }
}
