package org.jetbrains.kotlin.gradle.plugin;

import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\u0010\u0007B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/CompositeSubpluginOption;", "Lorg/jetbrains/kotlin/gradle/plugin/SubpluginOption;", "key", "", "value", "originalOptions", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "lazyValue", "Lkotlin/Lazy;", "(Ljava/lang/String;Lkotlin/Lazy;Ljava/util/List;)V", "getOriginalOptions", "()Ljava/util/List;", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class CompositeSubpluginOption extends SubpluginOption {

    @NotNull
    private final List<SubpluginOption> originalOptions;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CompositeSubpluginOption(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.util.List<? extends org.jetbrains.kotlin.gradle.plugin.SubpluginOption> r3) {
        /*
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            kotlin.Lazy r2 = kotlin.LazyKt.lazyOf(r2)
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jetbrains.kotlin.gradle.plugin.CompositeSubpluginOption.<init>(java.lang.String, java.lang.String, java.util.List):void");
    }

    @NotNull
    public final List<SubpluginOption> getOriginalOptions() {
        return this.originalOptions;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CompositeSubpluginOption(@NotNull String str, @NotNull Lazy<String> lazy, @NotNull List<? extends SubpluginOption> list) {
        super(str, lazy);
        str.getClass();
        lazy.getClass();
        list.getClass();
        this.originalOptions = list;
    }
}
