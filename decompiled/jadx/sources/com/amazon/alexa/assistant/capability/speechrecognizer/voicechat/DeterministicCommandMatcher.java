package com.amazon.alexa.assistant.capability.speechrecognizer.voicechat;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.LivePreviewBundleKeys;
import com.amazon.alexa.assistant.foundation.model.SystemLocale;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0011B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012$\u0010\u0004\u001a \b\u0001\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0086@¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u0004\u001a \b\u0001\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/voicechat/DeterministicCommandMatcher;", "", "catalog", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/voicechat/LiveModeCommandCatalog;", "currentLocales", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "Lcom/amazon/alexa/assistant/foundation/model/SystemLocale;", "<init>", "(Lcom/amazon/alexa/assistant/capability/speechrecognizer/voicechat/LiveModeCommandCatalog;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function1;", "match", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/voicechat/DeterministicCommandMatcher$Match;", LivePreviewBundleKeys.TRANSCRIPT, "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Match", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DeterministicCommandMatcher {

    @NotNull
    private final LiveModeCommandCatalog catalog;

    @NotNull
    private final Function1<Continuation<? super List<? extends SystemLocale>>, Object> currentLocales;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/voicechat/DeterministicCommandMatcher$Match;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "MUTE", "EXIT", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Match {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Match[] $VALUES;
        public static final Match NONE = new Match("NONE", 0);
        public static final Match MUTE = new Match("MUTE", 1);
        public static final Match EXIT = new Match("EXIT", 2);

        private static final /* synthetic */ Match[] $values() {
            return new Match[]{NONE, MUTE, EXIT};
        }

        static {
            Match[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private Match(String str, int i) {
        }

        @NotNull
        public static EnumEntries<Match> getEntries() {
            return $ENTRIES;
        }

        public static Match valueOf(String str) {
            return (Match) Enum.valueOf(Match.class, str);
        }

        public static Match[] values() {
            return (Match[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeterministicCommandMatcher(@NotNull LiveModeCommandCatalog liveModeCommandCatalog, @NotNull Function1<? super Continuation<? super List<? extends SystemLocale>>, ? extends Object> function1) {
        liveModeCommandCatalog.getClass();
        function1.getClass();
        this.catalog = liveModeCommandCatalog;
        this.currentLocales = function1;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:50|51))(2:52|(2:59|60)(2:56|(1:58)))|12|13|(2:47|48)(4:17|(4:20|(1:40)(3:22|23|(3:25|26|(3:35|36|37)(2:28|(3:30|31|32)(1:34)))(1:39))|33|18)|41|(2:43|44)(2:45|46))))|64|6|7|(0)(0)|12|13|(1:15)|47|48|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00bb, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00bc, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0058, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object match(@org.jetbrains.annotations.Nullable java.lang.String r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.DeterministicCommandMatcher.Match> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.DeterministicCommandMatcher$match$1
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.DeterministicCommandMatcher$match$1 r0 = (com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.DeterministicCommandMatcher$match$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.DeterministicCommandMatcher$match$1 r0 = new com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.DeterministicCommandMatcher$match$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L32
            java.lang.Object r5 = r0.L$1
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r0.L$0
            com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.DeterministicCommandMatcher r5 = (com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.DeterministicCommandMatcher) r5
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Exception -> L58 java.util.concurrent.CancellationException -> Lbb
            goto L55
        L32:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r5)
            r5 = 0
            return r5
        L39:
            kotlin.ResultKt.throwOnFailure(r7)
            if (r6 == 0) goto Lbd
            int r7 = r6.length()
            if (r7 != 0) goto L46
            goto Lbd
        L46:
            kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.util.List<? extends com.amazon.alexa.assistant.foundation.model.SystemLocale>>, java.lang.Object> r7 = r5.currentLocales     // Catch: java.lang.Exception -> L58 java.util.concurrent.CancellationException -> Lbb
            r0.L$0 = r5     // Catch: java.lang.Exception -> L58 java.util.concurrent.CancellationException -> Lbb
            r0.L$1 = r6     // Catch: java.lang.Exception -> L58 java.util.concurrent.CancellationException -> Lbb
            r0.label = r3     // Catch: java.lang.Exception -> L58 java.util.concurrent.CancellationException -> Lbb
            java.lang.Object r7 = r7.invoke(r0)     // Catch: java.lang.Exception -> L58 java.util.concurrent.CancellationException -> Lbb
            if (r7 != r1) goto L55
            return r1
        L55:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Exception -> L58 java.util.concurrent.CancellationException -> Lbb
            goto L59
        L58:
            r7 = 0
        L59:
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto Lb8
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L65
            goto Lb8
        L65:
            java.util.Iterator r7 = r7.iterator()
            r0 = 0
        L6a:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Lb0
            java.lang.Object r1 = r7.next()
            com.amazon.alexa.assistant.foundation.model.SystemLocale r1 = (com.amazon.alexa.assistant.foundation.model.SystemLocale) r1
            java.lang.String r1 = r1.getValue()
            r2 = 95
            r4 = 45
            java.lang.String r1 = kotlin.text.StringsKt.replace$default(r1, r2, r4)
            java.util.Locale r1 = java.util.Locale.forLanguageTag(r1)
            com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.LiveModeCommandCatalog r2 = r5.catalog
            com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.LiveModeCommandCatalog$Commands r2 = r2.get(r1)
            if (r2 != 0) goto L8f
            goto L6a
        L8f:
            com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.LiveModeCommandNormalizer r4 = com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.LiveModeCommandNormalizer.INSTANCE
            r1.getClass()
            java.lang.String r1 = r4.normalize(r6, r1)
            int r4 = r1.length()
            if (r4 != 0) goto L9f
            goto L6a
        L9f:
            boolean r4 = r2.isExit(r1)
            if (r4 == 0) goto La8
            com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.DeterministicCommandMatcher$Match r5 = com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.DeterministicCommandMatcher.Match.EXIT
            return r5
        La8:
            boolean r1 = r2.isMute(r1)
            if (r1 == 0) goto L6a
            r0 = r3
            goto L6a
        Lb0:
            if (r0 == 0) goto Lb5
            com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.DeterministicCommandMatcher$Match r5 = com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.DeterministicCommandMatcher.Match.MUTE
            goto Lb7
        Lb5:
            com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.DeterministicCommandMatcher$Match r5 = com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.DeterministicCommandMatcher.Match.NONE
        Lb7:
            return r5
        Lb8:
            com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.DeterministicCommandMatcher$Match r5 = com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.DeterministicCommandMatcher.Match.NONE
            return r5
        Lbb:
            r5 = move-exception
            throw r5
        Lbd:
            com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.DeterministicCommandMatcher$Match r5 = com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.DeterministicCommandMatcher.Match.NONE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.DeterministicCommandMatcher.match(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
