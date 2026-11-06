package org.apache.commons.text.lookup;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
abstract class AbstractPathFencedLookup extends AbstractStringLookup {
    protected final List<Path> fences;

    public AbstractPathFencedLookup(Path... pathArr) {
        this.fences = pathArr != null ? (List) Arrays.stream(pathArr).map(new StringLookupFactory$$ExternalSyntheticLambda0(2)).collect(Collectors.toList()) : Collections.EMPTY_LIST;
    }

    public Path getPath(String str) {
        Path path = Paths.get(str, new String[0]);
        if (this.fences.isEmpty()) {
            return path;
        }
        final Path absolutePath = path.normalize().toAbsolutePath();
        Stream<Path> stream = this.fences.stream();
        Objects.requireNonNull(absolutePath);
        if (stream.filter(new Predicate() { // from class: org.apache.commons.text.lookup.AbstractPathFencedLookup$$ExternalSyntheticLambda1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return absolutePath.startsWith((Path) obj);
            }
        }).findFirst().isPresent()) {
            return path;
        }
        throw IllegalArgumentExceptions.format("[%s] -> [%s] not in %s", str, absolutePath, this.fences);
    }
}
