package org.jetbrains.kotlin.tooling.core;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.RequiresOptIn;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresOptIn(level = RequiresOptIn.Level.ERROR, message = "Use safe API counterpart")
@Retention(RetentionPolicy.RUNTIME)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\n\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lorg/jetbrains/kotlin/tooling/core/UnsafeApi;", "", "message", "", "()Ljava/lang/String;", "kotlin-tooling-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public @interface UnsafeApi {
    String message() default "";
}
