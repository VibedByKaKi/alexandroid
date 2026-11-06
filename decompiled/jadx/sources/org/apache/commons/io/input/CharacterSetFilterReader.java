package org.apache.commons.io.input;

import java.io.Reader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.IntPredicate;
import org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda11;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class CharacterSetFilterReader extends AbstractCharacterFilterReader {
    public CharacterSetFilterReader(Reader reader, Integer... numArr) {
        this(reader, new HashSet(Arrays.asList(numArr)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$toIntPredicate$0(Set set, int i) {
        return set.contains(Integer.valueOf(i));
    }

    private static IntPredicate toIntPredicate(Set<Integer> set) {
        return set == null ? AbstractCharacterFilterReader.SKIP_NONE : new ArrayUtils$$ExternalSyntheticLambda11(Collections.unmodifiableSet(set), 1);
    }

    public CharacterSetFilterReader(Reader reader, Set<Integer> set) {
        super(reader, toIntPredicate(set));
    }
}
