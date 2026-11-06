package com.facebook.soloader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DoNotStripAny
/* loaded from: classes7.dex */
public class SoLoaderULError extends UnsatisfiedLinkError {
    private String mSoName;

    public SoLoaderULError(String str, String str2) {
        super(str2);
        this.mSoName = str;
    }

    public String getSoName() {
        return this.mSoName;
    }

    public SoLoaderULError(String str) {
        this.mSoName = str;
    }
}
