package com.amazon.alexa.assistant.foundation.model;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/WakeWordComparator;", "Ljava/util/Comparator;", "Lcom/amazon/alexa/assistant/foundation/model/WakeWord;", "Lkotlin/Comparator;", "systemWakeWords", "", "userWakeWords", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "priorityMap", "", "", "compare", "left", "right", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWakeWordComparator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WakeWordComparator.kt\ncom/amazon/alexa/assistant/foundation/model/WakeWordComparator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n1869#2,2:44\n1869#2,2:46\n*S KotlinDebug\n*F\n+ 1 WakeWordComparator.kt\ncom/amazon/alexa/assistant/foundation/model/WakeWordComparator\n*L\n18#1:44,2\n23#1:46,2\n*E\n"})
/* loaded from: classes15.dex */
public final class WakeWordComparator implements Comparator<WakeWord> {

    @NotNull
    private final Map<WakeWord, Integer> priorityMap;

    public WakeWordComparator(@NotNull List<WakeWord> list, @NotNull List<WakeWord> list2) {
        list.getClass();
        list2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it2 = list2.iterator();
        int i = 0;
        while (it2.hasNext()) {
            linkedHashMap.put((WakeWord) it2.next(), Integer.valueOf(i));
            i++;
        }
        Iterator<T> it3 = list.iterator();
        while (it3.hasNext()) {
            linkedHashMap.put((WakeWord) it3.next(), Integer.valueOf(i));
            i++;
        }
        this.priorityMap = linkedHashMap;
    }

    @Override // java.util.Comparator
    public int compare(@NotNull WakeWord left, @NotNull WakeWord right) {
        left.getClass();
        right.getClass();
        Integer num = this.priorityMap.get(left);
        int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        Integer num2 = this.priorityMap.get(right);
        return Intrinsics.compare(intValue, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
    }
}
