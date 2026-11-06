package io.ktor.util.pipeline;

import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lio/ktor/util/pipeline/PipelinePhase;", "", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "toString", "ktor-utils"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class PipelinePhase {

    @NotNull
    private final String name;

    public PipelinePhase(@NotNull String str) {
        str.getClass();
        this.name = str;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("Phase('"), this.name, "')");
    }
}
