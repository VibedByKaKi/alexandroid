package com.amazonaws.services.machinelearning.model;

import com.amazonaws.AmazonServiceException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class InvalidInputException extends AmazonServiceException {
    private static final long serialVersionUID = 1;
    private Integer code;

    public InvalidInputException(String str) {
        super(str);
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer num) {
        this.code = num;
    }
}
