package com.amazonaws.services.kinesisfirehose.model;

import com.amazonaws.AmazonServiceException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class InvalidKMSResourceException extends AmazonServiceException {
    private static final long serialVersionUID = 1;
    private String code;

    public InvalidKMSResourceException(String str) {
        super(str);
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String str) {
        this.code = str;
    }
}
