package com.amazon.deecomms.accessories;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum ATCommand {
    DIAL("ATD"),
    ANSWER_CALL("ATA"),
    END_CALL("AT+CHUP");

    private final String mCommand;

    ATCommand(String str) {
        this.mCommand = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.mCommand;
    }
}
