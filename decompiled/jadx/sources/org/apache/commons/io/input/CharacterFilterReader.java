package org.apache.commons.io.input;

import java.io.Reader;
import java.util.function.IntPredicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class CharacterFilterReader extends AbstractCharacterFilterReader {
    public CharacterFilterReader(Reader reader, final int i) {
        super(reader, new IntPredicate() { // from class: org.apache.commons.io.input.CharacterFilterReader$$ExternalSyntheticLambda0
            @Override // java.util.function.IntPredicate
            public final boolean test(int i2) {
                boolean lambda$new$0;
                lambda$new$0 = CharacterFilterReader.lambda$new$0(i, i2);
                return lambda$new$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$new$0(int i, int i2) {
        return i2 == i;
    }

    public CharacterFilterReader(Reader reader, IntPredicate intPredicate) {
        super(reader, intPredicate);
    }
}
