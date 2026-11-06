package io.ktor.http.content;

import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u001a9\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\"\u0010\u0003\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n*\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"forEachPart", "", "Lio/ktor/http/content/MultiPartData;", "partHandler", "Lkotlin/Function2;", "Lio/ktor/http/content/PartData;", "Lkotlin/coroutines/Continuation;", "", "(Lio/ktor/http/content/MultiPartData;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readAllParts", "", "(Lio/ktor/http/content/MultiPartData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-http"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class MultipartKt {
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        if (r6.invoke(r8, r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007e -> B:12:0x0038). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object forEachPart(@org.jetbrains.annotations.NotNull io.ktor.http.content.MultiPartData r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super io.ktor.http.content.PartData, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            boolean r0 = r8 instanceof io.ktor.http.content.MultipartKt$forEachPart$1
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.http.content.MultipartKt$forEachPart$1 r0 = (io.ktor.http.content.MultipartKt$forEachPart$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.http.content.MultipartKt$forEachPart$1 r0 = new io.ktor.http.content.MultipartKt$forEachPart$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L5a
            if (r2 == r4) goto L48
            if (r2 != r3) goto L41
            java.lang.Object r6 = r0.L$2
            io.ktor.http.content.PartData r6 = (io.ktor.http.content.PartData) r6
            java.lang.Object r6 = r0.L$1
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            java.lang.Object r7 = r0.L$0
            io.ktor.http.content.MultiPartData r7 = (io.ktor.http.content.MultiPartData) r7
            boolean r2 = r8 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L3c
        L38:
            r5 = r7
            r7 = r6
            r6 = r5
            goto L5e
        L3c:
            kotlin.Result$Failure r8 = (kotlin.Result.Failure) r8
            java.lang.Throwable r6 = r8.exception
            throw r6
        L41:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r6)
            r6 = 0
            return r6
        L48:
            java.lang.Object r6 = r0.L$1
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            java.lang.Object r7 = r0.L$0
            io.ktor.http.content.MultiPartData r7 = (io.ktor.http.content.MultiPartData) r7
            boolean r2 = r8 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L55
            goto L6e
        L55:
            kotlin.Result$Failure r8 = (kotlin.Result.Failure) r8
            java.lang.Throwable r6 = r8.exception
            throw r6
        L5a:
            boolean r2 = r8 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L84
        L5e:
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r6.readPart(r0)
            if (r8 != r1) goto L6b
            goto L80
        L6b:
            r5 = r7
            r7 = r6
            r6 = r5
        L6e:
            io.ktor.http.content.PartData r8 = (io.ktor.http.content.PartData) r8
            if (r8 == 0) goto L81
            r0.L$0 = r7
            r0.L$1 = r6
            r0.L$2 = r8
            r0.label = r3
            java.lang.Object r8 = r6.invoke(r8, r0)
            if (r8 != r1) goto L38
        L80:
            return r1
        L81:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L84:
            kotlin.Result$Failure r8 = (kotlin.Result.Failure) r8
            java.lang.Throwable r6 = r8.exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.content.MultipartKt.forEachPart(io.ktor.http.content.MultiPartData, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        if (r7 != r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005f, code lost:
    
        if (r7 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007d -> B:15:0x0080). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readAllParts(@org.jetbrains.annotations.NotNull io.ktor.http.content.MultiPartData r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<? extends io.ktor.http.content.PartData>> r7) {
        /*
            boolean r0 = r7 instanceof io.ktor.http.content.MultipartKt$readAllParts$1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.http.content.MultipartKt$readAllParts$1 r0 = (io.ktor.http.content.MultipartKt$readAllParts$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.http.content.MultipartKt$readAllParts$1 r0 = new io.ktor.http.content.MultipartKt$readAllParts$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L53
            if (r2 == r4) goto L45
            if (r2 != r3) goto L3e
            java.lang.Object r6 = r0.L$2
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r2 = r0.L$1
            io.ktor.http.content.PartData r2 = (io.ktor.http.content.PartData) r2
            java.lang.Object r2 = r0.L$0
            io.ktor.http.content.MultiPartData r2 = (io.ktor.http.content.MultiPartData) r2
            boolean r4 = r7 instanceof kotlin.Result.Failure
            if (r4 != 0) goto L39
            goto L80
        L39:
            kotlin.Result$Failure r7 = (kotlin.Result.Failure) r7
            java.lang.Throwable r6 = r7.exception
            throw r6
        L3e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r6)
            r6 = 0
            return r6
        L45:
            java.lang.Object r6 = r0.L$0
            io.ktor.http.content.MultiPartData r6 = (io.ktor.http.content.MultiPartData) r6
            boolean r2 = r7 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L4e
            goto L62
        L4e:
            kotlin.Result$Failure r7 = (kotlin.Result.Failure) r7
            java.lang.Throwable r6 = r7.exception
            throw r6
        L53:
            boolean r2 = r7 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L8e
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r6.readPart(r0)
            if (r7 != r1) goto L62
            goto L7f
        L62:
            io.ktor.http.content.PartData r7 = (io.ktor.http.content.PartData) r7
            if (r7 == 0) goto L89
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.add(r7)
            r5 = r2
            r2 = r6
            r6 = r5
        L71:
            r0.L$0 = r2
            r0.L$1 = r7
            r0.L$2 = r6
            r0.label = r3
            java.lang.Object r7 = r2.readPart(r0)
            if (r7 != r1) goto L80
        L7f:
            return r1
        L80:
            io.ktor.http.content.PartData r7 = (io.ktor.http.content.PartData) r7
            if (r7 == 0) goto L88
            r6.add(r7)
            goto L71
        L88:
            return r6
        L89:
            java.util.List r6 = kotlin.collections.CollectionsKt.emptyList()
            return r6
        L8e:
            kotlin.Result$Failure r7 = (kotlin.Result.Failure) r7
            java.lang.Throwable r6 = r7.exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.content.MultipartKt.readAllParts(io.ktor.http.content.MultiPartData, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
