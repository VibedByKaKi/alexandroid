package com.amazon.alexa.redesign.domain.agentspace.greeting;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.redesign.entity.agentforward.network.GreetingItemDomain;
import defpackage.a$$ExternalSyntheticOutline0;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Singleton
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u0016\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0002J\u001d\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/redesign/domain/agentspace/greeting/AgentSpaceGreetingComposer;", "", "<init>", "()V", "composeNudge", "", "item", "Lcom/amazon/alexa/redesign/entity/agentforward/network/GreetingItemDomain;", "context", "Lcom/amazon/alexa/redesign/domain/agentspace/greeting/GreetingSelectionContext;", "paBody", "composeStandalone", "resolveNudgeGreeting", "text", "resolveTokens", "resolveTokens$AlexaMobileAndroidHomeChannel_release", "Companion", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class AgentSpaceGreetingComposer {
    public static final int $stable = 0;

    @NotNull
    private static final String FIRST_NAME_TOKEN = "${firstName}";
    public static final int GREETING_HALF_CAP = 15;

    @NotNull
    private static final Regex ORPHAN_PUNCTUATION_SPACE = new Regex(",?\\s+([!?.,;:])");

    @NotNull
    private static final Regex LEADING_ORPHAN_PUNCTUATION = new Regex("^[\\s,]+");

    @NotNull
    private static final Regex COLLAPSE_WHITESPACE = new Regex("\\s{2,}");

    @Inject
    public AgentSpaceGreetingComposer() {
    }

    private final String resolveNudgeGreeting(String text, GreetingSelectionContext context) {
        boolean contains$default;
        String obj = StringsKt.trim((CharSequence) resolveTokens$AlexaMobileAndroidHomeChannel_release(text, context)).toString();
        if (context.getFirstName().length() > 0) {
            contains$default = StringsKt__StringsKt.contains$default(text, FIRST_NAME_TOKEN, false, 2, (Object) null);
            if (contains$default && obj.length() > 15) {
                return StringsKt.trim((CharSequence) resolveTokens$AlexaMobileAndroidHomeChannel_release(text, GreetingSelectionContext.copy$default(context, null, "", null, null, null, 29, null))).toString();
            }
        }
        return obj;
    }

    @NotNull
    public final String composeNudge(@NotNull GreetingItemDomain item, @NotNull GreetingSelectionContext context, @NotNull String paBody) {
        item.getClass();
        context.getClass();
        paBody.getClass();
        String greetingText = item.getGreetingText();
        if (greetingText == null) {
            greetingText = "";
        }
        String resolveNudgeGreeting = resolveNudgeGreeting(greetingText, context);
        return resolveNudgeGreeting.length() == 0 ? paBody : paBody.length() == 0 ? resolveNudgeGreeting : a$$ExternalSyntheticOutline0.m$1(resolveNudgeGreeting, " ", paBody);
    }

    @NotNull
    public final String composeStandalone(@NotNull GreetingItemDomain item, @NotNull GreetingSelectionContext context) {
        item.getClass();
        context.getClass();
        String greetingText = item.getGreetingText();
        if (greetingText == null) {
            greetingText = "";
        }
        return StringsKt.trim((CharSequence) resolveTokens$AlexaMobileAndroidHomeChannel_release(greetingText, context)).toString();
    }

    @NotNull
    public final String resolveTokens$AlexaMobileAndroidHomeChannel_release(@NotNull String text, @NotNull GreetingSelectionContext context) {
        String replace$default;
        String replace;
        text.getClass();
        context.getClass();
        if (text.length() == 0) {
            return text;
        }
        if (context.getFirstName().length() > 0) {
            replace = StringsKt__StringsJVMKt.replace$default(text, FIRST_NAME_TOKEN, context.getFirstName(), false, 4, (Object) null);
        } else {
            replace$default = StringsKt__StringsJVMKt.replace$default(text, FIRST_NAME_TOKEN, "", false, 4, (Object) null);
            replace = LEADING_ORPHAN_PUNCTUATION.replace(ORPHAN_PUNCTUATION_SPACE.replace(replace$default, "$1"), "");
        }
        return StringsKt.trim((CharSequence) COLLAPSE_WHITESPACE.replace(replace, " ")).toString();
    }
}
