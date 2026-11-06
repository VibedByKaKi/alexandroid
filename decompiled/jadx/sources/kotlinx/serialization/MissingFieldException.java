package kotlinx.serialization;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001f\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\rB\u0011\b\u0011\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u000eR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlinx/serialization/MissingFieldException;", "Lkotlinx/serialization/SerializationException;", "missingFields", "", "", "message", "cause", "", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Throwable;)V", "serialName", "(Ljava/util/List;Ljava/lang/String;)V", "missingField", "(Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;)V", "getMissingFields", "()Ljava/util/List;", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
@ExperimentalSerializationApi
/* loaded from: classes10.dex */
public final class MissingFieldException extends SerializationException {

    @NotNull
    private final List<String> missingFields;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MissingFieldException(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r5, @org.jetbrains.annotations.NotNull java.lang.String r6) {
        /*
            r4 = this;
            r5.getClass()
            r6.getClass()
            int r0 = r5.size()
            r1 = 1
            if (r0 != r1) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Field '"
            r0.<init>(r1)
            r1 = 0
            java.lang.Object r1 = r5.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "' is required for type with serial name '"
            java.lang.String r3 = "', but it was missing"
            java.lang.String r6 = androidx.collection.DoubleList$$ExternalSyntheticOutline0.m(r0, r1, r2, r6, r3)
            goto L3f
        L24:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Fields "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r1 = " are required for type with serial name '"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = "', but they were missing"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
        L3f:
            r0 = 0
            r4.<init>(r5, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.MissingFieldException.<init>(java.util.List, java.lang.String):void");
    }

    @NotNull
    public final List<String> getMissingFields() {
        return this.missingFields;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(@NotNull List<String> list, @Nullable String str, @Nullable Throwable th) {
        super(str, th);
        list.getClass();
        this.missingFields = list;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(@NotNull String str, @NotNull String str2) {
        this(CollectionsKt.listOf(str), a$$ExternalSyntheticOutline0.m("Field '", str, "' is required for type with serial name '", str2, "', but it was missing"), null);
        str.getClass();
        str2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @PublishedApi
    public MissingFieldException(@NotNull String str) {
        this(CollectionsKt.listOf(str), a$$ExternalSyntheticOutline0.m("Field '", str, "' is required, but it was missing"), null);
        str.getClass();
    }
}
