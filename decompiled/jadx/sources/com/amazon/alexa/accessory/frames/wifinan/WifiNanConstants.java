package com.amazon.alexa.accessory.frames.wifinan;

import com.amazon.deecomms.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/accessory/frames/wifinan/WifiNanConstants;", "", "<init>", "()V", "NAN_SERVICE_NAME_SUFFIX", "", "buildServiceName", Constants.BUNDLE_SERIAL_NUMBER, "NAN_ATTACH_TIMEOUT_SECONDS", "", "NAN_DISCOVERY_TIMEOUT_SECONDS", "NAN_DATA_PATH_TIMEOUT_SECONDS", "NAN_HTTP_PORT", "NAN_NDP_PASSPHRASE", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WifiNanConstants {

    @NotNull
    public static final WifiNanConstants INSTANCE = new WifiNanConstants();
    public static final long NAN_ATTACH_TIMEOUT_SECONDS = 15;
    public static final long NAN_DATA_PATH_TIMEOUT_SECONDS = 20;
    public static final long NAN_DISCOVERY_TIMEOUT_SECONDS = 20;

    @NotNull
    public static final String NAN_HTTP_PORT = "8080";

    @NotNull
    public static final String NAN_NDP_PASSPHRASE = "12345678";

    @NotNull
    public static final String NAN_SERVICE_NAME_SUFFIX = "_bulk-transport._tcp";

    private WifiNanConstants() {
    }

    @JvmStatic
    @NotNull
    public static final String buildServiceName(@NotNull String serialNumber) {
        serialNumber.getClass();
        return serialNumber + NAN_SERVICE_NAME_SUFFIX;
    }
}
