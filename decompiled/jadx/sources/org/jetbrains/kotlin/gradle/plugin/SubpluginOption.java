package org.jetbrains.kotlin.gradle.plugin;

import kotlin.Lazy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/SubpluginOption;", "", "key", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "lazyValue", "Lkotlin/Lazy;", "(Ljava/lang/String;Lkotlin/Lazy;)V", "getKey", "()Ljava/lang/String;", "getValue", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public class SubpluginOption {

    @NotNull
    private final String key;

    @NotNull
    private final Lazy<String> lazyValue;

    public SubpluginOption(@NotNull String str, @NotNull Lazy<String> lazy) {
        str.getClass();
        lazy.getClass();
        this.key = str;
        this.lazyValue = lazy;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String getValue() {
        return this.lazyValue.getValue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SubpluginOption(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
        /*
            r0 = this;
            r1.getClass()
            r2.getClass()
            kotlin.Lazy r2 = kotlin.LazyKt.lazyOf(r2)
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jetbrains.kotlin.gradle.plugin.SubpluginOption.<init>(java.lang.String, java.lang.String):void");
    }
}
