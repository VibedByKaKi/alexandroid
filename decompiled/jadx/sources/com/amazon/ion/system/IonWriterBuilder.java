package com.amazon.ion.system;

import com.amazon.ion.IonWriter;
import java.io.OutputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class IonWriterBuilder {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum InitialIvmHandling {
        ENSURE,
        SUPPRESS
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum IvmMinimizing {
        ADJACENT,
        DISTANT
    }

    public abstract IonWriter build(OutputStream outputStream);

    public abstract InitialIvmHandling getInitialIvmHandling();

    public abstract IvmMinimizing getIvmMinimizing();
}
