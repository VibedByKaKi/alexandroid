package com.google.common.escape;

import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.mp4.Track;
import com.google.common.base.Function;
import com.google.googlejavaformat.java.JavaInputAstVisitor;
import org.openjdk.source.tree.DirectiveTree;
import org.openjdk.source.tree.Tree;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class Escaper$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Escaper$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        Boolean lambda$visitModule$3;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                return ((Escaper) obj2).escape((String) obj);
            case 1:
                return ((FragmentedMp4Extractor) obj2).modifyTrack((Track) obj);
            case 2:
                return ((com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor) obj2).modifyTrack((com.google.android.exoplayer2.extractor.mp4.Track) obj);
            default:
                lambda$visitModule$3 = JavaInputAstVisitor.lambda$visitModule$3((DirectiveTree) obj2, (Tree.Kind) obj);
                return lambda$visitModule$3;
        }
    }
}
