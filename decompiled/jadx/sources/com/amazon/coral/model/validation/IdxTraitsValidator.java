package com.amazon.coral.model.validation;

import com.amazon.coral.model.AbstractModelVisitor;
import com.amazon.coral.model.BlobModel;
import com.amazon.coral.model.EventHeaderTraits;
import com.amazon.coral.model.EventPayloadTraits;
import com.amazon.coral.model.EventStreamTraits;
import com.amazon.coral.model.IdxTraits;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.ModelIndex;
import com.amazon.coral.model.ReferenceModel;
import com.amazon.coral.model.StreamTraits;
import com.amazon.coral.model.StructureModel;
import com.amazon.coral.model.TraitConstructor$$ExternalSyntheticBUOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
final class IdxTraitsValidator extends AbstractModelVisitor {
    private final ModelIndex modelIndex;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Member {
        final StructureModel container;
        final CharSequence memberName;
        final ReferenceModel model;

        private Member(ReferenceModel referenceModel, CharSequence charSequence, StructureModel structureModel) {
            this.model = referenceModel;
            this.memberName = charSequence;
            this.container = structureModel;
        }
    }

    public IdxTraitsValidator(ModelIndex modelIndex) {
        this.modelIndex = modelIndex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$onStructureModel$0(Member member) {
        IdxTraits idxTraits = (IdxTraits) member.model.getTraits(IdxTraits.class);
        if (idxTraits == null) {
            return -1;
        }
        return idxTraits.getValue();
    }

    @Override // com.amazon.coral.model.AbstractModelVisitor, com.amazon.coral.model.ModelVisitor
    public void onStructureModel(StructureModel structureModel) {
        ArrayList arrayList = new ArrayList();
        for (CharSequence charSequence : structureModel.getMemberNames()) {
            arrayList.add(new Member(structureModel.getMemberModel(charSequence), charSequence, structureModel));
        }
        arrayList.sort(Comparator.comparingInt(new IdxTraitsValidator$$ExternalSyntheticLambda1()));
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (it2.hasNext()) {
            Member member = (Member) it2.next();
            IdxTraits idxTraits = (IdxTraits) member.model.getTraits(IdxTraits.class);
            if (idxTraits != null) {
                if (idxTraits.getValue() <= 0) {
                    throw new ModelValidationException("idx must be greater than or equal to 1, was " + idxTraits.getValue());
                }
                if (idxTraits.getValue() == i) {
                    TraitConstructor$$ExternalSyntheticBUOutline0.m("Duplicate idx value %d for member \"%s\" of structure \"%s\"", new Object[]{Integer.valueOf(idxTraits.getValue()), member.memberName, member.container.getId()});
                    return;
                }
                i++;
                if (idxTraits.getValue() != i) {
                    if (idxTraits.getValue() - 1 == i) {
                        IdxTraitsValidator$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m(i, "idx must increase monotonically starting at 1 no members found for idx "));
                        return;
                    } else {
                        TraitConstructor$$ExternalSyntheticBUOutline0.m("idx must increase monotonically starting at 1, no members found for idxs between %d and %d, inclusive", new Object[]{Integer.valueOf(i), Integer.valueOf(idxTraits.getValue() - 1)});
                        return;
                    }
                }
            } else if (member.model.getTraits(EventHeaderTraits.class) == null && member.model.getTraits(EventPayloadTraits.class) == null) {
                Model model = this.modelIndex.getModel(member.model.getTarget());
                if (!(model instanceof BlobModel) || model.getTraits(StreamTraits.class) == null) {
                    if (model.getTraits(EventStreamTraits.class) == null) {
                        TraitConstructor$$ExternalSyntheticBUOutline0.m("Structure \"%s\" is in the closure of an indexed service, but its member \"%s\" is missing an idx trait", new Object[]{member.container.getId(), member.memberName});
                        return;
                    }
                }
            }
        }
    }
}
