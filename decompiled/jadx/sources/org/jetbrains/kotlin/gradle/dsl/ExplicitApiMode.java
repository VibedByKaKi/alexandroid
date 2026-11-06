package org.jetbrains.kotlin.gradle.dsl;

import com.amazonaws.services.s3.model.BucketLifecycleConfiguration;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\u0003H\u0007R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lorg/jetbrains/kotlin/gradle/dsl/ExplicitApiMode;", "", "cliOption", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCliOption$annotations", "()V", "getCliOption", "()Ljava/lang/String;", "toCompilerArg", "Strict", "Warning", BucketLifecycleConfiguration.DISABLED, "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public enum ExplicitApiMode {
    Strict("strict"),
    Warning("warning"),
    Disabled("disable");


    @NotNull
    private final String cliOption;

    ExplicitApiMode(String str) {
        this.cliOption = str;
    }

    @NotNull
    public final String getCliOption() {
        return this.cliOption;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Should not be exposed in api")
    @NotNull
    public final String toCompilerArg() {
        return "-Xexplicit-api=" + this.cliOption;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Should not be exposed in api")
    public static /* synthetic */ void getCliOption$annotations() {
    }
}
