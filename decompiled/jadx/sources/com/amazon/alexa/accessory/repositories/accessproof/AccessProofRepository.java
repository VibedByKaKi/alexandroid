package com.amazon.alexa.accessory.repositories.accessproof;

import com.amazon.alexa.accessory.protocol.Accessproof;
import com.amazon.alexa.accessory.protocol.Common;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface AccessProofRepository {
    Observable<PublishedAccessProof> queryAccessProof();

    Single<Common.ErrorCode> sendAccessProofResult(String str, Accessproof.VerifyAccessProofResult verifyAccessProofResult);
}
