package com.amazonaws.mobileconnectors.kinesis.kinesisrecorder;

import com.amazonaws.util.Base64;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class FileRecordParser {
    private static final String DELIMITER = ",";
    byte[] bytes;
    String streamName;

    public static String asString(String str, byte[] bArr) {
        StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(str, ",");
        m1m.append(Base64.encodeAsString(bArr));
        return m1m.toString();
    }

    public void parse(String str) {
        String[] split = str.split(",", 2);
        if (split.length < 2) {
            Single$$ExternalSyntheticBUOutline0.m$3("Invalid line: ".concat(str));
        } else {
            this.streamName = split[0];
            this.bytes = Base64.decode(split[1]);
        }
    }

    public String toString() {
        return asString(this.streamName, this.bytes);
    }
}
