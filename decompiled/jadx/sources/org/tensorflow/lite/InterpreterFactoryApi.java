package org.tensorflow.lite;

import java.io.File;
import java.nio.ByteBuffer;
import org.tensorflow.lite.InterpreterApi;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public interface InterpreterFactoryApi {
    InterpreterApi create(File file, InterpreterApi.Options options);

    InterpreterApi create(ByteBuffer byteBuffer, InterpreterApi.Options options);

    NnApiDelegate.PrivateInterface createNnApiDelegateImpl(NnApiDelegate.Options options);

    String runtimeVersion();

    String schemaVersion();
}
