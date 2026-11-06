package chip.devicecontroller;

import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class ConnectionFailureException extends ChipDeviceControllerException {
    private ConnectionState connectionState;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ConnectionState {
        UNKNOWN,
        NOT_IN_KEY_EXCHANGE,
        SENT_SIGMA1,
        RECEIVED_SIGMA1,
        SENT_SIGMA2,
        RECEIVED_SIGMA2,
        SENT_SIGMA3,
        RECEIVED_SIGMA3
    }

    public ConnectionFailureException(long j, int i, String str) {
        super(j, str);
        this.connectionState = mapIntToConnectionState(i);
    }

    private ConnectionState mapIntToConnectionState(int i) {
        switch (i) {
            case 0:
                return ConnectionState.UNKNOWN;
            case 1:
                return ConnectionState.NOT_IN_KEY_EXCHANGE;
            case 2:
                return ConnectionState.SENT_SIGMA1;
            case 3:
                return ConnectionState.RECEIVED_SIGMA1;
            case 4:
                return ConnectionState.SENT_SIGMA2;
            case 5:
                return ConnectionState.RECEIVED_SIGMA2;
            case 6:
                return ConnectionState.SENT_SIGMA3;
            case 7:
                return ConnectionState.RECEIVED_SIGMA3;
            default:
                Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Invalid connection state value: "));
                return null;
        }
    }

    public ConnectionState getConnectionState() {
        return this.connectionState;
    }

    public ConnectionFailureException() {
    }
}
