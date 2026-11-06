package com.amazon.alexa.accessoryclient.common.transformers;

import android.os.Bundle;
import com.amazon.alexa.accessory.repositories.firmware.FirmwareUpdateStatus;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/transformers/FirmwareUpdateStatusTransformer;", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "Lcom/amazon/alexa/accessory/repositories/firmware/FirmwareUpdateStatus;", "()V", "CAUSE_KEY", "", "DEVICE_ID_KEY", "PROGRESS_KEY", "STATE_KEY", "fromBundle", "bundle", "Landroid/os/Bundle;", "toBundle", "firmwareUpdateStatus", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class FirmwareUpdateStatusTransformer implements BundleTransformer<FirmwareUpdateStatus> {

    @NotNull
    private static final String CAUSE_KEY = "cause";

    @NotNull
    private static final String DEVICE_ID_KEY = "deviceId";

    @NotNull
    public static final FirmwareUpdateStatusTransformer INSTANCE = new FirmwareUpdateStatusTransformer();

    @NotNull
    private static final String PROGRESS_KEY = "progress";

    @NotNull
    private static final String STATE_KEY = "state";

    private FirmwareUpdateStatusTransformer() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    public FirmwareUpdateStatus fromBundle(@NotNull Bundle bundle) {
        bundle.getClass();
        int i = bundle.getInt("state");
        String string = bundle.getString(CAUSE_KEY);
        return new FirmwareUpdateStatus(i, string != null ? new RuntimeException(string) : null, bundle.getFloat("progress"), bundle.getInt("deviceId"));
    }

    @Override // com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer
    @NotNull
    public Bundle toBundle(@NotNull FirmwareUpdateStatus firmwareUpdateStatus) {
        firmwareUpdateStatus.getClass();
        Bundle bundle = new Bundle();
        bundle.putInt("state", firmwareUpdateStatus.state);
        Throwable th = firmwareUpdateStatus.cause;
        bundle.putString(CAUSE_KEY, th != null ? th.toString() : null);
        bundle.putFloat("progress", firmwareUpdateStatus.progress);
        bundle.putInt("deviceId", firmwareUpdateStatus.deviceId);
        return bundle;
    }
}
