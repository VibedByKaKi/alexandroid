package org.apache.commons.text.translate;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
import org.apache.commons.lang3.ClassUtils$$ExternalSyntheticLambda2;
import org.openjdk.tools.sjavac.Main$$ExternalSyntheticLambda0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class AggregateTranslator extends CharSequenceTranslator {
    private final List<CharSequenceTranslator> translators;

    public AggregateTranslator(CharSequenceTranslator... charSequenceTranslatorArr) {
        ArrayList arrayList = new ArrayList();
        this.translators = arrayList;
        if (charSequenceTranslatorArr != null) {
            Stream.of((Object[]) charSequenceTranslatorArr).filter(new Main$$ExternalSyntheticLambda0(8)).forEach(new ClassUtils$$ExternalSyntheticLambda2(arrayList, 3));
        }
    }

    @Override // org.apache.commons.text.translate.CharSequenceTranslator
    public int translate(CharSequence charSequence, int i, Writer writer) throws IOException {
        Iterator<CharSequenceTranslator> it2 = this.translators.iterator();
        while (it2.hasNext()) {
            int translate = it2.next().translate(charSequence, i, writer);
            if (translate != 0) {
                return translate;
            }
        }
        return 0;
    }
}
