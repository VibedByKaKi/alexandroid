package org.openjdk.tools.sjavac;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class CompileChunk implements Comparable<CompileChunk> {
    public int numDependents;
    public int numPackages;
    public Set<URI> srcs = new HashSet();
    public StringBuilder pkgNames = new StringBuilder();
    public String pkgFromTos = "";

    @Override // java.lang.Comparable
    public int compareTo(CompileChunk compileChunk) {
        return this.numDependents == compileChunk.numDependents ? 0 : -1;
    }

    public boolean equal(CompileChunk compileChunk) {
        return this.numDependents == compileChunk.numDependents;
    }
}
