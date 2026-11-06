package com.amazonaws.mobileconnectors.kinesis.kinesisrecorder;

import com.amazonaws.AmazonClientException;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
interface RecordSender {
    boolean isRecoverable(AmazonClientException amazonClientException);

    List<byte[]> sendBatch(String str, List<byte[]> list);
}
