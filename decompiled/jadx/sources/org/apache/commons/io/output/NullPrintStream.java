package org.apache.commons.io.output;

import java.io.PrintStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class NullPrintStream extends PrintStream {
    public static final NullPrintStream NULL_PRINT_STREAM = new NullPrintStream();

    public NullPrintStream() {
        super(NullOutputStream.NULL_OUTPUT_STREAM);
    }
}
