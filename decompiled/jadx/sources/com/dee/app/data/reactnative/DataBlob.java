package com.dee.app.data.reactnative;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DataBlob {

    @Nullable
    public final String contentType;

    @Nullable
    public final String text;

    public DataBlob(String str, String str2) {
        this.text = str;
        this.contentType = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataBlob dataBlob = (DataBlob) obj;
        String str = this.text;
        String str2 = dataBlob.text;
        if (str == null ? str2 != null : !str.equals(str2)) {
            return false;
        }
        String str3 = this.contentType;
        String str4 = dataBlob.contentType;
        return str3 == null ? str4 == null : str3.equals(str4);
    }

    public int hashCode() {
        String str = this.text;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.contentType;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
