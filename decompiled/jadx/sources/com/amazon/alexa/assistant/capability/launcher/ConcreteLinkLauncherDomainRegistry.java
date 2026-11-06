package com.amazon.alexa.assistant.capability.launcher;

import com.amazon.alexa.assistant.foundation.logging.Logger;
import com.amazon.identity.auth.device.api.MAPAccountManager;
import java.net.URL;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0096@¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0014\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/assistant/capability/launcher/ConcreteLinkLauncherDomainRegistry;", "Lcom/amazon/alexa/assistant/capability/launcher/LinkLauncherDomainRegistry;", "logger", "Lcom/amazon/alexa/assistant/foundation/logging/Logger;", "<init>", "(Lcom/amazon/alexa/assistant/foundation/logging/Logger;)V", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "registry", "", "", "isRegistered", "", "domain", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", MAPAccountManager.KEY_REGISTER_AFTER_OAUTH, "", "Ljava/net/URL;", "(Ljava/net/URL;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deregister", "deregisterAllDomains", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "extractDomainKey", "url", "Companion", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLinkLauncherDomainRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkLauncherDomainRegistry.kt\ncom/amazon/alexa/assistant/capability/launcher/ConcreteLinkLauncherDomainRegistry\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,96:1\n116#2,11:97\n116#2,11:108\n116#2,11:119\n116#2,11:130\n*S KotlinDebug\n*F\n+ 1 LinkLauncherDomainRegistry.kt\ncom/amazon/alexa/assistant/capability/launcher/ConcreteLinkLauncherDomainRegistry\n*L\n54#1:97,11\n59#1:108,11\n67#1:119,11\n75#1:130,11\n*E\n"})
/* loaded from: classes15.dex */
public final class ConcreteLinkLauncherDomainRegistry implements LinkLauncherDomainRegistry {

    @NotNull
    private static final String TAG = "LinkLauncherDomainRegistry";

    @NotNull
    private final Logger logger;

    @NotNull
    private final Mutex mutex;

    @NotNull
    private final Set<String> registry;

    public ConcreteLinkLauncherDomainRegistry(@NotNull Logger logger) {
        logger.getClass();
        this.logger = logger;
        this.mutex = MutexKt.Mutex$default(false, 1, null);
        this.registry = new LinkedHashSet();
    }

