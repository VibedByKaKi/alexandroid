package com.amazon.dee.app.services.internetsharing;

import com.amazon.deecomms.common.Constants;
import io.ktor.client.utils.CacheControl;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/amazon/dee/app/services/internetsharing/InternetSharingConstants;", "", "<init>", "()V", "NAN_SERVICE_NAME_SUFFIX", "", "NAN_ATTACH_TIMEOUT_SECONDS", "", "NAN_DISCOVERY_TIMEOUT_SECONDS", "NAN_DATA_PATH_TIMEOUT_SECONDS", "SOCKS5_PROXY_PORT", "", "DEVICE_HANDSHAKE_PORT", "UPSTREAM_CONNECT_TIMEOUT_MILLIS", "NOTIFICATION_CHANNEL_ID", "FOREGROUND_SERVICE_ID", "buildNanServiceName", Constants.BUNDLE_SERIAL_NUMBER, "TransportType", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InternetSharingConstants {
    public static final int DEVICE_HANDSHAKE_PORT = 8888;
    public static final int FOREGROUND_SERVICE_ID = 9001;

    @NotNull
    public static final InternetSharingConstants INSTANCE = new InternetSharingConstants();
    public static final long NAN_ATTACH_TIMEOUT_SECONDS = 15;
    public static final long NAN_DATA_PATH_TIMEOUT_SECONDS = 30;
    public static final long NAN_DISCOVERY_TIMEOUT_SECONDS = 600;

    @NotNull
    public static final String NAN_SERVICE_NAME_SUFFIX = "_internet-sharing._tcp";

    @NotNull
    public static final String NOTIFICATION_CHANNEL_ID = "internet_sharing_channel";
    public static final int SOCKS5_PROXY_PORT = 7777;
    public static final int UPSTREAM_CONNECT_TIMEOUT_MILLIS = 10000;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/dee/app/services/internetsharing/InternetSharingConstants$TransportType;", "", "<init>", "(Ljava/lang/String;I)V", "NAN", "P2P", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TransportType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TransportType[] $VALUES;
        public static final TransportType NAN = new TransportType("NAN", 0);
        public static final TransportType P2P = new TransportType("P2P", 1);

        private static final /* synthetic */ TransportType[] $values() {
            return new TransportType[]{NAN, P2P};
        }

        static {
            TransportType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private TransportType(String str, int i) {
        }

        @NotNull
        public static EnumEntries<TransportType> getEntries() {
            return $ENTRIES;
        }

        public static TransportType valueOf(String str) {
            return (TransportType) Enum.valueOf(TransportType.class, str);
        }

        public static TransportType[] values() {
            return (TransportType[]) $VALUES.clone();
        }
    }

    private InternetSharingConstants() {
    }

    @JvmStatic
    @NotNull
    public static final String buildNanServiceName(@NotNull String serialNumber) {
        serialNumber.getClass();
        return serialNumber + NAN_SERVICE_NAME_SUFFIX;
    }
}
