package com.typesafe.config.impl;

import io.ktor.http.CodecsKt$$ExternalSyntheticBUOutline0;
import java.util.Stack;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
final class PathBuilder {
    private final Stack<String> keys = new Stack<>();
    private Path result;

    private void checkCanAppend() {
        if (this.result == null) {
            return;
        }
        CodecsKt$$ExternalSyntheticBUOutline0.m("Adding to PathBuilder after getting result");
    }

    public void appendKey(String str) {
        checkCanAppend();
        this.keys.push(str);
    }

    public void appendPath(Path path) {
        checkCanAppend();
        String first = path.first();
        Path remainder = path.remainder();
        while (true) {
            this.keys.push(first);
            if (remainder == null) {
                return;
            }
            first = remainder.first();
            remainder = remainder.remainder();
        }
    }

    public Path result() {
        if (this.result == null) {
            Path path = null;
            while (!this.keys.isEmpty()) {
                path = new Path(this.keys.pop(), path);
            }
            this.result = path;
        }
        return this.result;
    }
}
