package org.apache.commons.net.pop3;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class POP3MessageInfo {
    public String identifier;
    public int number;
    public int size;

    private POP3MessageInfo(int i, String str, int i2) {
        this.number = i;
        this.size = i2;
        this.identifier = str;
    }

    public String toString() {
        return "Number: " + this.number + ". Size: " + this.size + ". Id: " + this.identifier;
    }

    public POP3MessageInfo(int i, int i2) {
        this(i, null, i2);
    }

    public POP3MessageInfo(int i, String str) {
        this(i, str, -1);
    }

    public POP3MessageInfo() {
        this(0, null, 0);
    }
}
