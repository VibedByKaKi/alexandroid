package org.openjdk.tools.sjavac.server;

import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class SysInfo implements Serializable {
    static final long serialVersionUID = -3096346807579L;
    public long maxMemory;
    public int numCores;

    public SysInfo(int i, long j) {
        this.numCores = i;
        this.maxMemory = j;
    }
}
