package com.amazon.bluefront.api.v2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DialogHint {
    private String mDialogAct;
    private String mDialogState;

    public DialogHint(String str, String str2) {
        this.mDialogState = str;
        this.mDialogAct = str2;
    }

    public String getAct() {
        return this.mDialogAct;
    }

    public String getState() {
        return this.mDialogState;
    }

    public void setAct(String str) {
        this.mDialogAct = str;
    }

    public void setState(String str) {
        this.mDialogState = str;
    }

    public DialogHint() {
    }
}