    private final String extractDomainKey(URL url) {
        String protocol = url.getProtocol();
        protocol.getClass();
        String lowerCase = protocol.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (!Intrinsics.areEqual(lowerCase, "http") && !Intrinsics.areEqual(lowerCase, "https")) {
            String protocol2 = url.getProtocol();
            protocol2.getClass();
            return protocol2;
        }
        String host = url.getHost();
        if (host == null) {
            host = url.getProtocol();
        }
        host.getClass();
        return host;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.amazon.alexa.assistant.capability.launcher.LinkLauncherDomainRegistry
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object deregister(@org.jetbrains.annotations.NotNull java.net.URL r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
        /*
            r12 = this;
            java.lang.String r0 = "Deregistered domain: "
            boolean r1 = r14 instanceof com.amazon.alexa.assistant.capability.launcher.ConcreteLinkLauncherDomainRegistry$deregister$1
            if (r1 == 0) goto L15
            r1 = r14
            com.amazon.alexa.assistant.capability.launcher.ConcreteLinkLauncherDomainRegistry$deregister$1 r1 = (com.amazon.alexa.assistant.capability.launcher.ConcreteLinkLauncherDomainRegistry$deregister$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            com.amazon.alexa.assistant.capability.launcher.ConcreteLinkLauncherDomainRegistry$deregister$1 r1 = new com.amazon.alexa.assistant.capability.launcher.ConcreteLinkLauncherDomainRegistry$deregister$1
            r1.<init>(r12, r14)
        L1a:
            java.lang.Object r14 = r1.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.label
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L40
            if (r3 != r4) goto L3a
            java.lang.Object r12 = r1.L$2
            kotlinx.coroutines.sync.Mutex r12 = (kotlinx.coroutines.sync.Mutex) r12
            java.lang.Object r13 = r1.L$1
            java.net.URL r13 = (java.net.URL) r13
            java.lang.Object r1 = r1.L$0
            com.amazon.alexa.assistant.capability.launcher.ConcreteLinkLauncherDomainRegistry r1 = (com.amazon.alexa.assistant.capability.launcher.ConcreteLinkLauncherDomainRegistry) r1
            kotlin.ResultKt.throwOnFailure(r14)
            r14 = r12
            r12 = r1
            goto L54
        L3a:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r12)
            return r5
        L40:
            kotlin.ResultKt.throwOnFailure(r14)
            kotlinx.coroutines.sync.Mutex r14 = r12.mutex
            r1.L$0 = r12
            r1.L$1 = r13
            r1.L$2 = r14
            r1.label = r4
            java.lang.Object r1 = r14.lock(r5, r1)
            if (r1 != r2) goto L54
            return r2
        L54:
            java.lang.String r13 = r12.extractDomainKey(r13)     // Catch: java.lang.Throwable -> L7b
            java.util.Set<java.lang.String> r1 = r12.registry     // Catch: java.lang.Throwable -> L7b
            r1.remove(r13)     // Catch: java.lang.Throwable -> L7b
            com.amazon.alexa.assistant.foundation.logging.Logger r6 = r12.logger     // Catch: java.lang.Throwable -> L7b
            java.lang.String r7 = "LinkLauncherDomainRegistry"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L7b
            r12.append(r13)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r8 = r12.toString()     // Catch: java.lang.Throwable -> L7b
            r10 = 4
            r11 = 0
            r9 = 0
            com.amazon.alexa.assistant.foundation.logging.Logger.DefaultImpls.info$default(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L7b
            kotlin.Unit r12 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L7b
            r14.unlock(r5)
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        L7b:
            r0 = move-exception
            r12 = r0
            r14.unlock(r5)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.assistant.capability.launcher.ConcreteLinkLauncherDomainRegistry.deregister(java.net.URL, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.amazon.alexa.assistant.capability.launcher.LinkLauncherDomainRegistry
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object deregisterAllDomains(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.amazon.alexa.assistant.capability.launcher.ConcreteLinkLauncherDomainRegistry$deregisterAllDomains$1
            if (r0 == 0) goto L13
            r0 = r12
            com.amazon.alexa.assistant.capability.launcher.ConcreteLinkLauncherDomainRegistry$deregisterAllDomains$1 r0 = (com.amazon.alexa.assistant.capability.launcher.ConcreteLinkLauncherDomainRegistry$deregisterAllDomains$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amazon.alexa.assistant.capability.launcher.ConcreteLinkLauncherDomainRegistry$deregisterAllDomains$1 r0 = new com.amazon.alexa.assistant.capability.launcher.ConcreteLinkLauncherDomainRegistry$deregisterAllDomains$1
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L34
            java.lang.Object r11 = r0.L$1
            kotlinx.coroutines.sync.Mutex r11 = (kotlinx.coroutines.sync.Mutex) r11
            java.lang.Object r0 = r0.L$0
            com.amazon.alexa.assistant.capability.launcher.ConcreteLinkLauncherDomainRegistry r0 = (com.amazon.alexa.assistant.capability.launcher.ConcreteLinkLauncherDomainRegistry) r0
            kotlin.ResultKt.throwOnFailure(r12)
            r12 = r11
            r11 = r0
            goto L4c
        L34:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r11)
            return r4
        L3a:
            kotlin.ResultKt.throwOnFailure(r12)
            kotlinx.coroutines.sync.Mutex r12 = r11.mutex
            r0.L$0 = r11
            r0.L$1 = r12
            r0.label = r3
            java.lang.Object r0 = r12.lock(r4, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            java.util.Set<java.lang.String> r0 = r11.registry     // Catch: java.lang.Throwable -> L65
            r0.clear()     // Catch: java.lang.Throwable -> L65
            com.amazon.alexa.assistant.foundation.logging.Logger r5 = r11.logger     // Catch: java.lang.Throwable -> L65
            java.lang.String r6 = "LinkLauncherDomainRegistry"
            java.lang.String r7 = "Deregistered all domains"
            r9 = 4
            r10 = 0
            r8 = 0
            com.amazon.alexa.assistant.foundation.logging.Logger.DefaultImpls.info$default(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L65
            kotlin.Unit r11 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L65
            r12.unlock(r4)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        L65:
            r0 = move-exception
            r11 = r0
            r12.unlock(r4)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.assistant.capability.launcher.ConcreteLinkLauncherDomainRegistry.deregisterAllDomains(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.amazon.alexa.assistant.capability.launcher.LinkLauncherDomainRegistry
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object isRegistered(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.amazon.alexa.assistant.capability.launcher.ConcreteLinkLauncherDomainRegistry$isRegistered$1
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.alexa.assistant.capability.launcher.ConcreteLinkLauncherDomainRegistry$isRegistered$1 r0 = (com.amazon.alexa.assistant.capability.launcher.ConcreteLinkLauncherDomainRegistry$isRegistered$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amazon.alexa.assistant.capability.launcher.ConcreteLinkLauncherDomainRegistry$isRegistered$1 r0 = new com.amazon.alexa.assistant.capability.launcher.ConcreteLinkLauncherDomainRegistry$isRegistered$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L38
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.sync.Mutex r5 = (kotlinx.coroutines.sync.Mutex) r5
            java.lang.Object r6 = r0.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r0.L$0
            com.amazon.alexa.assistant.capability.launcher.ConcreteLinkLauncherDomainRegistry r0 = (com.amazon.alexa.assistant.capability.launcher.ConcreteLinkLauncherDomainRegistry) r0
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = r5
            r5 = r0
            goto L53
        L38:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r5)
            r5 = 0
            return r5
        L3f:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlinx.coroutines.sync.Mutex r7 = r5.mutex
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r0 = r7.lock(r4, r0)
            if (r0 != r1) goto L53
            return r1
        L53:
            java.util.Set<java.lang.String> r5 = r5.registry     // Catch: java.lang.Throwable -> L61
            boolean r5 = r5.contains(r6)     // Catch: java.lang.Throwable -> L61
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)     // Catch: java.lang.Throwable -> L61
            r7.unlock(r4)
            return r5
        L61:
            r5 = move-exception
            r7.unlock(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.assistant.capability.launcher.ConcreteLinkLauncherDomainRegistry.isRegistered(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.amazon.alexa.assistant.capability.launcher.LinkLauncherDomainRegistry
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object register(@org.jetbrains.annotations.NotNull java.net.URL r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
        /*
            r12 = this;
            java.lang.String r0 = "Registered domain: "
            boolean r1 = r14 instanceof com.amazon.alexa.assistant.capability.launcher.ConcreteLinkLauncherDomainRegistry$register$1
            if (r1 == 0) goto L15
            r1 = r14
            com.amazon.alexa.assistant.capability.launcher.ConcreteLinkLauncherDomainRegistry$register$1 r1 = (com.amazon.alexa.assistant.capability.launcher.ConcreteLinkLauncherDomainRegistry$register$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            com.amazon.alexa.assistant.capability.launcher.ConcreteLinkLauncherDomainRegistry$register$1 r1 = new com.amazon.alexa.assistant.capability.launcher.ConcreteLinkLauncherDomainRegistry$register$1
            r1.<init>(r12, r14)
        L1a:
            java.lang.Object r14 = r1.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.label
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L40
            if (r3 != r4) goto L3a
            java.lang.Object r12 = r1.L$2
            kotlinx.coroutines.sync.Mutex r12 = (kotlinx.coroutines.sync.Mutex) r12
            java.lang.Object r13 = r1.L$1
            java.net.URL r13 = (java.net.URL) r13
            java.lang.Object r1 = r1.L$0
            com.amazon.alexa.assistant.capability.launcher.ConcreteLinkLauncherDomainRegistry r1 = (com.amazon.alexa.assistant.capability.launcher.ConcreteLinkLauncherDomainRegistry) r1
            kotlin.ResultKt.throwOnFailure(r14)
            r14 = r12
            r12 = r1
            goto L54
        L3a:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r12)
            return r5
        L40:
            kotlin.ResultKt.throwOnFailure(r14)
            kotlinx.coroutines.sync.Mutex r14 = r12.mutex
            r1.L$0 = r12
            r1.L$1 = r13
            r1.L$2 = r14
            r1.label = r4
            java.lang.Object r1 = r14.lock(r5, r1)
            if (r1 != r2) goto L54
            return r2
        L54:
            java.lang.String r13 = r12.extractDomainKey(r13)     // Catch: java.lang.Throwable -> L7b
            java.util.Set<java.lang.String> r1 = r12.registry     // Catch: java.lang.Throwable -> L7b
            r1.add(r13)     // Catch: java.lang.Throwable -> L7b
            com.amazon.alexa.assistant.foundation.logging.Logger r6 = r12.logger     // Catch: java.lang.Throwable -> L7b
            java.lang.String r7 = "LinkLauncherDomainRegistry"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L7b
            r12.append(r13)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r8 = r12.toString()     // Catch: java.lang.Throwable -> L7b
            r10 = 4
            r11 = 0
            r9 = 0
            com.amazon.alexa.assistant.foundation.logging.Logger.DefaultImpls.info$default(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L7b
            kotlin.Unit r12 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L7b
            r14.unlock(r5)
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        L7b:
            r0 = move-exception
            r12 = r0
            r14.unlock(r5)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.assistant.capability.launcher.ConcreteLinkLauncherDomainRegistry.register(java.net.URL, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
