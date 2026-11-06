package com.amazonaws.auth;

import com.amazonaws.Request;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface Presigner {
    void presignRequest(Request<?> request, AWSCredentials aWSCredentials, Date date);
}
