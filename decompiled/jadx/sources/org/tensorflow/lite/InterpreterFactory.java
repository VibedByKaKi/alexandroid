package org.tensorflow.lite;

import java.io.File;
import java.nio.ByteBuffer;
import org.tensorflow.lite.InterpreterApi;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes12.dex */
public class InterpreterFactory {
    public InterpreterApi create(File file, InterpreterApi.Options options) {
        return InterpreterApi.create(file, options);
    }

    public InterpreterApi create(ByteBuffer byteBuffer, InterpreterApi.Options options) {
        return InterpreterApi.create(byteBuffer, options);
    }
}
