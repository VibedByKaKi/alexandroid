package com.amazon.alexa.client.metrics.mobilytics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class InvocationTypeSplitter {
    private InvocationTypeSplitter() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.amazon.alexa.mobilytics.event.metadata.A4ASdkMetadata addInvocationType(@androidx.annotation.NonNull com.amazon.alexa.mobilytics.event.metadata.A4ASdkMetadata r9, @androidx.annotation.NonNull java.lang.String r10) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L7
            return r9
        L7:
            java.lang.String r0 = "\\."
            java.lang.String[] r0 = r10.split(r0)
            int r1 = r0.length
            r2 = 1
            if (r1 == r2) goto L76
            int r1 = r0.length
            r3 = 3
            if (r1 <= r3) goto L17
            goto L76
        L17:
            r1 = 0
            r4 = r0[r1]
            int r5 = r4.hashCode()
            r6 = 0
            r7 = 2
            switch(r5) {
                case -613257390: goto L56;
                case 650201872: goto L53;
                case 675840438: goto L49;
                case 1684994366: goto L42;
                case 2073650768: goto L24;
                default: goto L23;
            }
        L23:
            goto L59
        L24:
            java.lang.String r10 = "HandsFree"
            boolean r10 = r4.equals(r10)
            if (r10 == 0) goto L59
            r10 = r0[r1]
            int r1 = r0.length
            if (r1 != r3) goto L39
            r6 = r0[r7]
            r0 = r0[r2]
        L35:
            r8 = r0
            r0 = r10
            r10 = r8
            goto L69
        L39:
            int r1 = r0.length
            if (r1 != r7) goto L3f
            r0 = r0[r2]
            goto L35
        L3f:
            r0 = r10
            r10 = r6
            goto L69
        L42:
            java.lang.String r10 = "AlexaApp"
        L44:
            boolean r10 = r4.equals(r10)
            goto L59
        L49:
            java.lang.String r5 = "VoiceEnrollment"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L59
            r0 = r6
            goto L69
        L53:
            java.lang.String r10 = "Accessories"
            goto L44
        L56:
            java.lang.String r10 = "AlexaService"
            goto L44
        L59:
            r10 = r0[r1]
            int r1 = r0.length
            if (r1 != r3) goto L63
            r6 = r0[r2]
            r0 = r0[r7]
            goto L35
        L63:
            int r1 = r0.length
            if (r1 != r7) goto L3f
            r0 = r0[r2]
            goto L35
        L69:
            com.amazon.alexa.mobilytics.event.metadata.A4ASdkMetadata r9 = r9.withInvocationIdentifier(r6)
            com.amazon.alexa.mobilytics.event.metadata.A4ASdkMetadata r9 = r9.withInvocationNamespace(r0)
            com.amazon.alexa.mobilytics.event.metadata.A4ASdkMetadata r9 = r9.withInvocationType(r10)
            return r9
        L76:
            com.amazon.alexa.mobilytics.event.metadata.A4ASdkMetadata r9 = r9.withInvocationType(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.client.metrics.mobilytics.InvocationTypeSplitter.addInvocationType(com.amazon.alexa.mobilytics.event.metadata.A4ASdkMetadata, java.lang.String):com.amazon.alexa.mobilytics.event.metadata.A4ASdkMetadata");
    }
}
