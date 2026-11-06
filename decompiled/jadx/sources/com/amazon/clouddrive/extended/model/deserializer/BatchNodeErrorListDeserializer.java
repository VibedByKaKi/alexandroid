package com.amazon.clouddrive.extended.model.deserializer;

import com.amazon.clouddrive.extended.model.BatchNodeError;
import com.amazon.clouddrive.model.deserializer.ListDeserializer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BatchNodeErrorListDeserializer extends ListDeserializer<BatchNodeError> {
    public static final ListDeserializer<BatchNodeError> INSTANCE = new BatchNodeErrorListDeserializer();

    private BatchNodeErrorListDeserializer() {
        super(BatchNodeErrorDeserializer.INSTANCE);
    }
}
