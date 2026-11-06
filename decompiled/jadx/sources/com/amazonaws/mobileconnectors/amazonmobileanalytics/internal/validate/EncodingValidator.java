package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.validate;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public class EncodingValidator {
    private final String encoding;

    public EncodingValidator(String str) {
        this.encoding = str;
    }

    public void validate() {
        try {
            "!\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~".getBytes(this.encoding);
        } catch (UnsupportedEncodingException e) {
            OnnxMap$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m(new StringBuilder(), this.encoding, " encoding is not supported"), e);
        }
    }
}
