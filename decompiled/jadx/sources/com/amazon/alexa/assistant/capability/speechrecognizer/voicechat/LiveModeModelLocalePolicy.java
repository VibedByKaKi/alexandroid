package com.amazon.alexa.assistant.capability.speechrecognizer.voicechat;

import com.amazon.alexa.assistant.foundation.model.SystemLocale;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B-\u0012$\u0010\u0002\u001a \b\u0001\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R.\u0010\u0002\u001a \b\u0001\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/voicechat/LiveModeModelLocalePolicy;", "", "currentLocales", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "Lcom/amazon/alexa/assistant/foundation/model/SystemLocale;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function1;", "isModelSupportedLocaleState", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isEnglish", "tag", "", "Companion", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLiveModeModelLocalePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveModeModelLocalePolicy.kt\ncom/amazon/alexa/assistant/capability/speechrecognizer/voicechat/LiveModeModelLocalePolicy\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,48:1\n1740#2,3:49\n*S KotlinDebug\n*F\n+ 1 LiveModeModelLocalePolicy.kt\ncom/amazon/alexa/assistant/capability/speechrecognizer/voicechat/LiveModeModelLocalePolicy\n*L\n39#1:49,3\n*E\n"})
/* loaded from: classes15.dex */
public final class LiveModeModelLocalePolicy {

    @NotNull
    private static final String ENGLISH = "en";

    @NotNull
    private final Function1<Continuation<? super List<? extends SystemLocale>>, Object> currentLocales;

    /* JADX WARN: Multi-variable type inference failed */
    public LiveModeModelLocalePolicy(@NotNull Function1<? super Continuation<? super List<? extends SystemLocale>>, ? extends Object> function1) {
        function1.getClass();
        this.currentLocales = function1;
    }

    private final boolean isEnglish(String tag) {
        String substringBefore$default;
        String substringBefore$default2;
        substringBefore$default = StringsKt__StringsKt.substringBefore$default(tag, '-', (String) null, 2, (Object) null);
        substringBefore$default2 = StringsKt__StringsKt.substringBefore$default(substringBefore$default, '_', (String) null, 2, (Object) null);
        return StringsKt.equals(substringBefore$default2, ENGLISH, true);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:36|37))(3:38|39|(1:41))|12|13|(2:33|34)(4:17|(2:24|(2:25|(1:32)(2:27|(2:29|30)(1:31))))(0)|21|22)))|45|6|7|(0)(0)|12|13|(1:15)|33|34|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008a, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008b, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0047, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object isModelSupportedLocaleState(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.LiveModeModelLocalePolicy$isModelSupportedLocaleState$1
            if (r0 == 0) goto L13
            r0 = r5
            com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.LiveModeModelLocalePolicy$isModelSupportedLocaleState$1 r0 = (com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.LiveModeModelLocalePolicy$isModelSupportedLocaleState$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.LiveModeModelLocalePolicy$isModelSupportedLocaleState$1 r0 = new com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.LiveModeModelLocalePolicy$isModelSupportedLocaleState$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.LiveModeModelLocalePolicy r4 = (com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.LiveModeModelLocalePolicy) r4
            kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L8a
            goto L44
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r4)
            r4 = 0
            return r4
        L34:
            kotlin.ResultKt.throwOnFailure(r5)
            kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.util.List<? extends com.amazon.alexa.assistant.foundation.model.SystemLocale>>, java.lang.Object> r5 = r4.currentLocales     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L8a
            r0.L$0 = r4     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L8a
            r0.label = r3     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L8a
            java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L8a
            if (r5 != r1) goto L44
            return r1
        L44:
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L8a
            goto L48
        L47:
            r5 = 0
        L48:
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = 0
            if (r0 == 0) goto L85
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L55
            goto L85
        L55:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L65
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L65
            goto L80
        L65:
            java.util.Iterator r5 = r5.iterator()
        L69:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L80
            java.lang.Object r0 = r5.next()
            com.amazon.alexa.assistant.foundation.model.SystemLocale r0 = (com.amazon.alexa.assistant.foundation.model.SystemLocale) r0
            java.lang.String r0 = r0.getValue()
            boolean r0 = r4.isEnglish(r0)
            if (r0 != 0) goto L69
            r3 = r1
        L80:
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r4
        L85:
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
            return r4
        L8a:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.LiveModeModelLocalePolicy.isModelSupportedLocaleState(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
