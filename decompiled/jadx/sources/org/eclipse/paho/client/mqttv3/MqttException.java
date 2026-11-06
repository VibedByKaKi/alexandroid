package org.eclipse.paho.client.mqttv3;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import org.eclipse.paho.client.mqttv3.internal.MessageCatalog;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class MqttException extends Exception {
    public static final short REASON_CODE_BROKER_UNAVAILABLE = 3;
    public static final short REASON_CODE_CLIENT_ALREADY_DISCONNECTED = 32101;
    public static final short REASON_CODE_CLIENT_CLOSED = 32111;
    public static final short REASON_CODE_CLIENT_CONNECTED = 32100;
    public static final short REASON_CODE_CLIENT_DISCONNECTING = 32102;
    public static final short REASON_CODE_CLIENT_DISCONNECT_PROHIBITED = 32107;
    public static final short REASON_CODE_CLIENT_EXCEPTION = 0;
    public static final short REASON_CODE_CLIENT_NOT_CONNECTED = 32104;
    public static final short REASON_CODE_CLIENT_TIMEOUT = 32000;
    public static final short REASON_CODE_CONNECTION_LOST = 32109;
    public static final short REASON_CODE_CONNECT_IN_PROGRESS = 32110;
    public static final short REASON_CODE_DISCONNECTED_BUFFER_FULL = 32203;
    public static final short REASON_CODE_FAILED_AUTHENTICATION = 4;
    public static final short REASON_CODE_INVALID_CLIENT_ID = 2;
    public static final short REASON_CODE_INVALID_MESSAGE = 32108;
    public static final short REASON_CODE_INVALID_PROTOCOL_VERSION = 1;
    public static final short REASON_CODE_MAX_INFLIGHT = 32202;
    public static final short REASON_CODE_NOT_AUTHORIZED = 5;
    public static final short REASON_CODE_NO_MESSAGE_IDS_AVAILABLE = 32001;
    public static final short REASON_CODE_SERVER_CONNECT_ERROR = 32103;
    public static final short REASON_CODE_SOCKET_FACTORY_MISMATCH = 32105;
    public static final short REASON_CODE_SSL_CONFIG_ERROR = 32106;
    public static final short REASON_CODE_SUBSCRIBE_FAILED = 128;
    public static final short REASON_CODE_TOKEN_INUSE = 32201;
    public static final short REASON_CODE_UNEXPECTED_ERROR = 6;
    public static final short REASON_CODE_WRITE_TIMEOUT = 32002;
    private static final long serialVersionUID = 300;
    private Throwable cause;
    private int reasonCode;

    public MqttException(Throwable th) {
        this.reasonCode = 0;
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return MessageCatalog.getMessage(this.reasonCode);
    }

    public int getReasonCode() {
        return this.reasonCode;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder(String.valueOf(getMessage()));
        sb.append(" (");
        String m = a$$ExternalSyntheticOutline0.m(sb, this.reasonCode, MarkdownConstants.RIGHT_PARENTHESIS);
        if (this.cause == null) {
            return m;
        }
        StringBuilder m3869m = BitVector$$ExternalSyntheticOutline0.m3869m(m, " - ");
        m3869m.append(this.cause.toString());
        return m3869m.toString();
    }

    public MqttException(int i) {
        this.reasonCode = i;
    }

    public MqttException(int i, Throwable th) {
        this.reasonCode = i;
        this.cause = th;
    }
}
