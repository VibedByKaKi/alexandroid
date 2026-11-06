package com.amazon.alexa.ra.features.fragments;

import com.amazon.alexa.api.compat.model.AlexaFragmentsPaginationContext;
import com.amazon.alexa.ra.core.features.fragments.PaginationContextData;
import com.amazon.alexa.ra.core.ui.enums.PaginationRetrievalMode;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"toSdkPaginationContext", "Lcom/amazon/alexa/api/compat/model/AlexaFragmentsPaginationContext;", "Lcom/amazon/alexa/ra/core/features/fragments/PaginationContextData;", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFragmentsSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentsSource.kt\ncom/amazon/alexa/ra/features/fragments/FragmentsSourceKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,347:1\n1#2:348\n*E\n"})
/* loaded from: classes18.dex */
public final class FragmentsSourceKt {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaginationRetrievalMode.values().length];
            try {
                iArr[PaginationRetrievalMode.ANCHORED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaginationRetrievalMode.SURROUNDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Failed to check method usage
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1714)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
    	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
    	at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:682)
    	at jadx.core.codegen.ClassGen.skipMethod(ClassGen.java:361)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:327)
    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
     */
    public static final /* synthetic */ AlexaFragmentsPaginationContext access$toSdkPaginationContext(PaginationContextData paginationContextData) {
        return toSdkPaginationContext(paginationContextData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlexaFragmentsPaginationContext toSdkPaginationContext(PaginationContextData paginationContextData) {
        AlexaFragmentsPaginationContext.RetrievalMode retrievalMode;
        AlexaFragmentsPaginationContext.Builder builder = AlexaFragmentsPaginationContext.INSTANCE.builder();
        String before = paginationContextData.getBefore();
        if (before != null) {
            builder.setBefore(before);
        }
        String after = paginationContextData.getAfter();
        if (after != null) {
            builder.setAfter(after);
        }
        int i = WhenMappings.$EnumSwitchMapping$0[paginationContextData.getRetrievalMode().ordinal()];
        if (i == 1) {
            retrievalMode = AlexaFragmentsPaginationContext.RetrievalMode.ANCHORED;
        } else {
            if (i != 2) {
                PathKt$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            retrievalMode = AlexaFragmentsPaginationContext.RetrievalMode.SURROUNDING;
        }
        builder.setRetrievalMode(retrievalMode);
        return builder.build();
    }
}
