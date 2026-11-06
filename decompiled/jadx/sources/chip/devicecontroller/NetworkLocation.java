package chip.devicecontroller;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class NetworkLocation {
    private final int interfaceIndex;
    private final String ipAddress;
    private final int port;

    public NetworkLocation(String str, int i, int i2) {
        this.ipAddress = str;
        this.port = i;
        this.interfaceIndex = i2;
    }

    public final int getInterfaceIndex() {
        return this.interfaceIndex;
    }

    public final String getIpAddress() {
        return this.ipAddress;
    }

    public final int getPort() {
        return this.port;
    }

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        String str2 = this.ipAddress;
        if (this.interfaceIndex == 0) {
            str = "";
        } else {
            str = "%" + this.interfaceIndex;
        }
        return str2 + str + MarkdownConstants.LEFT_BRACKET + this.port + MarkdownConstants.RIGHT_BRACKET;
    }
}
