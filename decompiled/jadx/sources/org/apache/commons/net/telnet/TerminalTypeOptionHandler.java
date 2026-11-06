package org.apache.commons.net.telnet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class TerminalTypeOptionHandler extends TelnetOptionHandler {
    protected static final int TERMINAL_TYPE = 24;
    protected static final int TERMINAL_TYPE_IS = 0;
    protected static final int TERMINAL_TYPE_SEND = 1;
    private final String termType;

    public TerminalTypeOptionHandler(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        super(24, z, z2, z3, z4);
        this.termType = str;
    }

    @Override // org.apache.commons.net.telnet.TelnetOptionHandler
    public int[] answerSubnegotiation(int[] iArr, int i) {
        String str;
        if (iArr == null || i <= 1 || (str = this.termType) == null) {
            return null;
        }
        if (iArr[0] != 24 || iArr[1] != 1) {
            return null;
        }
        int[] iArr2 = new int[str.length() + 2];
        iArr2[0] = 24;
        iArr2[1] = 0;
        for (int i2 = 0; i2 < this.termType.length(); i2++) {
            iArr2[i2 + 2] = this.termType.charAt(i2);
        }
        return iArr2;
    }

    public TerminalTypeOptionHandler(String str) {
        super(24, false, false, false, false);
        this.termType = str;
    }
}
