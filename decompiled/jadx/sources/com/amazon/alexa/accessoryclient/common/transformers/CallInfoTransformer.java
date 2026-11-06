package com.amazon.alexa.accessoryclient.common.transformers;

import android.os.Bundle;
import com.amazon.alexa.accessory.repositories.nonhfpcalling.CallInfo;
import java.io.Serializable;
import java.util.UUID;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/transformers/CallInfoTransformer;", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "Lcom/amazon/alexa/accessory/repositories/nonhfpcalling/CallInfo;", "()V", "CALL_DIRECTION_KEY", "", "CALL_STATE_KEY", "CONNECTION_TIMESTAMP_IN_MS_KEY", "DISPLAY_NAME_KEY", "LAST_UPDATE_TIMESTAMP_IN_MS_KEY", "PHONE_NUMBER_KEY", "UUID_KEY", "fromBundle", "bundle", "Landroid/os/Bundle;", "toBundle", "t", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class CallInfoTransformer implements BundleTransformer<CallInfo> {

    @NotNull
    private static final String CALL_DIRECTION_KEY = "callDirection";

    @NotNull
    private static final String CALL_STATE_KEY = "callState";

    @NotNull
    private static final String CONNECTION_TIMESTAMP_IN_MS_KEY = "connectionTimeInMs";

    @NotNull
    private static final String DISPLAY_NAME_KEY = "displayName";

    @NotNull
    public static final CallInfoTransformer INSTANCE = new CallInfoTransformer();

    @NotNull
    private static final String LAST_UPDATE_TIMESTAMP_IN_MS_KEY = "lastUpdateTimestampInMs";

    @NotNull
    private static final String PHONE_NUMBER_KEY = "phoneNumber";

    @NotNull
    private static final String UUID_KEY = "uuid";

    private CallInfoTransformer() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    public CallInfo fromBundle(@NotNull Bundle bundle) {
        bundle.getClass();
        CallInfo.Builder builder = new CallInfo.Builder();
        Serializable serializable = bundle.getSerializable("uuid");
        serializable.getClass();
        CallInfo.Builder displayName = builder.setUuid((UUID) serializable).setPhoneNumber(bundle.getString("phoneNumber")).setDisplayName(bundle.getString("displayName"));
        Serializable serializable2 = bundle.getSerializable(CALL_DIRECTION_KEY);
        serializable2.getClass();
        CallInfo.Builder callDirection = displayName.setCallDirection((CallInfo.CallDirection) serializable2);
        Serializable serializable3 = bundle.getSerializable("callState");
        serializable3.getClass();
        CallInfo build = callDirection.setCallState((CallInfo.CallState) serializable3).setConnectionTimestampInMs(bundle.getLong(CONNECTION_TIMESTAMP_IN_MS_KEY)).setLastUpdateTimeStampInMs(bundle.getLong(LAST_UPDATE_TIMESTAMP_IN_MS_KEY)).build();
        build.getClass();
        return build;
    }

    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    public Bundle toBundle(@NotNull CallInfo t) {
        t.getClass();
        Bundle bundle = new Bundle();
        bundle.putSerializable("uuid", t.getUuid());
        bundle.putString("phoneNumber", t.getPhoneNumber());
        bundle.putString("displayName", t.getDisplayName());
        bundle.putSerializable(CALL_DIRECTION_KEY, t.getCallDirection());
        bundle.putSerializable("callState", t.getCallState());
        bundle.putLong(CONNECTION_TIMESTAMP_IN_MS_KEY, t.getConnectionTimestampInMs());
        bundle.putLong(LAST_UPDATE_TIMESTAMP_IN_MS_KEY, t.getLastUpdateTimestampInMs());
        return bundle;
    }
}
