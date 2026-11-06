package com.amazon.minerva.client.thirdparty.serializer;

import com.amazon.ion.IonException;
import com.amazon.minerva.client.thirdparty.metric.IonMetricEvent;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MetricBatchTextSerializer implements MetricBatchSerializer {
    @Override // com.amazon.minerva.client.thirdparty.serializer.MetricBatchSerializer
    public List<IonMetricEvent> deserialize(byte[] bArr) throws IOException, IonException {
        return IonMetricEventConverter.convertIonBinaryToIonMetricEvents(bArr);
    }

    @Override // com.amazon.minerva.client.thirdparty.serializer.MetricBatchSerializer
    public byte[] serialize(List<IonMetricEvent> list) throws IOException, IonException {
        return IonMetricEventConverter.convertIonMetricEventsToIonText(list).getBytes();
    }
}
