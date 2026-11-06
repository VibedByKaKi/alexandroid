package com.amazon.scxml;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.scxml.logging.Loggable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B-\u0012$\u0010\u0004\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0004\u0012\u00028\u00010\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u000eJ'\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\r\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012R,\u0010\u0004\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0004\u0012\u00028\u00010\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/amazon/scxml/NativeFunctions;", "TUserContext", "TResult", "Lcom/amazon/scxml/logging/Loggable;", "functions", "", "", "Lkotlin/Function1;", "Lcom/amazon/scxml/SCXMLContext;", "<init>", "(Ljava/util/Map;)V", "functionExists", "", "name", "functionExists$AlexaMobileAndroidVoice_TTA_release", "execute", "context", "execute$AlexaMobileAndroidVoice_TTA_release", "(Ljava/lang/String;Lcom/amazon/scxml/SCXMLContext;)Ljava/lang/Object;", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NativeFunctions<TUserContext, TResult> extends Loggable {

    @NotNull
    private final Map<String, Function1<SCXMLContext<TUserContext>, TResult>> functions;

    public NativeFunctions(@NotNull Map<String, ? extends Function1<? super SCXMLContext<TUserContext>, ? extends TResult>> map) {
        map.getClass();
        this.functions = MapsKt.toMap(map);
    }

    @Nullable
    public final TResult execute$AlexaMobileAndroidVoice_TTA_release(@NotNull String name, @NotNull SCXMLContext<TUserContext> context) {
        name.getClass();
        context.getClass();
        Loggable.INSTANCE.getLog().d(getTAG(), "executing [" + name + "] with context: [" + context + MarkdownConstants.RIGHT_BRACKET);
        Function1<SCXMLContext<TUserContext>, TResult> function1 = this.functions.get(name);
        if (function1 == null) {
            return null;
        }
        return function1.invoke(context);
    }

    public final boolean functionExists$AlexaMobileAndroidVoice_TTA_release(@NotNull String name) {
        name.getClass();
        return this.functions.containsKey(name);
    }
}
